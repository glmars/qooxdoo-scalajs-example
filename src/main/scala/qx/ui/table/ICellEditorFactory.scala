
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table {
@js.native
trait ICellEditorFactory extends js.Object {
    def createCellEditor(cellInfo: js.Any): qx.ui.core.Widget
    def getCellEditorValue(cellEditor: qx.ui.core.Widget): js.Dynamic

}
}
