
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.AbstractButton")
class AbstractButton extends qx.ui.core.Widget with qx.ui.form.IExecutable with qx.ui.core.MExecutable {
    protected def _applyIcon(value: String, old: String): Unit = js.native
    protected def _applyLabel(value: String, old: String): Unit = js.native
    protected def _applyMenu(value: qx.ui.menu.Menu, old: qx.ui.menu.Menu): Unit = js.native
    protected def _applyShowCommandLabel(value: Boolean, old: Boolean): Unit = js.native
    protected def _onChangeCommand(e: qx.event.`type`.Data): Unit = js.native
    protected def _onKeyPress(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onTap(e: qx.event.`type`.Pointer): Unit = js.native
    def getChildrenSizes(): js.Array[js.Any] = js.native
    def getIcon(): String = js.native
    def getLabel(): String = js.native
    def getMenu(): qx.ui.menu.Menu = js.native
    def getShowCommandLabel(): Boolean = js.native
    protected def initIcon(value: String): String = js.native
    protected def initLabel(value: String): String = js.native
    protected def initMenu(value: qx.ui.menu.Menu): qx.ui.menu.Menu = js.native
    protected def initShowCommandLabel(value: Boolean): Boolean = js.native
    def isShowCommandLabel(): Boolean = js.native
    def resetIcon(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetMenu(): Unit = js.native
    def resetShowCommandLabel(): Unit = js.native
    def setIcon(value: String): String = js.native
    def setLabel(value: String): String = js.native
    def setMenu(value: qx.ui.menu.Menu): qx.ui.menu.Menu = js.native
    def setShowCommandLabel(value: Boolean): Boolean = js.native
    def toggleShowCommandLabel(): Boolean = js.native

}
}
