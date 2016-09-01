
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.handler {
@js.native
@JSName("qx.event.handler.Input")
class Input extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    protected def _inputFix(e: qx.event.`type`.Event, target: HTMLElement): Unit = js.native
    protected def _onChangeChecked(e: qx.event.`type`.Event): Unit = js.native
    protected def _onChangeValue(e: qx.event.`type`.Event): Unit = js.native
    protected def _onInput(e: qx.event.`type`.Event): Unit = js.native
    protected def _onKeyDown(e: qx.event.`type`.Event): Unit = js.native
    protected def _onKeyPress(e: qx.event.`type`.Event, target: HTMLElement): Unit = js.native
    protected def _onKeyUp(e: qx.event.`type`.Event): Unit = js.native
    protected def _onProperty(e: qx.event.`type`.Event): Unit = js.native

}
}
