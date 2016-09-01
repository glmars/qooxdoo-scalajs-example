
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.SimpleTreeDataCellRenderer")
class SimpleTreeDataCellRenderer extends qx.ui.table.cellrenderer.Abstract {
    protected def _addExtraContentBeforeIcon(cellInfo: js.Any, pos: Int): js.Dynamic = js.native
    protected def _addExtraContentBeforeIndentation(cellInfo: js.Any, pos: Int): js.Dynamic = js.native
    protected def _addExtraContentBeforeLabel(cellInfo: js.Any, pos: Int): js.Dynamic = js.native
    protected def _addIcon(cellInfo: js.Any, pos: Int): js.Dynamic = js.native
    protected def _addImage(imageInfo: js.Any): String = js.native
    protected def _addIndentation(cellInfo: js.Any, pos: Int): js.Dynamic = js.native
    protected def _addLabel(cellInfo: js.Any, pos: Int): String = js.native
    protected def _getIndentSymbol(column: Int, node: Node, bUseTreeLines: Boolean, bAlwaysShowOpenCloseSymbol: Boolean, bExcludeFirstLevelTreeLines: Boolean): js.Dynamic = js.native
    def getAlwaysShowOpenCloseSymbol(): Boolean = js.native
    def getExcludeFirstLevelTreeLines(): Boolean = js.native
    def getUseTreeLines(): Boolean = js.native
    protected def initAlwaysShowOpenCloseSymbol(value: Boolean): Boolean = js.native
    protected def initExcludeFirstLevelTreeLines(value: Boolean): Boolean = js.native
    protected def initUseTreeLines(value: Boolean): Boolean = js.native
    def isAlwaysShowOpenCloseSymbol(): Boolean = js.native
    def isExcludeFirstLevelTreeLines(): Boolean = js.native
    def isUseTreeLines(): Boolean = js.native
    def resetAlwaysShowOpenCloseSymbol(): Unit = js.native
    def resetExcludeFirstLevelTreeLines(): Unit = js.native
    def resetUseTreeLines(): Unit = js.native
    def setAlwaysShowOpenCloseSymbol(value: Boolean): Boolean = js.native
    def setExcludeFirstLevelTreeLines(value: Boolean): Boolean = js.native
    def setUseTreeLines(value: Boolean): Boolean = js.native
    def toggleAlwaysShowOpenCloseSymbol(): Boolean = js.native
    def toggleExcludeFirstLevelTreeLines(): Boolean = js.native
    def toggleUseTreeLines(): Boolean = js.native

}
@js.native
@JSName("qx.ui.treevirtual.SimpleTreeDataCellRenderer")
object SimpleTreeDataCellRenderer extends js.Object {

}
}
