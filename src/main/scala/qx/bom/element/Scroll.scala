
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom.element {
@js.native
@JSName("qx.bom.element.Scroll")
class Scroll extends js.Object {

}
@js.native
@JSName("qx.bom.element.Scroll")
object Scroll extends js.Object {
    def getScrollbarWidth(): Long = js.native
    def intoView(element: HTMLElement, stop: HTMLElement = ???, alignX: String = ???, alignY: String = ???): Unit = js.native
    def intoViewX(element: HTMLElement, stop: HTMLElement = ???, align: String = ???): Unit = js.native
    def intoViewY(element: HTMLElement, stop: HTMLElement = ???, align: String = ???): Unit = js.native

}
}
