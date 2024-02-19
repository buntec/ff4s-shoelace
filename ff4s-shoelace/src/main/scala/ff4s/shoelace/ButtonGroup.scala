package ff4s.shoelace

// format: off

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Button groups can be used to group related buttons into sections.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/ButtonGroup.scala ButtonGroup.scala source code]]
  * 
  * [[https://shoelace.style/components/button-group Shoelace ButtonGroup docs]]
  */
object ButtonGroup extends WebComponent {
  override val tagName: String = "sl-button-group"

  type Ref = ButtonGroupComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /**
    * A label to use for the button group. This won't be displayed on the screen, but it will be announced by assistive
    * devices when interacting with the control and is strongly recommended.
    */
  lazy val label: HtmlAttr[String] = stringAttr("label")


  // -- Props --


  // -- Slots --

  object slots {

    /** One or more `<sl-button>` elements to display in the button group. Note: You can pass this element like a regular child instead of `default := element` */
    lazy val default: Slot = Slot("")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"
  }


  // -- Element type -- 

  @js.native trait ButtonGroupComponent extends js.Object { this: dom.HTMLElement => 

    /**
      * A label to use for the button group. This won't be displayed on the screen, but it will be announced by assistive
      * devices when interacting with the control and is strongly recommended.
      */
    var label: String
  }
}
