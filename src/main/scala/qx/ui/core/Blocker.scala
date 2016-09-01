
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.core {
@js.native
@JSName("qx.ui.core.Blocker")
class Blocker protected () extends qx.core.Object {
    def this(widget: qx.ui.core.Widget = ???) = this()
    protected def _applyColor(value: String, old: String): Unit = js.native
    protected def _applyOpacity(value: Long, old: Long): Unit = js.native
    protected def _backupActiveWidget(): Unit = js.native
    protected def _block(zIndex: Long, blockContent: Boolean): Unit = js.native
    protected def _onChangeTheme(): Unit = js.native
    protected def _restoreActiveWidget(): Unit = js.native
    protected def _updateBlockerBounds(bounds: js.Any): Unit = js.native
    def block(): Unit = js.native
    def blockContent(zIndex: Int): Unit = js.native
    def forceUnblock(): Unit = js.native
    def getBlockerElement(widget: qx.ui.core.Widget): qx.html.Element = js.native
    def getColor(): String = js.native
    def getKeepBlockerActive(): Boolean = js.native
    def getOpacity(): Long = js.native
    protected def initColor(value: String): String = js.native
    protected def initKeepBlockerActive(value: Boolean): Boolean = js.native
    protected def initOpacity(value: Long): Long = js.native
    def isBlocked(): Boolean = js.native
    def isKeepBlockerActive(): Boolean = js.native
    def resetColor(): Unit = js.native
    def resetKeepBlockerActive(): Unit = js.native
    def resetOpacity(): Unit = js.native
    def setColor(value: String): String = js.native
    def setKeepBlockerActive(value: Boolean): Boolean = js.native
    def setOpacity(value: Long): Long = js.native
    def toggleKeepBlockerActive(): Boolean = js.native
    def unblock(): Unit = js.native

}
}
