
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom.element {
@js.native
@JSName("qx.bom.element.Class")
class Class extends js.Object {

}
@js.native
@JSName("qx.bom.element.Class")
object Class extends js.Object {
    def add(element: HTMLElement, name: String): String = js.native
    def addClasses(element: HTMLElement, classes: js.Array[String]): String = js.native
    def get(element: HTMLElement): String = js.native
    def has(element: HTMLElement, name: String): Boolean = js.native
    def remove(element: HTMLElement, name: String): String = js.native
    def removeClasses(element: HTMLElement, classes: js.Array[String]): String = js.native
    def replace(element: HTMLElement, oldName: String, newName: String): String = js.native
    def toggle(element: HTMLElement, name: String, toggle: Boolean = ???): String = js.native

}
}
