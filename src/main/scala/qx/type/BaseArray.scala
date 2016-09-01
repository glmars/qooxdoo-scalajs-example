
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.`type` {
@js.native
@JSName("qx.type.BaseArray")
class BaseArray protected () extends js.Array[js.Any] {
    def this(length_or_items: Int = ???) = this()
    def concat(varargs: js.Array[js.Any] = ???): qx.`type`.BaseArray = js.native
    def every(callback: js.Function, obj: js.Any): Boolean = js.native
    def filter(callback: js.Function, obj: js.Any): js.Dynamic = js.native
    def forEach(callback: js.Function, obj: js.Any): Unit = js.native
    def indexOf(searchElement: js.Any, fromIndex: Int = ???): Int = js.native
    def join(separator: String): String = js.native
    def lastIndexOf(searchElement: js.Any, fromIndex: Int = ???): Int = js.native
    def map(callback: js.Function, obj: js.Any): js.Dynamic = js.native
    def pop(): js.Dynamic = js.native
    def push(varargs: js.Any = ???): Int = js.native
    def reverse(): js.Array[js.Any] = js.native
    def shift(): js.Dynamic = js.native
    def slice(begin: Int, end: Int = ???): js.Dynamic = js.native
    def some(callback: js.Function, obj: js.Any): Boolean = js.native
    def sort(compareFunction: js.Function = ???): js.Array[js.Any] = js.native
    def splice(index: Int, howMany: Int, varargs: js.Any = ???): js.Dynamic = js.native
    def toArray(): js.Array[js.Any] = js.native
    def unshift(varargs: js.Any = ???): Int = js.native

}
}
