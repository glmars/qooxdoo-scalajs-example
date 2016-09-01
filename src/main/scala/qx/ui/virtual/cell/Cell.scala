
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.Cell")
class Cell extends qx.ui.virtual.cell.Abstract {
    protected def _applyAppearance(value: String, old: String): Unit = js.native
    protected def _applyBackgroundColor(value: String, old: String): Unit = js.native
    protected def _applyFont(value: String, old: String): Unit = js.native
    protected def _applyPadding(value: Int, old: Int): Unit = js.native
    protected def _applyTextAlign(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyTextColor(value: String, old: String): Unit = js.native
    protected def _getCssProperties(): js.Array[js.Any] = js.native
    protected def _getValue(propertyName: String): js.Dynamic = js.native
    protected def _storeStyle(propertyName: String, styles: String): Unit = js.native
    def getAppearance(): String = js.native
    def getBackgroundColor(): String = js.native
    def getFont(): String = js.native
    def getPaddingBottom(): Int = js.native
    def getPaddingLeft(): Int = js.native
    def getPaddingRight(): Int = js.native
    def getPaddingTop(): Int = js.native
    def getTextAlign(): js.Dynamic = js.native
    def getTextColor(): String = js.native
    protected def initAppearance(value: String): String = js.native
    protected def initBackgroundColor(value: String): String = js.native
    protected def initFont(value: String): String = js.native
    protected def initPaddingBottom(value: Int): Int = js.native
    protected def initPaddingLeft(value: Int): Int = js.native
    protected def initPaddingRight(value: Int): Int = js.native
    protected def initPaddingTop(value: Int): Int = js.native
    protected def initTextAlign(value: js.Any): js.Dynamic = js.native
    protected def initTextColor(value: String): String = js.native
    def resetAppearance(): Unit = js.native
    def resetBackgroundColor(): Unit = js.native
    def resetFont(): Unit = js.native
    def resetPadding(): Unit = js.native
    def resetPaddingBottom(): Unit = js.native
    def resetPaddingLeft(): Unit = js.native
    def resetPaddingRight(): Unit = js.native
    def resetPaddingTop(): Unit = js.native
    def resetTextAlign(): Unit = js.native
    def resetTextColor(): Unit = js.native
    def setAppearance(value: String): String = js.native
    def setBackgroundColor(value: String): String = js.native
    def setFont(value: String): String = js.native
    def setPadding(paddingTop: js.Any, paddingRight: js.Any, paddingBottom: js.Any, paddingLeft: js.Any): Unit = js.native
    def setPaddingBottom(value: Int): Int = js.native
    def setPaddingLeft(value: Int): Int = js.native
    def setPaddingRight(value: Int): Int = js.native
    def setPaddingTop(value: Int): Int = js.native
    def setTextAlign(value: js.Any): js.Dynamic = js.native
    def setTextColor(value: String): String = js.native

}
}
