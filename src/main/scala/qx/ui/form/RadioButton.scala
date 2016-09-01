
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
@JSName("qx.ui.form.RadioButton")
class RadioButton protected () extends qx.ui.form.Button with qx.ui.form.IRadioItem with qx.ui.form.IForm with qx.ui.form.IBooleanForm with qx.ui.form.IModel with qx.ui.form.MForm with qx.ui.form.MModelProperty {
    override def getGroup(): qx.ui.form.RadioGroup = js.native
    override def getValue(): Boolean = js.native
    override def setGroup(value: qx.ui.form.RadioGroup): Unit = js.native
    override def setValue(value: Boolean): Unit = js.native
    override def getEnabled(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Boolean = js.native
    override def resetValue(): Unit = js.native
    def this(label: String = ???) = this()
    protected def _applyGroup(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyValue(value: Boolean, old: Boolean): Unit = js.native
    protected def _onExecute(e: qx.event.typ.Event): Unit = js.native
    protected def _onKeyPress(e: qx.event.typ.KeySequence): Unit = js.native
    protected def initGroup(value: qx.ui.form.RadioGroup): qx.ui.form.RadioGroup = js.native
    protected def initValue(value: Boolean): Boolean = js.native
    def isValue(): Boolean = js.native
    def resetGroup(): Unit = js.native
    def toggleValue(): Boolean = js.native

}
}
