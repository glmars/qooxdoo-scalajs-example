
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.data.store {
@js.native
trait IStoreDelegate extends js.Object {
    def configureRequest(request: js.Any): Unit
    def manipulateData(data: js.Any): js.Dynamic

}
}
