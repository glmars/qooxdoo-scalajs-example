
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.message {
@js.native
@JSName("qx.event.message.Bus")
class Bus extends qx.core.Object {
    def checkSubscription(message: String, subscriber: js.Function, context: js.Any): Boolean = js.native
    def dispatch(msg: qx.event.message.Message): Boolean = js.native
    def dispatchByName(name: String, data: js.Any): Boolean = js.native
    def getSubscriptions(): js.Dynamic = js.native
    def subscribe(message: String, subscriber: js.Function, context: js.Any): Boolean = js.native
    def unsubscribe(message: String, subscriber: js.Function, context: js.Any): Boolean = js.native

}
@js.native
@JSName("qx.event.message.Bus")
object Bus extends js.Object {
    def getInstance(): qx.event.message.Bus = js.native

}
}
