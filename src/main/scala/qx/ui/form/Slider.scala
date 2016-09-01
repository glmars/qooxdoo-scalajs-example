
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
@JSName("qx.ui.form.Slider")
class Slider protected () extends qx.ui.core.Widget with qx.ui.form.IForm with qx.ui.form.INumberForm with qx.ui.form.IRange with qx.ui.form.MForm {
    override def getEnabled(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Boolean = js.native
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
    def this(orientation: String = ???) = this()
    protected def _applyKnobFactor(value: Long, old: Long): Unit = js.native
    protected def _applyMaximum(value: Int, old: Int): Unit = js.native
    protected def _applyMinimum(value: Int, old: Int): Unit = js.native
    protected def _applyOrientation(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyValue(value: js.Any, old: js.Any): Unit = js.native
    protected def _fireValue(): Unit = js.native
    protected def _onInterval(e: qx.event.typ.Event): Unit = js.native
    protected def _onKeyPress(e: qx.event.typ.KeySequence): Unit = js.native
    protected def _onPointerDown(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onPointerMove(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onPointerOut(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onPointerOver(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onPointerUp(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onRoll(e: qx.event.typ.Roll): Unit = js.native
    protected def _onUpdate(e: qx.event.typ.Data): Unit = js.native
    protected def _positionToValue(position: Int): Int = js.native
    protected def _setKnobPosition(position: Int): Unit = js.native
    protected def _updateKnobPosition(): Unit = js.native
    protected def _updateKnobSize(): Unit = js.native
    protected def _valueToPosition(value: Int): Int = js.native
    def getKnobFactor(): Long = js.native
    def getOrientation(): js.Dynamic = js.native
    protected def initKnobFactor(value: Long): Long = js.native
    protected def initMaximum(value: Int): Int = js.native
    protected def initMinimum(value: Int): Int = js.native
    protected def initOrientation(value: js.Any): js.Dynamic = js.native
    protected def initPageStep(value: Int): Int = js.native
    protected def initSingleStep(value: Int): Int = js.native
    protected def initValue(value: js.Any): js.Dynamic = js.native
    def resetKnobFactor(): Unit = js.native
    def resetMaximum(): Unit = js.native
    def resetMinimum(): Unit = js.native
    def resetOrientation(): Unit = js.native
    def resetPageStep(): Unit = js.native
    def resetSingleStep(): Unit = js.native
    def setKnobFactor(value: Long): Long = js.native
    def setOrientation(value: js.Any): js.Dynamic = js.native
    def slideBack(): Unit = js.native
    def slideBy(offset: Int, duration: Long): Unit = js.native
    def slideForward(): Unit = js.native
    def slidePageBack(duration: Long): Unit = js.native
    def slidePageForward(duration: Long): Unit = js.native
    def slideTo(value: Int, duration: Long): Unit = js.native
    def slideToBegin(duration: Long): Unit = js.native
    def slideToEnd(duration: Long): Unit = js.native
    def stopSlideAnimation(): Unit = js.native
    def updatePosition(value: Long): Unit = js.native

}
}
