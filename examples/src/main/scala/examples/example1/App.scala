package examples.example1

import cats.effect.Async
import cats.effect.implicits._
import cats.syntax.all._
import fs2.Stream
import org.scalajs.dom

import scala.concurrent.duration.*

import scalajs.js

case class State(
    darkMode: Boolean = false,
    rangeValue: Int = 25,
    checkboxChecked: Boolean = false,
    dropdownChecked: Boolean = false,
    selectValue: Option[String] = None,
    multiSelectValue: List[String] = Nil,
    switchChecked: Boolean = false,
    inputValue: Option[String] = None,
    progress: Int = 0
)

sealed trait Action

object Action {

  case class ModifyState(f: State => State) extends Action

}

class App[F[_]](implicit val F: Async[F]) extends ff4s.App[F, State, Action] {

  override val store = for {

    store <- ff4s.Store[F, State, Action](State())(_ =>
      _ match {
        case Action.ModifyState(f) => state => f(state) -> none
      }
    )

    _ <- Stream
      .fixedDelay(100.millis)
      .zipWithIndex
      .map(_._2)
      .evalMap(i =>
        store.dispatch(Action.ModifyState(_.copy(progress = i.toInt % 100)))
      )
      .compile
      .drain
      .background

    _ <- store.state
      .map(_.darkMode)
      .discrete
      .changes
      .evalMap(darkMode =>
        if (darkMode) {
          F.delay(dom.document.body.className = "dark sl-theme-dark")
        } else {
          F.delay(dom.document.body.className = "")
        }
      )
      .compile
      .drain
      .background

  } yield store

  import dsl._
  import dsl.html._

  import ff4s.{shoelace => sl}

  val darkMode = useState(state =>
    div(
      cls := "absolute top-0 right-0 py-2 px-4",
      sl.Switch(
        sl.Switch.checked := state.darkMode,
        sl.Switch.onChange := (ev =>
          Action.ModifyState(_.copy(darkMode = ev.target.checked)).some
        ),
        "Dark mode"
      )
    )
  )

  val alert = sl.Alert(
    sl.Alert.open := true,
    sl.Alert.slots.icon := sl.Icon(sl.Icon.name := "info-circle"),
    "This is a standard alert. You can customize its content and even the icon."
  )

  val animation = div(
    cls := "animation-overview",
    sl.Animation(
      sl.Animation.name := "bounce",
      sl.Animation.duration := 2000,
      sl.Animation.play := true,
      div(cls := "box")
    ),
    sl.Animation(
      sl.Animation.name := "jello",
      sl.Animation.duration := 2000,
      sl.Animation.play := true,
      div(cls := "box")
    ),
    sl.Animation(
      sl.Animation.name := "heartBeat",
      sl.Animation.duration := 2000,
      sl.Animation.play := true,
      div(cls := "box")
    ),
    sl.Animation(
      sl.Animation.name := "flip",
      sl.Animation.duration := 2000,
      sl.Animation.play := true,
      div(cls := "box")
    )
  )

  val avatar = sl.Avatar(
    sl.Avatar.label := "User avatar"
  )

  val badge = div(
    cls := "flex flex-row items-center gap-2",
    sl.Badge(sl.Badge.variant := "primary", "Primary"),
    sl.Badge(sl.Badge.variant := "success", "Success"),
    sl.Badge(sl.Badge.variant := "neutral", "Neutral"),
    sl.Badge(sl.Badge.variant := "warning", "Warning"),
    sl.Badge(sl.Badge.variant := "danger", "Danger")
  )

  val button = div(
    cls := "flex flex-row items-center gap-2",
    sl.Button(sl.Button.variant := "default", "Default"),
    sl.Button(sl.Button.variant := "primary", "Primary"),
    sl.Button(sl.Button.variant := "success", "Success"),
    sl.Button(sl.Button.variant := "neutral", "Neutral"),
    sl.Button(sl.Button.variant := "warning", "Warning"),
    sl.Button(sl.Button.variant := "danger", "Danger")
  )

  val buttonGroup = div(
    sl.ButtonGroup(
      sl.ButtonGroup.label := "Alignment",
      sl.Button("Left"),
      sl.Button("Center"),
      sl.Button("Right")
    )
  )

  val checkbox = useState(state =>
    sl.Checkbox(
      sl.Checkbox.checked := state.checkboxChecked,
      sl.Checkbox.onChange := (ev =>
        Action.ModifyState(_.copy(checkboxChecked = ev.target.checked)).some
      ),
      "Checkbox"
    )
  )

  val copyButton = sl.CopyButton(sl.CopyButton.value := "Shoelace rocks!")

  val dropDown = useState(state =>
    sl.Dropdown(
      sl.Dropdown.slots.trigger := sl
        .Button(sl.Button.caret := true, "Dropdown"),
      sl.Menu(
        sl.MenuItem("Dropdown Item 1"),
        sl.MenuItem("Dropdown Item 2"),
        sl.MenuItem("Dropdown Item 2"),
        sl.Divider(),
        sl.MenuItem(
          sl.MenuItem.`type` := "checkbox",
          sl.MenuItem.value := "checkbox-item",
          sl.MenuItem.checked := state.dropdownChecked,
          "Checkbox"
        ),
        sl.MenuItem(sl.MenuItem.disabled := true, "Disabled"),
        sl.Divider(),
        sl.MenuItem(
          "Prefix",
          sl.MenuItem.slots.prefix := sl.Icon(sl.Icon.name := "gift")
        ),
        sl.MenuItem(
          "Suffix Icon",
          sl.MenuItem.slots.suffix := sl.Icon(sl.Icon.name := "heart")
        ),
        sl.Menu.onSelect := { ev =>
          val item = ev.detail.item
          if (item.value == "checkbox-item")
            Action.ModifyState(_.copy(dropdownChecked = item.checked)).some
          else
            None
        }
      )
    )
  )

  val input = useState(state =>
    div(
      s"Hello, ${state.inputValue.getOrElse("...")}",
      sl.Input(
        sl.Input.label := "What is your name?",
        sl.Input.clearable := true,
        sl.Input.value := state.inputValue.getOrElse(""),
        sl.Input.onInput := (ev =>
          Action
            .ModifyState(
              _.copy(inputValue = ev.target.value.some.filter(_.nonEmpty))
            )
            .some
        )
      )
    )
  )

  val progressBar = useState(state =>
    div(
      cls := "w-64",
      sl.ProgressBar(
        sl.ProgressBar.value := state.progress
      )
    )
  )

  val progressRing = useState(state =>
    div(
      cls := "flex flex-row items-center justify-center",
      sl.ProgressRing(
        styleAttr := "--size: 32px;",
        sl.ProgressRing.value := state.progress
      )
    )
  )

  val range = useState(state =>
    sl.Range(
      sl.Range.slots.label := span(s"Value: ${state.rangeValue}"),
      sl.Range.min := 0,
      sl.Range.max := 100,
      sl.Range.value := state.rangeValue,
      sl.Range.onChange := (ev =>
        Action.ModifyState(_.copy(rangeValue = ev.target.value)).some
      )
    )
  )

  val select = useState(state =>
    div(
      span(s"Single select: ${state.selectValue.fold("")(identity)}"),
      sl.Select(
        sl.Option(sl.Option.value := "option-1", "Option 1"),
        sl.Option(sl.Option.value := "option-2", "Option 2"),
        sl.Option(sl.Option.value := "option-3", "Option 3"),
        sl.Option(sl.Option.value := "option-4", "Option 4"),
        sl.Option(sl.Option.value := "option-5", "Option 5"),
        sl.Option(sl.Option.value := "option-6", "Option 6"),
        sl.Select.value := (state.selectValue.getOrElse(""): String),
        sl.Select.onChange := (ev =>
          Action
            .ModifyState(
              _.copy(selectValue = ev.target.value.asInstanceOf[String].some)
            )
            .some
        )
      ),
      span(s"Multi select: ${state.multiSelectValue.mkString(", ")}"),
      sl.Select(
        sl.Select.multiple := true,
        sl.Select.clearable := true,
        sl.Option(sl.Option.value := "option-1", "Option 1"),
        sl.Option(sl.Option.value := "option-2", "Option 2"),
        sl.Option(sl.Option.value := "option-3", "Option 3"),
        sl.Option(sl.Option.value := "option-4", "Option 4"),
        sl.Option(sl.Option.value := "option-5", "Option 5"),
        sl.Option(sl.Option.value := "option-6", "Option 6"),
        sl.Select.value := (js.Array(state.multiSelectValue: _*)),
        sl.Select.onChange := (ev =>
          Action
            .ModifyState(
              _.copy(multiSelectValue =
                ev.target.value.asInstanceOf[js.Array[String]].toList
              )
            )
            .some
        )
      )
    )
  )

  val switch = useState(state =>
    div(
      cls := "flex flex-col items-center gap-2",
      s"checked: ${state.switchChecked}",
      sl.Switch(
        sl.Switch.checked := state.switchChecked,
        sl.Switch.onChange := (ev =>
          Action.ModifyState(_.copy(switchChecked = ev.target.checked)).some
        ),
        "Switch"
      )
    )
  )

  val tag = div(
    cls := "flex flex-row items-center gap-2",
    sl.Tag(sl.Tag.variant := "primary", "Primary"),
    sl.Tag(sl.Tag.variant := "success", "Success"),
    sl.Tag(sl.Tag.variant := "neutral", "Neutral"),
    sl.Tag(sl.Tag.variant := "warning", "Warning"),
    sl.Tag(sl.Tag.variant := "danger", "Danger")
  )

  val tooltip = sl.Tooltip(
    sl.Tooltip.content := "This is a tooltip",
    sl.Button("hover me")
  )

  override val view = div(
    idAttr := "page",
    darkMode,
    span(cls := "heading", "Shoelace components"),
    span(cls := "component-heading", "Alert"),
    alert,
    span(cls := "component-heading", "Animation"),
    animation,
    span(cls := "component-heading", "Avatar"),
    avatar,
    span(cls := "component-heading", "Badge"),
    badge,
    span(cls := "component-heading", "Button"),
    button,
    span(cls := "component-heading", "Button Group"),
    buttonGroup,
    span(cls := "component-heading", "Checkbox"),
    checkbox,
    span(cls := "component-heading", "Copy Button"),
    copyButton,
    span(cls := "component-heading", "Dropdown"),
    dropDown,
    span(cls := "component-heading", "Input"),
    input,
    span(cls := "component-heading", "Progress Bar"),
    progressBar,
    span(cls := "component-heading", "Progress Ring"),
    progressRing,
    span(cls := "component-heading", "Range"),
    range,
    span(cls := "component-heading", "Select"),
    select,
    span(cls := "component-heading", "Switch"),
    switch,
    span(cls := "component-heading", "Tag"),
    tag,
    span(cls := "component-heading", "Tooltip"),
    tooltip
  )

}
