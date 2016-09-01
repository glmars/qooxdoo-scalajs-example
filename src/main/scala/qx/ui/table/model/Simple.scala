
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table.model {
@js.native
@JSName("qx.ui.table.model.Simple")
class Simple extends qx.ui.table.model.Abstract {
    protected def _mapArray2RowArr(mapArr: js.Array[js.Any], rememberMaps: Boolean = ???): js.Array[js.Dynamic] = js.native
    protected def _setSortAscending(ascending: Boolean): Unit = js.native
    protected def _setSortColumnIndex(columnIndex: Int): Unit = js.native
    def addRows(rowArr: js.Array[js.Any], startIndex: Int = ???, clearSorting: Boolean = ???): Unit = js.native
    def addRowsAsMapArray(mapArr: js.Array[js.Any], startIndex: Int = ???, rememberMaps: Boolean = ???, clearSorting: Boolean = ???): Unit = js.native
    def clearSorting(): Unit = js.native
    def getCaseSensitiveSorting(): Boolean = js.native
    def getData(): js.Array[js.Dynamic] = js.native
    def getDataAsMapArray(): js.Array[js.Dynamic] = js.native
    def getRowDataAsMap(rowIndex: Int): js.Dynamic = js.native
    def getSortMethods(columnIndex: Int): js.Dynamic = js.native
    protected def initCaseSensitiveSorting(value: Boolean): Boolean = js.native
    def isCaseSensitiveSorting(): Boolean = js.native
    def removeRows(startIndex: Int, howMany: Int, clearSorting: Boolean = ???): Unit = js.native
    def resetCaseSensitiveSorting(): Unit = js.native
    def setCaseSensitiveSorting(value: Boolean): Boolean = js.native
    def setColumnEditable(columnIndex: Int, editable: Boolean): Unit = js.native
    def setColumnSortable(columnIndex: Int, sortable: Boolean): Unit = js.native
    def setData(rowArr: js.Array[js.Any], clearSorting: Boolean = ???): Unit = js.native
    def setDataAsMapArray(mapArr: js.Array[js.Any], rememberMaps: Boolean = ???, clearSorting: Boolean = ???): Unit = js.native
    def setEditable(editable: Boolean): Unit = js.native
    def setRows(rowArr: js.Array[js.Any], startIndex: Int = ???, clearSorting: Boolean = ???): Unit = js.native
    def setRowsAsMapArray(mapArr: js.Array[js.Any], startIndex: Int = ???, rememberMaps: Boolean = ???, clearSorting: Boolean = ???): Unit = js.native
    def setSortMethods(columnIndex: Int, compare: js.Function): Unit = js.native
    def toggleCaseSensitiveSorting(): Boolean = js.native

}
@js.native
@JSName("qx.ui.table.model.Simple")
object Simple extends js.Object {
    protected def _defaultSortComparatorAscending(row1: js.Any, row2: js.Any): Int = js.native
    protected def _defaultSortComparatorDescending(row1: js.Any, row2: js.Any): Int = js.native
    protected def _defaultSortComparatorInsensitiveAscending(row1: js.Any, row2: js.Any): Int = js.native
    protected def _defaultSortComparatorInsensitiveDescending(row1: js.Any, row2: js.Any): Int = js.native

}
}
