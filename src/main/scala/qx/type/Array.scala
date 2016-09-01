
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.`type` {
@js.native
@JSName("qx.type.Array")
class Array protected () extends qx.`type`.BaseArray {
    def this(length_or_items: Int = ???) = this()
    def append(arr: js.Array[js.Any]): js.Array[js.Any] = js.native
    @JSName("clone")
    def cloneQx(): js.Array[js.Any] = js.native
    def contains(obj: js.Any): Boolean = js.native
    def insertAfter(obj: js.Any, obj2: js.Any): js.Array[js.Any] = js.native
    def insertAt(obj: js.Any, i: Int): js.Array[js.Any] = js.native
    def insertBefore(obj: js.Any, obj2: js.Any): js.Array[js.Any] = js.native
    def prepend(arr: js.Array[js.Any]): js.Array[js.Any] = js.native
    def remove(obj: js.Any): js.Dynamic = js.native
    def removeAll(): js.Array[js.Any] = js.native
    def removeAt(i: Int): js.Dynamic = js.native

}
}
