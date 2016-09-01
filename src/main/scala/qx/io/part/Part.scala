
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.io.part {
@js.native
@JSName("qx.io.part.Part")
class Part protected () extends js.Object {
    def this(name: String = ???, packages: js.Array[js.Any] = ???, loader: qx.Part = ???) = this()
    protected def _appendPartListener(callback: js.Function, self: js.Any = ???, part: qx.io.part.Part = ???): Unit = js.native
    protected def _checkCompleteLoading(callback: js.Function, self: js.Any): Boolean = js.native
    protected def _markAsCompleted(readyState: String): Unit = js.native
    protected def _signalStartup(): Unit = js.native
    def getName(): String = js.native
    def getPackages(): js.Array[qx.io.part.Package] = js.native
    def getReadyState(): String = js.native
    def load(callback: js.Function, self: js.Any = ???): Unit = js.native
    def preload(callback: js.Function, self: js.Any = ???): Unit = js.native

}
}
