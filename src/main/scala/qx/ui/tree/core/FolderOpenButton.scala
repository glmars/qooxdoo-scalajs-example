
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.tree.core {
@js.native
@JSName("qx.ui.tree.core.FolderOpenButton")
class FolderOpenButton extends qx.ui.basic.Image with qx.ui.core.MExecutable {
    protected def _applyOpen(value: Boolean, old: Boolean): Unit = js.native
    protected def _onTap(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _stopPropagation(e: qx.event.`type`.Event): Unit = js.native
    def getOpen(): Boolean = js.native
    protected def initOpen(value: Boolean): Boolean = js.native
    def isOpen(): Boolean = js.native
    def resetOpen(): Unit = js.native
    def setOpen(value: Boolean): Boolean = js.native
    def toggleOpen(): Boolean = js.native

}
}
