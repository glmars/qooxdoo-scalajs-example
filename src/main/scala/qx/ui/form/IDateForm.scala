
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
trait IDateForm extends js.Object {
    def getValue(): js.Date
    def resetValue(): Unit
    def setValue(value: js.Date): Unit

}
}
