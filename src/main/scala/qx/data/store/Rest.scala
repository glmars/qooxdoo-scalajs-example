
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.data.store {
@js.native
@JSName("qx.data.store.Rest")
class Rest protected () extends qx.core.Object {
    def this(resource: qx.io.rest.Resource = ???, actionName: String = ???, delegate: js.Any = ???) = this()
    def getActionName(): String = js.native
    def getModel(): js.Dynamic = js.native
    def getResource(): qx.io.rest.Resource = js.native
    protected def initActionName(value: String): String = js.native
    protected def initModel(value: js.Any): js.Dynamic = js.native
    protected def initResource(value: qx.io.rest.Resource): qx.io.rest.Resource = js.native
    def resetActionName(): Unit = js.native
    def resetModel(): Unit = js.native
    def resetResource(): Unit = js.native
    def setActionName(value: String): String = js.native
    def setModel(value: js.Any): js.Dynamic = js.native
    def setResource(value: qx.io.rest.Resource): qx.io.rest.Resource = js.native

}
}
