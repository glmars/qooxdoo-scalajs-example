
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.io.remote {
@js.native
@JSName("qx.io.remote.Request")
class Request protected () extends qx.core.Object {
    def this(vUrl: String = ???, vMethod: String = ???, vResponseType: String = ???) = this()
    protected def _applyMethod(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyProhibitCaching(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyResponseType(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyState(value: js.Any, old: js.Any): Unit = js.native
    protected def _onaborted(e: qx.event.typ.Event): Unit = js.native
    protected def _oncompleted(e: qx.event.typ.Event): Unit = js.native
    protected def _onfailed(e: qx.event.typ.Event): Unit = js.native
    protected def _onqueued(e: qx.event.typ.Event): Unit = js.native
    protected def _onreceiving(e: qx.event.typ.Event): Unit = js.native
    protected def _onsending(e: qx.event.typ.Event): Unit = js.native
    protected def _ontimeout(e: qx.event.typ.Event): Unit = js.native
    def abort(): Unit = js.native
    def getAsynchronous(): Boolean = js.native
    def getCrossDomain(): Boolean = js.native
    def getData(): String = js.native
    def getFileUpload(): Boolean = js.native
    def getFormField(vId: String): String = js.native
    def getFormFields(): js.Dynamic = js.native
    def getMethod(): js.Dynamic = js.native
    def getParameter(vId: String, bFromData: Boolean): js.Dynamic = js.native
    def getParameters(bFromData: Boolean): js.Dynamic = js.native
    def getParseJson(): Boolean = js.native
    def getPassword(): String = js.native
    def getProhibitCaching(): js.Dynamic = js.native
    def getRequestHeader(vId: String): String = js.native
    def getRequestHeaders(): js.Dynamic = js.native
    def getResponseType(): js.Dynamic = js.native
    def getSequenceNumber(): Int = js.native
    def getState(): js.Dynamic = js.native
    def getTimeout(): Int = js.native
    def getTransport(): qx.io.remote.Exchange = js.native
    def getUrl(): String = js.native
    def getUseBasicHttpAuth(): Boolean = js.native
    def getUsername(): String = js.native
    protected def initAsynchronous(value: Boolean): Boolean = js.native
    protected def initCrossDomain(value: Boolean): Boolean = js.native
    protected def initData(value: String): String = js.native
    protected def initFileUpload(value: Boolean): Boolean = js.native
    protected def initMethod(value: js.Any): js.Dynamic = js.native
    protected def initParseJson(value: Boolean): Boolean = js.native
    protected def initPassword(value: String): String = js.native
    protected def initProhibitCaching(value: js.Any): js.Dynamic = js.native
    protected def initResponseType(value: js.Any): js.Dynamic = js.native
    protected def initState(value: js.Any): js.Dynamic = js.native
    protected def initTimeout(value: Int): Int = js.native
    protected def initTransport(value: qx.io.remote.Exchange): qx.io.remote.Exchange = js.native
    protected def initUrl(value: String): String = js.native
    protected def initUseBasicHttpAuth(value: Boolean): Boolean = js.native
    protected def initUsername(value: String): String = js.native
    def isAborted(): Boolean = js.native
    def isAsynchronous(): Boolean = js.native
    def isCompleted(): Boolean = js.native
    def isConfigured(): Boolean = js.native
    def isCrossDomain(): Boolean = js.native
    def isFailed(): Boolean = js.native
    def isFileUpload(): Boolean = js.native
    def isParseJson(): Boolean = js.native
    def isQueued(): Boolean = js.native
    def isReceiving(): Boolean = js.native
    def isSending(): Boolean = js.native
    def isTimeout(): Boolean = js.native
    def isUseBasicHttpAuth(): Boolean = js.native
    def removeFormField(vId: String): Unit = js.native
    def removeParameter(vId: String, bFromData: Boolean): Unit = js.native
    def removeRequestHeader(vId: String): Unit = js.native
    def reset(): Unit = js.native
    def resetAsynchronous(): Unit = js.native
    def resetCrossDomain(): Unit = js.native
    def resetData(): Unit = js.native
    def resetFileUpload(): Unit = js.native
    def resetMethod(): Unit = js.native
    def resetParseJson(): Unit = js.native
    def resetPassword(): Unit = js.native
    def resetProhibitCaching(): Unit = js.native
    def resetResponseType(): Unit = js.native
    def resetState(): Unit = js.native
    def resetTimeout(): Unit = js.native
    def resetTransport(): Unit = js.native
    def resetUrl(): Unit = js.native
    def resetUseBasicHttpAuth(): Unit = js.native
    def resetUsername(): Unit = js.native
    def send(): Unit = js.native
    def setAsynchronous(value: Boolean): Boolean = js.native
    def setCrossDomain(value: Boolean): Boolean = js.native
    def setData(value: String): String = js.native
    def setFileUpload(value: Boolean): Boolean = js.native
    def setFormField(vId: String, vValue: String): Unit = js.native
    def setMethod(value: js.Any): js.Dynamic = js.native
    def setParameter(vId: String, vValue: js.Any, bAsData: Boolean): Unit = js.native
    def setParseJson(value: Boolean): Boolean = js.native
    def setPassword(value: String): String = js.native
    def setProhibitCaching(value: js.Any): js.Dynamic = js.native
    def setRequestHeader(vId: String, vValue: String): Unit = js.native
    def setResponseType(value: js.Any): js.Dynamic = js.native
    def setState(value: js.Any): js.Dynamic = js.native
    def setTimeout(value: Int): Int = js.native
    def setTransport(value: qx.io.remote.Exchange): qx.io.remote.Exchange = js.native
    def setUrl(value: String): String = js.native
    def setUseBasicHttpAuth(value: Boolean): Boolean = js.native
    def setUsername(value: String): String = js.native
    def toggleAsynchronous(): Boolean = js.native
    def toggleCrossDomain(): Boolean = js.native
    def toggleFileUpload(): Boolean = js.native
    def toggleParseJson(): Boolean = js.native
    def toggleUseBasicHttpAuth(): Boolean = js.native

}
@js.native
@JSName("qx.io.remote.Request")
object Request extends js.Object {
    def methodAllowsRequestBody(httpMethod: String): Boolean = js.native

}
}
