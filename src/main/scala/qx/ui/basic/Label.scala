
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.basic {
@js.native
@JSName("qx.ui.basic.Label")
class Label protected () extends qx.ui.core.Widget with qx.ui.form.IStringForm {
    override def getValue(): String = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: String): Unit = js.native
    def this(value: String = ???) = this()
    protected def _applyBuddy(value: qx.ui.core.Widget, old: qx.ui.core.Widget): Unit = js.native
    protected def _applyRich(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyTextAlign(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyValue(value: String, old: String): Unit = js.native
    protected def _applyWrap(value: Boolean, old: Boolean): Unit = js.native
    protected def _onChangeLocale(e: qx.event.`type`.Event): Unit = js.native
    protected def _onWebFontStatusChange(ev: qx.event.`type`.Data): Unit = js.native
    def getBuddy(): qx.ui.core.Widget = js.native
    def getRich(): Boolean = js.native
    def getTextAlign(): js.Dynamic = js.native
    def getWrap(): Boolean = js.native
    protected def initBuddy(value: qx.ui.core.Widget): qx.ui.core.Widget = js.native
    protected def initRich(value: Boolean): Boolean = js.native
    protected def initTextAlign(value: js.Any): js.Dynamic = js.native
    protected def initValue(value: String): String = js.native
    protected def initWrap(value: Boolean): Boolean = js.native
    def isRich(): Boolean = js.native
    def isWrap(): Boolean = js.native
    def resetBuddy(): Unit = js.native
    def resetRich(): Unit = js.native
    def resetTextAlign(): Unit = js.native
    def resetWrap(): Unit = js.native
    def setBuddy(value: qx.ui.core.Widget): qx.ui.core.Widget = js.native
    def setRich(value: Boolean): Boolean = js.native
    def setTextAlign(value: js.Any): js.Dynamic = js.native
    def setWrap(value: Boolean): Boolean = js.native
    def toggleRich(): Boolean = js.native
    def toggleWrap(): Boolean = js.native

}
}
