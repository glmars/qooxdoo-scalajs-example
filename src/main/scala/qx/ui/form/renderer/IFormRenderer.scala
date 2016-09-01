
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form.renderer {
@js.native
trait IFormRenderer extends js.Object {
    def addButton(button: qx.ui.form.Button, options: js.Any = ???): Unit
    def addItems(items: js.Array[qx.ui.core.Widget], names: js.Array[String], title: String = ???, itemsOptions: js.Array[js.Any] = ???, headerOptions: js.Any = ???): Unit

}
}
