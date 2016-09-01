
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.`type` {
@js.native
@JSName("qx.type.BaseString")
class BaseString protected () extends js.Object {
    def this(txt: String = ???) = this()
    def base(args: js.Any, varags: js.Any): js.Dynamic = js.native
    def charAt(index: Int): String = js.native
    def charCodeAt(index: Int): Int = js.native
    def concat(stringN: String): String = js.native
    def indexOf(index: String, offset: Int = ???): Int = js.native
    def lastIndexOf(index: String, offset: Int = ???): Int = js.native
    @JSName("match")
    def matchQx(regexp: js.Any): js.Dynamic = js.native
    def replace(regexp: js.Any, aFunction: js.Function): String = js.native
    def search(regexp: js.Any): js.Dynamic = js.native
    def slice(beginslice: Int, endSlice: Int = ???): String = js.native
    def split(separator: String = ???, limit: Int = ???): js.Array[js.Any] = js.native
    def substr(start: Int, length: Int = ???): String = js.native
    def substring(indexA: Int, indexB: Int = ???): String = js.native
    def toHashCode(): Int = js.native
    def toLocaleLowerCase(): String = js.native
    def toLocaleUpperCase(): String = js.native
    def toLowerCase(): String = js.native
    def toUpperCase(): String = js.native

}
}
