
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.handler {
@js.native
@JSName("qx.event.handler.Focus")
class Focus protected () extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()
    protected def _applyActive(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyFocus(value: js.Any, old: js.Any): Unit = js.native
    protected def _initObserver(): Unit = js.native
    protected def _stopObserver(): Unit = js.native
    def activate(element: HTMLElement): Unit = js.native
    def blur(element: HTMLElement): Unit = js.native
    def deactivate(element: HTMLElement): Unit = js.native
    def focus(element: HTMLElement): Unit = js.native
    def getActive(): js.Dynamic = js.native
    def getFocus(): js.Dynamic = js.native
    protected def initActive(value: js.Any): js.Dynamic = js.native
    protected def initFocus(value: js.Any): js.Dynamic = js.native
    def resetActive(): Unit = js.native
    def resetFocus(): Unit = js.native
    def setActive(value: js.Any): js.Dynamic = js.native
    def setFocus(value: js.Any): js.Dynamic = js.native
    def tryActivate(element: HTMLElement): Unit = js.native

}
}
