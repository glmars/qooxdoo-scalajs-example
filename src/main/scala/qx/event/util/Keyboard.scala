
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.util {
@js.native
@JSName("qx.event.util.Keyboard")
class Keyboard extends js.Object {

}
@js.native
@JSName("qx.event.util.Keyboard")
object Keyboard extends js.Object {
    def charCodeToIdentifier(charCode: String): String = js.native
    def isIdentifiableKeyCode(keyCode: String): Boolean = js.native
    def isNonPrintableKeyCode(keyCode: String): Boolean = js.native
    def isPrintableKeyIdentifier(keyIdentifier: String): Boolean = js.native
    def isValidKeyIdentifier(keyIdentifier: String): Boolean = js.native
    def keyCodeToIdentifier(keyCode: Int): String = js.native

}
}
