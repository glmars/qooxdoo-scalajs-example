
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.virtual.core {
@js.native
@JSName("qx.ui.virtual.core.CellEvent")
class CellEvent extends qx.event.typ.Pointer {
    def getColumn(): Int = js.native
    def getRow(): Int = js.native
    protected def initColumn(value: Int): Int = js.native
    protected def initRow(value: Int): Int = js.native
    def resetColumn(): Unit = js.native
    def resetRow(): Unit = js.native
    def setColumn(value: Int): Int = js.native
    def setRow(value: Int): Int = js.native

}
}
