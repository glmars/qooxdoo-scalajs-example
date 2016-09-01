
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.AbstractScrollArea")
class AbstractScrollArea extends qx.ui.core.Widget with qx.ui.core.scroll.MScrollBarFactory with qx.ui.core.scroll.MRoll with qx.ui.core.MDragDropScrolling {
    protected def _computeScrollbars(): Unit = js.native
    protected def _onChangeScrollbarXVisibility(e: qx.event.typ.Event): Unit = js.native
    protected def _onChangeScrollbarYVisibility(e: qx.event.typ.Event): Unit = js.native
    protected def _onScrollAnimationEnd(direction: String): Unit = js.native
    protected def _onScrollBarX(e: qx.event.typ.Data): Unit = js.native
    protected def _onScrollBarY(e: qx.event.typ.Data): Unit = js.native
    protected def _onScrollPaneX(e: qx.event.typ.Data): Unit = js.native
    protected def _onScrollPaneY(e: qx.event.typ.Data): Unit = js.native
    def getItemBottom(item: qx.ui.core.Widget): Int = js.native
    def getItemLeft(item: qx.ui.core.Widget): Int = js.native
    def getItemRight(item: qx.ui.core.Widget): Int = js.native
    def getItemTop(item: qx.ui.core.Widget): Int = js.native
    def getPaneSize(): js.Dynamic = js.native
    def getScrollbarX(): js.Dynamic = js.native
    def getScrollbarY(): js.Dynamic = js.native
    def getScrollX(): Int = js.native
    def getScrollY(): Int = js.native
    protected def initScrollbarX(value: js.Any): js.Dynamic = js.native
    protected def initScrollbarY(value: js.Any): js.Dynamic = js.native
    def resetScrollbar(): Unit = js.native
    def resetScrollbarX(): Unit = js.native
    def resetScrollbarY(): Unit = js.native
    def scrollByX(value: Int, duration: Long = ???): Unit = js.native
    def scrollByY(value: Int, duration: Long = ???): Unit = js.native
    def scrollToX(value: Int, duration: Long = ???): Unit = js.native
    def scrollToY(value: Int, duration: Long = ???): Unit = js.native
    def setScrollbar(scrollbarX: js.Any, scrollbarY: js.Any): Unit = js.native
    def setScrollbarX(value: js.Any): js.Dynamic = js.native
    def setScrollbarY(value: js.Any): js.Dynamic = js.native
    def stopScrollAnimationX(): Unit = js.native
    def stopScrollAnimationY(): Unit = js.native

}
}
