
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.list.provider {
@js.native
trait IListProvider extends js.Object {
    def createGroupRenderer(): js.Dynamic
    def createItemRenderer(): js.Dynamic
    def createLayer(): qx.ui.virtual.layer.Abstract
    def isSelectable(row: Int): Boolean
    def removeBindings(): Unit
    def setDelegate(delegate: js.Any): js.Dynamic
    def setIconOptions(options: js.Any): js.Dynamic
    def setIconPath(path: String): String
    def setLabelOptions(options: js.Any): js.Dynamic
    def setLabelPath(path: String): String
    def styleSelectabled(row: Int): Unit
    def styleUnselectabled(row: Int): Unit

}
}
