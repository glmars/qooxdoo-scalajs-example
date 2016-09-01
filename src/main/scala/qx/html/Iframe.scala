
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.html {
@js.native
@JSName("qx.html.Iframe")
class Iframe protected () extends qx.html.Element {
    def this(url: String = ???, styles: js.Any = ???, attributes: js.Any = ???) = this()
    def getBody(): HTMLElement = js.native
    def getDocument(): Document = js.native
    def getName(): String = js.native
    def getSource(): String = js.native
    def getWindow(): Window = js.native
    def reload(): Unit = js.native
    def setName(name: String): qx.html.Iframe = js.native
    def setSource(source: String): qx.html.Iframe = js.native

}
}
