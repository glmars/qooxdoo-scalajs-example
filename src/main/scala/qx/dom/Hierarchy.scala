
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.dom {
@js.native
@JSName("qx.dom.Hierarchy")
class Hierarchy extends js.Object {

}
@js.native
@JSName("qx.dom.Hierarchy")
object Hierarchy extends js.Object {
    protected def _recursivelyCollect(element: HTMLElement, property: String): js.Array[js.Any] = js.native
    def cleanWhitespace(element: HTMLElement): Unit = js.native
    def contains(element: HTMLElement, target: Node): Boolean = js.native
    def getAncestors(element: HTMLElement): js.Array[js.Any] = js.native
    def getChildElements(element: HTMLElement): js.Array[js.Any] = js.native
    def getCommonParent(element1: HTMLElement, element2: HTMLElement): HTMLElement = js.native
    def getDescendants(element: HTMLElement): js.Array[js.Any] = js.native
    def getElementIndex(element: HTMLElement): Int = js.native
    def getFirstDescendant(element: HTMLElement): HTMLElement = js.native
    def getLastDescendant(element: HTMLElement): HTMLElement = js.native
    def getNextElementSibling(element: HTMLElement): HTMLElement = js.native
    def getNextSiblings(element: HTMLElement): js.Array[js.Any] = js.native
    def getNodeIndex(node: Node): Int = js.native
    def getPreviousElementSibling(element: HTMLElement): HTMLElement = js.native
    def getPreviousSiblings(element: HTMLElement): js.Array[js.Any] = js.native
    def getSiblings(element: js.Any): js.Array[js.Any] = js.native
    def isDescendantOf(element: HTMLElement, ancestor: HTMLElement): Boolean = js.native
    def isEmpty(element: HTMLElement): Boolean = js.native
    def isRendered(element: HTMLElement): Boolean = js.native

}
}
