
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.core.selection {
@js.native
@JSName("qx.ui.core.selection.Abstract")
class Abstract extends qx.core.Object {
    protected def _addToSelection(item: js.Any): Unit = js.native
    protected def _applyDefaultSelection(force: Boolean): js.Dynamic = js.native
    protected def _applyMode(value: js.Any, old: js.Any): Unit = js.native
    protected def _autoSelect(): Unit = js.native
    protected def _capture(): Unit = js.native
    protected def _cleanup(): Unit = js.native
    protected def _clearSelection(): Unit = js.native
    protected def _deselectItemRange(item1: js.Any, item2: js.Any): Unit = js.native
    protected def _fireChange(context: String): Unit = js.native
    protected def _getAnchorItem(): js.Dynamic = js.native
    protected def _getDimension(): js.Dynamic = js.native
    protected def _getFirstSelectable(): js.Dynamic = js.native
    protected def _getLastSelectable(): js.Dynamic = js.native
    protected def _getLocation(): js.Dynamic = js.native
    protected def _getPage(lead: js.Any, up: Boolean = ???): Unit = js.native
    protected def _getRelatedSelectable(item: js.Any, relation: String): js.Dynamic = js.native
    protected def _getScroll(): js.Dynamic = js.native
    protected def _getSelectableFromPointerEvent(event: qx.event.`type`.Pointer): js.Dynamic = js.native
    protected def _getSelectableLocationX(item: js.Any): js.Dynamic = js.native
    protected def _getSelectableLocationY(item: js.Any): js.Dynamic = js.native
    protected def _getSelectableRange(item1: js.Any, item2: js.Any): js.Array[js.Any] = js.native
    protected def _getSelectedItem(): js.Dynamic = js.native
    protected def _isSelectable(item: js.Any): Boolean = js.native
    protected def _onInterval(e: qx.event.`type`.Event): Unit = js.native
    protected def _releaseCapture(): Unit = js.native
    protected def _removeFromSelection(item: js.Any): Unit = js.native
    protected def _replaceMultiSelection(items: js.Array[js.Any]): Unit = js.native
    protected def _scrollBy(xoff: Int, yoff: Int): Unit = js.native
    protected def _scrollItemIntoView(item: js.Any): Unit = js.native
    protected def _selectableToHashCode(item: js.Any): String = js.native
    protected def _selectAllItems(): Unit = js.native
    protected def _selectItemRange(item1: js.Any, item2: js.Any, extend: Boolean = ???): Unit = js.native
    protected def _setAnchorItem(value: js.Any): Unit = js.native
    protected def _setLeadItem(value: js.Any): Unit = js.native
    protected def _setSelectedItem(item: js.Any): Unit = js.native
    protected def _styleSelectable(item: js.Any, `type`: String, enabled: Boolean): Unit = js.native
    protected def _toggleInSelection(item: js.Any): Unit = js.native
    def addItem(item: js.Any): Unit = js.native
    def clearSelection(): Unit = js.native
    def getDrag(): Boolean = js.native
    def getLeadItem(): js.Dynamic = js.native
    def getMode(): js.Dynamic = js.native
    def getQuick(): Boolean = js.native
    def getSelectables(all: Boolean): js.Array[js.Any] = js.native
    def getSelectedItem(): js.Dynamic = js.native
    def getSelection(): js.Array[js.Dynamic] = js.native
    def getSelectionContext(): String = js.native
    def getSortedSelection(): js.Array[js.Dynamic] = js.native
    def handleAddItem(e: qx.event.`type`.Data): Unit = js.native
    def handleKeyPress(event: qx.event.`type`.KeySequence): Unit = js.native
    def handleLoseCapture(event: qx.event.`type`.Pointer): Unit = js.native
    def handlePointerDown(event: qx.event.`type`.Pointer): Unit = js.native
    def handlePointerMove(event: qx.event.`type`.Pointer): Unit = js.native
    def handlePointerOver(event: qx.event.`type`.Pointer): Unit = js.native
    def handleRemoveItem(e: qx.event.`type`.Data): Unit = js.native
    def handleTap(event: qx.event.`type`.Tap): Unit = js.native
    protected def initDrag(value: Boolean): Boolean = js.native
    protected def initMode(value: js.Any): js.Dynamic = js.native
    protected def initQuick(value: Boolean): Boolean = js.native
    def invertSelection(): Unit = js.native
    def isDrag(): Boolean = js.native
    def isItemSelected(item: js.Any): Boolean = js.native
    def isQuick(): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def removeItem(item: js.Any): Unit = js.native
    def replaceSelection(items: js.Array[js.Any]): Unit = js.native
    def resetDrag(): Unit = js.native
    def resetMode(): Unit = js.native
    def resetQuick(): Unit = js.native
    def selectAll(): Unit = js.native
    def selectItem(item: js.Any): Unit = js.native
    def selectItemRange(begin: js.Any, end: js.Any): Unit = js.native
    def setDrag(value: Boolean): Boolean = js.native
    def setMode(value: js.Any): js.Dynamic = js.native
    def setQuick(value: Boolean): Boolean = js.native
    def toggleDrag(): Boolean = js.native
    def toggleQuick(): Boolean = js.native

}
}
