
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.core {
@js.native
@JSName("qx.ui.core.MBlocker")
trait MBlocker extends js.Object {
    protected def _applyBlockerColor(value: String, old: String): Unit = js.native
    protected def _applyBlockerOpacity(value: Long, old: Long): Unit = js.native
    protected def _createBlocker(): qx.ui.core.Blocker = js.native
    def block(): Unit = js.native
    def blockContent(zIndex: Int): Unit = js.native
    def forceUnblock(): Unit = js.native
    def getBlocker(): qx.ui.core.Blocker = js.native
    def getBlockerColor(): String = js.native
    def getBlockerOpacity(): Long = js.native
    protected def initBlockerColor(value: String): String = js.native
    protected def initBlockerOpacity(value: Long): Long = js.native
    def isBlocked(): Boolean = js.native
    def resetBlockerColor(): Unit = js.native
    def resetBlockerOpacity(): Unit = js.native
    def setBlockerColor(value: String): String = js.native
    def setBlockerOpacity(value: Long): Long = js.native
    def unblock(): Unit = js.native

}
}
