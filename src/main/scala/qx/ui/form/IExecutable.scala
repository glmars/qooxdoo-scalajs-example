
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
trait IExecutable extends js.Object {
    def execute(): Unit
    def getCommand(): qx.ui.command.Command
    def setCommand(command: qx.ui.command.Command): qx.ui.command.Command

}
}
