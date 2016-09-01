
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.virtual.selection {
@js.native
@JSName("qx.ui.virtual.selection.MModel")
trait MModel extends js.Object {
    protected def _applyDefaultSelection(): Unit = js.native
    protected def _applyDragSelection(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyQuickSelection(value: Boolean, old: Boolean): Unit = js.native
    protected def _applySelection(value: qx.data.Array, old: qx.data.Array): Unit = js.native
    protected def _applySelectionMode(value: js.Any, old: js.Any): Unit = js.native
    protected def _initSelectionManager(): Unit = js.native
    protected def _onChangeSelection(e: qx.event.`type`.Data): Unit = js.native
    protected def _onManagerChangeSelection(e: qx.event.`type`.Data): Unit = js.native
    protected def _updateSelection(): Unit = js.native
    def getAutoScrollIntoView(): Boolean = js.native
    def getDragSelection(): Boolean = js.native
    def getQuickSelection(): Boolean = js.native
    def getSelection(): qx.data.Array = js.native
    def getSelectionMode(): js.Dynamic = js.native
    protected def initDragSelection(value: Boolean): Boolean = js.native
    protected def initQuickSelection(value: Boolean): Boolean = js.native
    protected def initSelection(value: qx.data.Array): qx.data.Array = js.native
    protected def initSelectionMode(value: js.Any): js.Dynamic = js.native
    def isDragSelection(): Boolean = js.native
    def isQuickSelection(): Boolean = js.native
    def resetDragSelection(): Unit = js.native
    def resetQuickSelection(): Unit = js.native
    def resetSelection(): Unit = js.native
    def resetSelectionMode(): Unit = js.native
    def setAutoScrollIntoView(value: Boolean): Unit = js.native
    def setDragSelection(value: Boolean): Boolean = js.native
    def setQuickSelection(value: Boolean): Boolean = js.native
    def setSelection(value: qx.data.Array): qx.data.Array = js.native
    def setSelectionMode(value: js.Any): js.Dynamic = js.native
    def toggleDragSelection(): Boolean = js.native
    def toggleQuickSelection(): Boolean = js.native

}
}
