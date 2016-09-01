
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.RadioButton")
class RadioButton protected () extends qx.ui.menu.AbstractButton with qx.ui.form.IRadioItem with qx.ui.form.IBooleanForm with qx.ui.form.IModel with qx.ui.form.MModelProperty {
    override def getGroup(): qx.ui.form.RadioGroup = js.native
    override def getValue(): Boolean = js.native
    override def setGroup(value: qx.ui.form.RadioGroup): Unit = js.native
    override def setValue(value: Boolean): Unit = js.native
    override def resetValue(): Unit = js.native
    def this(label: String = ???, menu: qx.ui.menu.Menu = ???) = this()
    protected def _applyGroup(value: qx.ui.form.RadioGroup, old: qx.ui.form.RadioGroup): Unit = js.native
    protected def _applyValue(value: Boolean, old: Boolean): Unit = js.native
    protected def _onExecute(e: qx.event.typ.Event): Unit = js.native
    protected def initGroup(value: qx.ui.form.RadioGroup): qx.ui.form.RadioGroup = js.native
    protected def initValue(value: Boolean): Boolean = js.native
    def isValue(): Boolean = js.native
    def resetGroup(): Unit = js.native
    def toggleValue(): Boolean = js.native

}
}
