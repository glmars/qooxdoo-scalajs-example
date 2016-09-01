
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.window {
@js.native
@JSName("qx.ui.window.Manager")
class Manager extends qx.core.Object with qx.ui.window.IWindowManager {
    override def bringToFront(win: Window): Unit = js.native
    override def changeActiveWindow(active: Window, oldActive: Window): Unit = js.native
    override def sendToBack(win: Window): Unit = js.native
    override def setDesktop(desktop: qx.ui.window.IDesktop): Unit = js.native
    override def updateStack(): Unit = js.native
    def getDesktop(): qx.ui.window.IDesktop = js.native
    def syncWidget(): Unit = js.native

}
}
