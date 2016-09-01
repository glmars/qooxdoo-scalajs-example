
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.root {
@js.native
@JSName("qx.ui.root.Inline")
class Inline protected () extends qx.ui.root.Abstract with qx.ui.core.MLayoutHandling {
    def this(el: HTMLElement = ???, dynamicX: Boolean = ???, dynamicY: Boolean = ???) = this()
    protected def _onResize(e: qx.event.typ.Event): Unit = js.native
    protected def _onWindowResize(): Unit = js.native

}
}
