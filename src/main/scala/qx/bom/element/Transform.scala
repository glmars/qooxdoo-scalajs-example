
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom.element {
@js.native
@JSName("qx.bom.element.Transform")
class Transform extends js.Object {

}
@js.native
@JSName("qx.bom.element.Transform")
object Transform extends js.Object {
    protected def _compute3dProperty(property: String, params: js.Array[js.Any]): String = js.native
    protected def _computeAxisProperties(property: String, params: js.Array[js.Any]): String = js.native
    def getBackfaceVisibility(el: HTMLElement): Boolean = js.native
    def getCss(transforms: js.Any): String = js.native
    def getOrigin(el: HTMLElement): String = js.native
    def getPerspective(el: HTMLElement): String = js.native
    def getPerspectiveOrigin(el: HTMLElement): String = js.native
    def getStyle(el: HTMLElement): String = js.native
    def getTransformValue(transforms: js.Any): String = js.native
    def rotate(el: HTMLElement, value: String): Unit = js.native
    def scale(el: HTMLElement, value: Long): Unit = js.native
    def setBackfaceVisibility(el: HTMLElement, value: Boolean): Unit = js.native
    def setOrigin(el: HTMLElement, value: String): Unit = js.native
    def setPerspective(el: HTMLElement, value: Long): Unit = js.native
    def setPerspectiveOrigin(el: HTMLElement, value: String): Unit = js.native
    def setStyle(el: HTMLElement, value: String): Unit = js.native
    def skew(el: HTMLElement, value: String): Unit = js.native
    def transform(el: HTMLElement, transforms: js.Any): Unit = js.native
    def translate(el: HTMLElement, value: String): Unit = js.native

}
}
