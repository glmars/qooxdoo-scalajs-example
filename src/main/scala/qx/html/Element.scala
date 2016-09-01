
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.html {
@js.native
@JSName("qx.html.Element")
class Element protected () extends qx.core.Object {
    def this(tagName: String = ???, styles: js.Any = ???, attributes: js.Any = ???) = this()
    protected def _applyProperty(name: String, value: js.Any): qx.html.Element = js.native
    protected def _copyData(fromMarkup: Boolean): Unit = js.native
    protected def _createDomElement(): HTMLElement = js.native
    protected def _getProperty(key: String): js.Dynamic = js.native
    protected def _insertChildren(): Unit = js.native
    protected def _removeProperty(key: String, direct: Boolean = ???): qx.html.Element = js.native
    protected def _scheduleChildrenUpdate(): Unit = js.native
    protected def _setProperty(key: String, value: js.Any, direct: Boolean = ???): qx.html.Element = js.native
    protected def _syncChildren(): Unit = js.native
    protected def _syncData(): Unit = js.native
    def activate(): Unit = js.native
    def add(varargs: qx.html.Element = ???): qx.html.Element = js.native
    def addAt(child: qx.html.Element, index: Int): qx.html.Element = js.native
    def addClass(name: String): Unit = js.native
    def addListener(`type`: String, listener: js.Function, self: js.Any = ???, capture: Boolean = ???): js.Dynamic = js.native
    def blur(): Unit = js.native
    def capture(containerCapture: Boolean = ???): Unit = js.native
    def clearTextSelection(): Unit = js.native
    def deactivate(): Unit = js.native
    def disableScrolling(): Unit = js.native
    def enableScrolling(): Unit = js.native
    def exclude(): qx.html.Element = js.native
    def fadeIn(duration: Long): qx.bom.element.AnimationHandle = js.native
    def fadeOut(duration: Long): qx.bom.element.AnimationHandle = js.native
    def focus(): Unit = js.native
    def free(): qx.html.Element = js.native
    def getAllStyles(): js.Dynamic = js.native
    def getAttribute(key: String): js.Dynamic = js.native
    def getChild(index: Int): qx.html.Element = js.native
    def getChildren(): js.Array[js.Any] = js.native
    def getDomElement(): HTMLElement = js.native
    def getListeners(): js.Array[js.Dynamic] = js.native
    def getNodeName(): String = js.native
    def getParent(): qx.html.Element = js.native
    def getScrollX(): Int = js.native
    def getScrollY(): Int = js.native
    def getStyle(key: String): js.Dynamic = js.native
    def getTextSelection(): String = js.native
    def getTextSelectionEnd(): Int = js.native
    def getTextSelectionLength(): Int = js.native
    def getTextSelectionStart(): Int = js.native
    def hasChild(child: qx.html.Element): Boolean = js.native
    def hasChildren(): Boolean = js.native
    def hasListener(`type`: String, capture: Boolean = ???): Boolean = js.native
    def hide(): qx.html.Element = js.native
    def include(): qx.html.Element = js.native
    def indexOf(child: qx.html.Element): Int = js.native
    def insertAfter(rel: qx.html.Element): qx.html.Element = js.native
    def insertBefore(rel: qx.html.Element): qx.html.Element = js.native
    def insertInto(parent: qx.html.Element, index: Int = ???): qx.html.Element = js.native
    def isFocusable(): Boolean = js.native
    def isIncluded(): Boolean = js.native
    def isNativelyFocusable(): Boolean = js.native
    def isVisible(): Boolean = js.native
    def moveAfter(rel: qx.html.Element): qx.html.Element = js.native
    def moveBefore(rel: qx.html.Element): qx.html.Element = js.native
    def moveTo(index: Int): qx.html.Element = js.native
    def releaseCapture(): Unit = js.native
    def remove(childs: qx.html.Element): qx.html.Element = js.native
    def removeAll(): qx.html.Element = js.native
    def removeAt(index: Int): qx.html.Element = js.native
    def removeAttribute(key: String, direct: Boolean = ???): qx.html.Element = js.native
    def removeClass(name: String): Unit = js.native
    def removeListener(`type`: String, listener: js.Function, self: js.Any, capture: Boolean = ???): qx.html.Element = js.native
    def removeListenerById(id: js.Any): qx.html.Element = js.native
    def removeStyle(key: String, direct: Boolean = ???): qx.html.Element = js.native
    def scrollChildIntoViewX(elem: qx.html.Element, align: String = ???, direct: Boolean = ???): Unit = js.native
    def scrollChildIntoViewY(elem: qx.html.Element, align: String = ???, direct: Boolean = ???): Unit = js.native
    def scrollToX(x: Int, `lazy`: Boolean = ???): Unit = js.native
    def scrollToY(y: Int, `lazy`: Boolean = ???): Unit = js.native
    def setAttribute(key: String, value: js.Any, direct: Boolean = ???): qx.html.Element = js.native
    def setAttributes(map: js.Any, direct: Boolean = ???): qx.html.Element = js.native
    def setNodeName(name: String): Unit = js.native
    def setRoot(root: Boolean): Unit = js.native
    def setSelectable(value: Boolean): Unit = js.native
    def setStyle(key: String, value: js.Any, direct: Boolean = ???): qx.html.Element = js.native
    def setStyles(map: js.Any, direct: Boolean = ???): qx.html.Element = js.native
    def setTextSelection(start: Int, end: Int): Unit = js.native
    def show(): qx.html.Element = js.native
    def useElement(elem: HTMLElement): Unit = js.native
    def useMarkup(html: String): HTMLElement = js.native

}
@js.native
@JSName("qx.html.Element")
object Element extends js.Object {
    protected def _scheduleFlush(job: String): Unit = js.native
    def flush(): Unit = js.native

}
}
