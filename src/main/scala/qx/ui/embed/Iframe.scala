
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.Iframe")
class Iframe protected () extends qx.ui.embed.AbstractIframe {
    def this(source: String = ???) = this()
    protected def _applyNativeHelp(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyScrollbar(value: js.Any, old: js.Any): Unit = js.native
    protected def _createBlockerElement(): js.Dynamic = js.native
    protected def _onIframeLoad(e: qx.event.typ.Event): Unit = js.native
    protected def _onNativeContextMenu(e: qx.event.typ.Mouse): Unit = js.native
    protected def _syncSourceAfterDOMMove(): Unit = js.native
    def block(): Unit = js.native
    def getNativeHelp(): Boolean = js.native
    def getScrollbar(): js.Dynamic = js.native
    protected def initNativeHelp(value: Boolean): Boolean = js.native
    protected def initScrollbar(value: js.Any): js.Dynamic = js.native
    def isNativeHelp(): Boolean = js.native
    def release(): Unit = js.native
    def resetNativeHelp(): Unit = js.native
    def resetScrollbar(): Unit = js.native
    def setNativeHelp(value: Boolean): Boolean = js.native
    def setScrollbar(value: js.Any): js.Dynamic = js.native
    def toggleNativeHelp(): Boolean = js.native

}
}
