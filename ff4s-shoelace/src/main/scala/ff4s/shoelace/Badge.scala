package ff4s.shoelace

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Badges are used to draw attention and display statuses or counts.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/Badge.scala Badge.scala source code]]
  * 
  * [[https://shoelace.style/components/badge Shoelace Badge docs]]
  */
object Badge extends WebComponent {
  override val tagName: String = "sl-badge"

  type Ref = BadgeComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /** The badge's theme variant. */
  lazy val variant: HtmlAttr[String] = stringAttr("variant")

  /** Draws a pill-style badge with rounded edges. */
  lazy val pill: HtmlAttr[Boolean] = boolAttr("pill")

  /** Makes the badge pulsate to draw attention. */
  lazy val pulse: HtmlAttr[Boolean] = boolAttr("pulse")


  // -- Props --


  // -- Slots --

  object slots {

    /** The badge's content. Note: You can pass this element like a regular child instead of `default := element` */
    lazy val default: Slot = Slot("")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"
  }


  // -- Element type -- 

  @js.native trait BadgeComponent extends js.Object { this: dom.HTMLElement => 

    /** The badge's theme variant. */
    var variant: String

    /** Draws a pill-style badge with rounded edges. */
    var pill: Boolean

    /** Makes the badge pulsate to draw attention. */
    var pulse: Boolean
  }
}
