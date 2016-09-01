
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.`type` {
@js.native
@JSName("qx.event.type.Swipe")
class Swipe extends qx.event.`type`.Pointer {
    def getAxis(): String = js.native
    def getDirection(): String = js.native
    def getDistance(): Int = js.native
    def getDuration(): Int = js.native
    def getStartTime(): Int = js.native
    def getVelocity(): Long = js.native

}
}
