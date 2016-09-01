
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.tabview {
@js.native
@JSName("qx.ui.tabview.TabView")
class TabView protected () extends qx.ui.core.Widget with qx.ui.core.ISingleSelection with qx.ui.core.MContentPadding {
    override def getSelectables(all: Boolean): js.Array[qx.ui.core.Widget] = js.native
    override def getSelection(): js.Array[qx.ui.core.Widget] = js.native
    override def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    override def isSelectionEmpty(): Boolean = js.native
    override def resetSelection(): Unit = js.native
    override def setSelection(items: js.Array[qx.ui.core.Widget]): Unit = js.native
    def this(barPosition: String = ???) = this()
    protected def _applyBarPosition(value: Boolean, old: Boolean): Unit = js.native
    protected def _getContentPaddingTarget(): qx.ui.core.Widget = js.native
    protected def _onBeforeChangeSelection(e: qx.event.typ.Event): Unit = js.native
    protected def _onChangeSelection(e: qx.event.typ.Data): Unit = js.native
    protected def _onPageClose(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onRadioChangeSelection(e: qx.event.typ.Data): Unit = js.native
    def add(page: qx.ui.tabview.Page): Unit = js.native
    def addAt(page: qx.ui.tabview.Page, index: Int = ???): Unit = js.native
    def getBarPosition(): js.Dynamic = js.native
    def getChildren(): js.Array[qx.ui.tabview.Page] = js.native
    def indexOf(page: qx.ui.tabview.Page): Int = js.native
    protected def initBarPosition(value: js.Any): js.Dynamic = js.native
    def remove(page: qx.ui.tabview.Page): Unit = js.native
    def resetBarPosition(): Unit = js.native
    def setBarPosition(value: js.Any): js.Dynamic = js.native

}
}
