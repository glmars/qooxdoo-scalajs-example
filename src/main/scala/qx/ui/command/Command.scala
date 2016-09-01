
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.command {
@js.native
@JSName("qx.ui.command.Command")
class Command protected () extends qx.core.Object {
    def this(shortcut: String = ???) = this()
    protected def _applyActive(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyEnabled(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyShortcut(value: String, old: String): Unit = js.native
    def execute(target: js.Any = ???): Unit = js.native
    def getActive(): Boolean = js.native
    def getEnabled(): Boolean = js.native
    def getIcon(): String = js.native
    def getLabel(): String = js.native
    def getMenu(): qx.ui.menu.Menu = js.native
    def getShortcut(): String = js.native
    def getToolTipText(): String = js.native
    def getValue(): js.Dynamic = js.native
    protected def initActive(value: Boolean): Boolean = js.native
    protected def initEnabled(value: Boolean): Boolean = js.native
    protected def initIcon(value: String): String = js.native
    protected def initLabel(value: String): String = js.native
    protected def initMenu(value: qx.ui.menu.Menu): qx.ui.menu.Menu = js.native
    protected def initShortcut(value: String): String = js.native
    protected def initToolTipText(value: String): String = js.native
    protected def initValue(value: js.Any): js.Dynamic = js.native
    def isActive(): Boolean = js.native
    def isEnabled(): Boolean = js.native
    def resetActive(): Unit = js.native
    def resetEnabled(): Unit = js.native
    def resetIcon(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetMenu(): Unit = js.native
    def resetShortcut(): Unit = js.native
    def resetToolTipText(): Unit = js.native
    def resetValue(): Unit = js.native
    def setActive(value: Boolean): Boolean = js.native
    def setEnabled(value: Boolean): Boolean = js.native
    def setIcon(value: String): String = js.native
    def setLabel(value: String): String = js.native
    def setMenu(value: qx.ui.menu.Menu): qx.ui.menu.Menu = js.native
    def setShortcut(value: String): String = js.native
    def setToolTipText(value: String): String = js.native
    def setValue(value: js.Any): js.Dynamic = js.native
    def toggleActive(): Boolean = js.native
    def toggleEnabled(): Boolean = js.native

}
}
