
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.`type` {
@js.native
@JSName("qx.event.type.Drag")
class Drag extends qx.event.`type`.Event {
    def addAction(action: String): Unit = js.native
    def addData(`type`: String, data: js.Any): Unit = js.native
    def addType(`type`: String): Unit = js.native
    def getCurrentAction(): String = js.native
    def getCurrentType(): String = js.native
    def getData(`type`: String): js.Dynamic = js.native
    def getDocumentLeft(): Int = js.native
    def getDocumentTop(): Int = js.native
    def getDragTarget(): qx.ui.core.Widget = js.native
    def getManager(): qx.event.handler.DragDrop = js.native
    def setDropAllowed(isAllowed: Boolean): Unit = js.native
    def stopSession(): Unit = js.native
    def supportsAction(action: String): Boolean = js.native
    def supportsType(`type`: String): Boolean = js.native

}
}
