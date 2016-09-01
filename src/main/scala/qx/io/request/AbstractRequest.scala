
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.io.request {
@js.native
@JSName("qx.io.request.AbstractRequest")
class AbstractRequest protected () extends qx.core.Object {
    def this(url: String = ???) = this()
    protected def _createTransport(): js.Dynamic = js.native
    protected def _fireStatefulEvent(evt: String): Unit = js.native
    protected def _getAllRequestHeaders(): js.Dynamic = js.native
    protected def _getConfiguredRequestHeaders(): js.Dynamic = js.native
    protected def _getConfiguredUrl(): String = js.native
    protected def _getMethod(): String = js.native
    protected def _getParsedResponse(): String = js.native
    protected def _isAsync(): Boolean = js.native
    protected def _onAbort(): Unit = js.native
    protected def _onError(): Unit = js.native
    protected def _onLoad(): Unit = js.native
    protected def _onLoadEnd(): Unit = js.native
    protected def _onReadyStateChange(): Unit = js.native
    protected def _onTimeout(): Unit = js.native
    protected def _serializeData(data: String): String = js.native
    protected def _setPhase(phase: String): Unit = js.native
    protected def _setRequestHeaders(): Unit = js.native
    protected def _setResponse(response: String): Unit = js.native
    def abort(): Unit = js.native
    def getAllResponseHeaders(): String = js.native
    def getAuthentication(): qx.io.request.authentication.IAuthentication = js.native
    def getPhase(): String = js.native
    def getReadyState(): Long = js.native
    def getRequestData(): js.Dynamic = js.native
    def getRequestHeader(key: String): String = js.native
    def getResponse(): String = js.native
    def getResponseContentType(): String = js.native
    def getResponseHeader(key: String): String = js.native
    def getResponseText(): String = js.native
    def getStatus(): Long = js.native
    def getStatusText(): String = js.native
    def getTimeout(): Long = js.native
    def getTransport(): js.Dynamic = js.native
    def getUrl(): String = js.native
    protected def initAuthentication(value: qx.io.request.authentication.IAuthentication): qx.io.request.authentication.IAuthentication = js.native
    protected def initRequestData(value: js.Any): js.Dynamic = js.native
    protected def initTimeout(value: Long): Long = js.native
    protected def initUrl(value: String): String = js.native
    def isDone(): Unit = js.native
    def overrideResponseContentType(contentType: String): Unit = js.native
    def removeRequestHeader(key: String): Unit = js.native
    def resetAuthentication(): Unit = js.native
    def resetRequestData(): Unit = js.native
    def resetTimeout(): Unit = js.native
    def resetUrl(): Unit = js.native
    def send(): Unit = js.native
    def setAuthentication(value: qx.io.request.authentication.IAuthentication): qx.io.request.authentication.IAuthentication = js.native
    def setRequestData(value: js.Any): js.Dynamic = js.native
    def setRequestHeader(key: String, value: String): Unit = js.native
    def setTimeout(value: Long): Long = js.native
    def setUrl(value: String): String = js.native

}
}
