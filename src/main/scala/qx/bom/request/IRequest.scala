
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.bom.request {
@js.native
trait IRequest extends js.Object {
    def abort(): Unit
    def getAllResponseHeaders(): String
    def getResponseHeader(header: String): String
    def onabort(): Unit
    def onerror(): Unit
    def onload(): Unit
    def onloadend(): Unit
    def onreadystatechange(): Unit
    def ontimeout(): Unit
    def open(method: String, url: String, async: Boolean = ???): Unit
    def send(data: String = ???): Unit
    def setRequestHeader(key: String, value: String): Unit

}
}
