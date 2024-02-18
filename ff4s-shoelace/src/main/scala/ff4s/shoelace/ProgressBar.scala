package ff4s.shoelace

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Progress bars are used to show the status of an ongoing operation.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/ProgressBar.scala ProgressBar.scala source code]]
  * 
  * [[https://shoelace.style/components/progress-bar Shoelace ProgressBar docs]]
  */
object ProgressBar extends WebComponent {
  override val tagName: String = "sl-progress-bar"

  type Ref = ProgressBarComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /** The current progress as a percentage, 0 to 100. */
  lazy val defaultValue: HtmlAttr[Int] = intAttr("value")

  /** When true, percentage is ignored, the label is hidden, and the progress bar is drawn in an indeterminate state. */
  lazy val indeterminate: HtmlAttr[Boolean] = boolAttr("indeterminate")

  /** A custom label for assistive devices. */
  lazy val label: HtmlAttr[String] = stringAttr("label")


  // -- Props --

  /** The current progress as a percentage, 0 to 100. */
  lazy val value: HtmlProp[Int, _] = intProp("value")


  // -- Slots --

  object slots {

    /** A label to show inside the progress indicator. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The progress bar's indicator. */
    lazy val indicator: String = "indicator"

    /** The progress bar's label. */
    lazy val label: String = "label"
  }


  // -- Element type -- 

  @js.native trait ProgressBarComponent extends js.Object { this: dom.HTMLElement => 

    /** The current progress as a percentage, 0 to 100. */
    var value: Int

    /** When true, percentage is ignored, the label is hidden, and the progress bar is drawn in an indeterminate state. */
    var indeterminate: Boolean

    /** A custom label for assistive devices. */
    var label: String
  }
}
