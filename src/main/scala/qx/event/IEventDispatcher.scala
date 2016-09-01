
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event {
@js.native
trait IEventDispatcher extends js.Object {
    def canDispatchEvent(target: HTMLElement, event: qx.event.typ.Event, typ: String): Boolean
    def dispatchEvent(target: HTMLElement, event: qx.event.typ.Event, typ: String): Unit

}
}
