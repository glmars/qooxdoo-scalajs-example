
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.ThemedIframe")
class ThemedIframe protected () extends qx.ui.embed.AbstractIframe with qx.ui.core.scroll.MRoll {
    def this(source: js.Any = ???) = this()
    protected def _addRollListener(): Unit = js.native
    protected def _configureScrollbar(scrollbarId: String, show: Boolean, containerSize: Int, contentSize: Int): Unit = js.native
    protected def _disableScollbars(): Unit = js.native
    protected def _getIframeSize(): js.Dynamic = js.native
    protected def _onIframeLoad(): Unit = js.native
    protected def _onIframeObserverInterval(): Unit = js.native
    protected def _onIframeResize(): Unit = js.native
    protected def _onScrollBarX(e: qx.event.`type`.Data): Unit = js.native
    protected def _onScrollBarY(e: qx.event.`type`.Data): Unit = js.native
    protected def _preventIframeScrolling(): Unit = js.native
    protected def _startIframeObserver(): Unit = js.native
    protected def _stopIframeObserver(): Unit = js.native
    protected def _updateCornerWidget(): Unit = js.native
    protected def _updateScrollbars(): Unit = js.native
    def getScrollbarX(): js.Dynamic = js.native
    def getScrollbarY(): js.Dynamic = js.native
    protected def initScrollbarX(value: js.Any): js.Dynamic = js.native
    protected def initScrollbarY(value: js.Any): js.Dynamic = js.native
    def resetScrollbar(): Unit = js.native
    def resetScrollbarX(): Unit = js.native
    def resetScrollbarY(): Unit = js.native
    def scrollToX(x: Int): Unit = js.native
    def scrollToY(y: Int): Unit = js.native
    def setScrollbar(scrollbarX: js.Any, scrollbarY: js.Any): Unit = js.native
    def setScrollbarX(value: js.Any): js.Dynamic = js.native
    def setScrollbarY(value: js.Any): js.Dynamic = js.native

}
}
