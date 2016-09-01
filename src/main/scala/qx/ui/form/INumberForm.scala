
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
trait INumberForm extends js.Object {
    def getValue(): Long
    def resetValue(): Unit
    def setValue(value: Long): Unit

}
}
