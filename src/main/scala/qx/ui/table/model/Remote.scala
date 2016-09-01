
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table.model {
@js.native
@JSName("qx.ui.table.model.Remote")
class Remote extends qx.ui.table.model.Abstract {
    protected def _cancelCurrentRequest(): Boolean = js.native
    protected def _getIgnoreCurrentRequest(): Boolean = js.native
    protected def _loadRowCount(): Unit = js.native
    protected def _loadRowData(firstRow: Int, lastRow: Int): Unit = js.native
    protected def _onRowCountLoaded(rowCount: Int): Unit = js.native
    protected def _onRowDataLoaded(rowDataArr: js.Array[js.Any]): Unit = js.native
    protected def _setRowBlockData(block: Int, rowDataArr: js.Array[js.Any]): Unit = js.native
    def clearCache(): Unit = js.native
    def getBlockConcurrentLoadRowCount(): Boolean = js.native
    def getBlockSize(): Int = js.native
    def getCacheContent(): js.Dynamic = js.native
    def getClearCacheOnRemove(): Boolean = js.native
    def getMaxCachedBlockCount(): Int = js.native
    protected def initBlockConcurrentLoadRowCount(value: Boolean): Boolean = js.native
    protected def initBlockSize(value: Int): Int = js.native
    protected def initClearCacheOnRemove(value: Boolean): Boolean = js.native
    protected def initMaxCachedBlockCount(value: Int): Int = js.native
    def isBlockConcurrentLoadRowCount(): Boolean = js.native
    def isClearCacheOnRemove(): Boolean = js.native
    def iterateCachedRows(iterator: js.Function, obj: js.Any): Unit = js.native
    def reloadData(): Unit = js.native
    def removeRow(rowIndex: Int): Unit = js.native
    def resetBlockConcurrentLoadRowCount(): Unit = js.native
    def resetBlockSize(): Unit = js.native
    def resetClearCacheOnRemove(): Unit = js.native
    def resetMaxCachedBlockCount(): Unit = js.native
    def restoreCacheContent(cacheContent: js.Any): Unit = js.native
    def setBlockConcurrentLoadRowCount(value: Boolean): Boolean = js.native
    def setBlockSize(value: Int): Int = js.native
    def setClearCacheOnRemove(value: Boolean): Boolean = js.native
    def setColumnEditable(columnIndex: Int, editable: Boolean): Unit = js.native
    def setColumnSortable(columnIndex: Int, sortable: Boolean): Unit = js.native
    def setEditable(editable: Boolean): Unit = js.native
    def setMaxCachedBlockCount(value: Int): Int = js.native
    def setSortAscendingWithoutSortingData(sortAscending: Boolean): Unit = js.native
    def setSortColumnIndexWithoutSortingData(sortColumnIndex: Int): Unit = js.native
    def toggleBlockConcurrentLoadRowCount(): Boolean = js.native
    def toggleClearCacheOnRemove(): Boolean = js.native

}
}
