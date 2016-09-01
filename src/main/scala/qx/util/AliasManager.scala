
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.util {
@js.native
@JSName("qx.util.AliasManager")
class AliasManager extends qx.util.ValueManager {
    protected def _preprocess(value: String): String = js.native
    def add(alias: String, base: String): Unit = js.native
    def getAliases(): js.Dynamic = js.native
    def remove(alias: String): Unit = js.native

}
@js.native
@JSName("qx.util.AliasManager")
object AliasManager extends js.Object {
    def getInstance(): qx.util.AliasManager = js.native

}
}
