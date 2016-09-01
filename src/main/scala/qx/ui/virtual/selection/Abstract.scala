
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.virtual.selection {
@js.native
@JSName("qx.ui.virtual.selection.Abstract")
class Abstract protected () extends qx.ui.core.selection.Abstract {
    def this(pane: qx.ui.virtual.core.Pane = ???, selectionDelegate: js.Any = ???) = this()
    def attachKeyEvents(target: qx.core.Object): Unit = js.native
    def attachListEvents(list: qx.core.Object): Unit = js.native
    def attachPointerEvents(): Unit = js.native
    def detachKeyEvents(target: qx.core.Object): Unit = js.native
    def detachListEvents(list: qx.core.Object): Unit = js.native
    def detatchPointerEvents(): Unit = js.native

}
}
