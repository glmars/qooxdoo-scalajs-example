
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
@JSName("qx.ui.form.VirtualComboBox")
class VirtualComboBox protected () extends qx.ui.form.core.AbstractVirtualBox with qx.ui.form.IStringForm {
    override def getValue(): String = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: String): Unit = js.native
    def this(model: js.Any = ???) = this()
    protected def _applyPlaceholder(value: String, old: String): Unit = js.native
    def clearTextSelection(): Unit = js.native
    def getDefaultFormat(): js.Function = js.native
    def getPlaceholder(): String = js.native
    def getTextSelection(): String = js.native
    def getTextSelectionLength(): Int = js.native
    protected def initDefaultFormat(value: js.Function): js.Function = js.native
    protected def initPlaceholder(value: String): String = js.native
    protected def initValue(value: js.Any): js.Dynamic = js.native
    def resetAllTextSelection(): Unit = js.native
    def resetDefaultFormat(): Unit = js.native
    def resetPlaceholder(): Unit = js.native
    def selectAllText(): Unit = js.native
    def setDefaultFormat(value: js.Function): js.Function = js.native
    def setPlaceholder(value: String): String = js.native
    def setTextSelection(start: Int, end: Int): Unit = js.native

}
}
