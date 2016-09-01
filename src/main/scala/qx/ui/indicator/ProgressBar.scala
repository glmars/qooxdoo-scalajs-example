
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.indicator {
@js.native
@JSName("qx.ui.indicator.ProgressBar")
class ProgressBar protected () extends qx.ui.container.Composite {
    def this(value: Long = ???, maximum: Long = ???) = this()
    protected def _changeProgress(value: Long): Unit = js.native
    def getMaximum(): Long = js.native
    def getValue(): Long = js.native
    def setMaximum(value: Long): Long = js.native
    def setValue(value: Long): Long = js.native

}
}
