
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form.renderer {
@js.native
@JSName("qx.ui.form.renderer.Double")
class Double protected () extends qx.ui.form.renderer.AbstractRenderer {
    def this(form: js.Any = ???) = this()
    protected def _createHeader(title: String): qx.ui.basic.Label = js.native
    protected def _createLabel(name: String, item: qx.ui.core.Widget): qx.ui.basic.Label = js.native
    def getLayout(): qx.ui.layout.Grid = js.native

}
}
