
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.log.appender {
@js.native
@JSName("qx.log.appender.RhinoConsole")
class RhinoConsole extends js.Object {

}
@js.native
@JSName("qx.log.appender.RhinoConsole")
object RhinoConsole extends js.Object {
    def debug(logMessage: String): Unit = js.native
    def error(logMessage: String): Unit = js.native
    def info(logMessage: String): Unit = js.native
    def log(logMessage: String, level: String): Unit = js.native
    def process(entry: js.Any): Unit = js.native
    def warn(logMessage: String): Unit = js.native

}
}
