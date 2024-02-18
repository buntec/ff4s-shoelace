package ff4s.shoelace

import ff4s._
import ff4s.codecs._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Tags are used as labels to organize things or to indicate a selection.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/Tag.scala Tag.scala source code]]
  * 
  * [[https://shoelace.style/components/tag Shoelace Tag docs]]
  */
object Tag extends WebComponent {
  override val tagName: String = "sl-tag"

  type Ref = TagComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the remove button is activated. */
  lazy val onRemove: EventProp[dom.Event] = EventProp[dom.Event]("sl-remove")


  // -- Attributes --

  /** The tag's theme variant. */
  lazy val variant: HtmlAttr[String] = stringAttr("variant")

  /** The tag's size. */
  lazy val size: HtmlAttr[String] = stringAttr("size")

  /** Draws a pill-style tag with rounded edges. */
  lazy val pill: HtmlAttr[Boolean] = boolAttr("pill")

  /** Makes the tag removable and shows a remove button. */
  lazy val removable: HtmlAttr[Boolean] = boolAttr("removable")


  // -- Props --


  // -- Slots --

  object slots {

    /** The tag's content. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The tag's content. */
    lazy val content: String = "content"

    /** The tag's remove button, an `<sl-icon-button>`. */
    lazy val removeButton: String = "remove-button"

    /** The remove button's exported `base` part. */
    lazy val removeButton__base: String = "remove-button__base"
  }


  // -- Element type -- 

  @js.native trait TagComponent extends js.Object { this: dom.HTMLElement => 

    /** The tag's theme variant. */
    var variant: String

    /** The tag's size. */
    var size: String

    /** Draws a pill-style tag with rounded edges. */
    var pill: Boolean

    /** Makes the tag removable and shows a remove button. */
    var removable: Boolean
  }
}
