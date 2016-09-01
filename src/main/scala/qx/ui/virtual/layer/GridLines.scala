
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.GridLines")
class GridLines protected () extends qx.ui.virtual.layer.Abstract {
    def this(orientation: String = ???, lineColor: String = ???, lineSize: Int = ???) = this()
    def getDefaultLineColor(): String = js.native
    def getDefaultLineSize(): Int = js.native
    def getLineColor(index: Long): String = js.native
    def getLineSize(index: Long): Int = js.native
    protected def initDefaultLineColor(value: String): String = js.native
    protected def initDefaultLineSize(value: Int): Int = js.native
    def isHorizontal(): Boolean = js.native
    def resetDefaultLineColor(): Unit = js.native
    def resetDefaultLineSize(): Unit = js.native
    def setDefaultLineColor(value: String): String = js.native
    def setDefaultLineSize(value: Int): Int = js.native
    def setLineColor(index: Long, color: String): Unit = js.native
    def setLineSize(index: Long, size: Int): Unit = js.native

}
}
