
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.util.fsm {
@js.native
@JSName("qx.util.fsm.Transition")
class Transition protected () extends qx.core.Object {
    def this(transitionName: String = ???, transitionInfo: js.Any = ???) = this()
    def getAutoActionsAfterOntransition(): js.Dynamic = js.native
    def getAutoActionsBeforeOntransition(): js.Dynamic = js.native
    def getName(): String = js.native
    def getNextState(): js.Dynamic = js.native
    def getOntransition(): js.Dynamic = js.native
    def getPredicate(): js.Dynamic = js.native
    protected def initAutoActionsAfterOntransition(value: js.Any): js.Dynamic = js.native
    protected def initAutoActionsBeforeOntransition(value: js.Any): js.Dynamic = js.native
    protected def initName(value: String): String = js.native
    protected def initNextState(value: js.Any): js.Dynamic = js.native
    protected def initOntransition(value: js.Any): js.Dynamic = js.native
    protected def initPredicate(value: js.Any): js.Dynamic = js.native
    def resetAutoActionsAfterOntransition(): Unit = js.native
    def resetAutoActionsBeforeOntransition(): Unit = js.native
    def resetName(): Unit = js.native
    def resetNextState(): Unit = js.native
    def resetOntransition(): Unit = js.native
    def resetPredicate(): Unit = js.native
    def setAutoActionsAfterOntransition(value: js.Any): js.Dynamic = js.native
    def setAutoActionsBeforeOntransition(value: js.Any): js.Dynamic = js.native
    def setName(value: String): String = js.native
    def setNextState(value: js.Any): js.Dynamic = js.native
    def setOntransition(value: js.Any): js.Dynamic = js.native
    def setPredicate(value: js.Any): js.Dynamic = js.native

}
}
