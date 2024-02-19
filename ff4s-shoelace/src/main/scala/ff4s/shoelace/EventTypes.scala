package ff4s.shoelace

// format: off

import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/** Common Shoelace event types */
object EventTypes {


  @js.native
  trait CopyEvent extends js.Object {

    val value: String
  }

  @js.native
  trait ErrorEvent extends js.Object {

    val status: Int | Unit
  }

  @js.native
  trait HoverEvent extends js.Object {

    /** 'start' | 'move' | 'end' */
    val phase: String

    val value: Int
  }

  @js.native
  trait MutationEvent extends js.Object {

    val mutationList: js.Array[dom.MutationRecord]
  }

  @js.native
  trait RequestCloseEvent extends js.Object {

    /** 'close-button' | 'keyboard' | 'overlay' */
    val source: String
  }

  @js.native
  trait ResizeEvent extends js.Object {

    val entries: js.Array[dom.ResizeObserverEntry]
  }

  @js.native
  trait SelectEvent extends js.Object {

    val item: MenuItem.Ref
  }

  @js.native
  trait SelectionChangeEvent extends js.Object {

    val selection: js.Array[TreeItem.Ref]
  }

  @js.native
  trait SlideChangeEvent extends js.Object {

    val index: Int

    val slide: CarouselItem.Ref
  }

  @js.native
  trait TabHideEvent extends js.Object {

    val name: String
  }

  @js.native
  trait TabShowEvent extends js.Object {

    val name: String
  }
}
