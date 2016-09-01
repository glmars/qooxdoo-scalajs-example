
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.dom {
@js.native
@JSName("qx.dom.Node")
class Node extends js.Object {

}
@js.native
@JSName("qx.dom.Node")
object Node extends js.Object {
    def getBodyElement(node: Node): HTMLElement = js.native
    def getDocument(node: Node): Document = js.native
    def getDocumentElement(node: Node): HTMLElement = js.native
    def getName(node: Node): String = js.native
    def getText(node: Node): String = js.native
    def getWindow(node: Node): Window = js.native
    def isBlockNode(node: Node): Boolean = js.native
    def isDocument(node: Node): Boolean = js.native
    def isDocumentFragment(node: Node): Boolean = js.native
    def isElement(node: Node): Boolean = js.native
    def isNode(node: Node): Boolean = js.native
    def isNodeName(node: Node, nodeName: String): Boolean = js.native
    def isText(node: Node): Boolean = js.native
    def isWindow(obj: js.Any): Boolean = js.native

}
}
