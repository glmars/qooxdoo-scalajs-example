
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MBoxShadow")
trait MBoxShadow extends js.Object {
    protected def _applyBoxShadow(value: js.Any, old: js.Any): Unit = js.native
    protected def _styleBoxShadow(styles: js.Any): Unit = js.native
    def getInset(): Boolean = js.native
    def getShadowBlurRadius(): Int = js.native
    def getShadowColor(): String = js.native
    def getShadowHorizontalLength(): Int = js.native
    def getShadowSpreadRadius(): Int = js.native
    def getShadowVerticalLength(): Int = js.native
    protected def initInset(value: Boolean): Boolean = js.native
    protected def initShadowBlurRadius(value: Int): Int = js.native
    protected def initShadowColor(value: String): String = js.native
    protected def initShadowHorizontalLength(value: Int): Int = js.native
    protected def initShadowSpreadRadius(value: Int): Int = js.native
    protected def initShadowVerticalLength(value: Int): Int = js.native
    def isInset(): Boolean = js.native
    def resetInset(): Unit = js.native
    def resetShadowBlurRadius(): Unit = js.native
    def resetShadowColor(): Unit = js.native
    def resetShadowHorizontalLength(): Unit = js.native
    def resetShadowLength(): Unit = js.native
    def resetShadowSpreadRadius(): Unit = js.native
    def resetShadowVerticalLength(): Unit = js.native
    def setInset(value: Boolean): Boolean = js.native
    def setShadowBlurRadius(value: Int): Int = js.native
    def setShadowColor(value: String): String = js.native
    def setShadowHorizontalLength(value: Int): Int = js.native
    def setShadowLength(shadowHorizontalLength: js.Any, shadowVerticalLength: js.Any): Unit = js.native
    def setShadowSpreadRadius(value: Int): Int = js.native
    def setShadowVerticalLength(value: Int): Int = js.native
    def toggleInset(): Boolean = js.native

}
}
