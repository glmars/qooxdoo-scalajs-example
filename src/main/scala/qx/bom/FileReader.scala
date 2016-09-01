
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom {
@js.native
@JSName("qx.bom.FileReader")
class FileReader extends qx.core.Object {
    protected def _handleAbort(e: js.Any): Unit = js.native
    protected def _handleError(e: js.Any): Unit = js.native
    protected def _handleLoad(e: js.Any): Unit = js.native
    protected def _handleLoadEnd(e: js.Any): Unit = js.native
    protected def _handleLoadStart(e: js.Any): Unit = js.native
    protected def _handleProgress(e: js.Any): Unit = js.native
    def readAsBinaryString(fileObj: js.Any): Unit = js.native
    def readAsDataURL(fileObj: js.Any): Unit = js.native
    def readAsText(fileObj: js.Any, encoding: String = ???): Unit = js.native

}
@js.native
@JSName("qx.bom.FileReader")
object FileReader extends js.Object {
    def getFile(inputElement: HTMLElement, index: Int): js.Dynamic = js.native
    def getNumFiles(inputElement: HTMLElement): Int = js.native

}
}
