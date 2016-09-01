
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom.rest {
@js.native
@JSName("qx.bom.rest.Resource")
class Resource protected () extends qx.event.Emitter {
    def this(description: js.Any = ???) = this()
    protected def _getRequest(): qx.bom.request.SimpleXhr = js.native
    protected def _getRequestConfig(action: String, params: js.Any): js.Dynamic = js.native
    protected def _getRequestHandler(): js.Dynamic = js.native
    protected def _getThrottleCount(): Int = js.native
    protected def _getThrottleLimit(): Int = js.native
    protected def _startPoll(action: String, listener: js.Function, interval: Long): Unit = js.native
    def abort(varargs: String = ???): Unit = js.native
    def configureRequest(callback: js.Function): Unit = js.native
    def destruct(): Unit = js.native
    def dispose(): Unit = js.native
    def getRequestsByAction(action: String): js.Array[js.Any] = js.native
    def invoke(action: String, params: js.Any, data: js.Any): Long = js.native
    def isDisposed(): Boolean = js.native
    def longPoll(action: String): String = js.native
    def map(action: String, method: String, url: String, check: js.Any = ???): Unit = js.native
    def poll(action: String, interval: Long, params: js.Any = ???, immediately: Boolean = ???): Unit = js.native
    def refresh(action: String): Unit = js.native
    def restartPollByAction(action: String): Unit = js.native
    def setBaseUrl(baseUrl: String): Unit = js.native
    def setRequestFactory(fn: js.Function): Unit = js.native
    def setRequestHandler(handler: js.Any): Unit = js.native
    def stopPollByAction(action: String): Unit = js.native

}
@js.native
@JSName("qx.bom.rest.Resource")
object Resource extends js.Object {
    def placeholdersFromUrl(url: String): js.Array[js.Any] = js.native

}
}
