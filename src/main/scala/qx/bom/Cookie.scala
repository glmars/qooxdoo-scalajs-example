
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom {
@js.native
@JSName("qx.bom.Cookie")
class Cookie extends js.Object {

}
@js.native
@JSName("qx.bom.Cookie")
object Cookie extends js.Object {
    def del(key: String, path: String = ???, domain: String = ???): Unit = js.native
    def get(key: String): js.Dynamic = js.native
    def set(key: String, value: String, expires: Long = ???, path: String = ???, domain: String = ???, secure: Boolean = ???): Unit = js.native

}
}
