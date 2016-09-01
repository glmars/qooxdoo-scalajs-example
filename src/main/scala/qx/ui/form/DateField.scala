
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
@JSName("qx.ui.form.DateField")
class DateField extends qx.ui.core.Widget with qx.ui.form.IForm with qx.ui.form.IDateForm with qx.ui.core.MRemoteChildrenHandling with qx.ui.form.MForm {
    override def getEnabled(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Boolean = js.native
    override def getValue(): js.Date = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: js.Date): Unit = js.native
    protected def _addLocaleChangeListener(): Unit = js.native
    protected def _applyDateFormat(value: qx.util.format.DateFormat, old: qx.util.format.DateFormat): Unit = js.native
    protected def _applyPlaceholder(value: String, old: String): Unit = js.native
    protected def _onBlur(e: qx.event.typ.Focus): Unit = js.native
    protected def _onChangeDate(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onKeyPress(e: qx.event.typ.KeySequence): Unit = js.native
    protected def _onPopupChangeVisibility(e: qx.event.typ.Data): Unit = js.native
    protected def _onTap(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onTextFieldChangeValue(e: qx.event.typ.Data): Unit = js.native
    protected def _setDefaultDateFormat(): Unit = js.native
    def close(): Unit = js.native
    def getDateFormat(): qx.util.format.DateFormat = js.native
    def getPlaceholder(): String = js.native
    protected def initDateFormat(value: qx.util.format.DateFormat): qx.util.format.DateFormat = js.native
    protected def initPlaceholder(value: String): String = js.native
    def isEmpty(): Boolean = js.native
    def open(): Unit = js.native
    def resetDateFormat(): Unit = js.native
    def resetPlaceholder(): Unit = js.native
    def setDateFormat(value: qx.util.format.DateFormat): qx.util.format.DateFormat = js.native
    def setPlaceholder(value: String): String = js.native
    def toggle(): Unit = js.native

}
@js.native
@JSName("qx.ui.form.DateField")
object DateField extends js.Object {
    def getDefaultDateFormatter(): qx.util.format.DateFormat = js.native

}
}
