package ff4s.shoelace

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Cards can be used to group related subjects in a container.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/Card.scala Card.scala source code]]
  * 
  * [[https://shoelace.style/components/card Shoelace Card docs]]
  */
object Card extends WebComponent {
  override val tagName: String = "sl-card"

  type Ref = dom.HTMLElement


  // -- Events --


  // -- Attributes --


  // -- Props --


  // -- Slots --

  object slots {

    /** The card's main content. Note: You can pass this element like a regular child instead of `default := element` */
    lazy val default: Slot = Slot("")

    /** An optional header for the card. */
    lazy val header: Slot = Slot("header")

    /** An optional footer for the card. */
    lazy val footer: Slot = Slot("footer")

    /** An optional image to render at the start of the card. */
    lazy val image: Slot = Slot("image")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The container that wraps the card's image. */
    lazy val image: String = "image"

    /** The container that wraps the card's header. */
    lazy val header: String = "header"

    /** The container that wraps the card's main content. */
    lazy val body: String = "body"

    /** The container that wraps the card's footer. */
    lazy val footer: String = "footer"
  }
}
