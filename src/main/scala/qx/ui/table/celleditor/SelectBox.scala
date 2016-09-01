
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table.celleditor {
@js.native
@JSName("qx.ui.table.celleditor.SelectBox")
class SelectBox extends qx.core.Object with qx.ui.table.ICellEditorFactory {
    override def createCellEditor(cellInfo: js.Any): qx.ui.core.Widget = js.native
    override def getCellEditorValue(cellEditor: qx.ui.core.Widget): js.Dynamic = js.native
    def getListData(): js.Array[js.Any] = js.native
    def getValidationFunction(): js.Function = js.native
    protected def initListData(value: js.Array[js.Any]): js.Array[js.Any] = js.native
    protected def initValidationFunction(value: js.Function): js.Function = js.native
    def resetListData(): Unit = js.native
    def resetValidationFunction(): Unit = js.native
    def setListData(value: js.Array[js.Any]): js.Array[js.Any] = js.native
    def setValidationFunction(value: js.Function): js.Function = js.native

}
}
