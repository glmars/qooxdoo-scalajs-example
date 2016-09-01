
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event {
@js.native
@JSName("qx.event.Emitter")
class Emitter extends js.Object {
    def addListener(name: String, listener: js.Function, ctx: js.Any = ???): Int = js.native
    def addListenerOnce(name: String, listener: js.Function, ctx: js.Any = ???): Int = js.native
    def emit(name: String, data: js.Any = ???): Unit = js.native
    def getEntryById(id: Long): js.Dynamic = js.native
    def getListeners(): js.Dynamic = js.native
    def off(name: String, listener: js.Function, ctx: js.Any = ???): Int = js.native
    def offById(id: Int): Int = js.native
    def on(name: String, listener: js.Function, ctx: js.Any = ???): Int = js.native
    def once(name: String, listener: js.Function, ctx: js.Any = ???): Int = js.native
    def removeListener(name: String, listener: js.Function, ctx: js.Any = ???): Unit = js.native
    def removeListenerById(id: Int): Unit = js.native

}
}
