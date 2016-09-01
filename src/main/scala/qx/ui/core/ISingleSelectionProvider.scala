
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.core {
@js.native
trait ISingleSelectionProvider extends js.Object {
    def getItems(): js.Array[qx.ui.core.Widget]
    def isItemSelectable(item: qx.ui.core.Widget): Boolean

}
}
