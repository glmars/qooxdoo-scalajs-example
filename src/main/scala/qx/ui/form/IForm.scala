
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
trait IForm extends js.Object {
    def getEnabled(): Boolean
    def getInvalidMessage(): String
    def getRequired(): Boolean
    def getRequiredInvalidMessage(): String
    def getValid(): Boolean
    def setEnabled(enabled: Boolean): Boolean
    def setInvalidMessage(message: String): String
    def setRequired(required: Boolean): Boolean
    def setRequiredInvalidMessage(message: String): String
    def setValid(valid: Boolean): Boolean

}
}
