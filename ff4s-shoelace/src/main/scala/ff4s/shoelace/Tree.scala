package ff4s.shoelace

import ff4s._
import ff4s.shoelace.EventTypes.*
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Trees allow you to display a hierarchical list of selectable [tree items](/components/tree-item). Items with children can be expanded and collapsed as desired by the user.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/Tree.scala Tree.scala source code]]
  * 
  * [[https://shoelace.style/components/tree Shoelace Tree docs]]
  */
object Tree extends WebComponent {
  override val tagName: String = "sl-tree"

  type Ref = TreeComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when a tree item is selected or deselected. */
  lazy val onSelectionChange: EventProp[SelectionChangeEvent] = EventProp[SelectionChangeEvent]("sl-selection-change")


  // -- Attributes --

  /**
    * The selection behavior of the tree. Single selection allows only one node to be selected at a time. Multiple
    * displays checkboxes and allows more than one node to be selected. Leaf allows only leaf nodes to be selected.
    */
  lazy val selection: HtmlAttr[String] = stringAttr("selection")


  // -- Props --


  // -- Slots --

  object slots {

    /** The default slot. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")

    /** The icon to show when the tree item is expanded. Works best with `<sl-icon>`. */
    lazy val expandIcon: Slot = Slot("expand-icon")

    /** The icon to show when the tree item is collapsed. Works best with `<sl-icon>`. */
    lazy val collapseIcon: Slot = Slot("collapse-icon")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"
  }


  // -- Element type -- 

  @js.native trait TreeComponent extends js.Object { this: dom.HTMLElement => 

    /**
      * The selection behavior of the tree. Single selection allows only one node to be selected at a time. Multiple
      * displays checkboxes and allows more than one node to be selected. Leaf allows only leaf nodes to be selected.
      */
    var selection: String
  }
}
