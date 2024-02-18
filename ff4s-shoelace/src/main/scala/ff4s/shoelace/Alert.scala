package ff4s.shoelace

import ff4s._
import ff4s.codecs._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Alerts are used to display important messages inline or as toast notifications.
  * 
  * [[https://github.com/buntec/ff4s-shoelace/blob/master/ff4s-shoelace/src/main/scala/ff4s/shoelace/Alert.scala Alert.scala source code]]
  * 
  * [[https://shoelace.style/components/alert Shoelace Alert docs]]
  */
object Alert extends WebComponent {
  override val tagName: String = "sl-alert"

  type Ref = AlertComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the alert opens. */
  lazy val onShow: EventProp[dom.Event] = EventProp[dom.Event]("sl-show")

  /** Emitted after the alert opens and all animations are complete. */
  lazy val onAfterShow: EventProp[dom.Event] = EventProp[dom.Event]("sl-after-show")

  /** Emitted when the alert closes. */
  lazy val onHide: EventProp[dom.Event] = EventProp[dom.Event]("sl-hide")

  /** Emitted after the alert closes and all animations are complete. */
  lazy val onAfterHide: EventProp[dom.Event] = EventProp[dom.Event]("sl-after-hide")


  // -- Attributes --

  /**
    * Indicates whether or not the alert is open. You can toggle this attribute to show and hide the alert, or you can
    * use the `show()` and `hide()` methods and this attribute will reflect the alert's open state.
    */
  lazy val open: HtmlAttr[Boolean] = boolAttr("open")

  /** Enables a close button that allows the user to dismiss the alert. */
  lazy val closable: HtmlAttr[Boolean] = boolAttr("closable")

  /** The alert's theme variant. */
  lazy val variant: HtmlAttr[String] = stringAttr("variant")

  /**
    * The length of time, in milliseconds, the alert will show before closing itself. If the user interacts with
    * the alert before it closes (e.g. moves the mouse over it), the timer will restart. Defaults to `Infinity`, meaning
    * the alert will not close on its own.
    */
  lazy val duration: HtmlAttr[Int] = intAttr("duration")


  // -- Props --


  // -- Slots --

  object slots {

    /** The alert's main content. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")

    /** An icon to show in the alert. Works best with `<sl-icon>`. */
    lazy val icon: Slot = Slot("icon")
  }




  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The container that wraps the optional icon. */
    lazy val icon: String = "icon"

    /** The container that wraps the alert's main content. */
    lazy val message: String = "message"

    /** The close button, an `<sl-icon-button>`. */
    lazy val closeButton: String = "close-button"

    /** The close button's exported `base` part. */
    lazy val closeButton__base: String = "close-button__base"
  }


  // -- Element type -- 

  @js.native trait AlertComponent extends js.Object { this: dom.HTMLElement => 

    /**
      * Indicates whether or not the alert is open. You can toggle this attribute to show and hide the alert, or you can
      * use the `show()` and `hide()` methods and this attribute will reflect the alert's open state.
      */
    var open: Boolean

    /** Enables a close button that allows the user to dismiss the alert. */
    var closable: Boolean

    /** The alert's theme variant. */
    var variant: String

    /**
      * The length of time, in milliseconds, the alert will show before closing itself. If the user interacts with
      * the alert before it closes (e.g. moves the mouse over it), the timer will restart. Defaults to `Infinity`, meaning
      * the alert will not close on its own.
      */
    var duration: Int
  }
}
