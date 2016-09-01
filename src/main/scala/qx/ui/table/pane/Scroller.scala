
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.Scroller")
class Scroller protected () extends qx.ui.core.Widget with qx.ui.core.scroll.MScrollBarFactory {
    def this(table: qx.ui.table.Table = ???) = this()
    protected def _applyHorizontalScrollBarVisible(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyScrollTimeout(value: Int, old: Int): Unit = js.native
    protected def _applyShowCellFocusIndicator(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyTablePaneModel(value: qx.ui.table.pane.Model, old: qx.ui.table.pane.Model): Unit = js.native
    protected def _applyVerticalScrollBarVisible(value: Boolean, old: Boolean): Unit = js.native
    protected def _createHeaderClipper(): qx.ui.table.pane.Clipper = js.native
    protected def _createPaneClipper(): qx.ui.table.pane.Clipper = js.native
    protected def _focusCellAtPagePos(pageX: Int, pageY: Int): Unit = js.native
    protected def _getColumnForPageX(pageX: Int): Int = js.native
    protected def _getResizeColumnForPageX(pageX: Int): Int = js.native
    protected def _getRowForPagePos(pageX: Int, pageY: Int): Int = js.native
    protected def _hideResizeLine(): Unit = js.native
    protected def _onAppear(): Unit = js.native
    protected def _onCellEditorModalWindowClose(e: js.Any): Unit = js.native
    protected def _onChangeCaptureHeader(e: qx.event.`type`.Data): Unit = js.native
    protected def _onContextMenu(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onDbltapPane(e: js.Any): Unit = js.native
    protected def _onDisappear(): Unit = js.native
    protected def _oninterval(): Unit = js.native
    protected def _onPaneModelChanged(): Unit = js.native
    protected def _onPointerdownHeader(e: js.Any): Unit = js.native
    protected def _onPointerdownPane(e: js.Any): Unit = js.native
    protected def _onPointermoveHeader(e: js.Any): Unit = js.native
    protected def _onPointermovePane(e: js.Any): Unit = js.native
    protected def _onPointerout(e: js.Any): Unit = js.native
    protected def _onPointerupFocusIndicator(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerupHeader(e: js.Any): Unit = js.native
    protected def _onResizePane(): Unit = js.native
    protected def _onRoll(e: qx.event.`type`.Roll): Unit = js.native
    protected def _onScrollX(e: js.Any): Unit = js.native
    protected def _onScrollY(e: js.Any): Unit = js.native
    protected def _onTapHeader(e: js.Any): Unit = js.native
    protected def _onTapPane(e: js.Any): Unit = js.native
    protected def _postponedUpdateContent(): Unit = js.native
    protected def _showResizeLine(x: Int): Unit = js.native
    protected def _startInterval(timeout: Int): Unit = js.native
    protected def _startMoveHeader(moveCol: Int, pageX: Int): Unit = js.native
    protected def _startResizeHeader(resizeCol: Int, pageX: Int): Unit = js.native
    protected def _stopInterval(): Unit = js.native
    protected def _stopMoveHeader(): Unit = js.native
    protected def _stopResizeHeader(): Unit = js.native
    protected def _updateContent(): Unit = js.native
    protected def _updateFocusIndicator(): Unit = js.native
    def cancelEditing(): Unit = js.native
    def flushEditor(): Unit = js.native
    def getContextMenuFromDataCellsOnly(): Boolean = js.native
    def getFocusCellOnPointerMove(): Boolean = js.native
    def getFocusedColumn(): Int = js.native
    def getFocusedRow(): Int = js.native
    def getHeader(): qx.ui.table.pane.Header = js.native
    def getHorizontalScrollBarVisible(): Boolean = js.native
    def getLiveResize(): Boolean = js.native
    def getNeededScrollBars(forceHorizontal: Boolean = ???, preventVertical: Boolean = ???): Int = js.native
    def getPaneClipper(): qx.ui.table.pane.Clipper = js.native
    def getPaneInsetRight(): Int = js.native
    def getResetSelectionOnHeaderTap(): Boolean = js.native
    def getScrollAreaContainer(): qx.ui.table.pane.Clipper = js.native
    def getScrollTimeout(): Int = js.native
    def getScrollX(): Int = js.native
    def getScrollY(): Int = js.native
    def getSelectBeforeFocus(): Boolean = js.native
    def getShowCellFocusIndicator(): Boolean = js.native
    def getTable(): qx.ui.table.Table = js.native
    def getTablePane(): qx.ui.table.pane.Pane = js.native
    def getTablePaneModel(): qx.ui.table.pane.Model = js.native
    def getTopRightWidget(): qx.ui.core.Widget = js.native
    def getVerticalScrollBarVisible(): Boolean = js.native
    def getVerticalScrollBarWidth(): Int = js.native
    def hideColumnMoveFeedback(): Unit = js.native
    protected def initContextMenuFromDataCellsOnly(value: Boolean): Boolean = js.native
    protected def initFocusCellOnPointerMove(value: Boolean): Boolean = js.native
    protected def initHorizontalScrollBarVisible(value: Boolean): Boolean = js.native
    protected def initLiveResize(value: Boolean): Boolean = js.native
    protected def initResetSelectionOnHeaderTap(value: Boolean): Boolean = js.native
    protected def initScrollTimeout(value: Int): Int = js.native
    protected def initSelectBeforeFocus(value: Boolean): Boolean = js.native
    protected def initShowCellFocusIndicator(value: Boolean): Boolean = js.native
    protected def initTablePaneModel(value: qx.ui.table.pane.Model): qx.ui.table.pane.Model = js.native
    protected def initVerticalScrollBarVisible(value: Boolean): Boolean = js.native
    def isContextMenuFromDataCellsOnly(): Boolean = js.native
    def isEditing(): js.Dynamic = js.native
    def isFocusCellOnPointerMove(): Boolean = js.native
    def isHorizontalScrollBarVisible(): Boolean = js.native
    def isLiveResize(): Boolean = js.native
    def isResetSelectionOnHeaderTap(): Boolean = js.native
    def isSelectBeforeFocus(): Boolean = js.native
    def isShowCellFocusIndicator(): Boolean = js.native
    def isVerticalScrollBarVisible(): Boolean = js.native
    def onColOrderChanged(): Unit = js.native
    def onColVisibilityChanged(): Unit = js.native
    def onFocusChanged(): Unit = js.native
    def onKeepFirstVisibleRowCompleteChanged(): Unit = js.native
    def onSelectionChanged(): Unit = js.native
    def onTableModelDataChanged(firstRow: Int, lastRow: Int, firstColumn: Int, lastColumn: Int): Unit = js.native
    def onTableModelMetaDataChanged(): Unit = js.native
    def resetContextMenuFromDataCellsOnly(): Unit = js.native
    def resetFocusCellOnPointerMove(): Unit = js.native
    def resetHorizontalScrollBarVisible(): Unit = js.native
    def resetLiveResize(): Unit = js.native
    def resetResetSelectionOnHeaderTap(): Unit = js.native
    def resetScrollTimeout(): Unit = js.native
    def resetSelectBeforeFocus(): Unit = js.native
    def resetShowCellFocusIndicator(): Unit = js.native
    def resetTablePaneModel(): Unit = js.native
    def resetVerticalScrollBarVisible(): Unit = js.native
    def scrollCellVisible(col: Int, row: Int): Unit = js.native
    def setColumnWidth(col: Int, width: Int): Unit = js.native
    def setContextMenuFromDataCellsOnly(value: Boolean): Boolean = js.native
    def setFocusCellOnPointerMove(value: Boolean): Boolean = js.native
    def setFocusedCell(col: Int, row: Int): Unit = js.native
    def setHorizontalScrollBarVisible(value: Boolean): Boolean = js.native
    def setLiveResize(value: Boolean): Boolean = js.native
    def setPaneWidth(width: Int): Unit = js.native
    def setResetSelectionOnHeaderTap(value: Boolean): Boolean = js.native
    def setScrollTimeout(value: Int): Int = js.native
    def setScrollX(scrollX: Int): Unit = js.native
    def setScrollY(scrollY: Int, renderSync: Boolean = ???): Unit = js.native
    def setSelectBeforeFocus(value: Boolean): Boolean = js.native
    def setShowCellFocusIndicator(value: Boolean): Boolean = js.native
    def setTablePaneModel(value: qx.ui.table.pane.Model): qx.ui.table.pane.Model = js.native
    def setTopRightWidget(widget: qx.ui.core.Widget): Unit = js.native
    def setVerticalScrollBarVisible(value: Boolean): Boolean = js.native
    def showColumnMoveFeedback(pageX: Int): Int = js.native
    def startEditing(): Boolean = js.native
    def stopEditing(): Unit = js.native
    def toggleContextMenuFromDataCellsOnly(): Boolean = js.native
    def toggleFocusCellOnPointerMove(): Boolean = js.native
    def toggleHorizontalScrollBarVisible(): Boolean = js.native
    def toggleLiveResize(): Boolean = js.native
    def toggleResetSelectionOnHeaderTap(): Boolean = js.native
    def toggleSelectBeforeFocus(): Boolean = js.native
    def toggleShowCellFocusIndicator(): Boolean = js.native
    def toggleVerticalScrollBarVisible(): Boolean = js.native
    def updateHorScrollBarMaximum(): Unit = js.native
    def updateVerScrollBarMaximum(): Unit = js.native

}
}
