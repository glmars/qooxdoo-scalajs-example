
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.window {
@js.native
@JSName("qx.ui.window.Window")
class Window protected () extends qx.ui.core.Widget with qx.ui.core.MRemoteChildrenHandling with qx.ui.core.MRemoteLayoutHandling with qx.ui.core.MResizable with qx.ui.core.MMovable with qx.ui.core.MContentPadding {
    def this(caption: String = ???, icon: String = ???) = this()
    protected def _applyActive(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyCaptionBarChange(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyModal(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyShowStatusbar(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyStatus(value: String, old: String): Unit = js.native
    protected def _getContentPaddingTarget(): qx.ui.core.Widget = js.native
    protected def _onCaptionPointerDblTap(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onCloseButtonTap(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onMaximizeButtonTap(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onMinimizeButtonTap(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onRestoreButtonTap(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onWindowEventStop(e: qx.event.typ.Event): Unit = js.native
    protected def _onWindowFocusOut(e: qx.event.typ.Focus): Unit = js.native
    protected def _onWindowPointerDown(e: qx.event.typ.Pointer): Unit = js.native
    protected def _updateCaptionBar(): Unit = js.native
    def center(): Unit = js.native
    def close(): Unit = js.native
    def getActive(): Boolean = js.native
    def getAllowClose(): Boolean = js.native
    def getAllowMaximize(): Boolean = js.native
    def getAllowMinimize(): Boolean = js.native
    def getAlwaysOnTop(): Boolean = js.native
    def getCaption(): js.Dynamic = js.native
    def getIcon(): String = js.native
    def getModal(): Boolean = js.native
    def getMode(): String = js.native
    def getShowClose(): Boolean = js.native
    def getShowMaximize(): Boolean = js.native
    def getShowMinimize(): Boolean = js.native
    def getShowStatusbar(): Boolean = js.native
    def getStatus(): String = js.native
    protected def initActive(value: Boolean): Boolean = js.native
    protected def initAllowClose(value: Boolean): Boolean = js.native
    protected def initAllowMaximize(value: Boolean): Boolean = js.native
    protected def initAllowMinimize(value: Boolean): Boolean = js.native
    protected def initAlwaysOnTop(value: Boolean): Boolean = js.native
    protected def initCaption(value: js.Any): js.Dynamic = js.native
    protected def initIcon(value: String): String = js.native
    protected def initModal(value: Boolean): Boolean = js.native
    protected def initShowClose(value: Boolean): Boolean = js.native
    protected def initShowMaximize(value: Boolean): Boolean = js.native
    protected def initShowMinimize(value: Boolean): Boolean = js.native
    protected def initShowStatusbar(value: Boolean): Boolean = js.native
    protected def initStatus(value: String): String = js.native
    def isActive(): Boolean = js.native
    def isAllowClose(): Boolean = js.native
    def isAllowMaximize(): Boolean = js.native
    def isAllowMinimize(): Boolean = js.native
    def isAlwaysOnTop(): Boolean = js.native
    def isMaximized(): Boolean = js.native
    def isModal(): Boolean = js.native
    def isShowClose(): Boolean = js.native
    def isShowMaximize(): Boolean = js.native
    def isShowMinimize(): Boolean = js.native
    def isShowStatusbar(): Boolean = js.native
    def maximize(): Unit = js.native
    def minimize(): Unit = js.native
    def moveTo(left: Int, top: Int): Unit = js.native
    def open(): Unit = js.native
    def resetActive(): Unit = js.native
    def resetAllowClose(): Unit = js.native
    def resetAllowMaximize(): Unit = js.native
    def resetAllowMinimize(): Unit = js.native
    def resetAlwaysOnTop(): Unit = js.native
    def resetCaption(): Unit = js.native
    def resetIcon(): Unit = js.native
    def resetModal(): Unit = js.native
    def resetShowClose(): Unit = js.native
    def resetShowMaximize(): Unit = js.native
    def resetShowMinimize(): Unit = js.native
    def resetShowStatusbar(): Unit = js.native
    def resetStatus(): Unit = js.native
    def restore(): Unit = js.native
    def setActive(value: Boolean): Boolean = js.native
    def setAllowClose(value: Boolean): Boolean = js.native
    def setAllowMaximize(value: Boolean): Boolean = js.native
    def setAllowMinimize(value: Boolean): Boolean = js.native
    def setAlwaysOnTop(value: Boolean): Boolean = js.native
    def setCaption(value: js.Any): js.Dynamic = js.native
    def setIcon(value: String): String = js.native
    def setModal(value: Boolean): Boolean = js.native
    def setShowClose(value: Boolean): Boolean = js.native
    def setShowMaximize(value: Boolean): Boolean = js.native
    def setShowMinimize(value: Boolean): Boolean = js.native
    def setShowStatusbar(value: Boolean): Boolean = js.native
    def setStatus(value: String): String = js.native
    def toggleActive(): Boolean = js.native
    def toggleAllowClose(): Boolean = js.native
    def toggleAllowMaximize(): Boolean = js.native
    def toggleAllowMinimize(): Boolean = js.native
    def toggleAlwaysOnTop(): Boolean = js.native
    def toggleModal(): Boolean = js.native
    def toggleShowClose(): Boolean = js.native
    def toggleShowMaximize(): Boolean = js.native
    def toggleShowMinimize(): Boolean = js.native
    def toggleShowStatusbar(): Boolean = js.native

}
}
