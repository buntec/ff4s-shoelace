package ff4s.shoelace

// format: off

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Tabs are used inside [tab groups](/components/tab-group) to represent and activate [tab panels](/components/tab-panel).
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/Tab.scala Tab.scala source code]]
  * 
  * [[https://shoelace.style/components/tab Shoelace Tab docs]]
  */
object Tab extends WebComponent {
  override val tagName: String = "sl-tab"

  type Ref = TabComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the tab is closable and the close button is activated. */
  lazy val onClose: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-close")


  // -- Attributes --

  /** The name of the tab panel this tab is associated with. The panel must be located in the same tab group. */
  lazy val panel: HtmlAttr[String] = stringAttr("panel")

  /** Draws the tab in an active state. */
  lazy val active: HtmlAttr[Boolean] = boolAttr("active")

  /** Makes the tab closable and shows a close button. */
  lazy val closable: HtmlAttr[Boolean] = boolAttr("closable")

  /** Disables the tab and prevents selection. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")


  // -- Props --


  // -- Slots --

  object slots {

    /** The tab's label. Note: You can pass this element like a regular child instead of `default := element` */
    lazy val default: Slot = Slot("")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The close button, an `<sl-icon-button>`. */
    lazy val closeButton: String = "close-button"

    /** The close button's exported `base` part. */
    lazy val closeButton__base: String = "close-button__base"
  }


  // -- Element type -- 

  @js.native trait TabComponent extends js.Object { this: dom.HTMLElement => 

    /** The name of the tab panel this tab is associated with. The panel must be located in the same tab group. */
    var panel: String

    /** Draws the tab in an active state. */
    var active: Boolean

    /** Makes the tab closable and shows a close button. */
    var closable: Boolean

    /** Disables the tab and prevents selection. */
    var disabled: Boolean
  }
}
