
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table.celleditor {
@js.native
@JSName("qx.ui.table.celleditor.Dynamic")
class Dynamic protected () extends qx.core.Object with qx.ui.table.ICellEditorFactory {
    override def createCellEditor(cellInfo: js.Any): qx.ui.core.Widget = js.native
    override def getCellEditorValue(cellEditor: qx.ui.core.Widget): js.Dynamic = js.native
    def this(cellEditorFactoryFunction: js.Function = ???) = this()
    def getCellEditorFactoryFunction(): js.Function = js.native
    protected def initCellEditorFactoryFunction(value: js.Function): js.Function = js.native
    def resetCellEditorFactoryFunction(): Unit = js.native
    def setCellEditorFactoryFunction(value: js.Function): js.Function = js.native

}
}
