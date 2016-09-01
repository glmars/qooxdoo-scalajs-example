
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.io.remote.transport {
@js.native
@JSName("qx.io.remote.transport.Abstract")
class Abstract extends qx.core.Object {
    protected def _applyState(value: js.Any, old: js.Any): Unit = js.native
    def abort(): Unit = js.native
    def failed(): Unit = js.native
    def getAsynchronous(): Boolean = js.native
    def getData(): String = js.native
    def getFetchedLength(): Int = js.native
    def getFormFields(): js.Dynamic = js.native
    def getMethod(): String = js.native
    def getParameters(): js.Dynamic = js.native
    def getPassword(): String = js.native
    def getRequestHeaders(): js.Dynamic = js.native
    def getResponseHeader(vLabel: String): js.Dynamic = js.native
    def getResponseHeaders(): js.Dynamic = js.native
    def getResponseText(): String = js.native
    def getResponseType(): String = js.native
    def getResponseXml(): js.Dynamic = js.native
    def getState(): js.Dynamic = js.native
    def getStatusCode(): Int = js.native
    def getStatusText(): String = js.native
    def getUrl(): String = js.native
    def getUseBasicHttpAuth(): Boolean = js.native
    def getUsername(): String = js.native
    protected def initAsynchronous(value: Boolean): Boolean = js.native
    protected def initData(value: String): String = js.native
    protected def initFormFields(value: js.Any): js.Dynamic = js.native
    protected def initMethod(value: String): String = js.native
    protected def initParameters(value: js.Any): js.Dynamic = js.native
    protected def initPassword(value: String): String = js.native
    protected def initRequestHeaders(value: js.Any): js.Dynamic = js.native
    protected def initResponseType(value: String): String = js.native
    protected def initState(value: js.Any): js.Dynamic = js.native
    protected def initUrl(value: String): String = js.native
    protected def initUseBasicHttpAuth(value: Boolean): Boolean = js.native
    protected def initUsername(value: String): String = js.native
    def isAsynchronous(): Boolean = js.native
    def isUseBasicHttpAuth(): Boolean = js.native
    def resetAsynchronous(): Unit = js.native
    def resetData(): Unit = js.native
    def resetFormFields(): Unit = js.native
    def resetMethod(): Unit = js.native
    def resetParameters(): Unit = js.native
    def resetPassword(): Unit = js.native
    def resetRequestHeaders(): Unit = js.native
    def resetResponseType(): Unit = js.native
    def resetState(): Unit = js.native
    def resetUrl(): Unit = js.native
    def resetUseBasicHttpAuth(): Unit = js.native
    def resetUsername(): Unit = js.native
    def send(): Unit = js.native
    def setAsynchronous(value: Boolean): Boolean = js.native
    def setData(value: String): String = js.native
    def setFormFields(value: js.Any): js.Dynamic = js.native
    def setMethod(value: String): String = js.native
    def setParameters(value: js.Any): js.Dynamic = js.native
    def setPassword(value: String): String = js.native
    def setRequestHeader(vLabel: String, vValue: js.Any): Unit = js.native
    def setRequestHeaders(value: js.Any): js.Dynamic = js.native
    def setResponseType(value: String): String = js.native
    def setState(value: js.Any): js.Dynamic = js.native
    def setUrl(value: String): String = js.native
    def setUseBasicHttpAuth(value: Boolean): Boolean = js.native
    def setUsername(value: String): String = js.native
    def timeout(): Unit = js.native
    def toggleAsynchronous(): Boolean = js.native
    def toggleUseBasicHttpAuth(): Boolean = js.native

}
}
