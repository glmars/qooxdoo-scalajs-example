
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.ScrollPane")
class ScrollPane extends qx.ui.core.Widget {
    protected def _applyScrollX(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyScrollY(value: js.Any, old: js.Any): Unit = js.native
    protected def _onAppear(e: qx.event.`type`.Event): Unit = js.native
    protected def _onScroll(e: qx.event.`type`.Event): Unit = js.native
    protected def _onUpdate(e: qx.event.`type`.Event): Unit = js.native
    def add(widget: qx.ui.core.Widget = ???): Unit = js.native
    def getChildren(): js.Array[js.Dynamic] = js.native
    def getItemBottom(item: qx.ui.core.Widget): Int = js.native
    def getItemLeft(item: qx.ui.core.Widget): Int = js.native
    def getItemRight(item: qx.ui.core.Widget): Int = js.native
    def getItemTop(item: qx.ui.core.Widget): Int = js.native
    def getScrollMaxX(): Int = js.native
    def getScrollMaxY(): Int = js.native
    def getScrollSize(): js.Dynamic = js.native
    def getScrollX(): js.Dynamic = js.native
    def getScrollY(): js.Dynamic = js.native
    protected def initScrollX(value: js.Any): js.Dynamic = js.native
    protected def initScrollY(value: js.Any): js.Dynamic = js.native
    def remove(widget: qx.ui.core.Widget = ???): Unit = js.native
    def resetScrollX(): Unit = js.native
    def resetScrollY(): Unit = js.native
    def scrollByX(x: Int = ???, duration: Long = ???): Unit = js.native
    def scrollByY(y: Int = ???, duration: Long = ???): Unit = js.native
    def scrollToX(value: Int, duration: Long = ???): Unit = js.native
    def scrollToY(value: Int, duration: Long = ???): Unit = js.native
    def setScrollX(value: js.Any): js.Dynamic = js.native
    def setScrollY(value: js.Any): js.Dynamic = js.native
    def stopScrollAnimation(): Unit = js.native

}
}
