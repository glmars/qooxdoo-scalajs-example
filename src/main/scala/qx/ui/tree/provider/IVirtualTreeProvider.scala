
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.tree.provider {
@js.native
trait IVirtualTreeProvider extends js.Object {
    def createLayer(): qx.ui.virtual.layer.Abstract
    def createRenderer(): js.Dynamic
    def isSelectable(row: Int): Boolean
    def setChildProperty(value: String): String
    def setLabelPath(value: String): String
    def styleSelectabled(row: Int): Unit
    def styleUnselectabled(row: Int): Unit

}
}
