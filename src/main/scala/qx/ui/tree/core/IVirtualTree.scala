
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.tree.core {
@js.native
trait IVirtualTree extends js.Object {
    def closeNode(node: qx.core.Object): Unit
    def closeNodeWithoutScrolling(node: qx.core.Object): Unit
    def getLevel(row: Int): Int
    def getLookupTable(): qx.data.Array
    def getSelection(): qx.data.Array
    def hasChildren(node: qx.core.Object): Boolean
    def isNode(item: qx.core.Object): Boolean
    def isNodeOpen(node: qx.core.Object): Boolean
    def isShowTopLevelOpenCloseIcons(): Boolean
    def openNode(node: qx.core.Object): Unit
    def openNodeWithoutScrolling(node: qx.core.Object): Unit

}
}
