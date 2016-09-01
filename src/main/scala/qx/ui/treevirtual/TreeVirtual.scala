
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.TreeVirtual")
class TreeVirtual protected () extends qx.ui.table.Table {
    def this(headings: js.Array[js.Any] = ???, custom: js.Any = ???) = this()
    protected def _calculateSelectedNodes(): js.Array[js.Any] = js.native
    def getAlwaysShowOpenCloseSymbol(): Boolean = js.native
    def getDataModel(): qx.ui.table.ITableModel = js.native
    def getExcludeFirstLevelTreeLines(): Boolean = js.native
    def getHierarchy(nodeReference: js.Any): js.Array[js.Any] = js.native
    def getOpenCloseClickSelectsRow(): Boolean = js.native
    def getSelectedNodes(): js.Array[js.Any] = js.native
    def getSelectionMode(): Int = js.native
    def getUseTreeLines(): Boolean = js.native
    protected def initOpenCloseClickSelectsRow(value: Boolean): Boolean = js.native
    def isOpenCloseClickSelectsRow(): Boolean = js.native
    def resetOpenCloseClickSelectsRow(): Unit = js.native
    def setAlwaysShowOpenCloseSymbol(b: Boolean): Unit = js.native
    def setExcludeFirstLevelTreeLines(b: Boolean): Unit = js.native
    def setOpenCloseClickSelectsRow(value: Boolean): Boolean = js.native
    def setOverflow(s: String): Unit = js.native
    def setSelectionMode(mode: Int): Unit = js.native
    def setUseTreeLines(b: Boolean): Unit = js.native
    def toggleOpenCloseClickSelectsRow(): Boolean = js.native

}
}
