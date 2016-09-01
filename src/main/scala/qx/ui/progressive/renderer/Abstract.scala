
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.progressive.renderer {
@js.native
@JSName("qx.ui.progressive.renderer.Abstract")
class Abstract extends qx.core.Object {
    def join(progressive: qx.ui.progressive.Progressive, name: String): Unit = js.native
    def render(state: qx.ui.progressive.State, element: js.Any): Unit = js.native

}
}
