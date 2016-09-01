
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.io.remote {
@js.native
@JSName("qx.io.remote.Rpc")
class Rpc protected () extends qx.core.Object {
    def this(url: String = ???, serviceName: String = ???) = this()
    protected def _callInternal(args: js.Array[js.Any], callType: Int, refreshSession: Boolean): js.Dynamic = js.native
    protected def _isConvertDates(): Boolean = js.native
    protected def _isResponseJson(): Boolean = js.native
    def abort(opaqueCallRef: js.Any): Unit = js.native
    def callAsync(handler: js.Function, methodName: String): js.Dynamic = js.native
    def callAsyncListeners(coalesce: Boolean, methodName: String): js.Dynamic = js.native
    def callSync(methodName: String): js.Dynamic = js.native
    def createRequest(): qx.io.remote.Request = js.native
    def createRpcData(id: Int, method: String, parameters: js.Array[js.Any], serverData: js.Any): js.Dynamic = js.native
    def fixUrl(url: String): String = js.native
    def getCrossDomain(): Boolean = js.native
    def getPassword(): String = js.native
    def getProtocol(): js.Dynamic = js.native
    def getServerData(): js.Dynamic = js.native
    def getServiceName(): String = js.native
    def getTimeout(): Int = js.native
    def getUrl(): String = js.native
    def getUseBasicHttpAuth(): Boolean = js.native
    def getUsername(): String = js.native
    protected def initCrossDomain(value: Boolean): Boolean = js.native
    protected def initPassword(value: String): String = js.native
    protected def initProtocol(value: js.Any): js.Dynamic = js.native
    protected def initServerData(value: js.Any): js.Dynamic = js.native
    protected def initServiceName(value: String): String = js.native
    protected def initTimeout(value: Int): Int = js.native
    protected def initUrl(value: String): String = js.native
    protected def initUseBasicHttpAuth(value: Boolean): Boolean = js.native
    protected def initUsername(value: String): String = js.native
    def isCrossDomain(): Boolean = js.native
    def isUseBasicHttpAuth(): Boolean = js.native
    def refreshSession(handler: js.Function): Unit = js.native
    def resetCrossDomain(): Unit = js.native
    def resetPassword(): Unit = js.native
    def resetProtocol(): Unit = js.native
    def resetServerData(): Unit = js.native
    def resetServiceName(): Unit = js.native
    def resetTimeout(): Unit = js.native
    def resetUrl(): Unit = js.native
    def resetUseBasicHttpAuth(): Unit = js.native
    def resetUsername(): Unit = js.native
    def setCrossDomain(value: Boolean): Boolean = js.native
    def setPassword(value: String): String = js.native
    def setProtocol(value: js.Any): js.Dynamic = js.native
    def setServerData(value: js.Any): js.Dynamic = js.native
    def setServiceName(value: String): String = js.native
    def setTimeout(value: Int): Int = js.native
    def setUrl(value: String): String = js.native
    def setUseBasicHttpAuth(value: Boolean): Boolean = js.native
    def setUsername(value: String): String = js.native
    def toggleCrossDomain(): Boolean = js.native
    def toggleUseBasicHttpAuth(): Boolean = js.native

}
@js.native
@JSName("qx.io.remote.Rpc")
object Rpc extends js.Object {
    def makeServerURL(instanceId: String = ???): String = js.native

}
}
