
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form.core {
@js.native
@JSName("qx.ui.form.core.AbstractVirtualBox")
class AbstractVirtualBox protected () extends qx.ui.core.Widget with qx.ui.form.IForm with qx.ui.form.MForm {
    override def getEnabled(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Boolean = js.native
    def this(model: qx.data.Array = ???) = this()
    protected def _applyDelegate(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyIconOptions(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyIconPath(value: String, old: String): Unit = js.native
    protected def _applyLabelOptions(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyLabelPath(value: String, old: String): Unit = js.native
    protected def _applyMaxListHeight(value: Long, old: Long): Unit = js.native
    protected def _applyModel(value: qx.data.Array, old: qx.data.Array): Unit = js.native
    protected def _applyRowHeight(value: Int, old: Int): Unit = js.native
    protected def _beforeClose(): Unit = js.native
    protected def _beforeOpen(): Unit = js.native
    protected def _getAction(event: qx.event.typ.KeySequence): String = js.native
    protected def _getBindPath(source: String, path: String = ???): String = js.native
    protected def _handleKeyboard(event: qx.event.typ.KeySequence): Unit = js.native
    protected def _handlePointer(event: qx.event.typ.Pointer): Unit = js.native
    protected def _isModifierPressed(event: qx.event.typ.KeySequence): Boolean = js.native
    protected def _onBlur(event: qx.event.typ.Focus): Unit = js.native
    protected def _onPopupChangeVisibility(event: qx.event.typ.Data): Unit = js.native
    protected def _onResize(event: qx.event.typ.Data): Unit = js.native
    def close(): Unit = js.native
    def getDelegate(): js.Dynamic = js.native
    def getIconOptions(): js.Dynamic = js.native
    def getIconPath(): String = js.native
    def getItemHeight(): Int = js.native
    def getLabelOptions(): js.Dynamic = js.native
    def getLabelPath(): String = js.native
    def getMaxListHeight(): Long = js.native
    def getModel(): qx.data.Array = js.native
    protected def initDelegate(value: js.Any): js.Dynamic = js.native
    protected def initIconOptions(value: js.Any): js.Dynamic = js.native
    protected def initIconPath(value: String): String = js.native
    protected def initItemHeight(value: Int): Int = js.native
    protected def initLabelOptions(value: js.Any): js.Dynamic = js.native
    protected def initLabelPath(value: String): String = js.native
    protected def initMaxListHeight(value: Long): Long = js.native
    protected def initModel(value: qx.data.Array): qx.data.Array = js.native
    def open(): Unit = js.native
    def refresh(): Unit = js.native
    def resetDelegate(): Unit = js.native
    def resetIconOptions(): Unit = js.native
    def resetIconPath(): Unit = js.native
    def resetItemHeight(): Unit = js.native
    def resetLabelOptions(): Unit = js.native
    def resetLabelPath(): Unit = js.native
    def resetMaxListHeight(): Unit = js.native
    def resetModel(): Unit = js.native
    def setDelegate(value: js.Any): js.Dynamic = js.native
    def setIconOptions(value: js.Any): js.Dynamic = js.native
    def setIconPath(value: String): String = js.native
    def setItemHeight(value: Int): Int = js.native
    def setLabelOptions(value: js.Any): js.Dynamic = js.native
    def setLabelPath(value: String): String = js.native
    def setMaxListHeight(value: Long): Long = js.native
    def setModel(value: qx.data.Array): qx.data.Array = js.native
    def toggle(): Unit = js.native

}
}
