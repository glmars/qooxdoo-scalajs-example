
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
@JSName("qx.ui.form.Button")
class Button protected () extends qx.ui.basic.Atom with qx.ui.form.IExecutable with qx.ui.core.MExecutable {
    def this(label: String = ???, icon: String = ???, command: qx.ui.command.Command = ???) = this()
    protected def _onKeyDown(e: qx.event.typ.Event): Unit = js.native
    protected def _onKeyUp(e: qx.event.typ.Event): Unit = js.native
    protected def _onPointerDown(e: qx.event.typ.Event): Unit = js.native
    protected def _onPointerOut(e: qx.event.typ.Event): Unit = js.native
    protected def _onPointerOver(e: qx.event.typ.Event): Unit = js.native
    protected def _onPointerUp(e: qx.event.typ.Event): Unit = js.native
    protected def _onTap(e: qx.event.typ.Pointer): Unit = js.native
    def press(): Unit = js.native
    def release(): Unit = js.native
    def reset(): Unit = js.native

}
}
