package examples.example1

import cats.effect.Async
import cats.syntax.all._

import scalajs.js

case class State(
    rangeValue: Int = 25,
    checkboxChecked: Boolean = false,
    dropdownChecked: Boolean = false,
    selectValue: Option[String] = None,
    multiSelectValue: List[String] = Nil
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

  } yield store

  import dsl._
  import dsl.html._

  import ff4s.{shoelace => sl}

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

  override val view =
    div(
      idAttr := "page",
      span(cls := "heading", "Shoelace components"),
      span(cls := "component-heading", "Alert"),
      alert,
      span(cls := "component-heading", "Animation"),
      animation,
      span(cls := "component-heading", "Avatar"),
      avatar,
      span(cls := "component-heading", "Badge"),
      badge,
      span(cls := "component-heading", "Checkbox"),
      checkbox,
      span(cls := "component-heading", "Copy Button"),
      copyButton,
      span(cls := "component-heading", "Dropdown"),
      dropDown,
      span(cls := "component-heading", "Range"),
      range,
      span(cls := "component-heading", "Select"),
      select
    )

}
