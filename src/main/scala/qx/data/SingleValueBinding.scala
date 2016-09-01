
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.data {
@js.native
@JSName("qx.data.SingleValueBinding")
class SingleValueBinding extends js.Object {

}
@js.native
@JSName("qx.data.SingleValueBinding")
object SingleValueBinding extends js.Object {
    def bind(sourceObject: qx.core.Object, sourcePropertyChain: String, targetObject: qx.core.Object, targetPropertyChain: String, options: js.Any = ???): js.Dynamic = js.native
    def getAllBindings(): js.Dynamic = js.native
    def getAllBindingsForObject(obj: qx.core.Object): js.Array[js.Any] = js.native
    def removeAllBindings(): Unit = js.native
    def removeAllBindingsForObject(obj: qx.core.Object): Unit = js.native
    def removeBindingFromObject(sourceObject: qx.core.Object, id: js.Any): Unit = js.native
    def removeRelatedBindings(obj: qx.core.Object, relatedObject: qx.core.Object): Unit = js.native
    def resolvePropertyChain(o: qx.core.Object, propertyChain: String): js.Dynamic = js.native
    def showAllBindingsInLog(): Unit = js.native
    def showBindingInLog(obj: qx.core.Object, id: js.Any): Unit = js.native
    def updateTarget(sourceObject: qx.core.Object, sourcePropertyChain: String, targetObject: qx.core.Object, targetPropertyChain: String, options: js.Any): Unit = js.native

}
}
