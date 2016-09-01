
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.core {
@js.native
@JSName("qx.ui.core.SingleSelectionManager")
class SingleSelectionManager protected () extends qx.core.Object {
    def this(selectionProvider: qx.ui.core.ISingleSelectionProvider = ???) = this()
    def getAllowEmptySelection(): Boolean = js.native
    def getSelectables(all: Boolean): js.Array[qx.ui.core.Widget] = js.native
    def getSelected(): qx.ui.core.Widget = js.native
    protected def initAllowEmptySelection(value: Boolean): Boolean = js.native
    def isAllowEmptySelection(): Boolean = js.native
    def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def resetAllowEmptySelection(): Unit = js.native
    def resetSelected(): Unit = js.native
    def setAllowEmptySelection(value: Boolean): Boolean = js.native
    def setSelected(item: qx.ui.core.Widget): Unit = js.native
    def toggleAllowEmptySelection(): Boolean = js.native

}
}
