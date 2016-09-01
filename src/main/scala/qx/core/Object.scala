
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.core {
@js.native
@JSName("qx.core.Object")
class Object extends js.Object with qx.core.MEvent with qx.core.MAssert with qx.core.MProperty with qx.core.MLogging with qx.data.MBinding {
    protected def _disposeArray(field: String): Unit = js.native
    protected def _disposeMap(field: String): Unit = js.native
    protected def _disposeObjects(varargs: js.Any = ???): Unit = js.native
    protected def _disposeSingletonObjects(varargs: js.Any = ???): Unit = js.native
    def base(args: js.Any, varargs: js.Any = ???): js.Dynamic = js.native
    @JSName("clone")
    def cloneQx(): qx.core.Object = js.native
    def dispose(): Unit = js.native
    def getUserData(key: String): js.Dynamic = js.native
    def isDisposed(): Boolean = js.native
    def self(args: js.Any): js.Dynamic = js.native
    def setUserData(key: String, value: js.Any): Unit = js.native
    def toHashCode(): Int = js.native

}
}
