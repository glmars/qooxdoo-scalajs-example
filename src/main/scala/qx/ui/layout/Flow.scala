
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Flow")
class Flow protected () extends qx.ui.layout.Abstract {
    def this(spacingX: Int = ???, spacingY: Int = ???, alignX: String = ???) = this()
    def getAlignX(): js.Dynamic = js.native
    def getAlignY(): js.Dynamic = js.native
    def getLastLineChildren(width: Long): js.Array[js.Any] = js.native
    def getReversed(): Boolean = js.native
    def getSpacingX(): Int = js.native
    def getSpacingY(): Int = js.native
    protected def initAlignX(value: js.Any): js.Dynamic = js.native
    protected def initAlignY(value: js.Any): js.Dynamic = js.native
    protected def initReversed(value: Boolean): Boolean = js.native
    protected def initSpacingX(value: Int): Int = js.native
    protected def initSpacingY(value: Int): Int = js.native
    def isReversed(): Boolean = js.native
    def resetAlignX(): Unit = js.native
    def resetAlignY(): Unit = js.native
    def resetReversed(): Unit = js.native
    def resetSpacingX(): Unit = js.native
    def resetSpacingY(): Unit = js.native
    def setAlignX(value: js.Any): js.Dynamic = js.native
    def setAlignY(value: js.Any): js.Dynamic = js.native
    def setReversed(value: Boolean): Boolean = js.native
    def setSpacingX(value: Int): Int = js.native
    def setSpacingY(value: Int): Int = js.native
    def toggleReversed(): Boolean = js.native

}
}
