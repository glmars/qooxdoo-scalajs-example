
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom {
@js.native
@JSName("qx.bom.Selection")
class Selection extends js.Object {

}
@js.native
@JSName("qx.bom.Selection")
object Selection extends js.Object {
    def get(node: Node): String = js.native
    def getEnd(node: Node): Int = js.native
    def getLength(node: Node): Int = js.native
    def getSelectionObject(documentNode: Document): js.Dynamic = js.native
    def getStart(node: Node): Int = js.native
    def set(node: Node, start: Int, end: Int): Boolean = js.native
    def setAll(node: Node): Boolean = js.native

}
}
