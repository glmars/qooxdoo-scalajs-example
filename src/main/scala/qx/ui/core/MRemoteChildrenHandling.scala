
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.core {
@js.native
@JSName("qx.ui.core.MRemoteChildrenHandling")
trait MRemoteChildrenHandling extends js.Object {
    def add(child: qx.ui.core.LayoutItem, options: js.Any = ???): qx.ui.core.Widget = js.native
    def addAfter(child: qx.ui.core.LayoutItem, after: qx.ui.core.LayoutItem, options: js.Any = ???): Unit = js.native
    def addAt(child: qx.ui.core.LayoutItem, index: Int, options: js.Any = ???): Unit = js.native
    def addBefore(child: qx.ui.core.LayoutItem, before: qx.ui.core.LayoutItem, options: js.Any = ???): Unit = js.native
    def getChildren(): js.Array[qx.ui.core.LayoutItem] = js.native
    def hasChildren(): Boolean = js.native
    def indexOf(child: qx.ui.core.LayoutItem): Int = js.native
    def remove(child: qx.ui.core.LayoutItem): qx.ui.core.Widget = js.native
    def removeAll(): js.Array[js.Any] = js.native
    def removeAt(index: Int): qx.ui.core.LayoutItem = js.native

}
}
