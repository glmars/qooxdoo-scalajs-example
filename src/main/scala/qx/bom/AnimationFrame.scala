
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom {
@js.native
@JSName("qx.bom.AnimationFrame")
class AnimationFrame extends qx.event.Emitter {
    def cancelSequence(): Unit = js.native
    def startSequence(duration: Long): Unit = js.native

}
@js.native
@JSName("qx.bom.AnimationFrame")
object AnimationFrame extends js.Object {
    def calculateTiming(func: String, x: Int): Int = js.native
    def request(callback: js.Function, context: js.Any): Long = js.native

}
}
