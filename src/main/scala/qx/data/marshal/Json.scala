
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.data.marshal {
@js.native
@JSName("qx.data.marshal.Json")
class Json protected () extends qx.core.Object with qx.data.marshal.IMarshaler {
    override def toClass(data: js.Any, includeBubbleEvents: Boolean): Unit = js.native
    override def toModel(data: js.Any): qx.core.Object = js.native
    def this(delegate: js.Any = ???) = this()

}
@js.native
@JSName("qx.data.marshal.Json")
object Json extends js.Object {
    def createModel(data: js.Any, includeBubbleEvents: Boolean): qx.core.Object = js.native

}
}
