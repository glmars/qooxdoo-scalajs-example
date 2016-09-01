
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom.webfonts {
@js.native
@JSName("qx.bom.webfonts.WebFont")
class WebFont extends qx.bom.Font {
    protected def _applySources(value: js.Any, old: js.Any): Unit = js.native
    protected def _onWebFontChangeStatus(ev: qx.event.`type`.Data): Unit = js.native
    protected def _quoteFontFamily(familyName: String): String = js.native
    def getSources(): js.Dynamic = js.native
    protected def initSources(value: js.Any): js.Dynamic = js.native
    def resetSources(): Unit = js.native
    def setSources(value: js.Any): js.Dynamic = js.native

}
}
