
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.util {
@js.native
@JSName("qx.util.RingBuffer")
class RingBuffer protected () extends js.Object {
    def this(maxEntries: Int = ???) = this()
    def addEntry(entry: js.Any): Unit = js.native
    def clear(): Unit = js.native
    def clearMark(): Unit = js.native
    def getAllEntries(): js.Array[js.Any] = js.native
    def getEntries(count: Int, startingFromMark: Boolean = ???): js.Array[js.Any] = js.native
    def getMaxEntries(): Int = js.native
    def mark(): Unit = js.native
    def setMaxEntries(maxEntries: Int): Unit = js.native

}
}
