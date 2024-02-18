package ff4s.shoelace

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Ranges allow the user to select a single value within a given range using a slider.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/Range.scala Range.scala source code]]
  * 
  * [[https://shoelace.style/components/range Shoelace Range docs]]
  */
object Range extends WebComponent {
  override val tagName: String = "sl-range"

  type Ref = RangeComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the control loses focus. */
  lazy val onBlur: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-blur")

  /** Emitted when an alteration to the control's value is committed by the user. */
  lazy val onChange: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-change")

  /** Emitted when the control gains focus. */
  lazy val onFocus: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-focus")

  /** Emitted when the control receives input. */
  lazy val onInput: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-input")

  /** Emitted when the form control has been checked for validity and its constraints aren't satisfied. */
  lazy val onInvalid: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-invalid")


  // -- Attributes --

  lazy val title: HtmlAttr[String] = stringAttr("title")

  /** The name of the range, submitted as a name/value pair with form data. */
  lazy val name: HtmlAttr[String] = stringAttr("name")

  /** The current value of the range, submitted as a name/value pair with form data. */
  lazy val defaultValue: HtmlAttr[Int] = intAttr("value")

  /** The range's label. If you need to display HTML, use the `label` slot instead. */
  lazy val label: HtmlAttr[String] = stringAttr("label")

  /** The range's help text. If you need to display HTML, use the help-text slot instead. */
  lazy val helpText: HtmlAttr[String] = stringAttr("help-text")

  /** Disables the range. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")

  /** The minimum acceptable value of the range. */
  lazy val min: HtmlAttr[Int] = intAttr("min")

  /** The maximum acceptable value of the range. */
  lazy val max: HtmlAttr[Int] = intAttr("max")

  /** The interval at which the range will increase and decrease. */
  lazy val step: HtmlAttr[Int] = intAttr("step")

  /** The preferred placement of the range's tooltip. */
  lazy val tooltip: HtmlAttr[String] = stringAttr("tooltip")

  /**
    * By default, form controls are associated with the nearest containing `<form>` element. This attribute allows you
    * to place the form control outside of a form and associate it with the form that has this `id`. The form must be in
    * the same document or shadow root for this to work.
    */
  lazy val formId: HtmlAttr[String] = stringAttr("form")


  // -- Props --

  /** The current value of the range, submitted as a name/value pair with form data. */
  lazy val value: HtmlProp[Int, _] = intProp("value")


  // -- Slots --

  object slots {

    /** The range's label. Alternatively, you can use the `label` attribute. */
    lazy val label: Slot = Slot("label")

    /** Text that describes how to use the input. Alternatively, you can use the `help-text` attribute. */
    lazy val helpText: Slot = Slot("help-text")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The form control that wraps the label, input, and help text. */
    lazy val formControl: String = "form-control"

    /** The label's wrapper. */
    lazy val formControlLabel: String = "form-control-label"

    /** The range's wrapper. */
    lazy val formControlInput: String = "form-control-input"

    /** The help text's wrapper. */
    lazy val formControlHelpText: String = "form-control-help-text"

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The internal `<input>` element. */
    lazy val input: String = "input"

    /** The range's tooltip. */
    lazy val tooltip: String = "tooltip"
  }


  // -- Element type -- 

  @js.native trait RangeComponent extends js.Object { this: dom.HTMLElement => 

    var title: String

    /** The name of the range, submitted as a name/value pair with form data. */
    var name: String

    /** The current value of the range, submitted as a name/value pair with form data. */
    var value: Int

    /** The range's label. If you need to display HTML, use the `label` slot instead. */
    var label: String

    /** The range's help text. If you need to display HTML, use the help-text slot instead. */
    var helpText: String

    /** Disables the range. */
    var disabled: Boolean

    /** The minimum acceptable value of the range. */
    var min: Int

    /** The maximum acceptable value of the range. */
    var max: Int

    /** The interval at which the range will increase and decrease. */
    var step: Int

    /** The preferred placement of the range's tooltip. */
    var tooltip: String

    /**
      * By default, form controls are associated with the nearest containing `<form>` element. This attribute allows you
      * to place the form control outside of a form and associate it with the form that has this `id`. The form must be in
      * the same document or shadow root for this to work.
      */
    var form: String
  }
}
