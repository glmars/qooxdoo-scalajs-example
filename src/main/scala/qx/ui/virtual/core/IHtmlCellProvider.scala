
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.virtual.core {
@js.native
trait IHtmlCellProvider extends js.Object {
    def getCellProperties(row: Int, column: Int): js.Dynamic

}
}
