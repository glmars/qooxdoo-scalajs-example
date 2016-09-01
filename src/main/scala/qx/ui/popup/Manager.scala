
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.popup {
@js.native
@JSName("qx.ui.popup.Manager")
class Manager extends qx.core.Object {
    def add(obj: qx.ui.popup.Popup): Unit = js.native
    def hideAll(): Unit = js.native
    def remove(obj: qx.ui.popup.Popup): Unit = js.native

}
@js.native
@JSName("qx.ui.popup.Manager")
object Manager extends js.Object {
    def getInstance(): qx.ui.popup.Manager = js.native

}
}
