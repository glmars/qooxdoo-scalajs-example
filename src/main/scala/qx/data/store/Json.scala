
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.data.store {
@js.native
@JSName("qx.data.store.Json")
class Json protected () extends qx.core.Object {
    def this(url: String = ???, delegate: js.Any = ???) = this()
    protected def _applyUrl(value: String, old: String): Unit = js.native
    protected def _createRequest(url: String): Unit = js.native
    protected def _getRequest(): js.Dynamic = js.native
    protected def _onChangePhase(ev: qx.event.`type`.Data): Unit = js.native
    protected def _onFail(ev: qx.event.`type`.Event): Unit = js.native
    protected def _onSuccess(ev: qx.event.`type`.Event): Unit = js.native
    protected def _setRequest(request: js.Any): Unit = js.native
    def getModel(): js.Dynamic = js.native
    def getState(): js.Dynamic = js.native
    def getUrl(): String = js.native
    protected def initModel(value: js.Any): js.Dynamic = js.native
    protected def initState(value: js.Any): js.Dynamic = js.native
    protected def initUrl(value: String): String = js.native
    def reload(): Unit = js.native
    def resetModel(): Unit = js.native
    def resetState(): Unit = js.native
    def resetUrl(): Unit = js.native
    def setModel(value: js.Any): js.Dynamic = js.native
    def setState(value: js.Any): js.Dynamic = js.native
    def setUrl(value: String): String = js.native

}
}
