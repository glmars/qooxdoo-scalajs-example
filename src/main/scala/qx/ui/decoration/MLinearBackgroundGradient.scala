
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MLinearBackgroundGradient")
trait MLinearBackgroundGradient extends js.Object {
    protected def _applyLinearBackgroundGradient(value: js.Any, old: js.Any): Unit = js.native
    protected def _styleLinearBackgroundGradient(styles: js.Any): Unit = js.native
    def getColorPositionUnit(): js.Dynamic = js.native
    def getEndColor(): String = js.native
    def getEndColorPosition(): Long = js.native
    def getOrientation(): js.Dynamic = js.native
    def getStartColor(): String = js.native
    def getStartColorPosition(): Long = js.native
    protected def initColorPositionUnit(value: js.Any): js.Dynamic = js.native
    protected def initEndColor(value: String): String = js.native
    protected def initEndColorPosition(value: Long): Long = js.native
    protected def initOrientation(value: js.Any): js.Dynamic = js.native
    protected def initStartColor(value: String): String = js.native
    protected def initStartColorPosition(value: Long): Long = js.native
    def resetColorPositionUnit(): Unit = js.native
    def resetEndColor(): Unit = js.native
    def resetEndColorPosition(): Unit = js.native
    def resetGradientEnd(): Unit = js.native
    def resetGradientStart(): Unit = js.native
    def resetOrientation(): Unit = js.native
    def resetStartColor(): Unit = js.native
    def resetStartColorPosition(): Unit = js.native
    def setColorPositionUnit(value: js.Any): js.Dynamic = js.native
    def setEndColor(value: String): String = js.native
    def setEndColorPosition(value: Long): Long = js.native
    def setGradientEnd(endColor: js.Any, endColorPosition: js.Any): Unit = js.native
    def setGradientStart(startColor: js.Any, startColorPosition: js.Any): Unit = js.native
    def setOrientation(value: js.Any): js.Dynamic = js.native
    def setStartColor(value: String): String = js.native
    def setStartColorPosition(value: Long): Long = js.native

}
}
