
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.io.remote {
@js.native
@JSName("qx.io.remote.Exchange")
class Exchange protected () extends qx.core.Object {
    def this(vRequest: qx.io.remote.Request = ???) = this()
    protected def _applyImplementation(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyState(value: js.Any, old: js.Any): Unit = js.native
    protected def _onabort(e: qx.event.`type`.Event): Unit = js.native
    protected def _oncompleted(e: qx.event.`type`.Event): Unit = js.native
    protected def _onfailed(e: qx.event.`type`.Event): Unit = js.native
    protected def _onreceiving(e: qx.event.`type`.Event): Unit = js.native
    protected def _onsending(e: qx.event.`type`.Event): Unit = js.native
    protected def _ontimeout(e: qx.event.`type`.Event): Unit = js.native
    def abort(): Unit = js.native
    def getImplementation(): qx.io.remote.transport.Abstract = js.native
    def getRequest(): qx.io.remote.Request = js.native
    def getState(): js.Dynamic = js.native
    protected def initImplementation(value: qx.io.remote.transport.Abstract): qx.io.remote.transport.Abstract = js.native
    protected def initRequest(value: qx.io.remote.Request): qx.io.remote.Request = js.native
    protected def initState(value: js.Any): js.Dynamic = js.native
    def resetImplementation(): Unit = js.native
    def resetRequest(): Unit = js.native
    def resetState(): Unit = js.native
    def send(): js.Dynamic = js.native
    def setImplementation(value: qx.io.remote.transport.Abstract): qx.io.remote.transport.Abstract = js.native
    def setRequest(value: qx.io.remote.Request): qx.io.remote.Request = js.native
    def setState(value: js.Any): js.Dynamic = js.native
    def timeout(): Unit = js.native

}
@js.native
@JSName("qx.io.remote.Exchange")
object Exchange extends js.Object {
    def canHandle(vImpl: js.Any, vNeeds: js.Any, vResponseType: String): Boolean = js.native
    def initTypes(): Unit = js.native
    def registerType(vClass: js.Any, vId: String): Unit = js.native
    def statusCodeToString(vStatusCode: Int): String = js.native
    def wasSuccessful(vStatusCode: Int, vReadyState: String, vIsLocal: Boolean): Boolean = js.native

}
}
