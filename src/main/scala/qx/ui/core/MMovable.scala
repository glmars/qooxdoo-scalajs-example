
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.core {
@js.native
@JSName("qx.ui.core.MMovable")
trait MMovable extends js.Object {
    protected def _activateMoveHandle(widget: qx.ui.core.Widget): Unit = js.native
    protected def _onMovePointerDown(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onMovePointerMove(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onMovePointerUp(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onMoveRoll(e: qx.event.`type`.Roll): Unit = js.native
    def getMovable(): Boolean = js.native
    def getUseMoveFrame(): Boolean = js.native
    protected def initMovable(value: Boolean): Boolean = js.native
    protected def initUseMoveFrame(value: Boolean): Boolean = js.native
    def isMovable(): Boolean = js.native
    def isUseMoveFrame(): Boolean = js.native
    def resetMovable(): Unit = js.native
    def resetUseMoveFrame(): Unit = js.native
    def setMovable(value: Boolean): Boolean = js.native
    def setUseMoveFrame(value: Boolean): Boolean = js.native
    def toggleMovable(): Boolean = js.native
    def toggleUseMoveFrame(): Boolean = js.native

}
}
