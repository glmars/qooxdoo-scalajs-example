
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Dynamic")
class Dynamic protected () extends qx.ui.table.cellrenderer.Default {
    def this(cellRendererFactoryFunction: js.Function = ???) = this()
    def getCellRendererFactoryFunction(): js.Function = js.native
    protected def initCellRendererFactoryFunction(value: js.Function): js.Function = js.native
    def resetCellRendererFactoryFunction(): Unit = js.native
    def setCellRendererFactoryFunction(value: js.Function): js.Function = js.native

}
}
