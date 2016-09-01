
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.Date")
class Date protected () extends qx.ui.virtual.cell.Cell {
    def this(dateFormat: qx.util.format.DateFormat = ???) = this()
    def getDateFormat(): qx.util.format.DateFormat = js.native
    protected def initDateFormat(value: qx.util.format.DateFormat): qx.util.format.DateFormat = js.native
    def resetDateFormat(): Unit = js.native
    def setDateFormat(value: qx.util.format.DateFormat): qx.util.format.DateFormat = js.native

}
}
