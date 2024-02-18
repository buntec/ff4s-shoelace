package examples.example1

import cats.effect.Async
import cats.effect.implicits._
import cats.syntax.all._
import fs2.Stream
import scalajs.js

import scala.concurrent.duration._

case class State(
    foo: Int = 17,
    toggle: Boolean = true,
    progress: Double = 25.0
)

sealed trait Action

object Action {

  case class Noop() extends Action
  case class Toggle() extends Action

}

class App[F[_]](implicit val F: Async[F]) extends ff4s.App[F, State, Action] {

  override val store = for {

    store <- ff4s.Store[F, State, Action](State())(_ =>
      _ match {
        case Action.Noop() => (_, none)
        case Action.Toggle() =>
          state => state.copy(toggle = !state.toggle) -> none
      }
    )

  } yield store

  import dsl._
  import dsl.html._

  import ff4s.shoelace.{components => sl}

  val heading = h1(cls := "m-4 text-4xl", "Shoelace examples")

  override val view = useState { state =>
    div(
      cls := "flex flex-col items-center h-screen",
      heading,
      "Range",
      sl.range(
        // sl.range.label := "progress",
        sl.range.slots.label := span("blah"),
        sl.range.min := 0.0,
        sl.range.max := 100.0,
        sl.range.value := state.progress,
        sl.range.onChange := { ev =>
          println(
            s"change: ${ev.target}"
          );
          None
        },
        sl.range.onInput := { ev =>
          println(
            s"input: ${ev.detail} ${js.JSON.stringify(ev.detail.asInstanceOf[js.Any])}"
          );
          None
        }
      )
    )

  }

}
