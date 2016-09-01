
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
@JSName("qx.ui.form.Spinner")
class Spinner protected () extends qx.ui.core.Widget with qx.ui.form.INumberForm with qx.ui.form.IRange with qx.ui.form.IForm with qx.ui.core.MContentPadding with qx.ui.form.MForm {
    override def getValue(): Long = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: Long): Unit = js.native
    override def getMaximum(): Long = js.native
    override def getMinimum(): Long = js.native
    override def getPageStep(): Long = js.native
    override def getSingleStep(): Long = js.native
    override def setMaximum(max: Long): Unit = js.native
    override def setMinimum(min: Long): Unit = js.native
    override def setPageStep(step: Long): Unit = js.native
    override def setSingleStep(step: Long): Unit = js.native
    override def getEnabled(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Boolean = js.native
    def this(min: Long = ???, value: Long = ???, max: Long = ???) = this()
    protected def _applyEditable(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyMaximum(value: Long, old: Long): Unit = js.native
    protected def _applyMinimum(value: Long, old: Long): Unit = js.native
    protected def _applyNumberFormat(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyValue(value: Long, old: Long): Unit = js.native
    protected def _applyWrap(value: Boolean, old: Boolean): Unit = js.native
    protected def _checkValue(value: js.Any): Boolean = js.native
    protected def _countDown(): Unit = js.native
    protected def _countUp(): Unit = js.native
    protected def _getContentPaddingTarget(): qx.ui.core.Widget = js.native
    protected def _getFilterRegExp(): js.RegExp = js.native
    protected def _onChangeLocale(ev: qx.event.`type`.Event): Unit = js.native
    protected def _onChangeNumberFormat(ev: qx.event.`type`.Event): Unit = js.native
    protected def _onKeyDown(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onKeyUp(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onRoll(e: qx.event.`type`.Roll): Unit = js.native
    protected def _onTextChange(e: qx.event.`type`.Event): Unit = js.native
    protected def _updateButtons(): Unit = js.native
    def getEditable(): Boolean = js.native
    def getNumberFormat(): qx.util.format.NumberFormat = js.native
    def getWrap(): Boolean = js.native
    def gotoValue(value: Long): Long = js.native
    protected def initEditable(value: Boolean): Boolean = js.native
    protected def initMaximum(value: Long): Long = js.native
    protected def initMinimum(value: Long): Long = js.native
    protected def initNumberFormat(value: qx.util.format.NumberFormat): qx.util.format.NumberFormat = js.native
    protected def initPageStep(value: Long): Long = js.native
    protected def initSingleStep(value: Long): Long = js.native
    protected def initValue(value: js.Any): js.Dynamic = js.native
    protected def initWrap(value: Boolean): Boolean = js.native
    def isEditable(): Boolean = js.native
    def isWrap(): Boolean = js.native
    def resetEditable(): Unit = js.native
    def resetMaximum(): Unit = js.native
    def resetMinimum(): Unit = js.native
    def resetNumberFormat(): Unit = js.native
    def resetPageStep(): Unit = js.native
    def resetSingleStep(): Unit = js.native
    def resetWrap(): Unit = js.native
    def setEditable(value: Boolean): Boolean = js.native
    def setNumberFormat(value: qx.util.format.NumberFormat): qx.util.format.NumberFormat = js.native
    def setWrap(value: Boolean): Boolean = js.native
    def toggleEditable(): Boolean = js.native
    def toggleWrap(): Boolean = js.native

}
}
