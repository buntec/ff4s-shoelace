package ff4s.shoelace

// format: off

import ff4s._
import ff4s.shoelace.EventTypes.*
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Carousels display an arbitrary number of content slides along a horizontal or vertical axis.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/Carousel.scala Carousel.scala source code]]
  */
object Carousel extends WebComponent {
  override val tagName: String = "sl-carousel"

  type Ref = CarouselComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the active slide changes. */
  lazy val onSlideChange: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref] with HasDetail[SlideChangeEvent]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref] with HasDetail[SlideChangeEvent]]("sl-slide-change")


  // -- Attributes --

  /** When set, allows the user to navigate the carousel in the same direction indefinitely. */
  lazy val loop: HtmlAttr[Boolean] = boolAttr("loop")

  /** When set, show the carousel's navigation. */
  lazy val navigation: HtmlAttr[Boolean] = boolAttr("navigation")

  /** When set, show the carousel's pagination indicators. */
  lazy val pagination: HtmlAttr[Boolean] = boolAttr("pagination")

  /** When set, the slides will scroll automatically when the user is not interacting with them. */
  lazy val autoplay: HtmlAttr[Boolean] = boolAttr("autoplay")

  /** Specifies the amount of time, in milliseconds, between each automatic scroll. */
  lazy val autoplayInterval: HtmlAttr[Int] = intAttr("autoplay-interval")

  /** Specifies how many slides should be shown at a given time. */
  lazy val slidesPerPage: HtmlAttr[Int] = intAttr("slides-per-page")

  /**
    * Specifies the number of slides the carousel will advance when scrolling, useful when specifying a `slides-per-page`
    * greater than one. It can't be higher than `slides-per-page`.
    */
  lazy val slidesPerMove: HtmlAttr[Int] = intAttr("slides-per-move")

  /** Specifies the orientation in which the carousel will lay out. */
  lazy val orientation: HtmlAttr[String] = stringAttr("orientation")

  /** When set, it is possible to scroll through the slides by dragging them with the mouse. */
  lazy val mouseDragging: HtmlAttr[Boolean] = boolAttr("mouse-dragging")


  // -- Props --

  lazy val scrolling: HtmlProp[Boolean, _] = boolProp("scrolling")

  lazy val dragging: HtmlProp[Boolean, _] = boolProp("dragging")


  // -- Slots --

  object slots {

    /** The carousel's main content, one or more `<sl-carousel-item>` elements. Note: You can pass this element like a regular child instead of `default := element` */
    lazy val default: Slot = Slot("")

    /** Optional next icon to use instead of the default. Works best with `<sl-icon>`. */
    lazy val nextIcon: Slot = Slot("next-icon")

    /** Optional previous icon to use instead of the default. Works best with `<sl-icon>`. */
    lazy val previousIcon: Slot = Slot("previous-icon")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The carousel's internal wrapper. */
    lazy val base: String = "base"

    /** The scroll container that wraps the slides. */
    lazy val scrollContainer: String = "scroll-container"

    /** The pagination indicators wrapper. */
    lazy val pagination: String = "pagination"

    /** The pagination indicator. */
    lazy val paginationItem: String = "pagination-item"

    /** Applied when the item is active. */
    lazy val paginationItemActive: String = "pagination-item--active"

    /** The navigation wrapper. */
    lazy val navigation: String = "navigation"

    /** The navigation button. */
    lazy val navigationButton: String = "navigation-button"

    /** Applied to the previous button. */
    lazy val navigationButtonPrevious: String = "navigation-button--previous"

    /** Applied to the next button. */
    lazy val navigationButtonNext: String = "navigation-button--next"
  }


  // -- Element type -- 

  @js.native trait CarouselComponent extends js.Object { this: dom.HTMLElement => 

    /** When set, allows the user to navigate the carousel in the same direction indefinitely. */
    var loop: Boolean

    /** When set, show the carousel's navigation. */
    var navigation: Boolean

    /** When set, show the carousel's pagination indicators. */
    var pagination: Boolean

    /** When set, the slides will scroll automatically when the user is not interacting with them. */
    var autoplay: Boolean

    /** Specifies the amount of time, in milliseconds, between each automatic scroll. */
    var autoplayInterval: Int

    /** Specifies how many slides should be shown at a given time. */
    var slidesPerPage: Int

    /**
      * Specifies the number of slides the carousel will advance when scrolling, useful when specifying a `slides-per-page`
      * greater than one. It can't be higher than `slides-per-page`.
      */
    var slidesPerMove: Int

    /** Specifies the orientation in which the carousel will lay out. */
    var orientation: String

    /** When set, it is possible to scroll through the slides by dragging them with the mouse. */
    var mouseDragging: Boolean

    val activeSlide: Int

    var scrolling: Boolean

    var dragging: Boolean
  }
}
