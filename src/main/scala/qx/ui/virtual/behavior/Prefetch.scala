
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.virtual.behavior {
@js.native
@JSName("qx.ui.virtual.behavior.Prefetch")
class Prefetch protected () extends qx.core.Object {
    def this(scroller: qx.ui.virtual.core.Scroller = ???, settings: js.Any = ???) = this()
    protected def _applyInterval(value: Int, old: Int): Unit = js.native
    protected def _applyScroller(value: qx.ui.virtual.core.Scroller, old: qx.ui.virtual.core.Scroller): Unit = js.native
    protected def _onInterval(): Unit = js.native
    def getInterval(): Int = js.native
    def getScroller(): qx.ui.virtual.core.Scroller = js.native
    protected def initInterval(value: Int): Int = js.native
    protected def initScroller(value: qx.ui.virtual.core.Scroller): qx.ui.virtual.core.Scroller = js.native
    def resetInterval(): Unit = js.native
    def resetScroller(): Unit = js.native
    def setInterval(value: Int): Int = js.native
    def setPrefetchX(minLeft: Int, maxLeft: Int, minRight: Int, maxRight: Int): Unit = js.native
    def setPrefetchY(minAbove: Int, maxAbove: Int, minBelow: Int, maxBelow: Int): Unit = js.native
    def setScroller(value: qx.ui.virtual.core.Scroller): qx.ui.virtual.core.Scroller = js.native

}
}
