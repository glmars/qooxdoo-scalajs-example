
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.ScrollBar")
class ScrollBar protected () extends qx.ui.core.Widget with qx.ui.core.scroll.IScrollBar {
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
    protected def _applyKnobFactor(value: Long, old: Long): Unit = js.native
    protected def _applyMaximum(value: Int, old: Int): Unit = js.native
    protected def _applyOrientation(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyPageStep(value: Int, old: Int): Unit = js.native
    protected def _applyPosition(value: js.Any, old: js.Any): Unit = js.native
    protected def _onChangeSliderValue(e: qx.event.typ.Data): Unit = js.native
    protected def _onExecuteBegin(e: qx.event.typ.Event): Unit = js.native
    protected def _onExecuteEnd(e: qx.event.typ.Event): Unit = js.native
    protected def _onResizeSlider(e: qx.event.typ.Data): Unit = js.native
    protected def _onSlideAnimationEnd(): Unit = js.native
    def getPageStep(): Int = js.native
    def getSingleStep(): Int = js.native
    protected def initPageStep(value: Int): Int = js.native
    protected def initSingleStep(value: Int): Int = js.native
    def resetPageStep(): Unit = js.native
    def resetSingleStep(): Unit = js.native
    def setPageStep(value: Int): Int = js.native
    def setSingleStep(value: Int): Int = js.native
    def stopScrollAnimation(): Unit = js.native
    def updatePosition(position: Long): Unit = js.native

}
}
