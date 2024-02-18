package ff4s.shoelace

import ff4s._
import ff4s.codecs._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Skeletons are used to provide a visual representation of where content will eventually be drawn.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/Skeleton.scala Skeleton.scala source code]]
  * 
  * [[https://shoelace.style/components/skeleton Shoelace Skeleton docs]]
  */
object Skeleton extends WebComponent {
  override val tagName: String = "sl-skeleton"

  type Ref = SkeletonComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /** Determines which effect the skeleton will use. */
  lazy val effect: HtmlAttr[String] = stringAttr("effect")


  // -- Props --


  // -- Slots --

  /** This component has no slots - don't give it any children. */
  @inline def noSlots: Unit = ()




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The skeleton's indicator which is responsible for its color and animation. */
    lazy val indicator: String = "indicator"
  }


  // -- Element type -- 

  @js.native trait SkeletonComponent extends js.Object { this: dom.HTMLElement => 

    /** Determines which effect the skeleton will use. */
    var effect: String
  }
}
