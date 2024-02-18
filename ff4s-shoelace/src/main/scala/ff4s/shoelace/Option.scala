package ff4s.shoelace

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Options define the selectable items within various form controls such as [select](/components/select).
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/Option.scala Option.scala source code]]
  * 
  * [[https://shoelace.style/components/option Shoelace Option docs]]
  */
object Option extends WebComponent {
  override val tagName: String = "sl-option"

  type Ref = OptionComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /**
    * The option's value. When selected, the containing form control will receive this value. The value must be unique
    * from other options in the same group. Values may not contain spaces, as spaces are used as delimiters when listing
    * multiple values.
    */
  lazy val defaultValue: HtmlAttr[String] = stringAttr("value")

  /** Draws the option in a disabled state, preventing selection. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")


  // -- Props --

  /**
    * The option's value. When selected, the containing form control will receive this value. The value must be unique
    * from other options in the same group. Values may not contain spaces, as spaces are used as delimiters when listing
    * multiple values.
    */
  lazy val value: HtmlProp[String, _] = stringProp("value")


  // -- Slots --

  object slots {

    /** The option's label. Note: You can pass this element like a regular child instead of `default := element` */
    lazy val default: Slot = Slot("")

    /** Used to prepend an icon or similar element to the menu item. */
    lazy val prefix: Slot = Slot("prefix")

    /** Used to append an icon or similar element to the menu item. */
    lazy val suffix: Slot = Slot("suffix")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The checked icon, an `<sl-icon>` element. */
    lazy val checkedIcon: String = "checked-icon"

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The option's label. */
    lazy val label: String = "label"

    /** The container that wraps the prefix. */
    lazy val prefix: String = "prefix"

    /** The container that wraps the suffix. */
    lazy val suffix: String = "suffix"
  }


  // -- Element type -- 

  @js.native trait OptionComponent extends js.Object { this: dom.HTMLElement => 

    val current: Boolean

    val selected: Boolean

    val hasHover: Boolean

    /**
      * The option's value. When selected, the containing form control will receive this value. The value must be unique
      * from other options in the same group. Values may not contain spaces, as spaces are used as delimiters when listing
      * multiple values.
      */
    var value: String

    /** Draws the option in a disabled state, preventing selection. */
    var disabled: Boolean
  }
}
