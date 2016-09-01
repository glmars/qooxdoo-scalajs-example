
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.handler {
@js.native
@JSName("qx.event.handler.Application")
class Application protected () extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, typ: String): Boolean = js.native
    override def registerEvent(target: js.Any, typ: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, typ: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()
    protected def _initObserver(): Unit = js.native
    protected def _onNativeLoad(): Unit = js.native
    protected def _onNativeUnload(): Unit = js.native
    protected def _stopObserver(): Unit = js.native
    def isApplicationReady(): Boolean = js.native

}
@js.native
@JSName("qx.event.handler.Application")
object Application extends js.Object {
    def onScriptLoaded(): Unit = js.native

}
}
