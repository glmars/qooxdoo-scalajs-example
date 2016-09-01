
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.Abstract")
class Abstract extends qx.core.Object {
    protected def _getCellExtras(cellInfo: js.Any): String = js.native
    protected def _getCellStyle(cellInfo: js.Any): String = js.native
    protected def _getContentHtml(cellInfo: js.Any): String = js.native
    def render(cellInfo: js.Any): String = js.native

}
}
