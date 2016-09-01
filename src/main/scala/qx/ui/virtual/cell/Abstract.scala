
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.Abstract")
class Abstract extends qx.core.Object with qx.ui.virtual.cell.ICell {
    override def getCellProperties(data: js.Any, states: js.Any): js.Dynamic = js.native
    def getAttributes(value: js.Any, states: js.Any): String = js.native
    def getContent(value: js.Any, states: js.Any): String = js.native
    def getCssClasses(value: js.Any, states: js.Any): String = js.native
    def getInsets(value: js.Any, states: js.Any): js.Array[Int] = js.native
    def getStyles(value: js.Any, states: js.Any): String = js.native

}
}
