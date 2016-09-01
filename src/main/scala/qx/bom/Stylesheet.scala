
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom {
@js.native
@JSName("qx.bom.Stylesheet")
class Stylesheet extends js.Object {

}
@js.native
@JSName("qx.bom.Stylesheet")
object Stylesheet extends js.Object {
    def addImport(sheet: js.Any, url: String): Unit = js.native
    def addRule(sheet: js.Any, selector: String, entry: String): Unit = js.native
    def createElement(text: String = ???): StyleSheet = js.native
    def includeFile(href: String, doc: Document = ???): Unit = js.native
    def removeAllImports(sheet: js.Any): Unit = js.native
    def removeAllRules(sheet: js.Any): Unit = js.native
    def removeImport(sheet: js.Any, url: String): Unit = js.native
    def removeRule(sheet: js.Any, selector: String): Unit = js.native
    def removeSheet(sheet: js.Any): Unit = js.native

}
}
