
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.ToolBar")
class ToolBar extends qx.ui.core.Widget with qx.ui.core.MChildrenHandling {
    protected def _applyOverflowHandling(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyOverflowIndicator(value: qx.ui.core.Widget, old: qx.ui.core.Widget): Unit = js.native
    protected def _applyShow(value: js.Any, old: js.Any): Unit = js.native
    protected def _applySpacing(value: Int, old: Int): Unit = js.native
    protected def _getNextToHide(): qx.ui.core.Widget = js.native
    def _isAllowMenuOpenHover(): Boolean = js.native
    protected def _onResize(e: qx.event.`type`.Data): Unit = js.native
    protected def _recalculateOverflow(width: Int = ???, requiredWidth: Int = ???): Unit = js.native
    def _setAllowMenuOpenHover(value: Boolean): Unit = js.native
    def addSeparator(): Unit = js.native
    def addSpacer(): qx.ui.core.Spacer = js.native
    def getMenuButtons(): js.Array[js.Any] = js.native
    def getOpenMenu(): qx.ui.menu.Menu = js.native
    def getOverflowHandling(): Boolean = js.native
    def getOverflowIndicator(): qx.ui.core.Widget = js.native
    def getShow(): js.Dynamic = js.native
    def getSpacing(): Int = js.native
    protected def initOpenMenu(value: qx.ui.menu.Menu): qx.ui.menu.Menu = js.native
    protected def initOverflowHandling(value: Boolean): Boolean = js.native
    protected def initOverflowIndicator(value: qx.ui.core.Widget): qx.ui.core.Widget = js.native
    protected def initShow(value: js.Any): js.Dynamic = js.native
    protected def initSpacing(value: Int): Int = js.native
    def isOverflowHandling(): Boolean = js.native
    def resetOpenMenu(): Unit = js.native
    def resetOverflowHandling(): Unit = js.native
    def resetOverflowIndicator(): Unit = js.native
    def resetShow(): Unit = js.native
    def resetSpacing(): Unit = js.native
    def setOpenMenu(value: qx.ui.menu.Menu): qx.ui.menu.Menu = js.native
    def setOverflowHandling(value: Boolean): Boolean = js.native
    def setOverflowIndicator(value: qx.ui.core.Widget): qx.ui.core.Widget = js.native
    def setRemovePriority(item: qx.ui.core.Widget, priority: Int, `override`: Boolean): Unit = js.native
    def setShow(value: js.Any): js.Dynamic = js.native
    def setSpacing(value: Int): Int = js.native
    def toggleOverflowHandling(): Boolean = js.native

}
}
