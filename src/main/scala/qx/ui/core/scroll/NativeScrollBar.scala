
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.NativeScrollBar")
class NativeScrollBar protected () extends qx.ui.core.Widget with qx.ui.core.scroll.IScrollBar {
    override def getKnobFactor(): js.Dynamic = js.native
    override def getMaximum(): js.Dynamic = js.native
    override def getOrientation(): js.Dynamic = js.native
    override def getPosition(): js.Dynamic = js.native
    override protected def initKnobFactor(value: js.Any): js.Dynamic = js.native
    override protected def initMaximum(value: js.Any): js.Dynamic = js.native
    override protected def initOrientation(value: js.Any): js.Dynamic = js.native
    override protected def initPosition(value: js.Any): js.Dynamic = js.native
    override def resetKnobFactor(): Unit = js.native
    override def resetMaximum(): Unit = js.native
    override def resetOrientation(): Unit = js.native
    override def resetPosition(): Unit = js.native
    override def scrollBy(offset: Int, duration: Long): Unit = js.native
    override def scrollBySteps(steps: Int, duration: Long): Unit = js.native
    override def scrollTo(position: Int, duration: Long): Unit = js.native
    override def setKnobFactor(value: js.Any): js.Dynamic = js.native
    override def setMaximum(value: js.Any): js.Dynamic = js.native
    override def setOrientation(value: js.Any): js.Dynamic = js.native
    override def setPosition(value: js.Any): js.Dynamic = js.native
    def this(orientation: String = ???) = this()
    protected def _applyMaximum(value: Int, old: Int): Unit = js.native
    protected def _applyOrientation(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyPosition(value: Long, old: Long): Unit = js.native
    protected def _getScrollPaneElement(): qx.html.Element = js.native
    protected def _onAppear(e: qx.event.`type`.Data): Unit = js.native
    protected def _onScroll(e: qx.event.`type`.Event): Unit = js.native
    protected def _stopPropagation(e: qx.event.`type`.Event): Unit = js.native
    protected def _updateScrollBar(): Unit = js.native
    def getSingleStep(): Int = js.native
    protected def initSingleStep(value: Int): Int = js.native
    def resetSingleStep(): Unit = js.native
    def setSingleStep(value: Int): Int = js.native
    def stopScrollAnimation(): Unit = js.native
    def updatePosition(position: Long): Unit = js.native

}
}
