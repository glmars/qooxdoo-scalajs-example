
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx {
@js.native
@JSName("qx.Mixin")
class Mixin extends js.Object {

}
@js.native
@JSName("qx.Mixin")
object Mixin extends js.Object {
    def checkCompatibility(mixins: js.Array[qx.Mixin]): Boolean = js.native
    def define(name: String, config: js.Any = ???): qx.Mixin = js.native
    def flatten(mixins: js.Array[qx.Mixin] = ???): js.Array[js.Any] = js.native
    def genericToString(): String = js.native
    def getByName(name: String): qx.Class = js.native
    def getTotalNumber(): Long = js.native
    def isCompatible(mixin: qx.Mixin, clazz: qx.Class): Boolean = js.native
    def isDefined(name: String): Boolean = js.native

}
}
