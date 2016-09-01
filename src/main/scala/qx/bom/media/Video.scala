
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom.media {
@js.native
@JSName("qx.bom.media.Video")
class Video protected () extends qx.bom.media.Abstract {
    def this(source: String = ???) = this()
    def getHeight(): Long = js.native
    def getPoster(): String = js.native
    def getVideoHeight(): Long = js.native
    def getVideoWidth(): Long = js.native
    def getWidth(): Long = js.native
    def setHeight(value: Long): Unit = js.native
    def setPoster(value: String): Unit = js.native
    def setWidth(value: Long): Unit = js.native

}
}
