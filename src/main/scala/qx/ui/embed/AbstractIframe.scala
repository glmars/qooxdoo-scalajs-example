
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.AbstractIframe")
class AbstractIframe protected () extends qx.ui.core.Widget {
    def this(source: String = ???) = this()
    protected def _applyFrameName(value: String, old: String): Unit = js.native
    protected def _applySource(value: String, old: String): Unit = js.native
    protected def _getIframeElement(): qx.html.Iframe = js.native
    def getBody(): HTMLElement = js.native
    def getDocument(): Document = js.native
    def getFrameName(): String = js.native
    def getName(): String = js.native
    def getSource(): String = js.native
    def getWindow(): Window = js.native
    protected def initFrameName(value: String): String = js.native
    protected def initSource(value: String): String = js.native
    def reload(): Unit = js.native
    def resetFrameName(): Unit = js.native
    def resetSource(): Unit = js.native
    def setFrameName(value: String): String = js.native
    def setSource(value: String): String = js.native

}
}
