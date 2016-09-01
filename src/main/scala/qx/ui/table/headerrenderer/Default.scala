
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table.headerrenderer {
@js.native
@JSName("qx.ui.table.headerrenderer.Default")
class Default extends qx.core.Object with qx.ui.table.IHeaderRenderer {
    override def createHeaderCell(cellInfo: js.Any): qx.ui.core.Widget = js.native
    override def updateHeaderCell(cellInfo: js.Any, cellWidget: qx.ui.core.Widget): Unit = js.native
    def getToolTip(): String = js.native
    protected def initToolTip(value: String): String = js.native
    def resetToolTip(): Unit = js.native
    def setToolTip(value: String): String = js.native

}
}
