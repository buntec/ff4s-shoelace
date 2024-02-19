package ff4s.shoelace

// format: off

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Menu items provide options for the user to pick from in a menu.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/MenuItem.scala MenuItem.scala source code]]
  * 
  * [[https://shoelace.style/components/menu-item Shoelace MenuItem docs]]
  */
object MenuItem extends WebComponent {
  override val tagName: String = "sl-menu-item"

  type Ref = MenuItemComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /** The type of menu item to render. To use `checked`, this value must be set to `checkbox`. */
  lazy val `type`: HtmlAttr[String] = stringAttr("type")

  lazy val typ: HtmlAttr[String] = `type`

  lazy val tpe: HtmlAttr[String] = `type`

  /** Draws the item in a checked state. */
  lazy val defaultChecked: HtmlAttr[Boolean] = boolAttr("checked")

  /** A unique value to store in the menu item. This can be used as a way to identify menu items when selected. */
  lazy val defaultValue: HtmlAttr[String] = stringAttr("value")

  /** Draws the menu item in a loading state. */
  lazy val loading: HtmlAttr[Boolean] = boolAttr("loading")

  /** Draws the menu item in a disabled state, preventing selection. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")


  // -- Props --

  /** Draws the item in a checked state. */
  lazy val checked: HtmlProp[Boolean, _] = boolProp("checked")

  /** A unique value to store in the menu item. This can be used as a way to identify menu items when selected. */
  lazy val value: HtmlProp[String, _] = stringProp("value")


  // -- Slots --

  object slots {

    /** The menu item's label. Note: You can pass this element like a regular child instead of `default := element` */
    lazy val default: Slot = Slot("")

    /** Used to prepend an icon or similar element to the menu item. */
    lazy val prefix: Slot = Slot("prefix")

    /** Used to append an icon or similar element to the menu item. */
    lazy val suffix: Slot = Slot("suffix")

    /** Used to denote a nested menu. */
    lazy val submenu: Slot = Slot("submenu")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The checked icon, which is only visible when the menu item is checked. */
    lazy val checkedIcon: String = "checked-icon"

    /** The prefix container. */
    lazy val prefix: String = "prefix"

    /** The menu item label. */
    lazy val label: String = "label"

    /** The suffix container. */
    lazy val suffix: String = "suffix"

    /** The spinner that shows when the menu item is in the loading state. */
    lazy val spinner: String = "spinner"

    /** The spinner's base part. */
    lazy val spinner__base: String = "spinner__base"

    /** The submenu icon, visible only when the menu item has a submenu (not yet implemented). */
    lazy val submenuIcon: String = "submenu-icon"
  }


  // -- Element type -- 

  @js.native trait MenuItemComponent extends js.Object { this: dom.HTMLElement => 

    /** The type of menu item to render. To use `checked`, this value must be set to `checkbox`. */
    var `type`: String

    /** Draws the item in a checked state. */
    var checked: Boolean

    /** A unique value to store in the menu item. This can be used as a way to identify menu items when selected. */
    var value: String

    /** Draws the menu item in a loading state. */
    var loading: Boolean

    /** Draws the menu item in a disabled state, preventing selection. */
    var disabled: Boolean
  }
}
