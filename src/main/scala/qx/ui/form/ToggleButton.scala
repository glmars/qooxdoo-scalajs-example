
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
@JSName("qx.ui.form.ToggleButton")
class ToggleButton protected () extends qx.ui.basic.Atom with qx.ui.form.IBooleanForm with qx.ui.form.IExecutable with qx.ui.form.IRadioItem with qx.ui.core.MExecutable {
    override def getValue(): Boolean = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: Boolean): Unit = js.native
    override def getGroup(): qx.ui.form.RadioGroup = js.native
    override def setGroup(value: qx.ui.form.RadioGroup): Unit = js.native
    def this(label: String = ???, icon: String = ???) = this()
    protected def _applyGroup(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyTriState(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyValue(value: Boolean, old: Boolean): Unit = js.native
    protected def _onExecute(e: qx.event.`type`.Event): Unit = js.native
    protected def _onKeyDown(e: qx.event.`type`.Event): Unit = js.native
    protected def _onKeyUp(e: qx.event.`type`.Event): Unit = js.native
    protected def _onPointerDown(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerOut(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerOver(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerUp(e: qx.event.`type`.Pointer): Unit = js.native
    def getTriState(): Boolean = js.native
    protected def initGroup(value: qx.ui.form.RadioGroup): qx.ui.form.RadioGroup = js.native
    protected def initTriState(value: Boolean): Boolean = js.native
    protected def initValue(value: Boolean): Boolean = js.native
    def isTriState(): Boolean = js.native
    def isValue(): Boolean = js.native
    def resetGroup(): Unit = js.native
    def resetTriState(): Unit = js.native
    def setTriState(value: Boolean): Boolean = js.native
    def toggleTriState(): Boolean = js.native
    def toggleValue(): Boolean = js.native

}
}
