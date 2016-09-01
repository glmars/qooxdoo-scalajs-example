
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.util {
@js.native
@JSName("qx.util.Validate")
class Validate extends js.Object {

}
@js.native
@JSName("qx.util.Validate")
object Validate extends js.Object {
    def checkColor(value: js.Any, formItem: qx.ui.form.IForm, errorMessage: String = ???): Unit = js.native
    def checkEmail(value: js.Any, formItem: qx.ui.form.IForm, errorMessage: String = ???): Unit = js.native
    def checkNumber(value: js.Any, formItem: qx.ui.form.IForm, errorMessage: String = ???): Unit = js.native
    def checkString(value: js.Any, formItem: qx.ui.form.IForm, errorMessage: String = ???): Unit = js.native
    def checkUrl(value: js.Any, formItem: qx.ui.form.IForm, errorMessage: String = ???): Unit = js.native
    def color(errorMessage: String = ???): js.Function = js.native
    def email(errorMessage: String = ???): js.Function = js.native
    def inArray(array: js.Array[js.Any], errorMessage: String = ???): js.Function = js.native
    def number(errorMessage: String = ???): js.Function = js.native
    def range(from: Long, to: Long, errorMessage: String = ???): js.Function = js.native
    def regExp(reg: js.RegExp, errorMessage: String = ???): js.Function = js.native
    def string(errorMessage: String = ???): js.Function = js.native
    def url(errorMessage: String = ???): js.Function = js.native

}
}
