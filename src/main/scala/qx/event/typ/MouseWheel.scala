
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.typ {
@js.native
@JSName("qx.event.type.MouseWheel")
class MouseWheel extends qx.event.typ.Mouse {
    def getWheelDelta(axis: String = ???): Int = js.native

}
}
