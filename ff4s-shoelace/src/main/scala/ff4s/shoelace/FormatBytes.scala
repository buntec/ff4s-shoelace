package ff4s.shoelace

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Formats a number as a human readable bytes value.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/FormatBytes.scala FormatBytes.scala source code]]
  * 
  * [[https://shoelace.style/components/format-bytes Shoelace FormatBytes docs]]
  */
object FormatBytes extends WebComponent {
  override val tagName: String = "sl-format-bytes"

  type Ref = FormatBytesComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /** The number to format in bytes. */
  lazy val defaultValue: HtmlAttr[Int] = intAttr("value")

  /** The type of unit to display. */
  lazy val unit: HtmlAttr[String] = stringAttr("unit")

  /** Determines how to display the result, e.g. "100 bytes", "100 b", or "100b". */
  lazy val display: HtmlAttr[String] = stringAttr("display")


  // -- Props --

  /** The number to format in bytes. */
  lazy val value: HtmlProp[Int, _] = intProp("value")


  // -- Slots --

  /** This component has no slots - don't give it any children. */
  @inline def noSlots: Unit = ()




  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()


  // -- Element type -- 

  @js.native trait FormatBytesComponent extends js.Object { this: dom.HTMLElement => 

    /** The number to format in bytes. */
    var value: Int

    /** The type of unit to display. */
    var unit: String

    /** Determines how to display the result, e.g. "100 bytes", "100 b", or "100b". */
    var display: String
  }
}
