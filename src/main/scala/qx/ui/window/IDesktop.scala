
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.window {
@js.native
trait IDesktop extends js.Object {
    def blockContent(zIndex: Int): Unit
    def getWindows(): js.Array[qx.ui.window.Window]
    def isBlocked(): Boolean
    def setWindowManager(manager: qx.ui.window.IWindowManager): Unit
    def supportsMaximize(): Boolean
    def unblock(): Unit

}
}
