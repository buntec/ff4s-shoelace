package ff4s.shoelace

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Progress rings are used to show the progress of a determinate operation in a circular fashion.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/ProgressRing.scala ProgressRing.scala source code]]
  * 
  * [[https://shoelace.style/components/progress-ring Shoelace ProgressRing docs]]
  */
object ProgressRing extends WebComponent {
  override val tagName: String = "sl-progress-ring"

  type Ref = ProgressRingComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /** The current progress as a percentage, 0 to 100. */
  lazy val defaultValue: HtmlAttr[Int] = intAttr("value")

  /** A custom label for assistive devices. */
  lazy val label: HtmlAttr[String] = stringAttr("label")


  // -- Props --

  /** The current progress as a percentage, 0 to 100. */
  lazy val value: HtmlProp[Int, _] = intProp("value")


  // -- Slots --

  object slots {

    /** A label to show inside the ring. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The progress ring label. */
    lazy val label: String = "label"
  }


  // -- Element type -- 

  @js.native trait ProgressRingComponent extends js.Object { this: dom.HTMLElement => 

    /** The current progress as a percentage, 0 to 100. */
    var value: Int

    /** A custom label for assistive devices. */
    var label: String
  }
}
