package ff4s.shoelace

// format: off

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Dividers are used to visually separate or group elements.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/Divider.scala Divider.scala source code]]
  * 
  * [[https://shoelace.style/components/divider Shoelace Divider docs]]
  */
object Divider extends WebComponent {
  override val tagName: String = "sl-divider"

  type Ref = DividerComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /** Draws the divider in a vertical orientation. */
  lazy val vertical: HtmlAttr[Boolean] = boolAttr("vertical")


  // -- Props --


  // -- Slots --

  /** This component has no slots - don't give it any children. */
  @inline def noSlots: Unit = ()




  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()


  // -- Element type -- 

  @js.native trait DividerComponent extends js.Object { this: dom.HTMLElement => 

    /** Draws the divider in a vertical orientation. */
    var vertical: Boolean
  }
}
