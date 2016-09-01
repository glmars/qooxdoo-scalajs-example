
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.Manager")
class Manager extends qx.core.Object {
    def __onPreventContextMenu(e: qx.event.`type`.Mouse): Unit = js.native
    protected def _getChild(menu: qx.ui.menu.Menu, start: Int, iter: Int, loop: Boolean = ???): qx.ui.menu.Button = js.native
    protected def _getMenuButton(widget: qx.ui.core.Widget): qx.ui.menu.Button = js.native
    protected def _isInMenu(widget: qx.ui.core.Widget): Boolean = js.native
    protected def _isMenuOpener(widget: qx.ui.core.Widget): Boolean = js.native
    protected def _onCloseInterval(e: qx.event.`type`.Event): Unit = js.native
    protected def _onKeyPress(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onKeyPressDown(menu: qx.ui.menu.Menu): Unit = js.native
    protected def _onKeyPressEnter(menu: qx.ui.menu.Menu, button: qx.ui.menu.AbstractButton, e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onKeyPressLeft(menu: qx.ui.menu.Menu): Unit = js.native
    protected def _onKeyPressRight(menu: qx.ui.menu.Menu): Unit = js.native
    protected def _onKeyPressSpace(menu: qx.ui.menu.Menu, button: qx.ui.menu.AbstractButton, e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onKeyPressUp(menu: qx.ui.menu.Menu): Unit = js.native
    protected def _onKeyUpDown(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onOpenInterval(e: qx.event.`type`.Event): Unit = js.native
    protected def _onPointerDown(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onRoll(e: qx.event.`type`.Roll): Unit = js.native
    def add(obj: qx.ui.menu.Menu): Unit = js.native
    def cancelClose(menu: qx.ui.menu.Menu): Unit = js.native
    def cancelOpen(menu: qx.ui.menu.Menu): Unit = js.native
    def getActiveMenu(): qx.ui.menu.Menu = js.native
    def hideAll(): Unit = js.native
    def preventContextMenuOnce(): Unit = js.native
    def remove(obj: qx.ui.menu.Menu): Unit = js.native
    def scheduleClose(menu: qx.ui.menu.Menu): Unit = js.native
    def scheduleOpen(menu: qx.ui.menu.Menu): Unit = js.native

}
@js.native
@JSName("qx.ui.menu.Manager")
object Manager extends js.Object {
    def getInstance(): qx.ui.menu.Manager = js.native

}
}
