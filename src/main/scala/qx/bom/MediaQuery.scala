
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom {
@js.native
@JSName("qx.bom.MediaQuery")
class MediaQuery protected () extends qx.event.Emitter {
    def this(query: String = ???) = this()
    def getQuery(): String = js.native
    def isMatching(): Boolean = js.native

}
}
