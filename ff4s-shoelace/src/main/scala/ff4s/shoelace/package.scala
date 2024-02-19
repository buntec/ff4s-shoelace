package ff4s

import ff4s.codecs._

import scalajs.js

package object shoelace {

  def asIsProp[V](name: String) = HtmlProp[V, V](name, AsIsCodec())
  def intProp(name: String) = HtmlProp(name, IntAsIsCodec)
  def stringProp(name: String) = HtmlProp(name, StringAsIsCodec)
  def boolProp(name: String) = HtmlProp(name, BooleanAsIsCodec)
  def htmlProp(name: String) = HtmlProp[js.Any, js.Any](name, AsIsCodec())

  def stringAttr(name: String) = HtmlAttr(name, StringAsIsCodec)
  def boolAttr(name: String) = HtmlAttr(name, BooleanAsAttrPresenceCodec)
  def intAttr(name: String) = HtmlAttr(name, IntAsStringCodec)

}
