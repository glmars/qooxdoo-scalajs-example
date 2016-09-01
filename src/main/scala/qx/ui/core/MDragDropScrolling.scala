
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.core {
@js.native
@JSName("qx.ui.core.MDragDropScrolling")
trait MDragDropScrolling extends js.Object {
    protected def _calculateScrollAmount(scrollbarSize: Long, exceedanceAmount: Long): Long = js.native
    protected def _calculateThresholdExceedance(diff: Long, threshold: Long): Long = js.native
    protected def _findScrollableParent(widget: qx.ui.core.LayoutItem): qx.ui.core.Widget = js.native
    protected def _getAxis(edgeType: String): String = js.native
    protected def _getBounds(scrollable: qx.ui.core.Widget): js.Dynamic = js.native
    protected def _getEdgeType(diff: js.Any, thresholdX: Long, thresholdY: Long): String = js.native
    protected def _getThresholdByEdgeType(edgeType: String): Long = js.native
    protected def _isScrollable(widget: qx.ui.core.Widget): Boolean = js.native
    protected def _isScrollbarExceedingMaxPos(scrollbar: qx.ui.core.scroll.IScrollBar, axis: String, amount: Long): Boolean = js.native
    protected def _isScrollbarVisible(scrollable: qx.ui.core.Widget, axis: String): Boolean = js.native
    protected def _scrollBy(scrollable: qx.ui.core.Widget, axis: String, exceedanceAmount: Long): Unit = js.native
    def getDragScrollSlowDownFactor(): Float = js.native
    def getDragScrollThresholdX(): Int = js.native
    def getDragScrollThresholdY(): Int = js.native
    protected def initDragScrollSlowDownFactor(value: Float): Float = js.native
    protected def initDragScrollThresholdX(value: Int): Int = js.native
    protected def initDragScrollThresholdY(value: Int): Int = js.native
    def resetDragScrollSlowDownFactor(): Unit = js.native
    def resetDragScrollThresholdX(): Unit = js.native
    def resetDragScrollThresholdY(): Unit = js.native
    def setDragScrollSlowDownFactor(value: Float): Float = js.native
    def setDragScrollThresholdX(value: Int): Int = js.native
    def setDragScrollThresholdY(value: Int): Int = js.native

}
}
