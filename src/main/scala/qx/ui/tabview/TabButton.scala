
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.tabview {
@js.native
@JSName("qx.ui.tabview.TabButton")
class TabButton extends qx.ui.form.RadioButton with qx.ui.form.IRadioItem {
    override def getGroup(): qx.ui.form.RadioGroup = js.native
    override def getValue(): Boolean = js.native
    override def setGroup(value: qx.ui.form.RadioGroup): Unit = js.native
    override def setValue(value: Boolean): Unit = js.native
    protected def _applyShowCloseButton(value: Boolean, old: Boolean): Unit = js.native
    protected def _onCloseButtonTap(): Unit = js.native
    def getShowCloseButton(): Boolean = js.native
    protected def initShowCloseButton(value: Boolean): Boolean = js.native
    def isShowCloseButton(): Boolean = js.native
    def resetShowCloseButton(): Unit = js.native
    def setShowCloseButton(value: Boolean): Boolean = js.native
    def toggleShowCloseButton(): Boolean = js.native

}
}
