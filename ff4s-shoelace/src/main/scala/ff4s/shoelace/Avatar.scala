package ff4s.shoelace

import ff4s._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Avatars are used to represent a person or object.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/Avatar.scala Avatar.scala source code]]
  * 
  * [[https://shoelace.style/components/avatar Shoelace Avatar docs]]
  */
object Avatar extends WebComponent {
  override val tagName: String = "sl-avatar"

  type Ref = AvatarComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /** The image source to use for the avatar. */
  lazy val image: HtmlAttr[String] = stringAttr("image")

  /** A label to use to describe the avatar to assistive devices. */
  lazy val label: HtmlAttr[String] = stringAttr("label")

  /** Initials to use as a fallback when no image is available (1-2 characters max recommended). */
  lazy val initials: HtmlAttr[String] = stringAttr("initials")

  /** Indicates how the browser should load the image. */
  lazy val loading: HtmlAttr[String] = stringAttr("loading")

  /** The shape of the avatar. */
  lazy val shape: HtmlAttr[String] = stringAttr("shape")


  // -- Props --


  // -- Slots --

  object slots {

    /** The default icon to use when no image or initials are present. Works best with `<sl-icon>`. */
    lazy val icon: Slot = Slot("icon")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The container that wraps the avatar's icon. */
    lazy val icon: String = "icon"

    /** The container that wraps the avatar's initials. */
    lazy val initials: String = "initials"

    /** The avatar image. Only shown when the `image` attribute is set. */
    lazy val image: String = "image"
  }


  // -- Element type -- 

  @js.native trait AvatarComponent extends js.Object { this: dom.HTMLElement => 

    /** The image source to use for the avatar. */
    var image: String

    /** A label to use to describe the avatar to assistive devices. */
    var label: String

    /** Initials to use as a fallback when no image is available (1-2 characters max recommended). */
    var initials: String

    /** Indicates how the browser should load the image. */
    var loading: String

    /** The shape of the avatar. */
    var shape: String
  }
}
