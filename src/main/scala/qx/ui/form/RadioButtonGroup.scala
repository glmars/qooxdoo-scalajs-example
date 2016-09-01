
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
@JSName("qx.ui.form.RadioButtonGroup")
class RadioButtonGroup protected () extends qx.ui.core.Widget with qx.ui.form.IForm with qx.ui.core.ISingleSelection with qx.ui.form.IModelSelection with qx.ui.core.MLayoutHandling with qx.ui.form.MModelSelection {
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
    override def getSelectables(all: Boolean): js.Array[qx.ui.core.Widget] = js.native
    override def getSelection(): js.Array[qx.ui.core.Widget] = js.native
    override def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    override def isSelectionEmpty(): Boolean = js.native
    override def resetSelection(): Unit = js.native
    override def setSelection(items: js.Array[qx.ui.core.Widget]): Unit = js.native
    def this(layout: qx.ui.layout.Abstract = ???) = this()
    protected def _applyInvalidMessage(value: String, old: String): Unit = js.native
    protected def _applyValid(value: Boolean, old: Boolean): Unit = js.native
    def add(child: qx.ui.core.LayoutItem, options: js.Any = ???): Unit = js.native
    def getChildren(): js.Array[qx.ui.core.LayoutItem] = js.native
    def getRadioGroup(): qx.ui.form.RadioGroup = js.native
    protected def initInvalidMessage(value: String): String = js.native
    protected def initRequired(value: Boolean): Boolean = js.native
    protected def initRequiredInvalidMessage(value: String): String = js.native
    protected def initValid(value: Boolean): Boolean = js.native
    def isRequired(): Boolean = js.native
    def isValid(): Boolean = js.native
    def remove(child: qx.ui.core.LayoutItem): Unit = js.native
    def removeAll(): js.Array[js.Any] = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequired(): Unit = js.native
    def resetRequiredInvalidMessage(): Unit = js.native
    def resetValid(): Unit = js.native
    def toggleRequired(): Boolean = js.native
    def toggleValid(): Boolean = js.native

}
}
