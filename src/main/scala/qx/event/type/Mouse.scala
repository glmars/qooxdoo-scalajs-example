
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.`type` {
@js.native
@JSName("qx.event.type.Mouse")
class Mouse extends qx.event.`type`.Dom {
    def getButton(): String = js.native
    def getDocumentLeft(): Int = js.native
    def getDocumentTop(): Int = js.native
    def getScreenLeft(): Int = js.native
    def getScreenTop(): Int = js.native
    def getViewportLeft(): Int = js.native
    def getViewportTop(): Int = js.native
    def isLeftPressed(): Boolean = js.native
    def isMiddlePressed(): Boolean = js.native
    def isRightPressed(): Boolean = js.native

}
}
