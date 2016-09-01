
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.util {
@js.native
@JSName("qx.util.DeferredCallManager")
class DeferredCallManager extends qx.core.Object {
    def cancel(deferredCall: qx.util.DeferredCall): Unit = js.native
    def schedule(deferredCall: qx.util.DeferredCall): Unit = js.native

}
@js.native
@JSName("qx.util.DeferredCallManager")
object DeferredCallManager extends js.Object {
    def getInstance(): qx.util.DeferredCallManager = js.native

}
}
