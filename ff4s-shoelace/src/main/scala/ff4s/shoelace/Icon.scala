package ff4s.shoelace

// format: off

import ff4s._
import ff4s.shoelace.EventTypes.*
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Icons are symbols that can be used to represent various options within an application.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/Icon.scala Icon.scala source code]]
  * 
  * [[https://shoelace.style/components/icon Shoelace Icon docs]]
  */
object Icon extends WebComponent {
  override val tagName: String = "sl-icon"

  type Ref = IconComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the icon has loaded. When using `spriteSheet: true` this will not emit. */
  lazy val onLoad: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-load")

  /** Emitted when the icon fails to load due to an error. When using `spriteSheet: true` this will not emit. */
  lazy val onError: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref] with HasDetail[ErrorEvent]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref] with HasDetail[ErrorEvent]]("sl-error")


  // -- Attributes --

  /** The name of the icon to draw. Available names depend on the icon library being used. */
  lazy val name: HtmlAttr[String] = stringAttr("name")

  /**
    * An external URL of an SVG file. Be sure you trust the content you are including, as it will be executed as code and
    * can result in XSS attacks.
    */
  lazy val src: HtmlAttr[String] = stringAttr("src")

  /**
    * An alternate description to use for assistive devices. If omitted, the icon will be considered presentational and
    * ignored by assistive devices.
    */
  lazy val label: HtmlAttr[String] = stringAttr("label")

  /** The name of a registered custom icon library. */
  lazy val library: HtmlAttr[String] = stringAttr("library")


  // -- Props --


  // -- Slots --

  /** This component has no slots - don't give it any children. */
  @inline def noSlots(): Unit = ()




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The internal SVG element. */
    lazy val svg: String = "svg"

    /** The <use> element generated when using `spriteSheet: true` */
    lazy val use: String = "use"
  }


  // -- Element type -- 

  @js.native trait IconComponent extends js.Object { this: dom.HTMLElement => 

    /** The name of the icon to draw. Available names depend on the icon library being used. */
    var name: String | Unit

    /**
      * An external URL of an SVG file. Be sure you trust the content you are including, as it will be executed as code and
      * can result in XSS attacks.
      */
    var src: String | Unit

    /**
      * An alternate description to use for assistive devices. If omitted, the icon will be considered presentational and
      * ignored by assistive devices.
      */
    var label: String

    /** The name of a registered custom icon library. */
    var library: String
  }
}
