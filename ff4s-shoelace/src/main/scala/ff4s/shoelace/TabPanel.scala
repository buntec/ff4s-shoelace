package ff4s.shoelace

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Tab panels are used inside [tab groups](/components/tab-group) to display tabbed content.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/TabPanel.scala TabPanel.scala source code]]
  * 
  * [[https://shoelace.style/components/tab-panel Shoelace TabPanel docs]]
  */
object TabPanel extends WebComponent {
  override val tagName: String = "sl-tab-panel"

  type Ref = TabPanelComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /** The tab panel's name. */
  lazy val name: HtmlAttr[String] = stringAttr("name")

  /** When true, the tab panel will be shown. */
  lazy val active: HtmlAttr[Boolean] = boolAttr("active")


  // -- Props --


  // -- Slots --

  object slots {

    /** The tab panel's content. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"
  }


  // -- Element type -- 

  @js.native trait TabPanelComponent extends js.Object { this: dom.HTMLElement => 

    /** The tab panel's name. */
    var name: String

    /** When true, the tab panel will be shown. */
    var active: Boolean
  }
}
