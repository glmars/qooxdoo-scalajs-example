
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.util.fsm {
@js.native
@JSName("qx.util.fsm.State")
class State protected () extends qx.core.Object {
    def this(stateName: String = ???, stateInfo: js.Any = ???) = this()
    def addTransition(trans: qx.util.fsm.Transition): Unit = js.native
    def getAutoActionsAfterOnentry(): js.Dynamic = js.native
    def getAutoActionsAfterOnexit(): js.Dynamic = js.native
    def getAutoActionsBeforeOnentry(): js.Dynamic = js.native
    def getAutoActionsBeforeOnexit(): js.Dynamic = js.native
    def getEvents(): js.Dynamic = js.native
    def getName(): js.Dynamic = js.native
    def getOnentry(): js.Dynamic = js.native
    def getOnexit(): js.Dynamic = js.native
    protected def initAutoActionsAfterOnentry(value: js.Any): js.Dynamic = js.native
    protected def initAutoActionsAfterOnexit(value: js.Any): js.Dynamic = js.native
    protected def initAutoActionsBeforeOnentry(value: js.Any): js.Dynamic = js.native
    protected def initAutoActionsBeforeOnexit(value: js.Any): js.Dynamic = js.native
    protected def initEvents(value: js.Any): js.Dynamic = js.native
    protected def initName(value: js.Any): js.Dynamic = js.native
    protected def initOnentry(value: js.Any): js.Dynamic = js.native
    protected def initOnexit(value: js.Any): js.Dynamic = js.native
    def resetAutoActionsAfterOnentry(): Unit = js.native
    def resetAutoActionsAfterOnexit(): Unit = js.native
    def resetAutoActionsBeforeOnentry(): Unit = js.native
    def resetAutoActionsBeforeOnexit(): Unit = js.native
    def resetEvents(): Unit = js.native
    def resetName(): Unit = js.native
    def resetOnentry(): Unit = js.native
    def resetOnexit(): Unit = js.native
    def setAutoActionsAfterOnentry(value: js.Any): js.Dynamic = js.native
    def setAutoActionsAfterOnexit(value: js.Any): js.Dynamic = js.native
    def setAutoActionsBeforeOnentry(value: js.Any): js.Dynamic = js.native
    def setAutoActionsBeforeOnexit(value: js.Any): js.Dynamic = js.native
    def setEvents(value: js.Any): js.Dynamic = js.native
    def setName(value: js.Any): js.Dynamic = js.native
    def setOnentry(value: js.Any): js.Dynamic = js.native
    def setOnexit(value: js.Any): js.Dynamic = js.native

}
@js.native
@JSName("qx.util.fsm.State")
object State extends js.Object {
    protected def _commonTransformAutoActions(actionType: String, value: js.Any, context: js.Any): js.Function = js.native

}
}
