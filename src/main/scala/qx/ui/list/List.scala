
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.list {
@js.native
@JSName("qx.ui.list.List")
class List protected () extends qx.ui.virtual.core.Scroller with qx.data.controller.ISelection with qx.ui.virtual.selection.MModel {
    def this(model: qx.data.IListData = ???) = this()
    protected def _applyDelegate(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyGroupLabelOptions(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyGroupLabelPath(value: String, old: String): Unit = js.native
    protected def _applyGroupRowHeight(value: Int, old: Int): Unit = js.native
    protected def _applyIconOptions(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyIconPath(value: String, old: String): Unit = js.native
    protected def _applyLabelOptions(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyLabelPath(value: String, old: String): Unit = js.native
    protected def _applyModel(value: qx.data.IListData, old: qx.data.IListData): Unit = js.native
    protected def _applyRowHeight(value: Int, old: Int): Unit = js.native
    protected def _getDataFromRow(row: Int): js.Dynamic = js.native
    protected def _getLookupTable(): js.Array[js.Any] = js.native
    protected def _getSelectables(): qx.data.Array = js.native
    protected def _init(): Unit = js.native
    protected def _initBackground(): Unit = js.native
    protected def _initLayer(): Unit = js.native
    protected def _isGroup(row: Int): Boolean = js.native
    protected def _lookup(row: Long): Long = js.native
    protected def _lookupGroup(row: Long): Long = js.native
    protected def _onModelChange(e: qx.event.typ.Data): Unit = js.native
    protected def _onResize(e: qx.event.typ.Data): Unit = js.native
    protected def _reverseLookup(index: Long): Long = js.native
    protected def _runDelegateFilter(model: qx.data.IListData): Unit = js.native
    protected def _runDelegateGroup(model: qx.data.IListData): Unit = js.native
    protected def _runDelegateSorter(model: qx.data.IListData): Unit = js.native
    def getAutoGrouping(): Boolean = js.native
    def getDelegate(): js.Dynamic = js.native
    def getGroupItemHeight(): Int = js.native
    def getGroupLabelOptions(): js.Dynamic = js.native
    def getGroupLabelPath(): String = js.native
    def getGroups(): qx.data.Array = js.native
    def getIconOptions(): js.Dynamic = js.native
    def getIconPath(): String = js.native
    def getItemHeight(): Int = js.native
    def getLabelOptions(): js.Dynamic = js.native
    def getLabelPath(): String = js.native
    def getModel(): qx.data.IListData = js.native
    protected def initAutoGrouping(value: Boolean): Boolean = js.native
    protected def initDelegate(value: js.Any): js.Dynamic = js.native
    protected def initGroupItemHeight(value: Int): Int = js.native
    protected def initGroupLabelOptions(value: js.Any): js.Dynamic = js.native
    protected def initGroupLabelPath(value: String): String = js.native
    protected def initGroups(value: qx.data.Array): qx.data.Array = js.native
    protected def initIconOptions(value: js.Any): js.Dynamic = js.native
    protected def initIconPath(value: String): String = js.native
    protected def initItemHeight(value: Int): Int = js.native
    protected def initLabelOptions(value: js.Any): js.Dynamic = js.native
    protected def initLabelPath(value: String): String = js.native
    protected def initModel(value: qx.data.IListData): qx.data.IListData = js.native
    def isAutoGrouping(): Boolean = js.native
    def refresh(): Unit = js.native
    def resetAutoGrouping(): Unit = js.native
    def resetDelegate(): Unit = js.native
    def resetGroupItemHeight(): Unit = js.native
    def resetGroupLabelOptions(): Unit = js.native
    def resetGroupLabelPath(): Unit = js.native
    def resetGroups(): Unit = js.native
    def resetIconOptions(): Unit = js.native
    def resetIconPath(): Unit = js.native
    def resetItemHeight(): Unit = js.native
    def resetLabelOptions(): Unit = js.native
    def resetLabelPath(): Unit = js.native
    def resetModel(): Unit = js.native
    def setAutoGrouping(value: Boolean): Boolean = js.native
    def setDelegate(value: js.Any): js.Dynamic = js.native
    def setGroupItemHeight(value: Int): Int = js.native
    def setGroupLabelOptions(value: js.Any): js.Dynamic = js.native
    def setGroupLabelPath(value: String): String = js.native
    def setGroups(value: qx.data.Array): qx.data.Array = js.native
    def setIconOptions(value: js.Any): js.Dynamic = js.native
    def setIconPath(value: String): String = js.native
    def setItemHeight(value: Int): Int = js.native
    def setLabelOptions(value: js.Any): js.Dynamic = js.native
    def setLabelPath(value: String): String = js.native
    def setModel(value: qx.data.IListData): qx.data.IListData = js.native
    def toggleAutoGrouping(): Boolean = js.native

}
}
