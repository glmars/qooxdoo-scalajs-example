
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.io.part {
@js.native
@JSName("qx.io.part.Package")
class Package protected () extends js.Object {
    def this(urls: js.Array[String] = ???, id: js.Any = ???, loaded: Boolean = ???) = this()
    def execute(): Unit = js.native
    def getId(): String = js.native
    def getReadyState(): String = js.native
    def getUrls(): js.Array[String] = js.native
    def load(notifyPackageResult: js.Function, self: js.Any = ???): Unit = js.native
    def loadClosure(notifyPackageResult: js.Function, self: js.Any = ???): Unit = js.native
    def saveClosure(closure: js.Function): Unit = js.native

}
}
