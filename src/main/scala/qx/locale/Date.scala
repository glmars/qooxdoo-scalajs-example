
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.locale {
@js.native
@JSName("qx.locale.Date")
class Date extends js.Object {

}
@js.native
@JSName("qx.locale.Date")
object Date extends js.Object {
    protected def _getTerritory(locale: String): String = js.native
    def getAmMarker(locale: String): String = js.native
    def getDateFormat(size: String, locale: String = ???): String = js.native
    def getDateTimeFormat(canonical: String, fallback: String, locale: String): String = js.native
    def getDayName(length: String, day: Int, locale: String, context: String, withFallback: Boolean = ???): String = js.native
    def getDayNames(length: String, locale: String, context: String, withFallback: Boolean = ???): js.Array[String] = js.native
    def getMonthName(length: String, month: Int, locale: String, context: String, withFallback: Boolean = ???): String = js.native
    def getMonthNames(length: String, locale: String, context: String, withFallback: Boolean = ???): js.Array[String] = js.native
    def getPmMarker(locale: String): String = js.native
    def getTimeFormat(size: String, locale: String): String = js.native
    def getWeekendEnd(locale: String): Int = js.native
    def getWeekendStart(locale: String): Int = js.native
    def getWeekStart(locale: String): Int = js.native
    def isWeekend(day: Int, locale: String): Boolean = js.native

}
}
