
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.application {
@js.native
@JSName("qx.application.Native")
class Native extends qx.core.Object with qx.application.IApplication {
    override def close(): String = js.native
    @JSName("finalize")
    override def finalizeQx(): Unit = js.native
    override def main(): Unit = js.native
    override def terminate(): Unit = js.native

}
}
