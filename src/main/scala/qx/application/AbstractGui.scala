
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.application {
@js.native
@JSName("qx.application.AbstractGui")
class AbstractGui extends qx.core.Object with qx.application.IApplication with qx.locale.MTranslation {
    override def close(): String = js.native
    @JSName("finalize")
    override def finalizeQx(): Unit = js.native
    override def main(): Unit = js.native
    override def terminate(): Unit = js.native
    protected def _createRootWidget(): qx.ui.core.Widget = js.native
    def getRoot(): qx.ui.core.Widget = js.native
    def render(): Unit = js.native

}
}
