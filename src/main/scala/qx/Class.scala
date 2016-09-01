
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx {
@js.native
@JSName("qx.Class")
class Class extends js.Object {

}
@js.native
@JSName("qx.Class")
object Class extends js.Object {
    def define(name: String = ???, config: js.Any = ???): qx.Class = js.native
    def genericToString(): String = js.native
    def getByInterface(clazz: qx.Class, iface: qx.Interface): qx.Class = js.native
    def getByMixin(clazz: qx.Class, mixin: qx.Mixin): qx.Class = js.native
    def getByName(name: String): qx.Class = js.native
    def getByProperty(clazz: qx.Class, name: String): qx.Class = js.native
    def getEventType(clazz: qx.Class, name: String): String = js.native
    def getInstance(): js.Dynamic = js.native
    def getInterfaces(clazz: qx.Class): js.Array[qx.Interface] = js.native
    def getMixins(clazz: qx.Class): js.Array[qx.Mixin] = js.native
    def getProperties(clazz: qx.Class): js.Array[String] = js.native
    def getPropertyDefinition(clazz: qx.Class, name: String): js.Dynamic = js.native
    def getTotalNumber(): Long = js.native
    def hasInterface(clazz: qx.Class, iface: qx.Interface): Boolean = js.native
    def hasMixin(clazz: qx.Class, mixin: qx.Mixin): Boolean = js.native
    def hasOwnInterface(clazz: qx.Class, iface: qx.Interface): Boolean = js.native
    def hasOwnMixin(clazz: qx.Class, mixin: qx.Mixin): Boolean = js.native
    def hasProperty(clazz: qx.Class, name: String): Boolean = js.native
    def implementsInterface(obj: js.Any, iface: qx.Interface): Boolean = js.native
    def include(clazz: qx.Class, mixin: qx.Mixin): Unit = js.native
    def isDefined(name: String): Boolean = js.native
    def isSubClassOf(clazz: qx.Class, superClass: qx.Class): Boolean = js.native
    def patch(clazz: qx.Class, mixin: qx.Mixin): Unit = js.native
    def supportsEvent(clazz: qx.Class, name: String): Boolean = js.native
    def undefine(name: String): Unit = js.native

}
}
