
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.`type` {
@js.native
@JSName("qx.event.type.Orientation")
class Orientation extends qx.event.`type`.Event {
    def getOrientation(): Int = js.native
    def isLandscape(): Boolean = js.native
    def isPortrait(): Boolean = js.native

}
}
