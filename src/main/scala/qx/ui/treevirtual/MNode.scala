
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.MNode")
trait MNode extends js.Object {
    def nodeGet(nodeReference: js.Any): js.Dynamic = js.native
    def nodeGetCellStyle(nodeReference: js.Any): String = js.native
    def nodeGetHideOpenClose(nodeReference: js.Any): Boolean = js.native
    def nodeGetIcon(nodeReference: js.Any): String = js.native
    def nodeGetLabel(nodeReference: js.Any): String = js.native
    def nodeGetLabelStyle(nodeReference: js.Any): String = js.native
    def nodeGetOpened(nodeReference: js.Any): Boolean = js.native
    def nodeGetSelected(nodeReference: js.Any): Boolean = js.native
    def nodeGetSelectedIcon(nodeReference: js.Any): String = js.native
    def nodeSetCellStyle(nodeReference: js.Any, style: String): Unit = js.native
    def nodeSetHideOpenClose(nodeReference: js.Any, b: Boolean): Unit = js.native
    def nodeSetIcon(nodeReference: js.Any, path: String): Unit = js.native
    def nodeSetLabel(nodeReference: js.Any, label: String): Unit = js.native
    def nodeSetLabelStyle(nodeReference: js.Any, style: String): Unit = js.native
    def nodeSetOpened(nodeReference: js.Any, b: Boolean): Unit = js.native
    def nodeSetSelected(nodeReference: js.Any, b: Boolean): Unit = js.native
    def nodeSetSelectedIcon(nodeReference: js.Any, path: String): Unit = js.native
    def nodeSetState(nodeReference: js.Any, attributes: js.Any): Unit = js.native
    def nodeToggleOpened(nodeReference: js.Any): Unit = js.native

}
}
