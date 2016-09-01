
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table.columnmenu {
@js.native
@JSName("qx.ui.table.columnmenu.Button")
class Button extends qx.ui.form.MenuButton with qx.ui.table.IColumnMenuButton {
    override def empty(): Unit = js.native
    override def factory(item: String, options: js.Any): qx.ui.core.Widget = js.native
    override def getMenu(): qx.ui.menu.Menu = js.native
    override protected def initMenu(value: qx.ui.menu.Menu): qx.ui.menu.Menu = js.native
    override def resetMenu(): Unit = js.native
    override def setMenu(value: qx.ui.menu.Menu): qx.ui.menu.Menu = js.native
    def getBlocker(): qx.ui.core.Blocker = js.native

}
}
