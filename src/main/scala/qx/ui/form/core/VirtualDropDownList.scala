
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form.core {
@js.native
@JSName("qx.ui.form.core.VirtualDropDownList")
class VirtualDropDownList protected () extends qx.ui.popup.Popup {
    def this(target: qx.ui.form.core.AbstractVirtualBox = ???) = this()
    protected def _applySelection(value: qx.data.Array, old: qx.data.Array): Unit = js.native
    protected def _handleKeyboard(event: qx.event.typ.KeySequence): Unit = js.native
    protected def _handlePointer(event: qx.event.typ.Mouse): Unit = js.native
    protected def _onChangeDelegate(event: qx.event.typ.Data): Unit = js.native
    protected def _onChangeModel(event: qx.event.typ.Data): Unit = js.native
    protected def _onListChangeSelection(event: qx.event.typ.Data): Unit = js.native
    def close(): Unit = js.native
    def getSelection(): qx.data.Array = js.native
    protected def initSelection(value: qx.data.Array): qx.data.Array = js.native
    def open(): Unit = js.native
    def resetSelection(): Unit = js.native
    def setPreselected(modelItem: js.Any): Unit = js.native
    def setSelection(value: qx.data.Array): qx.data.Array = js.native

}
}
