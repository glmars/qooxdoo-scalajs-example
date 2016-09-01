
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.table.model {
@js.native
@JSName("qx.ui.table.model.Filtered")
class Filtered extends qx.ui.table.model.Simple {
    protected def _js_in_array(the_needle: String, the_haystack: js.Array[js.Any]): Boolean = js.native
    def addBetweenFilter(filter: String, value1: Int, value2: Int, target: String): Unit = js.native
    def addNotRegex(regex: String, target: String, ignorecase: Boolean): Unit = js.native
    def addNumericFilter(filter: String, value1: Int, target: String): Unit = js.native
    def addRegex(regex: String, target: String, ignorecase: Boolean): Unit = js.native
    def applyFilters(): Unit = js.native
    def hideRows(rowNum: Int, numOfRows: Int, dispatchEvent: Boolean = ???): Unit = js.native
    def resetHiddenRows(): Unit = js.native

}
}
