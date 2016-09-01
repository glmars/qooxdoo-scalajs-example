
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.core {
@js.native
@JSName("qx.ui.core.MMultiSelectionHandling")
trait MMultiSelectionHandling extends js.Object {
    protected def _applyDragSelection(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyQuickSelection(value: Boolean, old: Boolean): Unit = js.native
    protected def _applySelectionMode(value: js.Any, old: js.Any): Unit = js.native
    protected def _getLeadItem(): qx.ui.core.Widget = js.native
    protected def _getManager(): qx.ui.core.selection.Abstract = js.native
    protected def _onSelectionChange(e: qx.event.typ.Data): Unit = js.native
    def addToSelection(item: qx.ui.core.Widget): Unit = js.native
    def getDragSelection(): Boolean = js.native
    def getQuickSelection(): Boolean = js.native
    def getSelectables(all: Boolean): js.Array[qx.ui.core.Widget] = js.native
    def getSelection(): js.Array[qx.ui.core.Widget] = js.native
    def getSelectionContext(): String = js.native
    def getSelectionMode(): js.Dynamic = js.native
    def getSortedSelection(): js.Array[qx.ui.core.Widget] = js.native
    protected def initDragSelection(value: Boolean): Boolean = js.native
    protected def initQuickSelection(value: Boolean): Boolean = js.native
    protected def initSelectionMode(value: js.Any): js.Dynamic = js.native
    def invertSelection(): Unit = js.native
    def isDragSelection(): Boolean = js.native
    def isQuickSelection(): Boolean = js.native
    def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def removeFromSelection(item: qx.ui.core.Widget): Unit = js.native
    def resetDragSelection(): Unit = js.native
    def resetQuickSelection(): Unit = js.native
    def resetSelection(): Unit = js.native
    def resetSelectionMode(): Unit = js.native
    def selectAll(): Unit = js.native
    def selectRange(begin: qx.ui.core.Widget, end: qx.ui.core.Widget): Unit = js.native
    def setDragSelection(value: Boolean): Boolean = js.native
    def setQuickSelection(value: Boolean): Boolean = js.native
    def setSelection(items: js.Array[qx.ui.core.Widget]): Unit = js.native
    def setSelectionMode(value: js.Any): js.Dynamic = js.native
    def toggleDragSelection(): Boolean = js.native
    def toggleQuickSelection(): Boolean = js.native

}
}
