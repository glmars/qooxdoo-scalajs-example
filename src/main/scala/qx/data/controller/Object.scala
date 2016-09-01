
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.data.controller {
@js.native
@JSName("qx.data.controller.Object")
class Object protected () extends qx.core.Object {
    def this(model: qx.core.Object = ???) = this()
    protected def _applyModel(value: qx.core.Object, old: qx.core.Object): Unit = js.native
    def addTarget(targetObject: qx.core.Object, targetProperty: String, sourceProperty: String, bidirectional: Boolean = ???, options: js.Any = ???, reverseOptions: js.Any = ???): Unit = js.native
    def getModel(): qx.core.Object = js.native
    protected def initModel(value: qx.core.Object): qx.core.Object = js.native
    def removeTarget(targetObject: qx.core.Object, targetProperty: String, sourceProperty: String): Unit = js.native
    def resetModel(): Unit = js.native
    def setModel(value: qx.core.Object): qx.core.Object = js.native

}
}
