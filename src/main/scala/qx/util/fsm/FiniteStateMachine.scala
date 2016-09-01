
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.util.fsm {
@js.native
@JSName("qx.util.fsm.FiniteStateMachine")
class FiniteStateMachine protected () extends qx.core.Object {
    def this(machineName: String = ???) = this()
    protected def _getInternalData(): js.Dynamic = js.native
    def addObject(friendlyName: String, obj: js.Any, groupNames: js.Array[js.Any]): Unit = js.native
    def addState(state: qx.util.fsm.State): Unit = js.native
    def displayAllObjects(): Unit = js.native
    def enqueueEvent(event: qx.event.typ.Event, bAddAtHead: Boolean): Unit = js.native
    def eventListener(event: qx.event.typ.Event): Unit = js.native
    def fireImmediateEvent(typ: String, target: qx.core.Object, data: js.Any): Unit = js.native
    def getDebugFlags(): Long = js.native
    def getFriendlyName(obj: js.Any): String = js.native
    def getGroupObjects(groupName: String): js.Array[js.Any] = js.native
    def getMaxSavedStates(): Long = js.native
    def getName(): String = js.native
    def getNextState(): String = js.native
    def getObject(friendlyName: String): js.Dynamic = js.native
    def getPreviousState(): String = js.native
    def getState(): String = js.native
    protected def initDebugFlags(value: Long): Long = js.native
    protected def initMaxSavedStates(value: Long): Long = js.native
    protected def initName(value: String): String = js.native
    protected def initNextState(value: String): String = js.native
    protected def initPreviousState(value: String): String = js.native
    protected def initState(value: String): String = js.native
    def isTerminated(): Boolean = js.native
    def popState(): String = js.native
    def postponeEvent(event: qx.event.typ.Event): Unit = js.native
    def pushState(state: Boolean): Unit = js.native
    def removeObject(friendlyName: String): Unit = js.native
    def replaceState(state: qx.util.fsm.State, bDispose: Boolean): js.Dynamic = js.native
    def resetDebugFlags(): Unit = js.native
    def resetMaxSavedStates(): Unit = js.native
    def resetName(): Unit = js.native
    def resetNextState(): Unit = js.native
    def resetPreviousState(): Unit = js.native
    def resetState(): Unit = js.native
    def scheduleEvent(typ: String, target: qx.core.Object, data: js.Any, timeout: Int): Unit = js.native
    def setDebugFlags(value: Long): Long = js.native
    def setMaxSavedStates(value: Long): Long = js.native
    def setName(value: String): String = js.native
    def setNextState(value: String): String = js.native
    def setPreviousState(value: String): String = js.native
    def setState(value: String): String = js.native
    def start(): Unit = js.native

}
}
