
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.WidgetCellSpan")
class WidgetCellSpan protected () extends qx.ui.virtual.layer.Abstract with qx.ui.core.MChildrenHandling {
    def this(widgetCellProvider: qx.ui.virtual.core.IWidgetCellProvider = ???, rowConfig: qx.ui.virtual.core.Axis = ???, columnConfig: qx.ui.virtual.core.Axis = ???) = this()
    protected def _getSpacer(): qx.ui.core.Spacer = js.native
    def getRenderedCellWidget(row: Int, column: Int): qx.ui.core.LayoutItem = js.native
    def setCellSpan(row: Int, column: Int, rowSpan: Int, columnSpan: Int): Unit = js.native

}
}
