package ff4s.shoelace

import ff4s._
import ff4s.shoelace.EventTypes.*
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * A component for displaying animated GIFs and WEBPs that play and pause on interaction.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/AnimatedImage.scala AnimatedImage.scala source code]]
  * 
  * [[https://shoelace.style/components/animated-image Shoelace AnimatedImage docs]]
  */
object AnimatedImage extends WebComponent {
  override val tagName: String = "sl-animated-image"

  type Ref = AnimatedImageComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the image loads successfully. */
  lazy val onLoad: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref]]("sl-load")

  /** Emitted when the image fails to load. */
  lazy val onError: EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref] with HasDetail[ErrorEvent]] = EventProp[ff4s.shoelace.EventWithPreciseTarget[Ref] with HasDetail[ErrorEvent]]("sl-error")


  // -- Attributes --

  /** The path to the image to load. */
  lazy val src: HtmlAttr[String] = stringAttr("src")

  /** A description of the image used by assistive devices. */
  lazy val alt: HtmlAttr[String] = stringAttr("alt")

  /** Plays the animation. When this attribute is remove, the animation will pause. */
  lazy val play: HtmlAttr[Boolean] = boolAttr("play")


  // -- Props --


  // -- Slots --

  object slots {

    /** Optional play icon to use instead of the default. Works best with `<sl-icon>`. */
    lazy val playIcon: Slot = Slot("play-icon")

    /** Optional pause icon to use instead of the default. Works best with `<sl-icon>`. */
    lazy val pauseIcon: Slot = Slot("pause-icon")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The container that surrounds the pause/play icons and provides their background. */
    lazy val controlBox: String = "control-box"
  }


  // -- Element type -- 

  @js.native trait AnimatedImageComponent extends js.Object { this: dom.HTMLElement => 

    val frozenFrame: String

    val isLoaded: Boolean

    /** The path to the image to load. */
    var src: String

    /** A description of the image used by assistive devices. */
    var alt: String

    /** Plays the animation. When this attribute is remove, the animation will pause. */
    var play: Boolean
  }
}
