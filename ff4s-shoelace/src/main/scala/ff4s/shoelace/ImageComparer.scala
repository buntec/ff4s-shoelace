package ff4s.shoelace

import ff4s._
import ff4s.codecs._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Compare visual differences between similar photos with a sliding panel.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/ImageComparer.scala ImageComparer.scala source code]]
  * 
  * [[https://shoelace.style/components/image-comparer Shoelace ImageComparer docs]]
  */
object ImageComparer extends WebComponent {
  override val tagName: String = "sl-image-comparer"

  type Ref = ImageComparerComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the position changes. */
  lazy val onChange: EventProp[dom.Event] = EventProp[dom.Event]("sl-change")


  // -- Attributes --

  /** The position of the divider as a percentage. */
  lazy val position: HtmlAttr[Int] = intAttr("position")


  // -- Props --


  // -- Slots --

  object slots {

    /** The before image, an `<img>` or `<svg>` element. */
    lazy val before: Slot = Slot("before")

    /** The after image, an `<img>` or `<svg>` element. */
    lazy val after: Slot = Slot("after")

    /** The icon used inside the handle. */
    lazy val handle: Slot = Slot("handle")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The container that wraps the before image. */
    lazy val before: String = "before"

    /** The container that wraps the after image. */
    lazy val after: String = "after"

    /** The divider that separates the images. */
    lazy val divider: String = "divider"

    /** The handle that the user drags to expose the after image. */
    lazy val handle: String = "handle"
  }


  // -- Element type -- 

  @js.native trait ImageComparerComponent extends js.Object { this: dom.HTMLElement => 

    /** The position of the divider as a percentage. */
    var position: Int
  }
}
