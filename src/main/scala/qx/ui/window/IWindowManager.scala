
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.window {
@js.native
trait IWindowManager extends js.Object {
    def bringToFront(win: Window): Unit
    def changeActiveWindow(active: Window, oldActive: Window): Unit
    def sendToBack(win: Window): Unit
    def setDesktop(desktop: qx.ui.window.IDesktop): Unit
    def updateStack(): Unit

}
}
