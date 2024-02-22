package ff4s.shoelace

// format: off

import ff4s._
import ff4s.shoelace.EventTypes.*
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Ratings give users a way to quickly view and provide feedback.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/Rating.scala Rating.scala source code]]
  * 
  * [[https://shoelace.style/components/rating Shoelace Rating docs]]
  */
object Rating extends WebComponent {
  override val tagName: String = "sl-rating"

  type Ref = RatingComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the rating's value changes. */
  lazy val onChange: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-change")

  /** Emitted when the user hovers over a value. The `phase` property indicates when hovering starts, moves to a new value, or ends. The `value` property tells what the rating's value would be if the user were to commit to the hovered value. */
  lazy val onHover: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref] with HasDetail[HoverEvent]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref] with HasDetail[HoverEvent]]("sl-hover")


  // -- Attributes --

  /** A label that describes the rating to assistive devices. */
  lazy val label: HtmlAttr[String] = stringAttr("label")

  /** The current rating. */
  lazy val defaultValue: HtmlAttr[Int] = intAttr("value")

  /** The highest rating to show. */
  lazy val max: HtmlAttr[Int] = intAttr("max")

  /**
    * The precision at which the rating will increase and decrease. For example, to allow half-star ratings, set this
    * attribute to `0.5`.
    */
  lazy val precision: HtmlAttr[Int] = intAttr("precision")

  /** Makes the rating readonly. */
  lazy val readOnly: HtmlAttr[Boolean] = boolAttr("readonly")

  /** Disables the rating. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")


  // -- Props --

  /** The current rating. */
  lazy val value: HtmlProp[Int, _] = intProp("value")


  // -- Slots --

  /** This component has no slots - don't give it any children. */
  @inline def noSlots(): Unit = ()




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"
  }


  // -- Element type -- 

  @js.native trait RatingComponent extends js.Object { this: dom.HTMLElement => 

    /** A label that describes the rating to assistive devices. */
    var label: String

    /** The current rating. */
    var value: Int

    /** The highest rating to show. */
    var max: Int

    /**
      * The precision at which the rating will increase and decrease. For example, to allow half-star ratings, set this
      * attribute to `0.5`.
      */
    var precision: Int

    /** Makes the rating readonly. */
    var readonly: Boolean

    /** Disables the rating. */
    var disabled: Boolean
  }
}
