
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.util.format {
@js.native
@JSName("qx.util.format.NumberFormat")
class NumberFormat protected () extends qx.core.Object with qx.util.format.IFormat {
    override def format(obj: js.Any): String = js.native
    override def parse(str: String): js.Dynamic = js.native
    def this(locale: String = ???) = this()
    def getGroupingUsed(): Boolean = js.native
    def getLocale(): String = js.native
    def getMaximumFractionDigits(): Long = js.native
    def getMaximumIntegerDigits(): Long = js.native
    def getMinimumFractionDigits(): Long = js.native
    def getMinimumIntegerDigits(): Long = js.native
    def getPostfix(): String = js.native
    def getPrefix(): String = js.native
    protected def initGroupingUsed(value: Boolean): Boolean = js.native
    protected def initLocale(value: String): String = js.native
    protected def initMaximumFractionDigits(value: Long): Long = js.native
    protected def initMaximumIntegerDigits(value: Long): Long = js.native
    protected def initMinimumFractionDigits(value: Long): Long = js.native
    protected def initMinimumIntegerDigits(value: Long): Long = js.native
    protected def initPostfix(value: String): String = js.native
    protected def initPrefix(value: String): String = js.native
    def isGroupingUsed(): Boolean = js.native
    def resetGroupingUsed(): Unit = js.native
    def resetLocale(): Unit = js.native
    def resetMaximumFractionDigits(): Unit = js.native
    def resetMaximumIntegerDigits(): Unit = js.native
    def resetMinimumFractionDigits(): Unit = js.native
    def resetMinimumIntegerDigits(): Unit = js.native
    def resetPostfix(): Unit = js.native
    def resetPrefix(): Unit = js.native
    def setGroupingUsed(value: Boolean): Boolean = js.native
    def setLocale(value: String): String = js.native
    def setMaximumFractionDigits(value: Long): Long = js.native
    def setMaximumIntegerDigits(value: Long): Long = js.native
    def setMinimumFractionDigits(value: Long): Long = js.native
    def setMinimumIntegerDigits(value: Long): Long = js.native
    def setPostfix(value: String): String = js.native
    def setPrefix(value: String): String = js.native
    def toggleGroupingUsed(): Boolean = js.native

}
}
