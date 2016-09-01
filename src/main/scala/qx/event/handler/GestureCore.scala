
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.handler {
@js.native
@JSName("qx.event.handler.GestureCore")
class GestureCore protected () extends js.Object {
    def this(target: HTMLElement = ???, emitter: qx.event.Emitter = ???) = this()
    protected def _calcAngle(): Long = js.native
    protected def _calcDistance(): Long = js.native
    protected def _fireEvent(domEvent: qx.event.`type`.Event, `type`: String, target: HTMLElement = ???): Unit = js.native
    protected def _fireRoll(domEvent: qx.event.`type`.Event, `type`: String, target: HTMLElement): Unit = js.native
    protected def _getDeltaCoordinates(domEvent: qx.event.`type`.Event): js.Dynamic = js.native
    protected def _hasIntermediaryHandler(target: HTMLElement): Boolean = js.native
    protected def _initObserver(): Unit = js.native
    protected def _isBelowTapMaxDistance(domEvent: qx.event.`type`.Event): Boolean = js.native
    protected def _onDblClick(domEvent: qx.event.`type`.Event): Unit = js.native
    protected def _stopObserver(): Unit = js.native
    def checkAndFireGesture(domEvent: qx.event.`type`.Event, `type`: String = ???, target: HTMLElement = ???): Unit = js.native
    def dispose(): Unit = js.native
    def gestureBegin(domEvent: qx.event.`type`.Event, target: HTMLElement): Unit = js.native
    def gestureCancel(id: Long): Unit = js.native
    def gestureFinish(domEvent: qx.event.`type`.Event, target: HTMLElement): Unit = js.native
    def gestureMove(domEvent: qx.event.`type`.Event, target: HTMLElement): Unit = js.native
    def isBelowTapMaxDistance(event: qx.event.`type`.Event): Boolean = js.native
    def stopMomentum(id: Int): Unit = js.native
    def updateGestureTarget(id: String, target: HTMLElement): Unit = js.native

}
}
