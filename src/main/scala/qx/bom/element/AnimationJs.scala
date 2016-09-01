
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom.element {
@js.native
@JSName("qx.bom.element.AnimationJs")
class AnimationJs extends js.Object {

}
@js.native
@JSName("qx.bom.element.AnimationJs")
object AnimationJs extends js.Object {
    protected def _animate(el: HTMLElement, desc: js.Any, duration: Int = ???, reverse: Boolean = ???): qx.bom.element.AnimationHandle = js.native
    def animate(el: HTMLElement, desc: js.Any, duration: Int = ???): qx.bom.element.AnimationHandle = js.native
    def animateReverse(el: HTMLElement, desc: js.Any, duration: Int = ???): qx.bom.element.AnimationHandle = js.native
    def pause(handle: qx.bom.element.AnimationHandle): qx.bom.element.AnimationHandle = js.native
    def play(handle: qx.bom.element.AnimationHandle): qx.bom.element.AnimationHandle = js.native
    def stop(handle: qx.bom.element.AnimationHandle): qx.bom.element.AnimationHandle = js.native

}
}
