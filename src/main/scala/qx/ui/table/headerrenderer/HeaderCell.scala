
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table.headerrenderer {
@js.native
@JSName("qx.ui.table.headerrenderer.HeaderCell")
class HeaderCell extends qx.ui.container.Composite {
    protected def _applyIcon(value: String, old: String): Unit = js.native
    protected def _applyLabel(value: String, old: String): Unit = js.native
    protected def _applySortIcon(value: String, old: String): Unit = js.native
    def getIcon(): String = js.native
    def getLabel(): String = js.native
    def getSortIcon(): String = js.native
    protected def initIcon(value: String): String = js.native
    protected def initLabel(value: String): String = js.native
    protected def initSortIcon(value: String): String = js.native
    def resetIcon(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetSortIcon(): Unit = js.native
    def setIcon(value: String): String = js.native
    def setLabel(value: String): String = js.native
    def setSortIcon(value: String): String = js.native

}
}
