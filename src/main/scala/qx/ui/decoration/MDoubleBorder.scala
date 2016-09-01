
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MDoubleBorder")
trait MDoubleBorder extends js.Object with qx.ui.decoration.MSingleBorder with qx.ui.decoration.MBackgroundImage {
    protected def _applyDoubleBorder(value: js.Any, old: js.Any): Unit = js.native
    def getInnerColorBottom(): String = js.native
    def getInnerColorLeft(): String = js.native
    def getInnerColorRight(): String = js.native
    def getInnerColorTop(): String = js.native
    def getInnerOpacity(): Long = js.native
    def getInnerWidthBottom(): Long = js.native
    def getInnerWidthLeft(): Long = js.native
    def getInnerWidthRight(): Long = js.native
    def getInnerWidthTop(): Long = js.native
    protected def initInnerColorBottom(value: String): String = js.native
    protected def initInnerColorLeft(value: String): String = js.native
    protected def initInnerColorRight(value: String): String = js.native
    protected def initInnerColorTop(value: String): String = js.native
    protected def initInnerOpacity(value: Long): Long = js.native
    protected def initInnerWidthBottom(value: Long): Long = js.native
    protected def initInnerWidthLeft(value: Long): Long = js.native
    protected def initInnerWidthRight(value: Long): Long = js.native
    protected def initInnerWidthTop(value: Long): Long = js.native
    def resetInnerColor(): Unit = js.native
    def resetInnerColorBottom(): Unit = js.native
    def resetInnerColorLeft(): Unit = js.native
    def resetInnerColorRight(): Unit = js.native
    def resetInnerColorTop(): Unit = js.native
    def resetInnerOpacity(): Unit = js.native
    def resetInnerWidth(): Unit = js.native
    def resetInnerWidthBottom(): Unit = js.native
    def resetInnerWidthLeft(): Unit = js.native
    def resetInnerWidthRight(): Unit = js.native
    def resetInnerWidthTop(): Unit = js.native
    def setInnerColor(innerColorTop: js.Any, innerColorRight: js.Any, innerColorBottom: js.Any, innerColorLeft: js.Any): Unit = js.native
    def setInnerColorBottom(value: String): String = js.native
    def setInnerColorLeft(value: String): String = js.native
    def setInnerColorRight(value: String): String = js.native
    def setInnerColorTop(value: String): String = js.native
    def setInnerOpacity(value: Long): Long = js.native
    def setInnerWidth(innerWidthTop: js.Any, innerWidthRight: js.Any, innerWidthBottom: js.Any, innerWidthLeft: js.Any): Unit = js.native
    def setInnerWidthBottom(value: Long): Long = js.native
    def setInnerWidthLeft(value: Long): Long = js.native
    def setInnerWidthRight(value: Long): Long = js.native
    def setInnerWidthTop(value: Long): Long = js.native

}
}
