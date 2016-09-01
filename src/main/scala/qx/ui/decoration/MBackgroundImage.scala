
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MBackgroundImage")
trait MBackgroundImage extends js.Object {
    protected def _applyBackgroundImage(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyBackgroundPosition(value: js.Any, old: js.Any): Unit = js.native
    protected def _styleBackgroundImage(styles: js.Any): Unit = js.native
    def getBackgroundImage(): String = js.native
    def getBackgroundPositionX(): js.Dynamic = js.native
    def getBackgroundPositionY(): js.Dynamic = js.native
    def getBackgroundRepeat(): js.Dynamic = js.native
    protected def initBackgroundImage(value: String): String = js.native
    protected def initBackgroundPositionX(value: js.Any): js.Dynamic = js.native
    protected def initBackgroundPositionY(value: js.Any): js.Dynamic = js.native
    protected def initBackgroundRepeat(value: js.Any): js.Dynamic = js.native
    def resetBackgroundImage(): Unit = js.native
    def resetBackgroundPosition(): Unit = js.native
    def resetBackgroundPositionX(): Unit = js.native
    def resetBackgroundPositionY(): Unit = js.native
    def resetBackgroundRepeat(): Unit = js.native
    def setBackgroundImage(value: String): String = js.native
    def setBackgroundPosition(backgroundPositionY: js.Any, backgroundPositionX: js.Any): Unit = js.native
    def setBackgroundPositionX(value: js.Any): js.Dynamic = js.native
    def setBackgroundPositionY(value: js.Any): js.Dynamic = js.native
    def setBackgroundRepeat(value: js.Any): js.Dynamic = js.native

}
}
