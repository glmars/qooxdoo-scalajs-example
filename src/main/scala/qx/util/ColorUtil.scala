
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.util {
@js.native
@JSName("qx.util.ColorUtil")
class ColorUtil extends js.Object {

}
@js.native
@JSName("qx.util.ColorUtil")
object ColorUtil extends js.Object {
    def cssStringToRgb(str: String): js.Array[js.Any] = js.native
    def hex3StringToHex6String(value: String): String = js.native
    def hex3StringToRgb(value: String): js.Array[js.Any] = js.native
    def hex6StringToRgb(value: String): js.Array[js.Any] = js.native
    def hexStringToRgb(value: String): js.Array[js.Any] = js.native
    def hsbToRgb(hsb: js.Array[Long]): js.Array[Int] = js.native
    def isCssString(str: String): Boolean = js.native
    def isHex3String(str: String): Boolean = js.native
    def isHex6String(str: String): Boolean = js.native
    def isNamedColor(value: String): Boolean = js.native
    def isRgbaString(str: String): Boolean = js.native
    def isRgbString(str: String): Boolean = js.native
    def isSystemColor(value: String): Boolean = js.native
    def isThemedColor(value: String): Boolean = js.native
    def isValidPropertyValue(str: String): Boolean = js.native
    def randomColor(): String = js.native
    def rgbToHexString(rgb: js.Array[js.Any]): String = js.native
    def rgbToHsb(rgb: js.Array[Long]): js.Array[js.Any] = js.native
    def rgbToRgbString(rgb: js.Array[js.Any]): String = js.native
    def stringToRgb(str: String): js.Array[js.Any] = js.native
    def stringToRgbString(str: String): String = js.native
    def supportsThemes(): Boolean = js.native

}
}
