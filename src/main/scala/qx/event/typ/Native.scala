
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.event.typ {
@js.native
@JSName("qx.event.type.Native")
class Native extends qx.event.typ.Event {
    protected def _cloneNativeEvent(nativeEvent: qx.event.typ.Event, cloneQx: js.Any): js.Dynamic = js.native
    def getNativeEvent(): qx.event.typ.Event = js.native
    def getReturnValue(): String = js.native
    def setReturnValue(returnValue: String = ???): Unit = js.native

}
}
