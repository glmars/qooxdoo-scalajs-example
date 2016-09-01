
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx {
@js.native
@JSName("qx.Part")
class Part protected () extends js.Object {
    def this(loader: js.Any = ???) = this()
    def addPackageListener(pkg: js.Any, callback: js.Any): Unit = js.native
    def addPartListener(part: js.Any, callback: js.Any): Unit = js.native
    def addToPackage(pkg: qx.io.part.Package): Unit = js.native
    def getParts(): js.Array[js.Any] = js.native
    def notifyPackageResult(pkg: js.Any): Unit = js.native
    def notifyPartResult(part: js.Any): Unit = js.native
    def preload(partNames: String, callback: js.Function, self: js.Any = ???): Unit = js.native
    def require(partNames: String, callback: js.Function, self: js.Any = ???): Unit = js.native
    def saveClosure(id: String, closure: js.Function): Unit = js.native

}
@js.native
@JSName("qx.Part")
object Part extends js.Object {
    def $$notifyLoad(id: String, closure: js.Function): Unit = js.native
    def getInstance(): qx.Part = js.native

}
}
