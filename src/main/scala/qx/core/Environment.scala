
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.core {
@js.native
@JSName("qx.core.Environment")
class Environment extends js.Object {

}
@js.native
@JSName("qx.core.Environment")
object Environment extends js.Object {
    protected def _getClassNameFromEnvKey(key: String): js.Array[js.Any] = js.native
    protected def _initDefaultQxValues(): Unit = js.native
    def add(key: String, check: js.Any): Unit = js.native
    def addAsync(key: String, check: js.Function): Unit = js.native
    def filter(map: js.Any): js.Array[js.Any] = js.native
    def get(key: String): js.Dynamic = js.native
    def getAsync(key: String, callback: js.Function, self: js.Any): Unit = js.native
    def getAsyncChecks(): js.Dynamic = js.native
    def getChecks(): js.Dynamic = js.native
    def invalidateCacheKey(key: String): Unit = js.native
    def select(key: String, values: js.Any): js.Dynamic = js.native
    def selectAsync(key: String, values: js.Any, self: js.Any): Unit = js.native

}
}
