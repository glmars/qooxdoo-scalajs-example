
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.tree {
@js.native
@JSName("qx.ui.tree.VirtualTree")
class VirtualTree protected () extends qx.ui.virtual.core.Scroller with qx.ui.tree.core.IVirtualTree with qx.data.controller.ISelection with qx.ui.virtual.selection.MModel with qx.ui.core.MContentPadding {
    override def closeNode(node: qx.core.Object): Unit = js.native
    override def closeNodeWithoutScrolling(node: qx.core.Object): Unit = js.native
    override def getLevel(row: Int): Int = js.native
    override def getLookupTable(): qx.data.Array = js.native
    override def hasChildren(node: qx.core.Object): Boolean = js.native
    override def isNode(item: qx.core.Object): Boolean = js.native
    override def isNodeOpen(node: qx.core.Object): Boolean = js.native
    override def isShowTopLevelOpenCloseIcons(): Boolean = js.native
    override def openNode(node: qx.core.Object): Unit = js.native
    override def openNodeWithoutScrolling(node: qx.core.Object): Unit = js.native
    def this(model: qx.core.Object = ???, labelPath: String = ???, childProperty: String = ???) = this()
    protected def _afterApplySelection(): Unit = js.native
    protected def _applyChildProperty(value: String, old: String): Unit = js.native
    protected def _applyDelegate(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyHideRoot(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyIconOptions(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyIconPath(value: String, old: String): Unit = js.native
    protected def _applyLabelOptions(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyLabelPath(value: String, old: String): Unit = js.native
    protected def _applyModel(value: qx.core.Object, old: qx.core.Object): Unit = js.native
    protected def _applyOpenMode(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyRowHeight(value: Int, old: Int): Unit = js.native
    protected def _applyShowLeafs(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyShowTopLevelOpenCloseIcons(value: Boolean, old: Boolean): Unit = js.native
    protected def _beforeApplySelection(newSelection: js.Array[js.Any]): Unit = js.native
    protected def _getContentPaddingTarget(): qx.ui.core.Widget = js.native
    protected def _getDataFromRow(row: Int): js.Dynamic = js.native
    protected def _getSelectables(): qx.data.Array = js.native
    protected def _init(): Unit = js.native
    protected def _initLayer(): Unit = js.native
    protected def _onChangeBubble(event: qx.event.typ.Data): Unit = js.native
    protected def _onKeyPress(e: qx.event.typ.KeySequence): Unit = js.native
    protected def _onOpen(event: qx.ui.virtual.core.CellEvent): Unit = js.native
    protected def _onUpdated(event: qx.event.typ.Event): Unit = js.native
    protected def _reverseLookup(index: Long): Long = js.native
    def buildLookupTable(): Unit = js.native
    def getChildProperty(): String = js.native
    def getDelegate(): js.Dynamic = js.native
    def getHideRoot(): Boolean = js.native
    def getIconOptions(): js.Dynamic = js.native
    def getIconPath(): String = js.native
    def getItemHeight(): Int = js.native
    def getLabelOptions(): js.Dynamic = js.native
    def getLabelPath(): String = js.native
    def getModel(): qx.core.Object = js.native
    def getOpenMode(): js.Dynamic = js.native
    def getOpenNodes(): js.Array[js.Any] = js.native
    def getParent(item: qx.core.Object): qx.core.Object = js.native
    def getShowLeafs(): Boolean = js.native
    def getShowTopLevelOpenCloseIcons(): Boolean = js.native
    protected def initChildProperty(value: String): String = js.native
    protected def initDelegate(value: js.Any): js.Dynamic = js.native
    protected def initHideRoot(value: Boolean): Boolean = js.native
    protected def initIconOptions(value: js.Any): js.Dynamic = js.native
    protected def initIconPath(value: String): String = js.native
    protected def initItemHeight(value: Int): Int = js.native
    protected def initLabelOptions(value: js.Any): js.Dynamic = js.native
    protected def initLabelPath(value: String): String = js.native
    protected def initModel(value: qx.core.Object): qx.core.Object = js.native
    protected def initOpenMode(value: js.Any): js.Dynamic = js.native
    protected def initShowLeafs(value: Boolean): Boolean = js.native
    protected def initShowTopLevelOpenCloseIcons(value: Boolean): Boolean = js.native
    def isHideRoot(): Boolean = js.native
    def isShowLeafs(): Boolean = js.native
    def openNodeAndParents(node: qx.core.Object): Unit = js.native
    def refresh(): Unit = js.native
    def resetChildProperty(): Unit = js.native
    def resetDelegate(): Unit = js.native
    def resetHideRoot(): Unit = js.native
    def resetIconOptions(): Unit = js.native
    def resetIconPath(): Unit = js.native
    def resetItemHeight(): Unit = js.native
    def resetLabelOptions(): Unit = js.native
    def resetLabelPath(): Unit = js.native
    def resetModel(): Unit = js.native
    def resetOpenMode(): Unit = js.native
    def resetShowLeafs(): Unit = js.native
    def resetShowTopLevelOpenCloseIcons(): Unit = js.native
    def setChildProperty(value: String): String = js.native
    def setDelegate(value: js.Any): js.Dynamic = js.native
    def setHideRoot(value: Boolean): Boolean = js.native
    def setIconOptions(value: js.Any): js.Dynamic = js.native
    def setIconPath(value: String): String = js.native
    def setItemHeight(value: Int): Int = js.native
    def setLabelOptions(value: js.Any): js.Dynamic = js.native
    def setLabelPath(value: String): String = js.native
    def setModel(value: qx.core.Object): qx.core.Object = js.native
    def setOpenMode(value: js.Any): js.Dynamic = js.native
    def setShowLeafs(value: Boolean): Boolean = js.native
    def setShowTopLevelOpenCloseIcons(value: Boolean): Boolean = js.native
    def toggleHideRoot(): Boolean = js.native
    def toggleShowLeafs(): Boolean = js.native
    def toggleShowTopLevelOpenCloseIcons(): Boolean = js.native

}
}
