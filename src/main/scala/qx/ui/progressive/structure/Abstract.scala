
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.progressive.structure {
@js.native
@JSName("qx.ui.progressive.structure.Abstract")
class Abstract protected () extends qx.core.Object {
    def this(pane: qx.ui.core.Widget = ???) = this()
    def applyStructure(progressive: qx.ui.progressive.Progressive): Unit = js.native
    def getPane(): qx.ui.core.Widget = js.native

}
}
