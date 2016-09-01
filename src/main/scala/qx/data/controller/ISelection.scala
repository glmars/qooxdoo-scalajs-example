
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.data.controller {
@js.native
trait ISelection extends js.Object {
    def getSelection(): qx.data.Array
    def resetSelection(): Unit
    def setSelection(value: qx.data.Array): qx.data.Array

}
}
