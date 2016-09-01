
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom {
@js.native
@JSName("qx.bom.Font")
class Font protected () extends qx.core.Object {
    def this(size: String = ???, family: js.Array[String] = ???) = this()
    protected def _applyBold(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyColor(value: String, old: String): Unit = js.native
    protected def _applyDecoration(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyFamily(value: js.Array[js.Any], old: js.Array[js.Any]): Unit = js.native
    protected def _applyItalic(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyLineHeight(value: Long, old: Long): Unit = js.native
    protected def _applySize(value: Int, old: Int): Unit = js.native
    protected def _applyTextShadow(value: String, old: String): Unit = js.native
    def getBold(): Boolean = js.native
    def getColor(): String = js.native
    def getDecoration(): js.Dynamic = js.native
    def getFamily(): js.Array[js.Any] = js.native
    def getItalic(): Boolean = js.native
    def getLineHeight(): Long = js.native
    def getSize(): Int = js.native
    def getStyles(): js.Dynamic = js.native
    def getTextShadow(): String = js.native
    protected def initBold(value: Boolean): Boolean = js.native
    protected def initColor(value: String): String = js.native
    protected def initDecoration(value: js.Any): js.Dynamic = js.native
    protected def initFamily(value: js.Array[js.Any]): js.Array[js.Any] = js.native
    protected def initItalic(value: Boolean): Boolean = js.native
    protected def initLineHeight(value: Long): Long = js.native
    protected def initSize(value: Int): Int = js.native
    protected def initTextShadow(value: String): String = js.native
    def isBold(): Boolean = js.native
    def isItalic(): Boolean = js.native
    def resetBold(): Unit = js.native
    def resetColor(): Unit = js.native
    def resetDecoration(): Unit = js.native
    def resetFamily(): Unit = js.native
    def resetItalic(): Unit = js.native
    def resetLineHeight(): Unit = js.native
    def resetSize(): Unit = js.native
    def resetTextShadow(): Unit = js.native
    def setBold(value: Boolean): Boolean = js.native
    def setColor(value: String): String = js.native
    def setDecoration(value: js.Any): js.Dynamic = js.native
    def setFamily(value: js.Array[js.Any]): js.Array[js.Any] = js.native
    def setItalic(value: Boolean): Boolean = js.native
    def setLineHeight(value: Long): Long = js.native
    def setSize(value: Int): Int = js.native
    def setTextShadow(value: String): String = js.native
    def toggleBold(): Boolean = js.native
    def toggleItalic(): Boolean = js.native

}
@js.native
@JSName("qx.bom.Font")
object Font extends js.Object {
    def fromConfig(config: js.Any): qx.bom.Font = js.native
    def fromString(str: String): qx.bom.Font = js.native
    def getDefaultStyles(): js.Dynamic = js.native

}
}
