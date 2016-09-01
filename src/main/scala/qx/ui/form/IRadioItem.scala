
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
trait IRadioItem extends js.Object {
    def getGroup(): qx.ui.form.RadioGroup
    def getValue(): Boolean
    def setGroup(value: qx.ui.form.RadioGroup): Unit
    def setValue(value: Boolean): Unit

}
}
