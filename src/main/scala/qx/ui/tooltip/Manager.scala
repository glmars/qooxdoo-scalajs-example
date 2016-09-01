
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.tooltip {
@js.native
@JSName("qx.ui.tooltip.Manager")
class Manager extends qx.core.Object {
    protected def _applyCurrent(value: qx.ui.tooltip.ToolTip, old: qx.ui.tooltip.ToolTip): Unit = js.native
    def getCurrent(): qx.ui.tooltip.ToolTip = js.native
    def getSharedErrorTooltip(): qx.ui.tooltip.ToolTip = js.native
    def getSharedTooltip(): qx.ui.tooltip.ToolTip = js.native
    def getShowInvalidToolTips(): Boolean = js.native
    def getShowToolTips(): Boolean = js.native
    protected def initCurrent(value: qx.ui.tooltip.ToolTip): qx.ui.tooltip.ToolTip = js.native
    protected def initShowInvalidToolTips(value: Boolean): Boolean = js.native
    protected def initShowToolTips(value: Boolean): Boolean = js.native
    def isShowInvalidToolTips(): Boolean = js.native
    def isShowToolTips(): Boolean = js.native
    def resetCurrent(): Unit = js.native
    def resetShowInvalidToolTips(): Unit = js.native
    def resetShowToolTips(): Unit = js.native
    def setCurrent(value: qx.ui.tooltip.ToolTip): qx.ui.tooltip.ToolTip = js.native
    def setShowInvalidToolTips(value: Boolean): Boolean = js.native
    def setShowToolTips(value: Boolean): Boolean = js.native
    def showToolTip(target: js.Any): Unit = js.native
    def toggleShowInvalidToolTips(): Boolean = js.native
    def toggleShowToolTips(): Boolean = js.native

}
@js.native
@JSName("qx.ui.tooltip.Manager")
object Manager extends js.Object {
    def getInstance(): qx.ui.tooltip.Manager = js.native

}
}
