
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.handler {
@js.native
@JSName("qx.event.handler.Appear")
class Appear protected () extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, typ: String): Boolean = js.native
    override def registerEvent(target: js.Any, typ: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, typ: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()
    def refresh(): Unit = js.native

}
@js.native
@JSName("qx.event.handler.Appear")
object Appear extends js.Object {

}
}
