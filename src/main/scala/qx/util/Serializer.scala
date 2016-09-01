
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.util {
@js.native
@JSName("qx.util.Serializer")
class Serializer extends js.Object {

}
@js.native
@JSName("qx.util.Serializer")
object Serializer extends js.Object {
    def toJson(obj: qx.core.Object, qxSerializer: js.Function = ???, dateFormat: qx.util.format.DateFormat = ???): String = js.native
    def toNativeObject(obj: qx.core.Object, qxSerializer: js.Function = ???, dateFormat: qx.util.format.DateFormat = ???): String = js.native
    def toUriParameter(obj: qx.core.Object, qxSerializer: js.Function = ???, dateFormat: qx.util.format.DateFormat = ???): String = js.native

}
}
