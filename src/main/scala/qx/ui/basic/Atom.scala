
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.basic {
@js.native
@JSName("qx.ui.basic.Atom")
class Atom protected () extends qx.ui.core.Widget {
    def this(label: String = ???, icon: String = ???) = this()
    protected def _applyCenter(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyGap(value: Int, old: Int): Unit = js.native
    protected def _applyIcon(value: String, old: String): Unit = js.native
    protected def _applyIconPosition(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyLabel(value: String, old: String): Unit = js.native
    protected def _applyRich(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyShow(value: js.Any, old: js.Any): Unit = js.native
    protected def _handleIcon(): Unit = js.native
    protected def _handleLabel(): Unit = js.native
    def getCenter(): Boolean = js.native
    def getGap(): Int = js.native
    def getIcon(): String = js.native
    def getIconPosition(): js.Dynamic = js.native
    def getLabel(): String = js.native
    def getRich(): Boolean = js.native
    def getShow(): js.Dynamic = js.native
    protected def initCenter(value: Boolean): Boolean = js.native
    protected def initGap(value: Int): Int = js.native
    protected def initIcon(value: String): String = js.native
    protected def initIconPosition(value: js.Any): js.Dynamic = js.native
    protected def initLabel(value: String): String = js.native
    protected def initRich(value: Boolean): Boolean = js.native
    protected def initShow(value: js.Any): js.Dynamic = js.native
    def isCenter(): Boolean = js.native
    def isRich(): Boolean = js.native
    def resetCenter(): Unit = js.native
    def resetGap(): Unit = js.native
    def resetIcon(): Unit = js.native
    def resetIconPosition(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetRich(): Unit = js.native
    def resetShow(): Unit = js.native
    def setCenter(value: Boolean): Boolean = js.native
    def setGap(value: Int): Int = js.native
    def setIcon(value: String): String = js.native
    def setIconPosition(value: js.Any): js.Dynamic = js.native
    def setLabel(value: String): String = js.native
    def setRich(value: Boolean): Boolean = js.native
    def setShow(value: js.Any): js.Dynamic = js.native
    def toggleCenter(): Boolean = js.native
    def toggleRich(): Boolean = js.native

}
}
