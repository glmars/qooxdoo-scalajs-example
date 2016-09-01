
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.io {
@js.native
@JSName("qx.io.ImageLoader")
class ImageLoader extends js.Object {

}
@js.native
@JSName("qx.io.ImageLoader")
object ImageLoader extends js.Object {
    def abort(source: String): Unit = js.native
    def dispose(): Unit = js.native
    def getFormat(source: String): String = js.native
    def getHeight(source: String): Int = js.native
    def getSize(source: String): js.Dynamic = js.native
    def getWidth(source: String): Int = js.native
    def isFailed(source: String): Boolean = js.native
    def isLoaded(source: String): Boolean = js.native
    def isLoading(source: String): Boolean = js.native
    def load(source: String, callback: js.Function = ???, context: js.Any = ???): Unit = js.native

}
}
