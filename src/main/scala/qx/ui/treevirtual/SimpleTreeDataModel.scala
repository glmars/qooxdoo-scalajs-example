
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.SimpleTreeDataModel")
class SimpleTreeDataModel extends qx.ui.table.model.Abstract with qx.ui.treevirtual.MTreePrimitive {
    protected def _applyFilter(value: js.Function, old: js.Function): Unit = js.native
    protected def _clearSelections(): Unit = js.native
    def addBranch(parentNodeId: Int, label: String, bOpened: Boolean, bHideOpenCloseButton: Boolean, icon: String, iconSelected: String): Int = js.native
    def addLeaf(parentNodeId: Int, label: String, icon: String, iconSelected: String): Int = js.native
    def clearData(): Unit = js.native
    def getColumnData(nodeId: Int, columnIndex: Int): js.Dynamic = js.native
    def getData(): js.Array[js.Any] = js.native
    def getFilter(): js.Function = js.native
    def getNode(rowIndex: Int): js.Dynamic = js.native
    def getNodeFromRow(rowIndex: Int): js.Dynamic = js.native
    def getNodeRowMap(): js.Array[js.Any] = js.native
    def getRowFromNodeId(nodeId: Int): Int = js.native
    def getSelectedNodes(): js.Array[js.Any] = js.native
    def getTree(): qx.ui.treevirtual.TreeVirtual = js.native
    def getTreeColumn(): Int = js.native
    protected def initFilter(value: js.Function): js.Function = js.native
    def move(moveNodeReference: js.Any, parentNodeReference: js.Any): Unit = js.native
    def prune(nodeReference: js.Any, bSelfAlso: Boolean): Unit = js.native
    def resetFilter(): Unit = js.native
    def setColumnData(nodeId: Int, columnIndex: Int, data: js.Any): Unit = js.native
    def setColumnEditable(columnIndex: Int, editable: Boolean): Unit = js.native
    def setData(nodeArr: js.Array[js.Any]): Unit = js.native
    def setEditable(editable: Boolean): Unit = js.native
    def setFilter(value: js.Function): js.Function = js.native
    def setState(nodeReference: js.Any, attributes: js.Any): Unit = js.native
    def setTree(tree: qx.ui.treevirtual.TreeVirtual): Unit = js.native
    def setTreeColumn(columnIndex: Int): Unit = js.native

}
}
