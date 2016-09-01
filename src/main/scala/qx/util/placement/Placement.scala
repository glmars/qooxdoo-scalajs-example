
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.util.placement {
@js.native
@JSName("qx.util.placement.Placement")
class Placement extends qx.core.Object {
    def compute(size: js.Any, area: js.Any, target: js.Any, offsets: js.Any): js.Dynamic = js.native
    def getAlign(): js.Dynamic = js.native
    def getAxisX(): qx.Class = js.native
    def getAxisY(): qx.Class = js.native
    def getEdge(): js.Dynamic = js.native
    protected def initAlign(value: js.Any): js.Dynamic = js.native
    protected def initAxisX(value: qx.Class): qx.Class = js.native
    protected def initAxisY(value: qx.Class): qx.Class = js.native
    protected def initEdge(value: js.Any): js.Dynamic = js.native
    def resetAlign(): Unit = js.native
    def resetAxisX(): Unit = js.native
    def resetAxisY(): Unit = js.native
    def resetEdge(): Unit = js.native
    def setAlign(value: js.Any): js.Dynamic = js.native
    def setAxisX(value: qx.Class): qx.Class = js.native
    def setAxisY(value: qx.Class): qx.Class = js.native
    def setEdge(value: js.Any): js.Dynamic = js.native

}
@js.native
@JSName("qx.util.placement.Placement")
object Placement extends js.Object {

}
}
