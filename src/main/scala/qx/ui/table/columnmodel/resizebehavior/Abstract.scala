
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table.columnmodel.resizebehavior {
@js.native
@JSName("qx.ui.table.columnmodel.resizebehavior.Abstract")
class Abstract extends qx.core.Object {
    protected def _getAvailableWidth(): Int = js.native
    protected def _setNumColumns(numColumns: Int): Unit = js.native
    def onAppear(event: js.Any, forceRefresh: Boolean = ???): Unit = js.native
    def onColumnWidthChanged(event: js.Any): Unit = js.native
    def onTableWidthChanged(event: js.Any): Unit = js.native
    def onVerticalScrollBarChanged(event: js.Any): Unit = js.native
    def onVisibilityChanged(event: js.Any): Unit = js.native

}
}
