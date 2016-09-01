
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.lang {
@js.native
@JSName("qx.lang.Object")
class Object extends js.Object {

}
@js.native
@JSName("qx.lang.Object")
object Object extends js.Object {
    @JSName("clone")
    def cloneQx(source: js.Any, deep: Boolean): js.Dynamic = js.native
    def contains(map: js.Any, value: js.Any): Boolean = js.native
    def empty(map: js.Any): Unit = js.native
    def equals(object1: js.Any, object2: js.Any): Boolean = js.native
    def fromArray(array: js.Array[js.Any]): js.Dynamic = js.native
    def getKeyFromValue(map: js.Any, value: js.Any): String = js.native
    def getLength(map: js.Any): Int = js.native
    def getValues(map: js.Any): js.Array[js.Any] = js.native
    def invert(map: js.Any): js.Dynamic = js.native
    def isEmpty(map: js.Any): Boolean = js.native
    def mergeWith(target: js.Any, source: js.Any, overwrite: Boolean = ???): js.Dynamic = js.native

}
}
