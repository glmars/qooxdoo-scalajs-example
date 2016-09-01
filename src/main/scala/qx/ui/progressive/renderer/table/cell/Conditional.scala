
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.Conditional")
class Conditional protected () extends qx.ui.progressive.renderer.table.cell.Abstract {
    def this(align: String = ???, color: String = ???, style: String = ???, weight: String = ???) = this()
    def addBetweenCondition(condition: String, value1: Int, value2: Int, align: String, color: String, style: String, weight: String, target: String): Unit = js.native
    def addNumericCondition(condition: String, value1: Int, align: String, color: String, style: String, weight: String, target: String): Unit = js.native
    def addRegex(regex: String, align: String, color: String, style: String, weight: String, target: String): Unit = js.native

}
}
