
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.core.selection {
@js.native
@JSName("qx.ui.core.selection.Widget")
class Widget protected () extends qx.ui.core.selection.Abstract {
    def this(widget: qx.ui.core.Widget = ???) = this()
    protected def _getWidget(): qx.ui.core.Widget = js.native
    protected def _isItemSelectable(item: qx.ui.core.Widget): Boolean = js.native

}
}
