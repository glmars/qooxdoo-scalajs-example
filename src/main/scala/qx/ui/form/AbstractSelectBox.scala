
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
@JSName("qx.ui.form.AbstractSelectBox")
class AbstractSelectBox extends qx.ui.core.Widget with qx.ui.form.IForm with qx.ui.core.MRemoteChildrenHandling with qx.ui.form.MForm {
    override def getEnabled(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Boolean = js.native
    protected def _applyMaxListHeight(value: Long, old: Long): Unit = js.native
    protected def _defaultFormat(item: js.Any): String = js.native
    protected def _onBlur(e: qx.event.typ.Focus): Unit = js.native
    protected def _onKeyPress(e: qx.event.typ.KeySequence): Unit = js.native
    protected def _onListChangeSelection(e: qx.event.typ.Data): Unit = js.native
    protected def _onListPointerDown(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onPopupChangeVisibility(e: qx.event.typ.Data): Unit = js.native
    protected def _onResize(e: qx.event.typ.Data): Unit = js.native
    def close(): Unit = js.native
    def getFormat(): js.Function = js.native
    def getMaxListHeight(): Long = js.native
    protected def initFormat(value: js.Function): js.Function = js.native
    protected def initMaxListHeight(value: Long): Long = js.native
    def open(): Unit = js.native
    def resetFormat(): Unit = js.native
    def resetMaxListHeight(): Unit = js.native
    def setFormat(value: js.Function): js.Function = js.native
    def setMaxListHeight(value: Long): Long = js.native
    def toggle(): Unit = js.native

}
}
