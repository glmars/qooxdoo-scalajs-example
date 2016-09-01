
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom.request {
@js.native
@JSName("qx.bom.request.Xhr")
class Xhr extends js.Object {
    protected def _createNativeXhr(): js.Dynamic = js.native
    protected def _emit(event: String): Unit = js.native
    protected def _getProtocol(): String = js.native
    def abort(): qx.bom.request.Xhr = js.native
    def dispose(): Boolean = js.native
    def getAllResponseHeaders(): String = js.native
    def getRequest(): js.Dynamic = js.native
    def getResponseHeader(header: String): String = js.native
    def isDisposed(): Boolean = js.native
    def on(name: String, listener: js.Function, ctx: js.Any = ???): qx.bom.request.Xhr = js.native
    def onabort(): Unit = js.native
    def onerror(): Unit = js.native
    def onload(): Unit = js.native
    def onloadend(): Unit = js.native
    def onreadystatechange(): Unit = js.native
    def ontimeout(): Unit = js.native
    def open(method: String = ???, url: String = ???, async: Boolean = ???, user: String = ???, password: String = ???): Unit = js.native
    def overrideMimeType(mimeType: String): qx.bom.request.Xhr = js.native
    def send(data: String = ???): qx.bom.request.Xhr = js.native
    def setRequestHeader(key: String, value: String): qx.bom.request.Xhr = js.native

}
}
