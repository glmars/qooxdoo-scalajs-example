
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom {
@js.native
@JSName("qx.bom.Element")
class Element extends js.Object {

}
@js.native
@JSName("qx.bom.Element")
object Element extends js.Object {
    def activate(element: HTMLElement): Unit = js.native
    def addListener(element: HTMLElement, `type`: String, listener: js.Function, self: js.Any = ???, capture: Boolean = ???): String = js.native
    def blur(element: HTMLElement): Unit = js.native
    def capture(element: HTMLElement, containerCapture: Boolean = ???): Unit = js.native
    @JSName("clone")
    def cloneQx(element: HTMLElement, events: Boolean = ???): HTMLElement = js.native
    def deactivate(element: HTMLElement): Unit = js.native
    def focus(element: HTMLElement): Unit = js.native
    def hasListener(element: HTMLElement, `type`: String, capture: Boolean = ???): Boolean = js.native
    def releaseCapture(element: HTMLElement): Unit = js.native
    def removeListener(element: HTMLElement, `type`: String, listener: js.Function, self: js.Any = ???, capture: Boolean = ???): Boolean = js.native
    def removeListenerById(target: js.Any, id: String): Boolean = js.native

}
}
