
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table {
@js.native
trait ITableModel extends js.Object {
    def getColumnCount(): Int
    def getColumnId(columnIndex: Int): String
    def getColumnIndexById(columnId: String): Int
    def getColumnName(columnIndex: Int): String
    def getRowCount(): Int
    def getRowData(rowIndex: Int): js.Dynamic
    def getSortColumnIndex(): Int
    def getValue(columnIndex: Int, rowIndex: Int): js.Dynamic
    def getValueById(columnId: String, rowIndex: Int): js.Dynamic
    def isColumnEditable(columnIndex: Int): Boolean
    def isColumnSortable(columnIndex: Int): Boolean
    def isSortAscending(): Boolean
    def prefetchRows(firstRowIndex: Int, lastRowIndex: Int): Unit
    def setValue(columnIndex: Int, rowIndex: Int, value: js.Any): Unit
    def setValueById(columnId: String, rowIndex: Int, value: js.Any): Unit
    def sortByColumn(columnIndex: Int, ascending: Boolean): Unit

}
}
