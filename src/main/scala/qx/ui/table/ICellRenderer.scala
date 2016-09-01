
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table {
@js.native
trait ICellRenderer extends js.Object {
    def createDataCellHtml(cellInfo: js.Any, htmlArr: js.Array[String]): Boolean

}
}
