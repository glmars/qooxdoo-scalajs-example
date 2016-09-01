
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form.validation {
@js.native
@JSName("qx.ui.form.validation.Manager")
class Manager extends qx.core.Object {
    protected def _setValid(value: Boolean): Unit = js.native
    protected def _showToolTip(valid: Boolean): Unit = js.native
    def add(formItem: qx.ui.core.Widget, validator: js.Function, context: js.Any = ???): Unit = js.native
    def getContext(): js.Dynamic = js.native
    def getInvalidFormItems(): js.Array[js.Any] = js.native
    def getInvalidMessage(): String = js.native
    def getInvalidMessages(): js.Array[String] = js.native
    def getItems(): js.Array[js.Any] = js.native
    def getRequiredFieldMessage(): String = js.native
    def getValid(): Boolean = js.native
    def getValidator(): js.Dynamic = js.native
    protected def initContext(value: js.Any): js.Dynamic = js.native
    protected def initInvalidMessage(value: String): String = js.native
    protected def initRequiredFieldMessage(value: String): String = js.native
    protected def initValidator(value: js.Any): js.Dynamic = js.native
    def isValid(): Boolean = js.native
    def remove(formItem: qx.ui.core.Widget): qx.ui.core.Widget = js.native
    def reset(): Unit = js.native
    def resetContext(): Unit = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequiredFieldMessage(): Unit = js.native
    def resetValidator(): Unit = js.native
    def setContext(value: js.Any): js.Dynamic = js.native
    def setFormValid(valid: Boolean): Unit = js.native
    def setInvalidMessage(value: String): String = js.native
    def setItemValid(formItem: qx.ui.core.Widget, valid: Boolean): Unit = js.native
    def setRequiredFieldMessage(value: String): String = js.native
    def setValidator(value: js.Any): js.Dynamic = js.native
    def validate(): Boolean = js.native

}
}
