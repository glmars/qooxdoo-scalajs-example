
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.container {
@js.native
@JSName("qx.ui.container.SlideBar")
class SlideBar protected () extends qx.ui.core.Widget with qx.ui.core.MRemoteChildrenHandling with qx.ui.core.MRemoteLayoutHandling {
    def this(orientation: String = ???) = this()
    protected def _applyOrientation(value: js.Any, old: js.Any): Unit = js.native
    protected def _hideArrows(): Unit = js.native
    protected def _onExecuteBackward(): Unit = js.native
    protected def _onExecuteForward(): Unit = js.native
    protected def _onResize(e: qx.event.`type`.Event): Unit = js.native
    protected def _onRoll(e: qx.event.`type`.Roll): Unit = js.native
    protected def _onScroll(): Unit = js.native
    protected def _onScrollAnimationEnd(): Unit = js.native
    protected def _showArrows(): Unit = js.native
    protected def _updateArrowsEnabled(): Unit = js.native
    def getOrientation(): js.Dynamic = js.native
    def getScrollStep(): Int = js.native
    protected def initOrientation(value: js.Any): js.Dynamic = js.native
    protected def initScrollStep(value: Int): Int = js.native
    def resetOrientation(): Unit = js.native
    def resetScrollStep(): Unit = js.native
    def scrollBy(offset: Int = ???, duration: Long = ???): Unit = js.native
    def scrollTo(value: Int, duration: Long = ???): Unit = js.native
    def setOrientation(value: js.Any): js.Dynamic = js.native
    def setScrollStep(value: Int): Int = js.native

}
}
