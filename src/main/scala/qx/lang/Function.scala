
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.lang {
@js.native
@JSName("qx.lang.Function")
class Function extends js.Object {

}
@js.native
@JSName("qx.lang.Function")
object Function extends js.Object {
    def attempt(func: js.Function, self: js.Any = ???, varargs: js.Any = ???): Boolean = js.native
    def bind(func: js.Function, self: js.Any = ???, varargs: js.Any = ???): js.Function = js.native
    def create(func: js.Function, options: js.Any = ???): js.Function = js.native
    def curry(func: js.Function, varargs: js.Any = ???): js.Dynamic = js.native
    def delay(func: js.Function, delay: Int, self: js.Any = ???, varargs: js.Any = ???): Int = js.native
    def getCaller(args: js.Any): js.Function = js.native
    def getName(fcn: js.Function): String = js.native
    def globalEval(data: String): js.Dynamic = js.native
    def listener(func: js.Function, self: js.Any = ???, varargs: js.Any = ???): js.Dynamic = js.native
    def periodical(func: js.Function, interval: Int, self: js.Any = ???, varargs: js.Any = ???): Int = js.native

}
}
