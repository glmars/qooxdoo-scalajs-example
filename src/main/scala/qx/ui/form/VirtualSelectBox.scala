
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
@JSName("qx.ui.form.VirtualSelectBox")
class VirtualSelectBox protected () extends qx.ui.form.core.AbstractVirtualBox with qx.data.controller.ISelection {
    override def getSelection(): qx.data.Array = js.native
    override def resetSelection(): Unit = js.native
    override def setSelection(value: qx.data.Array): qx.data.Array = js.native
    def this(model: js.Any = ???) = this()
    protected def _addBindings(): Unit = js.native
    protected def _applySelection(value: qx.data.Array, old: qx.data.Array): Unit = js.native
    protected def _onPointerOut(event: qx.event.typ.Pointer): Unit = js.native
    protected def _onPointerOver(event: qx.event.typ.Pointer): Unit = js.native
    protected def _removeBindings(): Unit = js.native
    protected def initSelection(value: qx.data.Array): qx.data.Array = js.native

}
}
