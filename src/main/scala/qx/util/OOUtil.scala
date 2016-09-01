
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.util {
@js.native
@JSName("qx.util.OOUtil")
class OOUtil extends js.Object {

}
@js.native
@JSName("qx.util.OOUtil")
object OOUtil extends js.Object {
    def classIsDefined(name: String): Boolean = js.native
    def getByInterface(clazz: qx.Class, iface: qx.Interface): qx.Class = js.native
    def getEventType(clazz: qx.Class, name: String): String = js.native
    def getMixins(clazz: qx.Class): js.Array[qx.Mixin] = js.native
    def getPropertyDefinition(clazz: qx.Class, name: String): js.Dynamic = js.native
    def hasInterface(clazz: qx.Class, iface: qx.Interface): Boolean = js.native
    def hasProperty(clazz: qx.Class, name: String): Boolean = js.native
    def supportsEvent(clazz: qx.Class, name: String): Boolean = js.native

}
}
