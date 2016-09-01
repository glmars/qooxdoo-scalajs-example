
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom {
@js.native
@JSName("qx.bom.GeoLocation")
class GeoLocation extends qx.core.Object {
    protected def _errorHandler(error: js.Any): Unit = js.native
    protected def _successHandler(position: js.Any): Unit = js.native
    def getCurrentPosition(enableHighAccuracy: Boolean, timeout: Int, maximumAge: Int): Unit = js.native
    def startWatchPosition(enableHighAccuracy: Boolean, timeout: Int, maximumAge: Int): Unit = js.native
    def stopWatchPosition(): Unit = js.native

}
@js.native
@JSName("qx.bom.GeoLocation")
object GeoLocation extends js.Object {
    def getInstance(): qx.bom.GeoLocation = js.native

}
}
