
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MSingleBorder")
trait MSingleBorder extends js.Object {
    protected def _applyStyle(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyWidth(value: Long, old: Long): Unit = js.native
    protected def _getDefaultInsetsForBorder(): js.Dynamic = js.native
    protected def _styleBorder(styles: js.Any): Unit = js.native
    def getColorBottom(): String = js.native
    def getColorLeft(): String = js.native
    def getColorRight(): String = js.native
    def getColorTop(): String = js.native
    def getStyleBottom(): js.Dynamic = js.native
    def getStyleLeft(): js.Dynamic = js.native
    def getStyleRight(): js.Dynamic = js.native
    def getStyleTop(): js.Dynamic = js.native
    def getWidthBottom(): Long = js.native
    def getWidthLeft(): Long = js.native
    def getWidthRight(): Long = js.native
    def getWidthTop(): Long = js.native
    protected def initColorBottom(value: String): String = js.native
    protected def initColorLeft(value: String): String = js.native
    protected def initColorRight(value: String): String = js.native
    protected def initColorTop(value: String): String = js.native
    protected def initStyleBottom(value: js.Any): js.Dynamic = js.native
    protected def initStyleLeft(value: js.Any): js.Dynamic = js.native
    protected def initStyleRight(value: js.Any): js.Dynamic = js.native
    protected def initStyleTop(value: js.Any): js.Dynamic = js.native
    protected def initWidthBottom(value: Long): Long = js.native
    protected def initWidthLeft(value: Long): Long = js.native
    protected def initWidthRight(value: Long): Long = js.native
    protected def initWidthTop(value: Long): Long = js.native
    def resetBottom(): Unit = js.native
    def resetColor(): Unit = js.native
    def resetColorBottom(): Unit = js.native
    def resetColorLeft(): Unit = js.native
    def resetColorRight(): Unit = js.native
    def resetColorTop(): Unit = js.native
    def resetLeft(): Unit = js.native
    def resetRight(): Unit = js.native
    def resetStyle(): Unit = js.native
    def resetStyleBottom(): Unit = js.native
    def resetStyleLeft(): Unit = js.native
    def resetStyleRight(): Unit = js.native
    def resetStyleTop(): Unit = js.native
    def resetTop(): Unit = js.native
    def resetWidth(): Unit = js.native
    def resetWidthBottom(): Unit = js.native
    def resetWidthLeft(): Unit = js.native
    def resetWidthRight(): Unit = js.native
    def resetWidthTop(): Unit = js.native
    def setBottom(widthBottom: js.Any, styleBottom: js.Any, colorBottom: js.Any): Unit = js.native
    def setColor(colorTop: js.Any, colorRight: js.Any, colorBottom: js.Any, colorLeft: js.Any): Unit = js.native
    def setColorBottom(value: String): String = js.native
    def setColorLeft(value: String): String = js.native
    def setColorRight(value: String): String = js.native
    def setColorTop(value: String): String = js.native
    def setLeft(widthLeft: js.Any, styleLeft: js.Any, colorLeft: js.Any): Unit = js.native
    def setRight(widthRight: js.Any, styleRight: js.Any, colorRight: js.Any): Unit = js.native
    def setStyle(styleTop: js.Any, styleRight: js.Any, styleBottom: js.Any, styleLeft: js.Any): Unit = js.native
    def setStyleBottom(value: js.Any): js.Dynamic = js.native
    def setStyleLeft(value: js.Any): js.Dynamic = js.native
    def setStyleRight(value: js.Any): js.Dynamic = js.native
    def setStyleTop(value: js.Any): js.Dynamic = js.native
    def setTop(widthTop: js.Any, styleTop: js.Any, colorTop: js.Any): Unit = js.native
    def setWidth(widthTop: js.Any, widthRight: js.Any, widthBottom: js.Any, widthLeft: js.Any): Unit = js.native
    def setWidthBottom(value: Long): Long = js.native
    def setWidthLeft(value: Long): Long = js.native
    def setWidthRight(value: Long): Long = js.native
    def setWidthTop(value: Long): Long = js.native

}
}
