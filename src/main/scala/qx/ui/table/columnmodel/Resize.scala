
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table.columnmodel {
@js.native
@JSName("qx.ui.table.columnmodel.Resize")
class Resize extends qx.ui.table.columnmodel.Basic with qx.locale.MTranslation {
    protected def _addResetColumnWidthButton(event: qx.event.`type`.Data): Unit = js.native
    protected def _applyBehavior(value: qx.ui.table.columnmodel.resizebehavior.Abstract, old: qx.ui.table.columnmodel.resizebehavior.Abstract): Unit = js.native
    protected def _onappear(event: qx.event.`type`.Event): Unit = js.native
    protected def _oncolumnwidthchanged(event: qx.event.`type`.Data): Unit = js.native
    protected def _onTableWidthChanged(event: qx.event.`type`.Event): Unit = js.native
    protected def _onverticalscrollbarchanged(event: qx.event.`type`.Data): Unit = js.native
    protected def _onvisibilitychanged(event: qx.event.`type`.Data): Unit = js.native
    def getBehavior(): qx.ui.table.columnmodel.resizebehavior.Abstract = js.native
    def getTable(): qx.ui.table.Table = js.native
    protected def initBehavior(value: qx.ui.table.columnmodel.resizebehavior.Abstract): qx.ui.table.columnmodel.resizebehavior.Abstract = js.native
    def resetBehavior(): Unit = js.native
    def setBehavior(value: qx.ui.table.columnmodel.resizebehavior.Abstract): qx.ui.table.columnmodel.resizebehavior.Abstract = js.native

}
}
