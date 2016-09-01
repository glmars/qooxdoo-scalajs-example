
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.splitpane {
@js.native
@JSName("qx.ui.splitpane.Pane")
class Pane protected () extends qx.ui.core.Widget {
    def this(orientation: String = ???) = this()
    protected def _applyOffset(value: Int, old: Int): Unit = js.native
    protected def _applyOrientation(value: String, old: String): Unit = js.native
    protected def _finalizeSizes(): Unit = js.native
    protected def _isActiveDragSession(): Boolean = js.native
    protected def _onPointerDown(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onPointerMove(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onPointerOut(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onPointerUp(e: qx.event.typ.Pointer): Unit = js.native
    protected def _setLastPointerPosition(x: Int, y: Int): Unit = js.native
    def add(widget: qx.ui.core.Widget, flex: Long): Unit = js.native
    def getBlocker(): qx.ui.splitpane.Blocker = js.native
    def getChildren(): js.Array[qx.ui.core.Widget] = js.native
    def getOffset(): Int = js.native
    def getOrientation(): js.Dynamic = js.native
    protected def initOffset(value: Int): Int = js.native
    protected def initOrientation(value: js.Any): js.Dynamic = js.native
    def remove(widget: qx.ui.core.Widget): Unit = js.native
    def resetOffset(): Unit = js.native
    def resetOrientation(): Unit = js.native
    def setOffset(value: Int): Int = js.native
    def setOrientation(value: js.Any): js.Dynamic = js.native

}
}
