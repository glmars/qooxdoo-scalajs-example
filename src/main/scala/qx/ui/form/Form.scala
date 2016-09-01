
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
@JSName("qx.ui.form.Form")
class Form extends qx.core.Object {
    protected def _createResetter(): qx.ui.form.Resetter = js.native
    protected def _createValidationManager(): qx.ui.form.validation.Manager = js.native
    def add(item: qx.ui.form.IForm, label: String, validator: js.Function = ???, name: String = ???, validatorContext: js.Any = ???, options: js.Any = ???): Unit = js.native
    def addButton(button: qx.ui.form.Button, options: js.Any = ???): Unit = js.native
    def addGroupHeader(title: String, options: js.Any = ???): Unit = js.native
    def getButtonOptions(): js.Array[js.Any] = js.native
    def getButtons(): js.Array[js.Any] = js.native
    def getGroups(): js.Array[js.Any] = js.native
    def getItems(): js.Dynamic = js.native
    def getValidationManager(): qx.ui.form.validation.Manager = js.native
    def redefineResetter(): Unit = js.native
    def redefineResetterItem(item: qx.ui.core.Widget): Unit = js.native
    def remove(item: qx.ui.form.IForm): Boolean = js.native
    def removeButton(button: qx.ui.form.Button): Boolean = js.native
    def removeGroupHeader(title: String): Boolean = js.native
    def reset(): Unit = js.native
    def validate(): Boolean = js.native

}
}
