
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.lang {
@js.native
@JSName("qx.lang.Array")
class Array extends js.Object {

}
@js.native
@JSName("qx.lang.Array")
object Array extends js.Object {
    def append(arr1: js.Array[js.Any], arr2: js.Array[js.Any]): js.Array[js.Any] = js.native
    def cast(obj: js.Any, constructor: js.Function, offset: Int = ???): js.Array[js.Any] = js.native
    @JSName("clone")
    def cloneQx(arr: js.Array[js.Any]): js.Array[js.Any] = js.native
    def contains(arr: js.Array[js.Any], obj: js.Any): Boolean = js.native
    def equals(arr1: js.Array[js.Any], arr2: js.Array[js.Any]): Boolean = js.native
    def exclude(arr1: js.Array[js.Any], arr2: js.Array[js.Any]): js.Array[js.Any] = js.native
    def fromArguments(args: js.Any, offset: Int = ???): js.Array[js.Any] = js.native
    def fromCollection(coll: js.Any): js.Array[js.Any] = js.native
    def fromShortHand(input: js.Array[js.Any]): js.Array[js.Any] = js.native
    def insertAfter(arr: js.Array[js.Any], obj: js.Any, obj2: js.Any): js.Array[js.Any] = js.native
    def insertAt(arr: js.Array[js.Any], obj: js.Any, i: Int): js.Array[js.Any] = js.native
    def insertBefore(arr: js.Array[js.Any], obj: js.Any, obj2: js.Any): js.Array[js.Any] = js.native
    def max(arr: js.Array[Long]): Long = js.native
    def min(arr: js.Array[Long]): Long = js.native
    def range(start: Int, stop: Int, step: Int): js.Array[js.Any] = js.native
    def remove(arr: js.Array[js.Any], obj: js.Any): js.Dynamic = js.native
    def removeAll(arr: js.Array[js.Any]): js.Array[js.Any] = js.native
    def removeAt(arr: js.Array[js.Any], i: Int): js.Dynamic = js.native
    def sum(arr: js.Array[Long]): Long = js.native
    def unique(arr: js.Array[js.Any]): js.Array[js.Any] = js.native

}
}
