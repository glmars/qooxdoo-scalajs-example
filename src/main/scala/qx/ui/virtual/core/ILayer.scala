
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.virtual.core {
@js.native
trait ILayer extends js.Object {
    def fullUpdate(firstRow: Int, firstColumn: Int, rowSizes: js.Array[Int], columnSizes: js.Array[Int]): Unit
    def updateLayerData(): Unit
    def updateLayerWindow(firstRow: Int, firstColumn: Int, rowSizes: js.Array[Int], columnSizes: js.Array[Int]): Unit

}
}
