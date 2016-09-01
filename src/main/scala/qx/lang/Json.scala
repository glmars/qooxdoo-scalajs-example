
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.lang {
@js.native
@JSName("qx.lang.Json")
class Json extends js.Object {

}
@js.native
@JSName("qx.lang.Json")
object Json extends js.Object {
    def parse(text: String, reviver: js.Function = ???): js.Dynamic = js.native
    def stringify(value: js.Any, replacer: js.Function = ???, space: String = ???): String = js.native

}
}
