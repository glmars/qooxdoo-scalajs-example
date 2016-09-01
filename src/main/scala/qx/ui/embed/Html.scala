
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.Html")
class Html protected () extends qx.ui.core.Widget with qx.ui.core.MNativeOverflow {
    def this(html: String = ???) = this()
    protected def _applyCssClass(value: String, old: String): Unit = js.native
    protected def _applyHtml(value: String, old: String): Unit = js.native
    def getCssClass(): String = js.native
    def getHtml(): String = js.native
    protected def initCssClass(value: String): String = js.native
    protected def initHtml(value: String): String = js.native
    def resetCssClass(): Unit = js.native
    def resetHtml(): Unit = js.native
    def setCssClass(value: String): String = js.native
    def setHtml(value: String): String = js.native

}
}
