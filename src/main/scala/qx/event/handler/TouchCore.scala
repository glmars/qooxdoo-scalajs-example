
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.handler {
@js.native
@JSName("qx.event.handler.TouchCore")
class TouchCore protected () extends js.Object {
    def this(target: HTMLElement = ???, emitter: qx.event.Emitter = ???) = this()
    protected def _calcSingleTouchDelta(touch: qx.event.`type`.Event): js.Dynamic = js.native
    protected def _calcTouchesDelta(touches: js.Array[js.Any]): js.Array[js.Any] = js.native
    protected def _commonTouchEventHandler(domEvent: qx.event.`type`.Event, `type`: String = ???): Unit = js.native
    protected def _detectTouchesByPointer(domEvent: qx.event.`type`.Event, `type`: String = ???): js.Array[js.Any] = js.native
    protected def _fireEvent(domEvent: qx.event.`type`.Event, `type`: String = ???, target: HTMLElement = ???): Unit = js.native
    protected def _getRotationAngle(touch0: qx.event.`type`.Event, touch1: qx.event.`type`.Event): Long = js.native
    protected def _getScalingDistance(touch0: qx.event.`type`.Event, touch1: qx.event.`type`.Event): Long = js.native
    protected def _getTarget(domEvent: qx.event.`type`.Event): HTMLElement = js.native
    protected def _initTouchObserver(): Unit = js.native
    protected def _mapPointerEvent(`type`: String): String = js.native
    protected def _onTouchEvent(domEvent: qx.event.`type`.Event): Unit = js.native
    protected def _stopTouchObserver(): Unit = js.native
    def dispose(): Unit = js.native

}
}
