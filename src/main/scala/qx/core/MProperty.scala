
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.core {
@js.native
@JSName("qx.core.MProperty")
trait MProperty extends js.Object {
    def get(prop: String): js.Dynamic = js.native
    def reset(prop: String): Unit = js.native
    def set(data: js.Any, value: js.Any = ???): js.Dynamic = js.native

}
}
