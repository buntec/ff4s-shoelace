package ff4s.shoelace

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Formats a date/time using the specified locale and options.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/FormatDate.scala FormatDate.scala source code]]
  * 
  * [[https://shoelace.style/components/format-date Shoelace FormatDate docs]]
  */
object FormatDate extends WebComponent {
  override val tagName: String = "sl-format-date"

  type Ref = FormatDateComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /** The format for displaying the weekday. */
  lazy val weekday: HtmlAttr[String] = stringAttr("weekday")

  /** The format for displaying the era. */
  lazy val era: HtmlAttr[String] = stringAttr("era")

  /** The format for displaying the year. */
  lazy val year: HtmlAttr[String] = stringAttr("year")

  /** The format for displaying the month. */
  lazy val month: HtmlAttr[String] = stringAttr("month")

  /** The format for displaying the day. */
  lazy val day: HtmlAttr[String] = stringAttr("day")

  /** The format for displaying the hour. */
  lazy val hour: HtmlAttr[String] = stringAttr("hour")

  /** The format for displaying the minute. */
  lazy val minute: HtmlAttr[String] = stringAttr("minute")

  /** The format for displaying the second. */
  lazy val second: HtmlAttr[String] = stringAttr("second")

  /** The format for displaying the time. */
  lazy val timeZoneName: HtmlAttr[String] = stringAttr("time-zone-name")

  /** The time zone to express the time in. */
  lazy val timeZone: HtmlAttr[String] = stringAttr("time-zone")

  /** The format for displaying the hour. */
  lazy val hourFormat: HtmlAttr[String] = stringAttr("hour-format")


  // -- Props --


  // -- Slots --

  /** This component has no slots - don't give it any children. */
  @inline def noSlots: Unit = ()




  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()


  // -- Element type -- 

  @js.native trait FormatDateComponent extends js.Object { this: dom.HTMLElement => 

    /** The format for displaying the weekday. */
    var weekday: String

    /** The format for displaying the era. */
    var era: String

    /** The format for displaying the year. */
    var year: String

    /** The format for displaying the month. */
    var month: String

    /** The format for displaying the day. */
    var day: String

    /** The format for displaying the hour. */
    var hour: String

    /** The format for displaying the minute. */
    var minute: String

    /** The format for displaying the second. */
    var second: String

    /** The format for displaying the time. */
    var timeZoneName: String

    /** The time zone to express the time in. */
    var timeZone: String

    /** The format for displaying the hour. */
    var hourFormat: String
  }
}
