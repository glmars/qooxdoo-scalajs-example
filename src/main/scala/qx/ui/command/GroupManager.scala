
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.command {
@js.native
@JSName("qx.ui.command.GroupManager")
class GroupManager extends qx.core.Object {
    protected def _getGroup(group: qx.ui.command.Group): qx.ui.command.Group = js.native
    def add(group: qx.ui.command.Group): Boolean = js.native
    def block(): Unit = js.native
    def getActive(): qx.ui.command.Group = js.native
    def has(group: qx.ui.command.Group): Boolean = js.native
    def remove(group: qx.ui.command.Group): qx.ui.command.Group = js.native
    def setActive(group: qx.ui.command.Group): Boolean = js.native
    def unblock(): Unit = js.native

}
}
