
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.locale {
@js.native
@JSName("qx.locale.Manager")
class Manager extends qx.core.Object {
    protected def _applyLocale(value: String, old: String): Unit = js.native
    def addLocale(localeCode: String, localeMap: js.Any): Unit = js.native
    def addTranslation(languageCode: String, translationMap: js.Any): Unit = js.native
    def getAvailableLocales(includeNonloaded: Boolean = ???): js.Array[String] = js.native
    def getLanguage(): String = js.native
    def getLocale(): String = js.native
    def getTerritory(): String = js.native
    protected def initLocale(value: String): String = js.native
    def localize(messageId: String, args: js.Array[js.Any], locale: String = ???): String = js.native
    def resetLocale(): Unit = js.native
    def setLocale(value: String): String = js.native
    def translate(messageId: String, args: js.Array[js.Any], locale: String = ???): String = js.native

}
@js.native
@JSName("qx.locale.Manager")
object Manager extends js.Object {
    def getInstance(): qx.locale.Manager = js.native
    def marktr(messageId: String): String = js.native
    def tr(messageId: String, varargs: js.Any = ???): String = js.native
    def trc(hint: String, messageId: String, varargs: js.Any = ???): String = js.native
    def trn(singularMessageId: String, pluralMessageId: String, count: Int, varargs: js.Any = ???): String = js.native
    def trnc(hint: String, singularMessageId: String, pluralMessageId: String, count: Int, varargs: js.Any = ???): String = js.native

}
}
