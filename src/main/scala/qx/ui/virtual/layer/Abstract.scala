
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.Abstract")
class Abstract extends qx.ui.core.Widget with qx.ui.virtual.core.ILayer {
    override def fullUpdate(firstRow: Int, firstColumn: Int, rowSizes: js.Array[Int], columnSizes: js.Array[Int]): Unit = js.native
    override def updateLayerData(): Unit = js.native
    override def updateLayerWindow(firstRow: Int, firstColumn: Int, rowSizes: js.Array[Int], columnSizes: js.Array[Int]): Unit = js.native
    protected def _fullUpdate(firstRow: Int, firstColumn: Int, rowSizes: js.Array[Int], columnSizes: js.Array[Int]): Unit = js.native
    protected def _updateLayerData(): Unit = js.native
    protected def _updateLayerWindow(firstRow: Int, firstColumn: Int, rowSizes: js.Array[Int], columnSizes: js.Array[Int]): Unit = js.native
    def getColumnSizes(): js.Array[Int] = js.native
    def getFirstColumn(): Int = js.native
    def getFirstRow(): Int = js.native
    def getRowSizes(): js.Array[Int] = js.native

}
}
