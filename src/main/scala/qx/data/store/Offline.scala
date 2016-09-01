
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.data.store {
@js.native
@JSName("qx.data.store.Offline")
class Offline protected () extends qx.core.Object {
    def this(key: String = ???, storage: String = ???, delegate: js.Any = ???) = this()
    protected def _applyModel(value: js.Any, old: js.Any): Unit = js.native
    protected def _initializeModel(): Unit = js.native
    protected def _setModel(data: js.Any): Unit = js.native
    protected def _storeModel(): Unit = js.native
    def getKey(): String = js.native
    def getModel(): js.Dynamic = js.native
    protected def initModel(value: js.Any): js.Dynamic = js.native
    def resetModel(): Unit = js.native
    def setModel(value: js.Any): js.Dynamic = js.native

}
}
