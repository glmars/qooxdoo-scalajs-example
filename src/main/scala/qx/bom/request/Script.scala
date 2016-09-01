
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom.request {
@js.native
@JSName("qx.bom.request.Script")
class Script extends js.Object {
    protected def _emit(event: String): Unit = js.native
    protected def _getScriptElement(): HTMLElement = js.native
    protected def _getUrl(): String = js.native
    protected def _onNativeError(): Unit = js.native
    protected def _onNativeLoad(): Unit = js.native
    protected def _onTimeout(): Unit = js.native
    protected def _readyStateChange(readyState: Long): Unit = js.native
    protected def _success(): Unit = js.native
    def abort(): qx.bom.request.Script = js.native
    def dispose(): Unit = js.native
    def getAllResponseHeaders(): String = js.native
    def getResponseHeader(key: String): String = js.native
    def isDisposed(): Boolean = js.native
    def on(name: String, listener: js.Function, ctx: js.Any = ???): qx.bom.request.Script = js.native
    def onabort(): Unit = js.native
    def onerror(): Unit = js.native
    def onload(): Unit = js.native
    def onloadend(): Unit = js.native
    def onreadystatechange(): Unit = js.native
    def ontimeout(): Unit = js.native
    def open(method: String, url: String): Unit = js.native
    def send(): qx.bom.request.Script = js.native
    def setDetermineSuccess(check: js.Function): Unit = js.native
    def setRequestHeader(key: String, value: String): qx.bom.request.Script = js.native

}
}
