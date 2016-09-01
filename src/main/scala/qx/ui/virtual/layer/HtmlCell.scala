
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.HtmlCell")
class HtmlCell protected () extends qx.ui.virtual.layer.Abstract {
    def this(htmlCellProvider: qx.ui.virtual.core.IHtmlCellProvider = ???) = this()
    protected def _getCellSizeStyle(width: Int, height: Int, insetX: Int, insetY: Int): String = js.native

}
}
