
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.core.scroll {
@js.native
trait IScrollBar extends js.Object {
    def getKnobFactor(): js.Dynamic
    def getMaximum(): js.Dynamic
    def getOrientation(): js.Dynamic
    def getPosition(): js.Dynamic
    protected def initKnobFactor(value: js.Any): js.Dynamic
    protected def initMaximum(value: js.Any): js.Dynamic
    protected def initOrientation(value: js.Any): js.Dynamic
    protected def initPosition(value: js.Any): js.Dynamic
    def resetKnobFactor(): Unit
    def resetMaximum(): Unit
    def resetOrientation(): Unit
    def resetPosition(): Unit
    def scrollBy(offset: Int, duration: Long): Unit
    def scrollBySteps(steps: Int, duration: Long): Unit
    def scrollTo(position: Int, duration: Long): Unit
    def setKnobFactor(value: js.Any): js.Dynamic
    def setMaximum(value: js.Any): js.Dynamic
    def setOrientation(value: js.Any): js.Dynamic
    def setPosition(value: js.Any): js.Dynamic

}
}
