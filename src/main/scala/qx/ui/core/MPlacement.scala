
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.core {
@js.native
@JSName("qx.ui.core.MPlacement")
trait MPlacement extends js.Object {
    protected def _getPlacementOffsets(): js.Dynamic = js.native
    protected def _place(coords: js.Any): Unit = js.native
    def getDomMove(): Boolean = js.native
    def getLayoutLocation(widget: qx.ui.core.Widget): js.Dynamic = js.native
    def getOffsetBottom(): Int = js.native
    def getOffsetLeft(): Int = js.native
    def getOffsetRight(): Int = js.native
    def getOffsetTop(): Int = js.native
    def getPlacementModeX(): js.Dynamic = js.native
    def getPlacementModeY(): js.Dynamic = js.native
    def getPlaceMethod(): js.Dynamic = js.native
    def getPosition(): js.Dynamic = js.native
    protected def initDomMove(value: Boolean): Boolean = js.native
    protected def initOffsetBottom(value: Int): Int = js.native
    protected def initOffsetLeft(value: Int): Int = js.native
    protected def initOffsetRight(value: Int): Int = js.native
    protected def initOffsetTop(value: Int): Int = js.native
    protected def initPlacementModeX(value: js.Any): js.Dynamic = js.native
    protected def initPlacementModeY(value: js.Any): js.Dynamic = js.native
    protected def initPlaceMethod(value: js.Any): js.Dynamic = js.native
    protected def initPosition(value: js.Any): js.Dynamic = js.native
    def isDomMove(): Boolean = js.native
    def moveTo(left: Int, top: Int): Unit = js.native
    def placeToElement(elem: HTMLElement, liveupdate: Boolean): Unit = js.native
    def placeToPoint(point: js.Any): Unit = js.native
    def placeToPointer(event: qx.event.typ.Pointer): Unit = js.native
    def placeToWidget(target: qx.ui.core.Widget, liveupdate: Boolean): Boolean = js.native
    def resetDomMove(): Unit = js.native
    def resetOffset(): Unit = js.native
    def resetOffsetBottom(): Unit = js.native
    def resetOffsetLeft(): Unit = js.native
    def resetOffsetRight(): Unit = js.native
    def resetOffsetTop(): Unit = js.native
    def resetPlacementModeX(): Unit = js.native
    def resetPlacementModeY(): Unit = js.native
    def resetPlaceMethod(): Unit = js.native
    def resetPosition(): Unit = js.native
    def setDomMove(value: Boolean): Boolean = js.native
    def setOffset(offsetTop: js.Any, offsetRight: js.Any, offsetBottom: js.Any, offsetLeft: js.Any): Unit = js.native
    def setOffsetBottom(value: Int): Int = js.native
    def setOffsetLeft(value: Int): Int = js.native
    def setOffsetRight(value: Int): Int = js.native
    def setOffsetTop(value: Int): Int = js.native
    def setPlacementModeX(value: js.Any): js.Dynamic = js.native
    def setPlacementModeY(value: js.Any): js.Dynamic = js.native
    def setPlaceMethod(value: js.Any): js.Dynamic = js.native
    def setPosition(value: js.Any): js.Dynamic = js.native
    def toggleDomMove(): Boolean = js.native

}
@js.native
@JSName("qx.ui.core.MPlacement")
object MPlacement extends js.Object {
    def getMoveDirection(): String = js.native
    def getVisibleElement(): qx.ui.core.Widget = js.native
    def setMoveDirection(direction: String): Unit = js.native
    def setVisibleElement(elem: qx.ui.core.Widget): Unit = js.native

}
}
