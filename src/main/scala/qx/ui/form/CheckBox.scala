
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
@JSName("qx.ui.form.CheckBox")
class CheckBox protected () extends qx.ui.form.ToggleButton with qx.ui.form.IForm with qx.ui.form.IModel with qx.ui.form.MForm with qx.ui.form.MModelProperty {
    override def getEnabled(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Boolean = js.native
    def this(label: String = ???) = this()

}
}
