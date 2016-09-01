
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom.element {
@js.native
@JSName("qx.bom.element.Style")
class Style extends js.Object {

}
@js.native
@JSName("qx.bom.element.Style")
object Style extends js.Object {
    def compile(map: js.Any): String = js.native
    def get(element: HTMLElement, name: String, mode: Long, smart: Boolean = ???): js.Dynamic = js.native
    def getCss(element: HTMLElement): String = js.native
    def isPropertySupported(propertyName: String): Boolean = js.native
    def reset(element: HTMLElement, name: String, smart: Boolean = ???): Unit = js.native
    def set(element: HTMLElement, name: String, value: js.Any, smart: Boolean = ???): Unit = js.native
    def setCss(element: HTMLElement, value: String): Unit = js.native
    def setStyles(element: HTMLElement, styles: js.Any, smart: Boolean = ???): Unit = js.native

}
}
