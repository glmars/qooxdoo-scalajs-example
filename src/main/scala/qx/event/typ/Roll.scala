
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.typ {
@js.native
@JSName("qx.event.type.Roll")
class Roll extends qx.event.typ.Pointer {
    def getDelta(): js.Dynamic = js.native
    def getMomentum(): Boolean = js.native
    def stopMomentum(): Unit = js.native

}
}
