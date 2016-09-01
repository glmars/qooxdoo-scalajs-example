
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.typ.dom {
@js.native
@JSName("qx.event.type.dom.Custom")
class Custom protected () extends js.Object {
    def this(typ: String = ???, domEvent: qx.event.typ.Event = ???, customProps: js.Any = ???) = this()
    protected def _createEvent(): qx.event.typ.Event = js.native
    protected def _initEvent(domEvent: qx.event.typ.Event, customProps: js.Any = ???): Unit = js.native

}
}
