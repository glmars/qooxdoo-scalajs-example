
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.io.remote.transport {
@js.native
@JSName("qx.io.remote.transport.Iframe")
class Iframe extends qx.io.remote.transport.Abstract {
    protected def _onload(e: qx.event.typ.Event): Unit = js.native
    protected def _onreadystatechange(e: qx.event.typ.Event): Unit = js.native
    protected def _switchReadyState(vReadyState: String): Unit = js.native
    def getIframeBody(): js.Dynamic = js.native
    def getIframeDocument(): js.Dynamic = js.native
    def getIframeHtmlContent(): String = js.native
    def getIframeTextContent(): String = js.native
    def getIframeWindow(): js.Dynamic = js.native
    def getResponseContent(): js.Dynamic = js.native

}
@js.native
@JSName("qx.io.remote.transport.Iframe")
object Iframe extends js.Object {
    def isSupported(): Boolean = js.native

}
}
