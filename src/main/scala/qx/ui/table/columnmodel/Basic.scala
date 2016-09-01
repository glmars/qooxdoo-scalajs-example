
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table.columnmodel {
@js.native
@JSName("qx.ui.table.columnmodel.Basic")
class Basic extends qx.core.Object {
    protected def _getColToXPosMap(): js.Dynamic = js.native
    def getCellEditorFactory(col: Int): qx.ui.table.ICellEditorFactory = js.native
    def getColumnWidth(col: Int): Int = js.native
    def getDataCellRenderer(col: Int): qx.ui.table.ICellRenderer = js.native
    def getHeaderCellRenderer(col: Int): qx.ui.table.IHeaderRenderer = js.native
    def getOverallColumnAtX(overXPos: Int): Int = js.native
    def getOverallColumnCount(): Int = js.native
    def getOverallX(col: Int): Int = js.native
    def getVisibleColumnAtX(visXPos: Int): Int = js.native
    def getVisibleColumnCount(): Int = js.native
    def getVisibleColumns(): js.Array[js.Any] = js.native
    def getVisibleX(col: Int): Int = js.native
    def init(colCount: Int, table: qx.ui.table.Table): Unit = js.native
    def isColumnVisible(col: Int): Boolean = js.native
    def moveColumn(fromOverXPos: Int, toOverXPos: Int): Unit = js.native
    def setCellEditorFactory(col: Int, factory: qx.ui.table.ICellEditorFactory): Unit = js.native
    def setColumnsOrder(newPositions: js.Array[Int]): Unit = js.native
    def setColumnVisible(col: Int, visible: Boolean): Unit = js.native
    def setColumnWidth(col: Int, width: Int, isPointerAction: Boolean): Unit = js.native
    def setDataCellRenderer(col: Int, renderer: qx.ui.table.ICellRenderer): qx.ui.table.ICellRenderer = js.native
    def setHeaderCellRenderer(col: Int, renderer: qx.ui.table.IHeaderRenderer): Unit = js.native

}
}
