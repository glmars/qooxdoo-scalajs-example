
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Abstract")
class Abstract extends qx.core.Object with qx.ui.table.ICellRenderer {
    override def createDataCellHtml(cellInfo: js.Any, htmlArr: js.Array[String]): Boolean = js.native
    protected def _createStyleSheet(): Unit = js.native
    protected def _getCellAttributes(cellInfo: js.Any): String = js.native
    protected def _getCellClass(cellInfo: js.Any): String = js.native
    protected def _getCellSizeStyle(width: Int, height: Int, insetX: Int, insetY: Int): String = js.native
    protected def _getCellStyle(cellInfo: js.Any): js.Dynamic = js.native
    protected def _getContentHtml(cellInfo: js.Any): String = js.native
    protected def _onChangeTheme(): Unit = js.native
    def getDefaultCellStyle(): String = js.native
    protected def initDefaultCellStyle(value: String): String = js.native
    def resetDefaultCellStyle(): Unit = js.native
    def setDefaultCellStyle(value: String): String = js.native

}
}
