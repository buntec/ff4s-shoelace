package ff4s.shoelace

// format: off

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Details show a brief summary and expand to show additional content.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/Details.scala Details.scala source code]]
  * 
  * [[https://shoelace.style/components/details Shoelace Details docs]]
  */
object Details extends WebComponent {
  override val tagName: String = "sl-details"

  type Ref = DetailsComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the details opens. */
  lazy val onShow: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-show")

  /** Emitted after the details opens and all animations are complete. */
  lazy val onAfterShow: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-after-show")

  /** Emitted when the details closes. */
  lazy val onHide: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-hide")

  /** Emitted after the details closes and all animations are complete. */
  lazy val onAfterHide: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-after-hide")


  // -- Attributes --

  /**
    * Indicates whether or not the details is open. You can toggle this attribute to show and hide the details, or you
    * can use the `show()` and `hide()` methods and this attribute will reflect the details' open state.
    */
  lazy val open: HtmlAttr[Boolean] = boolAttr("open")

  /** The summary to show in the header. If you need to display HTML, use the `summary` slot instead. */
  lazy val summary: HtmlAttr[String] = stringAttr("summary")

  /** Disables the details so it can't be toggled. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")


  // -- Props --

  lazy val detailsObserver: HtmlProp[dom.MutationObserver, _] = asIsProp("detailsObserver")


  // -- Slots --

  object slots {

    /** The details' main content. Note: You can pass this element like a regular child instead of `default := element` */
    lazy val default: Slot = Slot("")

    /** The details' summary. Alternatively, you can use the `summary` attribute. */
    lazy val summary: Slot = Slot("summary")

    /** Optional expand icon to use instead of the default. Works best with `<sl-icon>`. */
    lazy val expandIcon: Slot = Slot("expand-icon")

    /** Optional collapse icon to use instead of the default. Works best with `<sl-icon>`. */
    lazy val collapseIcon: Slot = Slot("collapse-icon")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The header that wraps both the summary and the expand/collapse icon. */
    lazy val header: String = "header"

    /** The container that wraps the summary. */
    lazy val summary: String = "summary"

    /** The container that wraps the expand/collapse icons. */
    lazy val summaryIcon: String = "summary-icon"

    /** The details content. */
    lazy val content: String = "content"
  }


  // -- Element type -- 

  @js.native trait DetailsComponent extends js.Object { this: dom.HTMLElement => 

    var detailsObserver: dom.MutationObserver

    /**
      * Indicates whether or not the details is open. You can toggle this attribute to show and hide the details, or you
      * can use the `show()` and `hide()` methods and this attribute will reflect the details' open state.
      */
    var open: Boolean

    /** The summary to show in the header. If you need to display HTML, use the `summary` slot instead. */
    var summary: String

    /** Disables the details so it can't be toggled. */
    var disabled: Boolean
  }
}
