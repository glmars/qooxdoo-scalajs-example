
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx {
@js.native
@JSName("qx.Bootstrap")
class Bootstrap extends js.Object {

}
@js.native
@JSName("qx.Bootstrap")
object Bootstrap extends js.Object {
    def base(args: js.Any, varargs: js.Any = ???): js.Dynamic = js.native
    def bind(func: js.Function, self: js.Any = ???, varargs: js.Any = ???): js.Function = js.native
    def createNamespace(name: String, obj: js.Any): String = js.native
    def debug(obj: js.Any, message: js.Any): Unit = js.native
    def define(name: String = ???, config: js.Any = ???): qx.Class = js.native
    def error(obj: js.Any, message: js.Any): Unit = js.native
    def extendClass(clazz: js.Function, construct: js.Function, superClass: js.Function, name: js.Function, basename: js.Function): Unit = js.native
    def firstLow(str: String): String = js.native
    def firstUp(str: String): String = js.native
    def genericToString(): String = js.native
    def getByName(name: String): qx.Class = js.native
    def getClass(value: js.Any): String = js.native
    def getEnvironmentSetting(key: String): js.Dynamic = js.native
    def info(obj: js.Any, message: js.Any): Unit = js.native
    def isArray(value: js.Any): Boolean = js.native
    def isFunction(value: js.Any): Boolean = js.native
    def isObject(value: js.Any): Boolean = js.native
    def isString(value: js.Any): Boolean = js.native
    def keys(map: js.Any): js.Array[js.Any] = js.native
    def objectGetLength(map: js.Any): Int = js.native
    def objectMergeWith(target: js.Any, source: js.Any, overwrite: Boolean = ???): js.Dynamic = js.native
    def setDisplayName(fcn: js.Function, classname: String, name: String): Unit = js.native
    def setDisplayNames(functionMap: js.Any, classname: String): Unit = js.native
    def setEnvironmentSetting(key: String, value: js.Any): Unit = js.native
    def setRoot(root: js.Any): Unit = js.native
    def trace(obj: js.Any): Unit = js.native
    def warn(obj: js.Any, message: js.Any): Unit = js.native

}
}
