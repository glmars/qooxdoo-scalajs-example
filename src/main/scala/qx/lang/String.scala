
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.lang {
@js.native
@JSName("qx.lang.String")
class String extends js.Object {

}
@js.native
@JSName("qx.lang.String")
object String extends js.Object {
    def camelCase(str: String): String = js.native
    def capitalize(str: String): String = js.native
    def clean(str: String): String = js.native
    def contains(str: String, substring: String): Boolean = js.native
    def endsWith(fullstr: String, substr: String): Boolean = js.native
    def escapeRegexpChars(str: String): String = js.native
    def firstLow(str: String): String = js.native
    def firstUp(str: String): String = js.native
    def format(pattern: String, args: js.Array[js.Any]): String = js.native
    def hyphenate(str: String): String = js.native
    def pad(str: String, length: Int, ch: String): String = js.native
    def quote(str: String): String = js.native
    def repeat(str: String, times: Int): String = js.native
    def startsWith(fullstr: String, substr: String): Boolean = js.native
    def stripScripts(str: String, exec: Boolean = ???): String = js.native
    def stripTags(str: String): String = js.native
    def toArray(str: String): js.Array[js.Any] = js.native
    def trimLeft(str: String): String = js.native
    def trimRight(str: String): String = js.native

}
}
