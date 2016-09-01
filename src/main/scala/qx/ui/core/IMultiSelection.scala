
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.core {
@js.native
trait IMultiSelection extends js.Object {
    def addToSelection(item: qx.ui.core.Widget): Unit
    def removeFromSelection(item: qx.ui.core.Widget): Unit
    def selectAll(): Unit

}
}
