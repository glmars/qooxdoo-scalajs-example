
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.FocusIndicator")
class FocusIndicator protected () extends qx.ui.container.Composite {
    def this(scroller: js.Any = ???) = this()
    protected def _onKeyPress(e: qx.event.typ.KeySequence): Unit = js.native
    def getColumn(): Int = js.native
    def getRow(): Int = js.native
    protected def initColumn(value: Int): Int = js.native
    protected def initRow(value: Int): Int = js.native
    def moveToCell(col: Int = ???, row: Int = ???): Unit = js.native
    def resetColumn(): Unit = js.native
    def resetRow(): Unit = js.native
    def setColumn(value: Int): Int = js.native
    def setRow(value: Int): Int = js.native

}
}
