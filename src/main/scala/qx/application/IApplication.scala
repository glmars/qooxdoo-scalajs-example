
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.application {
@js.native
trait IApplication extends js.Object {
    def close(): String
    @JSName("finalize")
    def finalizeQx(): Unit
    def main(): Unit
    def terminate(): Unit

}
}
