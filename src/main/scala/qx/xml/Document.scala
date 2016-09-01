
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.xml {
@js.native
@JSName("qx.xml.Document")
class Document extends js.Object {

}
@js.native
@JSName("qx.xml.Document")
object Document extends js.Object {
    def create(namespaceUri: String = ???, qualifiedName: String = ???): Document = js.native
    def fromString(str: String): Document = js.native
    def isXmlDocument(elem: Document): Boolean = js.native

}
}
