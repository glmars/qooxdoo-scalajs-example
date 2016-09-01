
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.basic {
@js.native
@JSName("qx.ui.basic.Image")
class Image protected () extends qx.ui.core.Widget {
    def this(source: String = ???) = this()
    protected def _applyScale(value: Boolean, old: Boolean): Unit = js.native
    protected def _applySource(value: String, old: String): Unit = js.native
    protected def _findHighResolutionSource(lowResImgSrc: String): String = js.native
    protected def _getHighResolutionSource(source: String, pixelRatio: Long): String = js.native
    protected def _styleSource(): Unit = js.native
    def getScale(): Boolean = js.native
    def getSource(): String = js.native
    protected def initScale(value: Boolean): Boolean = js.native
    protected def initSource(value: String): String = js.native
    def isScale(): Boolean = js.native
    def resetScale(): Unit = js.native
    def resetSource(): Unit = js.native
    def setScale(value: Boolean): Boolean = js.native
    def setSource(value: String): String = js.native
    def toggleScale(): Boolean = js.native

}
}
