
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table.columnmenu {
@js.native
@JSName("qx.ui.table.columnmenu.MenuItem")
class MenuItem protected () extends qx.ui.menu.CheckBox with qx.ui.table.IColumnMenuItem {
    override def getVisible(): js.Dynamic = js.native
    override protected def initVisible(value: js.Any): js.Dynamic = js.native
    override def resetVisible(): Unit = js.native
    override def setVisible(value: js.Any): js.Dynamic = js.native
    def this(text: String = ???) = this()
    protected def _applyVisible(value: Boolean, old: Boolean): Unit = js.native
    def toggleVisible(): Boolean = js.native

}
}
