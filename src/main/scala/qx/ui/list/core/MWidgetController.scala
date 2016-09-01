
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.list.core {
@js.native
@JSName("qx.ui.list.core.MWidgetController")
trait MWidgetController extends js.Object {
    protected def _bindGroupItem(item: qx.ui.core.Widget, index: Int): Unit = js.native
    protected def _bindItem(item: qx.ui.core.Widget, index: Int): Unit = js.native
    protected def _configureGroupItem(item: qx.ui.core.Widget): Unit = js.native
    protected def _configureItem(item: qx.ui.core.Widget): Unit = js.native
    protected def _removeBindingsFrom(item: qx.ui.core.Widget): Unit = js.native
    def bindDefaultProperties(item: qx.ui.core.Widget, index: Int): Unit = js.native
    def bindProperty(sourcePath: String, targetProperty: String, options: js.Any, targetWidget: qx.ui.core.Widget, index: Int): Unit = js.native
    def bindPropertyReverse(targetPath: String, sourceProperty: String, options: js.Any, sourceWidget: qx.ui.core.Widget, index: Int): Unit = js.native
    def getDelegate(): js.Dynamic = js.native
    def getGroupLabelOptions(): js.Dynamic = js.native
    def getGroupLabelPath(): String = js.native
    def getIconOptions(): js.Dynamic = js.native
    def getIconPath(): String = js.native
    def getLabelOptions(): js.Dynamic = js.native
    def getLabelPath(): String = js.native
    protected def initDelegate(value: js.Any): js.Dynamic = js.native
    protected def initGroupLabelOptions(value: js.Any): js.Dynamic = js.native
    protected def initGroupLabelPath(value: String): String = js.native
    protected def initIconOptions(value: js.Any): js.Dynamic = js.native
    protected def initIconPath(value: String): String = js.native
    protected def initLabelOptions(value: js.Any): js.Dynamic = js.native
    protected def initLabelPath(value: String): String = js.native
    def removeBindings(): Unit = js.native
    def resetDelegate(): Unit = js.native
    def resetGroupLabelOptions(): Unit = js.native
    def resetGroupLabelPath(): Unit = js.native
    def resetIconOptions(): Unit = js.native
    def resetIconPath(): Unit = js.native
    def resetLabelOptions(): Unit = js.native
    def resetLabelPath(): Unit = js.native
    def setDelegate(value: js.Any): js.Dynamic = js.native
    def setGroupLabelOptions(value: js.Any): js.Dynamic = js.native
    def setGroupLabelPath(value: String): String = js.native
    def setIconOptions(value: js.Any): js.Dynamic = js.native
    def setIconPath(value: String): String = js.native
    def setLabelOptions(value: js.Any): js.Dynamic = js.native
    def setLabelPath(value: String): String = js.native

}
}
