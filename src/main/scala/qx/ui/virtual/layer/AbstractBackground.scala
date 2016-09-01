
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.AbstractBackground")
class AbstractBackground protected () extends qx.ui.virtual.layer.Abstract {
    def this(colorEven: String = ???, colorOdd: String = ???) = this()
    protected def _applyColorEven(value: String, old: String): Unit = js.native
    protected def _applyColorOdd(value: String, old: String): Unit = js.native
    def clearCustomColors(): Unit = js.native
    def getBackground(index: Int): qx.ui.decoration.IDecorator = js.native
    def getColor(index: Int): String = js.native
    def getColorEven(): String = js.native
    def getColorOdd(): String = js.native
    protected def initColorEven(value: String): String = js.native
    protected def initColorOdd(value: String): String = js.native
    def resetColorEven(): Unit = js.native
    def resetColorOdd(): Unit = js.native
    def setBackground(index: Int, decorator: qx.ui.decoration.IDecorator): Unit = js.native
    def setColor(index: Int, color: String): Unit = js.native
    def setColorEven(value: String): String = js.native
    def setColorOdd(value: String): String = js.native

}
}
