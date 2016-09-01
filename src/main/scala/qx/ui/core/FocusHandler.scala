
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.core {
@js.native
@JSName("qx.ui.core.FocusHandler")
class FocusHandler extends qx.core.Object {
    protected def _onActivate(e: qx.event.`type`.Focus): Unit = js.native
    protected def _onDeactivate(e: qx.event.`type`.Focus): Unit = js.native
    protected def _onFocusIn(e: qx.event.`type`.Focus): Unit = js.native
    protected def _onFocusOut(e: qx.event.`type`.Focus): Unit = js.native
    def addRoot(widget: qx.ui.core.Widget): Unit = js.native
    def connectTo(root: qx.ui.root.Abstract): Unit = js.native
    def getActiveWidget(): qx.ui.core.Widget = js.native
    def getFocusedWidget(): qx.ui.core.Widget = js.native
    def isActive(widget: qx.ui.core.Widget): Boolean = js.native
    def isFocused(widget: qx.ui.core.Widget): Boolean = js.native
    def isFocusRoot(widget: qx.ui.core.Widget): Boolean = js.native
    def removeRoot(widget: qx.ui.core.Widget): Unit = js.native

}
@js.native
@JSName("qx.ui.core.FocusHandler")
object FocusHandler extends js.Object {
    def getInstance(): qx.ui.core.FocusHandler = js.native

}
}
