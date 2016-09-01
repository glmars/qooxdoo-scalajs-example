
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.Model")
class Model protected () extends qx.core.Object {
    def this(tableColumnModel: qx.ui.table.columnmodel.Basic = ???) = this()
    protected def _applyFirstColumnX(value: Int, old: Int): Unit = js.native
    protected def _applyMaxColumnCount(value: Long, old: Long): Unit = js.native
    protected def _onColVisibilityChanged(evt: js.Any): Unit = js.native
    protected def _onHeaderCellRendererChanged(evt: js.Any): Unit = js.native
    def getColumnAtX(xPos: Int): Int = js.native
    def getColumnCount(): Int = js.native
    def getColumnLeft(col: Int): js.Dynamic = js.native
    def getFirstColumnX(): Int = js.native
    def getMaxColumnCount(): Long = js.native
    def getTotalWidth(): Int = js.native
    def getX(col: Int): Int = js.native
    protected def initFirstColumnX(value: Int): Int = js.native
    protected def initMaxColumnCount(value: Long): Long = js.native
    def resetFirstColumnX(): Unit = js.native
    def resetMaxColumnCount(): Unit = js.native
    def setFirstColumnX(value: Int): Int = js.native
    def setMaxColumnCount(value: Long): Long = js.native
    def setTableColumnModel(tableColumnModel: qx.ui.table.columnmodel.Basic): Unit = js.native

}
}
