
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.splitpane {
@js.native
@JSName("qx.ui.splitpane.Blocker")
class Blocker protected () extends qx.html.Element {
    def this(orientation: String = ???) = this()
    protected def _applyOrientation(value: js.Any, old: js.Any): Unit = js.native
    def getOrientation(): js.Dynamic = js.native
    protected def initOrientation(value: js.Any): js.Dynamic = js.native
    def resetOrientation(): Unit = js.native
    def setHeight(offset: Long, spliterSize: Long): Unit = js.native
    def setLeft(offset: Long, splitterLeft: Long): Unit = js.native
    def setOrientation(value: js.Any): js.Dynamic = js.native
    def setTop(offset: Long, splitterTop: Long): Unit = js.native
    def setWidth(offset: Long, spliterSize: Long): Unit = js.native

}
}
