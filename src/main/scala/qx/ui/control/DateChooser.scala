
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.control {
@js.native
@JSName("qx.ui.control.DateChooser")
class DateChooser protected () extends qx.ui.core.Widget with qx.ui.form.IExecutable with qx.ui.form.IForm with qx.ui.form.IDateForm with qx.ui.core.MExecutable with qx.ui.form.MForm {
    override def getEnabled(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Boolean = js.native
    override def getValue(): js.Date = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: js.Date): Unit = js.native
    def this(date: js.Date = ???) = this()
    protected def _applyValue(value: js.Date, old: js.Date): Unit = js.native
    protected def _onDayDblTap(): Unit = js.native
    protected def _onDayTap(evt: qx.event.typ.Data): Unit = js.native
    protected def _onKeyPress(evt: qx.event.typ.Data): Unit = js.native
    protected def _onNavButtonTap(evt: qx.event.typ.Data): Unit = js.native
    protected def _onPointerUpDown(e: qx.event.typ.Pointer): Unit = js.native
    protected def _updateDatePane(): Unit = js.native
    def getShownMonth(): Int = js.native
    def getShownYear(): Int = js.native
    def handleKeyPress(e: qx.event.typ.Data): Unit = js.native
    protected def initShownMonth(value: Int): Int = js.native
    protected def initShownYear(value: Int): Int = js.native
    protected def initValue(value: js.Date): js.Date = js.native
    def resetShownMonth(): Unit = js.native
    def resetShownYear(): Unit = js.native
    def setShownMonth(value: Int): Int = js.native
    def setShownYear(value: Int): Int = js.native
    def showMonth(month: Int = ???, year: Int = ???): Unit = js.native

}
}
