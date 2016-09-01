
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form.renderer {
@js.native
@JSName("qx.ui.form.renderer.AbstractRenderer")
class AbstractRenderer protected () extends qx.ui.core.Widget with qx.ui.form.renderer.IFormRenderer {
    override def addButton(button: qx.ui.form.Button, options: js.Any = ???): Unit = js.native
    override def addItems(items: js.Array[qx.ui.core.Widget], names: js.Array[String], title: String = ???, itemsOptions: js.Array[js.Any] = ???, headerOptions: js.Any = ???): Unit = js.native
    def this(form: qx.ui.form.Form = ???) = this()
    protected def _connectVisibility(item: qx.ui.core.Widget, label: qx.ui.basic.Label): Unit = js.native
    protected def _createLabelText(name: String, item: qx.ui.form.IForm): String = js.native
    protected def _onChangeLocale(e: qx.event.`type`.Event): Unit = js.native
    protected def _onFormChange(): Unit = js.native
    protected def _render(): Unit = js.native

}
}
