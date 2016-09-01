
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.progressive.renderer.table {
@js.native
@JSName("qx.ui.progressive.renderer.table.Row")
class Row protected () extends qx.ui.progressive.renderer.Abstract {
    def this(columnWidths: qx.ui.progressive.renderer.table.Widths = ???) = this()
    protected def _resizeColumns(e: qx.event.`type`.Event): Unit = js.native
    def addRenderer(column: Int, renderer: qx.ui.progressive.renderer.table.cell.Abstract): Unit = js.native
    def getDefaultRowHeight(): js.Dynamic = js.native
    def getLayoutChildren(): js.Array[js.Any] = js.native
    protected def initDefaultRowHeight(value: js.Any): js.Dynamic = js.native
    def removeRenderer(column: Int): Unit = js.native
    def resetDefaultRowHeight(): Unit = js.native
    def setDefaultRowHeight(value: js.Any): js.Dynamic = js.native

}
}
