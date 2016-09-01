
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.util {
@js.native
@JSName("qx.util.ResourceManager")
class ResourceManager extends qx.core.Object {
    def getCombinedFormat(id: String): String = js.native
    def getData(id: String): js.Array[js.Any] = js.native
    def getImageFormat(id: String): String = js.native
    def getImageHeight(id: String): Int = js.native
    def getImageWidth(id: String): Int = js.native
    def has(id: String): Boolean = js.native
    def toDataUri(resid: String): String = js.native
    def toUri(id: String): String = js.native

}
@js.native
@JSName("qx.util.ResourceManager")
object ResourceManager extends js.Object {
    def getInstance(): qx.util.ResourceManager = js.native

}
}
