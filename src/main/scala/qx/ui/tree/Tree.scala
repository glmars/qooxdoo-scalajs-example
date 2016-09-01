
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.tree {
@js.native
@JSName("qx.ui.tree.Tree")
class Tree extends qx.ui.core.scroll.AbstractScrollArea with qx.ui.core.IMultiSelection with qx.ui.form.IModelSelection with qx.ui.form.IForm with qx.ui.core.MMultiSelectionHandling with qx.ui.core.MContentPadding with qx.ui.form.MModelSelection with qx.ui.form.MForm {
    override def getEnabled(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Boolean = js.native
    protected def _applyHideRoot(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyOpenMode(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyRoot(value: qx.ui.tree.core.AbstractTreeItem, old: qx.ui.tree.core.AbstractTreeItem): Unit = js.native
    protected def _applyRootOpenClose(value: Boolean, old: Boolean): Unit = js.native
    protected def _getContentPaddingTarget(): qx.ui.core.Widget = js.native
    protected def _onChangeSelection(e: qx.event.`type`.Data): Unit = js.native
    protected def _onKeyPress(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onOpen(e: qx.event.`type`.Pointer): Unit = js.native
    def getChildren(): js.Array[qx.ui.tree.core.AbstractTreeItem] = js.native
    def getHideRoot(): Boolean = js.native
    def getItems(recursive: Boolean = ???, invisible: Boolean = ???): js.Array[qx.ui.tree.core.AbstractTreeItem] = js.native
    def getNextNodeOf(treeItem: qx.ui.tree.core.AbstractTreeItem, invisible: Boolean = ???): qx.ui.tree.core.AbstractTreeItem = js.native
    def getNextSiblingOf(treeItem: qx.ui.tree.core.AbstractTreeItem): qx.ui.tree.core.AbstractTreeItem = js.native
    def getOpenMode(): js.Dynamic = js.native
    def getPreviousNodeOf(treeItem: qx.ui.tree.core.AbstractTreeItem, invisible: Boolean = ???): qx.ui.tree.core.AbstractTreeItem = js.native
    def getPreviousSiblingOf(treeItem: qx.ui.tree.core.AbstractTreeItem): qx.ui.tree.core.AbstractTreeItem = js.native
    def getRoot(): qx.ui.tree.core.AbstractTreeItem = js.native
    def getRootOpenClose(): Boolean = js.native
    def getTreeItem(widget: qx.ui.core.Widget): qx.ui.tree.core.AbstractTreeItem = js.native
    protected def initHideRoot(value: Boolean): Boolean = js.native
    protected def initOpenMode(value: js.Any): js.Dynamic = js.native
    protected def initRoot(value: qx.ui.tree.core.AbstractTreeItem): qx.ui.tree.core.AbstractTreeItem = js.native
    protected def initRootOpenClose(value: Boolean): Boolean = js.native
    def isHideRoot(): Boolean = js.native
    def isRootOpenClose(): Boolean = js.native
    def resetHideRoot(): Unit = js.native
    def resetOpenMode(): Unit = js.native
    def resetRoot(): Unit = js.native
    def resetRootOpenClose(): Unit = js.native
    def setHideRoot(value: Boolean): Boolean = js.native
    def setOpenMode(value: js.Any): js.Dynamic = js.native
    def setRoot(value: qx.ui.tree.core.AbstractTreeItem): qx.ui.tree.core.AbstractTreeItem = js.native
    def setRootOpenClose(value: Boolean): Boolean = js.native
    def toggleHideRoot(): Boolean = js.native
    def toggleRootOpenClose(): Boolean = js.native

}
}
