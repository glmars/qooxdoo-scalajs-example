
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.control {
@js.native
@JSName("qx.ui.control.ColorSelector")
class ColorSelector extends qx.ui.core.Widget with qx.ui.form.IColorForm {
    override def getValue(): String = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: String): Unit = js.native
    protected def _applyBlue(value: Int, old: Int): Unit = js.native
    protected def _applyBrightness(value: Long, old: Long): Unit = js.native
    protected def _applyGreen(value: Int, old: Int): Unit = js.native
    protected def _applyHue(value: Long, old: Long): Unit = js.native
    protected def _applyRed(value: Int, old: Int): Unit = js.native
    protected def _applySaturation(value: Long, old: Long): Unit = js.native
    protected def _onAppear(e: qx.event.typ.Data): Unit = js.native
    protected def _onBrightnessFieldPointerDown(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onBrightnessHandlePointerDown(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onBrightnessHandlePointerMove(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onBrightnessHandlePointerUp(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onBrightnessPaneRoll(e: qx.event.typ.Roll): Unit = js.native
    protected def _onColorFieldTap(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onHexFieldChange(e: qx.event.typ.Data): Unit = js.native
    protected def _onHueSaturationFieldPointerDown(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onHueSaturationHandlePointerMove(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onHueSaturationHandlePointerUp(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onHueSaturationPaneRoll(e: qx.event.typ.Roll): Unit = js.native
    protected def _setBlueFromSpinner(): Unit = js.native
    protected def _setBrightnessFromSpinner(): Unit = js.native
    protected def _setBrightnessGradiant(): Unit = js.native
    protected def _setBrightnessOnFieldEvent(e: qx.event.typ.Pointer): Unit = js.native
    protected def _setGreenFromSpinner(): Unit = js.native
    protected def _setHexFromRgb(): Unit = js.native
    protected def _setHueFromRgb(): Unit = js.native
    protected def _setHueFromSpinner(): Unit = js.native
    protected def _setHueSaturationOnFieldEvent(e: qx.event.typ.Pointer): Unit = js.native
    protected def _setPreviewFromRgb(): Unit = js.native
    protected def _setRedFromSpinner(): Unit = js.native
    protected def _setRgbFromHue(): Unit = js.native
    protected def _setSaturationFromSpinner(): Unit = js.native
    def getBlue(): Int = js.native
    def getBrightness(): Long = js.native
    def getGreen(): Int = js.native
    def getHue(): Long = js.native
    def getRed(): Int = js.native
    def getSaturation(): Long = js.native
    protected def initBlue(value: Int): Int = js.native
    protected def initBrightness(value: Long): Long = js.native
    protected def initGreen(value: Int): Int = js.native
    protected def initHue(value: Long): Long = js.native
    protected def initRed(value: Int): Int = js.native
    protected def initSaturation(value: Long): Long = js.native
    def resetBlue(): Unit = js.native
    def resetBrightness(): Unit = js.native
    def resetGreen(): Unit = js.native
    def resetHue(): Unit = js.native
    def resetRed(): Unit = js.native
    def resetSaturation(): Unit = js.native
    def setBlue(value: Int): Int = js.native
    def setBrightness(value: Long): Long = js.native
    def setGreen(value: Int): Int = js.native
    def setHue(value: Long): Long = js.native
    def setPreviousColor(red: Long, green: Long, blue: Long): Unit = js.native
    def setRed(value: Int): Int = js.native
    def setSaturation(value: Long): Long = js.native

}
}
