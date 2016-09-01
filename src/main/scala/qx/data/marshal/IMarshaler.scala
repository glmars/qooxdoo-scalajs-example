
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.data.marshal {
@js.native
trait IMarshaler extends js.Object {
    def toClass(data: js.Any, includeBubbleEvents: Boolean): Unit
    def toModel(data: js.Any): qx.core.Object

}
}
