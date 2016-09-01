
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.io.request {
@js.native
@JSName("qx.io.request.Xhr")
class Xhr protected () extends qx.io.request.AbstractRequest {
    def this(url: String = ???, method: String = ???) = this()
    protected def _createResponseParser(): qx.util.ResponseParser = js.native
    def getAccept(): String = js.native
    def getAsync(): Boolean = js.native
    def getCache(): js.Dynamic = js.native
    def getMethod(): js.Dynamic = js.native
    protected def initAccept(value: String): String = js.native
    protected def initAsync(value: Boolean): Boolean = js.native
    protected def initCache(value: js.Any): js.Dynamic = js.native
    protected def initMethod(value: js.Any): js.Dynamic = js.native
    def isAsync(): Boolean = js.native
    def resetAccept(): Unit = js.native
    def resetAsync(): Unit = js.native
    def resetCache(): Unit = js.native
    def resetMethod(): Unit = js.native
    def setAccept(value: String): String = js.native
    def setAsync(value: Boolean): Boolean = js.native
    def setCache(value: js.Any): js.Dynamic = js.native
    def setMethod(value: js.Any): js.Dynamic = js.native
    def setParser(parser: String): js.Function = js.native
    def toggleAsync(): Boolean = js.native

}
}
