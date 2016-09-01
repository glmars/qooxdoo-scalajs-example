
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.io.rest {
@js.native
@JSName("qx.io.rest.Resource")
class Resource protected () extends qx.core.Object {
    def this(description: js.Any = ???) = this()
    protected def _getRequest(): qx.io.request.Xhr = js.native
    protected def _getRequestConfig(action: String, params: js.Any): js.Dynamic = js.native
    protected def _getResource(description: js.Any = ???): qx.bom.rest.Resource = js.native
    protected def _getThrottleCount(): Int = js.native
    protected def _getThrottleLimit(): Int = js.native
    protected def _tailorResource(resource: qx.bom.rest.Resource): qx.bom.rest.Resource = js.native
    def abort(varargs: String = ???): Unit = js.native
    def configureRequest(callback: js.Function): Unit = js.native
    def invoke(action: String, params: js.Any, data: js.Any): Long = js.native
    def longPoll(action: String): String = js.native
    def map(action: String, method: String, url: String, check: js.Any = ???): Unit = js.native
    def poll(action: String, interval: Long, params: js.Any = ???, immediately: Boolean = ???): qx.event.Timer = js.native
    def refresh(action: String): Unit = js.native
    def setBaseUrl(baseUrl: String): Unit = js.native

}
@js.native
@JSName("qx.io.rest.Resource")
object Resource extends js.Object {
    def placeholdersFromUrl(url: String): js.Array[js.Any] = js.native

}
}
