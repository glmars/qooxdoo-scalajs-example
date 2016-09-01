
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.xml {
@js.native
@JSName("qx.xml.Element")
class Element extends js.Object {

}
@js.native
@JSName("qx.xml.Element")
object Element extends js.Object {
    def createSubElementNS(document: Document, parent: HTMLElement, name: String, namespaceUri: String): HTMLElement = js.native
    def getAttributeNS(element: HTMLElement, namespaceUri: String, name: String): String = js.native
    def getElementsByTagNameNS(element: HTMLElement, namespaceURI: js.Any, tagname: String): js.Array[HTMLElement] = js.native
    def getSingleNodeText(element: HTMLElement, query: String): String = js.native
    def selectNodes(element: HTMLElement, query: String, namespaces: js.Any): js.Array[HTMLElement] = js.native
    def selectSingleNode(element: HTMLElement, query: String, namespaces: js.Any): HTMLElement = js.native
    def serialize(element: HTMLElement): String = js.native
    def setAttributeNS(document: Document, element: HTMLElement, namespaceUri: String, name: String, value: String): Unit = js.native

}
}
