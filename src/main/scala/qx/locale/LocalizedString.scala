
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.locale {
@js.native
@JSName("qx.locale.LocalizedString")
class LocalizedString protected () extends qx.typ.BaseString {
    def this(translation: String = ???, messageId: String = ???, args: js.Array[js.Any] = ???) = this()
    def getMessageId(): String = js.native
    def translate(): qx.locale.LocalizedString = js.native

}
}
