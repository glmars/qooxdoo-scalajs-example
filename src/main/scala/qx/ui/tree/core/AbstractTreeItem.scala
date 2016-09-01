
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.tree.core {
@js.native
@JSName("qx.ui.tree.core.AbstractTreeItem")
class AbstractTreeItem protected () extends qx.ui.tree.core.AbstractItem {
    def this(label: js.Any = ???) = this()
    def add(varargs: qx.ui.tree.core.AbstractTreeItem = ???): Unit = js.native
    def addAfter(treeItem: qx.ui.tree.core.AbstractTreeItem, after: qx.ui.tree.core.AbstractTreeItem): Unit = js.native
    def addAt(treeItem: qx.ui.tree.core.AbstractTreeItem, index: Int): Unit = js.native
    def addAtBegin(treeItem: qx.ui.tree.core.AbstractTreeItem): Unit = js.native
    def addBefore(treeItem: qx.ui.tree.core.AbstractTreeItem, before: qx.ui.tree.core.AbstractTreeItem): Unit = js.native
    def getChildren(): js.Array[qx.ui.tree.core.AbstractTreeItem] = js.native
    def getItems(recursive: Boolean = ???, invisible: Boolean = ???, ignoreFirst: Boolean = ???): js.Array[qx.ui.tree.core.AbstractTreeItem] = js.native
    def getParent(): qx.ui.tree.core.AbstractTreeItem = js.native
    def getParentChildrenContainer(): qx.ui.core.Widget = js.native
    def getTree(): qx.ui.tree.Tree = js.native
    def hasChildrenContainer(): Boolean = js.native
    protected def initParent(value: qx.ui.tree.core.AbstractTreeItem): qx.ui.tree.core.AbstractTreeItem = js.native
    def recursiveAddToWidgetQueue(): Unit = js.native
    def remove(varargs: qx.ui.tree.core.AbstractTreeItem = ???): Unit = js.native
    def removeAll(): Unit = js.native
    def removeAt(index: Int): Unit = js.native
    def resetParent(): Unit = js.native
    def setParent(value: qx.ui.tree.core.AbstractTreeItem): qx.ui.tree.core.AbstractTreeItem = js.native

}
}
