
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.handler {
@js.native
@JSName("qx.event.handler.Keyboard")
class Keyboard protected () extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, typ: String): Boolean = js.native
    override def registerEvent(target: js.Any, typ: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, typ: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()
    def __onKeyUpDown(domEvent: qx.event.typ.Event): Unit = js.native
    protected def _fireInputEvent(domEvent: qx.event.typ.Event, charCode: Int): Unit = js.native
    protected def _fireSequenceEvent(domEvent: qx.event.typ.Event, typ: String, keyIdentifier: String): Unit = js.native
    protected def _idealKeyHandler(keyCode: String, charCode: String, eventType: String, domEvent: HTMLElement): Unit = js.native
    protected def _identifierToKeyCode(keyIdentifier: String): Int = js.native
    protected def _initKeyObserver(): Unit = js.native
    protected def _stopKeyObserver(): Unit = js.native

}
}
