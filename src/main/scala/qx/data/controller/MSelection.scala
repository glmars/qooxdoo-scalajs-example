
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.data.controller {
@js.native
@JSName("qx.data.controller.MSelection")
trait MSelection extends js.Object {
    protected def _addChangeTargetListener(value: qx.ui.core.Widget, old: qx.ui.core.Widget): Unit = js.native
    protected def _applySelection(value: qx.data.Array, old: qx.data.Array): Unit = js.native
    protected def _changeTargetSelection(): Unit = js.native
    protected def _endSelectionModification(): Unit = js.native
    protected def _inSelectionModification(): Boolean = js.native
    protected def _startSelectionModification(): Unit = js.native
    protected def _updateSelection(): Unit = js.native
    def getSelection(): qx.data.Array = js.native
    protected def initSelection(value: qx.data.Array): qx.data.Array = js.native
    def resetSelection(): Unit = js.native
    def setSelection(value: qx.data.Array): qx.data.Array = js.native

}
}
