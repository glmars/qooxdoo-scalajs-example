
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom.request {
@js.native
@JSName("qx.bom.request.SimpleXhr")
class SimpleXhr protected () extends qx.event.Emitter {
    def this(url: String = ???, method: String = ???) = this()
    protected def _createResponseParser(): qx.util.ResponseParser = js.native
    protected def _createTransport(): qx.bom.request.IRequest = js.native
    protected def _onAbort(): Unit = js.native
    protected def _onError(): Unit = js.native
    protected def _onLoadEnd(): Unit = js.native
    protected def _onReadyStateChange(): Unit = js.native
    protected def _onTimeout(): Unit = js.native
    protected def _registerTransportListener(transport: qx.bom.request.IRequest): qx.bom.request.IRequest = js.native
    protected def _serializeData(data: String, contentType: String = ???): String = js.native
    protected def _setResponse(response: String): Unit = js.native
    def abort(): qx.bom.request.SimpleXhr = js.native
    def dispose(): Boolean = js.native
    def getAllResponseHeaders(): String = js.native
    def getMethod(): String = js.native
    def getRequestData(): String = js.native
    def getRequestHeader(key: String): String = js.native
    def getResponse(): String = js.native
    def getResponseHeader(header: String): String = js.native
    def getTimeout(): Long = js.native
    def getTransport(): js.Dynamic = js.native
    def getUrl(): String = js.native
    def isCaching(): Boolean = js.native
    def isDisposed(): Boolean = js.native
    def isDone(): Boolean = js.native
    def send(): Unit = js.native
    def setMethod(method: String): qx.bom.request.SimpleXhr = js.native
    def setParser(parser: String): js.Function = js.native
    def setRequestData(data: String): qx.bom.request.SimpleXhr = js.native
    def setRequestHeader(key: String, value: String): qx.bom.request.SimpleXhr = js.native
    def setTimeout(millis: Long): qx.bom.request.SimpleXhr = js.native
    def setUrl(url: String): qx.bom.request.SimpleXhr = js.native
    def toHashCode(): Int = js.native
    def useCaching(value: Boolean): qx.bom.request.SimpleXhr = js.native

}
}
