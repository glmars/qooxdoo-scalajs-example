
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Canvas")
class Canvas extends qx.ui.layout.Abstract {
    def getDesktop(): Boolean = js.native
    protected def initDesktop(value: Boolean): Boolean = js.native
    def isDesktop(): Boolean = js.native
    def resetDesktop(): Unit = js.native
    def setDesktop(value: Boolean): Boolean = js.native
    def toggleDesktop(): Boolean = js.native

}
}
