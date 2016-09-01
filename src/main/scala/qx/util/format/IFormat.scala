
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.util.format {
@js.native
trait IFormat extends js.Object {
    def format(obj: js.Any): String
    def parse(str: String): js.Dynamic

}
}
