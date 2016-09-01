
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
@JSName("qx.ui.form.HoverButton")
class HoverButton protected () extends qx.ui.basic.Atom with qx.ui.form.IExecutable with qx.ui.core.MExecutable {
    def this(label: String = ???, icon: String = ???) = this()
    protected def _onInterval(): Unit = js.native
    protected def _onPointerOut(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onPointerOver(e: qx.event.typ.Pointer): Unit = js.native
    def getFirstInterval(): Int = js.native
    def getInterval(): Int = js.native
    def getMinTimer(): Int = js.native
    def getTimerDecrease(): Int = js.native
    protected def initFirstInterval(value: Int): Int = js.native
    protected def initInterval(value: Int): Int = js.native
    protected def initMinTimer(value: Int): Int = js.native
    protected def initTimerDecrease(value: Int): Int = js.native
    def resetFirstInterval(): Unit = js.native
    def resetInterval(): Unit = js.native
    def resetMinTimer(): Unit = js.native
    def resetTimerDecrease(): Unit = js.native
    def setFirstInterval(value: Int): Int = js.native
    def setInterval(value: Int): Int = js.native
    def setMinTimer(value: Int): Int = js.native
    def setTimerDecrease(value: Int): Int = js.native

}
}
