
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.data.controller {
@js.native
@JSName("qx.data.controller.Form")
class Form protected () extends qx.core.Object {
    def this(model: qx.core.Object = ???, target: qx.ui.form.Form = ???, selfUpdate: Boolean = ???) = this()
    protected def _applyModel(value: qx.core.Object, old: qx.core.Object): Unit = js.native
    protected def _applyTarget(value: qx.ui.form.Form, old: qx.ui.form.Form): Unit = js.native
    def addBindingOptions(name: String, model2target: js.Any, target2model: js.Any): Unit = js.native
    def createModel(includeBubbleEvents: Boolean): qx.core.Object = js.native
    def getModel(): qx.core.Object = js.native
    def getTarget(): qx.ui.form.Form = js.native
    protected def initModel(value: qx.core.Object): qx.core.Object = js.native
    protected def initTarget(value: qx.ui.form.Form): qx.ui.form.Form = js.native
    def resetModel(): Unit = js.native
    def resetTarget(): Unit = js.native
    def setModel(value: qx.core.Object): qx.core.Object = js.native
    def setTarget(value: qx.ui.form.Form): qx.ui.form.Form = js.native
    def updateModel(): Unit = js.native

}
}
