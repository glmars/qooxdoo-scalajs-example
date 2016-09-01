
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Dock")
class Dock protected () extends qx.ui.layout.Abstract {
    def this(spacingX: Int = ???, spacingY: Int = ???, separatorX: String = ???, separatorY: String = ???) = this()
    protected def _applySort(value: js.Any, old: js.Any): Unit = js.native
    protected def _getSeparatorWidths(): js.Dynamic = js.native
    def getConnectSeparators(): Boolean = js.native
    def getSeparatorX(): qx.ui.decoration.Decorator = js.native
    def getSeparatorY(): qx.ui.decoration.Decorator = js.native
    def getSort(): js.Dynamic = js.native
    def getSpacingX(): Int = js.native
    def getSpacingY(): Int = js.native
    protected def initConnectSeparators(value: Boolean): Boolean = js.native
    protected def initSeparatorX(value: qx.ui.decoration.Decorator): qx.ui.decoration.Decorator = js.native
    protected def initSeparatorY(value: qx.ui.decoration.Decorator): qx.ui.decoration.Decorator = js.native
    protected def initSort(value: js.Any): js.Dynamic = js.native
    protected def initSpacingX(value: Int): Int = js.native
    protected def initSpacingY(value: Int): Int = js.native
    def isConnectSeparators(): Boolean = js.native
    def resetConnectSeparators(): Unit = js.native
    def resetSeparatorX(): Unit = js.native
    def resetSeparatorY(): Unit = js.native
    def resetSort(): Unit = js.native
    def resetSpacingX(): Unit = js.native
    def resetSpacingY(): Unit = js.native
    def setConnectSeparators(value: Boolean): Boolean = js.native
    def setSeparatorX(value: qx.ui.decoration.Decorator): qx.ui.decoration.Decorator = js.native
    def setSeparatorY(value: qx.ui.decoration.Decorator): qx.ui.decoration.Decorator = js.native
    def setSort(value: js.Any): js.Dynamic = js.native
    def setSpacingX(value: Int): Int = js.native
    def setSpacingY(value: Int): Int = js.native
    def toggleConnectSeparators(): Boolean = js.native

}
}
