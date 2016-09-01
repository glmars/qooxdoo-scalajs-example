
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
@JSName("qx.ui.form.RadioGroup")
class RadioGroup protected () extends qx.core.Object with qx.ui.core.ISingleSelection with qx.ui.form.IForm with qx.ui.form.IModelSelection with qx.ui.core.MSingleSelectionHandling with qx.ui.form.MModelSelection {
    override def getEnabled(): Boolean = js.native
    override def getInvalidMessage(): String = js.native
    override def getRequired(): Boolean = js.native
    override def getRequiredInvalidMessage(): String = js.native
    override def getValid(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Boolean = js.native
    override def setInvalidMessage(message: String): String = js.native
    override def setRequired(required: Boolean): Boolean = js.native
    override def setRequiredInvalidMessage(message: String): String = js.native
    override def setValid(valid: Boolean): Boolean = js.native
    def this(varargs: qx.core.Object = ???) = this()
    protected def _applyAllowEmptySelection(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyEnabled(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyInvalidMessage(value: String, old: String): Unit = js.native
    protected def _applyValid(value: Boolean, old: Boolean): Unit = js.native
    protected def _getItems(): js.Array[qx.ui.form.IRadioItem] = js.native
    protected def _isAllowEmptySelection(): Boolean = js.native
    protected def _isItemSelectable(item: qx.ui.form.IRadioItem): Boolean = js.native
    protected def _onItemChangeChecked(e: qx.event.typ.Data): Unit = js.native
    def add(varargs: qx.ui.form.IRadioItem = ???): Unit = js.native
    def getAllowEmptySelection(): Boolean = js.native
    def getChildren(): js.Array[qx.ui.form.IRadioItem] = js.native
    def getItems(): js.Array[qx.ui.form.IRadioItem] = js.native
    def getWrap(): Boolean = js.native
    protected def initAllowEmptySelection(value: Boolean): Boolean = js.native
    protected def initEnabled(value: Boolean): Boolean = js.native
    protected def initInvalidMessage(value: String): String = js.native
    protected def initRequired(value: Boolean): Boolean = js.native
    protected def initRequiredInvalidMessage(value: String): String = js.native
    protected def initValid(value: Boolean): Boolean = js.native
    protected def initWrap(value: Boolean): Boolean = js.native
    def isAllowEmptySelection(): Boolean = js.native
    def isEnabled(): Boolean = js.native
    def isRequired(): Boolean = js.native
    def isValid(): Boolean = js.native
    def isWrap(): Boolean = js.native
    def remove(item: qx.ui.form.IRadioItem): Unit = js.native
    def resetAllowEmptySelection(): Unit = js.native
    def resetEnabled(): Unit = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequired(): Unit = js.native
    def resetRequiredInvalidMessage(): Unit = js.native
    def resetValid(): Unit = js.native
    def resetWrap(): Unit = js.native
    def selectNext(): Unit = js.native
    def selectPrevious(): Unit = js.native
    def setAllowEmptySelection(value: Boolean): Boolean = js.native
    def setWrap(value: Boolean): Boolean = js.native
    def toggleAllowEmptySelection(): Boolean = js.native
    def toggleEnabled(): Boolean = js.native
    def toggleRequired(): Boolean = js.native
    def toggleValid(): Boolean = js.native
    def toggleWrap(): Boolean = js.native

}
}
