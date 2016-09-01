
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
@JSName("qx.ui.form.MForm")
trait MForm extends js.Object {
    protected def _applyValid(value: Boolean, old: Boolean): Unit = js.native
    def getInvalidMessage(): String = js.native
    def getRequired(): Boolean = js.native
    def getRequiredInvalidMessage(): String = js.native
    def getValid(): Boolean = js.native
    protected def initInvalidMessage(value: String): String = js.native
    protected def initRequired(value: Boolean): Boolean = js.native
    protected def initRequiredInvalidMessage(value: String): String = js.native
    protected def initValid(value: Boolean): Boolean = js.native
    def isRequired(): Boolean = js.native
    def isValid(): Boolean = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequired(): Unit = js.native
    def resetRequiredInvalidMessage(): Unit = js.native
    def resetValid(): Unit = js.native
    def setInvalidMessage(value: String): String = js.native
    def setRequired(value: Boolean): Boolean = js.native
    def setRequiredInvalidMessage(value: String): String = js.native
    def setValid(value: Boolean): Boolean = js.native
    def toggleRequired(): Boolean = js.native
    def toggleValid(): Boolean = js.native

}
}
