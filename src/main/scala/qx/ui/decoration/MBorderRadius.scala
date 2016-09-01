
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MBorderRadius")
trait MBorderRadius extends js.Object {
    protected def _applyBorderRadius(value: Int, old: Int): Unit = js.native
    protected def _styleBorderRadius(styles: js.Any): Unit = js.native
    def getRadiusBottomLeft(): Int = js.native
    def getRadiusBottomRight(): Int = js.native
    def getRadiusTopLeft(): Int = js.native
    def getRadiusTopRight(): Int = js.native
    protected def initRadiusBottomLeft(value: Int): Int = js.native
    protected def initRadiusBottomRight(value: Int): Int = js.native
    protected def initRadiusTopLeft(value: Int): Int = js.native
    protected def initRadiusTopRight(value: Int): Int = js.native
    def resetRadius(): Unit = js.native
    def resetRadiusBottomLeft(): Unit = js.native
    def resetRadiusBottomRight(): Unit = js.native
    def resetRadiusTopLeft(): Unit = js.native
    def resetRadiusTopRight(): Unit = js.native
    def setRadius(radiusTopLeft: js.Any, radiusTopRight: js.Any, radiusBottomRight: js.Any, radiusBottomLeft: js.Any): Unit = js.native
    def setRadiusBottomLeft(value: Int): Int = js.native
    def setRadiusBottomRight(value: Int): Int = js.native
    def setRadiusTopLeft(value: Int): Int = js.native
    def setRadiusTopRight(value: Int): Int = js.native

}
}
