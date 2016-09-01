
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom.webfonts {
@js.native
@JSName("qx.bom.webfonts.Validator")
class Validator protected () extends qx.core.Object {
    def this(fontFamily: String = ???) = this()
    protected def _applyFontFamily(value: js.Any, old: js.Any): Unit = js.native
    protected def _getHelperElement(fontFamily: String): HTMLElement = js.native
    protected def _getRequestedHelpers(): js.Dynamic = js.native
    protected def _isFontValid(): Boolean = js.native
    protected def _reset(): Unit = js.native
    def getFontFamily(): js.Dynamic = js.native
    def getTimeout(): Int = js.native
    protected def initFontFamily(value: js.Any): js.Dynamic = js.native
    protected def initTimeout(value: Int): Int = js.native
    def resetFontFamily(): Unit = js.native
    def resetTimeout(): Unit = js.native
    def setFontFamily(value: js.Any): js.Dynamic = js.native
    def setTimeout(value: Int): Int = js.native
    def validate(): Unit = js.native

}
@js.native
@JSName("qx.bom.webfonts.Validator")
object Validator extends js.Object {
    def removeDefaultHelperElements(): Unit = js.native

}
}
