package ff4s.shoelace

// format: off

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Switches allow the user to toggle an option on or off.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/Switch.scala Switch.scala source code]]
  * 
  * [[https://shoelace.style/components/switch Shoelace Switch docs]]
  */
object Switch extends WebComponent {
  override val tagName: String = "sl-switch"

  type Ref = SwitchComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the control loses focus. */
  lazy val onBlur: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-blur")

  /** Emitted when the control's checked state changes. */
  lazy val onChange: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-change")

  /** Emitted when the control receives input. */
  lazy val onInput: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-input")

  /** Emitted when the control gains focus. */
  lazy val onFocus: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-focus")

  /** Emitted when the form control has been checked for validity and its constraints aren't satisfied. */
  lazy val onInvalid: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-invalid")


  // -- Attributes --

  lazy val title: HtmlAttr[String] = stringAttr("title")

  /** The name of the switch, submitted as a name/value pair with form data. */
  lazy val name: HtmlAttr[String] = stringAttr("name")

  /** The current value of the switch, submitted as a name/value pair with form data. */
  lazy val defaultValue: HtmlAttr[String] = stringAttr("value")

  /** The switch's size. */
  lazy val size: HtmlAttr[String] = stringAttr("size")

  /** Disables the switch. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")

  /** Draws the switch in a checked state. */
  lazy val defaultChecked: HtmlAttr[Boolean] = boolAttr("checked")

  /**
    * By default, form controls are associated with the nearest containing `<form>` element. This attribute allows you
    * to place the form control outside of a form and associate it with the form that has this `id`. The form must be in
    * the same document or shadow root for this to work.
    */
  lazy val formId: HtmlAttr[String] = stringAttr("form")

  /** Makes the switch a required field. */
  lazy val required: HtmlAttr[Boolean] = boolAttr("required")

  /** The switch's help text. If you need to display HTML, use the `help-text` slot instead. */
  lazy val helpText: HtmlAttr[String] = stringAttr("help-text")


  // -- Props --

  /** The current value of the switch, submitted as a name/value pair with form data. */
  lazy val value: HtmlProp[String, _] = stringProp("value")

  /** Draws the switch in a checked state. */
  lazy val checked: HtmlProp[Boolean, _] = boolProp("checked")


  // -- Slots --

  object slots {

    /** The switch's label. Note: You can pass this element like a regular child instead of `default := element` */
    lazy val default: Slot = Slot("")

    /** Text that describes how to use the switch. Alternatively, you can use the `help-text` attribute. */
    lazy val helpText: Slot = Slot("help-text")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The control that houses the switch's thumb. */
    lazy val control: String = "control"

    /** The switch's thumb. */
    lazy val thumb: String = "thumb"

    /** The switch's label. */
    lazy val label: String = "label"

    /** The help text's wrapper. */
    lazy val formControlHelpText: String = "form-control-help-text"
  }


  // -- Element type -- 

  @js.native trait SwitchComponent extends js.Object { this: dom.HTMLElement => 

    var title: String

    /** The name of the switch, submitted as a name/value pair with form data. */
    var name: String

    /** The current value of the switch, submitted as a name/value pair with form data. */
    var value: String

    /** The switch's size. */
    var size: String

    /** Disables the switch. */
    var disabled: Boolean

    /** Draws the switch in a checked state. */
    var checked: Boolean

    /**
      * By default, form controls are associated with the nearest containing `<form>` element. This attribute allows you
      * to place the form control outside of a form and associate it with the form that has this `id`. The form must be in
      * the same document or shadow root for this to work.
      */
    var form: String

    /** Makes the switch a required field. */
    var required: Boolean

    /** The switch's help text. If you need to display HTML, use the `help-text` slot instead. */
    var helpText: String
  }
}
