
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.typ {
@js.native
@JSName("qx.event.type.KeySequence")
class KeySequence extends qx.event.typ.Dom {
    def getKeyCode(): Long = js.native
    def getKeyIdentifier(): String = js.native
    def isPrintable(): Boolean = js.native

}
}
