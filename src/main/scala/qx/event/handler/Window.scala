
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.handler {
@js.native
@JSName("qx.event.handler.Window")
class Window protected () extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, typ: String): Boolean = js.native
    override def registerEvent(target: js.Any, typ: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, typ: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()
    protected def _initWindowObserver(): Unit = js.native
    protected def _onNative(): Unit = js.native
    protected def _stopWindowObserver(): Unit = js.native

}
}
