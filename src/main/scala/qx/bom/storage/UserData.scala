
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom.storage {
@js.native
@JSName("qx.bom.storage.UserData")
class UserData protected () extends js.Object {
    def this(storeName: String = ???) = this()
    def clear(): Unit = js.native
    def forEach(callback: js.Function, scope: js.Any): Unit = js.native
    def getItem(key: String): js.Dynamic = js.native
    def getKey(index: Int): String = js.native
    def getLength(): Int = js.native
    def getStorage(): js.Dynamic = js.native
    def removeItem(key: String): Unit = js.native
    def setItem(key: String, value: js.Any): Unit = js.native

}
@js.native
@JSName("qx.bom.storage.UserData")
object UserData extends js.Object {
    def getLocal(): qx.bom.storage.UserData = js.native
    def getSession(): qx.bom.storage.UserData = js.native

}
}
