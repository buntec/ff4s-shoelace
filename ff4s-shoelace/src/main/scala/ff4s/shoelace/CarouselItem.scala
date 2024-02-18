package ff4s.shoelace

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * A carousel item represent a slide within a [carousel](/components/carousel).
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/CarouselItem.scala CarouselItem.scala source code]]
  */
object CarouselItem extends WebComponent {
  override val tagName: String = "sl-carousel-item"

  type Ref = dom.HTMLElement


  // -- Events --


  // -- Attributes --


  // -- Props --


  // -- Slots --

  object slots {

    /** The carousel item's content.. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }




  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()
}
