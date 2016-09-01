
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.core {
@js.native
@JSName("qx.core.AssertionError")
class AssertionError protected () extends qx.`type`.BaseError {
    def this(comment: String = ???, failMessage: String = ???) = this()
    def getStackTrace(): js.Array[String] = js.native

}
}
