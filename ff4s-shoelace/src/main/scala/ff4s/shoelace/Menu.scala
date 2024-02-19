package ff4s.shoelace

import ff4s._
import ff4s.shoelace.EventTypes.*
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Menus provide a list of options for the user to choose from.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/Menu.scala Menu.scala source code]]
  * 
  * [[https://shoelace.style/components/menu Shoelace Menu docs]]
  */
object Menu extends WebComponent {
  override val tagName: String = "sl-menu"

  type Ref = dom.HTMLElement


  // -- Events --

  /** Emitted when a menu item is selected. */
  lazy val onSelect: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref] with HasDetail[SelectEvent]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref] with HasDetail[SelectEvent]]("sl-select")


  // -- Attributes --


  // -- Props --


  // -- Slots --

  object slots {

    /** The menu's content, including menu items, menu labels, and dividers. Note: You can pass this element like a regular child instead of `default := element` */
    lazy val default: Slot = Slot("")
  }




  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()
}
