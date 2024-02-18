package ff4s.shoelace

import ff4s._
import ff4s.codecs._
import ff4s.shoelace.EventTypes.*
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * The Mutation Observer component offers a thin, declarative interface to the [`MutationObserver API`](https://developer.mozilla.org/en-US/docs/Web/API/MutationObserver).
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/MutationObserver.scala MutationObserver.scala source code]]
  * 
  * [[https://shoelace.style/components/mutation-observer Shoelace MutationObserver docs]]
  */
object MutationObserver extends WebComponent {
  override val tagName: String = "sl-mutation-observer"

  type Ref = MutationObserverComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when a mutation occurs. */
  lazy val onMutation: EventProp[MutationEvent] = EventProp[MutationEvent]("sl-mutation")


  // -- Attributes --

  /**
    * Watches for changes to attributes. To watch only specific attributes, separate them by a space, e.g.
    * `attr="class id title"`. To watch all attributes, use `*`.
    */
  lazy val attr: HtmlAttr[String] = stringAttr("attr")

  /** Indicates whether or not the attribute's previous value should be recorded when monitoring changes. */
  lazy val attrOldValue: HtmlAttr[Boolean] = boolAttr("attr-old-value")

  /** Watches for changes to the character data contained within the node. */
  lazy val charData: HtmlAttr[Boolean] = boolAttr("char-data")

  /** Indicates whether or not the previous value of the node's text should be recorded. */
  lazy val charDataOldValue: HtmlAttr[Boolean] = boolAttr("char-data-old-value")

  /** Watches for the addition or removal of new child nodes. */
  lazy val childList: HtmlAttr[Boolean] = boolAttr("child-list")

  /** Disables the observer. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")


  // -- Props --


  // -- Slots --

  object slots {

    /** The content to watch for mutations. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }




  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()


  // -- Element type -- 

  @js.native trait MutationObserverComponent extends js.Object { this: dom.HTMLElement => 

    /**
      * Watches for changes to attributes. To watch only specific attributes, separate them by a space, e.g.
      * `attr="class id title"`. To watch all attributes, use `*`.
      */
    var attr: String

    /** Indicates whether or not the attribute's previous value should be recorded when monitoring changes. */
    var attrOldValue: Boolean

    /** Watches for changes to the character data contained within the node. */
    var charData: Boolean

    /** Indicates whether or not the previous value of the node's text should be recorded. */
    var charDataOldValue: Boolean

    /** Watches for the addition or removal of new child nodes. */
    var childList: Boolean

    /** Disables the observer. */
    var disabled: Boolean
  }
}
