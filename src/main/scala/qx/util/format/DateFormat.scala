
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.util.format {
@js.native
@JSName("qx.util.format.DateFormat")
class DateFormat protected () extends qx.core.Object with qx.util.format.IFormat {
    override def format(obj: js.Any): String = js.native
    override def parse(str: String): js.Dynamic = js.native
    def this(format: String = ???, locale: String = ???) = this()
    protected def _applyLocale(value: String, old: String): Unit = js.native
    def getLocale(): String = js.native
    protected def initLocale(value: String): String = js.native
    def resetLocale(): Unit = js.native
    def setLocale(value: String): String = js.native

}
@js.native
@JSName("qx.util.format.DateFormat")
object DateFormat extends js.Object {
    def getDateInstance(): qx.util.format.DateFormat = js.native
    def getDateTimeInstance(): qx.util.format.DateFormat = js.native

}
}
