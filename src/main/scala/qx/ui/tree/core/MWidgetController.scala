
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.tree.core {
@js.native
@JSName("qx.ui.tree.core.MWidgetController")
trait MWidgetController extends js.Object {
    protected def _bindItem(item: qx.ui.core.Widget, index: Int): Unit = js.native
    protected def _removeBindingsFrom(item: qx.ui.core.Widget): Unit = js.native
    def bindDefaultProperties(item: qx.ui.core.Widget, index: Int): Unit = js.native
    def bindProperty(sourcePath: String, targetProperty: String, options: js.Any, targetWidget: qx.ui.core.Widget, index: Int): Unit = js.native
    def bindPropertyReverse(targetPath: String, sourceProperty: String, options: js.Any, sourceWidget: qx.ui.core.Widget, index: Int): Unit = js.native
    def getChildProperty(): String = js.native
    def getDelegate(): js.Dynamic = js.native
    def getIconOptions(): js.Dynamic = js.native
    def getIconPath(): String = js.native
    def getLabelOptions(): js.Dynamic = js.native
    def getLabelPath(): String = js.native
    protected def initChildProperty(value: String): String = js.native
    protected def initDelegate(value: js.Any): js.Dynamic = js.native
    protected def initIconOptions(value: js.Any): js.Dynamic = js.native
    protected def initIconPath(value: String): String = js.native
    protected def initLabelOptions(value: js.Any): js.Dynamic = js.native
    protected def initLabelPath(value: String): String = js.native
    def removeBindings(): Unit = js.native
    def resetChildProperty(): Unit = js.native
    def resetDelegate(): Unit = js.native
    def resetIconOptions(): Unit = js.native
    def resetIconPath(): Unit = js.native
    def resetLabelOptions(): Unit = js.native
    def resetLabelPath(): Unit = js.native
    def setChildProperty(value: String): String = js.native
    def setDelegate(value: js.Any): js.Dynamic = js.native
    def setIconOptions(value: js.Any): js.Dynamic = js.native
    def setIconPath(value: String): String = js.native
    def setLabelOptions(value: js.Any): js.Dynamic = js.native
    def setLabelPath(value: String): String = js.native

}
}
