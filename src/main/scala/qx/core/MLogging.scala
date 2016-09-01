
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.core {
@js.native
@JSName("qx.core.MLogging")
trait MLogging extends js.Object {
    def debug(varargs: js.Any = ???): Unit = js.native
    def error(varargs: js.Any = ???): Unit = js.native
    def info(varargs: js.Any = ???): Unit = js.native
    def trace(): Unit = js.native
    def warn(varargs: js.Any = ???): Unit = js.native

}
}
