
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom.client {
@js.native
@JSName("qx.bom.client.Device")
class Device extends js.Object {

}
@js.native
@JSName("qx.bom.client.Device")
object Device extends js.Object {
    def detectDeviceType(userAgentString: String): String = js.native
    def detectMobileDevice(userAgentString: String): Boolean = js.native
    def detectTabletDevice(userAgentString: String): Boolean = js.native
    def getDevicePixelRatio(): Long = js.native
    def getName(): String = js.native
    def getTouch(): Boolean = js.native
    def getType(): String = js.native

}
}
