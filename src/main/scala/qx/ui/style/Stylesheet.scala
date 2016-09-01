
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.style {
@js.native
@JSName("qx.ui.style.Stylesheet")
class Stylesheet extends qx.core.Object {
    def addRule(selector: String, css: String): Unit = js.native
    def hasRule(selector: String): Boolean = js.native
    def removeRule(selector: String): Unit = js.native

}
@js.native
@JSName("qx.ui.style.Stylesheet")
object Stylesheet extends js.Object {
    def getInstance(): qx.ui.style.Stylesheet = js.native

}
}
