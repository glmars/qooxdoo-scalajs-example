
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.container {
@js.native
@JSName("qx.ui.container.Stack")
class Stack extends qx.ui.core.Widget with qx.ui.core.ISingleSelection with qx.ui.core.MSingleSelectionHandling with qx.ui.core.MChildrenHandling {
    protected def _applyDynamic(value: Boolean, old: Boolean): Unit = js.native
    protected def _getItems(): js.Array[qx.ui.core.Widget] = js.native
    protected def _isAllowEmptySelection(): Boolean = js.native
    protected def _isItemSelectable(item: qx.ui.core.Widget): Boolean = js.native
    def getDynamic(): Boolean = js.native
    protected def initDynamic(value: Boolean): Boolean = js.native
    def isDynamic(): Boolean = js.native
    def next(): Unit = js.native
    def previous(): Unit = js.native
    def resetDynamic(): Unit = js.native
    def setDynamic(value: Boolean): Boolean = js.native
    def toggleDynamic(): Boolean = js.native

}
}
