
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.html {
@js.native
@JSName("qx.html.Input")
class Input protected () extends qx.html.Element {
    def this(typ: String = ???, styles: js.Any = ???, attributes: js.Any = ???) = this()
    def getValue(): String = js.native
    def getWrap(): Boolean = js.native
    def setEnabled(value: Boolean): Unit = js.native
    def setValue(value: js.Any): qx.html.Input = js.native
    def setWrap(wrap: Boolean, direct: Boolean = ???): qx.html.Input = js.native

}
}
