
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table.selection {
@js.native
@JSName("qx.ui.table.selection.Model")
class Model extends qx.core.Object {
    protected def _addSelectionInterval(fromIndex: Int, toIndex: Int): Unit = js.native
    protected def _applySelectionMode(selectionMode: js.Any, old: js.Any): Unit = js.native
    protected def _dumpRanges(): Unit = js.native
    protected def _fireChangeSelection(): Unit = js.native
    protected def _getSelectedRangeArr(): js.Array[js.Dynamic] = js.native
    protected def _resetSelection(): Unit = js.native
    protected def _setAnchorSelectionIndex(index: Int): Unit = js.native
    protected def _setLeadSelectionIndex(index: Int): Unit = js.native
    def addSelectionInterval(fromIndex: Int, toIndex: Int): Unit = js.native
    def getAnchorSelectionIndex(): Int = js.native
    def getLeadSelectionIndex(): Int = js.native
    def getSelectedCount(): Int = js.native
    def getSelectedRanges(): js.Array[js.Dynamic] = js.native
    def getSelectionMode(): js.Dynamic = js.native
    def hasBatchMode(): Boolean = js.native
    protected def initSelectionMode(value: js.Any): js.Dynamic = js.native
    def isSelectedIndex(index: Int): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def iterateSelection(iterator: js.Function, obj: js.Any = ???): Unit = js.native
    def removeSelectionInterval(fromIndex: Int, toIndex: Int): Unit = js.native
    def resetSelection(): Unit = js.native
    def resetSelectionMode(): Unit = js.native
    def setBatchMode(batchMode: Boolean): Boolean = js.native
    def setSelectionInterval(fromIndex: Int, toIndex: Int): Unit = js.native
    def setSelectionMode(value: js.Any): js.Dynamic = js.native

}
}
