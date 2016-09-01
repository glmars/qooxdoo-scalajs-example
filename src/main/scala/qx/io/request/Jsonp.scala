
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.io.request {
@js.native
@JSName("qx.io.request.Jsonp")
class Jsonp extends qx.io.request.AbstractRequest {
    def getCache(): Boolean = js.native
    protected def initCache(value: Boolean): Boolean = js.native
    def isCache(): Boolean = js.native
    def resetCache(): Unit = js.native
    def setCache(value: Boolean): Boolean = js.native
    def setCallbackName(name: String): Unit = js.native
    def setCallbackParam(param: String): Unit = js.native
    def toggleCache(): Boolean = js.native

}
}
