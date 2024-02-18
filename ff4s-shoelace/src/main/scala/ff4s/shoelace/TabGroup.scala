package ff4s.shoelace

import ff4s._
import ff4s.codecs._
import ff4s.shoelace.EventTypes.*
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Tab groups organize content into a container that shows one section at a time.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/TabGroup.scala TabGroup.scala source code]]
  * 
  * [[https://shoelace.style/components/tab-group Shoelace TabGroup docs]]
  */
object TabGroup extends WebComponent {
  override val tagName: String = "sl-tab-group"

  type Ref = TabGroupComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when a tab is shown. */
  lazy val onTabShow: EventProp[TabShowEvent] = EventProp[TabShowEvent]("sl-tab-show")

  /** Emitted when a tab is hidden. */
  lazy val onTabHide: EventProp[TabHideEvent] = EventProp[TabHideEvent]("sl-tab-hide")


  // -- Attributes --

  /** The placement of the tabs. */
  lazy val placement: HtmlAttr[String] = stringAttr("placement")

  /**
    * When set to auto, navigating tabs with the arrow keys will instantly show the corresponding tab panel. When set to
    * manual, the tab will receive focus but will not show until the user presses spacebar or enter.
    */
  lazy val activation: HtmlAttr[String] = stringAttr("activation")

  /** Disables the scroll arrows that appear when tabs overflow. */
  lazy val noScrollControls: HtmlAttr[Boolean] = boolAttr("no-scroll-controls")


  // -- Props --


  // -- Slots --

  object slots {

    /** Used for grouping tab panels in the tab group. Must be `<sl-tab-panel>` elements. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")

    /** Used for grouping tabs in the tab group. Must be `<sl-tab>` elements. */
    lazy val nav: Slot = Slot("nav")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The tab group's navigation container where tabs are slotted in. */
    lazy val nav: String = "nav"

    /** The container that wraps the tabs. */
    lazy val tabs: String = "tabs"

    /** The line that highlights the currently selected tab. */
    lazy val activeTabIndicator: String = "active-tab-indicator"

    /** The tab group's body where tab panels are slotted in. */
    lazy val body: String = "body"

    /** The previous/next scroll buttons that show when tabs are scrollable, an `<sl-icon-button>`. */
    lazy val scrollButton: String = "scroll-button"

    /** The starting scroll button. */
    lazy val scrollButtonStart: String = "scroll-button--start"

    /** The ending scroll button. */
    lazy val scrollButtonEnd: String = "scroll-button--end"

    /** The scroll button's exported `base` part. */
    lazy val scrollButton__base: String = "scroll-button__base"
  }


  // -- Element type -- 

  @js.native trait TabGroupComponent extends js.Object { this: dom.HTMLElement => 

    /** The placement of the tabs. */
    var placement: String

    /**
      * When set to auto, navigating tabs with the arrow keys will instantly show the corresponding tab panel. When set to
      * manual, the tab will receive focus but will not show until the user presses spacebar or enter.
      */
    var activation: String

    /** Disables the scroll arrows that appear when tabs overflow. */
    var noScrollControls: Boolean
  }
}
