
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.VBox")
class VBox protected () extends qx.ui.layout.Abstract {
    def this(spacing: Int = ???, alignY: String = ???, separator: String = ???) = this()
    protected def _applyReversed(value: Boolean, old: Boolean): Unit = js.native
    def getAlignX(): js.Dynamic = js.native
    def getAlignY(): js.Dynamic = js.native
    def getReversed(): Boolean = js.native
    def getSeparator(): qx.ui.decoration.Decorator = js.native
    def getSpacing(): Int = js.native
    protected def initAlignX(value: js.Any): js.Dynamic = js.native
    protected def initAlignY(value: js.Any): js.Dynamic = js.native
    protected def initReversed(value: Boolean): Boolean = js.native
    protected def initSeparator(value: qx.ui.decoration.Decorator): qx.ui.decoration.Decorator = js.native
    protected def initSpacing(value: Int): Int = js.native
    def isReversed(): Boolean = js.native
    def resetAlignX(): Unit = js.native
    def resetAlignY(): Unit = js.native
    def resetReversed(): Unit = js.native
    def resetSeparator(): Unit = js.native
    def resetSpacing(): Unit = js.native
    def setAlignX(value: js.Any): js.Dynamic = js.native
    def setAlignY(value: js.Any): js.Dynamic = js.native
    def setReversed(value: Boolean): Boolean = js.native
    def setSeparator(value: qx.ui.decoration.Decorator): qx.ui.decoration.Decorator = js.native
    def setSpacing(value: Int): Int = js.native
    def toggleReversed(): Boolean = js.native

}
}
