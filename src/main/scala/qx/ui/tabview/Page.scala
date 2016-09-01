
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.tabview {
@js.native
@JSName("qx.ui.tabview.Page")
class Page protected () extends qx.ui.container.Composite {
    def this(label: String = ???, icon: String = ???) = this()
    protected def _applyIcon(value: String, old: String): Unit = js.native
    protected def _applyLabel(value: String, old: String): Unit = js.native
    protected def _applyShowCloseButton(value: Boolean, old: Boolean): Unit = js.native
    protected def _onButtonClose(): Unit = js.native
    def getButton(): qx.ui.form.RadioButton = js.native
    def getIcon(): String = js.native
    def getLabel(): String = js.native
    def getShowCloseButton(): Boolean = js.native
    protected def initIcon(value: String): String = js.native
    protected def initLabel(value: String): String = js.native
    protected def initShowCloseButton(value: Boolean): Boolean = js.native
    def isShowCloseButton(): Boolean = js.native
    def resetIcon(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetShowCloseButton(): Unit = js.native
    def setIcon(value: String): String = js.native
    def setLabel(value: String): String = js.native
    def setShowCloseButton(value: Boolean): Boolean = js.native
    def toggleShowCloseButton(): Boolean = js.native

}
}
