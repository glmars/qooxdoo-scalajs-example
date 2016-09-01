
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
@JSName("qx.ui.form.ComboBox")
class ComboBox extends qx.ui.form.AbstractSelectBox with qx.ui.form.IStringForm {
    override def getValue(): String = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: String): Unit = js.native
    protected def _applyPlaceholder(value: String, old: String): Unit = js.native
    protected def _onTap(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onTextFieldChangeValue(e: qx.event.typ.Data): Unit = js.native
    protected def _setPreselectedItem(): Unit = js.native
    def clearTextSelection(): Unit = js.native
    def getPlaceholder(): String = js.native
    def getTextSelection(): String = js.native
    def getTextSelectionLength(): Int = js.native
    protected def initPlaceholder(value: String): String = js.native
    def resetAllTextSelection(): Unit = js.native
    def resetPlaceholder(): Unit = js.native
    def selectAllText(): Unit = js.native
    def setPlaceholder(value: String): String = js.native
    def setTextSelection(start: Int, end: Int): Unit = js.native

}
}
