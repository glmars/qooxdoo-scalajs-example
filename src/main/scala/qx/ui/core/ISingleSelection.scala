
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.core {
@js.native
trait ISingleSelection extends js.Object {
    def getSelectables(all: Boolean): js.Array[qx.ui.core.Widget]
    def getSelection(): js.Array[qx.ui.core.Widget]
    def isSelected(item: qx.ui.core.Widget): Boolean
    def isSelectionEmpty(): Boolean
    def resetSelection(): Unit
    def setSelection(items: js.Array[qx.ui.core.Widget]): Unit

}
}
