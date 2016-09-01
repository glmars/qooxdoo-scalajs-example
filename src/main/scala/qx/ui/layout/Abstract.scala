
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Abstract")
class Abstract extends qx.core.Object {
    protected def _applyLayoutChange(): Unit = js.native
    protected def _clearSeparators(): Unit = js.native
    protected def _computeSizeHint(): js.Dynamic = js.native
    protected def _getLayoutChildren(): js.Array[js.Any] = js.native
    protected def _getWidget(): qx.ui.core.Widget = js.native
    protected def _renderSeparator(separator: String, bounds: js.Any): Unit = js.native
    def connectToWidget(widget: qx.ui.core.Widget): Unit = js.native
    def getHeightForWidth(width: Int): Int = js.native
    def getSizeHint(): js.Dynamic = js.native
    def hasHeightForWidth(): Boolean = js.native
    def invalidateChildrenCache(): Unit = js.native
    def invalidateLayoutCache(): Unit = js.native
    def renderLayout(availWidth: Int, availHeight: Int, padding: js.Any): Unit = js.native
    def verifyLayoutProperty(item: js.Any, name: js.Any, value: js.Any): Unit = js.native

}
}
