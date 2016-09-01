
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.Header")
class Header protected () extends qx.ui.core.Widget {
    def this(paneScroller: qx.ui.table.pane.Scroller = ???) = this()
    protected def _cleanUpCells(): Unit = js.native
    protected def _updateContent(completeUpdate: Boolean): Unit = js.native
    def getBlocker(): qx.ui.core.Blocker = js.native
    def getHeaderWidgetAtColumn(col: Int): qx.ui.table.headerrenderer.HeaderCell = js.native
    def getPaneScroller(): qx.ui.table.pane.Scroller = js.native
    def getTable(): qx.ui.table.Table = js.native
    def hideColumnMoveFeedback(): Unit = js.native
    def isShowingColumnMoveFeedback(): Boolean = js.native
    def onColOrderChanged(): Unit = js.native
    def onPaneModelChanged(): Unit = js.native
    def onTableModelMetaDataChanged(): Unit = js.native
    def setColumnWidth(col: Int, width: Int, isPointerAction: Boolean): Unit = js.native
    def setPointerOverColumn(col: Int): Unit = js.native
    def showColumnMoveFeedback(col: Int, x: Int): Unit = js.native

}
}
