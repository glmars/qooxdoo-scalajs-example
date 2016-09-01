
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.data.controller {
@js.native
@JSName("qx.data.controller.List")
class List protected () extends qx.core.Object with qx.data.controller.ISelection with qx.data.controller.MSelection {
    def this(model: qx.data.Array = ???, target: qx.ui.core.Widget = ???, labelPath: String = ???) = this()
    protected def _applyDelegate(value: qx.core.Object, old: qx.core.Object): Unit = js.native
    protected def _applyIconOptions(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyIconPath(value: String, old: String): Unit = js.native
    protected def _applyLabelOptions(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyLabelPath(value: String, old: String): Unit = js.native
    protected def _applyModel(value: qx.data.Array, old: qx.data.Array): Unit = js.native
    protected def _applyTarget(value: qx.ui.core.Widget, old: qx.ui.core.Widget): Unit = js.native
    protected def _bindListItem(item: qx.ui.form.ListItem, index: Long): Unit = js.native
    protected def _createItem(): qx.ui.form.ListItem = js.native
    protected def _onBindingSet(index: Long, sourceObject: qx.core.Object, targetObject: qx.core.Object): Unit = js.native
    protected def _removeBindingsFrom(item: Long): Unit = js.native
    protected def _setBindItem(value: js.Any, old: js.Any): Unit = js.native
    protected def _setConfigureItem(value: js.Any, old: js.Any): Unit = js.native
    protected def _setCreateItem(value: js.Any, old: js.Any): Unit = js.native
    protected def _setFilter(value: js.Function, old: js.Function): Unit = js.native
    def bindDefaultProperties(item: qx.ui.form.ListItem, index: Long): Unit = js.native
    def bindProperty(sourcePath: String, targetProperty: String, options: js.Any, targetWidget: qx.ui.core.Widget, index: Long): Unit = js.native
    def bindPropertyReverse(targetPath: String, sourcePath: String, options: js.Any, sourceWidget: qx.ui.core.Widget, index: Long): Unit = js.native
    def getDelegate(): js.Dynamic = js.native
    def getIconOptions(): js.Dynamic = js.native
    def getIconPath(): String = js.native
    def getLabelOptions(): js.Dynamic = js.native
    def getLabelPath(): String = js.native
    def getModel(): qx.data.IListData = js.native
    def getTarget(): js.Dynamic = js.native
    def getVisibleModels(): qx.data.Array = js.native
    protected def initDelegate(value: js.Any): js.Dynamic = js.native
    protected def initIconOptions(value: js.Any): js.Dynamic = js.native
    protected def initIconPath(value: String): String = js.native
    protected def initLabelOptions(value: js.Any): js.Dynamic = js.native
    protected def initLabelPath(value: String): String = js.native
    protected def initModel(value: qx.data.IListData): qx.data.IListData = js.native
    protected def initTarget(value: js.Any): js.Dynamic = js.native
    def resetDelegate(): Unit = js.native
    def resetIconOptions(): Unit = js.native
    def resetIconPath(): Unit = js.native
    def resetLabelOptions(): Unit = js.native
    def resetLabelPath(): Unit = js.native
    def resetModel(): Unit = js.native
    def resetTarget(): Unit = js.native
    def setDelegate(value: js.Any): js.Dynamic = js.native
    def setIconOptions(value: js.Any): js.Dynamic = js.native
    def setIconPath(value: String): String = js.native
    def setLabelOptions(value: js.Any): js.Dynamic = js.native
    def setLabelPath(value: String): String = js.native
    def setModel(value: qx.data.IListData): qx.data.IListData = js.native
    def setTarget(value: js.Any): js.Dynamic = js.native
    def syncWidget(): Unit = js.native
    def update(): Unit = js.native

}
}
