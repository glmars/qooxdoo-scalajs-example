
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom {
@js.native
@JSName("qx.bom.Event")
class Event extends js.Object {

}
@js.native
@JSName("qx.bom.Event")
object Event extends js.Object {
    def addNativeListener(target: js.Any, `type`: String, listener: js.Function, useCapture: Boolean = ???): Unit = js.native
    def fire(target: HTMLElement, `type`: String): Boolean = js.native
    def getEventName(target: js.Any, `type`: String): String = js.native
    def getRelatedTarget(e: qx.event.`type`.Event): HTMLElement = js.native
    def getTarget(e: qx.event.`type`.Event): js.Dynamic = js.native
    def preventDefault(e: qx.event.`type`.Event): Unit = js.native
    def removeNativeListener(target: js.Any, `type`: String, listener: js.Function, useCapture: Boolean = ???): Unit = js.native
    def stopPropagation(e: qx.event.`type`.Event): Unit = js.native
    def supportsEvent(target: js.Any, `type`: String): Boolean = js.native

}
}
