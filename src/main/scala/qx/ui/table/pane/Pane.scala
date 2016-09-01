
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.Pane")
class Pane protected () extends qx.ui.core.Widget {
    def this(paneScroller: qx.ui.table.pane.Scroller = ???) = this()
    protected def _applyFirstVisibleRow(value: Long, old: Long): Unit = js.native
    protected def _applyMaxCacheLines(value: Long, old: Long): Unit = js.native
    protected def _applyVisibleRowCount(value: Long, old: Long): Unit = js.native
    protected def _getRowsHtml(firstRow: Int, rowCount: Int): String = js.native
    protected def _scrollContent(rowOffset: Int): Unit = js.native
    protected def _updateAllRows(): Unit = js.native
    protected def _updateRowStyles(onlyRow: Int = ???): Unit = js.native
    def getFirstVisibleRow(): Long = js.native
    def getMaxCacheLines(): Long = js.native
    def getPaneScroller(): qx.ui.table.pane.Scroller = js.native
    def getTable(): qx.ui.table.Table = js.native
    def getVisibleRowCount(): Long = js.native
    protected def initFirstVisibleRow(value: Long): Long = js.native
    protected def initMaxCacheLines(value: Long): Long = js.native
    protected def initVisibleRowCount(value: Long): Long = js.native
    def onColOrderChanged(): Unit = js.native
    def onFocusChanged(): Unit = js.native
    def onPaneModelChanged(): Unit = js.native
    def onSelectionChanged(): Unit = js.native
    def onTableModelDataChanged(firstRow: Int, lastRow: Int, firstColumn: Int, lastColumn: Int): Unit = js.native
    def onTableModelMetaDataChanged(): Unit = js.native
    def resetFirstVisibleRow(): Unit = js.native
    def resetMaxCacheLines(): Unit = js.native
    def resetVisibleRowCount(): Unit = js.native
    def setColumnWidth(col: Int, width: Int): Unit = js.native
    def setFirstVisibleRow(value: Long): Long = js.native
    def setFocusedCell(col: Int = ???, row: Int = ???, massUpdate: Boolean = ???): Unit = js.native
    def setMaxCacheLines(value: Long): Long = js.native
    def setVisibleRowCount(value: Long): Long = js.native
    def updateContent(completeUpdate: Boolean = ???, scrollOffset: Int = ???, onlyRow: Int = ???, onlySelectionOrFocusChanged: Boolean = ???): Unit = js.native

}
}
