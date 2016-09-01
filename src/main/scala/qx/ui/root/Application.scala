
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.root {
@js.native
@JSName("qx.ui.root.Application")
class Application protected () extends qx.ui.root.Abstract {
    def this(doc: Document = ???) = this()
    protected def _onResize(e: qx.event.typ.Event): Unit = js.native

}
}
