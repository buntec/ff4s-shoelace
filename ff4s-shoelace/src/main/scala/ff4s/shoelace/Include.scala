package ff4s.shoelace

import ff4s._
import ff4s.shoelace.EventTypes.*
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Includes give you the power to embed external HTML files into the page.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/Include.scala Include.scala source code]]
  * 
  * [[https://shoelace.style/components/include Shoelace Include docs]]
  */
object Include extends WebComponent {
  override val tagName: String = "sl-include"

  type Ref = IncludeComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the included file is loaded. */
  lazy val onLoad: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-load")

  /** Emitted when the included file fails to load due to an error. */
  lazy val onError: EventProp[ErrorEvent] = EventProp[ErrorEvent]("sl-error")


  // -- Attributes --

  /**
    * The location of the HTML file to include. Be sure you trust the content you are including as it will be executed as
    * code and can result in XSS attacks.
    */
  lazy val src: HtmlAttr[String] = stringAttr("src")

  /** The fetch mode to use. */
  lazy val mode: HtmlAttr[String] = stringAttr("mode")

  /**
    * Allows included scripts to be executed. Be sure you trust the content you are including as it will be executed as
    * code and can result in XSS attacks.
    */
  lazy val allowScripts: HtmlAttr[Boolean] = boolAttr("allow-scripts")


  // -- Props --


  // -- Slots --

  /** This component has no slots - don't give it any children. */
  @inline def noSlots: Unit = ()




  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()


  // -- Element type -- 

  @js.native trait IncludeComponent extends js.Object { this: dom.HTMLElement => 

    /**
      * The location of the HTML file to include. Be sure you trust the content you are including as it will be executed as
      * code and can result in XSS attacks.
      */
    var src: String

    /** The fetch mode to use. */
    var mode: String

    /**
      * Allows included scripts to be executed. Be sure you trust the content you are including as it will be executed as
      * code and can result in XSS attacks.
      */
    var allowScripts: Boolean
  }
}
