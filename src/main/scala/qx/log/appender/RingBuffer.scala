
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.log.appender {
@js.native
@JSName("qx.log.appender.RingBuffer")
class RingBuffer protected () extends qx.util.RingBuffer {
    def this(maxMessages: Int = ???) = this()
    def clearHistory(): Unit = js.native
    def getAllLogEvents(): js.Array[js.Any] = js.native
    def getMaxMessages(): Int = js.native
    def process(entry: js.Any): Unit = js.native
    def retrieveLogEvents(count: Int, startingFromMark: Boolean = ???): js.Array[js.Any] = js.native
    def setMaxMessages(maxMessages: Int): Unit = js.native

}
}
