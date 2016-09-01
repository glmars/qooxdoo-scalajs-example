
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.log {
@js.native
@JSName("qx.log.Logger")
class Logger extends js.Object {

}
@js.native
@JSName("qx.log.Logger")
object Logger extends js.Object {
    def clear(): Unit = js.native
    def debug(obj: js.Any, message: js.Any): Unit = js.native
    def deprecatedClassWarning(clazz: qx.Class, msg: String = ???): Unit = js.native
    def deprecatedConstantWarning(clazz: qx.Class, constant: String, msg: String): Unit = js.native
    def deprecatedEventWarning(clazz: qx.Class, event: String, msg: String = ???): Unit = js.native
    def deprecatedMethodWarning(fcn: js.Function, msg: String = ???): Unit = js.native
    def deprecatedMixinWarning(clazz: qx.Class, msg: String = ???): Unit = js.native
    def deprecateMethodOverriding(obj: qx.core.Object, baseclass: qx.Class, methodName: String, msg: String = ???): Unit = js.native
    def error(obj: js.Any, message: js.Any): Unit = js.native
    def getLevel(): Int = js.native
    def getTreshold(): Int = js.native
    def info(obj: js.Any, message: js.Any): Unit = js.native
    def register(appender: qx.Class): Unit = js.native
    def setLevel(value: String): Unit = js.native
    def setTreshold(value: Int): Unit = js.native
    def trace(obj: js.Any = ???): Unit = js.native
    def unregister(appender: qx.Class): Unit = js.native
    def warn(obj: js.Any, message: js.Any): Unit = js.native

}
}
