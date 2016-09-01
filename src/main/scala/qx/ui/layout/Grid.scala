
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Grid")
class Grid protected () extends qx.ui.layout.Abstract {
    def this(spacingX: Int = ???, spacingY: Int = ???) = this()
    protected def _fixHeightsRowSpan(rowHeights: js.Array[js.Any]): Unit = js.native
    protected def _fixWidthsColSpan(colWidths: js.Array[js.Any]): Unit = js.native
    protected def _getColumnFlexOffsets(width: Int): js.Array[Int] = js.native
    protected def _getColWidths(): js.Array[js.Dynamic] = js.native
    protected def _getRowFlexOffsets(height: Int): js.Array[Int] = js.native
    protected def _getRowHeights(): js.Array[js.Dynamic] = js.native
    protected def _setColumnData(column: Int, key: String, value: js.Any): Unit = js.native
    protected def _setRowData(row: Int, key: String, value: js.Any): Unit = js.native
    def getCellAlign(row: Int, column: Int): js.Dynamic = js.native
    def getCellWidget(row: Int, column: Int): qx.ui.core.Widget = js.native
    def getColumnAlign(column: Int): js.Dynamic = js.native
    def getColumnCount(): Int = js.native
    def getColumnFlex(column: Int): Int = js.native
    def getColumnMaxWidth(column: Int): Int = js.native
    def getColumnMinWidth(column: Int): Int = js.native
    def getColumnWidth(column: Int): Int = js.native
    def getRowAlign(row: Int): js.Dynamic = js.native
    def getRowCount(): Int = js.native
    def getRowFlex(row: Int): Int = js.native
    def getRowHeight(row: Int): Int = js.native
    def getRowMaxHeight(row: Int): Int = js.native
    def getRowMinHeight(row: Int): Int = js.native
    def getSpacingX(): Int = js.native
    def getSpacingY(): Int = js.native
    protected def initSpacingX(value: Int): Int = js.native
    protected def initSpacingY(value: Int): Int = js.native
    def resetSpacingX(): Unit = js.native
    def resetSpacingY(): Unit = js.native
    def setColumnAlign(column: Int, hAlign: String, vAlign: String): qx.ui.layout.Grid = js.native
    def setColumnFlex(column: Int, flex: Int): qx.ui.layout.Grid = js.native
    def setColumnMaxWidth(column: Int, maxWidth: Int): qx.ui.layout.Grid = js.native
    def setColumnMinWidth(column: Int, minWidth: Int): qx.ui.layout.Grid = js.native
    def setColumnWidth(column: Int, width: Int): qx.ui.layout.Grid = js.native
    def setRowAlign(row: Int, hAlign: String, vAlign: String): qx.ui.layout.Grid = js.native
    def setRowFlex(row: Int, flex: Int): qx.ui.layout.Grid = js.native
    def setRowHeight(row: Int, height: Int): qx.ui.layout.Grid = js.native
    def setRowMaxHeight(row: Int, maxHeight: Int): qx.ui.layout.Grid = js.native
    def setRowMinHeight(row: Int, minHeight: Int): qx.ui.layout.Grid = js.native
    def setSpacing(spacing: Int): qx.ui.layout.Grid = js.native
    def setSpacingX(value: Int): Int = js.native
    def setSpacingY(value: Int): Int = js.native

}
}
