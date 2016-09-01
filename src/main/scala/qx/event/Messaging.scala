
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event {
@js.native
@JSName("qx.event.Messaging")
class Messaging extends js.Object {
    protected def _addListener(channel: String, `type`: String, handler: js.Function, scope: js.Any = ???): String = js.native
    protected def _emit(channel: String, path: String, params: js.Any, customData: js.Any): Unit = js.native
    protected def _emitListeners(channel: String, path: String, listeners: js.Array[js.Any], params: js.Any, customData: js.Any): Boolean = js.native
    protected def _emitRoute(channel: String, path: String, listener: js.Any, params: js.Any, customData: js.Any): Boolean = js.native
    def emit(channel: String, path: String, params: js.Any, customData: js.Any): Unit = js.native
    def has(channel: String, path: String): Boolean = js.native
    def on(channel: String, `type`: String, handler: js.Function, scope: js.Any = ???): String = js.native
    def onAny(`type`: String, handler: js.Function, scope: js.Any = ???): String = js.native
    def remove(id: String): Unit = js.native

}
}
