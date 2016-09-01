
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.dom {
@js.native
@JSName("qx.dom.Element")
class Element extends js.Object {

}
@js.native
@JSName("qx.dom.Element")
object Element extends js.Object {
    def create(name: String, attributes: js.Any = ???, win: Window = ???): HTMLElement = js.native
    def empty(element: HTMLElement): String = js.native
    def getHelperElement(win: Window = ???): HTMLElement = js.native
    def getParentElement(element: HTMLElement): HTMLElement = js.native
    def hasChild(parent: HTMLElement, child: Node): Boolean = js.native
    def hasChildElements(element: HTMLElement): Boolean = js.native
    def hasChildren(element: HTMLElement): Boolean = js.native
    def insertAfter(node: Node, ref: Node): Boolean = js.native
    def insertAt(node: Node, parent: HTMLElement, index: Int): Boolean = js.native
    def insertBefore(node: Node, ref: Node): Boolean = js.native
    def insertBegin(node: Node, parent: HTMLElement): Boolean = js.native
    def insertEnd(node: Node, parent: HTMLElement): Boolean = js.native
    def isInDom(element: HTMLElement, win: Window): Boolean = js.native
    def remove(node: Node): Boolean = js.native
    def removeChild(node: Node, parent: HTMLElement): Boolean = js.native
    def removeChildAt(index: Int, parent: HTMLElement): Boolean = js.native
    def replaceAt(newNode: Node, index: Int, parent: HTMLElement): Boolean = js.native
    def replaceChild(newNode: Node, oldNode: Node): Boolean = js.native

}
}
