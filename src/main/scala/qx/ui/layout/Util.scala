
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Util")
class Util extends js.Object {

}
@js.native
@JSName("qx.ui.layout.Util")
object Util extends js.Object {
    def arrangeIdeals(beginMin: Int, beginIdeal: Int, beginMax: Int, endMin: Int, endIdeal: Int, endMax: Int): js.Dynamic = js.native
    def collapseMargins(varargs: js.Any = ???): Int = js.native
    def computeFlexOffsets(flexibles: js.Any, avail: Int, used: Int): js.Dynamic = js.native
    def computeHorizontalAlignOffset(align: String, width: Int, availWidth: Int, marginLeft: Int = ???, marginRight: Int = ???): Int = js.native
    def computeHorizontalGaps(children: js.Array[js.Any], spacing: Int = ???, collapse: Boolean = ???): Int = js.native
    def computeHorizontalSeparatorGaps(children: js.Array[qx.ui.core.LayoutItem], spacing: Int, separator: String): Int = js.native
    def computeVerticalAlignOffset(align: String, height: Int, availHeight: Int, marginTop: Int = ???, marginBottom: Int = ???): Int = js.native
    def computeVerticalGaps(children: js.Array[js.Any], spacing: Int = ???, collapse: Boolean = ???): Int = js.native
    def computeVerticalSeparatorGaps(children: js.Array[qx.ui.core.LayoutItem], spacing: Int, separator: String): Int = js.native

}
}
