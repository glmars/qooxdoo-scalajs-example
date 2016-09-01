
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.core {
@js.native
@JSName("qx.core.WindowError")
class WindowError protected () extends js.Error {
    def this(failMessage: String = ???, uri: String = ???, lineNumber: Int = ???) = this()
    def getLineNumber(): Int = js.native
    def getUri(): String = js.native

}
}
