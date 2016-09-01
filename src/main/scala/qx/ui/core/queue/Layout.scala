
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.core.queue {
@js.native
@JSName("qx.ui.core.queue.Layout")
class Layout extends js.Object {

}
@js.native
@JSName("qx.ui.core.queue.Layout")
object Layout extends js.Object {
    def add(widget: qx.ui.core.Widget): Unit = js.native
    def flush(): Unit = js.native
    def getNestingLevel(widget: qx.ui.core.Widget): Int = js.native
    def isScheduled(widget: qx.ui.core.Widget): Boolean = js.native
    def remove(widget: qx.ui.core.Widget): Unit = js.native

}
}
