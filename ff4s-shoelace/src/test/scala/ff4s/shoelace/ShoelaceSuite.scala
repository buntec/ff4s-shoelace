package ff4s.shoelace

import cats.effect.IO
import cats.effect.Resource
import cats.effect.kernel.Outcome
import cats.syntax.all.*
import ff4s.shoelace as sl
import munit.CatsEffectSuite
import org.scalajs.dom

import scala.concurrent.duration.*
import scala.scalajs.js

/** Tests the generated ff4s bindings, i.e., what ends up in the DOM.
  *
  * Shoelace's JavaScript is not loaded, so the custom elements are never
  * upgraded: attributes and properties stay exactly as ff4s set them, and
  * events are dispatched by hand.
  */
class ShoelaceSuite extends CatsEffectSuite {

  // jsdom only provides requestAnimationFrame in "visual" mode, which the
  // Scala.js jsdom env doesn't enable, so run frames on the next tick.
  private val window = js.Dynamic.global.window
  private val frameApi = List("requestAnimationFrame", "cancelAnimationFrame")
  private var savedFrameApi = Map.empty[String, js.Any]

  override def beforeAll(): Unit = {
    savedFrameApi = frameApi.collect {
      case name if window.hasOwnProperty(name).asInstanceOf[Boolean] =>
        name -> window.selectDynamic(name).asInstanceOf[js.Any]
    }.toMap
    window.requestAnimationFrame = { (cb: js.Function1[Double, Unit]) =>
      js.timers.setTimeout(0)(cb(0.0)).asInstanceOf[js.Any]
    }: js.Function1[js.Function1[Double, Unit], js.Any]
    window.cancelAnimationFrame = { (handle: js.Any) =>
      js.timers.clearTimeout(handle.asInstanceOf[js.timers.SetTimeoutHandle])
    }: js.Function1[js.Any, Unit]
  }

  override def afterAll(): Unit =
    frameApi.foreach { name =>
      savedFrameApi.get(name) match {
        case Some(original) => window.updateDynamic(name)(original)
        case None           => js.special.delete(window, name)
      }
    }

  case class State(on: Boolean = false, log: Vector[String] = Vector.empty)

  sealed trait Action
  case object TurnOn extends Action
  case class Log(msg: String) extends Action

  private val dsl = ff4s.Dsl[State, Action]
  import dsl.*
  import dsl.html.*

  private val mkStore = ff4s.Store.pure[IO, State, Action](State()) {
    case (TurnOn, s)   => s.copy(on = true)
    case (Log(msg), s) => s.copy(log = s.log :+ msg)
  }

  private var counter = 0

  /** Renders `view` into a fresh container and runs `body` on it, failing at
    * once if rendering stops.
    */
  private def withRender[A](view: V)(body: dom.Element => IO[A]): IO[A] =
    Resource
      .make(IO {
        counter += 1
        val container = dom.document.createElement("div")
        val root = dom.document.createElement("div")
        root.id = s"ff4s-shoelace-root-$counter"
        container.appendChild(root)
        dom.document.body.appendChild(container)
        container
      })(c => IO(c.remove()))
      .flatMap { container =>
        implicit val store: Resource[IO, ff4s.Store[IO, State, Action]] =
          mkStore
        view
          .renderReplace[IO](container.firstElementChild.id)
          .background
          .tupleLeft(container)
      }
      .use { case (container, outcome) =>
        val renderStopped = outcome.flatMap[A] {
          case Outcome.Errored(e) => IO.raiseError(e)
          case other              =>
            IO.raiseError(new AssertionError(s"rendering stopped: $other"))
        }
        IO.race(renderStopped, body(container)).map(_.merge)
      }

  /** Re-evaluates `check` until it yields `true`, failing after a timeout. */
  private def waitUntil(check: IO[Boolean]): IO[Unit] = {
    def loop: IO[Unit] = check.ifM(IO.unit, IO.sleep(5.millis) *> loop)
    loop.timeoutTo(
      5.seconds,
      IO.raiseError(new AssertionError("condition not met within 5 seconds"))
    )
  }

  /** Waits for the element matching `selector` to be rendered. */
  private def find(c: dom.Element, selector: String): IO[dom.Element] =
    waitUntil(IO(c.querySelector(selector) != null)) *>
      IO(c.querySelector(selector))

  private def renders(c: dom.Element, html: String): IO[Unit] =
    waitUntil(IO(c.innerHTML == html)).handleErrorWith(_ =>
      IO(assertEquals(c.innerHTML, html))
    )

  private def dispatch(el: dom.Element, ev: dom.Event): IO[Unit] =
    IO(el.dispatchEvent(ev)).void

  /** Waits for the view's `span` to show exactly the `expected` log. */
  private def logged(c: dom.Element, expected: String*): IO[Unit] = {
    val log = find(c, "span").map(_.textContent)
    val want = expected.mkString(",")
    waitUntil(log.map(_ == want)).handleErrorWith(_ =>
      log.flatMap(actual => IO(assertEquals(actual, want)))
    )
  }

  test("components render their custom element and children") {
    withRender(div(sl.Button("Go"), sl.Badge(sl.Badge.pill := true, "3")))(
      renders(
        _,
        """<div><sl-button>Go</sl-button><sl-badge pill="">3</sl-badge></div>"""
      )
    )
  }

  test("string and int attributes are encoded as strings") {
    val view = div(
      sl.Button(sl.Button.variant := "primary", sl.Button.size := "small"),
      sl.Animation(sl.Animation.duration := 2000, sl.Animation.name := "flip")
    )
    withRender(view) { c =>
      for {
        button <- find(c, "sl-button")
        animation <- find(c, "sl-animation")
      } yield {
        assertEquals(button.getAttribute("variant"), "primary")
        assertEquals(button.getAttribute("size"), "small")
        assertEquals(animation.getAttribute("duration"), "2000")
        assertEquals(animation.getAttribute("name"), "flip")
      }
    }
  }

  test("attributes are bound under their HTML names") {
    // Scala names that differ from the attribute (reserved words, clashes
    // with ff4s names, or kebab-case attributes)
    val view = div(
      sl.Button(
        sl.Button.tpe := "submit",
        sl.Button.formId := "my-form",
        sl.Button.formNoValidate := true
      ),
      sl.TabGroup(sl.TabGroup.fixedScrollControls := true)
    )
    withRender(view) { c =>
      for {
        button <- find(c, "sl-button")
        tabGroup <- find(c, "sl-tab-group")
      } yield {
        assertEquals(button.getAttribute("type"), "submit")
        assertEquals(button.getAttribute("form"), "my-form")
        assert(button.hasAttribute("formnovalidate"))
        assert(tabGroup.hasAttribute("fixed-scroll-controls"))
      }
    }
  }

  test("boolean attributes are toggled by presence") {
    val view = useState { s =>
      sl.Button(
        sl.Button.disabled := s.on,
        sl.Button.loading := !s.on,
        onClick := (_ => Some(TurnOn))
      )
    }
    withRender(view) { c =>
      for {
        button <- find(c, "sl-button")
        _ <- IO {
          assert(!button.hasAttribute("disabled"))
          assertEquals(button.getAttribute("loading"), "")
        }
        _ <- IO(button.asInstanceOf[dom.HTMLElement].click())
        _ <- waitUntil(IO(button.hasAttribute("disabled")))
      } yield {
        assertEquals(button.getAttribute("disabled"), "")
        assert(!button.hasAttribute("loading"))
      }
    }
  }

  test("properties are set on the element, not as attributes") {
    val view = div(
      sl.Input(sl.Input.value := "hello"),
      sl.Switch(sl.Switch.checked := true),
      sl.Range(sl.Range.value := 42),
      sl.Select(sl.Select.value := js.Array("a", "b"))
    )
    withRender(view) { c =>
      def prop(selector: String, name: String) =
        find(c, selector).map { el =>
          assert(!el.hasAttribute(name), s"$selector has attribute $name")
          el.asInstanceOf[js.Dynamic].selectDynamic(name)
        }
      for {
        input <- prop("sl-input", "value")
        switch <- prop("sl-switch", "checked")
        range <- prop("sl-range", "value")
        select <- prop("sl-select", "value")
      } yield {
        assertEquals(input.asInstanceOf[String], "hello")
        assertEquals(switch.asInstanceOf[Boolean], true)
        assertEquals(range.asInstanceOf[Int], 42)
        assertEquals(
          select.asInstanceOf[js.Array[String]].toList,
          List("a", "b")
        )
      }
    }
  }

  test("slotted children get a slot attribute") {
    val view = sl.Alert(
      sl.Alert.slots.icon := sl.Icon(sl.Icon.name := "info-circle"),
      "message"
    )
    withRender(view)(
      renders(
        _,
        """<sl-alert><sl-icon name="info-circle" slot="icon"></sl-icon>message</sl-alert>"""
      )
    )
  }

  test("event handlers listen to Shoelace's sl-* events") {
    val view = useState { s =>
      div(
        sl.Switch(
          sl.Switch.onChange := (ev =>
            Some(Log(s"checked=${ev.target.checked}"))
          )
        ),
        span(s.log.mkString(","))
      )
    }
    withRender(view) { c =>
      for {
        switch <- find(c, "sl-switch")
        setChecked = (b: Boolean) =>
          IO(switch.asInstanceOf[js.Dynamic].checked = b)
        // the native event must not trigger the handler, so dispatch it
        // first, with a state that would show up in the log
        _ <- setChecked(false) *> dispatch(switch, new dom.Event("change"))
        _ <- setChecked(true) *> dispatch(switch, new dom.Event("sl-change"))
        _ <- logged(c, "checked=true")
      } yield ()
    }
  }

  test("event details are passed to the handler") {
    val view = useState { s =>
      div(
        sl.TabGroup(
          sl.TabGroup.onTabShow := (ev => Some(Log(s"show ${ev.detail.name}"))),
          sl.TabGroup.onTabHide := (ev => Some(Log(s"hide ${ev.detail.name}")))
        ),
        span(s.log.mkString(","))
      )
    }
    def tabEvent(name: String, tab: String) = {
      val init = js.Dynamic.literal(detail = js.Dynamic.literal(name = tab))
      new dom.CustomEvent(name, init.asInstanceOf[dom.CustomEventInit])
    }
    withRender(view) { c =>
      for {
        tabGroup <- find(c, "sl-tab-group")
        _ <- dispatch(tabGroup, tabEvent("sl-tab-hide", "general"))
        _ <- dispatch(tabGroup, tabEvent("sl-tab-show", "advanced"))
        _ <- logged(c, "hide general", "show advanced")
      } yield ()
    }
  }

}
