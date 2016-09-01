
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table.columnmodel.resizebehavior {
@js.native
@JSName("qx.ui.table.columnmodel.resizebehavior.Default")
class Default extends qx.ui.table.columnmodel.resizebehavior.Abstract {
    protected def _computeColumnsFlexWidth(): Unit = js.native
    protected def _extendLastColumn(event: qx.event.`type`.Data): Unit = js.native
    protected def _extendNextColumn(event: qx.event.`type`.Data): Unit = js.native
    protected def _getResizeColumnData(): js.Array[qx.ui.core.ColumnData] = js.native
    def getInitializeWidthsOnEveryAppear(): Boolean = js.native
    def getLayoutChildren(): js.Array[qx.ui.core.ColumnData] = js.native
    def getNewResizeBehaviorColumnData(): js.Function = js.native
    def getTableColumnModel(): qx.ui.table.columnmodel.Resize = js.native
    protected def initInitializeWidthsOnEveryAppear(value: Boolean): Boolean = js.native
    protected def initNewResizeBehaviorColumnData(value: js.Function): js.Function = js.native
    protected def initTableColumnModel(value: qx.ui.table.columnmodel.Resize): qx.ui.table.columnmodel.Resize = js.native
    def isInitializeWidthsOnEveryAppear(): Boolean = js.native
    def resetInitializeWidthsOnEveryAppear(): Unit = js.native
    def resetNewResizeBehaviorColumnData(): Unit = js.native
    def resetTableColumnModel(): Unit = js.native
    def set(col: Int, map: js.Any): Unit = js.native
    def setInitializeWidthsOnEveryAppear(value: Boolean): Boolean = js.native
    def setMaxWidth(col: Int, width: Int): Unit = js.native
    def setMinWidth(col: Int, width: Int): Unit = js.native
    def setNewResizeBehaviorColumnData(value: js.Function): js.Function = js.native
    def setTableColumnModel(value: qx.ui.table.columnmodel.Resize): qx.ui.table.columnmodel.Resize = js.native
    def setWidth(col: Int, width: Int, flex: Int = ???): Unit = js.native
    def toggleInitializeWidthsOnEveryAppear(): Boolean = js.native

}
}
