package ff4s.shoelace

import ff4s._
import ff4s.shoelace.EventTypes.*
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * The Resize Observer component offers a thin, declarative interface to the [`ResizeObserver API`](https://developer.mozilla.org/en-US/docs/Web/API/ResizeObserver).
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/ResizeObserver.scala ResizeObserver.scala source code]]
  * 
  * [[https://shoelace.style/components/resize-observer Shoelace ResizeObserver docs]]
  */
object ResizeObserver extends WebComponent {
  override val tagName: String = "sl-resize-observer"

  type Ref = ResizeObserverComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the element is resized. */
  lazy val onResize: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref] with HasDetail[ResizeEvent]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref] with HasDetail[ResizeEvent]]("sl-resize")


  // -- Attributes --

  /** Disables the observer. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")


  // -- Props --


  // -- Slots --

  object slots {

    /** One or more elements to watch for resizing. Note: You can pass this element like a regular child instead of `default := element` */
    lazy val default: Slot = Slot("")
  }




  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()


  // -- Element type -- 

  @js.native trait ResizeObserverComponent extends js.Object { this: dom.HTMLElement => 

    /** Disables the observer. */
    var disabled: Boolean
  }
}
