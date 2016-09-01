
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.theme.manager {
@js.native
@JSName("qx.theme.manager.Decoration")
class Decoration extends qx.core.Object {
    protected def _applyTheme(value: qx.Theme, old: qx.Theme): Unit = js.native
    def addCssClass(value: String): String = js.native
    def clear(): Unit = js.native
    def getCssClassName(value: String): String = js.native
    def getTheme(): qx.Theme = js.native
    protected def initTheme(value: qx.Theme): qx.Theme = js.native
    def isCached(decorator: String): Boolean = js.native
    def isDynamic(value: String): Boolean = js.native
    def isValidPropertyValue(value: js.Any): Boolean = js.native
    def refresh(): Unit = js.native
    def removeAllCssClasses(): Unit = js.native
    def resetTheme(): Unit = js.native
    def resolve(value: String): js.Dynamic = js.native
    def setTheme(value: qx.Theme): qx.Theme = js.native

}
@js.native
@JSName("qx.theme.manager.Decoration")
object Decoration extends js.Object {
    def getInstance(): qx.theme.manager.Decoration = js.native

}
}
