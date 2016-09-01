
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.RadioButton")
class RadioButton extends qx.ui.toolbar.CheckBox with qx.ui.form.IModel with qx.ui.form.IRadioItem with qx.ui.form.MModelProperty {
    override def getGroup(): qx.ui.form.RadioGroup = js.native
    override def getValue(): Boolean = js.native
    override def setGroup(value: qx.ui.form.RadioGroup): Unit = js.native
    override def setValue(value: Boolean): Unit = js.native

}
}
