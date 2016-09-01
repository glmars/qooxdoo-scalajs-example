
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event {
@js.native
@JSName("qx.event.Manager")
class Manager protected () extends js.Object {
    def this(win: Window = ???, registration: qx.event.Registration = ???) = this()
    def addListener(target: js.Any, typ: String, listener: js.Function, self: js.Any = ???, capture: Boolean = ???): String = js.native
    def deleteAllListeners(targetKey: String): Unit = js.native
    def dispatchEvent(target: js.Any, event: qx.event.typ.Event): Boolean = js.native
    def dispose(): Unit = js.native
    def findHandler(target: js.Any, typ: String): qx.event.IEventHandler = js.native
    def getAllListeners(): js.Dynamic = js.native
    def getDispatcher(clazz: qx.Class): js.Dynamic = js.native
    def getHandler(clazz: qx.Class): js.Dynamic = js.native
    def getListeners(target: js.Any, typ: String, capture: Boolean = ???): js.Array[js.Any] = js.native
    def getWindow(): Window = js.native
    def getWindowId(): String = js.native
    def hasListener(target: js.Any, typ: String, capture: Boolean = ???): Boolean = js.native
    def importListeners(target: js.Any, list: js.Any): Unit = js.native
    def removeAllListeners(target: js.Any): Boolean = js.native
    def removeListener(target: js.Any, typ: String, listener: js.Function, self: js.Any = ???, capture: Boolean = ???): Boolean = js.native
    def removeListenerById(target: js.Any, id: String): Boolean = js.native
    def serializeListeners(target: js.Any): js.Array[js.Dynamic] = js.native
    def toggleAttachedEvents(target: js.Any, enable: Boolean): Unit = js.native

}
@js.native
@JSName("qx.event.Manager")
object Manager extends js.Object {
    def getNextUniqueId(): String = js.native

}
}
