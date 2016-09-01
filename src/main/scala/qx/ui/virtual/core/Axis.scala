
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.virtual.core {
@js.native
@JSName("qx.ui.virtual.core.Axis")
class Axis protected () extends qx.core.Object {
    def this(defaultItemSize: Int = ???, itemCount: Int = ???) = this()
    def getDefaultItemSize(): Int = js.native
    def getItemAtPosition(position: Int): js.Dynamic = js.native
    def getItemCount(): Int = js.native
    def getItemPosition(index: Int): Int = js.native
    def getItemSize(index: Int): Int = js.native
    def getItemSizes(startIndex: Int, minSizeSum: Int): js.Array[Int] = js.native
    def getTotalSize(): Int = js.native
    def resetItemSizes(): Unit = js.native
    def setDefaultItemSize(defaultItemSize: Int): Unit = js.native
    def setItemCount(itemCount: Int): Unit = js.native
    def setItemSize(index: Int, size: Int): Unit = js.native

}
}
