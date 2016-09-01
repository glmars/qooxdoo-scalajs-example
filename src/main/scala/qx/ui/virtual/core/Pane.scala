
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.virtual.core {
@js.native
@JSName("qx.ui.virtual.core.Pane")
class Pane protected () extends qx.ui.core.Widget {
    def this(rowCount: Int = ???, columnCount: Int = ???, cellHeight: Int = ???, cellWidth: Int = ???) = this()
    protected def _deferredUpdateScrollPosition(): Unit = js.native
    protected def _fullUpdate(): Unit = js.native
    protected def _onAppear(): Unit = js.native
    protected def _onContextmenu(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onDbltap(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerDown(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onResize(): Unit = js.native
    protected def _onTap(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _setLayerWindow(layers: js.Array[qx.ui.virtual.core.ILayer], left: Int, top: Int, minWidth: Int, minHeight: Int, doFullUpdate: Boolean = ???): Unit = js.native
    protected def _updateScrollPosition(): Unit = js.native
    def addLayer(layer: qx.ui.virtual.core.ILayer): Unit = js.native
    def fullUpdate(): Unit = js.native
    def getCellAtPosition(documentX: Int, documentY: Int): js.Dynamic = js.native
    def getChildren(): js.Array[js.Dynamic] = js.native
    def getColumnConfig(): qx.ui.virtual.core.Axis = js.native
    def getLayers(): js.Array[qx.ui.virtual.core.ILayer] = js.native
    def getRowConfig(): qx.ui.virtual.core.Axis = js.native
    def getScrollMaxX(): Int = js.native
    def getScrollMaxY(): Int = js.native
    def getScrollSize(): js.Dynamic = js.native
    def getScrollX(): Int = js.native
    def getScrollY(): Int = js.native
    def getVisibleLayers(): js.Array[qx.ui.virtual.core.ILayer] = js.native
    def isUpdatePending(): Boolean = js.native
    def prefetchX(minLeft: Int, maxLeft: Int, minRight: Int, maxRight: Int): Unit = js.native
    def prefetchY(minAbove: Int, maxAbove: Int, minBelow: Int, maxBelow: Int): Unit = js.native
    def scrollCellIntoView(column: Int, row: Int): Unit = js.native
    def scrollColumnIntoView(column: Int): Unit = js.native
    def scrollRowIntoView(row: Int): Unit = js.native
    def setScrollX(value: Int): Unit = js.native
    def setScrollY(value: Int): Unit = js.native

}
}
