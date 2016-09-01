
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.window {
@js.native
@JSName("qx.ui.window.MDesktop")
trait MDesktop extends js.Object {
    protected def _addWindow(win: qx.ui.window.Window): Unit = js.native
    protected def _afterAddChild(win: qx.ui.core.Widget): Unit = js.native
    protected def _afterRemoveChild(win: qx.ui.core.Widget): Unit = js.native
    protected def _applyActiveWindow(value: qx.ui.window.Window, old: qx.ui.window.Window): Unit = js.native
    protected def _onChangeActive(e: qx.event.`type`.Event): Unit = js.native
    protected def _onChangeModal(e: qx.event.`type`.Event): Unit = js.native
    protected def _onChangeVisibility(): Unit = js.native
    protected def _removeWindow(win: qx.ui.window.Window): Unit = js.native
    def getActiveWindow(): qx.ui.window.Window = js.native
    def getWindowManager(): qx.ui.window.IWindowManager = js.native
    def getWindows(): js.Array[qx.ui.window.Window] = js.native
    protected def initActiveWindow(value: qx.ui.window.Window): qx.ui.window.Window = js.native
    def resetActiveWindow(): Unit = js.native
    def setActiveWindow(value: qx.ui.window.Window): qx.ui.window.Window = js.native
    def setWindowManager(manager: qx.ui.window.IWindowManager): Unit = js.native
    def supportsMaximize(): Boolean = js.native

}
}
