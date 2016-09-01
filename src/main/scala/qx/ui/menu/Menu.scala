
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.Menu")
class Menu extends qx.ui.core.Widget with qx.ui.core.MPlacement with qx.ui.core.MRemoteChildrenHandling {
    protected def _applyArrowColumnWidth(value: Int, old: Int): Unit = js.native
    protected def _applyBlockerColor(value: String, old: String): Unit = js.native
    protected def _applyBlockerOpacity(value: Long, old: Long): Unit = js.native
    protected def _applyIconColumnWidth(value: Int, old: Int): Unit = js.native
    protected def _applyOpenedButton(value: qx.ui.core.Widget, old: qx.ui.core.Widget): Unit = js.native
    protected def _applySelectedButton(value: qx.ui.core.Widget, old: qx.ui.core.Widget): Unit = js.native
    protected def _applySpacingX(value: Int, old: Int): Unit = js.native
    protected def _applySpacingY(value: Int, old: Int): Unit = js.native
    protected def _assertSlideBar(callback: js.Function): js.Dynamic = js.native
    protected def _computePlacementSize(): js.Dynamic = js.native
    protected def _getMenuBounds(): js.Dynamic = js.native
    protected def _getMenuLayout(): js.Dynamic = js.native
    protected def _onPointerOut(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onPointerOver(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onResize(): Unit = js.native
    def addSeparator(): Unit = js.native
    def getArrowColumnWidth(): Int = js.native
    def getBlockBackground(): Boolean = js.native
    def getBlockerColor(): String = js.native
    def getBlockerOpacity(): Long = js.native
    def getCloseInterval(): Int = js.native
    def getColumnSizes(): js.Array[js.Any] = js.native
    def getIconColumnWidth(): Int = js.native
    def getOpenedButton(): qx.ui.core.Widget = js.native
    def getOpener(): qx.ui.core.Widget = js.native
    def getOpenInterval(): Int = js.native
    def getParentMenu(): js.Dynamic = js.native
    def getSelectables(): js.Array[qx.ui.core.Widget] = js.native
    def getSelectedButton(): qx.ui.core.Widget = js.native
    def getSpacingX(): Int = js.native
    def getSpacingY(): Int = js.native
    protected def initArrowColumnWidth(value: Int): Int = js.native
    protected def initBlockBackground(value: Boolean): Boolean = js.native
    protected def initBlockerColor(value: String): String = js.native
    protected def initBlockerOpacity(value: Long): Long = js.native
    protected def initCloseInterval(value: Int): Int = js.native
    protected def initIconColumnWidth(value: Int): Int = js.native
    protected def initOpenedButton(value: qx.ui.core.Widget): qx.ui.core.Widget = js.native
    protected def initOpener(value: qx.ui.core.Widget): qx.ui.core.Widget = js.native
    protected def initOpenInterval(value: Int): Int = js.native
    protected def initSelectedButton(value: qx.ui.core.Widget): qx.ui.core.Widget = js.native
    protected def initSpacingX(value: Int): Int = js.native
    protected def initSpacingY(value: Int): Int = js.native
    def isBlockBackground(): Boolean = js.native
    def open(): Unit = js.native
    def openAtPoint(point: js.Any): Unit = js.native
    def openAtPointer(e: qx.event.typ.Pointer): Unit = js.native
    def resetArrowColumnWidth(): Unit = js.native
    def resetBlockBackground(): Unit = js.native
    def resetBlockerColor(): Unit = js.native
    def resetBlockerOpacity(): Unit = js.native
    def resetCloseInterval(): Unit = js.native
    def resetIconColumnWidth(): Unit = js.native
    def resetOpenedButton(): Unit = js.native
    def resetOpener(): Unit = js.native
    def resetOpenInterval(): Unit = js.native
    def resetSelectedButton(): Unit = js.native
    def resetSpacingX(): Unit = js.native
    def resetSpacingY(): Unit = js.native
    def setArrowColumnWidth(value: Int): Int = js.native
    def setBlockBackground(value: Boolean): Boolean = js.native
    def setBlockerColor(value: String): String = js.native
    def setBlockerOpacity(value: Long): Long = js.native
    def setCloseInterval(value: Int): Int = js.native
    def setIconColumnWidth(value: Int): Int = js.native
    def setOpenedButton(value: qx.ui.core.Widget): qx.ui.core.Widget = js.native
    def setOpener(value: qx.ui.core.Widget): qx.ui.core.Widget = js.native
    def setOpenInterval(value: Int): Int = js.native
    def setSelectedButton(value: qx.ui.core.Widget): qx.ui.core.Widget = js.native
    def setSpacingX(value: Int): Int = js.native
    def setSpacingY(value: Int): Int = js.native
    def toggleBlockBackground(): Boolean = js.native

}
}
