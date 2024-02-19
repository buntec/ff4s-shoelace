package ff4s.shoelace

// format: off

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Color pickers allow the user to select a color.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/ColorPicker.scala ColorPicker.scala source code]]
  * 
  * [[https://shoelace.style/components/color-picker Shoelace ColorPicker docs]]
  */
object ColorPicker extends WebComponent {
  override val tagName: String = "sl-color-picker"

  type Ref = ColorPickerComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the color picker loses focus. */
  lazy val onBlur: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-blur")

  /** Emitted when the color picker's value changes. */
  lazy val onChange: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-change")

  /** Emitted when the color picker receives focus. */
  lazy val onFocus: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-focus")

  /** Emitted when the color picker receives input. */
  lazy val onInput: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-input")

  /** Emitted when the form control has been checked for validity and its constraints aren't satisfied. */
  lazy val onInvalid: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-invalid")


  // -- Attributes --

  /**
    * The current value of the color picker. The value's format will vary based the `format` attribute. To get the value
    * in a specific format, use the `getFormattedValue()` method. The value is submitted as a name/value pair with form
    * data.
    */
  lazy val defaultValue: HtmlAttr[String] = stringAttr("value")

  /**
    * The color picker's label. This will not be displayed, but it will be announced by assistive devices. If you need to
    * display HTML, you can use the `label` slot` instead.
    */
  lazy val label: HtmlAttr[String] = stringAttr("label")

  /**
    * The format to use. If opacity is enabled, these will translate to HEXA, RGBA, HSLA, and HSVA respectively. The color
    * picker will accept user input in any format (including CSS color names) and convert it to the desired format.
    */
  lazy val format: HtmlAttr[String] = stringAttr("format")

  /** Renders the color picker inline rather than in a dropdown. */
  lazy val inline: HtmlAttr[Boolean] = boolAttr("inline")

  /** Determines the size of the color picker's trigger. This has no effect on inline color pickers. */
  lazy val size: HtmlAttr[String] = stringAttr("size")

  /** Removes the button that lets users toggle between format. */
  lazy val noFormatToggle: HtmlAttr[Boolean] = boolAttr("no-format-toggle")

  /** The name of the form control, submitted as a name/value pair with form data. */
  lazy val name: HtmlAttr[String] = stringAttr("name")

  /** Disables the color picker. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")

  /**
    * Enable this option to prevent the panel from being clipped when the component is placed inside a container with
    * `overflow: auto|scroll`. Hoisting uses a fixed positioning strategy that works in many, but not all, scenarios.
    */
  lazy val hoist: HtmlAttr[Boolean] = boolAttr("hoist")

  /** Shows the opacity slider. Enabling this will cause the formatted value to be HEXA, RGBA, or HSLA. */
  lazy val opacity: HtmlAttr[Boolean] = boolAttr("opacity")

  /** By default, values are lowercase. With this attribute, values will be uppercase instead. */
  lazy val uppercase: HtmlAttr[Boolean] = boolAttr("uppercase")

  /**
    * By default, form controls are associated with the nearest containing `<form>` element. This attribute allows you
    * to place the form control outside of a form and associate it with the form that has this `id`. The form must be in
    * the same document or shadow root for this to work.
    */
  lazy val formId: HtmlAttr[String] = stringAttr("form")

  /** Makes the color picker a required field. */
  lazy val required: HtmlAttr[Boolean] = boolAttr("required")


  // -- Props --

  /**
    * The current value of the color picker. The value's format will vary based the `format` attribute. To get the value
    * in a specific format, use the `getFormattedValue()` method. The value is submitted as a name/value pair with form
    * data.
    */
  lazy val value: HtmlProp[String, _] = stringProp("value")


  // -- Slots --

  object slots {

    /** The color picker's form label. Alternatively, you can use the `label` attribute. */
    lazy val label: Slot = Slot("label")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The color picker's dropdown trigger. */
    lazy val trigger: String = "trigger"

    /** The container that holds the swatches. */
    lazy val swatches: String = "swatches"

    /** Each individual swatch. */
    lazy val swatch: String = "swatch"

    /** The color grid. */
    lazy val grid: String = "grid"

    /** The color grid's handle. */
    lazy val gridHandle: String = "grid-handle"

    /** Hue and opacity sliders. */
    lazy val slider: String = "slider"

    /** Hue and opacity slider handles. */
    lazy val sliderHandle: String = "slider-handle"

    /** The hue slider. */
    lazy val hueSlider: String = "hue-slider"

    /** The hue slider's handle. */
    lazy val hueSliderHandle: String = "hue-slider-handle"

    /** The opacity slider. */
    lazy val opacitySlider: String = "opacity-slider"

    /** The opacity slider's handle. */
    lazy val opacitySliderHandle: String = "opacity-slider-handle"

    /** The preview color. */
    lazy val preview: String = "preview"

    /** The text input. */
    lazy val input: String = "input"

    /** The eye dropper button. */
    lazy val eyeDropperButton: String = "eye-dropper-button"

    /** The eye dropper button's exported `button` part. */
    lazy val eyeDropperButton__base: String = "eye-dropper-button__base"

    /** The eye dropper button's exported `prefix` part. */
    lazy val eyeDropperButton__prefix: String = "eye-dropper-button__prefix"

    /** The eye dropper button's exported `label` part. */
    lazy val eyeDropperButton__label: String = "eye-dropper-button__label"

    /** The eye dropper button's exported `suffix` part. */
    lazy val eyeDropperButton__suffix: String = "eye-dropper-button__suffix"

    /** The eye dropper button's exported `caret` part. */
    lazy val eyeDropperButton__caret: String = "eye-dropper-button__caret"

    /** The format button. */
    lazy val formatButton: String = "format-button"

    /** The format button's exported `button` part. */
    lazy val formatButton__base: String = "format-button__base"

    /** The format button's exported `prefix` part. */
    lazy val formatButton__prefix: String = "format-button__prefix"

    /** The format button's exported `label` part. */
    lazy val formatButton__label: String = "format-button__label"

    /** The format button's exported `suffix` part. */
    lazy val formatButton__suffix: String = "format-button__suffix"

    /** The format button's exported `caret` part. */
    lazy val formatButton__caret: String = "format-button__caret"
  }


  // -- Element type -- 

  @js.native trait ColorPickerComponent extends js.Object { this: dom.HTMLElement => 

    /**
      * The current value of the color picker. The value's format will vary based the `format` attribute. To get the value
      * in a specific format, use the `getFormattedValue()` method. The value is submitted as a name/value pair with form
      * data.
      */
    var value: String

    /**
      * The color picker's label. This will not be displayed, but it will be announced by assistive devices. If you need to
      * display HTML, you can use the `label` slot` instead.
      */
    var label: String

    /**
      * The format to use. If opacity is enabled, these will translate to HEXA, RGBA, HSLA, and HSVA respectively. The color
      * picker will accept user input in any format (including CSS color names) and convert it to the desired format.
      */
    var format: String

    /** Renders the color picker inline rather than in a dropdown. */
    var inline: Boolean

    /** Determines the size of the color picker's trigger. This has no effect on inline color pickers. */
    var size: String

    /** Removes the button that lets users toggle between format. */
    var noFormatToggle: Boolean

    /** The name of the form control, submitted as a name/value pair with form data. */
    var name: String

    /** Disables the color picker. */
    var disabled: Boolean

    /**
      * Enable this option to prevent the panel from being clipped when the component is placed inside a container with
      * `overflow: auto|scroll`. Hoisting uses a fixed positioning strategy that works in many, but not all, scenarios.
      */
    var hoist: Boolean

    /** Shows the opacity slider. Enabling this will cause the formatted value to be HEXA, RGBA, or HSLA. */
    var opacity: Boolean

    /** By default, values are lowercase. With this attribute, values will be uppercase instead. */
    var uppercase: Boolean

    /**
      * By default, form controls are associated with the nearest containing `<form>` element. This attribute allows you
      * to place the form control outside of a form and associate it with the form that has this `id`. The form must be in
      * the same document or shadow root for this to work.
      */
    var form: String

    /** Makes the color picker a required field. */
    var required: Boolean
  }
}
