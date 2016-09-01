
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.handler {
@js.native
@JSName("qx.event.handler.DragDrop")
class DragDrop protected () extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()
    protected def _getDelta(e: qx.event.`type`.Pointer): js.Dynamic = js.native
    protected def _onKeyDown(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onKeyPress(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onKeyUp(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onLongtap(e: qx.event.`type`.Tap): Unit = js.native
    protected def _onPointerdown(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointermove(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerup(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onRoll(e: qx.event.`type`.Roll): Unit = js.native
    protected def _onWindowBlur(e: qx.event.`type`.Event): Unit = js.native
    protected def _start(e: qx.event.`type`.Pointer): Boolean = js.native
    def addAction(action: String): Unit = js.native
    def addData(`type`: String, data: js.Any): Unit = js.native
    def addType(`type`: String): Unit = js.native
    def clearSession(): Unit = js.native
    def getCurrentAction(): String = js.native
    def getCurrentType(): String = js.native
    def getCursor(): qx.ui.core.Widget = js.native
    def getData(`type`: String): js.Dynamic = js.native
    def getDragTarget(): qx.ui.core.Widget = js.native
    protected def initCursor(value: qx.ui.core.Widget): qx.ui.core.Widget = js.native
    def isSessionActive(): Boolean = js.native
    def resetCursor(): Unit = js.native
    def setCursor(value: qx.ui.core.Widget): qx.ui.core.Widget = js.native
    def setDropAllowed(isAllowed: Boolean): Unit = js.native
    def supportsAction(`type`: String): Boolean = js.native
    def supportsType(`type`: String): Boolean = js.native

}
}
