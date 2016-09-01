
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.list.provider {
@js.native
@JSName("qx.ui.list.provider.WidgetProvider")
class WidgetProvider protected () extends qx.core.Object with qx.ui.virtual.core.IWidgetCellProvider with qx.ui.list.provider.IListProvider with qx.ui.list.core.MWidgetController {
    override def getCellWidget(row: Int, column: Int): qx.ui.core.LayoutItem = js.native
    override def poolCellWidget(widget: qx.ui.core.LayoutItem): Unit = js.native
    override def createGroupRenderer(): js.Dynamic = js.native
    override def createItemRenderer(): js.Dynamic = js.native
    override def createLayer(): qx.ui.virtual.layer.Abstract = js.native
    override def isSelectable(row: Int): Boolean = js.native
    override def styleSelectabled(row: Int): Unit = js.native
    override def styleUnselectabled(row: Int): Unit = js.native
    def this(list: qx.ui.list.List = ???) = this()
    protected def _onChangeDelegate(event: qx.event.typ.Data): Unit = js.native
    protected def _onGroupItemCreated(event: qx.event.typ.Data): Unit = js.native
    protected def _onItemCreated(event: qx.event.typ.Data): Unit = js.native
    protected def _onPool(item: qx.ui.core.Widget): Unit = js.native
    protected def _styleSelectabled(widget: qx.ui.core.Widget): Unit = js.native
    protected def _styleUnselectabled(widget: qx.ui.core.Widget): Unit = js.native

}
}
