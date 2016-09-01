
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.io.remote {
@js.native
@JSName("qx.io.remote.RequestQueue")
class RequestQueue extends qx.core.Object {
    protected def _applyEnabled(value: Boolean, old: Boolean): Unit = js.native
    protected def _check(): Unit = js.native
    protected def _debug(): Unit = js.native
    protected def _oncompleted(e: qx.event.typ.Event): Unit = js.native
    protected def _oninterval(e: qx.event.typ.Event): Unit = js.native
    protected def _onreceiving(e: qx.event.typ.Event): Unit = js.native
    protected def _onsending(e: qx.event.typ.Event): Unit = js.native
    protected def _remove(vTransport: qx.io.remote.Exchange): Unit = js.native
    def abort(vRequest: js.Any): Unit = js.native
    def add(vRequest: js.Any): Unit = js.native
    def getActiveQueue(): js.Array[js.Dynamic] = js.native
    def getDefaultTimeout(): Int = js.native
    def getEnabled(): Boolean = js.native
    def getMaxConcurrentRequests(): Int = js.native
    def getMaxTotalRequests(): Int = js.native
    def getRequestQueue(): js.Array[js.Dynamic] = js.native
    protected def initDefaultTimeout(value: Int): Int = js.native
    protected def initEnabled(value: Boolean): Boolean = js.native
    protected def initMaxConcurrentRequests(value: Int): Int = js.native
    protected def initMaxTotalRequests(value: Int): Int = js.native
    def isEnabled(): Boolean = js.native
    def resetDefaultTimeout(): Unit = js.native
    def resetEnabled(): Unit = js.native
    def resetMaxConcurrentRequests(): Unit = js.native
    def resetMaxTotalRequests(): Unit = js.native
    def setDefaultTimeout(value: Int): Int = js.native
    def setEnabled(value: Boolean): Boolean = js.native
    def setMaxConcurrentRequests(value: Int): Int = js.native
    def setMaxTotalRequests(value: Int): Int = js.native
    def toggleEnabled(): Boolean = js.native

}
@js.native
@JSName("qx.io.remote.RequestQueue")
object RequestQueue extends js.Object {
    def getInstance(): qx.io.remote.RequestQueue = js.native

}
}
