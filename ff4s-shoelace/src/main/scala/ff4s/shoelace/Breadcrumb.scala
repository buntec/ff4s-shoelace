package ff4s.shoelace

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Breadcrumbs provide a group of links so users can easily navigate a website's hierarchy.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/Breadcrumb.scala Breadcrumb.scala source code]]
  * 
  * [[https://shoelace.style/components/breadcrumb Shoelace Breadcrumb docs]]
  */
object Breadcrumb extends WebComponent {
  override val tagName: String = "sl-breadcrumb"

  type Ref = BreadcrumbComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /**
    * The label to use for the breadcrumb control. This will not be shown on the screen, but it will be announced by
    * screen readers and other assistive devices to provide more context for users.
    */
  lazy val label: HtmlAttr[String] = stringAttr("label")


  // -- Props --


  // -- Slots --

  object slots {

    /** One or more breadcrumb items to display. Note: You can pass this element like a regular child instead of `default := element` */
    lazy val default: Slot = Slot("")

    /** The separator to use between breadcrumb items. Works best with `<sl-icon>`. */
    lazy val separator: Slot = Slot("separator")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"
  }


  // -- Element type -- 

  @js.native trait BreadcrumbComponent extends js.Object { this: dom.HTMLElement => 

    /**
      * The label to use for the breadcrumb control. This will not be shown on the screen, but it will be announced by
      * screen readers and other assistive devices to provide more context for users.
      */
    var label: String
  }
}
