
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
@JSName("qx.ui.form.AbstractField")
class AbstractField protected () extends qx.ui.core.Widget with qx.ui.form.IStringForm with qx.ui.form.IForm with qx.ui.form.MForm {
    override def getValue(): String = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: String): Unit = js.native
    override def getEnabled(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Boolean = js.native
    def this(value: String = ???) = this()
    protected def _applyMaxLength(value: Int, old: Int): Unit = js.native
    protected def _applyPlaceholder(value: String, old: String): Unit = js.native
    protected def _applyReadOnly(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyTextAlign(value: js.Any, old: js.Any): Unit = js.native
    protected def _createInputElement(): qx.html.Input = js.native
    protected def _getPlaceholderElement(): Unit = js.native
    protected def _getTextSize(): js.Dynamic = js.native
    protected def _onChangeContent(e: qx.event.typ.Data): Unit = js.native
    protected def _onChangeLocale(e: qx.event.typ.Event): Unit = js.native
    protected def _onHtmlInput(e: qx.event.typ.Data): Unit = js.native
    protected def _onPointerDownPlaceholder(): Unit = js.native
    protected def _onWebFontStatusChange(ev: qx.event.typ.Data): Unit = js.native
    protected def _removePlaceholder(): Unit = js.native
    protected def _renderContentElement(innerHeight: Int, element: HTMLElement): Unit = js.native
    protected def _showPlaceholder(): Unit = js.native
    protected def _syncPlaceholder(): Unit = js.native
    def clearTextSelection(): Unit = js.native
    def getFilter(): js.RegExp = js.native
    def getLiveUpdate(): Boolean = js.native
    def getMaxLength(): Int = js.native
    def getPlaceholder(): String = js.native
    def getReadOnly(): Boolean = js.native
    def getTextAlign(): js.Dynamic = js.native
    def getTextSelection(): String = js.native
    def getTextSelectionEnd(): Int = js.native
    def getTextSelectionLength(): Int = js.native
    def getTextSelectionStart(): Int = js.native
    protected def initFilter(value: js.RegExp): js.RegExp = js.native
    protected def initLiveUpdate(value: Boolean): Boolean = js.native
    protected def initMaxLength(value: Int): Int = js.native
    protected def initPlaceholder(value: String): String = js.native
    protected def initReadOnly(value: Boolean): Boolean = js.native
    protected def initTextAlign(value: js.Any): js.Dynamic = js.native
    def isLiveUpdate(): Boolean = js.native
    def isReadOnly(): Boolean = js.native
    def resetFilter(): Unit = js.native
    def resetLiveUpdate(): Unit = js.native
    def resetMaxLength(): Unit = js.native
    def resetPlaceholder(): Unit = js.native
    def resetReadOnly(): Unit = js.native
    def resetTextAlign(): Unit = js.native
    def selectAllText(): Unit = js.native
    def setFilter(value: js.RegExp): js.RegExp = js.native
    def setLiveUpdate(value: Boolean): Boolean = js.native
    def setMaxLength(value: Int): Int = js.native
    def setPlaceholder(value: String): String = js.native
    def setReadOnly(value: Boolean): Boolean = js.native
    def setTextAlign(value: js.Any): js.Dynamic = js.native
    def setTextSelection(start: Int, end: Int): Unit = js.native
    def toggleLiveUpdate(): Boolean = js.native
    def toggleReadOnly(): Boolean = js.native

}
@js.native
@JSName("qx.ui.form.AbstractField")
object AbstractField extends js.Object {

}
}
