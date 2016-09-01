
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.tree.core {
@js.native
@JSName("qx.ui.tree.core.AbstractItem")
class AbstractItem protected () extends qx.ui.core.Widget with qx.ui.form.IModel with qx.ui.form.MModelProperty {
    def this(label: String = ???) = this()
    protected def _addWidgets(): Unit = js.native
    protected def _applyIcon(value: String, old: String): Unit = js.native
    protected def _applyIconOpened(value: String, old: String): Unit = js.native
    protected def _applyIndent(value: Int, old: Int): Unit = js.native
    protected def _applyLabel(value: String, old: String): Unit = js.native
    protected def _applyOpen(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyOpenSymbolMode(value: js.Any, old: js.Any): Unit = js.native
    protected def _onChangeOpen(e: qx.event.`type`.Data): Unit = js.native
    protected def _shouldShowOpenSymbol(): Boolean = js.native
    protected def _updateIndent(): Unit = js.native
    def addIcon(): Unit = js.native
    def addLabel(text: String = ???): Unit = js.native
    def addOpenButton(): Unit = js.native
    def addSpacer(): Unit = js.native
    def addWidget(widget: qx.ui.core.Widget, options: js.Any = ???): Unit = js.native
    def getIcon(): String = js.native
    def getIconOpened(): String = js.native
    def getIndent(): Int = js.native
    def getLabel(): String = js.native
    def getLevel(): Int = js.native
    def getOpen(): Boolean = js.native
    def getOpenSymbolMode(): js.Dynamic = js.native
    def hasChildren(): Boolean = js.native
    protected def initIcon(value: String): String = js.native
    protected def initIconOpened(value: String): String = js.native
    protected def initIndent(value: Int): Int = js.native
    protected def initLabel(value: String): String = js.native
    protected def initOpen(value: Boolean): Boolean = js.native
    protected def initOpenSymbolMode(value: js.Any): js.Dynamic = js.native
    def isOpen(): Boolean = js.native
    def isOpenable(): Boolean = js.native
    def resetIcon(): Unit = js.native
    def resetIconOpened(): Unit = js.native
    def resetIndent(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetOpen(): Unit = js.native
    def resetOpenSymbolMode(): Unit = js.native
    def setIcon(value: String): String = js.native
    def setIconOpened(value: String): String = js.native
    def setIndent(value: Int): Int = js.native
    def setLabel(value: String): String = js.native
    def setOpen(value: Boolean): Boolean = js.native
    def setOpenSymbolMode(value: js.Any): js.Dynamic = js.native
    def toggleOpen(): Boolean = js.native

}
}
