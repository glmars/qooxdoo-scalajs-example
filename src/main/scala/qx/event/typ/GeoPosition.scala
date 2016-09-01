
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.typ {
@js.native
@JSName("qx.event.type.GeoPosition")
class GeoPosition extends qx.event.typ.Event {
    def getAccuracy(): Long = js.native
    def getAltitude(): Long = js.native
    def getAltitudeAccuracy(): Long = js.native
    def getHeading(): js.Dynamic = js.native
    def getLatitude(): Long = js.native
    def getLongitude(): Long = js.native
    def getSpeed(): js.Dynamic = js.native
    def getTimestamp(): Long = js.native
    protected def initAccuracy(value: Long): Long = js.native
    protected def initAltitude(value: Long): Long = js.native
    protected def initAltitudeAccuracy(value: Long): Long = js.native
    protected def initHeading(value: js.Any): js.Dynamic = js.native
    protected def initLatitude(value: Long): Long = js.native
    protected def initLongitude(value: Long): Long = js.native
    protected def initSpeed(value: js.Any): js.Dynamic = js.native
    protected def initTimestamp(value: Long): Long = js.native
    def resetAccuracy(): Unit = js.native
    def resetAltitude(): Unit = js.native
    def resetAltitudeAccuracy(): Unit = js.native
    def resetHeading(): Unit = js.native
    def resetLatitude(): Unit = js.native
    def resetLongitude(): Unit = js.native
    def resetSpeed(): Unit = js.native
    def resetTimestamp(): Unit = js.native
    def setAccuracy(value: Long): Long = js.native
    def setAltitude(value: Long): Long = js.native
    def setAltitudeAccuracy(value: Long): Long = js.native
    def setHeading(value: js.Any): js.Dynamic = js.native
    def setLatitude(value: Long): Long = js.native
    def setLongitude(value: Long): Long = js.native
    def setSpeed(value: js.Any): js.Dynamic = js.native
    def setTimestamp(value: Long): Long = js.native

}
}
