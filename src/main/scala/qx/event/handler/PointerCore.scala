
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.handler {
@js.native
@JSName("qx.event.handler.PointerCore")
class PointerCore protected () extends js.Object {
    def this(target: HTMLElement = ???, emitter: qx.event.Emitter = ???) = this()
    protected def _determineActiveTouches(typ: String, changedTouches: js.Array[js.Any]): Unit = js.native
    protected def _fireEvent(domEvent: qx.event.typ.Event, typ: String = ???, target: HTMLElement = ???): Unit = js.native
    protected def _initObserver(callback: js.Function, useEmitter: Boolean): Unit = js.native
    protected def _initPointerObserver(): Unit = js.native
    protected def _isSimulatedMouseEvent(x: Int, y: Int): Boolean = js.native
    protected def _onMouseEvent(domEvent: qx.event.typ.Event): Unit = js.native
    protected def _onPointerEvent(domEvent: qx.event.typ.Event): Unit = js.native
    protected def _onTouchEvent(domEvent: qx.event.typ.Event): Unit = js.native
    protected def _stopObserver(): Unit = js.native
    def dispose(): Unit = js.native

}
}
