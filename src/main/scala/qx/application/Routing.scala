
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.application {
@js.native
@JSName("qx.application.Routing")
class Routing extends js.Object {
    protected def _executeGet(path: String, customData: js.Any, fromEvent: js.Any): Unit = js.native
    protected def _getPathOrFallback(path: String, defaultPath: String = ???): String = js.native
    def back(customData: js.Any = ???): Unit = js.native
    def dispose(): Unit = js.native
    def execute(path: String, customData: js.Any): Unit = js.native
    def executeDelete(path: String, params: js.Any, customData: js.Any): Unit = js.native
    def executeGet(path: String, customData: js.Any): Unit = js.native
    def executePost(path: String, params: js.Any, customData: js.Any): Unit = js.native
    def executePut(path: String, params: js.Any, customData: js.Any): Unit = js.native
    def getState(): String = js.native
    def init(defaultPath: String = ???): Unit = js.native
    def on(route: String, handler: js.Function, scope: js.Any): String = js.native
    def onAny(route: String, handler: js.Function, scope: js.Any): String = js.native
    def onDelete(route: String, handler: js.Function, scope: js.Any): String = js.native
    def onGet(route: String, handler: js.Function, scope: js.Any): String = js.native
    def onPost(route: String, handler: js.Function, scope: js.Any): String = js.native
    def onPut(route: String, handler: js.Function, scope: js.Any): String = js.native
    def remove(id: String): Unit = js.native

}
}
