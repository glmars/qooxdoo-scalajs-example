
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.`type` {
@js.native
@JSName("qx.event.type.Rest")
class Rest extends qx.event.`type`.Data {
    def getAction(): String = js.native
    def getId(): Long = js.native
    def getPhase(): String = js.native
    def getRequest(): qx.io.request.AbstractRequest = js.native
    protected def initAction(value: String): String = js.native
    protected def initId(value: Long): Long = js.native
    protected def initPhase(value: String): String = js.native
    protected def initRequest(value: qx.io.request.AbstractRequest): qx.io.request.AbstractRequest = js.native
    def resetAction(): Unit = js.native
    def resetId(): Unit = js.native
    def resetPhase(): Unit = js.native
    def resetRequest(): Unit = js.native
    def setAction(value: String): String = js.native
    def setId(value: Long): Long = js.native
    def setPhase(value: String): String = js.native
    def setRequest(value: qx.io.request.AbstractRequest): qx.io.request.AbstractRequest = js.native

}
}
