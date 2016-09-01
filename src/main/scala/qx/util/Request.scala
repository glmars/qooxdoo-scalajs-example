
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.util {
@js.native
@JSName("qx.util.Request")
class Request extends js.Object {

}
@js.native
@JSName("qx.util.Request")
object Request extends js.Object {
    def isCrossDomain(url: String): Boolean = js.native
    def isMethod(method: String): Boolean = js.native
    def isSuccessful(status: Long): Boolean = js.native
    def methodAllowsRequestBody(method: String): Boolean = js.native

}
}
