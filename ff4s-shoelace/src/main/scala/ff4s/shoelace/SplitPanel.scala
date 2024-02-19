package ff4s.shoelace

// format: off

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Split panels display two adjacent panels, allowing the user to reposition them.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/SplitPanel.scala SplitPanel.scala source code]]
  * 
  * [[https://shoelace.style/components/split-panel Shoelace SplitPanel docs]]
  */
object SplitPanel extends WebComponent {
  override val tagName: String = "sl-split-panel"

  type Ref = SplitPanelComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the divider's position changes. */
  lazy val onReposition: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-reposition")


  // -- Attributes --

  /**
    * The current position of the divider from the primary panel's edge as a percentage 0-100. Defaults to 50% of the
    * container's initial size.
    */
  lazy val position: HtmlAttr[Int] = intAttr("position")

  /** The current position of the divider from the primary panel's edge in pixels. */
  lazy val positionInPixels: HtmlAttr[Int] = intAttr("position-in-pixels")

  /** Draws the split panel in a vertical orientation with the start and end panels stacked. */
  lazy val vertical: HtmlAttr[Boolean] = boolAttr("vertical")

  /** Disables resizing. Note that the position may still change as a result of resizing the host element. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")

  /**
    * If no primary panel is designated, both panels will resize proportionally when the host element is resized. If a
    * primary panel is designated, it will maintain its size and the other panel will grow or shrink as needed when the
    * host element is resized.
    */
  lazy val primary: HtmlAttr[String] = stringAttr("primary")

  /**
    * One or more space-separated values at which the divider should snap. Values can be in pixels or percentages, e.g.
    * `"100px 50%"`.
    */
  lazy val snap: HtmlAttr[String] = stringAttr("snap")

  /** How close the divider must be to a snap point until snapping occurs. */
  lazy val snapThreshold: HtmlAttr[Int] = intAttr("snap-threshold")


  // -- Props --


  // -- Slots --

  object slots {

    /** Content to place in the start panel. */
    lazy val start: Slot = Slot("start")

    /** Content to place in the end panel. */
    lazy val end: Slot = Slot("end")

    /** The divider. Useful for slotting in a custom icon that renders as a handle. */
    lazy val divider: Slot = Slot("divider")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The start panel. */
    lazy val start: String = "start"

    /** The end panel. */
    lazy val end: String = "end"

    /** Targets both the start and end panels. */
    lazy val panel: String = "panel"

    /** The divider that separates the start and end panels. */
    lazy val divider: String = "divider"
  }


  // -- Element type -- 

  @js.native trait SplitPanelComponent extends js.Object { this: dom.HTMLElement => 

    /**
      * The current position of the divider from the primary panel's edge as a percentage 0-100. Defaults to 50% of the
      * container's initial size.
      */
    var position: Int

    /** The current position of the divider from the primary panel's edge in pixels. */
    var positionInPixels: Int

    /** Draws the split panel in a vertical orientation with the start and end panels stacked. */
    var vertical: Boolean

    /** Disables resizing. Note that the position may still change as a result of resizing the host element. */
    var disabled: Boolean

    /**
      * If no primary panel is designated, both panels will resize proportionally when the host element is resized. If a
      * primary panel is designated, it will maintain its size and the other panel will grow or shrink as needed when the
      * host element is resized.
      */
    var primary: String | Unit

    /**
      * One or more space-separated values at which the divider should snap. Values can be in pixels or percentages, e.g.
      * `"100px 50%"`.
      */
    var snap: String | Unit

    /** How close the divider must be to a snap point until snapping occurs. */
    var snapThreshold: Int
  }
}
