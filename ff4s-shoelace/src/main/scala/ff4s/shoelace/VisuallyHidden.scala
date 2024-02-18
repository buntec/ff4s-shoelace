package ff4s.shoelace

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * The visually hidden utility makes content accessible to assistive devices without displaying it on the screen.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/VisuallyHidden.scala VisuallyHidden.scala source code]]
  * 
  * [[https://shoelace.style/components/visually-hidden Shoelace VisuallyHidden docs]]
  */
object VisuallyHidden extends WebComponent {
  override val tagName: String = "sl-visually-hidden"

  type Ref = dom.HTMLElement


  // -- Events --


  // -- Attributes --


  // -- Props --


  // -- Slots --

  object slots {

    /** The content to be visually hidden. Note: You can pass this element like a regular child instead of `default := element` */
    lazy val default: Slot = Slot("")
  }




  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()
}
