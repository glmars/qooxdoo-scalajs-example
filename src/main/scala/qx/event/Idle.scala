
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event {
@js.native
@JSName("qx.event.Idle")
class Idle extends qx.core.Object {
    protected def _applyTimeoutInterval(value: Long, old: Long): Unit = js.native
    protected def _onInterval(): Unit = js.native
    def getTimeoutInterval(): Long = js.native
    protected def initTimeoutInterval(value: Long): Long = js.native
    def resetTimeoutInterval(): Unit = js.native
    def setTimeoutInterval(value: Long): Long = js.native

}
@js.native
@JSName("qx.event.Idle")
object Idle extends js.Object {
    def getInstance(): qx.event.Idle = js.native

}
}
