package ff4s.shoelace

// format: off

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Outputs a localized time phrase relative to the current date and time.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/RelativeTime.scala RelativeTime.scala source code]]
  * 
  * [[https://shoelace.style/components/relative-time Shoelace RelativeTime docs]]
  */
object RelativeTime extends WebComponent {
  override val tagName: String = "sl-relative-time"

  type Ref = RelativeTimeComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /** The formatting style to use. */
  lazy val format: HtmlAttr[String] = stringAttr("format")

  /**
    * When `auto`, values such as "yesterday" and "tomorrow" will be shown when possible. When `always`, values such as
    * "1 day ago" and "in 1 day" will be shown.
    */
  lazy val numeric: HtmlAttr[String] = stringAttr("numeric")

  /** Keep the displayed value up to date as time passes. */
  lazy val sync: HtmlAttr[Boolean] = boolAttr("sync")


  // -- Props --


  // -- Slots --

  /** This component has no slots - don't give it any children. */
  @inline def noSlots(): Unit = ()




  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts(): Unit = ()


  // -- Element type -- 

  @js.native trait RelativeTimeComponent extends js.Object { this: dom.HTMLElement => 

    /** The formatting style to use. */
    var format: String

    /**
      * When `auto`, values such as "yesterday" and "tomorrow" will be shown when possible. When `always`, values such as
      * "1 day ago" and "in 1 day" will be shown.
      */
    var numeric: String

    /** Keep the displayed value up to date as time passes. */
    var sync: Boolean
  }
}
