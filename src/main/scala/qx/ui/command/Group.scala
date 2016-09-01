
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.command {
@js.native
@JSName("qx.ui.command.Group")
class Group extends qx.core.Object {
    protected def _applyActive(value: Boolean, old: Boolean): Unit = js.native
    def add(key: String, command: qx.ui.command.Command): Boolean = js.native
    def get(key: String): qx.ui.command.Command = js.native
    def getActive(): Boolean = js.native
    def has(key: String): Boolean = js.native
    protected def initActive(value: Boolean): Boolean = js.native
    def isActive(): Boolean = js.native
    def remove(key: String): qx.ui.command.Command = js.native
    def resetActive(): Unit = js.native
    def setActive(value: Boolean): Boolean = js.native
    def toggleActive(): Boolean = js.native

}
}
