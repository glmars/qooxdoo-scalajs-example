
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event {
@js.native
@JSName("qx.event.Timer")
class Timer protected () extends qx.core.Object {
    def this(interval: Long = ???) = this()
    protected def _applyEnabled(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyInterval(value: js.Any, old: js.Any): Unit = js.native
    protected def _oninterval(): Unit = js.native
    def getEnabled(): Boolean = js.native
    def getInterval(): Int = js.native
    protected def initEnabled(value: Boolean): Boolean = js.native
    protected def initInterval(value: Int): Int = js.native
    def isEnabled(): Boolean = js.native
    def resetEnabled(): Unit = js.native
    def resetInterval(): Unit = js.native
    def restart(): Unit = js.native
    def restartWith(interval: Int): Unit = js.native
    def setEnabled(value: Boolean): Boolean = js.native
    def setInterval(value: Int): Int = js.native
    def start(): Unit = js.native
    def startWith(interval: Int): Unit = js.native
    def stop(): Unit = js.native
    def toggleEnabled(): Boolean = js.native

}
@js.native
@JSName("qx.event.Timer")
object Timer extends js.Object {
    def once(func: js.Function, obj: js.Any, timeout: Long): qx.event.Timer = js.native

}
}
