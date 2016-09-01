
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
trait IStringForm extends js.Object {
    def getValue(): String
    def resetValue(): Unit
    def setValue(value: String): Unit

}
}
