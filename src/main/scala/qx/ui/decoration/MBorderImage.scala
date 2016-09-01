
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MBorderImage")
trait MBorderImage extends js.Object {
    protected def _applyBorderImage(value: js.Any, old: js.Any): Unit = js.native
    protected def _getDefaultInsetsForBorderImage(): js.Dynamic = js.native
    protected def _styleBorderImage(styles: js.Any): Unit = js.native
    def getBorderImage(): String = js.native
    def getBorderImageMode(): js.Dynamic = js.native
    def getFill(): Boolean = js.native
    def getRepeatX(): js.Dynamic = js.native
    def getRepeatY(): js.Dynamic = js.native
    def getSliceBottom(): Int = js.native
    def getSliceLeft(): Int = js.native
    def getSliceRight(): Int = js.native
    def getSliceTop(): Int = js.native
    protected def initBorderImage(value: String): String = js.native
    protected def initBorderImageMode(value: js.Any): js.Dynamic = js.native
    protected def initFill(value: Boolean): Boolean = js.native
    protected def initRepeatX(value: js.Any): js.Dynamic = js.native
    protected def initRepeatY(value: js.Any): js.Dynamic = js.native
    protected def initSliceBottom(value: Int): Int = js.native
    protected def initSliceLeft(value: Int): Int = js.native
    protected def initSliceRight(value: Int): Int = js.native
    protected def initSliceTop(value: Int): Int = js.native
    def isFill(): Boolean = js.native
    def resetBorderImage(): Unit = js.native
    def resetBorderImageMode(): Unit = js.native
    def resetFill(): Unit = js.native
    def resetRepeat(): Unit = js.native
    def resetRepeatX(): Unit = js.native
    def resetRepeatY(): Unit = js.native
    def resetSlice(): Unit = js.native
    def resetSliceBottom(): Unit = js.native
    def resetSliceLeft(): Unit = js.native
    def resetSliceRight(): Unit = js.native
    def resetSliceTop(): Unit = js.native
    def setBorderImage(value: String): String = js.native
    def setBorderImageMode(value: js.Any): js.Dynamic = js.native
    def setFill(value: Boolean): Boolean = js.native
    def setRepeat(repeatX: js.Any, repeatY: js.Any): Unit = js.native
    def setRepeatX(value: js.Any): js.Dynamic = js.native
    def setRepeatY(value: js.Any): js.Dynamic = js.native
    def setSlice(sliceTop: js.Any, sliceRight: js.Any, sliceBottom: js.Any, sliceLeft: js.Any): Unit = js.native
    def setSliceBottom(value: Int): Int = js.native
    def setSliceLeft(value: Int): Int = js.native
    def setSliceRight(value: Int): Int = js.native
    def setSliceTop(value: Int): Int = js.native
    def toggleFill(): Boolean = js.native

}
}
