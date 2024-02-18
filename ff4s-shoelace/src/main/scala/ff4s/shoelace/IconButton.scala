package ff4s.shoelace

import ff4s._
import ff4s.codecs._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Icons buttons are simple, icon-only buttons that can be used for actions and in toolbars.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/IconButton.scala IconButton.scala source code]]
  * 
  * [[https://shoelace.style/components/icon-button Shoelace IconButton docs]]
  */
object IconButton extends WebComponent {
  override val tagName: String = "sl-icon-button"

  type Ref = IconButtonComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the icon button loses focus. */
  lazy val onBlur: EventProp[dom.Event] = EventProp[dom.Event]("sl-blur")

  /** Emitted when the icon button gains focus. */
  lazy val onFocus: EventProp[dom.Event] = EventProp[dom.Event]("sl-focus")


  // -- Attributes --

  /** The name of the icon to draw. Available names depend on the icon library being used. */
  lazy val name: HtmlAttr[String] = stringAttr("name")

  /** The name of a registered custom icon library. */
  lazy val library: HtmlAttr[String] = stringAttr("library")

  /**
    * An external URL of an SVG file. Be sure you trust the content you are including, as it will be executed as code and
    * can result in XSS attacks.
    */
  lazy val src: HtmlAttr[String] = stringAttr("src")

  /** When set, the underlying button will be rendered as an `<a>` with this `href` instead of a `<button>`. */
  lazy val href: HtmlAttr[String] = stringAttr("href")

  /** Tells the browser where to open the link. Only used when `href` is set. */
  lazy val target: HtmlAttr[String] = stringAttr("target")

  /** Tells the browser to download the linked file as this filename. Only used when `href` is set. */
  lazy val download: HtmlAttr[String] = stringAttr("download")

  /**
    * A description that gets read by assistive devices. For optimal accessibility, you should always include a label
    * that describes what the icon button does.
    */
  lazy val label: HtmlAttr[String] = stringAttr("label")

  /** Disables the button. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")


  // -- Props --


  // -- Slots --

  /** This component has no slots - don't give it any children. */
  @inline def noSlots: Unit = ()




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"
  }


  // -- Element type -- 

  @js.native trait IconButtonComponent extends js.Object { this: dom.HTMLElement => 

    /** The name of the icon to draw. Available names depend on the icon library being used. */
    var name: String | Unit

    /** The name of a registered custom icon library. */
    var library: String | Unit

    /**
      * An external URL of an SVG file. Be sure you trust the content you are including, as it will be executed as code and
      * can result in XSS attacks.
      */
    var src: String | Unit

    /** When set, the underlying button will be rendered as an `<a>` with this `href` instead of a `<button>`. */
    var href: String | Unit

    /** Tells the browser where to open the link. Only used when `href` is set. */
    var target: String | Unit

    /** Tells the browser to download the linked file as this filename. Only used when `href` is set. */
    var download: String | Unit

    /**
      * A description that gets read by assistive devices. For optimal accessibility, you should always include a label
      * that describes what the icon button does.
      */
    var label: String

    /** Disables the button. */
    var disabled: Boolean
  }
}
