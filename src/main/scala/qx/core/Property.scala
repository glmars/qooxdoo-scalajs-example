
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.core {
@js.native
@JSName("qx.core.Property")
class Property extends js.Object {

}
@js.native
@JSName("qx.core.Property")
object Property extends js.Object {
    def attachMethods(clazz: qx.Class, name: String, config: js.Any): Unit = js.native
    def attachRefreshInheritables(clazz: qx.Class): Unit = js.native
    def error(obj: qx.core.Object, id: Int, property: String, variant: String, value: js.Any): Unit = js.native
    def executeOptimizedGetter(instance: js.Any, clazz: qx.Class, name: String, variant: String): js.Dynamic = js.native
    def executeOptimizedSetter(instance: js.Any, clazz: qx.Class, name: String, variant: String, args: js.Any): js.Dynamic = js.native

}
}
