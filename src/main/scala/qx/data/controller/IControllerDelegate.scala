
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.data.controller {
@js.native
trait IControllerDelegate extends js.Object {
    def bindItem(controller: js.Any, item: qx.ui.core.Widget, id: js.Any): Unit
    def configureItem(item: js.Any): Unit
    def createItem(): qx.ui.core.Widget
    def filter(data: js.Any): Boolean

}
}
