
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.control {
@js.native
@JSName("qx.ui.control.ColorPopup")
class ColorPopup extends qx.ui.popup.Popup with qx.ui.form.IColorForm {
    override def getValue(): String = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: String): Unit = js.native
    protected def _applyValue(value: js.Any, old: js.Any): Unit = js.native
    protected def _createBoxes(): Unit = js.native
    protected def _createColorSelector(): Unit = js.native
    protected def _onAutomaticBtnExecute(): Unit = js.native
    protected def _onChangeVisibility(e: qx.event.`type`.Data): Unit = js.native
    protected def _onColorSelectorCancel(): Unit = js.native
    protected def _onColorSelectorOk(): Unit = js.native
    protected def _onFieldPointerDown(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onFieldPointerOut(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onFieldPointerOver(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onSelectorButtonExecute(): Unit = js.native
    protected def _rotatePreviousColors(): Unit = js.native
    def getBlue(): Long = js.native
    def getGreen(): Long = js.native
    def getRed(): Long = js.native
    protected def initBlue(value: Long): Long = js.native
    protected def initGreen(value: Long): Long = js.native
    protected def initRed(value: Long): Long = js.native
    protected def initValue(value: js.Any): js.Dynamic = js.native
    def resetBlue(): Unit = js.native
    def resetGreen(): Unit = js.native
    def resetRed(): Unit = js.native
    def setBlue(value: Long): Long = js.native
    def setGreen(value: Long): Long = js.native
    def setRed(value: Long): Long = js.native

}
}
