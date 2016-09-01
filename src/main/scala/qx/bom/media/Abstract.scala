
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom.media {
@js.native
@JSName("qx.bom.media.Abstract")
class Abstract protected () extends qx.core.Object {
    def this(media: js.Any = ???) = this()
    protected def _handleEndedEvent(): Unit = js.native
    protected def _handleLoadedDataEvent(): Unit = js.native
    protected def _handleLoadedMetaDataEvent(): Unit = js.native
    protected def _handlePauseEvent(): Unit = js.native
    protected def _handlePlayEvent(): Unit = js.native
    protected def _handleTimeUpdateEvent(): Unit = js.native
    protected def _handleVolumeChangeEvent(): Unit = js.native
    def canPlayType(`type`: String): Boolean = js.native
    def getAutoplay(): Boolean = js.native
    def getCurrentTime(): Long = js.native
    def getDuration(): Long = js.native
    def getId(): String = js.native
    def getMediaObject(): js.Dynamic = js.native
    def getPreload(): String = js.native
    def getSource(): String = js.native
    def getVolume(): Long = js.native
    def hasControls(): Boolean = js.native
    def hideControls(): Unit = js.native
    def isEnded(): Boolean = js.native
    def isLoop(): Boolean = js.native
    def isMuted(): Boolean = js.native
    def isPaused(): Boolean = js.native
    def pause(): Unit = js.native
    def play(): Unit = js.native
    def setAutoplay(autoplay: Boolean): Unit = js.native
    def setCurrentTime(value: Long): Unit = js.native
    def setId(id: String): Unit = js.native
    def setLoop(value: Boolean): Unit = js.native
    def setMuted(muted: Boolean): Unit = js.native
    def setPreload(preload: String): Unit = js.native
    def setSource(source: String): Unit = js.native
    def setVolume(volume: Long): Unit = js.native
    def showControls(): Unit = js.native

}
}
