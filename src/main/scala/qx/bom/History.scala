
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom {
@js.native
@JSName("qx.bom.History")
class History extends qx.core.Object {
    protected def _applyState(value: String, old: String): Unit = js.native
    protected def _applyTitle(title: String, old: String): Unit = js.native
    protected def _decode(value: String): String = js.native
    protected def _encode(value: String): String = js.native
    protected def _getHash(): String = js.native
    protected def _onHistoryLoad(state: String): Unit = js.native
    protected def _readState(): String = js.native
    protected def _setHash(value: String): Unit = js.native
    protected def _setInitialState(): Unit = js.native
    protected def _writeState(): Unit = js.native
    def addToHistory(state: String, newTitle: String = ???): Unit = js.native
    def getState(): String = js.native
    def getTitle(): String = js.native
    protected def initState(value: String): String = js.native
    protected def initTitle(value: String): String = js.native
    def navigateBack(): Unit = js.native
    def navigateForward(): Unit = js.native
    def resetState(): Unit = js.native
    def resetTitle(): Unit = js.native
    def setState(value: String): String = js.native
    def setTitle(value: String): String = js.native

}
@js.native
@JSName("qx.bom.History")
object History extends js.Object {
    def getInstance(): js.Dynamic = js.native

}
}
