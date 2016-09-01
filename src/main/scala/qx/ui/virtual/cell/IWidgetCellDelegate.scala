
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.virtual.cell {
@js.native
trait IWidgetCellDelegate extends js.Object {
    def createWidget(): qx.ui.core.LayoutItem

}
}
