package ff4s
package shoelace

import ff4s.codecs.*
import org.scalajs.dom

trait Range extends WebComponent {

  override def tagName = "sl-range"

  // props
  lazy val name = HtmlAttr("name", StringAsIsCodec)
  lazy val value = HtmlAttr("value", DoubleAsStringCodec)
  lazy val label = HtmlAttr("label", StringAsIsCodec)
  lazy val min = HtmlAttr("min", DoubleAsStringCodec)
  lazy val max = HtmlAttr("max", DoubleAsStringCodec)
  lazy val tooltip = HtmlAttr("tooltip", StringAsIsCodec)

  // events
  lazy val onInput = EventProp[dom.CustomEvent]("sl-input")
  lazy val onChange = EventProp[dom.CustomEvent]("sl-change")

  // slots
  object slots {
    lazy val label = Slot("label")
    lazy val helpText = Slot("help-text")
  }

}
