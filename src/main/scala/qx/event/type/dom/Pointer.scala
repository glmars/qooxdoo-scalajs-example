
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.`type`.dom {
@js.native
@JSName("qx.event.type.dom.Pointer")
class Pointer protected () extends qx.event.`type`.dom.Custom {
    def this(`type`: js.Any = ???, domEvent: js.Any = ???, customProps: js.Any = ???) = this()

}
@js.native
@JSName("qx.event.type.dom.Pointer")
object Pointer extends js.Object {
    def getDocumentLeft(): Long = js.native
    def getDocumentTop(): Long = js.native
    def getPointerType(): String = js.native
    def getScreenLeft(): Long = js.native
    def getScreenTop(): Long = js.native
    def getViewportLeft(): Long = js.native
    def getViewportTop(): Long = js.native
    def normalize(event: qx.event.`type`.Event): Unit = js.native

}
}
