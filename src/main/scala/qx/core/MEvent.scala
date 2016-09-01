
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.core {
@js.native
@JSName("qx.core.MEvent")
trait MEvent extends js.Object {
    def addListener(`type`: String, listener: js.Function, self: js.Any = ???, capture: Boolean = ???): String = js.native
    def addListenerOnce(`type`: String, listener: js.Function, self: js.Any = ???, capture: Boolean = ???): String = js.native
    def dispatchEvent(evt: qx.event.`type`.Event): Boolean = js.native
    def fireDataEvent(`type`: String, data: js.Any, oldData: js.Any = ???, cancelable: Boolean = ???): Boolean = js.native
    def fireEvent(`type`: String, clazz: qx.Class = ???, args: js.Array[js.Any] = ???): Boolean = js.native
    def fireNonBubblingEvent(`type`: String, clazz: qx.Class = ???, args: js.Array[js.Any] = ???): Boolean = js.native
    def hasListener(`type`: String, capture: Boolean = ???): Boolean = js.native
    def removeListener(`type`: String, listener: js.Function, self: js.Any = ???, capture: Boolean = ???): Boolean = js.native
    def removeListenerById(id: String): Boolean = js.native

}
}
