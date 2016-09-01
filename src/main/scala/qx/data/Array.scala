
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.data {
@js.native
@JSName("qx.data.Array")
class Array protected () extends qx.core.Object with qx.data.IListData with qx.data.marshal.MEventBubbling {
    override def contains(item: js.Any): Boolean = js.native
    override def getItem(index: Long): js.Dynamic = js.native
    override def getLength(): Long = js.native
    override def setItem(index: Long, item: js.Any): Unit = js.native
    override def splice(startIndex: Int, amount: Int, varargs: js.Any = ???): qx.data.Array = js.native
    override def toArray(): js.Array[js.Any] = js.native
    def this(param: js.Any = ???) = this()
    def append(array: js.Array[js.Any]): Unit = js.native
    def concat(array: js.Array[js.Any]): qx.data.Array = js.native
    def copy(): qx.data.Array = js.native
    def equals(array: qx.data.Array): Boolean = js.native
    def every(callback: js.Function, self: js.Any = ???): Boolean = js.native
    def filter(callback: js.Function, self: js.Any = ???): qx.data.Array = js.native
    def forEach(callback: js.Function, context: js.Any): Unit = js.native
    def getAutoDisposeItems(): Boolean = js.native
    def indexOf(item: js.Any): Long = js.native
    protected def initAutoDisposeItems(value: Boolean): Boolean = js.native
    def insertAfter(after: js.Any, item: js.Any): Unit = js.native
    def insertAt(index: Int, item: js.Any): Unit = js.native
    def insertBefore(before: js.Any, item: js.Any): Unit = js.native
    def isAutoDisposeItems(): Boolean = js.native
    def join(connector: String): String = js.native
    def lastIndexOf(item: js.Any): Long = js.native
    def map(callback: js.Function, self: js.Any = ???): qx.data.Array = js.native
    def max(): Long = js.native
    def min(): Long = js.native
    def pop(): js.Dynamic = js.native
    def push(varargs: js.Any = ???): Long = js.native
    def reduce(callback: js.Function, initValue: js.Any = ???): js.Dynamic = js.native
    def reduceRight(callback: js.Function, initValue: js.Any = ???): js.Dynamic = js.native
    def remove(item: js.Any): js.Dynamic = js.native
    def removeAll(): js.Array[js.Any] = js.native
    def removeAt(index: Int): js.Dynamic = js.native
    def resetAutoDisposeItems(): Unit = js.native
    def reverse(): Unit = js.native
    def setAutoDisposeItems(value: Boolean): Boolean = js.native
    def shift(): js.Dynamic = js.native
    def slice(from: Long, to: Long = ???): qx.data.Array = js.native
    def some(callback: js.Function, self: js.Any = ???): Boolean = js.native
    def sort(func: js.Function): Unit = js.native
    def sum(): Long = js.native
    def toggleAutoDisposeItems(): Boolean = js.native
    def unshift(varargs: js.Any = ???): Int = js.native

}
}
