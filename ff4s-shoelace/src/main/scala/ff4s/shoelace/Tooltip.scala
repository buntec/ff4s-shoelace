package ff4s.shoelace

// format: off

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Tooltips display additional information based on a specific action.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/Tooltip.scala Tooltip.scala source code]]
  * 
  * [[https://shoelace.style/components/tooltip Shoelace Tooltip docs]]
  */
object Tooltip extends WebComponent {
  override val tagName: String = "sl-tooltip"

  type Ref = TooltipComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the tooltip begins to show. */
  lazy val onShow: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-show")

  /** Emitted after the tooltip has shown and all animations are complete. */
  lazy val onAfterShow: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-after-show")

  /** Emitted when the tooltip begins to hide. */
  lazy val onHide: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-hide")

  /** Emitted after the tooltip has hidden and all animations are complete. */
  lazy val onAfterHide: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-after-hide")


  // -- Attributes --

  /** The tooltip's content. If you need to display HTML, use the `content` slot instead. */
  lazy val content: HtmlAttr[String] = stringAttr("content")

  /**
    * The preferred placement of the tooltip. Note that the actual placement may vary as needed to keep the tooltip
    * inside of the viewport.
    */
  lazy val placement: HtmlAttr[String] = stringAttr("placement")

  /** Disables the tooltip so it won't show when triggered. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")

  /** The distance in pixels from which to offset the tooltip away from its target. */
  lazy val distance: HtmlAttr[Int] = intAttr("distance")

  /** Indicates whether or not the tooltip is open. You can use this in lieu of the show/hide methods. */
  lazy val open: HtmlAttr[Boolean] = boolAttr("open")

  /** The distance in pixels from which to offset the tooltip along its target. */
  lazy val skidding: HtmlAttr[Int] = intAttr("skidding")

  /**
    * Controls how the tooltip is activated. Possible options include `click`, `hover`, `focus`, and `manual`. Multiple
    * options can be passed by separating them with a space. When manual is used, the tooltip must be activated
    * programmatically.
    */
  lazy val trigger: HtmlAttr[String] = stringAttr("trigger")

  /**
    * Enable this option to prevent the tooltip from being clipped when the component is placed inside a container with
    * `overflow: auto|hidden|scroll`. Hoisting uses a fixed positioning strategy that works in many, but not all,
    * scenarios.
    */
  lazy val hoist: HtmlAttr[Boolean] = boolAttr("hoist")


  // -- Props --


  // -- Slots --

  object slots {

    /** The tooltip's target element. Avoid slotting in more than one element, as subsequent ones will be ignored. Note: You can pass this element like a regular child instead of `default := element` */
    lazy val default: Slot = Slot("")

    /** The content to render in the tooltip. Alternatively, you can use the `content` attribute. */
    lazy val content: Slot = Slot("content")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper, an `<sl-popup>` element. */
    lazy val base: String = "base"

    /** The popup's exported `popup` part. Use this to target the tooltip's popup container. */
    lazy val base__popup: String = "base__popup"

    /** The popup's exported `arrow` part. Use this to target the tooltip's arrow. */
    lazy val base__arrow: String = "base__arrow"

    /** The tooltip's body where its content is rendered. */
    lazy val body: String = "body"
  }


  // -- Element type -- 

  @js.native trait TooltipComponent extends js.Object { this: dom.HTMLElement => 

    /** The tooltip's content. If you need to display HTML, use the `content` slot instead. */
    var content: String

    /**
      * The preferred placement of the tooltip. Note that the actual placement may vary as needed to keep the tooltip
      * inside of the viewport.
      */
    var placement: String

    /** Disables the tooltip so it won't show when triggered. */
    var disabled: Boolean

    /** The distance in pixels from which to offset the tooltip away from its target. */
    var distance: Int

    /** Indicates whether or not the tooltip is open. You can use this in lieu of the show/hide methods. */
    var open: Boolean

    /** The distance in pixels from which to offset the tooltip along its target. */
    var skidding: Int

    /**
      * Controls how the tooltip is activated. Possible options include `click`, `hover`, `focus`, and `manual`. Multiple
      * options can be passed by separating them with a space. When manual is used, the tooltip must be activated
      * programmatically.
      */
    var trigger: String

    /**
      * Enable this option to prevent the tooltip from being clipped when the component is placed inside a container with
      * `overflow: auto|hidden|scroll`. Hoisting uses a fixed positioning strategy that works in many, but not all,
      * scenarios.
      */
    var hoist: Boolean
  }
}
