
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table {
@js.native
trait IColumnMenuButton extends js.Object {
    def empty(): Unit
    def factory(item: String, options: js.Any): qx.ui.core.Widget
    def getMenu(): qx.ui.menu.Menu
    protected def initMenu(value: qx.ui.menu.Menu): qx.ui.menu.Menu
    def resetMenu(): Unit
    def setMenu(value: qx.ui.menu.Menu): qx.ui.menu.Menu

}
}
