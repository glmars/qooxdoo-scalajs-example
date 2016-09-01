
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.html {
@js.native
@JSName("qx.html.Blocker")
class Blocker protected () extends qx.html.Element {
    def this(backgroundColor: String = ???, opacity: Long = ???) = this()
    protected def _stopPropagation(e: qx.event.typ.Mouse): Unit = js.native

}
}
