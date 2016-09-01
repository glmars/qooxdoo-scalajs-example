
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
@JSName("qx.ui.form.TextArea")
class TextArea protected () extends qx.ui.form.AbstractField {
    def this(value: String = ???) = this()
    protected def _applyAutoSize(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyMinimalLineHeight(value: Int, old: Int): Unit = js.native
    protected def _applyWrap(value: Boolean, old: Boolean): Unit = js.native
    protected def _getAreaHeight(): Int = js.native
    protected def _getScrolledAreaHeight(): Int = js.native
    protected def _onRoll(e: qx.event.`type`.Roll): Unit = js.native
    protected def _setAreaHeight(height: Int): Unit = js.native
    def getAutoSize(): Boolean = js.native
    def getMinimalLineHeight(): Int = js.native
    def getSingleStep(): Int = js.native
    def getWrap(): Boolean = js.native
    protected def initAutoSize(value: Boolean): Boolean = js.native
    protected def initMinimalLineHeight(value: Int): Int = js.native
    protected def initSingleStep(value: Int): Int = js.native
    protected def initWrap(value: Boolean): Boolean = js.native
    def isAutoSize(): Boolean = js.native
    def isWrap(): Boolean = js.native
    def resetAutoSize(): Unit = js.native
    def resetMinimalLineHeight(): Unit = js.native
    def resetSingleStep(): Unit = js.native
    def resetWrap(): Unit = js.native
    def setAutoSize(value: Boolean): Boolean = js.native
    def setMinimalLineHeight(value: Int): Int = js.native
    def setSingleStep(value: Int): Int = js.native
    def setWrap(value: Boolean): Boolean = js.native
    def toggleAutoSize(): Boolean = js.native
    def toggleWrap(): Boolean = js.native

}
}
