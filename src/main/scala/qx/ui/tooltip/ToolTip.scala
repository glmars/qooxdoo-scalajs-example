
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.tooltip {
@js.native
@JSName("qx.ui.tooltip.ToolTip")
class ToolTip protected () extends qx.ui.popup.Popup {
    def this(label: String = ???, icon: String = ???) = this()
    protected def _applyArrowPosition(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyIcon(value: String, old: String): Unit = js.native
    protected def _applyLabel(value: String, old: String): Unit = js.native
    protected def _applyRich(value: Boolean, old: Boolean): Unit = js.native
    protected def _onPointerOver(e: qx.event.`type`.Pointer): Unit = js.native
    def getArrowPosition(): js.Dynamic = js.native
    def getHideTimeout(): Int = js.native
    def getIcon(): String = js.native
    def getLabel(): String = js.native
    def getOpener(): qx.ui.core.Widget = js.native
    def getRich(): Boolean = js.native
    def getShowTimeout(): Int = js.native
    protected def initArrowPosition(value: js.Any): js.Dynamic = js.native
    protected def initHideTimeout(value: Int): Int = js.native
    protected def initIcon(value: String): String = js.native
    protected def initLabel(value: String): String = js.native
    protected def initOpener(value: qx.ui.core.Widget): qx.ui.core.Widget = js.native
    protected def initRich(value: Boolean): Boolean = js.native
    protected def initShowTimeout(value: Int): Int = js.native
    def isRich(): Boolean = js.native
    def resetArrowPosition(): Unit = js.native
    def resetHideTimeout(): Unit = js.native
    def resetIcon(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetOpener(): Unit = js.native
    def resetRich(): Unit = js.native
    def resetShowTimeout(): Unit = js.native
    def setArrowPosition(value: js.Any): js.Dynamic = js.native
    def setHideTimeout(value: Int): Int = js.native
    def setIcon(value: String): String = js.native
    def setLabel(value: String): String = js.native
    def setOpener(value: qx.ui.core.Widget): qx.ui.core.Widget = js.native
    def setRich(value: Boolean): Boolean = js.native
    def setShowTimeout(value: Int): Int = js.native
    def toggleRich(): Boolean = js.native

}
}
