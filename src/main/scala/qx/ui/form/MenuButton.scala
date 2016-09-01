
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
@JSName("qx.ui.form.MenuButton")
class MenuButton protected () extends qx.ui.form.Button {
    def this(label: String = ???, icon: String = ???, menu: qx.ui.menu.Menu = ???) = this()
    protected def _applyMenu(value: qx.ui.menu.Menu, old: qx.ui.menu.Menu): Unit = js.native
    protected def _onMenuChange(e: qx.event.`type`.Data): Unit = js.native
    def getMenu(): qx.ui.menu.Menu = js.native
    protected def initMenu(value: qx.ui.menu.Menu): qx.ui.menu.Menu = js.native
    def open(selectFirst: Boolean = ???): Unit = js.native
    def resetMenu(): Unit = js.native
    def setMenu(value: qx.ui.menu.Menu): qx.ui.menu.Menu = js.native

}
}
