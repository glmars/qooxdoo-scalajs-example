
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.dispatch {
@js.native
@JSName("qx.event.dispatch.MouseCapture")
class MouseCapture protected () extends qx.event.dispatch.AbstractBubbling {
    def this(manager: qx.event.Manager = ???, registration: qx.event.Registration = ???) = this()
    def activateCapture(element: HTMLElement, containerCapture: Boolean = ???): Unit = js.native
    def getCaptureElement(): HTMLElement = js.native
    def nativeReleaseCapture(element: HTMLElement): Unit = js.native
    def nativeSetCapture(element: HTMLElement, containerCapture: Boolean = ???): Unit = js.native
    def releaseCapture(): Unit = js.native

}
}
