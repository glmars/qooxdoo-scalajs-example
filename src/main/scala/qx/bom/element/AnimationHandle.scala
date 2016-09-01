
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom.element {
@js.native
@JSName("qx.bom.element.AnimationHandle")
class AnimationHandle extends qx.event.Emitter {
    def isEnded(): Boolean = js.native
    def isPaused(): Boolean = js.native
    def isPlaying(): Boolean = js.native
    def pause(): Unit = js.native
    def play(): Unit = js.native
    def stop(): Unit = js.native

}
}
