package ff4s
package shoelace

import ff4s.codecs.*
import org.scalajs.dom

trait Button extends WebComponent {

  override def tagName = "sl-button"

  object slots {

    lazy val default: Slot = Slot("")

    /** A presentational prefix icon or similar element. */
    lazy val prefix: Slot = Slot("prefix")

    /** A presentational suffix icon or similar element. */
    lazy val suffix: Slot = Slot("suffix")
  }

}
