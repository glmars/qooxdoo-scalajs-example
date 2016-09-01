
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table.model {
@js.native
@JSName("qx.ui.table.model.Abstract")
class Abstract extends qx.core.Object with qx.ui.table.ITableModel {
    override def getColumnCount(): Int = js.native
    override def getColumnId(columnIndex: Int): String = js.native
    override def getColumnIndexById(columnId: String): Int = js.native
    override def getColumnName(columnIndex: Int): String = js.native
    override def getRowCount(): Int = js.native
    override def getRowData(rowIndex: Int): js.Dynamic = js.native
    override def getSortColumnIndex(): Int = js.native
    override def getValue(columnIndex: Int, rowIndex: Int): js.Dynamic = js.native
    override def getValueById(columnId: String, rowIndex: Int): js.Dynamic = js.native
    override def isColumnEditable(columnIndex: Int): Boolean = js.native
    override def isColumnSortable(columnIndex: Int): Boolean = js.native
    override def isSortAscending(): Boolean = js.native
    override def prefetchRows(firstRowIndex: Int, lastRowIndex: Int): Unit = js.native
    override def setValue(columnIndex: Int, rowIndex: Int, value: js.Any): Unit = js.native
    override def setValueById(columnId: String, rowIndex: Int, value: js.Any): Unit = js.native
    override def sortByColumn(columnIndex: Int, ascending: Boolean): Unit = js.native
    def init(table: qx.ui.table.Table): Unit = js.native
    def setColumnIds(columnIdArr: js.Array[String]): Unit = js.native
    def setColumnNamesById(columnNameMap: js.Any): Unit = js.native
    def setColumnNamesByIndex(columnNameArr: js.Array[String]): Unit = js.native
    def setColumns(columnNameArr: js.Array[String], columnIdArr: js.Array[String] = ???): Unit = js.native

}
}
