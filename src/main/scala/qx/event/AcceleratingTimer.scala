
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event {
@js.native
@JSName("qx.event.AcceleratingTimer")
class AcceleratingTimer extends qx.core.Object {
    protected def _onInterval(): Unit = js.native
    def getDecrease(): Int = js.native
    def getFirstInterval(): Int = js.native
    def getInterval(): Int = js.native
    def getMinimum(): Int = js.native
    protected def initDecrease(value: Int): Int = js.native
    protected def initFirstInterval(value: Int): Int = js.native
    protected def initInterval(value: Int): Int = js.native
    protected def initMinimum(value: Int): Int = js.native
    def resetDecrease(): Unit = js.native
    def resetFirstInterval(): Unit = js.native
    def resetInterval(): Unit = js.native
    def resetMinimum(): Unit = js.native
    def setDecrease(value: Int): Int = js.native
    def setFirstInterval(value: Int): Int = js.native
    def setInterval(value: Int): Int = js.native
    def setMinimum(value: Int): Int = js.native
    def start(): Unit = js.native
    def stop(): Unit = js.native

}
}
