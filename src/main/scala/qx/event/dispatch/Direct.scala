
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.dispatch {
@js.native
@JSName("qx.event.dispatch.Direct")
class Direct protected () extends qx.core.Object with qx.event.IEventDispatcher {
    override def canDispatchEvent(target: HTMLElement, event: qx.event.typ.Event, typ: String): Boolean = js.native
    override def dispatchEvent(target: HTMLElement, event: qx.event.typ.Event, typ: String): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()

}
}
