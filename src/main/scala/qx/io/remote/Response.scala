
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.io.remote {
@js.native
@JSName("qx.io.remote.Response")
class Response extends qx.event.`type`.Event {
    protected def _applyResponseHeaders(value: js.Any, old: js.Any): Unit = js.native
    def getContent(): js.Dynamic = js.native
    def getResponseHeader(vHeader: String): js.Dynamic = js.native
    def getResponseHeaders(): js.Dynamic = js.native
    def getState(): Int = js.native
    def getStatusCode(): Int = js.native
    protected def initContent(value: js.Any): js.Dynamic = js.native
    protected def initResponseHeaders(value: js.Any): js.Dynamic = js.native
    protected def initState(value: Int): Int = js.native
    protected def initStatusCode(value: Int): Int = js.native
    def resetContent(): Unit = js.native
    def resetResponseHeaders(): Unit = js.native
    def resetState(): Unit = js.native
    def resetStatusCode(): Unit = js.native
    def setContent(value: js.Any): js.Dynamic = js.native
    def setResponseHeaders(value: js.Any): js.Dynamic = js.native
    def setState(value: Int): Int = js.native
    def setStatusCode(value: Int): Int = js.native

}
}
