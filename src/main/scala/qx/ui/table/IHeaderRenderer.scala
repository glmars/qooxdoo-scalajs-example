
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table {
@js.native
trait IHeaderRenderer extends js.Object {
    def createHeaderCell(cellInfo: js.Any): qx.ui.core.Widget
    def updateHeaderCell(cellInfo: js.Any, cellWidget: qx.ui.core.Widget): Unit

}
}
