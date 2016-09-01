
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.MRoll")
trait MRoll extends js.Object {
    protected def _addRollHandling(): Unit = js.native
    protected def _onPointerDownForRoll(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onRoll(e: qx.event.typ.Roll): Unit = js.native
    protected def _removeRollHandling(): Unit = js.native

}
}
