
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
@JSName("qx.ui.form.MModelProperty")
trait MModelProperty extends js.Object {
    protected def _applyModel(value: js.Any, old: js.Any): Unit = js.native
    def getModel(): js.Dynamic = js.native
    protected def initModel(value: js.Any): js.Dynamic = js.native
    def resetModel(): Unit = js.native
    def setModel(value: js.Any): Unit = js.native

}
}
