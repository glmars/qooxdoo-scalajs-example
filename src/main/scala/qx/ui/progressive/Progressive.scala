
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.progressive {
@js.native
@JSName("qx.ui.progressive.Progressive")
class Progressive protected () extends qx.ui.container.Composite {
    def this(structure: qx.ui.progressive.structure.Abstract = ???) = this()
    protected def _applyDataModel(value: qx.ui.progressive.model.Abstract, old: js.Any): Unit = js.native
    def addRenderer(name: String, renderer: qx.ui.progressive.renderer.Abstract): Unit = js.native
    def getBatchSize(): Int = js.native
    def getDataModel(): qx.ui.progressive.model.Abstract = js.native
    def getFlushWidgetQueueAfterBatch(): Boolean = js.native
    def getInterElementTimeout(): Int = js.native
    def getStructure(): qx.ui.progressive.structure.Abstract = js.native
    protected def initBatchSize(value: Int): Int = js.native
    protected def initDataModel(value: qx.ui.progressive.model.Abstract): qx.ui.progressive.model.Abstract = js.native
    protected def initFlushWidgetQueueAfterBatch(value: Boolean): Boolean = js.native
    protected def initInterElementTimeout(value: Int): Int = js.native
    def isFlushWidgetQueueAfterBatch(): Boolean = js.native
    def removeRenderer(name: String): Unit = js.native
    def render(): Unit = js.native
    def resetBatchSize(): Unit = js.native
    def resetDataModel(): Unit = js.native
    def resetFlushWidgetQueueAfterBatch(): Unit = js.native
    def resetInterElementTimeout(): Unit = js.native
    def setBatchSize(value: Int): Int = js.native
    def setDataModel(value: qx.ui.progressive.model.Abstract): qx.ui.progressive.model.Abstract = js.native
    def setFlushWidgetQueueAfterBatch(value: Boolean): Boolean = js.native
    def setInterElementTimeout(value: Int): Int = js.native
    def toggleFlushWidgetQueueAfterBatch(): Boolean = js.native

}
}
