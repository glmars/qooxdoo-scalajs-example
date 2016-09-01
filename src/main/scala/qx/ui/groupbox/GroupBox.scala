
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.groupbox {
@js.native
@JSName("qx.ui.groupbox.GroupBox")
class GroupBox protected () extends qx.ui.core.Widget with qx.ui.form.IForm with qx.ui.core.MRemoteChildrenHandling with qx.ui.core.MRemoteLayoutHandling with qx.ui.core.MContentPadding with qx.ui.form.MForm {
    override def getEnabled(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Boolean = js.native
    def this(legend: String = ???, icon: String = ???) = this()
    protected def _applyLegendPosition(e: js.Any): Unit = js.native
    protected def _getContentPaddingTarget(): qx.ui.core.Widget = js.native
    protected def _repositionFrame(): Unit = js.native
    def getIcon(): String = js.native
    def getLegend(): String = js.native
    def getLegendPosition(): js.Dynamic = js.native
    protected def initLegendPosition(value: js.Any): js.Dynamic = js.native
    def resetLegendPosition(): Unit = js.native
    def setIcon(icon: String): Unit = js.native
    def setLegend(legend: String): Unit = js.native
    def setLegendPosition(value: js.Any): js.Dynamic = js.native

}
}
