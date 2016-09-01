
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom {
@js.native
@JSName("qx.bom.PageVisibility")
class PageVisibility protected () extends qx.event.Emitter {
    def this(document: Document = ???) = this()
    def getVisibilityState(): String = js.native
    def isHidden(): Boolean = js.native

}
@js.native
@JSName("qx.bom.PageVisibility")
object PageVisibility extends js.Object {
    def getInstance(): qx.bom.PageVisibility = js.native

}
}
