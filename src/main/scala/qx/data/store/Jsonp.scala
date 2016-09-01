
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.data.store {
@js.native
@JSName("qx.data.store.Jsonp")
class Jsonp protected () extends qx.data.store.Json {
    def this(url: String = ???, delegate: js.Any = ???, callbackParam: String = ???) = this()
    def getCallbackName(): String = js.native
    def getCallbackParam(): String = js.native
    protected def initCallbackName(value: String): String = js.native
    protected def initCallbackParam(value: String): String = js.native
    def resetCallbackName(): Unit = js.native
    def resetCallbackParam(): Unit = js.native
    def setCallbackName(value: String): String = js.native
    def setCallbackParam(value: String): String = js.native

}
}
