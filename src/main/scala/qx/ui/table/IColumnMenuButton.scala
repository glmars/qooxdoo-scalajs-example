
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table {
@js.native
trait IColumnMenuButton extends js.Object {
    def empty(): Unit
    def factory(item: String, options: js.Any): qx.ui.core.Widget
    def getMenu(): js.Dynamic
    protected def initMenu(value: js.Any): js.Dynamic
    def resetMenu(): Unit
    def setMenu(value: js.Any): js.Dynamic

}
}
