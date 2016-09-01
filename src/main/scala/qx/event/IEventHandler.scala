
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event {
@js.native
trait IEventHandler extends js.Object {
    def canHandleEvent(target: js.Any, typ: String): Boolean
    def registerEvent(target: js.Any, typ: String, capture: Boolean): Unit
    def unregisterEvent(target: js.Any, typ: String, capture: Boolean): Unit

}
}
