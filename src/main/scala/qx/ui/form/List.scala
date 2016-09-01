
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
@JSName("qx.ui.form.List")
class List protected () extends qx.ui.core.scroll.AbstractScrollArea with qx.ui.core.IMultiSelection with qx.ui.form.IForm with qx.ui.form.IModelSelection with qx.ui.core.MRemoteChildrenHandling with qx.ui.core.MMultiSelectionHandling with qx.ui.form.MForm with qx.ui.form.MModelSelection {
    override def getEnabled(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Boolean = js.native
    def this(horizontal: Boolean = ???) = this()
    protected def _applyOrientation(value: js.Any, old: js.Any): Unit = js.native
    protected def _applySpacing(value: Int, old: Int): Unit = js.native
    protected def _createListItemContainer(): qx.ui.container.Composite = js.native
    protected def _onAddChild(e: qx.event.typ.Data): Unit = js.native
    protected def _onKeyInput(e: qx.event.typ.KeyInput): Unit = js.native
    protected def _onKeyPress(e: qx.event.typ.KeySequence): Boolean = js.native
    protected def _onRemoveChild(e: qx.event.typ.Data): Unit = js.native
    def findItem(search: String, ignoreCase: Boolean = ???): qx.ui.form.ListItem = js.native
    def findItemByLabelFuzzy(search: String): qx.ui.form.ListItem = js.native
    def getEnableInlineFind(): Boolean = js.native
    def getOrientation(): js.Dynamic = js.native
    def getSpacing(): Int = js.native
    def handleKeyPress(e: qx.event.typ.KeySequence): Unit = js.native
    protected def initEnableInlineFind(value: Boolean): Boolean = js.native
    protected def initOrientation(value: js.Any): js.Dynamic = js.native
    protected def initSpacing(value: Int): Int = js.native
    def isEnableInlineFind(): Boolean = js.native
    def resetEnableInlineFind(): Unit = js.native
    def resetOrientation(): Unit = js.native
    def resetSpacing(): Unit = js.native
    def setEnableInlineFind(value: Boolean): Boolean = js.native
    def setOrientation(value: js.Any): js.Dynamic = js.native
    def setSpacing(value: Int): Int = js.native
    def toggleEnableInlineFind(): Boolean = js.native

}
}
