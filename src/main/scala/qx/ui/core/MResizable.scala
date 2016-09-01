
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.core {
@js.native
@JSName("qx.ui.core.MResizable")
trait MResizable extends js.Object {
    protected def _getResizeFrame(): qx.ui.core.Widget = js.native
    def getResizableBottom(): Boolean = js.native
    def getResizableLeft(): Boolean = js.native
    def getResizableRight(): Boolean = js.native
    def getResizableTop(): Boolean = js.native
    def getResizeSensitivity(): Int = js.native
    def getUseResizeFrame(): Boolean = js.native
    protected def initResizableBottom(value: Boolean): Boolean = js.native
    protected def initResizableLeft(value: Boolean): Boolean = js.native
    protected def initResizableRight(value: Boolean): Boolean = js.native
    protected def initResizableTop(value: Boolean): Boolean = js.native
    protected def initResizeSensitivity(value: Int): Int = js.native
    protected def initUseResizeFrame(value: Boolean): Boolean = js.native
    def isResizableBottom(): Boolean = js.native
    def isResizableLeft(): Boolean = js.native
    def isResizableRight(): Boolean = js.native
    def isResizableTop(): Boolean = js.native
    def isUseResizeFrame(): Boolean = js.native
    def resetResizable(): Unit = js.native
    def resetResizableBottom(): Unit = js.native
    def resetResizableLeft(): Unit = js.native
    def resetResizableRight(): Unit = js.native
    def resetResizableTop(): Unit = js.native
    def resetResizeSensitivity(): Unit = js.native
    def resetUseResizeFrame(): Unit = js.native
    def setResizable(resizableTop: js.Any, resizableRight: js.Any, resizableBottom: js.Any, resizableLeft: js.Any): Unit = js.native
    def setResizableBottom(value: Boolean): Boolean = js.native
    def setResizableLeft(value: Boolean): Boolean = js.native
    def setResizableRight(value: Boolean): Boolean = js.native
    def setResizableTop(value: Boolean): Boolean = js.native
    def setResizeSensitivity(value: Int): Int = js.native
    def setUseResizeFrame(value: Boolean): Boolean = js.native
    def toggleResizableBottom(): Boolean = js.native
    def toggleResizableLeft(): Boolean = js.native
    def toggleResizableRight(): Boolean = js.native
    def toggleResizableTop(): Boolean = js.native
    def toggleUseResizeFrame(): Boolean = js.native

}
}
