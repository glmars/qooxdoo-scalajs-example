
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom {
@js.native
@JSName("qx.bom.Template")
class Template extends js.Object {

}
@js.native
@JSName("qx.bom.Template")
object Template extends js.Object {
    protected def _createNodeFromTemplate(template: String): HTMLElement = js.native
    def get(id: String, view: js.Any, partials: js.Any): HTMLElement = js.native
    def render(template: String, view: js.Any, partials: js.Any): String = js.native
    def renderToNode(template: String, view: js.Any, partials: js.Any): HTMLElement = js.native

}
}
