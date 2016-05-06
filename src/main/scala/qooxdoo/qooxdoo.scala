
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx {

package registry {

@JSName("qx.registry")
@js.native
object Registry extends js.Object {
  def registerMainMethod(fn: js.Function1[qx.application.Standalone, Unit]): Unit = js.native
}

}

}
package qx {
@js.native
@JSName("qx.Bootstrap")
class Bootstrap extends js.Object {

}
@js.native
@JSName("qx.Bootstrap")
object Bootstrap extends js.Object {
    def base(args: js.Any, varargs: js.Any = ???): js.Dynamic = js.native
    def bind(func: js.Function, self: js.Any = ???, varargs: js.Any = ???): js.Function = js.native
    def createNamespace(name: String, obj: js.Any): String = js.native
    def debug(obj: js.Any, message: js.Any): Unit = js.native
    def define(name: String = ???, config: js.Any = ???): qx.Class = js.native
    def error(obj: js.Any, message: js.Any): Unit = js.native
    def extendClass(clazz: js.Function, construct: js.Function, superClass: js.Function, name: js.Function, basename: js.Function): Unit = js.native
    def firstLow(str: String): String = js.native
    def firstUp(str: String): String = js.native
    def genericToString(): String = js.native
    def getByName(name: String): qx.Class = js.native
    def getClass(value: js.Any): String = js.native
    def getEnvironmentSetting(key: String): js.Dynamic = js.native
    def info(obj: js.Any, message: js.Any): Unit = js.native
    def isArray(value: js.Any): Boolean = js.native
    def isFunction(value: js.Any): Boolean = js.native
    def isObject(value: js.Any): Boolean = js.native
    def isString(value: js.Any): Boolean = js.native
    def keys(map: js.Any): qx.data.Array = js.native
    def objectGetLength(map: js.Any): Int = js.native
    def objectMergeWith(target: js.Any, source: js.Any, overwrite: Boolean = ???): js.Dynamic = js.native
    def setDisplayName(fcn: js.Function, classname: String, name: String): Unit = js.native
    def setDisplayNames(functionMap: js.Any, classname: String): Unit = js.native
    def setEnvironmentSetting(key: String, value: js.Any): Unit = js.native
    def setRoot(root: js.Any): Unit = js.native
    def trace(obj: js.Any): Unit = js.native
    def warn(obj: js.Any, message: js.Any): Unit = js.native

}
}
package qx {
@js.native
@JSName("qx.Class")
class Class extends js.Object {

}
@js.native
@JSName("qx.Class")
object Class extends js.Object {
    def define(name: String = ???, config: js.Any = ???): qx.Class = js.native
    def genericToString(): String = js.native
    def getByInterface(clazz: qx.Class, iface: qx.Interface): qx.Class = js.native
    def getByMixin(clazz: qx.Class, mixin: qx.Mixin): qx.Class = js.native
    def getByName(name: String): qx.Class = js.native
    def getByProperty(clazz: qx.Class, name: String): qx.Class = js.native
    def getEventType(clazz: qx.Class, name: String): String = js.native
    def getInstance(): js.Dynamic = js.native
    def getInterfaces(clazz: qx.Class): js.Array[qx.Interface] = js.native
    def getMixins(clazz: qx.Class): js.Array[qx.Mixin] = js.native
    def getProperties(clazz: qx.Class): js.Array[String] = js.native
    def getPropertyDefinition(clazz: qx.Class, name: String): js.Dynamic = js.native
    def getTotalNumber(): Long = js.native
    def hasInterface(clazz: qx.Class, iface: qx.Interface): Boolean = js.native
    def hasMixin(clazz: qx.Class, mixin: qx.Mixin): Boolean = js.native
    def hasOwnInterface(clazz: qx.Class, iface: qx.Interface): Boolean = js.native
    def hasOwnMixin(clazz: qx.Class, mixin: qx.Mixin): Boolean = js.native
    def hasProperty(clazz: qx.Class, name: String): Boolean = js.native
    def implementsInterface(obj: js.Any, iface: qx.Interface): Boolean = js.native
    def include(clazz: qx.Class, mixin: qx.Mixin): Unit = js.native
    def isDefined(name: String): Boolean = js.native
    def isSubClassOf(clazz: qx.Class, superClass: qx.Class): Boolean = js.native
    def patch(clazz: qx.Class, mixin: qx.Mixin): Unit = js.native
    def supportsEvent(clazz: qx.Class, name: String): Boolean = js.native
    def undefine(name: String): Unit = js.native

}
}
package qx {
@js.native
@JSName("qx.Interface")
class Interface extends js.Object {

}
@js.native
@JSName("qx.Interface")
object Interface extends js.Object {
    def assert(clazz: qx.Class, iface: qx.Interface, wrap: Boolean = ???): Unit = js.native
    def assertObject(obj: qx.core.Object, iface: qx.Interface): Unit = js.native
    def classImplements(clazz: qx.Class, iface: qx.Interface): Boolean = js.native
    def define(name: String, config: js.Any = ???): qx.Interface = js.native
    def flatten(ifaces: js.Array[qx.Interface] = ???): qx.data.Array = js.native
    def genericToString(): String = js.native
    def getByName(name: String): qx.Class = js.native
    def getTotalNumber(): Long = js.native
    def isDefined(name: String): Boolean = js.native
    def objectImplements(obj: qx.core.Object, iface: qx.Interface): Boolean = js.native

}
}
package qx {
@js.native
@JSName("qx.Mixin")
class Mixin extends js.Object {

}
@js.native
@JSName("qx.Mixin")
object Mixin extends js.Object {
    def checkCompatibility(mixins: js.Array[qx.Mixin]): Boolean = js.native
    def define(name: String, config: js.Any = ???): qx.Mixin = js.native
    def flatten(mixins: js.Array[qx.Mixin] = ???): qx.data.Array = js.native
    def genericToString(): String = js.native
    def getByName(name: String): qx.Class = js.native
    def getTotalNumber(): Long = js.native
    def isCompatible(mixin: qx.Mixin, clazz: qx.Class): Boolean = js.native
    def isDefined(name: String): Boolean = js.native

}
}
package qx {
@js.native
@JSName("qx.Part")
class Part protected () extends js.Object {
    def this(loader: js.Any = ???) = this()
    def addPackageListener(pkg: js.Any, callback: js.Any): Unit = js.native
    def addPartListener(part: js.Any, callback: js.Any): Unit = js.native
    def addToPackage(pkg: qx.io.part.Package): Unit = js.native
    def getParts(): qx.data.Array = js.native
    def notifyPackageResult(pkg: js.Any): Unit = js.native
    def notifyPartResult(part: js.Any): Unit = js.native
    def preload(partNames: String, callback: js.Function, self: js.Any = ???): Unit = js.native
    def require(partNames: String, callback: js.Function, self: js.Any = ???): Unit = js.native
    def saveClosure(id: String, closure: js.Function): Unit = js.native

}
@js.native
@JSName("qx.Part")
object Part extends js.Object {
    def $$notifyLoad(id: String, closure: js.Function): Unit = js.native
    def getInstance(): qx.Part = js.native

}
}
package qx {
@js.native
@JSName("qx.Theme")
class Theme extends js.Object {

}
@js.native
@JSName("qx.Theme")
object Theme extends js.Object {
    def define(name: String, config: js.Any): Unit = js.native
    def genericToString(): String = js.native
    def getAll(): js.Dynamic = js.native
    def getByName(name: String): js.Dynamic = js.native
    def getTotalNumber(): Long = js.native
    def include(theme: qx.Theme, mixinTheme: qx.Theme): Unit = js.native
    def isDefined(name: String): Boolean = js.native
    def patch(theme: qx.Theme, mixinTheme: qx.Theme): Unit = js.native

}
}
package qx.application {
@js.native
@JSName("qx.application.AbstractGui")
class AbstractGui extends qx.core.Object with qx.application.IApplication with qx.locale.MTranslation {
    override def close(): String = js.native
    override def finalize(): Unit = js.native
    override def main(): Unit = js.native
    override def terminate(): Unit = js.native
    protected def _createRootWidget(): qx.ui.core.Widget = js.native
    def getRoot(): qx.ui.core.Widget = js.native
    def render(): Unit = js.native

}
}
package qx.application {
@js.native
@JSName("qx.application.Basic")
class Basic extends qx.core.Object with qx.application.IApplication {
    override def close(): String = js.native
    override def finalize(): Unit = js.native
    override def main(): Unit = js.native
    override def terminate(): Unit = js.native

}
}
package qx.application {
@js.native
trait IApplication extends js.Object {
    def close(): String = js.native
    override def finalize(): Unit = js.native
    def main(): Unit = js.native
    def terminate(): Unit = js.native

}
}
package qx.application {
@js.native
@JSName("qx.application.Native")
class Native extends qx.core.Object with qx.application.IApplication {
    override def close(): String = js.native
    override def finalize(): Unit = js.native
    override def main(): Unit = js.native
    override def terminate(): Unit = js.native

}
}
package qx.application {
@js.native
@JSName("qx.application.Routing")
class Routing extends js.Object {
    protected def _executeGet(path: String, customData: js.Any, fromEvent: js.Any): Unit = js.native
    protected def _getPathOrFallback(path: String, defaultPath: String = ???): String = js.native
    def back(customData: js.Any = ???): Unit = js.native
    def dispose(): Unit = js.native
    def execute(path: String, customData: js.Any): Unit = js.native
    def executeDelete(path: String, params: js.Any, customData: js.Any): Unit = js.native
    def executeGet(path: String, customData: js.Any): Unit = js.native
    def executePost(path: String, params: js.Any, customData: js.Any): Unit = js.native
    def executePut(path: String, params: js.Any, customData: js.Any): Unit = js.native
    def getState(): String = js.native
    def init(defaultPath: String = ???): Unit = js.native
    def on(route: String, handler: js.Function, scope: js.Any): String = js.native
    def onAny(route: String, handler: js.Function, scope: js.Any): String = js.native
    def onDelete(route: String, handler: js.Function, scope: js.Any): String = js.native
    def onGet(route: String, handler: js.Function, scope: js.Any): String = js.native
    def onPost(route: String, handler: js.Function, scope: js.Any): String = js.native
    def onPut(route: String, handler: js.Function, scope: js.Any): String = js.native
    def remove(id: String): Unit = js.native

}
}
package qx.application {
@js.native
@JSName("qx.application.Standalone")
class Standalone extends qx.application.AbstractGui {

}
}
package qx.bom {
@js.native
@JSName("qx.bom.AnimationFrame")
class AnimationFrame extends qx.event.Emitter {
    def cancelSequence(): Unit = js.native
    def startSequence(duration: Long): Unit = js.native

}
@js.native
@JSName("qx.bom.AnimationFrame")
object AnimationFrame extends js.Object {
    def calculateTiming(func: String, x: Int): Int = js.native
    def request(callback: js.Function, context: js.Any): Long = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Blocker")
class Blocker extends qx.core.Object {
    def block(element: js.Any = ???): Unit = js.native
    def getBlockerColor(): String = js.native
    def getBlockerElement(): HTMLElement = js.native
    def getBlockerOpacity(): Int = js.native
    def getBlockerZIndex(): Int = js.native
    def isBlocked(): Boolean = js.native
    def setBlockerColor(color: String): Unit = js.native
    def setBlockerOpacity(opacity: String): Unit = js.native
    def setBlockerZIndex(zIndex: Int): Unit = js.native
    def unblock(): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Cookie")
class Cookie extends js.Object {

}
@js.native
@JSName("qx.bom.Cookie")
object Cookie extends js.Object {
    def del(key: String, path: String = ???, domain: String = ???): Unit = js.native
    def get(key: String): js.Dynamic = js.native
    def set(key: String, value: String, expires: Long = ???, path: String = ???, domain: String = ???, secure: Boolean = ???): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Document")
class Document extends js.Object {

}
@js.native
@JSName("qx.bom.Document")
object Document extends js.Object {
    def getHeight(win: Window = ???): Int = js.native
    def getWidth(win: Window = ???): Int = js.native
    def isQuirksMode(win: Window = ???): Boolean = js.native
    def isStandardMode(win: Window = ???): Boolean = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Element")
class Element extends js.Object {

}
@js.native
@JSName("qx.bom.Element")
object Element extends js.Object {
    def activate(element: HTMLElement): Unit = js.native
    def addListener(element: HTMLElement, `type`: String, listener: js.Function, self: js.Any = ???, capture: Boolean = ???): String = js.native
    def blur(element: HTMLElement): Unit = js.native
    def capture(element: HTMLElement, containerCapture: Boolean = ???): Unit = js.native
    def clone(element: HTMLElement, events: Boolean = ???): HTMLElement = js.native
    def deactivate(element: HTMLElement): Unit = js.native
    def focus(element: HTMLElement): Unit = js.native
    def hasListener(element: HTMLElement, `type`: String, capture: Boolean = ???): Boolean = js.native
    def releaseCapture(element: HTMLElement): Unit = js.native
    def removeListener(element: HTMLElement, `type`: String, listener: js.Function, self: js.Any = ???, capture: Boolean = ???): Boolean = js.native
    def removeListenerById(target: js.Any, id: String): Boolean = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Event")
class Event extends js.Object {

}
@js.native
@JSName("qx.bom.Event")
object Event extends js.Object {
    def addNativeListener(target: js.Any, `type`: String, listener: js.Function, useCapture: Boolean = ???): Unit = js.native
    def fire(target: HTMLElement, `type`: String): Boolean = js.native
    def getEventName(target: js.Any, `type`: String): String = js.native
    def getRelatedTarget(e: qx.event.`type`.Event): HTMLElement = js.native
    def getTarget(e: qx.event.`type`.Event): js.Dynamic = js.native
    def preventDefault(e: qx.event.`type`.Event): Unit = js.native
    def removeNativeListener(target: js.Any, `type`: String, listener: js.Function, useCapture: Boolean = ???): Unit = js.native
    def stopPropagation(e: qx.event.`type`.Event): Unit = js.native
    def supportsEvent(target: js.Any, `type`: String): Boolean = js.native

}
}
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
package qx.bom {
@js.native
@JSName("qx.bom.Flash")
class Flash extends js.Object {

}
@js.native
@JSName("qx.bom.Flash")
object Flash extends js.Object {
    def create(element: HTMLElement, attributes: js.Any, variables: js.Any = ???, params: js.Any = ???, win: Window = ???): HTMLElement = js.native
    def destroy(element: HTMLElement, win: Window = ???): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Font")
class Font protected () extends qx.core.Object {
    def this(size: String = ???, family: js.Array[String] = ???) = this()
    protected def _applyBold(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyColor(value: String, old: String): Unit = js.native
    protected def _applyDecoration(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyFamily(value: qx.data.Array, old: qx.data.Array): Unit = js.native
    protected def _applyItalic(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyLineHeight(value: Long, old: Long): Unit = js.native
    protected def _applySize(value: Int, old: Int): Unit = js.native
    protected def _applyTextShadow(value: String, old: String): Unit = js.native
    def getBold(): Boolean = js.native
    def getColor(): String = js.native
    def getDecoration(): js.Dynamic = js.native
    def getFamily(): qx.data.Array = js.native
    def getItalic(): Boolean = js.native
    def getLineHeight(): Long = js.native
    def getSize(): Int = js.native
    def getStyles(): js.Dynamic = js.native
    def getTextShadow(): String = js.native
    protected def initBold(value: js.Any): Boolean = js.native
    protected def initColor(value: js.Any): String = js.native
    protected def initDecoration(value: js.Any): js.Dynamic = js.native
    protected def initFamily(value: js.Any): qx.data.Array = js.native
    protected def initItalic(value: js.Any): Boolean = js.native
    protected def initLineHeight(value: js.Any): Long = js.native
    protected def initSize(value: js.Any): Int = js.native
    protected def initTextShadow(value: js.Any): String = js.native
    def isBold(): Boolean = js.native
    def isItalic(): Boolean = js.native
    def resetBold(): Unit = js.native
    def resetColor(): Unit = js.native
    def resetDecoration(): Unit = js.native
    def resetFamily(): Unit = js.native
    def resetItalic(): Unit = js.native
    def resetLineHeight(): Unit = js.native
    def resetSize(): Unit = js.native
    def resetTextShadow(): Unit = js.native
    def setBold(value: js.Any): Boolean = js.native
    def setColor(value: js.Any): String = js.native
    def setDecoration(value: js.Any): js.Dynamic = js.native
    def setFamily(value: js.Any): qx.data.Array = js.native
    def setItalic(value: js.Any): Boolean = js.native
    def setLineHeight(value: js.Any): Long = js.native
    def setSize(value: js.Any): Int = js.native
    def setTextShadow(value: js.Any): String = js.native
    def toggleBold(): Boolean = js.native
    def toggleItalic(): Boolean = js.native

}
@js.native
@JSName("qx.bom.Font")
object Font extends js.Object {
    def fromConfig(config: js.Any): qx.bom.Font = js.native
    def fromString(str: String): qx.bom.Font = js.native
    def getDefaultStyles(): js.Dynamic = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.GeoLocation")
class GeoLocation extends qx.core.Object {
    protected def _errorHandler(error: js.Any): Unit = js.native
    protected def _successHandler(position: js.Any): Unit = js.native
    def getCurrentPosition(enableHighAccuracy: Boolean, timeout: Int, maximumAge: Int): Unit = js.native
    def startWatchPosition(enableHighAccuracy: Boolean, timeout: Int, maximumAge: Int): Unit = js.native
    def stopWatchPosition(): Unit = js.native

}
@js.native
@JSName("qx.bom.GeoLocation")
object GeoLocation extends js.Object {
    def getInstance(): qx.bom.GeoLocation = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.HashHistory")
class HashHistory extends qx.bom.History {

}
}
package qx.bom {
@js.native
@JSName("qx.bom.History")
class History extends qx.core.Object {
    protected def _applyState(value: String, old: String): Unit = js.native
    protected def _applyTitle(title: String, old: String): Unit = js.native
    protected def _decode(value: String): String = js.native
    protected def _encode(value: String): String = js.native
    protected def _getHash(): String = js.native
    protected def _onHistoryLoad(state: String): Unit = js.native
    protected def _readState(): String = js.native
    protected def _setHash(value: String): Unit = js.native
    protected def _setInitialState(): Unit = js.native
    protected def _writeState(): Unit = js.native
    def addToHistory(state: String, newTitle: String = ???): Unit = js.native
    def getState(): String = js.native
    def getTitle(): String = js.native
    protected def initState(value: js.Any): String = js.native
    protected def initTitle(value: js.Any): String = js.native
    def navigateBack(): Unit = js.native
    def navigateForward(): Unit = js.native
    def resetState(): Unit = js.native
    def resetTitle(): Unit = js.native
    def setState(value: js.Any): String = js.native
    def setTitle(value: js.Any): String = js.native

}
@js.native
@JSName("qx.bom.History")
object History extends js.Object {
    def getInstance(): js.Dynamic = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Html")
class Html extends js.Object {

}
@js.native
@JSName("qx.bom.Html")
object Html extends js.Object {
    def clean(objs: js.Array[HTMLElement], context: Document = ???, fragment: HTMLElement = ???): js.Array[HTMLElement] = js.native
    def extractScripts(elements: js.Array[HTMLElement], fragment: Document = ???): js.Array[HTMLElement] = js.native
    def fixEmptyTags(html: String): String = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Iframe")
class Iframe extends js.Object {

}
@js.native
@JSName("qx.bom.Iframe")
object Iframe extends js.Object {
    def create(attributes: js.Any = ???, win: Window = ???): HTMLElement = js.native
    def getBody(iframe: HTMLElement): HTMLElement = js.native
    def getDocument(iframe: HTMLElement): Document = js.native
    def getWindow(iframe: HTMLElement): Window = js.native
    def queryCurrentUrl(iframe: HTMLElement): String = js.native
    def setSource(iframe: HTMLElement, source: String): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.IframeHistory")
class IframeHistory extends qx.bom.History {
    protected def _setState(state: String): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Input")
class Input extends js.Object {

}
@js.native
@JSName("qx.bom.Input")
object Input extends js.Object {
    def create(`type`: String, attributes: js.Any, win: Window): HTMLElement = js.native
    def getValue(element: HTMLElement): String = js.native
    def setValue(element: HTMLElement, value: String): Unit = js.native
    def setWrap(element: HTMLElement, wrap: Boolean): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Label")
class Label extends js.Object {

}
@js.native
@JSName("qx.bom.Label")
object Label extends js.Object {
    def create(content: String, html: Boolean = ???, win: Window = ???): HTMLElement = js.native
    def getHtmlSize(content: String, styles: js.Any = ???, width: Int = ???): js.Dynamic = js.native
    def getTextSize(text: String, styles: js.Any): js.Dynamic = js.native
    def getValue(element: HTMLElement): String = js.native
    def setSanitizer(func: js.Function): Unit = js.native
    def setValue(element: HTMLElement, value: String): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Lifecycle")
class Lifecycle extends js.Object {

}
@js.native
@JSName("qx.bom.Lifecycle")
object Lifecycle extends js.Object {
    def onReady(callback: js.Function, context: js.Any = ???): Unit = js.native
    def onShutdown(callback: js.Function, context: js.Any = ???): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.MediaQuery")
class MediaQuery protected () extends qx.event.Emitter {
    def this(query: String = ???) = this()
    def getQuery(): String = js.native
    def isMatching(): Boolean = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.NativeHistory")
class NativeHistory extends qx.bom.History {

}
}
package qx.bom {
@js.native
@JSName("qx.bom.PageVisibility")
class PageVisibility protected () extends qx.event.Emitter {
    def this(document: Document = ???) = this()
    def getVisibilityState(): String = js.native
    def isHidden(): Boolean = js.native

}
@js.native
@JSName("qx.bom.PageVisibility")
object PageVisibility extends js.Object {
    def getInstance(): qx.bom.PageVisibility = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Range")
class Range extends js.Object {

}
@js.native
@JSName("qx.bom.Range")
object Range extends js.Object {
    def get(node: Node): js.Dynamic = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Selection")
class Selection extends js.Object {

}
@js.native
@JSName("qx.bom.Selection")
object Selection extends js.Object {
    def get(node: Node): String = js.native
    def getEnd(node: Node): Int = js.native
    def getLength(node: Node): Int = js.native
    def getSelectionObject(documentNode: Document): js.Dynamic = js.native
    def getStart(node: Node): Int = js.native
    def set(node: Node, start: Int, end: Int): Boolean = js.native
    def setAll(node: Node): Boolean = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Selector")
class Selector extends js.Object {

}
@js.native
@JSName("qx.bom.Selector")
object Selector extends js.Object {
    def matches(selector: String, set: qx.data.Array): qx.data.Array = js.native
    def query(selector: String, context: HTMLElement): qx.data.Array = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Shortcut")
class Shortcut protected () extends qx.core.Object {
    def this(shortcut: String = ???) = this()
    protected def _applyEnabled(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyShortcut(value: String, old: String): Unit = js.native
    def execute(target: js.Any): Unit = js.native
    def getAutoRepeat(): Boolean = js.native
    def getEnabled(): Boolean = js.native
    def getShortcut(): String = js.native
    protected def initAutoRepeat(value: js.Any): Boolean = js.native
    protected def initEnabled(value: js.Any): Boolean = js.native
    protected def initShortcut(value: js.Any): String = js.native
    def isAutoRepeat(): Boolean = js.native
    def isEnabled(): Boolean = js.native
    def resetAutoRepeat(): Unit = js.native
    def resetEnabled(): Unit = js.native
    def resetShortcut(): Unit = js.native
    def setAutoRepeat(value: js.Any): Boolean = js.native
    def setEnabled(value: js.Any): Boolean = js.native
    def setShortcut(value: js.Any): String = js.native
    def toggleAutoRepeat(): Boolean = js.native
    def toggleEnabled(): Boolean = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Storage")
class Storage extends js.Object {

}
@js.native
@JSName("qx.bom.Storage")
object Storage extends js.Object {
    def getLocal(): qx.bom.storage.Web = js.native
    def getSession(): qx.bom.storage.Web = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.String")
class String extends js.Object {

}
@js.native
@JSName("qx.bom.String")
object String extends js.Object {
    def escape(str: String): String = js.native
    def fromText(str: String): String = js.native
    def toText(str: String): String = js.native
    def unescape(str: String): js.Dynamic = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Style")
class Style extends js.Object {

}
@js.native
@JSName("qx.bom.Style")
object Style extends js.Object {
    def getAppliedStyle(element: HTMLElement, propertyName: String, value: String, prefixed: Boolean = ???): String = js.native
    def getCssName(propertyName: String): String = js.native
    def getPropertyName(propertyName: String): String = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Stylesheet")
class Stylesheet extends js.Object {

}
@js.native
@JSName("qx.bom.Stylesheet")
object Stylesheet extends js.Object {
    def addImport(sheet: js.Any, url: String): Unit = js.native
    def addRule(sheet: js.Any, selector: String, entry: String): Unit = js.native
    def createElement(text: String = ???): StyleSheet = js.native
    def includeFile(href: String, doc: Document = ???): Unit = js.native
    def removeAllImports(sheet: js.Any): Unit = js.native
    def removeAllRules(sheet: js.Any): Unit = js.native
    def removeImport(sheet: js.Any, url: String): Unit = js.native
    def removeRule(sheet: js.Any, selector: String): Unit = js.native
    def removeSheet(sheet: js.Any): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Template")
class Template extends js.Object {

}
@js.native
@JSName("qx.bom.Template")
object Template extends js.Object {
    protected def _createNodeFromTemplate(template: String): HTMLElement = js.native
    def get(id: String, view: js.Any, partials: js.Any): HTMLElement = js.native
    def render(template: String, view: js.Any, partials: js.Any): String = js.native
    def renderToNode(template: String, view: js.Any, partials: js.Any): HTMLElement = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Viewport")
class Viewport extends js.Object {

}
@js.native
@JSName("qx.bom.Viewport")
object Viewport extends js.Object {
    def getHeight(win: Window = ???): Int = js.native
    def getOrientation(win: Window = ???): Int = js.native
    def getScrollLeft(win: Window = ???): Int = js.native
    def getScrollTop(win: Window = ???): Int = js.native
    def getWidth(win: Window = ???): Int = js.native
    def isLandscape(win: Window = ???): Boolean = js.native
    def isPortrait(win: Window = ???): Boolean = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Vml")
class Vml extends js.Object {

}
@js.native
@JSName("qx.bom.Vml")
object Vml extends js.Object {
    def create(`type`: String, attributes: js.Any = ???, win: js.Any = ???): HTMLElement = js.native
    def createImage(source: String = ???, width: Int = ???, height: Int = ???, xOffset: Int = ???, yOffset: Int = ???, imageWidth: Int = ???, imageHeight: Int = ???): HTMLElement = js.native
    def updateImage(image: HTMLElement, source: String, width: Int, height: Int, xOffset: Int = ???, yOffset: Int = ???, imageWidth: Int = ???, imageHeight: Int = ???): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.WebWorker")
class WebWorker protected () extends qx.core.Object {
    def this(src: String = ???) = this()
    protected def _handleError(e: qx.event.`type`.Event): Unit = js.native
    protected def _handleMessage(e: qx.event.`type`.Event): Unit = js.native
    def postMessage(msg: String): Unit = js.native

}
}
package qx.bom {
@js.native
@JSName("qx.bom.Window")
class Window extends js.Object {

}
@js.native
@JSName("qx.bom.Window")
object Window extends js.Object {
    def close(win: Window): js.Dynamic = js.native
    def getBlocker(): qx.bom.Blocker = js.native
    def isClosed(win: Window): Boolean = js.native
    def moveTo(win: Window, top: Int, left: Int): Unit = js.native
    def open(url: String, name: String, options: js.Any, modal: Boolean, useNativeModalDialog: Boolean, listener: js.Function = ???, self: js.Any = ???): Window = js.native
    def resizeTo(win: Window, width: Int, height: Int): Unit = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Browser")
class Browser extends js.Object {

}
@js.native
@JSName("qx.bom.client.Browser")
object Browser extends js.Object {
    def getDocumentMode(): Long = js.native
    def getName(): String = js.native
    def getQuirksMode(): Boolean = js.native
    def getVersion(): String = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Css")
class Css extends js.Object {

}
@js.native
@JSName("qx.bom.client.Css")
object Css extends js.Object {
    def getAlphaImageLoaderNeeded(): Boolean = js.native
    def getAppearance(): String = js.native
    def getBorderImage(): String = js.native
    def getBorderImageSyntax(): Boolean = js.native
    def getBorderRadius(): String = js.native
    def getBoxModel(): String = js.native
    def getBoxShadow(): String = js.native
    def getBoxSizing(): String = js.native
    def getFilterGradient(): Boolean = js.native
    def getFilterTextShadow(): Boolean = js.native
    def getFlexboxSyntax(): String = js.native
    def getFloat(): String = js.native
    def getInlineBlock(): String = js.native
    def getLegacyWebkitGradient(): Boolean = js.native
    def getLinearGradient(): String = js.native
    def getOpacity(): Boolean = js.native
    def getPlaceholder(): Boolean = js.native
    def getPointerEvents(): Boolean = js.native
    def getRadialGradient(): String = js.native
    def getRgba(): Boolean = js.native
    def getTextOverflow(): String = js.native
    def getTextShadow(): Boolean = js.native
    def getUserModify(): String = js.native
    def getUserSelect(): String = js.native
    def getUserSelectNone(): String = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.CssAnimation")
class CssAnimation extends js.Object {

}
@js.native
@JSName("qx.bom.client.CssAnimation")
object CssAnimation extends js.Object {
    def getAnimationEnd(): String = js.native
    def getAnimationIteration(): String = js.native
    def getAnimationStart(): String = js.native
    def getFillMode(): String = js.native
    def getKeyFrames(): String = js.native
    def getName(): String = js.native
    def getPlayState(): String = js.native
    def getRequestAnimationFrame(): String = js.native
    def getSupport(): js.Dynamic = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.CssTransform")
class CssTransform extends js.Object {

}
@js.native
@JSName("qx.bom.client.CssTransform")
object CssTransform extends js.Object {
    def get3D(): Boolean = js.native
    def getBackFaceVisibility(): String = js.native
    def getName(): String = js.native
    def getOrigin(): String = js.native
    def getPerspective(): String = js.native
    def getPerspectiveOrigin(): String = js.native
    def getStyle(): String = js.native
    def getSupport(): js.Dynamic = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.CssTransition")
class CssTransition extends js.Object {

}
@js.native
@JSName("qx.bom.client.CssTransition")
object CssTransition extends js.Object {
    def getSupport(): js.Dynamic = js.native
    def getTransitionName(): String = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Device")
class Device extends js.Object {

}
@js.native
@JSName("qx.bom.client.Device")
object Device extends js.Object {
    def detectDeviceType(userAgentString: String): String = js.native
    def detectMobileDevice(userAgentString: String): Boolean = js.native
    def detectTabletDevice(userAgentString: String): Boolean = js.native
    def getDevicePixelRatio(): Long = js.native
    def getName(): String = js.native
    def getTouch(): Boolean = js.native
    def getType(): String = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.EcmaScript")
class EcmaScript extends js.Object {

}
@js.native
@JSName("qx.bom.client.EcmaScript")
object EcmaScript extends js.Object {
    def getArrayEvery(): Boolean = js.native
    def getArrayFilter(): Boolean = js.native
    def getArrayForEach(): Boolean = js.native
    def getArrayIndexOf(): Boolean = js.native
    def getArrayLastIndexOf(): Boolean = js.native
    def getArrayMap(): Boolean = js.native
    def getArrayReduce(): Boolean = js.native
    def getArrayReduceRight(): Boolean = js.native
    def getArraySome(): Boolean = js.native
    def getDateNow(): Boolean = js.native
    def getErrorToString(): Boolean = js.native
    def getFunctionBind(): Boolean = js.native
    def getObjectKeys(): Boolean = js.native
    def getStackTrace(): String = js.native
    def getStringTrim(): Boolean = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Engine")
class Engine extends js.Object {

}
@js.native
@JSName("qx.bom.client.Engine")
object Engine extends js.Object {
    def getName(): String = js.native
    def getVersion(): String = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Event")
class Event extends js.Object {

}
@js.native
@JSName("qx.bom.client.Event")
object Event extends js.Object {
    def getCustomEvent(): Boolean = js.native
    def getDispatchEvent(): Boolean = js.native
    def getHashChange(): Boolean = js.native
    def getHelp(): Boolean = js.native
    def getMouseEvent(): Boolean = js.native
    def getMouseWheel(win: Window = ???): js.Dynamic = js.native
    def getMsPointer(): Boolean = js.native
    def getTouch(): Boolean = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Flash")
class Flash extends js.Object {

}
@js.native
@JSName("qx.bom.client.Flash")
object Flash extends js.Object {
    def getExpressInstall(): Boolean = js.native
    def getStrictSecurityModel(): Boolean = js.native
    def getVersion(): String = js.native
    def isAvailable(): Boolean = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Html")
class Html extends js.Object {

}
@js.native
@JSName("qx.bom.client.Html")
object Html extends js.Object {
    def getAudio(): Boolean = js.native
    def getAudioAif(): String = js.native
    def getAudioAu(): String = js.native
    def getAudioMp3(): String = js.native
    def getAudioOgg(): String = js.native
    def getAudioWav(): String = js.native
    def getCanvas(): Boolean = js.native
    def getClassList(): Boolean = js.native
    def getCompareDocumentPosition(): Boolean = js.native
    def getConsole(): Boolean = js.native
    def getContains(): Boolean = js.native
    def getDataset(): Boolean = js.native
    def getDataUrl(callback: js.Function): Unit = js.native
    def getFileReader(): Boolean = js.native
    def getFullScreen(): Boolean = js.native
    def getGeoLocation(): Boolean = js.native
    def getHistoryState(): Boolean = js.native
    def getIsEqualNode(): Boolean = js.native
    def getLocalStorage(): Boolean = js.native
    def getNaturalDimensions(): Boolean = js.native
    def getSelection(): String = js.native
    def getSessionStorage(): Boolean = js.native
    def getSvg(): Boolean = js.native
    def getTextContent(): Boolean = js.native
    def getUserDataStorage(): Boolean = js.native
    def getVideo(): Boolean = js.native
    def getVideoH264(): String = js.native
    def getVideoOgg(): String = js.native
    def getVideoWebm(): String = js.native
    def getVml(): Boolean = js.native
    def getWebWorker(): Boolean = js.native
    def getXPath(): Boolean = js.native
    def getXul(): Boolean = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Locale")
class Locale extends js.Object {

}
@js.native
@JSName("qx.bom.client.Locale")
object Locale extends js.Object {
    def getLocale(): String = js.native
    def getVariant(): String = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.OperatingSystem")
class OperatingSystem extends js.Object {

}
@js.native
@JSName("qx.bom.client.OperatingSystem")
object OperatingSystem extends js.Object {
    def getName(): String = js.native
    def getVersion(): String = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Pdfjs")
class Pdfjs extends js.Object {

}
@js.native
@JSName("qx.bom.client.Pdfjs")
object Pdfjs extends js.Object {
    def getPdfjs(callback: js.Function, context: js.Any): Unit = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.PhoneGap")
class PhoneGap extends js.Object {

}
@js.native
@JSName("qx.bom.client.PhoneGap")
object PhoneGap extends js.Object {
    def getNotification(): Boolean = js.native
    def getPhoneGap(): Boolean = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Plugin")
class Plugin extends js.Object {

}
@js.native
@JSName("qx.bom.client.Plugin")
object Plugin extends js.Object {
    def getActiveX(): Boolean = js.native
    def getDivX(): Boolean = js.native
    def getDivXVersion(): String = js.native
    def getGears(): Boolean = js.native
    def getPdf(): Boolean = js.native
    def getPdfVersion(): String = js.native
    def getQuicktime(): Boolean = js.native
    def getQuicktimeVersion(): String = js.native
    def getSilverlight(): Boolean = js.native
    def getSilverlightVersion(): String = js.native
    def getSkype(): Boolean = js.native
    def getWindowsMedia(): Boolean = js.native
    def getWindowsMediaVersion(): String = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Runtime")
class Runtime extends js.Object {

}
@js.native
@JSName("qx.bom.client.Runtime")
object Runtime extends js.Object {
    def getName(): String = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Scroll")
class Scroll extends js.Object {

}
@js.native
@JSName("qx.bom.client.Scroll")
object Scroll extends js.Object {
    def getNativeScroll(): Boolean = js.native
    def scrollBarOverlayed(): Boolean = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Stylesheet")
class Stylesheet extends js.Object {

}
@js.native
@JSName("qx.bom.client.Stylesheet")
object Stylesheet extends js.Object {
    def getAddImport(): Boolean = js.native
    def getCreateStyleSheet(): Boolean = js.native
    def getDeleteRule(): Boolean = js.native
    def getInsertRule(): Boolean = js.native
    def getRemoveImport(): Boolean = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Transport")
class Transport extends js.Object {

}
@js.native
@JSName("qx.bom.client.Transport")
object Transport extends js.Object {
    def getMaxConcurrentRequestCount(): Int = js.native
    def getSsl(): Boolean = js.native
    def getXmlHttpRequest(): String = js.native

}
}
package qx.bom.client {
@js.native
@JSName("qx.bom.client.Xml")
class Xml extends js.Object {

}
@js.native
@JSName("qx.bom.client.Xml")
object Xml extends js.Object {
    def getAttributeNS(): Boolean = js.native
    def getCreateElementNS(): Boolean = js.native
    def getCreateNode(): Boolean = js.native
    def getDomParser(): Boolean = js.native
    def getDomProperties(): Boolean = js.native
    def getElementsByTagNameNS(): Boolean = js.native
    def getImplementation(): Boolean = js.native
    def getQualifiedItem(): Boolean = js.native
    def getSelectNodes(): Boolean = js.native
    def getSelectSingleNode(): Boolean = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Animation")
class Animation extends js.Object {

}
@js.native
@JSName("qx.bom.element.Animation")
object Animation extends js.Object {
    def animate(el: HTMLElement, desc: js.Any, duration: Int = ???): qx.bom.element.AnimationHandle = js.native
    def animateReverse(el: HTMLElement, desc: js.Any, duration: Int = ???): qx.bom.element.AnimationHandle = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.AnimationCss")
class AnimationCss extends js.Object {

}
@js.native
@JSName("qx.bom.element.AnimationCss")
object AnimationCss extends js.Object {
    protected def _animate(el: HTMLElement, desc: js.Any, duration: Int = ???, reverse: Boolean = ???): qx.bom.element.AnimationHandle = js.native
    def animate(el: HTMLElement, desc: js.Any, duration: Int = ???): qx.bom.element.AnimationHandle = js.native
    def animateReverse(el: HTMLElement, desc: js.Any, duration: Int = ???): qx.bom.element.AnimationHandle = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.AnimationHandle")
class AnimationHandle extends qx.event.Emitter {
    def isEnded(): Boolean = js.native
    def isPaused(): Boolean = js.native
    def isPlaying(): Boolean = js.native
    def pause(): Unit = js.native
    def play(): Unit = js.native
    def stop(): Unit = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.AnimationJs")
class AnimationJs extends js.Object {

}
@js.native
@JSName("qx.bom.element.AnimationJs")
object AnimationJs extends js.Object {
    protected def _animate(el: HTMLElement, desc: js.Any, duration: Int = ???, reverse: Boolean = ???): qx.bom.element.AnimationHandle = js.native
    def animate(el: HTMLElement, desc: js.Any, duration: Int = ???): qx.bom.element.AnimationHandle = js.native
    def animateReverse(el: HTMLElement, desc: js.Any, duration: Int = ???): qx.bom.element.AnimationHandle = js.native
    def pause(handle: qx.bom.element.AnimationHandle): qx.bom.element.AnimationHandle = js.native
    def play(handle: qx.bom.element.AnimationHandle): qx.bom.element.AnimationHandle = js.native
    def stop(handle: qx.bom.element.AnimationHandle): qx.bom.element.AnimationHandle = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Attribute")
class Attribute extends js.Object {

}
@js.native
@JSName("qx.bom.element.Attribute")
object Attribute extends js.Object {
    def compile(map: js.Any): String = js.native
    def get(element: HTMLElement, name: String): js.Dynamic = js.native
    def reset(element: HTMLElement, name: String): Unit = js.native
    def set(element: HTMLElement, name: String, value: js.Any): Unit = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Background")
class Background extends js.Object {

}
@js.native
@JSName("qx.bom.element.Background")
object Background extends js.Object {
    def compile(source: String = ???, repeat: String = ???, left: Int = ???, top: Int = ???): String = js.native
    def getStyles(source: String, repeat: String = ???, left: Int = ???, top: Int = ???): js.Dynamic = js.native
    def set(element: HTMLElement, source: String = ???, repeat: String = ???, left: Int = ???, top: Int = ???): Unit = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.BoxSizing")
class BoxSizing extends js.Object {

}
@js.native
@JSName("qx.bom.element.BoxSizing")
object BoxSizing extends js.Object {
    def compile(value: String): String = js.native
    def get(element: HTMLElement): String = js.native
    def reset(element: HTMLElement): Unit = js.native
    def set(element: HTMLElement, value: String): Unit = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Class")
class Class extends js.Object {

}
@js.native
@JSName("qx.bom.element.Class")
object Class extends js.Object {
    def add(element: HTMLElement, name: String): String = js.native
    def addClasses(element: HTMLElement, classes: js.Array[String]): String = js.native
    def get(element: HTMLElement): String = js.native
    def has(element: HTMLElement, name: String): Boolean = js.native
    def remove(element: HTMLElement, name: String): String = js.native
    def removeClasses(element: HTMLElement, classes: js.Array[String]): String = js.native
    def replace(element: HTMLElement, oldName: String, newName: String): String = js.native
    def toggle(element: HTMLElement, name: String, toggle: Boolean = ???): String = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Clip")
class Clip extends js.Object {

}
@js.native
@JSName("qx.bom.element.Clip")
object Clip extends js.Object {
    def compile(map: js.Any): String = js.native
    def get(element: HTMLElement, mode: Long): js.Dynamic = js.native
    def reset(element: HTMLElement): Unit = js.native
    def set(element: HTMLElement, map: js.Any): Unit = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Cursor")
class Cursor extends js.Object {

}
@js.native
@JSName("qx.bom.element.Cursor")
object Cursor extends js.Object {
    def compile(cursor: String): String = js.native
    def get(element: HTMLElement, mode: Long): String = js.native
    def reset(element: HTMLElement): Unit = js.native
    def set(element: HTMLElement, value: String): Unit = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Dataset")
class Dataset extends js.Object {

}
@js.native
@JSName("qx.bom.element.Dataset")
object Dataset extends js.Object {
    def get(element: HTMLElement, name: String): js.Dynamic = js.native
    def getAll(element: HTMLElement): js.Dynamic = js.native
    def hasData(element: HTMLElement): Boolean = js.native
    def remove(element: HTMLElement, name: String): Unit = js.native
    def set(element: HTMLElement, name: String, value: js.Any): Unit = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Decoration")
class Decoration extends js.Object {

}
@js.native
@JSName("qx.bom.element.Decoration")
object Decoration extends js.Object {
    def create(source: String, repeat: String, style: js.Any): String = js.native
    def getAttributes(source: String, repeat: String, style: js.Any): String = js.native
    def getTagName(repeat: String, source: String = ???): String = js.native
    def processAlphaFix(style: js.Any, repeat: String, source: String): js.Dynamic = js.native
    def update(element: HTMLElement, source: String, repeat: String, style: js.Any): Unit = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Dimension")
class Dimension extends js.Object {

}
@js.native
@JSName("qx.bom.element.Dimension")
object Dimension extends js.Object {
    protected def _getBoundingClientRect(element: HTMLElement): js.Dynamic = js.native
    def getContentHeight(element: HTMLElement): Int = js.native
    def getContentSize(element: HTMLElement): js.Dynamic = js.native
    def getContentWidth(element: HTMLElement): Int = js.native
    def getHeight(element: HTMLElement): Int = js.native
    def getSize(element: HTMLElement): js.Dynamic = js.native
    def getWidth(element: HTMLElement): Int = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Location")
class Location extends js.Object {

}
@js.native
@JSName("qx.bom.element.Location")
object Location extends js.Object {
    def get(elem: HTMLElement, mode: String = ???): js.Dynamic = js.native
    def getBottom(elem: HTMLElement, mode: String): Int = js.native
    def getLeft(elem: HTMLElement, mode: String): Int = js.native
    def getOffsetParent(element: HTMLElement): HTMLElement = js.native
    def getPosition(elem: HTMLElement): js.Dynamic = js.native
    def getRelative(elem1: HTMLElement, elem2: HTMLElement, mode1: String = ???, mode2: String = ???): js.Dynamic = js.native
    def getRight(elem: HTMLElement, mode: String): Int = js.native
    def getTop(elem: HTMLElement, mode: String): Int = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Opacity")
class Opacity extends js.Object {

}
@js.native
@JSName("qx.bom.element.Opacity")
object Opacity extends js.Object {
    def compile(opacity: Float): String = js.native
    def get(element: HTMLElement, mode: Long): Float = js.native
    def reset(element: HTMLElement): Unit = js.native
    def set(element: HTMLElement, opacity: Float): Unit = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Scroll")
class Scroll extends js.Object {

}
@js.native
@JSName("qx.bom.element.Scroll")
object Scroll extends js.Object {
    def getScrollbarWidth(): Long = js.native
    def intoView(element: HTMLElement, stop: HTMLElement = ???, alignX: String = ???, alignY: String = ???): Unit = js.native
    def intoViewX(element: HTMLElement, stop: HTMLElement = ???, align: String = ???): Unit = js.native
    def intoViewY(element: HTMLElement, stop: HTMLElement = ???, align: String = ???): Unit = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Style")
class Style extends js.Object {

}
@js.native
@JSName("qx.bom.element.Style")
object Style extends js.Object {
    def compile(map: js.Any): String = js.native
    def get(element: HTMLElement, name: String, mode: Long, smart: Boolean = ???): js.Dynamic = js.native
    def getCss(element: HTMLElement): String = js.native
    def isPropertySupported(propertyName: String): Boolean = js.native
    def reset(element: HTMLElement, name: String, smart: Boolean = ???): Unit = js.native
    def set(element: HTMLElement, name: String, value: js.Any, smart: Boolean = ???): Unit = js.native
    def setCss(element: HTMLElement, value: String): Unit = js.native
    def setStyles(element: HTMLElement, styles: js.Any, smart: Boolean = ???): Unit = js.native

}
}
package qx.bom.element {
@js.native
@JSName("qx.bom.element.Transform")
class Transform extends js.Object {

}
@js.native
@JSName("qx.bom.element.Transform")
object Transform extends js.Object {
    protected def _compute3dProperty(property: String, params: qx.data.Array): String = js.native
    protected def _computeAxisProperties(property: String, params: qx.data.Array): String = js.native
    def getBackfaceVisibility(el: HTMLElement): Boolean = js.native
    def getCss(transforms: js.Any): String = js.native
    def getOrigin(el: HTMLElement): String = js.native
    def getPerspective(el: HTMLElement): String = js.native
    def getPerspectiveOrigin(el: HTMLElement): String = js.native
    def getStyle(el: HTMLElement): String = js.native
    def getTransformValue(transforms: js.Any): String = js.native
    def rotate(el: HTMLElement, value: String): Unit = js.native
    def scale(el: HTMLElement, value: Long): Unit = js.native
    def setBackfaceVisibility(el: HTMLElement, value: Boolean): Unit = js.native
    def setOrigin(el: HTMLElement, value: String): Unit = js.native
    def setPerspective(el: HTMLElement, value: Long): Unit = js.native
    def setPerspectiveOrigin(el: HTMLElement, value: String): Unit = js.native
    def setStyle(el: HTMLElement, value: String): Unit = js.native
    def skew(el: HTMLElement, value: String): Unit = js.native
    def transform(el: HTMLElement, transforms: js.Any): Unit = js.native
    def translate(el: HTMLElement, value: String): Unit = js.native

}
}
package qx.bom.media {
@js.native
@JSName("qx.bom.media.Abstract")
class Abstract protected () extends qx.core.Object {
    def this(media: js.Any = ???) = this()
    protected def _handleEndedEvent(): Unit = js.native
    protected def _handleLoadedDataEvent(): Unit = js.native
    protected def _handleLoadedMetaDataEvent(): Unit = js.native
    protected def _handlePauseEvent(): Unit = js.native
    protected def _handlePlayEvent(): Unit = js.native
    protected def _handleTimeUpdateEvent(): Unit = js.native
    protected def _handleVolumeChangeEvent(): Unit = js.native
    def canPlayType(`type`: String): Boolean = js.native
    def getAutoplay(): Boolean = js.native
    def getCurrentTime(): Long = js.native
    def getDuration(): Long = js.native
    def getId(): String = js.native
    def getMediaObject(): js.Dynamic = js.native
    def getPreload(): String = js.native
    def getSource(): String = js.native
    def getVolume(): Long = js.native
    def hasControls(): Boolean = js.native
    def hideControls(): Unit = js.native
    def isEnded(): Boolean = js.native
    def isLoop(): Boolean = js.native
    def isMuted(): Boolean = js.native
    def isPaused(): Boolean = js.native
    def pause(): Unit = js.native
    def play(): Unit = js.native
    def setAutoplay(autoplay: Boolean): Unit = js.native
    def setCurrentTime(value: Long): Unit = js.native
    def setId(id: String): Unit = js.native
    def setLoop(value: Boolean): Unit = js.native
    def setMuted(muted: Boolean): Unit = js.native
    def setPreload(preload: String): Unit = js.native
    def setSource(source: String): Unit = js.native
    def setVolume(volume: Long): Unit = js.native
    def showControls(): Unit = js.native

}
}
package qx.bom.media {
@js.native
@JSName("qx.bom.media.Audio")
class Audio protected () extends qx.bom.media.Abstract {
    def this(source: String = ???) = this()

}
}
package qx.bom.media {
@js.native
@JSName("qx.bom.media.Video")
class Video protected () extends qx.bom.media.Abstract {
    def this(source: String = ???) = this()
    def getHeight(): Long = js.native
    def getPoster(): String = js.native
    def getVideoHeight(): Long = js.native
    def getVideoWidth(): Long = js.native
    def getWidth(): Long = js.native
    def setHeight(value: Long): Unit = js.native
    def setPoster(value: String): Unit = js.native
    def setWidth(value: Long): Unit = js.native

}
}
package qx.bom.request {
@js.native
trait IRequest extends js.Object {
    def abort(): Unit = js.native
    def getAllResponseHeaders(): String = js.native
    def getResponseHeader(header: String): String = js.native
    def onabort(): Unit = js.native
    def onerror(): Unit = js.native
    def onload(): Unit = js.native
    def onloadend(): Unit = js.native
    def onreadystatechange(): Unit = js.native
    def ontimeout(): Unit = js.native
    def open(method: String, url: String, async: Boolean = ???): Unit = js.native
    def send(data: String = ???): Unit = js.native
    def setRequestHeader(key: String, value: String): Unit = js.native

}
}
package qx.bom.request {
@js.native
@JSName("qx.bom.request.Jsonp")
class Jsonp extends qx.bom.request.Script {
    def callback(data: js.Any): Unit = js.native
    def getGeneratedUrl(): String = js.native
    def setCallbackName(name: String): qx.bom.request.Jsonp = js.native
    def setCallbackParam(param: String): qx.bom.request.Jsonp = js.native
    def setPrefix(prefix: String): Unit = js.native

}
}
package qx.bom.request {
@js.native
@JSName("qx.bom.request.Script")
class Script extends js.Object {
    protected def _emit(event: String): Unit = js.native
    protected def _getScriptElement(): HTMLElement = js.native
    protected def _getUrl(): String = js.native
    protected def _onNativeError(): Unit = js.native
    protected def _onNativeLoad(): Unit = js.native
    protected def _onTimeout(): Unit = js.native
    protected def _readyStateChange(readyState: Long): Unit = js.native
    protected def _success(): Unit = js.native
    def abort(): qx.bom.request.Script = js.native
    def dispose(): Unit = js.native
    def getAllResponseHeaders(): String = js.native
    def getResponseHeader(key: String): String = js.native
    def isDisposed(): Boolean = js.native
    def on(name: String, listener: js.Function, ctx: js.Any = ???): qx.bom.request.Script = js.native
    def onabort(): Unit = js.native
    def onerror(): Unit = js.native
    def onload(): Unit = js.native
    def onloadend(): Unit = js.native
    def onreadystatechange(): Unit = js.native
    def ontimeout(): Unit = js.native
    def open(method: String, url: String): Unit = js.native
    def send(): qx.bom.request.Script = js.native
    def setDetermineSuccess(check: js.Function): Unit = js.native
    def setRequestHeader(key: String, value: String): qx.bom.request.Script = js.native

}
}
package qx.bom.request {
@js.native
@JSName("qx.bom.request.SimpleXhr")
class SimpleXhr protected () extends qx.event.Emitter {
    def this(url: String = ???, method: String = ???) = this()
    protected def _createResponseParser(): qx.util.ResponseParser = js.native
    protected def _createTransport(): qx.bom.request.IRequest = js.native
    protected def _onAbort(): Unit = js.native
    protected def _onError(): Unit = js.native
    protected def _onLoadEnd(): Unit = js.native
    protected def _onReadyStateChange(): Unit = js.native
    protected def _onTimeout(): Unit = js.native
    protected def _registerTransportListener(transport: qx.bom.request.IRequest): qx.bom.request.IRequest = js.native
    protected def _serializeData(data: String, contentType: String = ???): String = js.native
    protected def _setResponse(response: String): Unit = js.native
    def abort(): qx.bom.request.SimpleXhr = js.native
    def dispose(): Boolean = js.native
    def getAllResponseHeaders(): String = js.native
    def getMethod(): String = js.native
    def getRequestData(): String = js.native
    def getRequestHeader(key: String): String = js.native
    def getResponse(): String = js.native
    def getResponseHeader(header: String): String = js.native
    def getTimeout(): Long = js.native
    def getTransport(): js.Dynamic = js.native
    def getUrl(): String = js.native
    def isCaching(): Boolean = js.native
    def isDisposed(): Boolean = js.native
    def isDone(): Boolean = js.native
    def send(): Unit = js.native
    def setMethod(method: String): qx.bom.request.SimpleXhr = js.native
    def setParser(parser: String): js.Function = js.native
    def setRequestData(data: String): qx.bom.request.SimpleXhr = js.native
    def setRequestHeader(key: String, value: String): qx.bom.request.SimpleXhr = js.native
    def setTimeout(millis: Long): qx.bom.request.SimpleXhr = js.native
    def setUrl(url: String): qx.bom.request.SimpleXhr = js.native
    def toHashCode(): Int = js.native
    def useCaching(value: Boolean): qx.bom.request.SimpleXhr = js.native

}
}
package qx.bom.request {
@js.native
@JSName("qx.bom.request.Xhr")
class Xhr extends js.Object {
    protected def _createNativeXhr(): js.Dynamic = js.native
    protected def _emit(event: String): Unit = js.native
    protected def _getProtocol(): String = js.native
    def abort(): qx.bom.request.Xhr = js.native
    def dispose(): Boolean = js.native
    def getAllResponseHeaders(): String = js.native
    def getRequest(): js.Dynamic = js.native
    def getResponseHeader(header: String): String = js.native
    def isDisposed(): Boolean = js.native
    def on(name: String, listener: js.Function, ctx: js.Any = ???): qx.bom.request.Xhr = js.native
    def onabort(): Unit = js.native
    def onerror(): Unit = js.native
    def onload(): Unit = js.native
    def onloadend(): Unit = js.native
    def onreadystatechange(): Unit = js.native
    def ontimeout(): Unit = js.native
    def open(method: String = ???, url: String = ???, async: Boolean = ???, user: String = ???, password: String = ???): Unit = js.native
    def overrideMimeType(mimeType: String): qx.bom.request.Xhr = js.native
    def send(data: String = ???): qx.bom.request.Xhr = js.native
    def setRequestHeader(key: String, value: String): qx.bom.request.Xhr = js.native

}
}
package qx.bom.rest {
@js.native
@JSName("qx.bom.rest.Resource")
class Resource protected () extends qx.event.Emitter {
    def this(description: js.Any = ???) = this()
    protected def _getRequest(): qx.bom.request.SimpleXhr = js.native
    protected def _getRequestConfig(action: String, params: js.Any): js.Dynamic = js.native
    protected def _getRequestHandler(): js.Dynamic = js.native
    protected def _getThrottleCount(): Int = js.native
    protected def _getThrottleLimit(): Int = js.native
    protected def _startPoll(action: String, listener: js.Function, interval: Long): Unit = js.native
    def abort(varargs: String = ???): Unit = js.native
    def configureRequest(callback: js.Function): Unit = js.native
    def destruct(): Unit = js.native
    def dispose(): Unit = js.native
    def getRequestsByAction(action: String): qx.data.Array = js.native
    def invoke(action: String, params: js.Any, data: js.Any): Long = js.native
    def isDisposed(): Boolean = js.native
    def longPoll(action: String): String = js.native
    def map(action: String, method: String, url: String, check: js.Any = ???): Unit = js.native
    def poll(action: String, interval: Long, params: js.Any = ???, immediately: Boolean = ???): Unit = js.native
    def refresh(action: String): Unit = js.native
    def restartPollByAction(action: String): Unit = js.native
    def setBaseUrl(baseUrl: String): Unit = js.native
    def setRequestFactory(fn: js.Function): Unit = js.native
    def setRequestHandler(handler: js.Any): Unit = js.native
    def stopPollByAction(action: String): Unit = js.native

}
@js.native
@JSName("qx.bom.rest.Resource")
object Resource extends js.Object {
    def placeholdersFromUrl(url: String): qx.data.Array = js.native

}
}
package qx.bom.storage {
@js.native
@JSName("qx.bom.storage.Memory")
class Memory extends js.Object {
    def clear(): Unit = js.native
    def forEach(callback: js.Function, scope: js.Any): Unit = js.native
    def getItem(key: String): js.Dynamic = js.native
    def getKey(index: Int): String = js.native
    def getLength(): Int = js.native
    def getStorage(): js.Dynamic = js.native
    def removeItem(key: String): Unit = js.native
    def setItem(key: String, value: js.Any): Unit = js.native

}
@js.native
@JSName("qx.bom.storage.Memory")
object Memory extends js.Object {
    def getLocal(): qx.bom.storage.Memory = js.native
    def getSession(): qx.bom.storage.Memory = js.native

}
}
package qx.bom.storage {
@js.native
@JSName("qx.bom.storage.UserData")
class UserData protected () extends js.Object {
    def this(storeName: String = ???) = this()
    def clear(): Unit = js.native
    def forEach(callback: js.Function, scope: js.Any): Unit = js.native
    def getItem(key: String): js.Dynamic = js.native
    def getKey(index: Int): String = js.native
    def getLength(): Int = js.native
    def getStorage(): js.Dynamic = js.native
    def removeItem(key: String): Unit = js.native
    def setItem(key: String, value: js.Any): Unit = js.native

}
@js.native
@JSName("qx.bom.storage.UserData")
object UserData extends js.Object {
    def getLocal(): qx.bom.storage.UserData = js.native
    def getSession(): qx.bom.storage.UserData = js.native

}
}
package qx.bom.storage {
@js.native
@JSName("qx.bom.storage.Web")
class Web protected () extends js.Object {
    def this(`type`: String = ???) = this()
    def clear(): Unit = js.native
    def forEach(callback: js.Function, scope: js.Any): Unit = js.native
    def getItem(key: String): js.Dynamic = js.native
    def getKey(index: Int): String = js.native
    def getLength(): Int = js.native
    def getStorage(): js.Dynamic = js.native
    def removeItem(key: String): Unit = js.native
    def setItem(key: String, value: js.Any): Unit = js.native

}
@js.native
@JSName("qx.bom.storage.Web")
object Web extends js.Object {
    def getLocal(): qx.bom.storage.Web = js.native
    def getSession(): qx.bom.storage.Web = js.native

}
}
package qx.bom.webfonts {
@js.native
@JSName("qx.bom.webfonts.Manager")
class Manager extends qx.core.Object {
    def getPreferredFormats(): js.Array[String] = js.native
    def remove(familyName: String): Unit = js.native
    def removeStyleSheet(): Unit = js.native
    def require(familyName: String, sourcesList: js.Array[String], callback: js.Function = ???, context: js.Any = ???): Unit = js.native

}
@js.native
@JSName("qx.bom.webfonts.Manager")
object Manager extends js.Object {
    def getInstance(): qx.bom.webfonts.Manager = js.native

}
}
package qx.bom.webfonts {
@js.native
@JSName("qx.bom.webfonts.Validator")
class Validator protected () extends qx.core.Object {
    def this(fontFamily: String = ???) = this()
    protected def _applyFontFamily(value: js.Any, old: js.Any): Unit = js.native
    protected def _getHelperElement(fontFamily: String): HTMLElement = js.native
    protected def _getRequestedHelpers(): js.Dynamic = js.native
    protected def _isFontValid(): Boolean = js.native
    protected def _reset(): Unit = js.native
    def getFontFamily(): js.Dynamic = js.native
    def getTimeout(): Int = js.native
    protected def initFontFamily(value: js.Any): js.Dynamic = js.native
    protected def initTimeout(value: js.Any): Int = js.native
    def resetFontFamily(): Unit = js.native
    def resetTimeout(): Unit = js.native
    def setFontFamily(value: js.Any): js.Dynamic = js.native
    def setTimeout(value: js.Any): Int = js.native
    def validate(): Unit = js.native

}
@js.native
@JSName("qx.bom.webfonts.Validator")
object Validator extends js.Object {
    def removeDefaultHelperElements(): Unit = js.native

}
}
package qx.bom.webfonts {
@js.native
@JSName("qx.bom.webfonts.WebFont")
class WebFont extends qx.bom.Font {
    protected def _applySources(value: js.Any, old: js.Any): Unit = js.native
    protected def _onWebFontChangeStatus(ev: qx.event.`type`.Data): Unit = js.native
    protected def _quoteFontFamily(familyName: String): String = js.native
    def getSources(): js.Dynamic = js.native
    protected def initSources(value: js.Any): js.Dynamic = js.native
    def resetSources(): Unit = js.native
    def setSources(value: js.Any): js.Dynamic = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.Aspect")
class Aspect extends js.Object {

}
@js.native
@JSName("qx.core.Aspect")
object Aspect extends js.Object {
    def addAdvice(fcn: js.Function, position: String = ???, `type`: String = ???, name: String = ???): Unit = js.native
    def wrap(fullName: String, fcn: js.Function, `type`: String): js.Function = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.Assert")
class Assert extends js.Object {

}
@js.native
@JSName("qx.core.Assert")
object Assert extends js.Object {
    def assert(condition: js.Any, msg: String): Unit = js.native
    def assertArgumentsCount(args: js.Any, minCount: Int, maxCount: Int, msg: String): Unit = js.native
    def assertArray(value: js.Any, msg: String): Unit = js.native
    def assertArrayEquals(expected: qx.data.Array, found: qx.data.Array, msg: String): Unit = js.native
    def assertBoolean(value: js.Any, msg: String): Unit = js.native
    def assertCssColor(expected: String, value: String, msg: String): Unit = js.native
    def assertElement(value: js.Any, msg: String): Unit = js.native
    def assertEquals(expected: js.Any, found: js.Any, msg: String): Unit = js.native
    def assertEventFired(obj: js.Any, event: String, invokeFunc: js.Function, listenerFunc: js.Function = ???, msg: String = ???): Unit = js.native
    def assertEventNotFired(obj: js.Any, event: String, invokeFunc: js.Function, msg: String): Unit = js.native
    def assertException(callback: js.Function, exception: js.Error = ???, re: String = ???, msg: String = ???): Unit = js.native
    def assertFalse(value: Boolean, msg: String): Unit = js.native
    def assertFunction(value: js.Any, msg: String): Unit = js.native
    def assertIdentical(expected: js.Any, found: js.Any, msg: String): Unit = js.native
    def assertInArray(value: js.Any, array: qx.data.Array, msg: String): Unit = js.native
    def assertInRange(value: js.Any, min: Long, max: Long, msg: String): Unit = js.native
    def assertInstance(value: js.Any, clazz: qx.Class, msg: String): Unit = js.native
    def assertInteger(value: js.Any, msg: String): Unit = js.native
    def assertInterface(value: js.Any, iface: qx.Class, msg: String): Unit = js.native
    def assertJsonEquals(expected: js.Any, found: js.Any, msg: String): Unit = js.native
    def assertKeyInMap(value: js.Any, map: js.Any, msg: String): Unit = js.native
    def assertMap(value: js.Any, msg: String): Unit = js.native
    def assertMatch(str: String, re: String, msg: String): Unit = js.native
    def assertNotEquals(expected: js.Any, found: js.Any, msg: String): Unit = js.native
    def assertNotIdentical(expected: js.Any, found: js.Any, msg: String): Unit = js.native
    def assertNotNull(value: js.Any, msg: String): Unit = js.native
    def assertNotUndefined(value: js.Any, msg: String): Unit = js.native
    def assertNull(value: js.Any, msg: String): Unit = js.native
    def assertNumber(value: js.Any, msg: String): Unit = js.native
    def assertObject(value: js.Any, msg: String): Unit = js.native
    def assertPositiveInteger(value: js.Any, msg: String): Unit = js.native
    def assertPositiveNumber(value: js.Any, msg: String): Unit = js.native
    def assertQxObject(value: js.Any, msg: String): Unit = js.native
    def assertQxWidget(value: js.Any, msg: String): Unit = js.native
    def assertRegExp(value: js.Any, msg: String): Unit = js.native
    def assertString(value: js.Any, msg: String): Unit = js.native
    def assertTrue(value: Boolean, msg: String): Unit = js.native
    def assertType(value: js.Any, `type`: String, msg: String): Unit = js.native
    def assertUndefined(value: js.Any, msg: String): Unit = js.native
    def fail(msg: String, compact: Boolean): Unit = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.AssertionError")
class AssertionError protected () extends qx.`type`.BaseError {
    def this(comment: String = ???, failMessage: String = ???) = this()
    def getStackTrace(): js.Array[String] = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.BaseInit")
class BaseInit extends js.Object {

}
@js.native
@JSName("qx.core.BaseInit")
object BaseInit extends js.Object {
    def getApplication(): qx.core.Object = js.native
    def ready(): Unit = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.Environment")
class Environment extends js.Object {

}
@js.native
@JSName("qx.core.Environment")
object Environment extends js.Object {
    protected def _getClassNameFromEnvKey(key: String): qx.data.Array = js.native
    protected def _initDefaultQxValues(): Unit = js.native
    def add(key: String, check: js.Any): Unit = js.native
    def addAsync(key: String, check: js.Function): Unit = js.native
    def filter(map: js.Any): qx.data.Array = js.native
    def get(key: String): js.Dynamic = js.native
    def getAsync(key: String, callback: js.Function, self: js.Any): Unit = js.native
    def getAsyncChecks(): js.Dynamic = js.native
    def getChecks(): js.Dynamic = js.native
    def invalidateCacheKey(key: String): Unit = js.native
    def select(key: String, values: js.Any): js.Dynamic = js.native
    def selectAsync(key: String, values: js.Any, self: js.Any): Unit = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.GlobalError")
class GlobalError protected () extends js.Error {
    def this(exc: js.Error = ???, args: qx.data.Array = ???) = this()
    def getArguments(): js.Dynamic = js.native
    def getSourceException(): js.Error = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.Init")
class Init extends js.Object {

}
@js.native
@JSName("qx.core.Init")
object Init extends js.Object {

}
}
package qx.core {
@js.native
@JSName("qx.core.MAssert")
trait MAssert extends js.Object {
    def assert(condition: js.Any, msg: String): Unit = js.native
    def assertArgumentsCount(args: js.Any, minCount: Int, maxCount: Int, msg: String): Unit = js.native
    def assertArray(value: js.Any, msg: String): Unit = js.native
    def assertArrayEquals(expected: qx.data.Array, found: qx.data.Array, msg: String): Unit = js.native
    def assertBoolean(value: js.Any, msg: String): Unit = js.native
    def assertCssColor(expected: String, value: String, msg: String): Unit = js.native
    def assertElement(value: js.Any, msg: String): Unit = js.native
    def assertEquals(expected: js.Any, found: js.Any, msg: String): Unit = js.native
    def assertEventFired(obj: js.Any, event: String, invokeFunc: js.Function, listener: js.Function = ???, msg: String = ???): Unit = js.native
    def assertEventNotFired(obj: js.Any, event: String, invokeFunc: js.Function, msg: String): Unit = js.native
    def assertException(callback: js.Function, exception: js.Error = ???, re: String = ???, msg: String = ???): Unit = js.native
    def assertFalse(value: Boolean, msg: String): Unit = js.native
    def assertFunction(value: js.Any, msg: String): Unit = js.native
    def assertIdentical(expected: js.Any, found: js.Any, msg: String): Unit = js.native
    def assertInArray(value: js.Any, array: qx.data.Array, msg: String): Unit = js.native
    def assertInRange(value: js.Any, min: Long, max: Long, msg: String): Unit = js.native
    def assertInstance(value: js.Any, clazz: qx.Class, msg: String): Unit = js.native
    def assertInteger(value: js.Any, msg: String): Unit = js.native
    def assertInterface(value: js.Any, iface: qx.Class, msg: String): Unit = js.native
    def assertJsonEquals(expected: js.Any, found: js.Any, msg: String): Unit = js.native
    def assertKeyInMap(value: js.Any, map: js.Any, msg: String): Unit = js.native
    def assertMap(value: js.Any, msg: String): Unit = js.native
    def assertMatch(str: String, re: js.RegExp, msg: String): Unit = js.native
    def assertNotEquals(expected: js.Any, found: js.Any, msg: String): Unit = js.native
    def assertNotIdentical(expected: js.Any, found: js.Any, msg: String): Unit = js.native
    def assertNotNull(value: js.Any, msg: String): Unit = js.native
    def assertNotUndefined(value: js.Any, msg: String): Unit = js.native
    def assertNull(value: js.Any, msg: String): Unit = js.native
    def assertNumber(value: js.Any, msg: String): Unit = js.native
    def assertObject(value: js.Any, msg: String): Unit = js.native
    def assertPositiveInteger(value: js.Any, msg: String): Unit = js.native
    def assertPositiveNumber(value: js.Any, msg: String): Unit = js.native
    def assertQxObject(value: js.Any, msg: String): Unit = js.native
    def assertQxWidget(value: js.Any, msg: String): Unit = js.native
    def assertRegExp(value: js.Any, msg: String): Unit = js.native
    def assertString(value: js.Any, msg: String): Unit = js.native
    def assertTrue(value: Boolean, msg: String): Unit = js.native
    def assertType(value: js.Any, `type`: String, msg: String): Unit = js.native
    def assertUndefined(value: js.Any, msg: String): Unit = js.native
    def fail(msg: String, compact: Boolean): Unit = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.MBindTo")
trait MBindTo extends js.Object {
    def bindTo(func: js.Function, varargs: js.Any = ???): js.Function = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.MEvent")
trait MEvent extends js.Object {
    def addListener(`type`: String, listener: js.Function, self: js.Any = ???, capture: Boolean = ???): String = js.native
    def addListenerOnce(`type`: String, listener: js.Function, self: js.Any = ???, capture: Boolean = ???): String = js.native
    def dispatchEvent(evt: qx.event.`type`.Event): Boolean = js.native
    def fireDataEvent(`type`: String, data: js.Any, oldData: js.Any = ???, cancelable: Boolean = ???): Boolean = js.native
    def fireEvent(`type`: String, clazz: qx.Class = ???, args: qx.data.Array = ???): Boolean = js.native
    def fireNonBubblingEvent(`type`: String, clazz: qx.Class = ???, args: qx.data.Array = ???): Boolean = js.native
    def hasListener(`type`: String, capture: Boolean = ???): Boolean = js.native
    def removeListener(`type`: String, listener: js.Function, self: js.Any = ???, capture: Boolean = ???): Boolean = js.native
    def removeListenerById(id: String): Boolean = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.MLogging")
trait MLogging extends js.Object {
    def debug(varargs: js.Any = ???): Unit = js.native
    def error(varargs: js.Any = ???): Unit = js.native
    def info(varargs: js.Any = ???): Unit = js.native
    def trace(): Unit = js.native
    def warn(varargs: js.Any = ???): Unit = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.MProperty")
trait MProperty extends js.Object {
    def get(prop: String): js.Dynamic = js.native
    def reset(prop: String): Unit = js.native
    def set(data: js.Any, value: js.Any = ???): js.Dynamic = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.Object")
class Object extends js.Object with qx.core.MEvent with qx.core.MAssert with qx.core.MProperty with qx.core.MLogging with qx.data.MBinding {
    protected def _disposeArray(field: String): Unit = js.native
    protected def _disposeMap(field: String): Unit = js.native
    protected def _disposeObjects(varargs: js.Any = ???): Unit = js.native
    protected def _disposeSingletonObjects(varargs: js.Any = ???): Unit = js.native
    def base(args: js.Any, varargs: js.Any = ???): js.Dynamic = js.native
	override def clone(): qx.core.Object = js.native
    def dispose(): Unit = js.native
    def getUserData(key: String): js.Dynamic = js.native
    def isDisposed(): Boolean = js.native
    def self(args: js.Any): js.Dynamic = js.native
    def setUserData(key: String, value: js.Any): Unit = js.native
    def toHashCode(): Int = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.ObjectRegistry")
class ObjectRegistry extends js.Object {

}
@js.native
@JSName("qx.core.ObjectRegistry")
object ObjectRegistry extends js.Object {
    def clearHashCode(obj: js.Any): Unit = js.native
    def fromHashCode(hash: String): qx.core.Object = js.native
    def getNextHash(): Int = js.native
    def getPostId(): Int = js.native
    def getRegistry(): js.Dynamic = js.native
    def getStackTraces(): js.Dynamic = js.native
    def register(obj: js.Any): Unit = js.native
    def shutdown(): Unit = js.native
    def toHashCode(obj: js.Any): String = js.native
    def unregister(obj: js.Any): Unit = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.Property")
class Property extends js.Object {

}
@js.native
@JSName("qx.core.Property")
object Property extends js.Object {
    def attachMethods(clazz: qx.Class, name: String, config: js.Any): Unit = js.native
    def attachRefreshInheritables(clazz: qx.Class): Unit = js.native
    def error(obj: qx.core.Object, id: Int, property: String, variant: String, value: js.Any): Unit = js.native
    def executeOptimizedGetter(instance: js.Any, clazz: qx.Class, name: String, variant: String): js.Dynamic = js.native
    def executeOptimizedSetter(instance: js.Any, clazz: qx.Class, name: String, variant: String, args: js.Any): js.Dynamic = js.native

}
}
package qx.core {
@js.native
@JSName("qx.core.ValidationError")
class ValidationError extends qx.`type`.BaseError {

}
}
package qx.core {
@js.native
@JSName("qx.core.WindowError")
class WindowError protected () extends js.Error {
    def this(failMessage: String = ???, uri: String = ???, lineNumber: Int = ???) = this()
    def getLineNumber(): Int = js.native
    def getUri(): String = js.native

}
}
package qx.data {
@js.native
@JSName("qx.data.Array")
class Array protected () extends qx.core.Object with qx.data.IListData with qx.data.marshal.MEventBubbling {
    override def contains(item: js.Any): Boolean = js.native
    override def getItem(index: Long): js.Dynamic = js.native
    override def getLength(): Long = js.native
    override def setItem(index: Long, item: js.Any): Unit = js.native
    override def splice(startIndex: Int, amount: Int, varargs: js.Any = ???): qx.data.Array = js.native
    override def toArray(): qx.data.Array = js.native
    def this(param: js.Any = ???) = this()
    def append(array: qx.data.Array): Unit = js.native
    def concat(array: qx.data.Array): qx.data.Array = js.native
    def copy(): qx.data.Array = js.native
    def equals(array: qx.data.Array): Boolean = js.native
    def every(callback: js.Function, self: js.Any = ???): Boolean = js.native
    def filter(callback: js.Function, self: js.Any = ???): qx.data.Array = js.native
    def forEach(callback: js.Function, context: js.Any): Unit = js.native
    def getAutoDisposeItems(): Boolean = js.native
    def indexOf(item: js.Any): Long = js.native
    protected def initAutoDisposeItems(value: js.Any): Boolean = js.native
    def insertAfter(after: js.Any, item: js.Any): Unit = js.native
    def insertAt(index: Int, item: js.Any): Unit = js.native
    def insertBefore(before: js.Any, item: js.Any): Unit = js.native
    def isAutoDisposeItems(): Boolean = js.native
    def join(connector: String): String = js.native
    def lastIndexOf(item: js.Any): Long = js.native
    def map(callback: js.Function, self: js.Any = ???): qx.data.Array = js.native
    def max(): Long = js.native
    def min(): Long = js.native
    def pop(): js.Dynamic = js.native
    def push(varargs: js.Any = ???): Long = js.native
    def reduce(callback: js.Function, initValue: js.Any = ???): js.Dynamic = js.native
    def reduceRight(callback: js.Function, initValue: js.Any = ???): js.Dynamic = js.native
    def remove(item: js.Any): js.Dynamic = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(index: Int): js.Dynamic = js.native
    def resetAutoDisposeItems(): Unit = js.native
    def reverse(): Unit = js.native
    def setAutoDisposeItems(value: js.Any): Boolean = js.native
    def shift(): js.Dynamic = js.native
    def slice(from: Long, to: Long = ???): qx.data.Array = js.native
    def some(callback: js.Function, self: js.Any = ???): Boolean = js.native
    def sort(func: js.Function): Unit = js.native
    def sum(): Long = js.native
    def toggleAutoDisposeItems(): Boolean = js.native
    def unshift(varargs: js.Any = ???): Int = js.native

}
}
package qx.data {
@js.native
@JSName("qx.data.Conversion")
class Conversion extends js.Object {

}
@js.native
@JSName("qx.data.Conversion")
object Conversion extends js.Object {
    def toBoolean(value: js.Any): Boolean = js.native
    def toNumber(value: js.Any): Long = js.native

}
}
package qx.data {
@js.native
trait IListData extends js.Object {
    def contains(item: js.Any): Boolean = js.native
    def getItem(index: Long): js.Dynamic = js.native
    def getLength(): Long = js.native
    def setItem(index: Long, item: js.Any): Unit = js.native
    def splice(startIndex: Int, amount: Int, varargs: js.Any = ???): qx.data.Array = js.native
    def toArray(): qx.data.Array = js.native

}
}
package qx.data {
@js.native
@JSName("qx.data.MBinding")
trait MBinding extends js.Object {
    def bind(sourcePropertyChain: String, targetObject: qx.core.Object, targetProperty: String, options: js.Any): js.Dynamic = js.native
    def getBindings(): qx.data.Array = js.native
    def removeAllBindings(): Unit = js.native
    def removeBinding(id: js.Any): Unit = js.native
    def removeRelatedBindings(relatedObject: qx.core.Object): Unit = js.native

}
}
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
    def getAllBindingsForObject(obj: qx.core.Object): qx.data.Array = js.native
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
package qx.data.controller {
@js.native
@JSName("qx.data.controller.Form")
class Form protected () extends qx.core.Object {
    def this(model: qx.core.Object = ???, target: qx.ui.form.Form = ???, selfUpdate: Boolean = ???) = this()
    protected def _applyModel(value: qx.core.Object, old: qx.core.Object): Unit = js.native
    protected def _applyTarget(value: qx.ui.form.Form, old: qx.ui.form.Form): Unit = js.native
    def addBindingOptions(name: String, model2target: js.Any, target2model: js.Any): Unit = js.native
    def createModel(includeBubbleEvents: Boolean): qx.core.Object = js.native
    def getModel(): qx.core.Object = js.native
    def getTarget(): qx.ui.form.Form = js.native
    protected def initModel(value: js.Any): qx.core.Object = js.native
    protected def initTarget(value: js.Any): qx.ui.form.Form = js.native
    def resetModel(): Unit = js.native
    def resetTarget(): Unit = js.native
    def setModel(value: js.Any): qx.core.Object = js.native
    def setTarget(value: js.Any): qx.ui.form.Form = js.native
    def updateModel(): Unit = js.native

}
}
package qx.data.controller {
@js.native
trait IControllerDelegate extends js.Object {
    def bindItem(controller: js.Any, item: qx.ui.core.Widget, id: js.Any): Unit = js.native
    def configureItem(item: js.Any): Unit = js.native
    def createItem(): qx.ui.core.Widget = js.native
    def filter(data: js.Any): Boolean = js.native

}
}
package qx.data.controller {
@js.native
trait ISelection extends js.Object {
    def getSelection(): qx.data.IListData = js.native
    def resetSelection(): Unit = js.native
    def setSelection(value: qx.data.IListData): Unit = js.native

}
}
package qx.data.controller {
@js.native
@JSName("qx.data.controller.List")
class List protected () extends qx.core.Object with qx.data.controller.ISelection with qx.data.controller.MSelection {
    override def getSelection(): qx.data.Array = js.native
    override def resetSelection(): Unit = js.native
    override def setSelection(value: qx.data.IListData): Unit = js.native
    def this(model: qx.data.Array = ???, target: qx.ui.core.Widget = ???, labelPath: String = ???) = this()
    protected def _applyDelegate(value: qx.core.Object, old: qx.core.Object): Unit = js.native
    protected def _applyIconOptions(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyIconPath(value: String, old: String): Unit = js.native
    protected def _applyLabelOptions(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyLabelPath(value: String, old: String): Unit = js.native
    protected def _applyModel(value: qx.data.Array, old: qx.data.Array): Unit = js.native
    protected def _applyTarget(value: qx.ui.core.Widget, old: qx.ui.core.Widget): Unit = js.native
    protected def _bindListItem(item: qx.ui.form.ListItem, index: Long): Unit = js.native
    protected def _createItem(): qx.ui.form.ListItem = js.native
    protected def _onBindingSet(index: Long, sourceObject: qx.core.Object, targetObject: qx.core.Object): Unit = js.native
    protected def _removeBindingsFrom(item: Long): Unit = js.native
    protected def _setBindItem(value: js.Any, old: js.Any): Unit = js.native
    protected def _setConfigureItem(value: js.Any, old: js.Any): Unit = js.native
    protected def _setCreateItem(value: js.Any, old: js.Any): Unit = js.native
    protected def _setFilter(value: js.Function, old: js.Function): Unit = js.native
    def bindDefaultProperties(item: qx.ui.form.ListItem, index: Long): Unit = js.native
    def bindProperty(sourcePath: String, targetProperty: String, options: js.Any, targetWidget: qx.ui.core.Widget, index: Long): Unit = js.native
    def bindPropertyReverse(targetPath: String, sourcePath: String, options: js.Any, sourceWidget: qx.ui.core.Widget, index: Long): Unit = js.native
    def getDelegate(): js.Dynamic = js.native
    def getIconOptions(): js.Dynamic = js.native
    def getIconPath(): String = js.native
    def getLabelOptions(): js.Dynamic = js.native
    def getLabelPath(): String = js.native
    def getModel(): qx.data.IListData = js.native
    def getTarget(): js.Dynamic = js.native
    def getVisibleModels(): qx.data.Array = js.native
    protected def initDelegate(value: js.Any): js.Dynamic = js.native
    protected def initIconOptions(value: js.Any): js.Dynamic = js.native
    protected def initIconPath(value: js.Any): String = js.native
    protected def initLabelOptions(value: js.Any): js.Dynamic = js.native
    protected def initLabelPath(value: js.Any): String = js.native
    protected def initModel(value: js.Any): qx.data.IListData = js.native
    protected def initTarget(value: js.Any): js.Dynamic = js.native
    def resetDelegate(): Unit = js.native
    def resetIconOptions(): Unit = js.native
    def resetIconPath(): Unit = js.native
    def resetLabelOptions(): Unit = js.native
    def resetLabelPath(): Unit = js.native
    def resetModel(): Unit = js.native
    def resetTarget(): Unit = js.native
    def setDelegate(value: js.Any): js.Dynamic = js.native
    def setIconOptions(value: js.Any): js.Dynamic = js.native
    def setIconPath(value: js.Any): String = js.native
    def setLabelOptions(value: js.Any): js.Dynamic = js.native
    def setLabelPath(value: js.Any): String = js.native
    def setModel(value: js.Any): qx.data.IListData = js.native
    def setTarget(value: js.Any): js.Dynamic = js.native
    def syncWidget(): Unit = js.native
    def update(): Unit = js.native

}
}
package qx.data.controller {
@js.native
@JSName("qx.data.controller.MSelection")
trait MSelection extends js.Object {
    protected def _addChangeTargetListener(value: qx.ui.core.Widget, old: qx.ui.core.Widget): Unit = js.native
    protected def _applySelection(value: qx.data.Array, old: qx.data.Array): Unit = js.native
    protected def _changeTargetSelection(): Unit = js.native
    protected def _endSelectionModification(): Unit = js.native
    protected def _inSelectionModification(): Boolean = js.native
    protected def _startSelectionModification(): Unit = js.native
    protected def _updateSelection(): Unit = js.native
    def getSelection(): qx.data.Array = js.native
    protected def initSelection(value: js.Any): qx.data.Array = js.native
    def resetSelection(): Unit = js.native
    def setSelection(value: js.Any): qx.data.Array = js.native

}
}
package qx.data.controller {
@js.native
@JSName("qx.data.controller.Object")
class Object protected () extends qx.core.Object {
    def this(model: qx.core.Object = ???) = this()
    protected def _applyModel(value: qx.core.Object, old: qx.core.Object): Unit = js.native
    def addTarget(targetObject: qx.core.Object, targetProperty: String, sourceProperty: String, bidirectional: Boolean = ???, options: js.Any = ???, reverseOptions: js.Any = ???): Unit = js.native
    def getModel(): qx.core.Object = js.native
    protected def initModel(value: js.Any): qx.core.Object = js.native
    def removeTarget(targetObject: qx.core.Object, targetProperty: String, sourceProperty: String): Unit = js.native
    def resetModel(): Unit = js.native
    def setModel(value: js.Any): qx.core.Object = js.native

}
}
package qx.data.controller {
@js.native
@JSName("qx.data.controller.Tree")
class Tree protected () extends qx.core.Object with qx.data.controller.ISelection with qx.data.controller.MSelection {
    override def getSelection(): qx.data.Array = js.native
    override def resetSelection(): Unit = js.native
    override def setSelection(value: qx.data.IListData): Unit = js.native
    def this(model: qx.core.Object = ???, target: qx.ui.tree.Tree = ???, childPath: String = ???, labelPath: String = ???) = this()
    protected def _applyChildPath(value: String, old: String): Unit = js.native
    protected def _applyDelegate(value: qx.core.Object, old: qx.core.Object): Unit = js.native
    protected def _applyIconOptions(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyIconPath(value: String, old: String): Unit = js.native
    protected def _applyLabelOptions(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyLabelPath(value: String, old: String): Unit = js.native
    protected def _applyModel(value: qx.core.Object, old: qx.core.Object): Unit = js.native
    protected def _applyTarget(value: qx.ui.tree.Tree, old: qx.ui.tree.Tree): Unit = js.native
    protected def _createItem(): qx.ui.tree.core.AbstractTreeItem = js.native
    protected def _setBindItem(value: js.Any, old: js.Any): Unit = js.native
    protected def _setConfigureItem(value: js.Any, old: js.Any): Unit = js.native
    protected def _setCreateItem(value: js.Any, old: js.Any): Unit = js.native
    def bindDefaultProperties(treeNode: qx.ui.tree.core.AbstractTreeItem, modelNode: qx.core.Object): Unit = js.native
    def bindProperty(sourcePath: String, targetPath: String, options: js.Any, targetWidget: qx.ui.tree.core.AbstractTreeItem, modelNode: js.Any): Unit = js.native
    def bindPropertyReverse(targetPath: String, sourcePath: String, options: js.Any, sourceWidget: qx.ui.tree.core.AbstractTreeItem, modelNode: js.Any): Unit = js.native
    def getChildPath(): String = js.native
    def getDelegate(): js.Dynamic = js.native
    def getIconOptions(): js.Dynamic = js.native
    def getIconPath(): String = js.native
    def getLabelOptions(): js.Dynamic = js.native
    def getLabelPath(): String = js.native
    def getModel(): qx.core.Object = js.native
    def getTarget(): js.Dynamic = js.native
    protected def initChildPath(value: js.Any): String = js.native
    protected def initDelegate(value: js.Any): js.Dynamic = js.native
    protected def initIconOptions(value: js.Any): js.Dynamic = js.native
    protected def initIconPath(value: js.Any): String = js.native
    protected def initLabelOptions(value: js.Any): js.Dynamic = js.native
    protected def initLabelPath(value: js.Any): String = js.native
    protected def initModel(value: js.Any): qx.core.Object = js.native
    protected def initTarget(value: js.Any): js.Dynamic = js.native
    def resetChildPath(): Unit = js.native
    def resetDelegate(): Unit = js.native
    def resetIconOptions(): Unit = js.native
    def resetIconPath(): Unit = js.native
    def resetLabelOptions(): Unit = js.native
    def resetLabelPath(): Unit = js.native
    def resetModel(): Unit = js.native
    def resetTarget(): Unit = js.native
    def setChildPath(value: js.Any): String = js.native
    def setDelegate(value: js.Any): js.Dynamic = js.native
    def setIconOptions(value: js.Any): js.Dynamic = js.native
    def setIconPath(value: js.Any): String = js.native
    def setLabelOptions(value: js.Any): js.Dynamic = js.native
    def setLabelPath(value: js.Any): String = js.native
    def setModel(value: js.Any): qx.core.Object = js.native
    def setTarget(value: js.Any): js.Dynamic = js.native

}
}
package qx.data.marshal {
@js.native
trait IMarshaler extends js.Object {
    def toClass(data: js.Any, includeBubbleEvents: Boolean): Unit = js.native
    def toModel(data: js.Any): qx.core.Object = js.native

}
}
package qx.data.marshal {
@js.native
trait IMarshalerDelegate extends js.Object {
    def getArrayClass(parentProperty: String, depth: Long): qx.Class = js.native
    def getModelClass(properties: String, obj: js.Any, parentProperty: String, depth: Long): qx.Class = js.native
    def getModelMixins(properties: String, parentProperty: String, depth: Long): qx.data.Array = js.native
    def getModelSuperClass(properties: String, parentProperty: String, depth: Long): qx.Class = js.native
    def getPropertyMapping(property: String, properties: String): String = js.native
    def getValidationRule(properties: String, propertyName: String): js.Function = js.native
    def ignore(properties: String, parentProperty: String, depth: Long): Boolean = js.native

}
}
package qx.data.marshal {
@js.native
@JSName("qx.data.marshal.Json")
class Json protected () extends qx.core.Object with qx.data.marshal.IMarshaler {
    override def toClass(data: js.Any, includeBubbleEvents: Boolean): Unit = js.native
    override def toModel(data: js.Any): qx.core.Object = js.native
    def this(delegate: js.Any = ???) = this()

}
@js.native
@JSName("qx.data.marshal.Json")
object Json extends js.Object {
    def createModel(data: js.Any, includeBubbleEvents: Boolean): qx.core.Object = js.native

}
}
package qx.data.marshal {
@js.native
@JSName("qx.data.marshal.MEventBubbling")
trait MEventBubbling extends js.Object {
    protected def _applyEventPropagation(value: js.Any, old: js.Any, name: String): Unit = js.native
    protected def _registerEventChaining(value: js.Any, old: js.Any, name: String): Unit = js.native

}
}
package qx.data.store {
@js.native
trait IStoreDelegate extends js.Object {
    def configureRequest(request: js.Any): Unit = js.native
    def manipulateData(data: js.Any): js.Dynamic = js.native

}
}
package qx.data.store {
@js.native
@JSName("qx.data.store.Json")
class Json protected () extends qx.core.Object {
    def this(url: String = ???, delegate: js.Any = ???) = this()
    protected def _applyUrl(value: String, old: String): Unit = js.native
    protected def _createRequest(url: String): Unit = js.native
    protected def _getRequest(): js.Dynamic = js.native
    protected def _onChangePhase(ev: qx.event.`type`.Data): Unit = js.native
    protected def _onFail(ev: qx.event.`type`.Event): Unit = js.native
    protected def _onSuccess(ev: qx.event.`type`.Event): Unit = js.native
    protected def _setRequest(request: js.Any): Unit = js.native
    def getModel(): js.Dynamic = js.native
    def getState(): js.Dynamic = js.native
    def getUrl(): String = js.native
    protected def initModel(value: js.Any): js.Dynamic = js.native
    protected def initState(value: js.Any): js.Dynamic = js.native
    protected def initUrl(value: js.Any): String = js.native
    def reload(): Unit = js.native
    def resetModel(): Unit = js.native
    def resetState(): Unit = js.native
    def resetUrl(): Unit = js.native
    def setModel(value: js.Any): js.Dynamic = js.native
    def setState(value: js.Any): js.Dynamic = js.native
    def setUrl(value: js.Any): String = js.native

}
}
package qx.data.store {
@js.native
@JSName("qx.data.store.Jsonp")
class Jsonp protected () extends qx.data.store.Json {
    def this(url: String = ???, delegate: js.Any = ???, callbackParam: String = ???) = this()
    def getCallbackName(): String = js.native
    def getCallbackParam(): String = js.native
    protected def initCallbackName(value: js.Any): String = js.native
    protected def initCallbackParam(value: js.Any): String = js.native
    def resetCallbackName(): Unit = js.native
    def resetCallbackParam(): Unit = js.native
    def setCallbackName(value: js.Any): String = js.native
    def setCallbackParam(value: js.Any): String = js.native

}
}
package qx.data.store {
@js.native
@JSName("qx.data.store.Offline")
class Offline protected () extends qx.core.Object {
    def this(key: String = ???, storage: String = ???, delegate: js.Any = ???) = this()
    protected def _applyModel(value: js.Any, old: js.Any): Unit = js.native
    protected def _initializeModel(): Unit = js.native
    protected def _setModel(data: js.Any): Unit = js.native
    protected def _storeModel(): Unit = js.native
    def getKey(): String = js.native
    def getModel(): js.Dynamic = js.native
    protected def initModel(value: js.Any): js.Dynamic = js.native
    def resetModel(): Unit = js.native
    def setModel(value: js.Any): js.Dynamic = js.native

}
}
package qx.data.store {
@js.native
@JSName("qx.data.store.Rest")
class Rest protected () extends qx.core.Object {
    def this(resource: qx.io.rest.Resource = ???, actionName: String = ???, delegate: js.Any = ???) = this()
    def getActionName(): String = js.native
    def getModel(): js.Dynamic = js.native
    def getResource(): qx.io.rest.Resource = js.native
    protected def initActionName(value: js.Any): String = js.native
    protected def initModel(value: js.Any): js.Dynamic = js.native
    protected def initResource(value: js.Any): qx.io.rest.Resource = js.native
    def resetActionName(): Unit = js.native
    def resetModel(): Unit = js.native
    def resetResource(): Unit = js.native
    def setActionName(value: js.Any): String = js.native
    def setModel(value: js.Any): js.Dynamic = js.native
    def setResource(value: js.Any): qx.io.rest.Resource = js.native

}
}
package qx.data.store {
@js.native
@JSName("qx.data.store.Yql")
class Yql protected () extends qx.data.store.Jsonp {
    def this(query: String = ???, delegate: js.Any = ???, https: Boolean = ???) = this()

}
}
package qx.dom {
@js.native
@JSName("qx.dom.Element")
class Element extends js.Object {

}
@js.native
@JSName("qx.dom.Element")
object Element extends js.Object {
    def create(name: String, attributes: js.Any = ???, win: Window = ???): HTMLElement = js.native
    def empty(element: HTMLElement): String = js.native
    def getHelperElement(win: Window = ???): HTMLElement = js.native
    def getParentElement(element: HTMLElement): HTMLElement = js.native
    def hasChild(parent: HTMLElement, child: Node): Boolean = js.native
    def hasChildElements(element: HTMLElement): Boolean = js.native
    def hasChildren(element: HTMLElement): Boolean = js.native
    def insertAfter(node: Node, ref: Node): Boolean = js.native
    def insertAt(node: Node, parent: HTMLElement, index: Int): Boolean = js.native
    def insertBefore(node: Node, ref: Node): Boolean = js.native
    def insertBegin(node: Node, parent: HTMLElement): Boolean = js.native
    def insertEnd(node: Node, parent: HTMLElement): Boolean = js.native
    def isInDom(element: HTMLElement, win: Window): Boolean = js.native
    def remove(node: Node): Boolean = js.native
    def removeChild(node: Node, parent: HTMLElement): Boolean = js.native
    def removeChildAt(index: Int, parent: HTMLElement): Boolean = js.native
    def replaceAt(newNode: Node, index: Int, parent: HTMLElement): Boolean = js.native
    def replaceChild(newNode: Node, oldNode: Node): Boolean = js.native

}
}
package qx.dom {
@js.native
@JSName("qx.dom.Hierarchy")
class Hierarchy extends js.Object {

}
@js.native
@JSName("qx.dom.Hierarchy")
object Hierarchy extends js.Object {
    protected def _recursivelyCollect(element: HTMLElement, property: String): qx.data.Array = js.native
    def cleanWhitespace(element: HTMLElement): Unit = js.native
    def contains(element: HTMLElement, target: Node): Boolean = js.native
    def getAncestors(element: HTMLElement): qx.data.Array = js.native
    def getChildElements(element: HTMLElement): qx.data.Array = js.native
    def getCommonParent(element1: HTMLElement, element2: HTMLElement): HTMLElement = js.native
    def getDescendants(element: HTMLElement): qx.data.Array = js.native
    def getElementIndex(element: HTMLElement): Int = js.native
    def getFirstDescendant(element: HTMLElement): HTMLElement = js.native
    def getLastDescendant(element: HTMLElement): HTMLElement = js.native
    def getNextElementSibling(element: HTMLElement): HTMLElement = js.native
    def getNextSiblings(element: HTMLElement): qx.data.Array = js.native
    def getNodeIndex(node: Node): Int = js.native
    def getPreviousElementSibling(element: HTMLElement): HTMLElement = js.native
    def getPreviousSiblings(element: HTMLElement): qx.data.Array = js.native
    def getSiblings(element: js.Any): qx.data.Array = js.native
    def isDescendantOf(element: HTMLElement, ancestor: HTMLElement): Boolean = js.native
    def isEmpty(element: HTMLElement): Boolean = js.native
    def isRendered(element: HTMLElement): Boolean = js.native

}
}
package qx.dom {
@js.native
@JSName("qx.dom.Node")
class Node extends js.Object {

}
@js.native
@JSName("qx.dom.Node")
object Node extends js.Object {
    def getBodyElement(node: Node): HTMLElement = js.native
    def getDocument(node: Node): Document = js.native
    def getDocumentElement(node: Node): HTMLElement = js.native
    def getName(node: Node): String = js.native
    def getText(node: Node): String = js.native
    def getWindow(node: Node): Window = js.native
    def isBlockNode(node: Node): Boolean = js.native
    def isDocument(node: Node): Boolean = js.native
    def isDocumentFragment(node: Node): Boolean = js.native
    def isElement(node: Node): Boolean = js.native
    def isNode(node: Node): Boolean = js.native
    def isNodeName(node: Node, nodeName: String): Boolean = js.native
    def isText(node: Node): Boolean = js.native
    def isWindow(obj: js.Any): Boolean = js.native

}
}
package qx.event {
@js.native
@JSName("qx.event.AcceleratingTimer")
class AcceleratingTimer extends qx.core.Object {
    protected def _onInterval(): Unit = js.native
    def getDecrease(): Int = js.native
    def getFirstInterval(): Int = js.native
    def getInterval(): Int = js.native
    def getMinimum(): Int = js.native
    protected def initDecrease(value: js.Any): Int = js.native
    protected def initFirstInterval(value: js.Any): Int = js.native
    protected def initInterval(value: js.Any): Int = js.native
    protected def initMinimum(value: js.Any): Int = js.native
    def resetDecrease(): Unit = js.native
    def resetFirstInterval(): Unit = js.native
    def resetInterval(): Unit = js.native
    def resetMinimum(): Unit = js.native
    def setDecrease(value: js.Any): Int = js.native
    def setFirstInterval(value: js.Any): Int = js.native
    def setInterval(value: js.Any): Int = js.native
    def setMinimum(value: js.Any): Int = js.native
    def start(): Unit = js.native
    def stop(): Unit = js.native

}
}
package qx.event {
@js.native
@JSName("qx.event.Emitter")
class Emitter extends js.Object {
    def addListener(name: String, listener: js.Function, ctx: js.Any = ???): Int = js.native
    def addListenerOnce(name: String, listener: js.Function, ctx: js.Any = ???): Int = js.native
    def emit(name: String, data: js.Any = ???): Unit = js.native
    def getEntryById(id: Long): js.Dynamic = js.native
    def getListeners(): js.Dynamic = js.native
    def off(name: String, listener: js.Function, ctx: js.Any = ???): Int = js.native
    def offById(id: Int): Int = js.native
    def on(name: String, listener: js.Function, ctx: js.Any = ???): Int = js.native
    def once(name: String, listener: js.Function, ctx: js.Any = ???): Int = js.native
    def removeListener(name: String, listener: js.Function, ctx: js.Any = ???): Unit = js.native
    def removeListenerById(id: Int): Unit = js.native

}
}
package qx.event {
@js.native
@JSName("qx.event.GlobalError")
class GlobalError extends js.Object {

}
@js.native
@JSName("qx.event.GlobalError")
object GlobalError extends js.Object {
    def handleError(ex: qx.core.WindowError): Unit = js.native
    def observeMethod(method: js.Function): js.Function = js.native
    def setErrorHandler(callback: js.Function = ???, context: js.Any = ???): Unit = js.native

}
}
package qx.event {
@js.native
trait IEventDispatcher extends js.Object {
    def canDispatchEvent(target: HTMLElement, event: qx.event.`type`.Event, `type`: String): Boolean = js.native
    def dispatchEvent(target: HTMLElement, event: qx.event.`type`.Event, `type`: String): Unit = js.native

}
}
package qx.event {
@js.native
trait IEventHandler extends js.Object {
    def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native

}
}
package qx.event {
@js.native
@JSName("qx.event.Idle")
class Idle extends qx.core.Object {
    protected def _applyTimeoutInterval(value: Long, old: Long): Unit = js.native
    protected def _onInterval(): Unit = js.native
    def getTimeoutInterval(): Long = js.native
    protected def initTimeoutInterval(value: js.Any): Long = js.native
    def resetTimeoutInterval(): Unit = js.native
    def setTimeoutInterval(value: js.Any): Long = js.native

}
@js.native
@JSName("qx.event.Idle")
object Idle extends js.Object {
    def getInstance(): qx.event.Idle = js.native

}
}
package qx.event {
@js.native
@JSName("qx.event.Manager")
class Manager protected () extends js.Object {
    def this(win: Window = ???, registration: qx.event.Registration = ???) = this()
    def addListener(target: js.Any, `type`: String, listener: js.Function, self: js.Any = ???, capture: Boolean = ???): String = js.native
    def deleteAllListeners(targetKey: String): Unit = js.native
    def dispatchEvent(target: js.Any, event: qx.event.`type`.Event): Boolean = js.native
    def dispose(): Unit = js.native
    def findHandler(target: js.Any, `type`: String): qx.event.IEventHandler = js.native
    def getAllListeners(): js.Dynamic = js.native
    def getDispatcher(clazz: qx.Class): js.Dynamic = js.native
    def getHandler(clazz: qx.Class): js.Dynamic = js.native
    def getListeners(target: js.Any, `type`: String, capture: Boolean = ???): qx.data.Array = js.native
    def getWindow(): Window = js.native
    def getWindowId(): String = js.native
    def hasListener(target: js.Any, `type`: String, capture: Boolean = ???): Boolean = js.native
    def importListeners(target: js.Any, list: js.Any): Unit = js.native
    def removeAllListeners(target: js.Any): Boolean = js.native
    def removeListener(target: js.Any, `type`: String, listener: js.Function, self: js.Any = ???, capture: Boolean = ???): Boolean = js.native
    def removeListenerById(target: js.Any, id: String): Boolean = js.native
    def serializeListeners(target: js.Any): js.Array[js.Any] = js.native
    def toggleAttachedEvents(target: js.Any, enable: Boolean): Unit = js.native

}
@js.native
@JSName("qx.event.Manager")
object Manager extends js.Object {
    def getNextUniqueId(): String = js.native

}
}
package qx.event {
@js.native
@JSName("qx.event.Messaging")
class Messaging extends js.Object {
    protected def _addListener(channel: String, `type`: String, handler: js.Function, scope: js.Any = ???): String = js.native
    protected def _emit(channel: String, path: String, params: js.Any, customData: js.Any): Unit = js.native
    protected def _emitListeners(channel: String, path: String, listeners: js.Array[js.Any], params: js.Any, customData: js.Any): Boolean = js.native
    protected def _emitRoute(channel: String, path: String, listener: js.Any, params: js.Any, customData: js.Any): Boolean = js.native
    def emit(channel: String, path: String, params: js.Any, customData: js.Any): Unit = js.native
    def has(channel: String, path: String): Boolean = js.native
    def on(channel: String, `type`: String, handler: js.Function, scope: js.Any = ???): String = js.native
    def onAny(`type`: String, handler: js.Function, scope: js.Any = ???): String = js.native
    def remove(id: String): Unit = js.native

}
}
package qx.event {
@js.native
@JSName("qx.event.Pool")
class Pool extends qx.util.ObjectPool {

}
@js.native
@JSName("qx.event.Pool")
object Pool extends js.Object {
    def getInstance(): qx.event.Pool = js.native

}
}
package qx.event {
@js.native
@JSName("qx.event.Registration")
class Registration extends js.Object {

}
@js.native
@JSName("qx.event.Registration")
object Registration extends js.Object {
    def addDispatcher(dispatcher: qx.event.IEventDispatcher, priority: Int): Unit = js.native
    def addHandler(handler: qx.event.IEventHandler): Unit = js.native
    def addListener(target: js.Any, `type`: String, listener: js.Function, self: js.Any = ???, capture: Boolean = ???): js.Dynamic = js.native
    def createEvent(`type`: String, clazz: js.Any = ???, args: qx.data.Array = ???): qx.event.`type`.Event = js.native
    def deleteAllListeners(target: js.Any): Unit = js.native
    def dispatchEvent(target: js.Any, event: qx.event.`type`.Event): Boolean = js.native
    def fireEvent(target: js.Any, `type`: String, clazz: qx.Class = ???, args: qx.data.Array = ???): Boolean = js.native
    def fireNonBubblingEvent(target: js.Any, `type`: String, clazz: qx.Class = ???, args: qx.data.Array = ???): Boolean = js.native
    def getDispatchers(): js.Array[qx.event.IEventDispatcher] = js.native
    def getHandlers(): js.Array[qx.event.IEventHandler] = js.native
    def getManager(target: js.Any): qx.event.Manager = js.native
    def hasListener(target: js.Any, `type`: String, capture: Boolean = ???): Boolean = js.native
    def removeAllListeners(target: js.Any): Boolean = js.native
    def removeListener(target: js.Any, `type`: String, listener: js.Function, self: js.Any = ???, capture: Boolean = ???): Boolean = js.native
    def removeListenerById(target: js.Any, id: js.Any): Boolean = js.native
    def removeManager(mgr: qx.event.Manager): Unit = js.native
    def serializeListeners(target: js.Any): js.Array[js.Any] = js.native

}
}
package qx.event {
@js.native
@JSName("qx.event.Timer")
class Timer protected () extends qx.core.Object {
    def this(interval: Long = ???) = this()
    protected def _applyEnabled(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyInterval(value: js.Any, old: js.Any): Unit = js.native
    protected def _oninterval(): Unit = js.native
    def getEnabled(): Boolean = js.native
    def getInterval(): Int = js.native
    protected def initEnabled(value: js.Any): Boolean = js.native
    protected def initInterval(value: js.Any): Int = js.native
    def isEnabled(): Boolean = js.native
    def resetEnabled(): Unit = js.native
    def resetInterval(): Unit = js.native
    def restart(): Unit = js.native
    def restartWith(interval: Int): Unit = js.native
    def setEnabled(value: js.Any): Boolean = js.native
    def setInterval(value: js.Any): Int = js.native
    def start(): Unit = js.native
    def startWith(interval: Int): Unit = js.native
    def stop(): Unit = js.native
    def toggleEnabled(): Boolean = js.native

}
@js.native
@JSName("qx.event.Timer")
object Timer extends js.Object {
    def once(func: js.Function, obj: js.Any, timeout: Long): qx.event.Timer = js.native

}
}
package qx.event.dispatch {
@js.native
@JSName("qx.event.dispatch.AbstractBubbling")
class AbstractBubbling protected () extends qx.core.Object with qx.event.IEventDispatcher {
    override def canDispatchEvent(target: HTMLElement, event: qx.event.`type`.Event, `type`: String): Boolean = js.native
    override def dispatchEvent(target: HTMLElement, event: qx.event.`type`.Event, `type`: String): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()
    protected def _getParent(target: js.Any): js.Dynamic = js.native

}
}
package qx.event.dispatch {
@js.native
@JSName("qx.event.dispatch.Direct")
class Direct protected () extends qx.core.Object with qx.event.IEventDispatcher {
    override def canDispatchEvent(target: HTMLElement, event: qx.event.`type`.Event, `type`: String): Boolean = js.native
    override def dispatchEvent(target: HTMLElement, event: qx.event.`type`.Event, `type`: String): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()

}
}
package qx.event.dispatch {
@js.native
@JSName("qx.event.dispatch.DomBubbling")
class DomBubbling extends qx.event.dispatch.AbstractBubbling {

}
}
package qx.event.dispatch {
@js.native
@JSName("qx.event.dispatch.MouseCapture")
class MouseCapture protected () extends qx.event.dispatch.AbstractBubbling {
    def this(manager: qx.event.Manager = ???, registration: qx.event.Registration = ???) = this()
    def activateCapture(element: HTMLElement, containerCapture: Boolean = ???): Unit = js.native
    def getCaptureElement(): HTMLElement = js.native
    def nativeReleaseCapture(element: HTMLElement): Unit = js.native
    def nativeSetCapture(element: HTMLElement, containerCapture: Boolean = ???): Unit = js.native
    def releaseCapture(): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Appear")
class Appear protected () extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()
    def refresh(): Unit = js.native

}
@js.native
@JSName("qx.event.handler.Appear")
object Appear extends js.Object {

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Application")
class Application protected () extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()
    protected def _initObserver(): Unit = js.native
    protected def _onNativeLoad(): Unit = js.native
    protected def _onNativeUnload(): Unit = js.native
    protected def _stopObserver(): Unit = js.native
    def isApplicationReady(): Boolean = js.native

}
@js.native
@JSName("qx.event.handler.Application")
object Application extends js.Object {
    def onScriptLoaded(): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Capture")
class Capture extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.DragDrop")
class DragDrop protected () extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()
    protected def _getDelta(e: qx.event.`type`.Pointer): js.Dynamic = js.native
    protected def _onKeyDown(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onKeyPress(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onKeyUp(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onLongtap(e: qx.event.`type`.Tap): Unit = js.native
    protected def _onPointerdown(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointermove(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerup(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onRoll(e: qx.event.`type`.Roll): Unit = js.native
    protected def _onWindowBlur(e: qx.event.`type`.Event): Unit = js.native
    protected def _start(e: qx.event.`type`.Pointer): Boolean = js.native
    def addAction(action: String): Unit = js.native
    def addData(`type`: String, data: js.Any): Unit = js.native
    def addType(`type`: String): Unit = js.native
    def clearSession(): Unit = js.native
    def getCurrentAction(): String = js.native
    def getCurrentType(): String = js.native
    def getCursor(): qx.ui.core.Widget = js.native
    def getData(`type`: String): js.Dynamic = js.native
    def getDragTarget(): qx.ui.core.Widget = js.native
    protected def initCursor(value: js.Any): qx.ui.core.Widget = js.native
    def isSessionActive(): Boolean = js.native
    def resetCursor(): Unit = js.native
    def setCursor(value: js.Any): qx.ui.core.Widget = js.native
    def setDropAllowed(isAllowed: Boolean): Unit = js.native
    def supportsAction(`type`: String): Boolean = js.native
    def supportsType(`type`: String): Boolean = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Element")
class Element protected () extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()
    protected def _onNative(nativeEvent: qx.event.`type`.Event, eventId: Int): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.ElementResize")
class ElementResize protected () extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()
    protected def _onInterval(e: qx.event.`type`.Data): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Focus")
class Focus protected () extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()
    protected def _applyActive(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyFocus(value: js.Any, old: js.Any): Unit = js.native
    protected def _initObserver(): Unit = js.native
    protected def _stopObserver(): Unit = js.native
    def activate(element: HTMLElement): Unit = js.native
    def blur(element: HTMLElement): Unit = js.native
    def deactivate(element: HTMLElement): Unit = js.native
    def focus(element: HTMLElement): Unit = js.native
    def getActive(): js.Dynamic = js.native
    def getFocus(): js.Dynamic = js.native
    protected def initActive(value: js.Any): js.Dynamic = js.native
    protected def initFocus(value: js.Any): js.Dynamic = js.native
    def resetActive(): Unit = js.native
    def resetFocus(): Unit = js.native
    def setActive(value: js.Any): js.Dynamic = js.native
    def setFocus(value: js.Any): js.Dynamic = js.native
    def tryActivate(element: HTMLElement): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Gesture")
class Gesture protected () extends qx.event.handler.GestureCore with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.GestureCore")
class GestureCore protected () extends js.Object {
    def this(target: HTMLElement = ???, emitter: qx.event.Emitter = ???) = this()
    protected def _calcAngle(): Long = js.native
    protected def _calcDistance(): Long = js.native
    protected def _fireEvent(domEvent: qx.event.`type`.Event, `type`: String, target: HTMLElement = ???): Unit = js.native
    protected def _fireRoll(domEvent: qx.event.`type`.Event, `type`: String, target: HTMLElement): Unit = js.native
    protected def _getDeltaCoordinates(domEvent: qx.event.`type`.Event): js.Dynamic = js.native
    protected def _hasIntermediaryHandler(target: HTMLElement): Boolean = js.native
    protected def _initObserver(): Unit = js.native
    protected def _isBelowTapMaxDistance(domEvent: qx.event.`type`.Event): Boolean = js.native
    protected def _onDblClick(domEvent: qx.event.`type`.Event): Unit = js.native
    protected def _stopObserver(): Unit = js.native
    def checkAndFireGesture(domEvent: qx.event.`type`.Event, `type`: String = ???, target: HTMLElement = ???): Unit = js.native
    def dispose(): Unit = js.native
    def gestureBegin(domEvent: qx.event.`type`.Event, target: HTMLElement): Unit = js.native
    def gestureCancel(id: Long): Unit = js.native
    def gestureFinish(domEvent: qx.event.`type`.Event, target: HTMLElement): Unit = js.native
    def gestureMove(domEvent: qx.event.`type`.Event, target: HTMLElement): Unit = js.native
    def isBelowTapMaxDistance(event: qx.event.`type`.Event): Boolean = js.native
    def stopMomentum(id: Int): Unit = js.native
    def updateGestureTarget(id: String, target: HTMLElement): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Iframe")
class Iframe extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native

}
@js.native
@JSName("qx.event.handler.Iframe")
object Iframe extends js.Object {
    def onevent(target: HTMLElement): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Input")
class Input extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    protected def _inputFix(e: qx.event.`type`.Event, target: HTMLElement): Unit = js.native
    protected def _onChangeChecked(e: qx.event.`type`.Event): Unit = js.native
    protected def _onChangeValue(e: qx.event.`type`.Event): Unit = js.native
    protected def _onInput(e: qx.event.`type`.Event): Unit = js.native
    protected def _onKeyDown(e: qx.event.`type`.Event): Unit = js.native
    protected def _onKeyPress(e: qx.event.`type`.Event, target: HTMLElement): Unit = js.native
    protected def _onKeyUp(e: qx.event.`type`.Event): Unit = js.native
    protected def _onProperty(e: qx.event.`type`.Event): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Keyboard")
class Keyboard protected () extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()
    def __onKeyUpDown(domEvent: qx.event.`type`.Event): Unit = js.native
    protected def _fireInputEvent(domEvent: qx.event.`type`.Event, charCode: Int): Unit = js.native
    protected def _fireSequenceEvent(domEvent: qx.event.`type`.Event, `type`: String, keyIdentifier: String): Unit = js.native
    protected def _idealKeyHandler(keyCode: String, charCode: String, eventType: String, domEvent: HTMLElement): Unit = js.native
    protected def _identifierToKeyCode(keyIdentifier: String): Int = js.native
    protected def _initKeyObserver(): Unit = js.native
    protected def _stopKeyObserver(): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Mouse")
class Mouse protected () extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()
    protected def _initButtonObserver(): Unit = js.native
    protected def _initMoveObserver(): Unit = js.native
    protected def _initWheelObserver(): Unit = js.native
    protected def _onButtonEvent(domEvent: qx.event.`type`.Event): Unit = js.native
    protected def _onMoveEvent(domEvent: qx.event.`type`.Event): Unit = js.native
    protected def _onWheelEvent(domEvent: qx.event.`type`.Event): Unit = js.native
    protected def _stopButtonObserver(): Unit = js.native
    protected def _stopMoveObserver(): Unit = js.native
    protected def _stopWheelObserver(): Unit = js.native
    def preventNextClick(): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Object")
class Object extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Offline")
class Offline protected () extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()
    protected def _initObserver(): Unit = js.native
    protected def _onNative(domEvent: qx.event.`type`.Event): Unit = js.native
    protected def _stopObserver(): Unit = js.native
    def isOnline(): Boolean = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Orientation")
class Orientation protected () extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()
    protected def _initObserver(): Unit = js.native
    protected def _onNative(domEvent: qx.event.`type`.Event): Unit = js.native
    protected def _onOrientationChange(domEvent: qx.event.`type`.Event): Unit = js.native
    protected def _stopObserver(): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.OrientationCore")
class OrientationCore protected () extends js.Object {
    def this(targetWindow: Window = ???, emitter: qx.event.Emitter = ???) = this()
    protected def _initObserver(): Unit = js.native
    protected def _onNative(domEvent: qx.event.`type`.Event): Unit = js.native
    protected def _stopObserver(): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Pointer")
class Pointer protected () extends qx.event.handler.PointerCore with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.PointerCore")
class PointerCore protected () extends js.Object {
    def this(target: HTMLElement = ???, emitter: qx.event.Emitter = ???) = this()
    protected def _determineActiveTouches(`type`: String, changedTouches: qx.data.Array): Unit = js.native
    protected def _fireEvent(domEvent: qx.event.`type`.Event, `type`: String = ???, target: HTMLElement = ???): Unit = js.native
    protected def _initObserver(callback: js.Function, useEmitter: Boolean): Unit = js.native
    protected def _initPointerObserver(): Unit = js.native
    protected def _isSimulatedMouseEvent(x: Int, y: Int): Boolean = js.native
    protected def _onMouseEvent(domEvent: qx.event.`type`.Event): Unit = js.native
    protected def _onPointerEvent(domEvent: qx.event.`type`.Event): Unit = js.native
    protected def _onTouchEvent(domEvent: qx.event.`type`.Event): Unit = js.native
    protected def _stopObserver(): Unit = js.native
    def dispose(): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Touch")
class Touch protected () extends qx.event.handler.TouchCore with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.TouchCore")
class TouchCore protected () extends js.Object {
    def this(target: HTMLElement = ???, emitter: qx.event.Emitter = ???) = this()
    protected def _calcSingleTouchDelta(touch: qx.event.`type`.Event): js.Dynamic = js.native
    protected def _calcTouchesDelta(touches: qx.data.Array): qx.data.Array = js.native
    protected def _commonTouchEventHandler(domEvent: qx.event.`type`.Event, `type`: String = ???): Unit = js.native
    protected def _detectTouchesByPointer(domEvent: qx.event.`type`.Event, `type`: String = ???): qx.data.Array = js.native
    protected def _fireEvent(domEvent: qx.event.`type`.Event, `type`: String = ???, target: HTMLElement = ???): Unit = js.native
    protected def _getRotationAngle(touch0: qx.event.`type`.Event, touch1: qx.event.`type`.Event): Long = js.native
    protected def _getScalingDistance(touch0: qx.event.`type`.Event, touch1: qx.event.`type`.Event): Long = js.native
    protected def _getTarget(domEvent: qx.event.`type`.Event): HTMLElement = js.native
    protected def _initTouchObserver(): Unit = js.native
    protected def _mapPointerEvent(`type`: String): String = js.native
    protected def _onTouchEvent(domEvent: qx.event.`type`.Event): Unit = js.native
    protected def _stopTouchObserver(): Unit = js.native
    def dispose(): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Transition")
class Transition protected () extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()
    protected def _onNative(domEvent: qx.event.`type`.Event): Unit = js.native

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.UserAction")
class UserAction protected () extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()

}
}
package qx.event.handler {
@js.native
@JSName("qx.event.handler.Window")
class Window protected () extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    def this(manager: qx.event.Manager = ???) = this()
    protected def _initWindowObserver(): Unit = js.native
    protected def _onNative(): Unit = js.native
    protected def _stopWindowObserver(): Unit = js.native

}
}
package qx.event.message {
@js.native
@JSName("qx.event.message.Bus")
class Bus extends qx.core.Object {
    def checkSubscription(message: String, subscriber: js.Function, context: js.Any): Boolean = js.native
    def dispatch(msg: qx.event.message.Message): Boolean = js.native
    def dispatchByName(name: String, data: js.Any): Boolean = js.native
    def getSubscriptions(): js.Dynamic = js.native
    def subscribe(message: String, subscriber: js.Function, context: js.Any): Boolean = js.native
    def unsubscribe(message: String, subscriber: js.Function, context: js.Any): Boolean = js.native

}
@js.native
@JSName("qx.event.message.Bus")
object Bus extends js.Object {
    def getInstance(): qx.event.message.Bus = js.native

}
}
package qx.event.message {
@js.native
@JSName("qx.event.message.Message")
class Message protected () extends qx.core.Object {
    def this(name: String = ???, data: js.Any = ???) = this()
    def getData(): js.Dynamic = js.native
    def getName(): String = js.native
    def getSender(): js.Dynamic = js.native
    protected def initData(value: js.Any): js.Dynamic = js.native
    protected def initName(value: js.Any): String = js.native
    protected def initSender(value: js.Any): js.Dynamic = js.native
    def resetData(): Unit = js.native
    def resetName(): Unit = js.native
    def resetSender(): Unit = js.native
    def setData(value: js.Any): js.Dynamic = js.native
    def setName(value: js.Any): String = js.native
    def setSender(value: js.Any): js.Dynamic = js.native

}
}
package qx.event.`type` {
@js.native
@JSName("qx.event.`type`.Data")
class Data extends qx.event.`type`.Event {
    def getData(): js.Dynamic = js.native
    def getOldData(): js.Dynamic = js.native

}
}
package qx.event.`type` {
@js.native
@JSName("qx.event.`type`.Dom")
class Dom extends qx.event.`type`.Native {
    def getModifiers(): Int = js.native
    def isAltPressed(): Boolean = js.native
    def isCtrlOrCommandPressed(): Boolean = js.native
    def isCtrlPressed(): Boolean = js.native
    def isMetaPressed(): Boolean = js.native
    def isShiftPressed(): Boolean = js.native

}
}
package qx.event.`type` {
@js.native
@JSName("qx.event.`type`.Drag")
class Drag extends qx.event.`type`.Event {
    def addAction(action: String): Unit = js.native
    def addData(`type`: String, data: js.Any): Unit = js.native
    def addType(`type`: String): Unit = js.native
    def getCurrentAction(): String = js.native
    def getCurrentType(): String = js.native
    def getData(`type`: String): js.Dynamic = js.native
    def getDocumentLeft(): Int = js.native
    def getDocumentTop(): Int = js.native
    def getDragTarget(): qx.ui.core.Widget = js.native
    def getManager(): qx.event.handler.DragDrop = js.native
    def setDropAllowed(isAllowed: Boolean): Unit = js.native
    def stopSession(): Unit = js.native
    def supportsAction(action: String): Boolean = js.native
    def supportsType(`type`: String): Boolean = js.native

}
}
package qx.event.`type` {
@js.native
@JSName("qx.event.`type`.Event")
class Event extends qx.core.Object {
    def getBubbles(): Boolean = js.native
    def getCurrentTarget(): HTMLElement = js.native
    def getDefaultPrevented(): Boolean = js.native
    def getEventPhase(): Int = js.native
    def getOriginalTarget(): HTMLElement = js.native
    def getPropagationStopped(): Boolean = js.native
    def getRelatedTarget(): HTMLElement = js.native
    def getTarget(): HTMLElement = js.native
    def getTimeStamp(): Int = js.native
    def getType(): String = js.native
    def init(canBubble: Boolean = ???, cancelable: Boolean = ???): qx.event.`type`.Event = js.native
    def isCancelable(): Boolean = js.native
    def preventDefault(): Unit = js.native
    def setBubbles(bubbles: Boolean): Unit = js.native
    def setCancelable(cancelable: Boolean): Unit = js.native
    def setCurrentTarget(currentTarget: HTMLElement): Unit = js.native
    def setEventPhase(eventPhase: Int): Unit = js.native
    def setOriginalTarget(originalTarget: HTMLElement): Unit = js.native
    def setRelatedTarget(relatedTarget: HTMLElement): Unit = js.native
    def setTarget(target: HTMLElement): Unit = js.native
    def setType(`type`: String): Unit = js.native
    def stop(): Unit = js.native
    def stopPropagation(): Unit = js.native

}
}
package qx.event.`type` {
@js.native
@JSName("qx.event.`type`.Focus")
class Focus extends qx.event.`type`.Event {

}
}
package qx.event.`type` {
@js.native
@JSName("qx.event.`type`.GeoPosition")
class GeoPosition extends qx.event.`type`.Event {
    def getAccuracy(): Long = js.native
    def getAltitude(): Long = js.native
    def getAltitudeAccuracy(): Long = js.native
    def getHeading(): js.Dynamic = js.native
    def getLatitude(): Long = js.native
    def getLongitude(): Long = js.native
    def getSpeed(): js.Dynamic = js.native
    def getTimestamp(): Long = js.native
    protected def initAccuracy(value: js.Any): Long = js.native
    protected def initAltitude(value: js.Any): Long = js.native
    protected def initAltitudeAccuracy(value: js.Any): Long = js.native
    protected def initHeading(value: js.Any): js.Dynamic = js.native
    protected def initLatitude(value: js.Any): Long = js.native
    protected def initLongitude(value: js.Any): Long = js.native
    protected def initSpeed(value: js.Any): js.Dynamic = js.native
    protected def initTimestamp(value: js.Any): Long = js.native
    def resetAccuracy(): Unit = js.native
    def resetAltitude(): Unit = js.native
    def resetAltitudeAccuracy(): Unit = js.native
    def resetHeading(): Unit = js.native
    def resetLatitude(): Unit = js.native
    def resetLongitude(): Unit = js.native
    def resetSpeed(): Unit = js.native
    def resetTimestamp(): Unit = js.native
    def setAccuracy(value: js.Any): Long = js.native
    def setAltitude(value: js.Any): Long = js.native
    def setAltitudeAccuracy(value: js.Any): Long = js.native
    def setHeading(value: js.Any): js.Dynamic = js.native
    def setLatitude(value: js.Any): Long = js.native
    def setLongitude(value: js.Any): Long = js.native
    def setSpeed(value: js.Any): js.Dynamic = js.native
    def setTimestamp(value: js.Any): Long = js.native

}
}
package qx.event.`type` {
@js.native
@JSName("qx.event.`type`.KeyInput")
class KeyInput extends qx.event.`type`.Dom {
    def getChar(): String = js.native
    def getCharCode(): Int = js.native

}
}
package qx.event.`type` {
@js.native
@JSName("qx.event.`type`.KeySequence")
class KeySequence extends qx.event.`type`.Dom {
    def getKeyCode(): Long = js.native
    def getKeyIdentifier(): String = js.native
    def isPrintable(): Boolean = js.native

}
}
package qx.event.`type` {
@js.native
@JSName("qx.event.`type`.Mouse")
class Mouse extends qx.event.`type`.Dom {
    def getButton(): String = js.native
    def getDocumentLeft(): Int = js.native
    def getDocumentTop(): Int = js.native
    def getScreenLeft(): Int = js.native
    def getScreenTop(): Int = js.native
    def getViewportLeft(): Int = js.native
    def getViewportTop(): Int = js.native
    def isLeftPressed(): Boolean = js.native
    def isMiddlePressed(): Boolean = js.native
    def isRightPressed(): Boolean = js.native

}
}
package qx.event.`type` {
@js.native
@JSName("qx.event.`type`.MouseWheel")
class MouseWheel extends qx.event.`type`.Mouse {
    def getWheelDelta(axis: String = ???): Int = js.native

}
}
package qx.event.`type` {
@js.native
@JSName("qx.event.`type`.Native")
class Native extends qx.event.`type`.Event {
    protected def _cloneNativeEvent(nativeEvent: qx.event.`type`.Event, clone: js.Any): js.Dynamic = js.native
    def getNativeEvent(): qx.event.`type`.Event = js.native
    def getReturnValue(): String = js.native
    def setReturnValue(returnValue: String = ???): Unit = js.native

}
}
package qx.event.`type` {
@js.native
@JSName("qx.event.`type`.Orientation")
class Orientation extends qx.event.`type`.Event {
    def getOrientation(): Int = js.native
    def isLandscape(): Boolean = js.native
    def isPortrait(): Boolean = js.native

}
}
package qx.event.`type` {
@js.native
@JSName("qx.event.`type`.Pinch")
class Pinch extends qx.event.`type`.Pointer {
    def getScale(): Float = js.native

}
}
package qx.event.`type` {
@js.native
@JSName("qx.event.`type`.Pointer")
class Pointer extends qx.event.`type`.Mouse {
    def getHeight(): Long = js.native
    def getPointerId(): Long = js.native
    def getPointerType(): String = js.native
    def getPressure(): Long = js.native
    def getTiltX(): Long = js.native
    def getTiltY(): Long = js.native
    def getWidth(): Long = js.native
    def isPrimary(): Boolean = js.native

}
}
package qx.event.`type` {
@js.native
@JSName("qx.event.`type`.Rest")
class Rest extends qx.event.`type`.Data {
    def getAction(): String = js.native
    def getId(): Long = js.native
    def getPhase(): String = js.native
    def getRequest(): qx.io.request.AbstractRequest = js.native
    protected def initAction(value: js.Any): String = js.native
    protected def initId(value: js.Any): Long = js.native
    protected def initPhase(value: js.Any): String = js.native
    protected def initRequest(value: js.Any): qx.io.request.AbstractRequest = js.native
    def resetAction(): Unit = js.native
    def resetId(): Unit = js.native
    def resetPhase(): Unit = js.native
    def resetRequest(): Unit = js.native
    def setAction(value: js.Any): String = js.native
    def setId(value: js.Any): Long = js.native
    def setPhase(value: js.Any): String = js.native
    def setRequest(value: js.Any): qx.io.request.AbstractRequest = js.native

}
}
package qx.event.`type` {
@js.native
@JSName("qx.event.`type`.Roll")
class Roll extends qx.event.`type`.Pointer {
    def getDelta(): js.Dynamic = js.native
    def getMomentum(): Boolean = js.native
    def stopMomentum(): Unit = js.native

}
}
package qx.event.`type` {
@js.native
@JSName("qx.event.`type`.Rotate")
class Rotate extends qx.event.`type`.Pointer {
    def getAngle(): Long = js.native

}
}
package qx.event.`type` {
@js.native
@JSName("qx.event.`type`.Swipe")
class Swipe extends qx.event.`type`.Pointer {
    def getAxis(): String = js.native
    def getDirection(): String = js.native
    def getDistance(): Int = js.native
    def getDuration(): Int = js.native
    def getStartTime(): Int = js.native
    def getVelocity(): Long = js.native

}
}
package qx.event.`type` {
@js.native
@JSName("qx.event.`type`.Tap")
class Tap extends qx.event.`type`.Pointer {

}
}
package qx.event.`type` {
@js.native
@JSName("qx.event.`type`.Touch")
class Touch extends qx.event.`type`.Dom {
    protected def _isTouchEnd(): Boolean = js.native
    def getAllTouches(): js.Array[js.Dynamic] = js.native
    def getChangedTargetTouches(): js.Array[js.Dynamic] = js.native
    def getDelta(): qx.data.Array = js.native
    def getDocumentLeft(touchIndex: Int = ???): Int = js.native
    def getDocumentTop(touchIndex: Int = ???): Int = js.native
    def getIdentifier(touchIndex: Int = ???): Int = js.native
    def getRotation(): Float = js.native
    def getScale(): Float = js.native
    def getScreenLeft(touchIndex: Int = ???): Int = js.native
    def getScreenTop(touchIndex: Int = ???): Int = js.native
    def getTargetTouches(): js.Array[js.Dynamic] = js.native
    def getViewportLeft(touchIndex: Int = ???): Int = js.native
    def getViewportTop(touchIndex: Int = ???): Int = js.native
    def isMultiTouch(): Boolean = js.native

}
}
package qx.event.`type` {
@js.native
@JSName("qx.event.`type`.Track")
class Track extends qx.event.`type`.Pointer {
    def getDelta(): js.Dynamic = js.native

}
}
package qx.event.`type`.dom {
@js.native
@JSName("qx.event.`type`.dom.Custom")
class Custom protected () extends js.Object {
    def this(`type`: String = ???, domEvent: qx.event.`type`.Event = ???, customProps: js.Any = ???) = this()
    protected def _createEvent(): qx.event.`type`.Event = js.native
    protected def _initEvent(domEvent: qx.event.`type`.Event, customProps: js.Any = ???): Unit = js.native

}
}
package qx.event.`type`.dom {
@js.native
@JSName("qx.event.`type`.dom.Pointer")
class Pointer protected () extends qx.event.`type`.dom.Custom {
    def this(`type`: js.Any = ???, domEvent: js.Any = ???, customProps: js.Any = ???) = this()

}
@js.native
@JSName("qx.event.`type`.dom.Pointer")
object Pointer extends js.Object {
    def getDocumentLeft(): Long = js.native
    def getDocumentTop(): Long = js.native
    def getPointerType(): String = js.native
    def getScreenLeft(): Long = js.native
    def getScreenTop(): Long = js.native
    def getViewportLeft(): Long = js.native
    def getViewportTop(): Long = js.native
    def normalize(event: qx.event.`type`.Event): Unit = js.native

}
}
package qx.event.util {
@js.native
@JSName("qx.event.util.Keyboard")
class Keyboard extends js.Object {

}
@js.native
@JSName("qx.event.util.Keyboard")
object Keyboard extends js.Object {
    def charCodeToIdentifier(charCode: String): String = js.native
    def isIdentifiableKeyCode(keyCode: String): Boolean = js.native
    def isNonPrintableKeyCode(keyCode: String): Boolean = js.native
    def isPrintableKeyIdentifier(keyIdentifier: String): Boolean = js.native
    def isValidKeyIdentifier(keyIdentifier: String): Boolean = js.native
    def keyCodeToIdentifier(keyCode: Int): String = js.native

}
}
package qx.html {
@js.native
@JSName("qx.html.Blocker")
class Blocker protected () extends qx.html.Element {
    def this(backgroundColor: String = ???, opacity: Long = ???) = this()
    protected def _stopPropagation(e: qx.event.`type`.Mouse): Unit = js.native

}
}
package qx.html {
@js.native
@JSName("qx.html.Canvas")
class Canvas protected () extends qx.html.Element {
    def this(styles: js.Any = ???, attributes: js.Any = ???) = this()
    def getCanvas(): HTMLElement = js.native
    def getContext2d(): CanvasRenderingContext2D = js.native
    def getHeight(): Int = js.native
    def getWidth(): Int = js.native
    def setHeight(height: Int): Unit = js.native
    def setWidth(width: Int): Unit = js.native

}
}
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
//    override def addListener(`type`: String, listener: js.Function, self: js.Any = ???, capture: Boolean = ???): js.Dynamic = js.native
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
    def getChildren(): qx.data.Array = js.native
    def getDomElement(): HTMLElement = js.native
    def getListeners(): js.Array[js.Any] = js.native
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
	override def hasListener(`type`: String, capture: Boolean = ???): Boolean = js.native
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
//	override def removeListener(`type`: String, listener: js.Function, self: js.Any, capture: Boolean = ???): qx.html.Element = js.native
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
package qx.html {
@js.native
@JSName("qx.html.Flash")
class Flash protected () extends qx.html.Element {
    def this(styles: js.Any = ???, attributes: js.Any = ???) = this()
    def createFlash(): Unit = js.native
    def getAttributes(): js.Dynamic = js.native
    def getFlashElement(): HTMLElement = js.native
    def getParams(): js.Dynamic = js.native
    def getVariables(): js.Dynamic = js.native
    def setId(value: String): Unit = js.native
    def setParam(key: String, value: String): Unit = js.native
    def setSource(value: String): Unit = js.native
    def setVariables(value: js.Any): Unit = js.native

}
}
package qx.html {
@js.native
@JSName("qx.html.Iframe")
class Iframe protected () extends qx.html.Element {
    def this(url: String = ???, styles: js.Any = ???, attributes: js.Any = ???) = this()
    def getBody(): HTMLElement = js.native
    def getDocument(): Document = js.native
    def getName(): String = js.native
    def getSource(): String = js.native
    def getWindow(): Window = js.native
    def reload(): Unit = js.native
    def setName(name: String): qx.html.Iframe = js.native
    def setSource(source: String): qx.html.Iframe = js.native

}
}
package qx.html {
@js.native
@JSName("qx.html.Image")
class Image extends qx.html.Element {
    def getScale(): Boolean = js.native
    def getSource(): String = js.native
    def resetSource(): qx.html.Image = js.native
    def setPadding(paddingLeft: Int, paddingTop: Int): Unit = js.native
    def setScale(value: Boolean): qx.html.Label = js.native
    def setSource(value: Boolean): qx.html.Label = js.native

}
}
package qx.html {
@js.native
@JSName("qx.html.Input")
class Input protected () extends qx.html.Element {
    def this(`type`: String = ???, styles: js.Any = ???, attributes: js.Any = ???) = this()
    def getValue(): String = js.native
    def getWrap(): Boolean = js.native
    def setEnabled(value: Boolean): Unit = js.native
    def setValue(value: js.Any): qx.html.Input = js.native
    def setWrap(wrap: Boolean, direct: Boolean = ???): qx.html.Input = js.native

}
}
package qx.html {
@js.native
@JSName("qx.html.Label")
class Label extends qx.html.Element {
    def getValue(): String = js.native
    def setRich(value: Boolean): qx.html.Label = js.native
    def setValue(value: String): qx.html.Label = js.native

}
}
package qx.html {
@js.native
@JSName("qx.html.Root")
class Root protected () extends qx.html.Element {
    def this(elem: HTMLElement = ???) = this()

}
}
package qx.io {
@js.native
@JSName("qx.io.ImageLoader")
class ImageLoader extends js.Object {

}
@js.native
@JSName("qx.io.ImageLoader")
object ImageLoader extends js.Object {
    def abort(source: String): Unit = js.native
    def dispose(): Unit = js.native
    def getFormat(source: String): String = js.native
    def getHeight(source: String): Int = js.native
    def getSize(source: String): js.Dynamic = js.native
    def getWidth(source: String): Int = js.native
    def isFailed(source: String): Boolean = js.native
    def isLoaded(source: String): Boolean = js.native
    def isLoading(source: String): Boolean = js.native
    def load(source: String, callback: js.Function = ???, context: js.Any = ???): Unit = js.native

}
}
package qx.io {
@js.native
@JSName("qx.io.PartLoader")
class PartLoader extends qx.core.Object {
    def getPart(name: String): qx.io.part.Part = js.native
    def getParts(): js.Dynamic = js.native
    def hasPart(name: String): Boolean = js.native
    def require(partNames: String, callback: js.Function, self: js.Any = ???): Unit = js.native

}
@js.native
@JSName("qx.io.PartLoader")
object PartLoader extends js.Object {
    def getInstance(): qx.io.PartLoader = js.native

}
}
package qx.io.part {
@js.native
@JSName("qx.io.part.ClosurePart")
class ClosurePart protected () extends qx.io.part.Part {
    def this(name: String = ???, packages: js.Array[js.Any] = ???, loader: qx.Part = ???) = this()
    protected def _onPackageLoad(pkg: qx.io.part.Package): Unit = js.native

}
}
package qx.io.part {
@js.native
@JSName("qx.io.part.Package")
class Package protected () extends js.Object {
    def this(urls: js.Array[String] = ???, id: js.Any = ???, loaded: Boolean = ???) = this()
    def execute(): Unit = js.native
    def getId(): String = js.native
    def getReadyState(): String = js.native
    def getUrls(): js.Array[String] = js.native
    def load(notifyPackageResult: js.Function, self: js.Any = ???): Unit = js.native
    def loadClosure(notifyPackageResult: js.Function, self: js.Any = ???): Unit = js.native
    def saveClosure(closure: js.Function): Unit = js.native

}
}
package qx.io.part {
@js.native
@JSName("qx.io.part.Part")
class Part protected () extends js.Object {
    def this(name: String = ???, packages: js.Array[js.Any] = ???, loader: qx.Part = ???) = this()
    protected def _appendPartListener(callback: js.Function, self: js.Any = ???, part: qx.io.part.Part = ???): Unit = js.native
    protected def _checkCompleteLoading(callback: js.Function, self: js.Any): Boolean = js.native
    protected def _markAsCompleted(readyState: String): Unit = js.native
    protected def _signalStartup(): Unit = js.native
    def getName(): String = js.native
    def getPackages(): js.Array[qx.io.part.Package] = js.native
    def getReadyState(): String = js.native
    def load(callback: js.Function, self: js.Any = ???): Unit = js.native
    def preload(callback: js.Function, self: js.Any = ???): Unit = js.native

}
}
package qx.io.remote {
@js.native
@JSName("qx.io.remote.Exchange")
class Exchange protected () extends qx.core.Object {
    def this(vRequest: qx.io.remote.Request = ???) = this()
    protected def _applyImplementation(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyState(value: js.Any, old: js.Any): Unit = js.native
    protected def _onabort(e: qx.event.`type`.Event): Unit = js.native
    protected def _oncompleted(e: qx.event.`type`.Event): Unit = js.native
    protected def _onfailed(e: qx.event.`type`.Event): Unit = js.native
    protected def _onreceiving(e: qx.event.`type`.Event): Unit = js.native
    protected def _onsending(e: qx.event.`type`.Event): Unit = js.native
    protected def _ontimeout(e: qx.event.`type`.Event): Unit = js.native
    def abort(): Unit = js.native
    def getImplementation(): qx.io.remote.transport.Abstract = js.native
    def getRequest(): qx.io.remote.Request = js.native
    def getState(): js.Dynamic = js.native
    protected def initImplementation(value: js.Any): qx.io.remote.transport.Abstract = js.native
    protected def initRequest(value: js.Any): qx.io.remote.Request = js.native
    protected def initState(value: js.Any): js.Dynamic = js.native
    def resetImplementation(): Unit = js.native
    def resetRequest(): Unit = js.native
    def resetState(): Unit = js.native
    def send(): js.Dynamic = js.native
    def setImplementation(value: js.Any): qx.io.remote.transport.Abstract = js.native
    def setRequest(value: js.Any): qx.io.remote.Request = js.native
    def setState(value: js.Any): js.Dynamic = js.native
    def timeout(): Unit = js.native

}
@js.native
@JSName("qx.io.remote.Exchange")
object Exchange extends js.Object {
    def canHandle(vImpl: js.Any, vNeeds: js.Any, vResponseType: String): Boolean = js.native
    def initTypes(): Unit = js.native
    def registerType(vClass: js.Any, vId: String): Unit = js.native
    def statusCodeToString(vStatusCode: Int): String = js.native
    def wasSuccessful(vStatusCode: Int, vReadyState: String, vIsLocal: Boolean): Boolean = js.native

}
}
package qx.io.remote {
@js.native
@JSName("qx.io.remote.Request")
class Request protected () extends qx.core.Object {
    def this(vUrl: String = ???, vMethod: String = ???, vResponseType: String = ???) = this()
    protected def _applyMethod(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyProhibitCaching(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyResponseType(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyState(value: js.Any, old: js.Any): Unit = js.native
    protected def _onaborted(e: qx.event.`type`.Event): Unit = js.native
    protected def _oncompleted(e: qx.event.`type`.Event): Unit = js.native
    protected def _onfailed(e: qx.event.`type`.Event): Unit = js.native
    protected def _onqueued(e: qx.event.`type`.Event): Unit = js.native
    protected def _onreceiving(e: qx.event.`type`.Event): Unit = js.native
    protected def _onsending(e: qx.event.`type`.Event): Unit = js.native
    protected def _ontimeout(e: qx.event.`type`.Event): Unit = js.native
    def abort(): Unit = js.native
    def getAsynchronous(): Boolean = js.native
    def getCrossDomain(): Boolean = js.native
    def getData(): String = js.native
    def getFileUpload(): Boolean = js.native
    def getFormField(vId: String): String = js.native
    def getFormFields(): js.Dynamic = js.native
    def getMethod(): js.Dynamic = js.native
    def getParameter(vId: String, bFromData: Boolean): js.Dynamic = js.native
    def getParameters(bFromData: Boolean): js.Dynamic = js.native
    def getParseJson(): Boolean = js.native
    def getPassword(): String = js.native
    def getProhibitCaching(): js.Dynamic = js.native
    def getRequestHeader(vId: String): String = js.native
    def getRequestHeaders(): js.Dynamic = js.native
    def getResponseType(): js.Dynamic = js.native
    def getSequenceNumber(): Int = js.native
    def getState(): js.Dynamic = js.native
    def getTimeout(): Int = js.native
    def getTransport(): qx.io.remote.Exchange = js.native
    def getUrl(): String = js.native
    def getUseBasicHttpAuth(): Boolean = js.native
    def getUsername(): String = js.native
    protected def initAsynchronous(value: js.Any): Boolean = js.native
    protected def initCrossDomain(value: js.Any): Boolean = js.native
    protected def initData(value: js.Any): String = js.native
    protected def initFileUpload(value: js.Any): Boolean = js.native
    protected def initMethod(value: js.Any): js.Dynamic = js.native
    protected def initParseJson(value: js.Any): Boolean = js.native
    protected def initPassword(value: js.Any): String = js.native
    protected def initProhibitCaching(value: js.Any): js.Dynamic = js.native
    protected def initResponseType(value: js.Any): js.Dynamic = js.native
    protected def initState(value: js.Any): js.Dynamic = js.native
    protected def initTimeout(value: js.Any): Int = js.native
    protected def initTransport(value: js.Any): qx.io.remote.Exchange = js.native
    protected def initUrl(value: js.Any): String = js.native
    protected def initUseBasicHttpAuth(value: js.Any): Boolean = js.native
    protected def initUsername(value: js.Any): String = js.native
    def isAborted(): Boolean = js.native
    def isAsynchronous(): Boolean = js.native
    def isCompleted(): Boolean = js.native
    def isConfigured(): Boolean = js.native
    def isCrossDomain(): Boolean = js.native
    def isFailed(): Boolean = js.native
    def isFileUpload(): Boolean = js.native
    def isParseJson(): Boolean = js.native
    def isQueued(): Boolean = js.native
    def isReceiving(): Boolean = js.native
    def isSending(): Boolean = js.native
    def isTimeout(): Boolean = js.native
    def isUseBasicHttpAuth(): Boolean = js.native
    def removeFormField(vId: String): Unit = js.native
    def removeParameter(vId: String, bFromData: Boolean): Unit = js.native
    def removeRequestHeader(vId: String): Unit = js.native
    def reset(): Unit = js.native
    def resetAsynchronous(): Unit = js.native
    def resetCrossDomain(): Unit = js.native
    def resetData(): Unit = js.native
    def resetFileUpload(): Unit = js.native
    def resetMethod(): Unit = js.native
    def resetParseJson(): Unit = js.native
    def resetPassword(): Unit = js.native
    def resetProhibitCaching(): Unit = js.native
    def resetResponseType(): Unit = js.native
    def resetState(): Unit = js.native
    def resetTimeout(): Unit = js.native
    def resetTransport(): Unit = js.native
    def resetUrl(): Unit = js.native
    def resetUseBasicHttpAuth(): Unit = js.native
    def resetUsername(): Unit = js.native
    def send(): Unit = js.native
    def setAsynchronous(value: js.Any): Boolean = js.native
    def setCrossDomain(value: js.Any): Boolean = js.native
    def setData(value: js.Any): String = js.native
    def setFileUpload(value: js.Any): Boolean = js.native
    def setFormField(vId: String, vValue: String): Unit = js.native
    def setMethod(value: js.Any): js.Dynamic = js.native
    def setParameter(vId: String, vValue: js.Any, bAsData: Boolean): Unit = js.native
    def setParseJson(value: js.Any): Boolean = js.native
    def setPassword(value: js.Any): String = js.native
    def setProhibitCaching(value: js.Any): js.Dynamic = js.native
    def setRequestHeader(vId: String, vValue: String): Unit = js.native
    def setResponseType(value: js.Any): js.Dynamic = js.native
    def setState(value: js.Any): js.Dynamic = js.native
    def setTimeout(value: js.Any): Int = js.native
    def setTransport(value: js.Any): qx.io.remote.Exchange = js.native
    def setUrl(value: js.Any): String = js.native
    def setUseBasicHttpAuth(value: js.Any): Boolean = js.native
    def setUsername(value: js.Any): String = js.native
    def toggleAsynchronous(): Boolean = js.native
    def toggleCrossDomain(): Boolean = js.native
    def toggleFileUpload(): Boolean = js.native
    def toggleParseJson(): Boolean = js.native
    def toggleUseBasicHttpAuth(): Boolean = js.native

}
@js.native
@JSName("qx.io.remote.Request")
object Request extends js.Object {
    def methodAllowsRequestBody(httpMethod: String): Boolean = js.native

}
}
package qx.io.remote {
@js.native
@JSName("qx.io.remote.RequestQueue")
class RequestQueue extends qx.core.Object {
    protected def _applyEnabled(value: Boolean, old: Boolean): Unit = js.native
    protected def _check(): Unit = js.native
    protected def _debug(): Unit = js.native
    protected def _oncompleted(e: qx.event.`type`.Event): Unit = js.native
    protected def _oninterval(e: qx.event.`type`.Event): Unit = js.native
    protected def _onreceiving(e: qx.event.`type`.Event): Unit = js.native
    protected def _onsending(e: qx.event.`type`.Event): Unit = js.native
    protected def _remove(vTransport: qx.io.remote.Exchange): Unit = js.native
    def abort(vRequest: js.Any): Unit = js.native
    def add(vRequest: js.Any): Unit = js.native
    def getActiveQueue(): js.Array[js.Dynamic] = js.native
    def getDefaultTimeout(): Int = js.native
    def getEnabled(): Boolean = js.native
    def getMaxConcurrentRequests(): Int = js.native
    def getMaxTotalRequests(): Int = js.native
    def getRequestQueue(): js.Array[js.Dynamic] = js.native
    protected def initDefaultTimeout(value: js.Any): Int = js.native
    protected def initEnabled(value: js.Any): Boolean = js.native
    protected def initMaxConcurrentRequests(value: js.Any): Int = js.native
    protected def initMaxTotalRequests(value: js.Any): Int = js.native
    def isEnabled(): Boolean = js.native
    def resetDefaultTimeout(): Unit = js.native
    def resetEnabled(): Unit = js.native
    def resetMaxConcurrentRequests(): Unit = js.native
    def resetMaxTotalRequests(): Unit = js.native
    def setDefaultTimeout(value: js.Any): Int = js.native
    def setEnabled(value: js.Any): Boolean = js.native
    def setMaxConcurrentRequests(value: js.Any): Int = js.native
    def setMaxTotalRequests(value: js.Any): Int = js.native
    def toggleEnabled(): Boolean = js.native

}
@js.native
@JSName("qx.io.remote.RequestQueue")
object RequestQueue extends js.Object {
    def getInstance(): qx.io.remote.RequestQueue = js.native

}
}
package qx.io.remote {
@js.native
@JSName("qx.io.remote.Response")
class Response extends qx.event.`type`.Event {
    protected def _applyResponseHeaders(value: js.Any, old: js.Any): Unit = js.native
    def getContent(): js.Dynamic = js.native
    def getResponseHeader(vHeader: String): js.Dynamic = js.native
    def getResponseHeaders(): js.Dynamic = js.native
    def getState(): Int = js.native
    def getStatusCode(): Int = js.native
    protected def initContent(value: js.Any): js.Dynamic = js.native
    protected def initResponseHeaders(value: js.Any): js.Dynamic = js.native
    protected def initState(value: js.Any): Int = js.native
    protected def initStatusCode(value: js.Any): Int = js.native
    def resetContent(): Unit = js.native
    def resetResponseHeaders(): Unit = js.native
    def resetState(): Unit = js.native
    def resetStatusCode(): Unit = js.native
    def setContent(value: js.Any): js.Dynamic = js.native
    def setResponseHeaders(value: js.Any): js.Dynamic = js.native
    def setState(value: js.Any): Int = js.native
    def setStatusCode(value: js.Any): Int = js.native

}
}
package qx.io.remote {
@js.native
@JSName("qx.io.remote.Rpc")
class Rpc protected () extends qx.core.Object {
    def this(url: String = ???, serviceName: String = ???) = this()
    protected def _callInternal(args: qx.data.Array, callType: Int, refreshSession: Boolean): js.Dynamic = js.native
    protected def _isConvertDates(): Boolean = js.native
    protected def _isResponseJson(): Boolean = js.native
    def abort(opaqueCallRef: js.Any): Unit = js.native
    def callAsync(handler: js.Function, methodName: String): js.Dynamic = js.native
    def callAsyncListeners(coalesce: Boolean, methodName: String): js.Dynamic = js.native
    def callSync(methodName: String): js.Dynamic = js.native
    def createRequest(): qx.io.remote.Request = js.native
    def createRpcData(id: Int, method: String, parameters: qx.data.Array, serverData: js.Any): js.Dynamic = js.native
    def fixUrl(url: String): String = js.native
    def getCrossDomain(): Boolean = js.native
    def getPassword(): String = js.native
    def getProtocol(): js.Dynamic = js.native
    def getServerData(): js.Dynamic = js.native
    def getServiceName(): String = js.native
    def getTimeout(): Int = js.native
    def getUrl(): String = js.native
    def getUseBasicHttpAuth(): Boolean = js.native
    def getUsername(): String = js.native
    protected def initCrossDomain(value: js.Any): Boolean = js.native
    protected def initPassword(value: js.Any): String = js.native
    protected def initProtocol(value: js.Any): js.Dynamic = js.native
    protected def initServerData(value: js.Any): js.Dynamic = js.native
    protected def initServiceName(value: js.Any): String = js.native
    protected def initTimeout(value: js.Any): Int = js.native
    protected def initUrl(value: js.Any): String = js.native
    protected def initUseBasicHttpAuth(value: js.Any): Boolean = js.native
    protected def initUsername(value: js.Any): String = js.native
    def isCrossDomain(): Boolean = js.native
    def isUseBasicHttpAuth(): Boolean = js.native
    def refreshSession(handler: js.Function): Unit = js.native
    def resetCrossDomain(): Unit = js.native
    def resetPassword(): Unit = js.native
    def resetProtocol(): Unit = js.native
    def resetServerData(): Unit = js.native
    def resetServiceName(): Unit = js.native
    def resetTimeout(): Unit = js.native
    def resetUrl(): Unit = js.native
    def resetUseBasicHttpAuth(): Unit = js.native
    def resetUsername(): Unit = js.native
    def setCrossDomain(value: js.Any): Boolean = js.native
    def setPassword(value: js.Any): String = js.native
    def setProtocol(value: js.Any): js.Dynamic = js.native
    def setServerData(value: js.Any): js.Dynamic = js.native
    def setServiceName(value: js.Any): String = js.native
    def setTimeout(value: js.Any): Int = js.native
    def setUrl(value: js.Any): String = js.native
    def setUseBasicHttpAuth(value: js.Any): Boolean = js.native
    def setUsername(value: js.Any): String = js.native
    def toggleCrossDomain(): Boolean = js.native
    def toggleUseBasicHttpAuth(): Boolean = js.native

}
@js.native
@JSName("qx.io.remote.Rpc")
object Rpc extends js.Object {
    def makeServerURL(instanceId: String = ???): String = js.native

}
}
package qx.io.remote {
@js.native
@JSName("qx.io.remote.RpcError")
class RpcError extends js.Object {

}
}
package qx.io.remote.transport {
@js.native
@JSName("qx.io.remote.transport.Abstract")
class Abstract extends qx.core.Object {
    protected def _applyState(value: js.Any, old: js.Any): Unit = js.native
    def abort(): Unit = js.native
    def failed(): Unit = js.native
    def getAsynchronous(): Boolean = js.native
    def getData(): String = js.native
    def getFetchedLength(): Int = js.native
    def getFormFields(): js.Dynamic = js.native
    def getMethod(): String = js.native
    def getParameters(): js.Dynamic = js.native
    def getPassword(): String = js.native
    def getRequestHeaders(): js.Dynamic = js.native
    def getResponseHeader(vLabel: String): js.Dynamic = js.native
    def getResponseHeaders(): js.Dynamic = js.native
    def getResponseText(): String = js.native
    def getResponseType(): String = js.native
    def getResponseXml(): js.Dynamic = js.native
    def getState(): js.Dynamic = js.native
    def getStatusCode(): Int = js.native
    def getStatusText(): String = js.native
    def getUrl(): String = js.native
    def getUseBasicHttpAuth(): Boolean = js.native
    def getUsername(): String = js.native
    protected def initAsynchronous(value: js.Any): Boolean = js.native
    protected def initData(value: js.Any): String = js.native
    protected def initFormFields(value: js.Any): js.Dynamic = js.native
    protected def initMethod(value: js.Any): String = js.native
    protected def initParameters(value: js.Any): js.Dynamic = js.native
    protected def initPassword(value: js.Any): String = js.native
    protected def initRequestHeaders(value: js.Any): js.Dynamic = js.native
    protected def initResponseType(value: js.Any): String = js.native
    protected def initState(value: js.Any): js.Dynamic = js.native
    protected def initUrl(value: js.Any): String = js.native
    protected def initUseBasicHttpAuth(value: js.Any): Boolean = js.native
    protected def initUsername(value: js.Any): String = js.native
    def isAsynchronous(): Boolean = js.native
    def isUseBasicHttpAuth(): Boolean = js.native
    def resetAsynchronous(): Unit = js.native
    def resetData(): Unit = js.native
    def resetFormFields(): Unit = js.native
    def resetMethod(): Unit = js.native
    def resetParameters(): Unit = js.native
    def resetPassword(): Unit = js.native
    def resetRequestHeaders(): Unit = js.native
    def resetResponseType(): Unit = js.native
    def resetState(): Unit = js.native
    def resetUrl(): Unit = js.native
    def resetUseBasicHttpAuth(): Unit = js.native
    def resetUsername(): Unit = js.native
    def send(): Unit = js.native
    def setAsynchronous(value: js.Any): Boolean = js.native
    def setData(value: js.Any): String = js.native
    def setFormFields(value: js.Any): js.Dynamic = js.native
    def setMethod(value: js.Any): String = js.native
    def setParameters(value: js.Any): js.Dynamic = js.native
    def setPassword(value: js.Any): String = js.native
    def setRequestHeader(vLabel: String, vValue: js.Any): Unit = js.native
    def setRequestHeaders(value: js.Any): js.Dynamic = js.native
    def setResponseType(value: js.Any): String = js.native
    def setState(value: js.Any): js.Dynamic = js.native
    def setUrl(value: js.Any): String = js.native
    def setUseBasicHttpAuth(value: js.Any): Boolean = js.native
    def setUsername(value: js.Any): String = js.native
    def timeout(): Unit = js.native
    def toggleAsynchronous(): Boolean = js.native
    def toggleUseBasicHttpAuth(): Boolean = js.native

}
}
package qx.io.remote.transport {
@js.native
@JSName("qx.io.remote.transport.Iframe")
class Iframe extends qx.io.remote.transport.Abstract {
    protected def _onload(e: qx.event.`type`.Event): Unit = js.native
    protected def _onreadystatechange(e: qx.event.`type`.Event): Unit = js.native
    protected def _switchReadyState(vReadyState: String): Unit = js.native
    def getIframeBody(): js.Dynamic = js.native
    def getIframeDocument(): js.Dynamic = js.native
    def getIframeHtmlContent(): String = js.native
    def getIframeTextContent(): String = js.native
    def getIframeWindow(): js.Dynamic = js.native
    def getResponseContent(): js.Dynamic = js.native

}
@js.native
@JSName("qx.io.remote.transport.Iframe")
object Iframe extends js.Object {
    def isSupported(): Boolean = js.native

}
}
package qx.io.remote.transport {
@js.native
@JSName("qx.io.remote.transport.Script")
class Script extends qx.io.remote.transport.Abstract {
    protected def _switchReadyState(vReadyState: String): Unit = js.native
    def getResponseContent(): js.Dynamic = js.native

}
@js.native
@JSName("qx.io.remote.transport.Script")
object Script extends js.Object {
    protected def _requestFinished(id: String, content: String): Unit = js.native
    def isSupported(): Boolean = js.native

}
}
package qx.io.remote.transport {
@js.native
@JSName("qx.io.remote.transport.XmlHttp")
class XmlHttp extends qx.io.remote.transport.Abstract {
    protected def _onreadystatechange(e: qx.event.`type`.Event): Unit = js.native
    def failedLocally(): Unit = js.native
    def getParseJson(): Boolean = js.native
    def getReadyState(): Int = js.native
    def getRequest(): js.Dynamic = js.native
    def getResponseContent(): js.Dynamic = js.native
    def getStringResponseHeaders(): js.Dynamic = js.native
    protected def initParseJson(value: js.Any): Boolean = js.native
    def isParseJson(): Boolean = js.native
    def resetParseJson(): Unit = js.native
    def setParseJson(value: js.Any): Boolean = js.native
    def toggleParseJson(): Boolean = js.native

}
@js.native
@JSName("qx.io.remote.transport.XmlHttp")
object XmlHttp extends js.Object {
    def createRequestObject(): js.Dynamic = js.native
    def isSupported(): Boolean = js.native

}
}
package qx.io.request {
@js.native
@JSName("qx.io.request.AbstractRequest")
class AbstractRequest protected () extends qx.core.Object {
    def this(url: String = ???) = this()
    protected def _createTransport(): js.Dynamic = js.native
    protected def _fireStatefulEvent(evt: String): Unit = js.native
    protected def _getAllRequestHeaders(): js.Dynamic = js.native
    protected def _getConfiguredRequestHeaders(): js.Dynamic = js.native
    protected def _getConfiguredUrl(): String = js.native
    protected def _getMethod(): String = js.native
    protected def _getParsedResponse(): String = js.native
    protected def _isAsync(): Boolean = js.native
    protected def _onAbort(): Unit = js.native
    protected def _onError(): Unit = js.native
    protected def _onLoad(): Unit = js.native
    protected def _onLoadEnd(): Unit = js.native
    protected def _onReadyStateChange(): Unit = js.native
    protected def _onTimeout(): Unit = js.native
    protected def _serializeData(data: String): String = js.native
    protected def _setPhase(phase: String): Unit = js.native
    protected def _setRequestHeaders(): Unit = js.native
    protected def _setResponse(response: String): Unit = js.native
    def abort(): Unit = js.native
    def getAllResponseHeaders(): String = js.native
    def getAuthentication(): qx.io.request.authentication.IAuthentication = js.native
    def getPhase(): String = js.native
    def getReadyState(): Long = js.native
    def getRequestData(): js.Dynamic = js.native
    def getRequestHeader(key: String): String = js.native
    def getResponse(): String = js.native
    def getResponseContentType(): String = js.native
    def getResponseHeader(key: String): String = js.native
    def getResponseText(): String = js.native
    def getStatus(): Long = js.native
    def getStatusText(): String = js.native
    def getTimeout(): Long = js.native
    def getTransport(): js.Dynamic = js.native
    def getUrl(): String = js.native
    protected def initAuthentication(value: js.Any): qx.io.request.authentication.IAuthentication = js.native
    protected def initRequestData(value: js.Any): js.Dynamic = js.native
    protected def initTimeout(value: js.Any): Long = js.native
    protected def initUrl(value: js.Any): String = js.native
    def isDone(): Unit = js.native
    def overrideResponseContentType(contentType: String): Unit = js.native
    def removeRequestHeader(key: String): Unit = js.native
    def resetAuthentication(): Unit = js.native
    def resetRequestData(): Unit = js.native
    def resetTimeout(): Unit = js.native
    def resetUrl(): Unit = js.native
    def send(): Unit = js.native
    def setAuthentication(value: js.Any): qx.io.request.authentication.IAuthentication = js.native
    def setRequestData(value: js.Any): js.Dynamic = js.native
    def setRequestHeader(key: String, value: String): Unit = js.native
    def setTimeout(value: js.Any): Long = js.native
    def setUrl(value: js.Any): String = js.native

}
}
package qx.io.request {
@js.native
@JSName("qx.io.request.Jsonp")
class Jsonp extends qx.io.request.AbstractRequest {
    def getCache(): Boolean = js.native
    protected def initCache(value: js.Any): Boolean = js.native
    def isCache(): Boolean = js.native
    def resetCache(): Unit = js.native
    def setCache(value: js.Any): Boolean = js.native
    def setCallbackName(name: String): Unit = js.native
    def setCallbackParam(param: String): Unit = js.native
    def toggleCache(): Boolean = js.native

}
}
package qx.io.request {
@js.native
@JSName("qx.io.request.Xhr")
class Xhr protected () extends qx.io.request.AbstractRequest {
    def this(url: String = ???, method: String = ???) = this()
    protected def _createResponseParser(): qx.util.ResponseParser = js.native
    def getAccept(): String = js.native
    def getAsync(): Boolean = js.native
    def getCache(): js.Dynamic = js.native
    def getMethod(): js.Dynamic = js.native
    protected def initAccept(value: js.Any): String = js.native
    protected def initAsync(value: js.Any): Boolean = js.native
    protected def initCache(value: js.Any): js.Dynamic = js.native
    protected def initMethod(value: js.Any): js.Dynamic = js.native
    def isAsync(): Boolean = js.native
    def resetAccept(): Unit = js.native
    def resetAsync(): Unit = js.native
    def resetCache(): Unit = js.native
    def resetMethod(): Unit = js.native
    def setAccept(value: js.Any): String = js.native
    def setAsync(value: js.Any): Boolean = js.native
    def setCache(value: js.Any): js.Dynamic = js.native
    def setMethod(value: js.Any): js.Dynamic = js.native
    def setParser(parser: String): js.Function = js.native
    def toggleAsync(): Boolean = js.native

}
}
package qx.io.request.authentication {
@js.native
@JSName("qx.io.request.authentication.Basic")
class Basic protected () extends qx.core.Object with qx.io.request.authentication.IAuthentication {
    override def getAuthHeaders(): js.Array[js.Any] = js.native
    def this(username: js.Any = ???, password: js.Any = ???) = this()

}
}
package qx.io.request.authentication {
@js.native
trait IAuthentication extends js.Object {
    def getAuthHeaders(): js.Array[js.Any] = js.native

}
}
package qx.io.rest {
@js.native
@JSName("qx.io.rest.Resource")
class Resource protected () extends qx.core.Object {
    def this(description: js.Any = ???) = this()
    protected def _getRequest(): qx.io.request.Xhr = js.native
    protected def _getRequestConfig(action: String, params: js.Any): js.Dynamic = js.native
    protected def _getResource(description: js.Any = ???): qx.bom.rest.Resource = js.native
    protected def _getThrottleCount(): Int = js.native
    protected def _getThrottleLimit(): Int = js.native
    protected def _tailorResource(resource: qx.bom.rest.Resource): qx.bom.rest.Resource = js.native
    def abort(varargs: String = ???): Unit = js.native
    def configureRequest(callback: js.Function): Unit = js.native
    def invoke(action: String, params: js.Any, data: js.Any): Long = js.native
    def longPoll(action: String): String = js.native
    def map(action: String, method: String, url: String, check: js.Any = ???): Unit = js.native
    def poll(action: String, interval: Long, params: js.Any = ???, immediately: Boolean = ???): qx.event.Timer = js.native
    def refresh(action: String): Unit = js.native
    def setBaseUrl(baseUrl: String): Unit = js.native

}
@js.native
@JSName("qx.io.rest.Resource")
object Resource extends js.Object {
    def placeholdersFromUrl(url: String): qx.data.Array = js.native

}
}
package qx.lang {
@js.native
@JSName("qx.lang.Array")
class Array extends js.Object {

}
@js.native
@JSName("qx.lang.Array")
object Array extends js.Object {
    def append(arr1: qx.data.Array, arr2: qx.data.Array): qx.data.Array = js.native
    def cast(obj: js.Any, constructor: js.Function, offset: Int = ???): qx.data.Array = js.native
    def clone(arr: qx.data.Array): qx.data.Array = js.native
    def contains(arr: qx.data.Array, obj: js.Any): Boolean = js.native
    def equals(arr1: qx.data.Array, arr2: qx.data.Array): Boolean = js.native
    def exclude(arr1: qx.data.Array, arr2: qx.data.Array): qx.data.Array = js.native
    def fromArguments(args: js.Any, offset: Int = ???): qx.data.Array = js.native
    def fromCollection(coll: js.Any): qx.data.Array = js.native
    def fromShortHand(input: qx.data.Array): qx.data.Array = js.native
    def insertAfter(arr: qx.data.Array, obj: js.Any, obj2: js.Any): qx.data.Array = js.native
    def insertAt(arr: qx.data.Array, obj: js.Any, i: Int): qx.data.Array = js.native
    def insertBefore(arr: qx.data.Array, obj: js.Any, obj2: js.Any): qx.data.Array = js.native
    def max(arr: js.Array[Long]): Long = js.native
    def min(arr: js.Array[Long]): Long = js.native
    def range(start: Int, stop: Int, step: Int): qx.data.Array = js.native
    def remove(arr: qx.data.Array, obj: js.Any): js.Dynamic = js.native
    def removeAll(arr: qx.data.Array): qx.data.Array = js.native
    def removeAt(arr: qx.data.Array, i: Int): js.Dynamic = js.native
    def sum(arr: js.Array[Long]): Long = js.native
    def unique(arr: qx.data.Array): qx.data.Array = js.native

}
}
package qx.lang {
@js.native
@JSName("qx.lang.Function")
class Function extends js.Object {

}
@js.native
@JSName("qx.lang.Function")
object Function extends js.Object {
    def attempt(func: js.Function, self: js.Any = ???, varargs: js.Any = ???): Boolean = js.native
    def bind(func: js.Function, self: js.Any = ???, varargs: js.Any = ???): js.Function = js.native
    def create(func: js.Function, options: js.Any = ???): js.Function = js.native
    def curry(func: js.Function, varargs: js.Any = ???): js.Dynamic = js.native
    def delay(func: js.Function, delay: Int, self: js.Any = ???, varargs: js.Any = ???): Int = js.native
    def getCaller(args: js.Any): js.Function = js.native
    def getName(fcn: js.Function): String = js.native
    def globalEval(data: String): js.Dynamic = js.native
    def listener(func: js.Function, self: js.Any = ???, varargs: js.Any = ???): js.Dynamic = js.native
    def periodical(func: js.Function, interval: Int, self: js.Any = ???, varargs: js.Any = ???): Int = js.native

}
}
package qx.lang {
@js.native
@JSName("qx.lang.Json")
class Json extends js.Object {

}
@js.native
@JSName("qx.lang.Json")
object Json extends js.Object {
    def parse(text: String, reviver: js.Function = ???): js.Dynamic = js.native
    def stringify(value: js.Any, replacer: js.Function = ???, space: String = ???): String = js.native

}
}
package qx.lang {
@js.native
@JSName("qx.lang.Number")
class Number extends js.Object {

}
@js.native
@JSName("qx.lang.Number")
object Number extends js.Object {
    def isBetweenRange(nr: Long, vmin: Int, vmax: Int): Boolean = js.native
    def isInRange(nr: Long, vmin: Int, vmax: Int): Boolean = js.native
    def limit(nr: Long, vmin: Int, vmax: Int): Int = js.native

}
}
package qx.lang {
@js.native
@JSName("qx.lang.Object")
class Object extends js.Object {

}
@js.native
@JSName("qx.lang.Object")
object Object extends js.Object {
    def clone(source: js.Any, deep: Boolean): js.Dynamic = js.native
    def contains(map: js.Any, value: js.Any): Boolean = js.native
    def empty(map: js.Any): Unit = js.native
    def equals(object1: js.Any, object2: js.Any): Boolean = js.native
    def fromArray(array: qx.data.Array): js.Dynamic = js.native
    def getKeyFromValue(map: js.Any, value: js.Any): String = js.native
    def getLength(map: js.Any): Int = js.native
    def getValues(map: js.Any): qx.data.Array = js.native
    def invert(map: js.Any): js.Dynamic = js.native
    def isEmpty(map: js.Any): Boolean = js.native
    def mergeWith(target: js.Any, source: js.Any, overwrite: Boolean = ???): js.Dynamic = js.native

}
}
package qx.lang {
@js.native
@JSName("qx.lang.String")
class String extends js.Object {

}
@js.native
@JSName("qx.lang.String")
object String extends js.Object {
    def camelCase(str: String): String = js.native
    def capitalize(str: String): String = js.native
    def clean(str: String): String = js.native
    def contains(str: String, substring: String): Boolean = js.native
    def endsWith(fullstr: String, substr: String): Boolean = js.native
    def escapeRegexpChars(str: String): String = js.native
    def firstLow(str: String): String = js.native
    def firstUp(str: String): String = js.native
    def format(pattern: String, args: qx.data.Array): String = js.native
    def hyphenate(str: String): String = js.native
    def pad(str: String, length: Int, ch: String): String = js.native
    def quote(str: String): String = js.native
    def repeat(str: String, times: Int): String = js.native
    def startsWith(fullstr: String, substr: String): Boolean = js.native
    def stripScripts(str: String, exec: Boolean = ???): String = js.native
    def stripTags(str: String): String = js.native
    def toArray(str: String): qx.data.Array = js.native
    def trimLeft(str: String): String = js.native
    def trimRight(str: String): String = js.native

}
}
package qx.lang {
@js.native
@JSName("qx.lang.Type")
class Type extends js.Object {

}
@js.native
@JSName("qx.lang.Type")
object Type extends js.Object {
    def getClass(value: js.Any): String = js.native
    def isArray(value: js.Any): Boolean = js.native
    def isBoolean(value: js.Any): Boolean = js.native
    def isDate(value: js.Any): Boolean = js.native
    def isError(value: js.Any): Boolean = js.native
    def isFunction(value: js.Any): Boolean = js.native
    def isNumber(value: js.Any): Boolean = js.native
    def isObject(value: js.Any): Boolean = js.native
    def isRegExp(value: js.Any): Boolean = js.native
    def isString(value: js.Any): Boolean = js.native

}
}
package qx.lang.normalize {
@js.native
@JSName("qx.lang.normalize.Array")
class Array extends js.Object {

}
@js.native
@JSName("qx.lang.normalize.Array")
object Array extends js.Object {
    def every(callback: js.Function, obj: js.Any = ???): qx.data.Array = js.native
    def filter(callback: js.Function, obj: js.Any = ???): qx.data.Array = js.native
    def forEach(callback: js.Function, obj: js.Any = ???): Unit = js.native
    def indexOf(searchElement: js.Any, fromIndex: Int = ???): Int = js.native
    def lastIndexOf(searchElement: js.Any, fromIndex: Int = ???): Int = js.native
    def map(callback: js.Function, obj: js.Any = ???): qx.data.Array = js.native
    def reduce(callback: js.Function, init: js.Any = ???): js.Dynamic = js.native
    def reduceRight(callback: js.Function, init: js.Any = ???): js.Dynamic = js.native
    def some(callback: js.Function, obj: js.Any = ???): qx.data.Array = js.native

}
}
package qx.lang.normalize {
@js.native
@JSName("qx.lang.normalize.Date")
class Date extends js.Object {

}
@js.native
@JSName("qx.lang.normalize.Date")
object Date extends js.Object {
    def now(): Int = js.native

}
}
package qx.lang.normalize {
@js.native
@JSName("qx.lang.normalize.Error")
class Error extends js.Object {

}
@js.native
@JSName("qx.lang.normalize.Error")
object Error extends js.Object {

}
}
package qx.lang.normalize {
@js.native
@JSName("qx.lang.normalize.Function")
class Function extends js.Object {

}
@js.native
@JSName("qx.lang.normalize.Function")
object Function extends js.Object {
    def bind(that: js.Any = ???): js.Function = js.native

}
}
package qx.lang.normalize {
@js.native
@JSName("qx.lang.normalize.Object")
class Object extends js.Object {

}
@js.native
@JSName("qx.lang.normalize.Object")
object Object extends js.Object {
    def keys(map: js.Any): qx.data.Array = js.native

}
}
package qx.lang.normalize {
@js.native
@JSName("qx.lang.normalize.String")
class String extends js.Object {

}
@js.native
@JSName("qx.lang.normalize.String")
object String extends js.Object {
    def trim(): String = js.native

}
}
package qx.locale {
@js.native
@JSName("qx.locale.Date")
class Date extends js.Object {

}
@js.native
@JSName("qx.locale.Date")
object Date extends js.Object {
    protected def _getTerritory(locale: String): String = js.native
    def getAmMarker(locale: String): String = js.native
    def getDateFormat(size: String, locale: String = ???): String = js.native
    def getDateTimeFormat(canonical: String, fallback: String, locale: String): String = js.native
    def getDayName(length: String, day: Int, locale: String, context: String, withFallback: Boolean = ???): String = js.native
    def getDayNames(length: String, locale: String, context: String, withFallback: Boolean = ???): js.Array[String] = js.native
    def getMonthName(length: String, month: Int, locale: String, context: String, withFallback: Boolean = ???): String = js.native
    def getMonthNames(length: String, locale: String, context: String, withFallback: Boolean = ???): js.Array[String] = js.native
    def getPmMarker(locale: String): String = js.native
    def getTimeFormat(size: String, locale: String): String = js.native
    def getWeekendEnd(locale: String): Int = js.native
    def getWeekendStart(locale: String): Int = js.native
    def getWeekStart(locale: String): Int = js.native
    def isWeekend(day: Int, locale: String): Boolean = js.native

}
}
package qx.locale {
@js.native
@JSName("qx.locale.Key")
class Key extends js.Object {

}
@js.native
@JSName("qx.locale.Key")
object Key extends js.Object {
    def getKeyName(size: String, keyIdentifier: String, locale: String): String = js.native

}
}
package qx.locale {
@js.native
@JSName("qx.locale.LocalizedString")
class LocalizedString protected () extends qx.`type`.BaseString {
    def this(translation: String = ???, messageId: String = ???, args: qx.data.Array = ???) = this()
    def getMessageId(): String = js.native
    def translate(): qx.locale.LocalizedString = js.native

}
}
package qx.locale {
@js.native
@JSName("qx.locale.MTranslation")
trait MTranslation extends js.Object {
    def marktr(messageId: String): String = js.native
    def tr(messageId: String, varargs: js.Any = ???): String = js.native
    def trc(hint: String, messageId: String, varargs: js.Any = ???): String = js.native
    def trn(singularMessageId: String, pluralMessageId: String, count: Int, varargs: js.Any = ???): String = js.native
    def trnc(hint: String, singularMessageId: String, pluralMessageId: String, count: Int, varargs: js.Any = ???): String = js.native

}
}
package qx.locale {
@js.native
@JSName("qx.locale.Manager")
class Manager extends qx.core.Object {
    protected def _applyLocale(value: String, old: String): Unit = js.native
    def addLocale(localeCode: String, localeMap: js.Any): Unit = js.native
    def addTranslation(languageCode: String, translationMap: js.Any): Unit = js.native
    def getAvailableLocales(includeNonloaded: Boolean = ???): js.Array[String] = js.native
    def getLanguage(): String = js.native
    def getLocale(): String = js.native
    def getTerritory(): String = js.native
    protected def initLocale(value: js.Any): String = js.native
    def localize(messageId: String, args: js.Array[js.Any], locale: String = ???): String = js.native
    def resetLocale(): Unit = js.native
    def setLocale(value: js.Any): String = js.native
    def translate(messageId: String, args: js.Array[js.Any], locale: String = ???): String = js.native

}
@js.native
@JSName("qx.locale.Manager")
object Manager extends js.Object {
    def getInstance(): qx.locale.Manager = js.native
    def marktr(messageId: String): String = js.native
    def tr(messageId: String, varargs: js.Any = ???): String = js.native
    def trc(hint: String, messageId: String, varargs: js.Any = ???): String = js.native
    def trn(singularMessageId: String, pluralMessageId: String, count: Int, varargs: js.Any = ???): String = js.native
    def trnc(hint: String, singularMessageId: String, pluralMessageId: String, count: Int, varargs: js.Any = ???): String = js.native

}
}
package qx.locale {
@js.native
@JSName("qx.locale.Number")
class Number extends js.Object {

}
@js.native
@JSName("qx.locale.Number")
object Number extends js.Object {
    def getDecimalSeparator(locale: String): String = js.native
    def getGroupSeparator(locale: String): String = js.native
    def getPercentFormat(locale: String): String = js.native

}
}
package qx.locale {
@js.native
@JSName("qx.locale.String")
class String extends js.Object {

}
@js.native
@JSName("qx.locale.String")
object String extends js.Object {
    def getAlternateQuotationEnd(locale: String): String = js.native
    def getAlternateQuotationStart(locale: String): String = js.native
    def getQuotationEnd(locale: String): String = js.native
    def getQuotationStart(locale: String): String = js.native

}
}
package qx.log {
@js.native
@JSName("qx.log.Logger")
class Logger extends js.Object {

}
@js.native
@JSName("qx.log.Logger")
object Logger extends js.Object {
    def clear(): Unit = js.native
    def debug(obj: js.Any, message: js.Any): Unit = js.native
    def deprecatedClassWarning(clazz: qx.Class, msg: String = ???): Unit = js.native
    def deprecatedConstantWarning(clazz: qx.Class, constant: String, msg: String): Unit = js.native
    def deprecatedEventWarning(clazz: qx.Class, event: String, msg: String = ???): Unit = js.native
    def deprecatedMethodWarning(fcn: js.Function, msg: String = ???): Unit = js.native
    def deprecatedMixinWarning(clazz: qx.Class, msg: String = ???): Unit = js.native
    def deprecateMethodOverriding(obj: qx.core.Object, baseclass: qx.Class, methodName: String, msg: String = ???): Unit = js.native
    def error(obj: js.Any, message: js.Any): Unit = js.native
    def getLevel(): Int = js.native
    def getTreshold(): Int = js.native
    def info(obj: js.Any, message: js.Any): Unit = js.native
    def register(appender: qx.Class): Unit = js.native
    def setLevel(value: String): Unit = js.native
    def setTreshold(value: Int): Unit = js.native
    def trace(obj: js.Any = ???): Unit = js.native
    def unregister(appender: qx.Class): Unit = js.native
    def warn(obj: js.Any, message: js.Any): Unit = js.native

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.Console")
class Console extends js.Object {

}
@js.native
@JSName("qx.log.appender.Console")
object Console extends js.Object {
    def clear(): Unit = js.native
    def dispose(): Unit = js.native
    def execute(): Unit = js.native
    def init(): Unit = js.native
    def process(entry: js.Any): Unit = js.native
    def show(): Unit = js.native
    def toggle(): Unit = js.native

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.Element")
class Element protected () extends qx.core.Object {
    def this(element: HTMLElement = ???) = this()
    def clear(): Unit = js.native
    def process(entry: js.Any): Unit = js.native
    def setElement(element: HTMLElement): Unit = js.native

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.Native")
class Native extends js.Object {

}
@js.native
@JSName("qx.log.appender.Native")
object Native extends js.Object {
    def process(entry: js.Any): Unit = js.native

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.NodeConsole")
class NodeConsole extends js.Object {

}
@js.native
@JSName("qx.log.appender.NodeConsole")
object NodeConsole extends js.Object {
    def debug(logMessage: String): Unit = js.native
    def error(logMessage: String): Unit = js.native
    def info(logMessage: String): Unit = js.native
    def log(logMessage: String, level: String): Unit = js.native
    def process(entry: js.Any): Unit = js.native
    def warn(logMessage: String): Unit = js.native

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.PhoneGap")
class PhoneGap extends js.Object {

}
@js.native
@JSName("qx.log.appender.PhoneGap")
object PhoneGap extends js.Object {
    def process(entry: js.Any): Unit = js.native

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.RhinoConsole")
class RhinoConsole extends js.Object {

}
@js.native
@JSName("qx.log.appender.RhinoConsole")
object RhinoConsole extends js.Object {
    def debug(logMessage: String): Unit = js.native
    def error(logMessage: String): Unit = js.native
    def info(logMessage: String): Unit = js.native
    def log(logMessage: String, level: String): Unit = js.native
    def process(entry: js.Any): Unit = js.native
    def warn(logMessage: String): Unit = js.native

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.RhinoFile")
class RhinoFile extends js.Object {

}
@js.native
@JSName("qx.log.appender.RhinoFile")
object RhinoFile extends js.Object {
    def create(): Unit = js.native
    def debug(logMessage: String): Unit = js.native
    def error(logMessage: String): Unit = js.native
    def info(logMessage: String): Unit = js.native
    def log(logMessage: String, level: String): Unit = js.native
    def process(entry: js.Any): Unit = js.native
    def warn(logMessage: String): Unit = js.native

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.RingBuffer")
class RingBuffer protected () extends qx.util.RingBuffer {
    def this(maxMessages: Int = ???) = this()
    def clearHistory(): Unit = js.native
    def getAllLogEvents(): qx.data.Array = js.native
    def getMaxMessages(): Int = js.native
    def process(entry: js.Any): Unit = js.native
    def retrieveLogEvents(count: Int, startingFromMark: Boolean = ???): qx.data.Array = js.native
    def setMaxMessages(maxMessages: Int): Unit = js.native

}
}
package qx.log.appender {
@js.native
@JSName("qx.log.appender.Util")
class Util extends js.Object {

}
@js.native
@JSName("qx.log.appender.Util")
object Util extends js.Object {
    def escapeHTML(value: String): String = js.native
    def formatOffset(offset: Int, length: Int = ???): String = js.native
    def toHtml(entry: js.Any): Unit = js.native
    def toText(entry: js.Any): String = js.native
    def toTextArray(entry: js.Any): qx.data.Array = js.native

}
}
package qx.theme {
@js.native
@JSName("qx.theme.Classic")
class Classic extends js.Object {

}
}
package qx.theme {
@js.native
@JSName("qx.theme.Indigo")
class Indigo extends js.Object {

}
}
package qx.theme {
@js.native
@JSName("qx.theme.Modern")
class Modern extends js.Object {

}
}
package qx.theme {
@js.native
@JSName("qx.theme.Simple")
class Simple extends js.Object {

}
}
package qx.theme.classic {
@js.native
@JSName("qx.theme.classic.Appearance")
class Appearance extends js.Object {

}
}
package qx.theme.classic {
@js.native
@JSName("qx.theme.classic.Color")
class Color extends js.Object {

}
}
package qx.theme.classic {
@js.native
@JSName("qx.theme.classic.Decoration")
class Decoration extends js.Object {

}
}
package qx.theme.classic {
@js.native
@JSName("qx.theme.classic.Font")
class Font extends js.Object {

}
}
package qx.theme.icon {
@js.native
@JSName("qx.theme.icon.Oxygen")
class Oxygen extends js.Object {

}
}
package qx.theme.icon {
@js.native
@JSName("qx.theme.icon.Tango")
class Tango extends js.Object {

}
}
package qx.theme.indigo {
@js.native
@JSName("qx.theme.indigo.Appearance")
class Appearance extends js.Object {

}
}
package qx.theme.indigo {
@js.native
@JSName("qx.theme.indigo.Color")
class Color extends js.Object {

}
}
package qx.theme.indigo {
@js.native
@JSName("qx.theme.indigo.Decoration")
class Decoration extends js.Object {

}
}
package qx.theme.indigo {
@js.native
@JSName("qx.theme.indigo.Font")
class Font extends js.Object {

}
}
package qx.theme.manager {
@js.native
@JSName("qx.theme.manager.Appearance")
class Appearance extends qx.core.Object {
    protected def _applyTheme(value: qx.Theme, old: qx.Theme): Unit = js.native
    def getTheme(): qx.Theme = js.native
    protected def initTheme(value: js.Any): qx.Theme = js.native
    def resetTheme(): Unit = js.native
    def setTheme(value: js.Any): qx.Theme = js.native
    def styleFrom(id: String, states: js.Any, theme: qx.Theme = ???, defaultId: String = ???): js.Dynamic = js.native

}
@js.native
@JSName("qx.theme.manager.Appearance")
object Appearance extends js.Object {
    def getInstance(): qx.theme.manager.Appearance = js.native

}
}
package qx.theme.manager {
@js.native
@JSName("qx.theme.manager.Color")
class Color extends qx.util.ValueManager {
    protected def _applyTheme(value: qx.Theme, old: qx.Theme): Unit = js.native
    def getTheme(): qx.Theme = js.native
    protected def initTheme(value: js.Any): qx.Theme = js.native
    def resetTheme(): Unit = js.native
    def setTheme(value: js.Any): qx.Theme = js.native

}
@js.native
@JSName("qx.theme.manager.Color")
object Color extends js.Object {
    def getInstance(): qx.theme.manager.Color = js.native

}
}
package qx.theme.manager {
@js.native
@JSName("qx.theme.manager.Decoration")
class Decoration extends qx.core.Object {
    protected def _applyTheme(value: qx.Theme, old: qx.Theme): Unit = js.native
    def addCssClass(value: String): String = js.native
    def clear(): Unit = js.native
    def getCssClassName(value: String): String = js.native
    def getTheme(): qx.Theme = js.native
    protected def initTheme(value: js.Any): qx.Theme = js.native
    def isCached(decorator: String): Boolean = js.native
    def isDynamic(value: String): Boolean = js.native
    def isValidPropertyValue(value: js.Any): Boolean = js.native
    def refresh(): Unit = js.native
    def removeAllCssClasses(): Unit = js.native
    def resetTheme(): Unit = js.native
    def resolve(value: String): js.Dynamic = js.native
    def setTheme(value: js.Any): qx.Theme = js.native

}
@js.native
@JSName("qx.theme.manager.Decoration")
object Decoration extends js.Object {
    def getInstance(): qx.theme.manager.Decoration = js.native

}
}
package qx.theme.manager {
@js.native
@JSName("qx.theme.manager.Font")
class Font extends qx.util.ValueManager {
    protected def _applyTheme(value: qx.Theme, old: qx.Theme): Unit = js.native
    def getTheme(): qx.Theme = js.native
    protected def initTheme(value: js.Any): qx.Theme = js.native
    def resetTheme(): Unit = js.native
    def setTheme(value: js.Any): qx.Theme = js.native

}
@js.native
@JSName("qx.theme.manager.Font")
object Font extends js.Object {
    def getInstance(): qx.theme.manager.Font = js.native

}
}
package qx.theme.manager {
@js.native
@JSName("qx.theme.manager.Icon")
class Icon extends qx.core.Object {
    protected def _applyTheme(value: qx.Theme, old: qx.Theme): Unit = js.native
    def getTheme(): qx.Theme = js.native
    protected def initTheme(value: js.Any): qx.Theme = js.native
    def resetTheme(): Unit = js.native
    def setTheme(value: js.Any): qx.Theme = js.native

}
@js.native
@JSName("qx.theme.manager.Icon")
object Icon extends js.Object {
    def getInstance(): qx.theme.manager.Icon = js.native

}
}
package qx.theme.manager {
@js.native
@JSName("qx.theme.manager.Meta")
class Meta extends qx.core.Object {
    protected def _activateEvents(): Unit = js.native
    protected def _applyTheme(value: qx.Theme, old: qx.Theme): Unit = js.native
    protected def _fireEvent(e: qx.event.`type`.Data): Unit = js.native
    protected def _suspendEvents(): Unit = js.native
    def getTheme(): qx.Theme = js.native
    def initialize(): Unit = js.native
    protected def initTheme(value: js.Any): qx.Theme = js.native
    def resetTheme(): Unit = js.native
    def setTheme(value: js.Any): qx.Theme = js.native

}
@js.native
@JSName("qx.theme.manager.Meta")
object Meta extends js.Object {
    def getInstance(): qx.theme.manager.Meta = js.native

}
}
package qx.theme.modern {
@js.native
@JSName("qx.theme.modern.Appearance")
class Appearance extends js.Object {

}
}
package qx.theme.modern {
@js.native
@JSName("qx.theme.modern.Color")
class Color extends js.Object {

}
}
package qx.theme.modern {
@js.native
@JSName("qx.theme.modern.Decoration")
class Decoration extends js.Object {

}
}
package qx.theme.modern {
@js.native
@JSName("qx.theme.modern.Font")
class Font extends js.Object {

}
}
package qx.theme.simple {
@js.native
@JSName("qx.theme.simple.Appearance")
class Appearance extends js.Object {

}
}
package qx.theme.simple {
@js.native
@JSName("qx.theme.simple.Color")
class Color extends js.Object {

}
}
package qx.theme.simple {
@js.native
@JSName("qx.theme.simple.Decoration")
class Decoration extends js.Object {

}
}
package qx.theme.simple {
@js.native
@JSName("qx.theme.simple.Font")
class Font extends js.Object {

}
}
package qx.theme.simple {
@js.native
@JSName("qx.theme.simple.Image")
class Image extends qx.core.Object {

}
}
package qx.`type` {
@js.native
@JSName("qx.`type`.Array")
class Array protected () extends qx.`type`.BaseArray {
    def this(length_or_items: Int = ???) = this()
    def insertAt(obj: js.Any, i: Int): qx.data.Array = js.native
    def insertBefore(obj: js.Any, obj2: js.Any): qx.data.Array = js.native
    def prepend(arr: qx.data.Array): qx.data.Array = js.native
    def remove(obj: js.Any): js.Dynamic = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(i: Int): js.Dynamic = js.native

}
}
package qx.`type` {
@js.native
@JSName("qx.`type`.BaseArray")
class BaseArray protected () extends js.Array {
    def this(length_or_items: Int = ???) = this()
}
}
package qx.`type` {
@js.native
@JSName("qx.`type`.BaseError")
class BaseError protected () extends js.Error {
    def this(comment: String = ???, failMessage: String = ???) = this()
    def getComment(): String = js.native

}
}
package qx.`type` {
@js.native
@JSName("qx.`type`.BaseString")
class BaseString protected () extends js.Object {
    def this(txt: String = ???) = this()
    def base(args: js.Any, varags: js.Any): js.Dynamic = js.native
    def charAt(index: Int): String = js.native
    def charCodeAt(index: Int): Int = js.native
    def concat(stringN: String): String = js.native
    def indexOf(index: String, offset: Int = ???): Int = js.native
    def lastIndexOf(index: String, offset: Int = ???): Int = js.native
    def `match`(regexp: js.Any): js.Dynamic = js.native
    def replace(regexp: js.Any, aFunction: js.Function): String = js.native
    def search(regexp: js.Any): js.Dynamic = js.native
    def slice(beginslice: Int, endSlice: Int = ???): String = js.native
    def split(separator: String = ???, limit: Int = ???): qx.data.Array = js.native
    def substr(start: Int, length: Int = ???): String = js.native
    def substring(indexA: Int, indexB: Int = ???): String = js.native
    def toHashCode(): Int = js.native
    def toLocaleLowerCase(): String = js.native
    def toLocaleUpperCase(): String = js.native
    def toLowerCase(): String = js.native
    def toUpperCase(): String = js.native

}
}
package qx.ui.basic {
@js.native
@JSName("qx.ui.basic.Atom")
class Atom protected () extends qx.ui.core.Widget {
    def this(label: String = ???, icon: String = ???) = this()
    protected def _applyCenter(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyGap(value: Int, old: Int): Unit = js.native
    protected def _applyIcon(value: String, old: String): Unit = js.native
    protected def _applyIconPosition(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyLabel(value: String, old: String): Unit = js.native
    protected def _applyRich(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyShow(value: js.Any, old: js.Any): Unit = js.native
    protected def _handleIcon(): Unit = js.native
    protected def _handleLabel(): Unit = js.native
    def getCenter(): Boolean = js.native
    def getGap(): Int = js.native
    def getIcon(): String = js.native
    def getIconPosition(): js.Dynamic = js.native
    def getLabel(): String = js.native
    def getRich(): Boolean = js.native
    def getShow(): js.Dynamic = js.native
    protected def initCenter(value: js.Any): Boolean = js.native
    protected def initGap(value: js.Any): Int = js.native
    protected def initIcon(value: js.Any): String = js.native
    protected def initIconPosition(value: js.Any): js.Dynamic = js.native
    protected def initLabel(value: js.Any): String = js.native
    protected def initRich(value: js.Any): Boolean = js.native
    protected def initShow(value: js.Any): js.Dynamic = js.native
    def isCenter(): Boolean = js.native
    def isRich(): Boolean = js.native
    def resetCenter(): Unit = js.native
    def resetGap(): Unit = js.native
    def resetIcon(): Unit = js.native
    def resetIconPosition(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetRich(): Unit = js.native
    def resetShow(): Unit = js.native
    def setCenter(value: js.Any): Boolean = js.native
    def setGap(value: js.Any): Int = js.native
    def setIcon(value: js.Any): String = js.native
    def setIconPosition(value: js.Any): js.Dynamic = js.native
    def setLabel(value: js.Any): String = js.native
    def setRich(value: js.Any): Boolean = js.native
    def setShow(value: js.Any): js.Dynamic = js.native
    def toggleCenter(): Boolean = js.native
    def toggleRich(): Boolean = js.native

}
}
package qx.ui.basic {
@js.native
@JSName("qx.ui.basic.Image")
class Image protected () extends qx.ui.core.Widget {
    def this(source: String = ???) = this()
    protected def _applyScale(value: Boolean, old: Boolean): Unit = js.native
    protected def _applySource(value: String, old: String): Unit = js.native
    protected def _findHighResolutionSource(lowResImgSrc: String): String = js.native
    protected def _getHighResolutionSource(source: String, pixelRatio: Long): String = js.native
    protected def _styleSource(): Unit = js.native
    def getScale(): Boolean = js.native
    def getSource(): String = js.native
    protected def initScale(value: js.Any): Boolean = js.native
    protected def initSource(value: js.Any): String = js.native
    def isScale(): Boolean = js.native
    def resetScale(): Unit = js.native
    def resetSource(): Unit = js.native
    def setScale(value: js.Any): Boolean = js.native
    def setSource(value: js.Any): String = js.native
    def toggleScale(): Boolean = js.native

}
}
package qx.ui.basic {
@js.native
@JSName("qx.ui.basic.Label")
class Label protected () extends qx.ui.core.Widget with qx.ui.form.IStringForm {
    override def getValue(): String = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: String): Unit = js.native
    def this(value: String = ???) = this()
    protected def _applyBuddy(value: qx.ui.core.Widget, old: qx.ui.core.Widget): Unit = js.native
    protected def _applyRich(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyTextAlign(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyValue(value: String, old: String): Unit = js.native
    protected def _applyWrap(value: Boolean, old: Boolean): Unit = js.native
    protected def _onChangeLocale(e: qx.event.`type`.Event): Unit = js.native
    protected def _onWebFontStatusChange(ev: qx.event.`type`.Data): Unit = js.native
    def getBuddy(): qx.ui.core.Widget = js.native
    def getRich(): Boolean = js.native
    def getTextAlign(): js.Dynamic = js.native
    def getWrap(): Boolean = js.native
    protected def initBuddy(value: js.Any): qx.ui.core.Widget = js.native
    protected def initRich(value: js.Any): Boolean = js.native
    protected def initTextAlign(value: js.Any): js.Dynamic = js.native
    protected def initValue(value: js.Any): String = js.native
    protected def initWrap(value: js.Any): Boolean = js.native
    def isRich(): Boolean = js.native
    def isWrap(): Boolean = js.native
    def resetBuddy(): Unit = js.native
    def resetRich(): Unit = js.native
    def resetTextAlign(): Unit = js.native
    def resetWrap(): Unit = js.native
    def setBuddy(value: js.Any): qx.ui.core.Widget = js.native
    def setRich(value: js.Any): Boolean = js.native
    def setTextAlign(value: js.Any): js.Dynamic = js.native
    def setWrap(value: js.Any): Boolean = js.native
    def toggleRich(): Boolean = js.native
    def toggleWrap(): Boolean = js.native

}
}
package qx.ui.container {
@js.native
@JSName("qx.ui.container.Composite")
class Composite protected () extends qx.ui.core.Widget with qx.ui.core.MChildrenHandling with qx.ui.core.MLayoutHandling {
    def this(layout: qx.ui.layout.Abstract = ???) = this()

}
}
package qx.ui.container {
@js.native
@JSName("qx.ui.container.Resizer")
class Resizer extends qx.ui.container.Composite with qx.ui.core.MResizable {

}
}
package qx.ui.container {
@js.native
@JSName("qx.ui.container.Scroll")
class Scroll protected () extends qx.ui.core.scroll.AbstractScrollArea with qx.ui.core.MContentPadding {
    def this(content: qx.ui.core.LayoutItem = ???) = this()
    protected def _getContentPaddingTarget(): qx.ui.core.Widget = js.native
    def add(widget: qx.ui.core.Widget): Unit = js.native
    def getChildren(): js.Array[js.Dynamic] = js.native
    def remove(widget: qx.ui.core.Widget): Unit = js.native

}
}
package qx.ui.container {
@js.native
@JSName("qx.ui.container.SlideBar")
class SlideBar protected () extends qx.ui.core.Widget with qx.ui.core.MRemoteChildrenHandling with qx.ui.core.MRemoteLayoutHandling {
    def this(orientation: String = ???) = this()
    protected def _applyOrientation(value: js.Any, old: js.Any): Unit = js.native
    protected def _hideArrows(): Unit = js.native
    protected def _onExecuteBackward(): Unit = js.native
    protected def _onExecuteForward(): Unit = js.native
    protected def _onResize(e: qx.event.`type`.Event): Unit = js.native
    protected def _onRoll(e: qx.event.`type`.Roll): Unit = js.native
    protected def _onScroll(): Unit = js.native
    protected def _onScrollAnimationEnd(): Unit = js.native
    protected def _showArrows(): Unit = js.native
    protected def _updateArrowsEnabled(): Unit = js.native
    def getOrientation(): js.Dynamic = js.native
    def getScrollStep(): Int = js.native
    protected def initOrientation(value: js.Any): js.Dynamic = js.native
    protected def initScrollStep(value: js.Any): Int = js.native
    def resetOrientation(): Unit = js.native
    def resetScrollStep(): Unit = js.native
    def scrollBy(offset: Int = ???, duration: Long = ???): Unit = js.native
    def scrollTo(value: Int, duration: Long = ???): Unit = js.native
    def setOrientation(value: js.Any): js.Dynamic = js.native
    def setScrollStep(value: js.Any): Int = js.native

}
}
package qx.ui.container {
@js.native
@JSName("qx.ui.container.Stack")
class Stack extends qx.ui.core.Widget with qx.ui.core.ISingleSelection with qx.ui.core.MSingleSelectionHandling with qx.ui.core.MChildrenHandling {
    override def getSelectables(all: Boolean): js.Array[qx.ui.core.Widget] = js.native
    override def getSelection(): js.Array[qx.ui.core.Widget] = js.native
    override def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    override def isSelectionEmpty(): Boolean = js.native
    override def resetSelection(): Unit = js.native
    override def setSelection(items: js.Array[qx.ui.core.Widget]): Unit = js.native
    protected def _applyDynamic(value: Boolean, old: Boolean): Unit = js.native
    protected def _getItems(): js.Array[qx.ui.core.Widget] = js.native
    protected def _isAllowEmptySelection(): Boolean = js.native
    protected def _isItemSelectable(item: qx.ui.core.Widget): Boolean = js.native
    def getDynamic(): Boolean = js.native
    protected def initDynamic(value: js.Any): Boolean = js.native
    def isDynamic(): Boolean = js.native
    def next(): Unit = js.native
    def previous(): Unit = js.native
    def resetDynamic(): Unit = js.native
    def setDynamic(value: js.Any): Boolean = js.native
    def toggleDynamic(): Boolean = js.native

}
}
package qx.ui.control {
@js.native
@JSName("qx.ui.control.ColorPopup")
class ColorPopup extends qx.ui.popup.Popup with qx.ui.form.IColorForm {
    override def getValue(): String = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: String): Unit = js.native
    protected def _applyValue(value: js.Any, old: js.Any): Unit = js.native
    protected def _createBoxes(): Unit = js.native
    protected def _createColorSelector(): Unit = js.native
    protected def _onAutomaticBtnExecute(): Unit = js.native
    protected def _onChangeVisibility(e: qx.event.`type`.Data): Unit = js.native
    protected def _onColorSelectorCancel(): Unit = js.native
    protected def _onColorSelectorOk(): Unit = js.native
    protected def _onFieldPointerDown(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onFieldPointerOut(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onFieldPointerOver(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onSelectorButtonExecute(): Unit = js.native
    protected def _rotatePreviousColors(): Unit = js.native
    def getBlue(): Long = js.native
    def getGreen(): Long = js.native
    def getRed(): Long = js.native
    protected def initBlue(value: js.Any): Long = js.native
    protected def initGreen(value: js.Any): Long = js.native
    protected def initRed(value: js.Any): Long = js.native
    protected def initValue(value: js.Any): js.Dynamic = js.native
    def resetBlue(): Unit = js.native
    def resetGreen(): Unit = js.native
    def resetRed(): Unit = js.native
    def setBlue(value: js.Any): Long = js.native
    def setGreen(value: js.Any): Long = js.native
    def setRed(value: js.Any): Long = js.native

}
}
package qx.ui.control {
@js.native
@JSName("qx.ui.control.ColorSelector")
class ColorSelector extends qx.ui.core.Widget with qx.ui.form.IColorForm {
    override def getValue(): String = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: String): Unit = js.native
    protected def _applyBlue(value: Int, old: Int): Unit = js.native
    protected def _applyBrightness(value: Long, old: Long): Unit = js.native
    protected def _applyGreen(value: Int, old: Int): Unit = js.native
    protected def _applyHue(value: Long, old: Long): Unit = js.native
    protected def _applyRed(value: Int, old: Int): Unit = js.native
    protected def _applySaturation(value: Long, old: Long): Unit = js.native
    protected def _onAppear(e: qx.event.`type`.Data): Unit = js.native
    protected def _onBrightnessFieldPointerDown(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onBrightnessHandlePointerDown(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onBrightnessHandlePointerMove(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onBrightnessHandlePointerUp(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onBrightnessPaneRoll(e: qx.event.`type`.Roll): Unit = js.native
    protected def _onColorFieldTap(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onHexFieldChange(e: qx.event.`type`.Data): Unit = js.native
    protected def _onHueSaturationFieldPointerDown(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onHueSaturationHandlePointerMove(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onHueSaturationHandlePointerUp(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onHueSaturationPaneRoll(e: qx.event.`type`.Roll): Unit = js.native
    protected def _setBlueFromSpinner(): Unit = js.native
    protected def _setBrightnessFromSpinner(): Unit = js.native
    protected def _setBrightnessGradiant(): Unit = js.native
    protected def _setBrightnessOnFieldEvent(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _setGreenFromSpinner(): Unit = js.native
    protected def _setHexFromRgb(): Unit = js.native
    protected def _setHueFromRgb(): Unit = js.native
    protected def _setHueFromSpinner(): Unit = js.native
    protected def _setHueSaturationOnFieldEvent(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _setPreviewFromRgb(): Unit = js.native
    protected def _setRedFromSpinner(): Unit = js.native
    protected def _setRgbFromHue(): Unit = js.native
    protected def _setSaturationFromSpinner(): Unit = js.native
    def getBlue(): Int = js.native
    def getBrightness(): Long = js.native
    def getGreen(): Int = js.native
    def getHue(): Long = js.native
    def getRed(): Int = js.native
    def getSaturation(): Long = js.native
    protected def initBlue(value: js.Any): Int = js.native
    protected def initBrightness(value: js.Any): Long = js.native
    protected def initGreen(value: js.Any): Int = js.native
    protected def initHue(value: js.Any): Long = js.native
    protected def initRed(value: js.Any): Int = js.native
    protected def initSaturation(value: js.Any): Long = js.native
    def resetBlue(): Unit = js.native
    def resetBrightness(): Unit = js.native
    def resetGreen(): Unit = js.native
    def resetHue(): Unit = js.native
    def resetRed(): Unit = js.native
    def resetSaturation(): Unit = js.native
    def setBlue(value: js.Any): Int = js.native
    def setBrightness(value: js.Any): Long = js.native
    def setGreen(value: js.Any): Int = js.native
    def setHue(value: js.Any): Long = js.native
    def setPreviousColor(red: Long, green: Long, blue: Long): Unit = js.native
    def setRed(value: js.Any): Int = js.native
    def setSaturation(value: js.Any): Long = js.native

}
}
package qx.ui.control {
@js.native
@JSName("qx.ui.control.DateChooser")
class DateChooser protected () extends qx.ui.core.Widget with qx.ui.form.IExecutable with qx.ui.form.IForm with qx.ui.form.IDateForm with qx.ui.core.MExecutable with qx.ui.form.MForm {
    override def execute(): Unit = js.native
    override def getCommand(): qx.ui.command.Command = js.native
    override def setCommand(command: qx.ui.command.Command): Unit = js.native
    override def getEnabled(): Boolean = js.native
    override def getInvalidMessage(): String = js.native
    override def getRequired(): Boolean = js.native
    override def getRequiredInvalidMessage(): String = js.native
    override def getValid(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Unit = js.native
    override def setInvalidMessage(message: String): Unit = js.native
    override def setRequired(required: Boolean): Unit = js.native
    override def setRequiredInvalidMessage(message: String): Unit = js.native
    override def setValid(valid: Boolean): Unit = js.native
    override def getValue(): js.Date = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: js.Date): Unit = js.native
    def this(date: js.Date = ???) = this()
    protected def _applyValue(value: js.Date, old: js.Date): Unit = js.native
    protected def _onDayDblTap(): Unit = js.native
    protected def _onDayTap(evt: qx.event.`type`.Data): Unit = js.native
    protected def _onKeyPress(evt: qx.event.`type`.Data): Unit = js.native
    protected def _onNavButtonTap(evt: qx.event.`type`.Data): Unit = js.native
    protected def _onPointerUpDown(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _updateDatePane(): Unit = js.native
    def getShownMonth(): Int = js.native
    def getShownYear(): Int = js.native
    def handleKeyPress(e: qx.event.`type`.Data): Unit = js.native
    protected def initShownMonth(value: js.Any): Int = js.native
    protected def initShownYear(value: js.Any): Int = js.native
    protected def initValue(value: js.Any): js.Date = js.native
    def resetShownMonth(): Unit = js.native
    def resetShownYear(): Unit = js.native
    def setShownMonth(value: js.Any): Int = js.native
    def setShownYear(value: js.Any): Int = js.native
    def showMonth(month: Int = ???, year: Int = ???): Unit = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.Blocker")
class Blocker protected () extends qx.core.Object {
    def this(widget: qx.ui.core.Widget = ???) = this()
    protected def _applyColor(value: String, old: String): Unit = js.native
    protected def _applyOpacity(value: Long, old: Long): Unit = js.native
    protected def _backupActiveWidget(): Unit = js.native
    protected def _block(zIndex: Long, blockContent: Boolean): Unit = js.native
    protected def _onChangeTheme(): Unit = js.native
    protected def _restoreActiveWidget(): Unit = js.native
    protected def _updateBlockerBounds(bounds: js.Any): Unit = js.native
    def block(): Unit = js.native
    def blockContent(zIndex: Int): Unit = js.native
    def forceUnblock(): Unit = js.native
    def getBlockerElement(widget: qx.ui.core.Widget): qx.html.Element = js.native
    def getColor(): String = js.native
    def getKeepBlockerActive(): Boolean = js.native
    def getOpacity(): Long = js.native
    protected def initColor(value: js.Any): String = js.native
    protected def initKeepBlockerActive(value: js.Any): Boolean = js.native
    protected def initOpacity(value: js.Any): Long = js.native
    def isBlocked(): Boolean = js.native
    def isKeepBlockerActive(): Boolean = js.native
    def resetColor(): Unit = js.native
    def resetKeepBlockerActive(): Unit = js.native
    def resetOpacity(): Unit = js.native
    def setColor(value: js.Any): String = js.native
    def setKeepBlockerActive(value: js.Any): Boolean = js.native
    def setOpacity(value: js.Any): Long = js.native
    def toggleKeepBlockerActive(): Boolean = js.native
    def unblock(): Unit = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.ColumnData")
class ColumnData extends qx.ui.core.LayoutItem {
    def getComputedWidth(): Int = js.native
    def getFlex(): Int = js.native
    def setColumnWidth(width: Int, flex: Int = ???): Unit = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.DragDropCursor")
class DragDropCursor extends qx.ui.basic.Image with qx.ui.core.MPlacement {
    protected def _applyAction(value: js.Any, old: js.Any): Unit = js.native
    def getAction(): js.Dynamic = js.native
    protected def initAction(value: js.Any): js.Dynamic = js.native
    def resetAction(): Unit = js.native
    def setAction(value: js.Any): js.Dynamic = js.native

}
@js.native
@JSName("qx.ui.core.DragDropCursor")
object DragDropCursor extends js.Object {
    def getInstance(): qx.ui.core.DragDropCursor = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.EventHandler")
class EventHandler extends qx.core.Object with qx.event.IEventHandler {
    override def canHandleEvent(target: js.Any, `type`: String): Boolean = js.native
    override def registerEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    override def unregisterEvent(target: js.Any, `type`: String, capture: Boolean): Unit = js.native
    protected def _dispatchEvent(domEvent: qx.event.`type`.Event): Unit = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.FocusHandler")
class FocusHandler extends qx.core.Object {
    protected def _onActivate(e: qx.event.`type`.Focus): Unit = js.native
    protected def _onDeactivate(e: qx.event.`type`.Focus): Unit = js.native
    protected def _onFocusIn(e: qx.event.`type`.Focus): Unit = js.native
    protected def _onFocusOut(e: qx.event.`type`.Focus): Unit = js.native
    def addRoot(widget: qx.ui.core.Widget): Unit = js.native
    def connectTo(root: qx.ui.root.Abstract): Unit = js.native
    def getActiveWidget(): qx.ui.core.Widget = js.native
    def getFocusedWidget(): qx.ui.core.Widget = js.native
    def isActive(widget: qx.ui.core.Widget): Boolean = js.native
    def isFocused(widget: qx.ui.core.Widget): Boolean = js.native
    def isFocusRoot(widget: qx.ui.core.Widget): Boolean = js.native
    def removeRoot(widget: qx.ui.core.Widget): Unit = js.native

}
@js.native
@JSName("qx.ui.core.FocusHandler")
object FocusHandler extends js.Object {
    def getInstance(): qx.ui.core.FocusHandler = js.native

}
}
package qx.ui.core {
@js.native
trait IMultiSelection extends js.Object {
    def addToSelection(item: qx.ui.core.Widget): Unit = js.native
    def removeFromSelection(item: qx.ui.core.Widget): Unit = js.native
    def selectAll(): Unit = js.native

}
}
package qx.ui.core {
@js.native
trait ISingleSelection extends js.Object {
    def getSelectables(all: Boolean): js.Array[qx.ui.core.Widget] = js.native
    def getSelection(): js.Array[qx.ui.core.Widget] = js.native
    def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def resetSelection(): Unit = js.native
    def setSelection(items: js.Array[qx.ui.core.Widget]): Unit = js.native

}
}
package qx.ui.core {
@js.native
trait ISingleSelectionProvider extends js.Object {
    def getItems(): js.Array[qx.ui.core.Widget] = js.native
    def isItemSelectable(item: qx.ui.core.Widget): Boolean = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.LayoutItem")
class LayoutItem extends qx.core.Object {
    protected def _applyAlign(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyDimension(value: Int, old: Int): Unit = js.native
    protected def _applyMargin(value: Int, old: Int): Unit = js.native
    protected def _applyStretching(value: Boolean, old: Boolean): Unit = js.native
    protected def _computeSizeHint(): js.Dynamic = js.native
    protected def _getHeightForWidth(width: Int): Int = js.native
    protected def _getLayout(): qx.ui.layout.Abstract = js.native
    protected def _getRoot(): qx.ui.core.Widget = js.native
    protected def _hasHeightForWidth(): Boolean = js.native
    protected def _onChangeTheme(): Unit = js.native
    def clearLayoutProperties(): Unit = js.native
    def clearSeparators(): Unit = js.native
    def getAlignX(): js.Dynamic = js.native
    def getAlignY(): js.Dynamic = js.native
    def getAllowGrowX(): Boolean = js.native
    def getAllowGrowY(): Boolean = js.native
    def getAllowShrinkX(): Boolean = js.native
    def getAllowShrinkY(): Boolean = js.native
    def getApplicationRoot(): qx.ui.root.Abstract = js.native
    def getBounds(): js.Dynamic = js.native
    def getHeight(): Int = js.native
    def getLayoutParent(): qx.ui.core.Widget = js.native
    def getLayoutProperties(): js.Dynamic = js.native
    def getMarginBottom(): Int = js.native
    def getMarginLeft(): Int = js.native
    def getMarginRight(): Int = js.native
    def getMarginTop(): Int = js.native
    def getMaxHeight(): Int = js.native
    def getMaxWidth(): Int = js.native
    def getMinHeight(): Int = js.native
    def getMinWidth(): Int = js.native
    def getSizeHint(compute: Boolean = ???): js.Dynamic = js.native
    def getWidth(): Int = js.native
    def hasUserBounds(): Boolean = js.native
    def hasValidLayout(): Boolean = js.native
    protected def initAlignX(value: js.Any): js.Dynamic = js.native
    protected def initAlignY(value: js.Any): js.Dynamic = js.native
    protected def initAllowGrowX(value: js.Any): Boolean = js.native
    protected def initAllowGrowY(value: js.Any): Boolean = js.native
    protected def initAllowShrinkX(value: js.Any): Boolean = js.native
    protected def initAllowShrinkY(value: js.Any): Boolean = js.native
    protected def initHeight(value: js.Any): Int = js.native
    protected def initMarginBottom(value: js.Any): Int = js.native
    protected def initMarginLeft(value: js.Any): Int = js.native
    protected def initMarginRight(value: js.Any): Int = js.native
    protected def initMarginTop(value: js.Any): Int = js.native
    protected def initMaxHeight(value: js.Any): Int = js.native
    protected def initMaxWidth(value: js.Any): Int = js.native
    protected def initMinHeight(value: js.Any): Int = js.native
    protected def initMinWidth(value: js.Any): Int = js.native
    protected def initWidth(value: js.Any): Int = js.native
    def invalidateLayoutCache(): Unit = js.native
    def isAllowGrowX(): Boolean = js.native
    def isAllowGrowY(): Boolean = js.native
    def isAllowShrinkX(): Boolean = js.native
    def isAllowShrinkY(): Boolean = js.native
    def isExcluded(): Boolean = js.native
    def isRootWidget(): Boolean = js.native
    def renderLayout(left: Int, top: Int, width: Int, height: Int): js.Dynamic = js.native
    def renderSeparator(separator: String, bounds: js.Any): Unit = js.native
    def resetAlignX(): Unit = js.native
    def resetAlignY(): Unit = js.native
    def resetAllowGrowX(): Unit = js.native
    def resetAllowGrowY(): Unit = js.native
    def resetAllowShrinkX(): Unit = js.native
    def resetAllowShrinkY(): Unit = js.native
    def resetAllowStretchX(): Unit = js.native
    def resetAllowStretchY(): Unit = js.native
    def resetHeight(): Unit = js.native
    def resetMargin(): Unit = js.native
    def resetMarginBottom(): Unit = js.native
    def resetMarginLeft(): Unit = js.native
    def resetMarginRight(): Unit = js.native
    def resetMarginTop(): Unit = js.native
    def resetMaxHeight(): Unit = js.native
    def resetMaxWidth(): Unit = js.native
    def resetMinHeight(): Unit = js.native
    def resetMinWidth(): Unit = js.native
    def resetUserBounds(): Unit = js.native
    def resetWidth(): Unit = js.native
    def scheduleLayoutUpdate(): Unit = js.native
    def setAlignX(value: js.Any): js.Dynamic = js.native
    def setAlignY(value: js.Any): js.Dynamic = js.native
    def setAllowGrowX(value: js.Any): Boolean = js.native
    def setAllowGrowY(value: js.Any): Boolean = js.native
    def setAllowShrinkX(value: js.Any): Boolean = js.native
    def setAllowShrinkY(value: js.Any): Boolean = js.native
    def setAllowStretchX(allowGrowX: js.Any, allowShrinkX: js.Any): Unit = js.native
    def setAllowStretchY(allowGrowY: js.Any, allowShrinkY: js.Any): Unit = js.native
    def setHeight(value: js.Any): Int = js.native
    def setLayoutParent(parent: qx.ui.core.Widget): Unit = js.native
    def setLayoutProperties(props: js.Any): Unit = js.native
    def setMargin(marginTop: js.Any, marginRight: js.Any, marginBottom: js.Any, marginLeft: js.Any): Unit = js.native
    def setMarginBottom(value: js.Any): Int = js.native
    def setMarginLeft(value: js.Any): Int = js.native
    def setMarginRight(value: js.Any): Int = js.native
    def setMarginTop(value: js.Any): Int = js.native
    def setMaxHeight(value: js.Any): Int = js.native
    def setMaxWidth(value: js.Any): Int = js.native
    def setMinHeight(value: js.Any): Int = js.native
    def setMinWidth(value: js.Any): Int = js.native
    def setUserBounds(left: Int, top: Int, width: Int, height: Int): Unit = js.native
    def setWidth(value: js.Any): Int = js.native
    def toggleAllowGrowX(): Boolean = js.native
    def toggleAllowGrowY(): Boolean = js.native
    def toggleAllowShrinkX(): Boolean = js.native
    def toggleAllowShrinkY(): Boolean = js.native
    def updateLayoutProperties(props: js.Any = ???): Unit = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MBlocker")
trait MBlocker extends js.Object {
    protected def _applyBlockerColor(value: String, old: String): Unit = js.native
    protected def _applyBlockerOpacity(value: Long, old: Long): Unit = js.native
    protected def _createBlocker(): qx.ui.core.Blocker = js.native
    def block(): Unit = js.native
    def blockContent(zIndex: Int): Unit = js.native
    def forceUnblock(): Unit = js.native
    def getBlocker(): qx.ui.core.Blocker = js.native
    def getBlockerColor(): String = js.native
    def getBlockerOpacity(): Long = js.native
    protected def initBlockerColor(value: js.Any): String = js.native
    protected def initBlockerOpacity(value: js.Any): Long = js.native
    def isBlocked(): Boolean = js.native
    def resetBlockerColor(): Unit = js.native
    def resetBlockerOpacity(): Unit = js.native
    def setBlockerColor(value: js.Any): String = js.native
    def setBlockerOpacity(value: js.Any): Long = js.native
    def unblock(): Unit = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MChildrenHandling")
trait MChildrenHandling extends js.Object {
    def add(child: qx.ui.core.LayoutItem, options: js.Dynamic = ???): Unit = js.native
    def addAfter(child: qx.ui.core.LayoutItem, after: qx.ui.core.LayoutItem, options: js.Any = ???): Unit = js.native
    def addAt(child: qx.ui.core.LayoutItem, index: Int, options: js.Any = ???): Unit = js.native
    def addBefore(child: qx.ui.core.LayoutItem, before: qx.ui.core.LayoutItem, options: js.Any = ???): Unit = js.native
    def getChildren(): js.Array[qx.ui.core.LayoutItem] = js.native
    def hasChildren(): Boolean = js.native
    def indexOf(child: qx.ui.core.Widget): Int = js.native
    def remove(child: qx.ui.core.LayoutItem): Unit = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(index: Int): qx.ui.core.LayoutItem = js.native

}
@js.native
@JSName("qx.ui.core.MChildrenHandling")
object MChildrenHandling extends js.Object {
    def remap(members: js.Any): Unit = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MContentPadding")
trait MContentPadding extends js.Object {
    protected def _applyContentPadding(value: Int, old: Int): Unit = js.native
    def getContentPaddingBottom(): Int = js.native
    def getContentPaddingLeft(): Int = js.native
    def getContentPaddingRight(): Int = js.native
    def getContentPaddingTop(): Int = js.native
    protected def initContentPaddingBottom(value: js.Any): Int = js.native
    protected def initContentPaddingLeft(value: js.Any): Int = js.native
    protected def initContentPaddingRight(value: js.Any): Int = js.native
    protected def initContentPaddingTop(value: js.Any): Int = js.native
    def resetContentPadding(): Unit = js.native
    def resetContentPaddingBottom(): Unit = js.native
    def resetContentPaddingLeft(): Unit = js.native
    def resetContentPaddingRight(): Unit = js.native
    def resetContentPaddingTop(): Unit = js.native
    def setContentPadding(contentPaddingTop: js.Any, contentPaddingRight: js.Any, contentPaddingBottom: js.Any, contentPaddingLeft: js.Any): Unit = js.native
    def setContentPaddingBottom(value: js.Any): Int = js.native
    def setContentPaddingLeft(value: js.Any): Int = js.native
    def setContentPaddingRight(value: js.Any): Int = js.native
    def setContentPaddingTop(value: js.Any): Int = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MDragDropScrolling")
trait MDragDropScrolling extends js.Object {
    protected def _calculateScrollAmount(scrollbarSize: Long, exceedanceAmount: Long): Long = js.native
    protected def _calculateThresholdExceedance(diff: Long, threshold: Long): Long = js.native
    protected def _findScrollableParent(widget: qx.ui.core.LayoutItem): qx.ui.core.Widget = js.native
    protected def _getAxis(edgeType: String): String = js.native
    protected def _getBounds(scrollable: qx.ui.core.Widget): js.Dynamic = js.native
    protected def _getEdgeType(diff: js.Any, thresholdX: Long, thresholdY: Long): String = js.native
    protected def _getThresholdByEdgeType(edgeType: String): Long = js.native
    protected def _isScrollable(widget: qx.ui.core.Widget): Boolean = js.native
    protected def _isScrollbarExceedingMaxPos(scrollbar: qx.ui.core.scroll.IScrollBar, axis: String, amount: Long): Boolean = js.native
    protected def _isScrollbarVisible(scrollable: qx.ui.core.Widget, axis: String): Boolean = js.native
    protected def _scrollBy(scrollable: qx.ui.core.Widget, axis: String, exceedanceAmount: Long): Unit = js.native
    def getDragScrollSlowDownFactor(): Float = js.native
    def getDragScrollThresholdX(): Int = js.native
    def getDragScrollThresholdY(): Int = js.native
    protected def initDragScrollSlowDownFactor(value: js.Any): Float = js.native
    protected def initDragScrollThresholdX(value: js.Any): Int = js.native
    protected def initDragScrollThresholdY(value: js.Any): Int = js.native
    def resetDragScrollSlowDownFactor(): Unit = js.native
    def resetDragScrollThresholdX(): Unit = js.native
    def resetDragScrollThresholdY(): Unit = js.native
    def setDragScrollSlowDownFactor(value: js.Any): Float = js.native
    def setDragScrollThresholdX(value: js.Any): Int = js.native
    def setDragScrollThresholdY(value: js.Any): Int = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MExecutable")
trait MExecutable extends js.Object {
    protected def _applyCommand(value: qx.ui.command.Command, old: qx.ui.command.Command): Unit = js.native
    def execute(): Unit = js.native
    def getCommand(): qx.ui.command.Command = js.native
    protected def initCommand(value: js.Any): qx.ui.command.Command = js.native
    def resetCommand(): Unit = js.native
    def setCommand(value: js.Any): qx.ui.command.Command = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MLayoutHandling")
trait MLayoutHandling extends js.Object {
    def getLayout(): qx.ui.layout.Abstract = js.native
    def setLayout(layout: qx.ui.layout.Abstract): Unit = js.native

}
@js.native
@JSName("qx.ui.core.MLayoutHandling")
object MLayoutHandling extends js.Object {
    def remap(members: js.Any): Unit = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MMovable")
trait MMovable extends js.Object {
    protected def _activateMoveHandle(widget: qx.ui.core.Widget): Unit = js.native
    protected def _onMovePointerDown(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onMovePointerMove(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onMovePointerUp(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onMoveRoll(e: qx.event.`type`.Roll): Unit = js.native
    def getMovable(): Boolean = js.native
    def getUseMoveFrame(): Boolean = js.native
    protected def initMovable(value: js.Any): Boolean = js.native
    protected def initUseMoveFrame(value: js.Any): Boolean = js.native
    def isMovable(): Boolean = js.native
    def isUseMoveFrame(): Boolean = js.native
    def resetMovable(): Unit = js.native
    def resetUseMoveFrame(): Unit = js.native
    def setMovable(value: js.Any): Boolean = js.native
    def setUseMoveFrame(value: js.Any): Boolean = js.native
    def toggleMovable(): Boolean = js.native
    def toggleUseMoveFrame(): Boolean = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MMultiSelectionHandling")
trait MMultiSelectionHandling extends js.Object {
    protected def _applyDragSelection(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyQuickSelection(value: Boolean, old: Boolean): Unit = js.native
    protected def _applySelectionMode(value: js.Any, old: js.Any): Unit = js.native
    protected def _getLeadItem(): qx.ui.core.Widget = js.native
    protected def _getManager(): qx.ui.core.selection.Abstract = js.native
    protected def _onSelectionChange(e: qx.event.`type`.Data): Unit = js.native
    def addToSelection(item: qx.ui.core.Widget): Unit = js.native
    def getDragSelection(): Boolean = js.native
    def getQuickSelection(): Boolean = js.native
    def getSelectables(all: Boolean): js.Array[qx.ui.core.Widget] = js.native
    def getSelection(): js.Array[qx.ui.core.Widget] = js.native
    def getSelectionContext(): String = js.native
    def getSelectionMode(): js.Dynamic = js.native
    def getSortedSelection(): js.Array[qx.ui.core.Widget] = js.native
    protected def initDragSelection(value: js.Any): Boolean = js.native
    protected def initQuickSelection(value: js.Any): Boolean = js.native
    protected def initSelectionMode(value: js.Any): js.Dynamic = js.native
    def invertSelection(): Unit = js.native
    def isDragSelection(): Boolean = js.native
    def isQuickSelection(): Boolean = js.native
    def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def removeFromSelection(item: qx.ui.core.Widget): Unit = js.native
    def resetDragSelection(): Unit = js.native
    def resetQuickSelection(): Unit = js.native
    def resetSelection(): Unit = js.native
    def resetSelectionMode(): Unit = js.native
    def selectAll(): Unit = js.native
    def selectRange(begin: qx.ui.core.Widget, end: qx.ui.core.Widget): Unit = js.native
    def setDragSelection(value: js.Any): Boolean = js.native
    def setQuickSelection(value: js.Any): Boolean = js.native
    def setSelection(items: js.Array[qx.ui.core.Widget]): Unit = js.native
    def setSelectionMode(value: js.Any): js.Dynamic = js.native
    def toggleDragSelection(): Boolean = js.native
    def toggleQuickSelection(): Boolean = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MNativeOverflow")
trait MNativeOverflow extends js.Object {
    protected def _applyOverflowX(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyOverflowY(value: js.Any, old: js.Any): Unit = js.native
    def getOverflowX(): js.Dynamic = js.native
    def getOverflowY(): js.Dynamic = js.native
    protected def initOverflowX(value: js.Any): js.Dynamic = js.native
    protected def initOverflowY(value: js.Any): js.Dynamic = js.native
    def resetOverflow(): Unit = js.native
    def resetOverflowX(): Unit = js.native
    def resetOverflowY(): Unit = js.native
    def setOverflow(overflowX: js.Any, overflowY: js.Any): Unit = js.native
    def setOverflowX(value: js.Any): js.Dynamic = js.native
    def setOverflowY(value: js.Any): js.Dynamic = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MPlacement")
trait MPlacement extends js.Object {
    protected def _getPlacementOffsets(): js.Dynamic = js.native
    protected def _place(coords: js.Any): Unit = js.native
    def getDomMove(): Boolean = js.native
    def getLayoutLocation(widget: qx.ui.core.Widget): js.Dynamic = js.native
    def getOffsetBottom(): Int = js.native
    def getOffsetLeft(): Int = js.native
    def getOffsetRight(): Int = js.native
    def getOffsetTop(): Int = js.native
    def getPlacementModeX(): js.Dynamic = js.native
    def getPlacementModeY(): js.Dynamic = js.native
    def getPlaceMethod(): js.Dynamic = js.native
    def getPosition(): js.Dynamic = js.native
    protected def initDomMove(value: js.Any): Boolean = js.native
    protected def initOffsetBottom(value: js.Any): Int = js.native
    protected def initOffsetLeft(value: js.Any): Int = js.native
    protected def initOffsetRight(value: js.Any): Int = js.native
    protected def initOffsetTop(value: js.Any): Int = js.native
    protected def initPlacementModeX(value: js.Any): js.Dynamic = js.native
    protected def initPlacementModeY(value: js.Any): js.Dynamic = js.native
    protected def initPlaceMethod(value: js.Any): js.Dynamic = js.native
    protected def initPosition(value: js.Any): js.Dynamic = js.native
    def isDomMove(): Boolean = js.native
    def moveTo(left: Int, top: Int): Unit = js.native
    def placeToElement(elem: HTMLElement, liveupdate: Boolean): Unit = js.native
    def placeToPoint(point: js.Any): Unit = js.native
    def placeToPointer(event: qx.event.`type`.Pointer): Unit = js.native
    def placeToWidget(target: qx.ui.core.Widget, liveupdate: Boolean): Boolean = js.native
    def resetDomMove(): Unit = js.native
    def resetOffset(): Unit = js.native
    def resetOffsetBottom(): Unit = js.native
    def resetOffsetLeft(): Unit = js.native
    def resetOffsetRight(): Unit = js.native
    def resetOffsetTop(): Unit = js.native
    def resetPlacementModeX(): Unit = js.native
    def resetPlacementModeY(): Unit = js.native
    def resetPlaceMethod(): Unit = js.native
    def resetPosition(): Unit = js.native
    def setDomMove(value: js.Any): Boolean = js.native
    def setOffset(offsetTop: js.Any, offsetRight: js.Any, offsetBottom: js.Any, offsetLeft: js.Any): Unit = js.native
    def setOffsetBottom(value: js.Any): Int = js.native
    def setOffsetLeft(value: js.Any): Int = js.native
    def setOffsetRight(value: js.Any): Int = js.native
    def setOffsetTop(value: js.Any): Int = js.native
    def setPlacementModeX(value: js.Any): js.Dynamic = js.native
    def setPlacementModeY(value: js.Any): js.Dynamic = js.native
    def setPlaceMethod(value: js.Any): js.Dynamic = js.native
    def setPosition(value: js.Any): js.Dynamic = js.native
    def toggleDomMove(): Boolean = js.native

}
@js.native
@JSName("qx.ui.core.MPlacement")
object MPlacement extends js.Object {
    def getMoveDirection(): String = js.native
    def getVisibleElement(): qx.ui.core.Widget = js.native
    def setMoveDirection(direction: String): Unit = js.native
    def setVisibleElement(elem: qx.ui.core.Widget): Unit = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MRemoteChildrenHandling")
trait MRemoteChildrenHandling extends js.Object {
    def add(child: qx.ui.core.LayoutItem, options: js.Any = ???): qx.ui.core.Widget = js.native
    def addAfter(child: qx.ui.core.LayoutItem, after: qx.ui.core.LayoutItem, options: js.Any = ???): Unit = js.native
    def addAt(child: qx.ui.core.LayoutItem, index: Int, options: js.Any = ???): Unit = js.native
    def addBefore(child: qx.ui.core.LayoutItem, before: qx.ui.core.LayoutItem, options: js.Any = ???): Unit = js.native
    def getChildren(): js.Array[qx.ui.core.LayoutItem] = js.native
    def hasChildren(): Boolean = js.native
    def indexOf(child: qx.ui.core.LayoutItem): Int = js.native
    def remove(child: qx.ui.core.LayoutItem): qx.ui.core.Widget = js.native
    def removeAll(): qx.data.Array = js.native
    def removeAt(index: Int): qx.ui.core.LayoutItem = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MRemoteLayoutHandling")
trait MRemoteLayoutHandling extends js.Object {
    def getLayout(): qx.ui.layout.Abstract = js.native
    def setLayout(layout: qx.ui.layout.Abstract): Unit = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MResizable")
trait MResizable extends js.Object {
    protected def _getResizeFrame(): qx.ui.core.Widget = js.native
    def getResizableBottom(): Boolean = js.native
    def getResizableLeft(): Boolean = js.native
    def getResizableRight(): Boolean = js.native
    def getResizableTop(): Boolean = js.native
    def getResizeSensitivity(): Int = js.native
    def getUseResizeFrame(): Boolean = js.native
    protected def initResizableBottom(value: js.Any): Boolean = js.native
    protected def initResizableLeft(value: js.Any): Boolean = js.native
    protected def initResizableRight(value: js.Any): Boolean = js.native
    protected def initResizableTop(value: js.Any): Boolean = js.native
    protected def initResizeSensitivity(value: js.Any): Int = js.native
    protected def initUseResizeFrame(value: js.Any): Boolean = js.native
    def isResizableBottom(): Boolean = js.native
    def isResizableLeft(): Boolean = js.native
    def isResizableRight(): Boolean = js.native
    def isResizableTop(): Boolean = js.native
    def isUseResizeFrame(): Boolean = js.native
    def resetResizable(): Unit = js.native
    def resetResizableBottom(): Unit = js.native
    def resetResizableLeft(): Unit = js.native
    def resetResizableRight(): Unit = js.native
    def resetResizableTop(): Unit = js.native
    def resetResizeSensitivity(): Unit = js.native
    def resetUseResizeFrame(): Unit = js.native
    def setResizable(resizableTop: js.Any, resizableRight: js.Any, resizableBottom: js.Any, resizableLeft: js.Any): Unit = js.native
    def setResizableBottom(value: js.Any): Boolean = js.native
    def setResizableLeft(value: js.Any): Boolean = js.native
    def setResizableRight(value: js.Any): Boolean = js.native
    def setResizableTop(value: js.Any): Boolean = js.native
    def setResizeSensitivity(value: js.Any): Int = js.native
    def setUseResizeFrame(value: js.Any): Boolean = js.native
    def toggleResizableBottom(): Boolean = js.native
    def toggleResizableLeft(): Boolean = js.native
    def toggleResizableRight(): Boolean = js.native
    def toggleResizableTop(): Boolean = js.native
    def toggleUseResizeFrame(): Boolean = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.MSingleSelectionHandling")
trait MSingleSelectionHandling extends js.Object {
    protected def _onChangeSelected(e: qx.event.`type`.Data): Unit = js.native
    def getSelectables(all: Boolean): js.Array[qx.ui.core.Widget] = js.native
    def getSelection(): js.Array[qx.ui.core.Widget] = js.native
    def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def resetSelection(): Unit = js.native
    def setSelection(items: js.Array[qx.ui.core.Widget]): Unit = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.SingleSelectionManager")
class SingleSelectionManager protected () extends qx.core.Object {
    def this(selectionProvider: qx.ui.core.ISingleSelectionProvider = ???) = this()
    def getAllowEmptySelection(): Boolean = js.native
    def getSelectables(all: Boolean): js.Array[qx.ui.core.Widget] = js.native
    def getSelected(): qx.ui.core.Widget = js.native
    protected def initAllowEmptySelection(value: js.Any): Boolean = js.native
    def isAllowEmptySelection(): Boolean = js.native
    def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def resetAllowEmptySelection(): Unit = js.native
    def resetSelected(): Unit = js.native
    def setAllowEmptySelection(value: js.Any): Boolean = js.native
    def setSelected(item: qx.ui.core.Widget): Unit = js.native
    def toggleAllowEmptySelection(): Boolean = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.Spacer")
class Spacer protected () extends qx.ui.core.LayoutItem {
    def this(width: Int = ???, height: Int = ???) = this()
    def addChildrenToQueue(queue: js.Any): Unit = js.native
    def checkAppearanceNeeds(): Unit = js.native
    def destroy(): Unit = js.native

}
}
package qx.ui.core {
@js.native
@JSName("qx.ui.core.Widget")
class Widget extends qx.ui.core.LayoutItem with qx.locale.MTranslation {
    protected def _add(child: qx.ui.core.LayoutItem, options: js.Any = ???): Unit = js.native
    protected def _addAfter(child: qx.ui.core.LayoutItem, after: qx.ui.core.LayoutItem, options: js.Any = ???): Unit = js.native
    protected def _addAt(child: qx.ui.core.LayoutItem, index: Int, options: js.Any = ???): Unit = js.native
    protected def _addBefore(child: qx.ui.core.LayoutItem, before: qx.ui.core.LayoutItem, options: js.Any = ???): Unit = js.native
    protected def _afterAddChild(child: qx.ui.core.LayoutItem): Unit = js.native
    protected def _afterRemoveChild(child: qx.ui.core.LayoutItem): Unit = js.native
    protected def _applyAnonymous(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyAppearance(value: String, old: String): Unit = js.native
    protected def _applyBackgroundColor(value: String, old: String): Unit = js.native
    protected def _applyContextMenu(value: qx.ui.menu.Menu, old: qx.ui.menu.Menu): Unit = js.native
    protected def _applyCursor(value: String, old: String): Unit = js.native
    protected def _applyDecorator(value: qx.ui.decoration.Decorator, old: qx.ui.decoration.Decorator): Unit = js.native
    protected def _applyDraggable(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyDroppable(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyEnabled(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyFocusable(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyFont(value: String, old: String): Unit = js.native
    protected def _applyKeepActive(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyKeepFocus(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyNativeContextMenu(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyOpacity(value: Long, old: Long): Unit = js.native
    protected def _applyPadding(value: Int, old: Int): Unit = js.native
    protected def _applySelectable(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyTabIndex(value: Int, old: Int): Unit = js.native
    protected def _applyTextColor(value: String, old: String): Unit = js.native
    protected def _applyToolTipText(value: String, old: String): Unit = js.native
    protected def _applyVisibility(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyZIndex(value: Int, old: Int): Unit = js.native
    protected def _createChildControl(id: String): qx.ui.core.Widget = js.native
    protected def _createChildControlImpl(id: String, hash: String = ???): qx.ui.core.Widget = js.native
    protected def _createContentElement(): qx.html.Element = js.native
    protected def _disposeChildControls(): Unit = js.native
    protected def _excludeChildControl(id: String): Unit = js.native
    protected def _findTopControl(): qx.ui.core.Widget = js.native
    protected def _getChildren(): js.Array[qx.ui.core.LayoutItem] = js.native
    protected def _getContentHeightForWidth(width: Int): Int = js.native
    protected def _getContentHint(): js.Dynamic = js.native
    protected def _getCreatedChildControls(): js.Dynamic = js.native
    protected def _getDragDropCursor(): qx.ui.core.DragDropCursor = js.native
    protected def _hasChildren(): Boolean = js.native
    protected def _indexOf(child: qx.ui.core.Widget): Int = js.native
    protected def _isChildControlVisible(id: String): Boolean = js.native
    protected def _onBeforeContextMenuOpen(e: qx.event.`type`.Data): Unit = js.native
    protected def _onContextMenuOpen(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onDrag(e: qx.event.`type`.Drag): Unit = js.native
    protected def _onDragChange(e: qx.event.`type`.Drag): Unit = js.native
    protected def _onDragEnd(e: qx.event.`type`.Drag): Unit = js.native
    protected def _onDragStart(e: qx.event.`type`.Drag): Unit = js.native
    protected def _onStopEvent(e: qx.event.`type`.Event): Unit = js.native
    protected def _releaseChildControl(id: String): qx.ui.core.Widget = js.native
    protected def _remove(child: qx.ui.core.LayoutItem): Unit = js.native
    protected def _removeAll(): qx.data.Array = js.native
    protected def _removeAt(index: Int): qx.ui.core.LayoutItem = js.native
    protected def _setLayout(layout: qx.ui.layout.Abstract): Unit = js.native
    protected def _showChildControl(id: String): qx.ui.core.Widget = js.native
    def activate(): Unit = js.native
    def addChildrenToQueue(queue: qx.data.Array): Unit = js.native
    def addState(state: String): Unit = js.native
    def blur(): Unit = js.native
    def capture(capture: Boolean = ???): Unit = js.native
    def checkAppearanceNeeds(): Unit = js.native
    def deactivate(): Unit = js.native
    def destroy(): Unit = js.native
    def exclude(): Unit = js.native
    def fadeIn(duration: Long): qx.bom.element.AnimationHandle = js.native
    def fadeOut(duration: Long): qx.bom.element.AnimationHandle = js.native
    def focus(): Unit = js.native
    def getAnonymous(): Boolean = js.native
    def getAppearance(): String = js.native
    def getBackgroundColor(): String = js.native
    def getBlockToolTip(): Boolean = js.native
    def getChildControl(id: String, notcreate: Boolean = ???): qx.ui.core.Widget = js.native
    def getChildrenContainer(): qx.ui.core.Widget = js.native
    def getContentElement(): qx.html.Element = js.native
    def getContentLocation(mode: String = ???): js.Dynamic = js.native
    def getContextMenu(): qx.ui.menu.Menu = js.native
    def getCursor(): String = js.native
    def getDecorator(): qx.ui.decoration.Decorator = js.native
    def getDraggable(): Boolean = js.native
    def getDroppable(): Boolean = js.native
    def getEnabled(): Boolean = js.native
    def getEventTarget(): qx.ui.core.Widget = js.native
    def getFocusable(): Boolean = js.native
    def getFocusElement(): qx.html.Element = js.native
    def getFocusTarget(): qx.ui.core.Widget = js.native
    def getFont(): String = js.native
    def getInnerSize(): js.Dynamic = js.native
    def getInsets(): js.Dynamic = js.native
    def getKeepActive(): Boolean = js.native
    def getKeepFocus(): Boolean = js.native
    def getLayoutChildren(): js.Array[qx.ui.core.Widget] = js.native
    def getNativeContextMenu(): Boolean = js.native
    def getOpacity(): Long = js.native
    def getPaddingBottom(): Int = js.native
    def getPaddingLeft(): Int = js.native
    def getPaddingRight(): Int = js.native
    def getPaddingTop(): Int = js.native
    def getSelectable(): Boolean = js.native
    def getShowToolTipWhenDisabled(): Boolean = js.native
    def getTabIndex(): Int = js.native
    def getTextColor(): String = js.native
    def getToolTip(): qx.ui.tooltip.ToolTip = js.native
    def getToolTipIcon(): String = js.native
    def getToolTipText(): String = js.native
    def getVisibility(): js.Dynamic = js.native
    def getZIndex(): Int = js.native
    def hasChildControl(id: String): Boolean = js.native
    def hasLayoutChildren(): Boolean = js.native
    def hasState(state: String): Boolean = js.native
    def hide(): Unit = js.native
    protected def initAnonymous(value: js.Any): Boolean = js.native
    protected def initAppearance(value: js.Any): String = js.native
    protected def initBackgroundColor(value: js.Any): String = js.native
    protected def initBlockToolTip(value: js.Any): Boolean = js.native
    protected def initContextMenu(value: js.Any): qx.ui.menu.Menu = js.native
    protected def initCursor(value: js.Any): String = js.native
    protected def initDecorator(value: js.Any): qx.ui.decoration.Decorator = js.native
    protected def initDraggable(value: js.Any): Boolean = js.native
    protected def initDroppable(value: js.Any): Boolean = js.native
    protected def initEnabled(value: js.Any): Boolean = js.native
    protected def initFocusable(value: js.Any): Boolean = js.native
    protected def initFont(value: js.Any): String = js.native
    protected def initKeepActive(value: js.Any): Boolean = js.native
    protected def initKeepFocus(value: js.Any): Boolean = js.native
    protected def initNativeContextMenu(value: js.Any): Boolean = js.native
    protected def initOpacity(value: js.Any): Long = js.native
    protected def initPaddingBottom(value: js.Any): Int = js.native
    protected def initPaddingLeft(value: js.Any): Int = js.native
    protected def initPaddingRight(value: js.Any): Int = js.native
    protected def initPaddingTop(value: js.Any): Int = js.native
    protected def initSelectable(value: js.Any): Boolean = js.native
    protected def initShowToolTipWhenDisabled(value: js.Any): Boolean = js.native
    protected def initTabIndex(value: js.Any): Int = js.native
    protected def initTextColor(value: js.Any): String = js.native
    protected def initToolTip(value: js.Any): qx.ui.tooltip.ToolTip = js.native
    protected def initToolTipIcon(value: js.Any): String = js.native
    protected def initToolTipText(value: js.Any): String = js.native
    protected def initVisibility(value: js.Any): js.Dynamic = js.native
    protected def initZIndex(value: js.Any): Int = js.native
    def invalidateLayoutChildren(): Unit = js.native
    def isAnonymous(): Boolean = js.native
    def isBlockToolTip(): Boolean = js.native
    def isCapturing(): Boolean = js.native
    def isDraggable(): Boolean = js.native
    def isDroppable(): Boolean = js.native
    def isEnabled(): Boolean = js.native
    def isFocusable(): Boolean = js.native
    def isHidden(): Boolean = js.native
    def isKeepActive(): Boolean = js.native
    def isKeepFocus(): Boolean = js.native
    def isNativeContextMenu(): Boolean = js.native
    def isSeeable(): Boolean = js.native
    def isSelectable(): Boolean = js.native
    def isShowToolTipWhenDisabled(): Boolean = js.native
    def isTabable(): Boolean = js.native
    def isVisible(): Boolean = js.native
    def releaseCapture(): Unit = js.native
    def removeState(state: String): Unit = js.native
    def replaceState(old: String, value: String): Unit = js.native
    def resetAnonymous(): Unit = js.native
    def resetAppearance(): Unit = js.native
    def resetBackgroundColor(): Unit = js.native
    def resetBlockToolTip(): Unit = js.native
    def resetContextMenu(): Unit = js.native
    def resetCursor(): Unit = js.native
    def resetDecorator(): Unit = js.native
    def resetDraggable(): Unit = js.native
    def resetDroppable(): Unit = js.native
    def resetEnabled(): Unit = js.native
    def resetFocusable(): Unit = js.native
    def resetFont(): Unit = js.native
    def resetKeepActive(): Unit = js.native
    def resetKeepFocus(): Unit = js.native
    def resetNativeContextMenu(): Unit = js.native
    def resetOpacity(): Unit = js.native
    def resetPadding(): Unit = js.native
    def resetPaddingBottom(): Unit = js.native
    def resetPaddingLeft(): Unit = js.native
    def resetPaddingRight(): Unit = js.native
    def resetPaddingTop(): Unit = js.native
    def resetSelectable(): Unit = js.native
    def resetShowToolTipWhenDisabled(): Unit = js.native
    def resetTabIndex(): Unit = js.native
    def resetTextColor(): Unit = js.native
    def resetToolTip(): Unit = js.native
    def resetToolTipIcon(): Unit = js.native
    def resetToolTipText(): Unit = js.native
    def resetVisibility(): Unit = js.native
    def resetZIndex(): Unit = js.native
    def scrollChildIntoView(child: qx.ui.core.Widget, alignX: String = ???, alignY: String = ???, direct: Boolean = ???): Unit = js.native
    def scrollChildIntoViewX(child: qx.ui.core.Widget, align: String = ???, direct: Boolean = ???): Unit = js.native
    def scrollChildIntoViewY(child: qx.ui.core.Widget, align: String = ???, direct: Boolean = ???): Unit = js.native
    def setAnonymous(value: js.Any): Boolean = js.native
    def setAppearance(value: js.Any): String = js.native
    def setBackgroundColor(value: js.Any): String = js.native
    def setBlockToolTip(value: js.Any): Boolean = js.native
    def setContextMenu(value: js.Any): qx.ui.menu.Menu = js.native
    def setCursor(value: js.Any): String = js.native
    def setDecorator(value: js.Any): qx.ui.decoration.Decorator = js.native
    def setDomLeft(value: Int): Unit = js.native
    def setDomPosition(left: Int, top: Int): Unit = js.native
    def setDomTop(value: Int): Unit = js.native
    def setDraggable(value: js.Any): Boolean = js.native
    def setDroppable(value: js.Any): Boolean = js.native
    def setEnabled(value: js.Any): Boolean = js.native
    def setFocusable(value: js.Any): Boolean = js.native
    def setFont(value: js.Any): String = js.native
    def setKeepActive(value: js.Any): Boolean = js.native
    def setKeepFocus(value: js.Any): Boolean = js.native
    def setNativeContextMenu(value: js.Any): Boolean = js.native
    def setOpacity(value: js.Any): Long = js.native
    def setPadding(paddingTop: js.Any, paddingRight: js.Any, paddingBottom: js.Any, paddingLeft: js.Any): Unit = js.native
    def setPaddingBottom(value: js.Any): Int = js.native
    def setPaddingLeft(value: js.Any): Int = js.native
    def setPaddingRight(value: js.Any): Int = js.native
    def setPaddingTop(value: js.Any): Int = js.native
    def setSelectable(value: js.Any): Boolean = js.native
    def setShowToolTipWhenDisabled(value: js.Any): Boolean = js.native
    def setTabIndex(value: js.Any): Int = js.native
    def setTextColor(value: js.Any): String = js.native
    def setToolTip(value: js.Any): qx.ui.tooltip.ToolTip = js.native
    def setToolTipIcon(value: js.Any): String = js.native
    def setToolTipText(value: js.Any): String = js.native
    def setVisibility(value: js.Any): js.Dynamic = js.native
    def setZIndex(value: js.Any): Int = js.native
    def show(): Unit = js.native
    def syncAppearance(): Unit = js.native
    def syncWidget(jobs: js.Any): Unit = js.native
    def tabFocus(): Unit = js.native
    def toggleAnonymous(): Boolean = js.native
    def toggleBlockToolTip(): Boolean = js.native
    def toggleDraggable(): Boolean = js.native
    def toggleDroppable(): Boolean = js.native
    def toggleEnabled(): Boolean = js.native
    def toggleFocusable(): Boolean = js.native
    def toggleKeepActive(): Boolean = js.native
    def toggleKeepFocus(): Boolean = js.native
    def toggleNativeContextMenu(): Boolean = js.native
    def toggleSelectable(): Boolean = js.native
    def toggleShowToolTipWhenDisabled(): Boolean = js.native
    def updateAppearance(): Unit = js.native
    def visualizeBlur(): Unit = js.native
    def visualizeFocus(): Unit = js.native

}
@js.native
@JSName("qx.ui.core.Widget")
object Widget extends js.Object {
    def contains(parent: qx.ui.core.Widget, child: qx.ui.core.Widget): Boolean = js.native
    def getWidgetByElement(element: HTMLElement, considerAnonymousState: Boolean = ???): qx.ui.core.Widget = js.native

}
}
package qx.ui.core.queue {
@js.native
@JSName("qx.ui.core.queue.Appearance")
class Appearance extends js.Object {

}
@js.native
@JSName("qx.ui.core.queue.Appearance")
object Appearance extends js.Object {
    def add(widget: qx.ui.core.Widget): Unit = js.native
    def flush(): Unit = js.native
    def has(widget: qx.ui.core.Widget): Boolean = js.native
    def remove(widget: qx.ui.core.Widget): Unit = js.native

}
}
package qx.ui.core.queue {
@js.native
@JSName("qx.ui.core.queue.Dispose")
class Dispose extends js.Object {

}
@js.native
@JSName("qx.ui.core.queue.Dispose")
object Dispose extends js.Object {
    def add(widget: qx.ui.core.Widget): Unit = js.native
    def flush(): Unit = js.native
    def isEmpty(): Boolean = js.native

}
}
package qx.ui.core.queue {
@js.native
@JSName("qx.ui.core.queue.Layout")
class Layout extends js.Object {

}
@js.native
@JSName("qx.ui.core.queue.Layout")
object Layout extends js.Object {
    def add(widget: qx.ui.core.Widget): Unit = js.native
    def flush(): Unit = js.native
    def getNestingLevel(widget: qx.ui.core.Widget): Int = js.native
    def isScheduled(widget: qx.ui.core.Widget): Boolean = js.native
    def remove(widget: qx.ui.core.Widget): Unit = js.native

}
}
package qx.ui.core.queue {
@js.native
@JSName("qx.ui.core.queue.Manager")
class Manager extends js.Object {

}
@js.native
@JSName("qx.ui.core.queue.Manager")
object Manager extends js.Object {
    def flush(): Unit = js.native
    def scheduleFlush(job: String): Unit = js.native

}
}
package qx.ui.core.queue {
@js.native
@JSName("qx.ui.core.queue.Visibility")
class Visibility extends js.Object {

}
@js.native
@JSName("qx.ui.core.queue.Visibility")
object Visibility extends js.Object {
    def add(widget: qx.ui.core.Widget): Unit = js.native
    def flush(): Unit = js.native
    def isVisible(widget: qx.ui.core.Widget): Boolean = js.native
    def remove(widget: qx.ui.core.Widget): Unit = js.native

}
}
package qx.ui.core.queue {
@js.native
@JSName("qx.ui.core.queue.Widget")
class Widget extends js.Object {

}
@js.native
@JSName("qx.ui.core.queue.Widget")
object Widget extends js.Object {
    def add(widget: qx.ui.core.Widget, job: String = ???): Unit = js.native
    def flush(): Unit = js.native
    def remove(widget: qx.ui.core.Widget, job: String = ???): Unit = js.native

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.AbstractScrollArea")
class AbstractScrollArea extends qx.ui.core.Widget with qx.ui.core.scroll.MScrollBarFactory with qx.ui.core.scroll.MRoll with qx.ui.core.MDragDropScrolling {
    protected def _computeScrollbars(): Unit = js.native
    protected def _onChangeScrollbarXVisibility(e: qx.event.`type`.Event): Unit = js.native
    protected def _onChangeScrollbarYVisibility(e: qx.event.`type`.Event): Unit = js.native
    protected def _onScrollAnimationEnd(direction: String): Unit = js.native
    protected def _onScrollBarX(e: qx.event.`type`.Data): Unit = js.native
    protected def _onScrollBarY(e: qx.event.`type`.Data): Unit = js.native
    protected def _onScrollPaneX(e: qx.event.`type`.Data): Unit = js.native
    protected def _onScrollPaneY(e: qx.event.`type`.Data): Unit = js.native
    def getItemBottom(item: qx.ui.core.Widget): Int = js.native
    def getItemLeft(item: qx.ui.core.Widget): Int = js.native
    def getItemRight(item: qx.ui.core.Widget): Int = js.native
    def getItemTop(item: qx.ui.core.Widget): Int = js.native
    def getPaneSize(): js.Dynamic = js.native
    def getScrollbarX(): js.Dynamic = js.native
    def getScrollbarY(): js.Dynamic = js.native
    def getScrollX(): Int = js.native
    def getScrollY(): Int = js.native
    protected def initScrollbarX(value: js.Any): js.Dynamic = js.native
    protected def initScrollbarY(value: js.Any): js.Dynamic = js.native
    def resetScrollbar(): Unit = js.native
    def resetScrollbarX(): Unit = js.native
    def resetScrollbarY(): Unit = js.native
    def scrollByX(value: Int, duration: Long = ???): Unit = js.native
    def scrollByY(value: Int, duration: Long = ???): Unit = js.native
    def scrollToX(value: Int, duration: Long = ???): Unit = js.native
    def scrollToY(value: Int, duration: Long = ???): Unit = js.native
    def setScrollbar(scrollbarX: js.Any, scrollbarY: js.Any): Unit = js.native
    def setScrollbarX(value: js.Any): js.Dynamic = js.native
    def setScrollbarY(value: js.Any): js.Dynamic = js.native
    def stopScrollAnimationX(): Unit = js.native
    def stopScrollAnimationY(): Unit = js.native

}
}
package qx.ui.core.scroll {
@js.native
trait IScrollBar extends js.Object {
    def getKnobFactor(): js.Dynamic = js.native
    def getMaximum(): js.Dynamic = js.native
    def getOrientation(): js.Dynamic = js.native
    def getPosition(): js.Dynamic = js.native
    protected def initKnobFactor(value: js.Any): js.Dynamic = js.native
    protected def initMaximum(value: js.Any): js.Dynamic = js.native
    protected def initOrientation(value: js.Any): js.Dynamic = js.native
    protected def initPosition(value: js.Any): js.Dynamic = js.native
    def resetKnobFactor(): Unit = js.native
    def resetMaximum(): Unit = js.native
    def resetOrientation(): Unit = js.native
    def resetPosition(): Unit = js.native
    def scrollBy(offset: Int, duration: Long): Unit = js.native
    def scrollBySteps(steps: Int, duration: Long): Unit = js.native
    def scrollTo(position: Int, duration: Long): Unit = js.native
    def setKnobFactor(value: js.Any): js.Dynamic = js.native
    def setMaximum(value: js.Any): js.Dynamic = js.native
    def setOrientation(value: js.Any): js.Dynamic = js.native
    def setPosition(value: js.Any): js.Dynamic = js.native

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.MRoll")
trait MRoll extends js.Object {
    protected def _addRollHandling(): Unit = js.native
    protected def _onPointerDownForRoll(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onRoll(e: qx.event.`type`.Roll): Unit = js.native
    protected def _removeRollHandling(): Unit = js.native

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.MScrollBarFactory")
trait MScrollBarFactory extends js.Object {
    protected def _createScrollBar(orientation: String = ???): qx.ui.core.scroll.IScrollBar = js.native

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.MWheelHandling")
trait MWheelHandling extends js.Object {
    protected def _onMouseWheel(e: qx.event.`type`.Mouse): Unit = js.native

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.NativeScrollBar")
class NativeScrollBar protected () extends qx.ui.core.Widget with qx.ui.core.scroll.IScrollBar {
    override def getKnobFactor(): js.Dynamic = js.native
    override def getMaximum(): js.Dynamic = js.native
    override def getOrientation(): js.Dynamic = js.native
    override def getPosition(): js.Dynamic = js.native
    override def resetKnobFactor(): Unit = js.native
    override def resetMaximum(): Unit = js.native
    override def resetOrientation(): Unit = js.native
    override def resetPosition(): Unit = js.native
    override def scrollBy(offset: Int, duration: Long): Unit = js.native
    override def scrollBySteps(steps: Int, duration: Long): Unit = js.native
    override def scrollTo(position: Int, duration: Long): Unit = js.native
    override def setKnobFactor(value: js.Any): js.Dynamic = js.native
    override def setMaximum(value: js.Any): js.Dynamic = js.native
    override def setOrientation(value: js.Any): js.Dynamic = js.native
    override def setPosition(value: js.Any): js.Dynamic = js.native
    def this(orientation: String = ???) = this()
    protected def _applyMaximum(value: Int, old: Int): Unit = js.native
    protected def _applyOrientation(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyPosition(value: Long, old: Long): Unit = js.native
    protected def _getScrollPaneElement(): qx.html.Element = js.native
    protected def _onAppear(e: qx.event.`type`.Data): Unit = js.native
    protected def _onScroll(e: qx.event.`type`.Event): Unit = js.native
    protected def _stopPropagation(e: qx.event.`type`.Event): Unit = js.native
    protected def _updateScrollBar(): Unit = js.native
    def getSingleStep(): Int = js.native
    protected def initSingleStep(value: js.Any): Int = js.native
    def resetSingleStep(): Unit = js.native
    def setSingleStep(value: js.Any): Int = js.native
    def stopScrollAnimation(): Unit = js.native
    def updatePosition(position: Long): Unit = js.native

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.ScrollBar")
class ScrollBar protected () extends qx.ui.core.Widget with qx.ui.core.scroll.IScrollBar {
    override def getKnobFactor(): js.Dynamic = js.native
    override def getMaximum(): js.Dynamic = js.native
    override def getOrientation(): js.Dynamic = js.native
    override def getPosition(): js.Dynamic = js.native
    override def resetKnobFactor(): Unit = js.native
    override def resetMaximum(): Unit = js.native
    override def resetOrientation(): Unit = js.native
    override def resetPosition(): Unit = js.native
    override def scrollBy(offset: Int, duration: Long): Unit = js.native
    override def scrollBySteps(steps: Int, duration: Long): Unit = js.native
    override def scrollTo(position: Int, duration: Long): Unit = js.native
    override def setKnobFactor(value: js.Any): js.Dynamic = js.native
    override def setMaximum(value: js.Any): js.Dynamic = js.native
    override def setOrientation(value: js.Any): js.Dynamic = js.native
    override def setPosition(value: js.Any): js.Dynamic = js.native
    def this(orientation: String = ???) = this()
    protected def _applyKnobFactor(value: Long, old: Long): Unit = js.native
    protected def _applyMaximum(value: Int, old: Int): Unit = js.native
    protected def _applyOrientation(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyPageStep(value: Int, old: Int): Unit = js.native
    protected def _applyPosition(value: js.Any, old: js.Any): Unit = js.native
    protected def _onChangeSliderValue(e: qx.event.`type`.Data): Unit = js.native
    protected def _onExecuteBegin(e: qx.event.`type`.Event): Unit = js.native
    protected def _onExecuteEnd(e: qx.event.`type`.Event): Unit = js.native
    protected def _onResizeSlider(e: qx.event.`type`.Data): Unit = js.native
    protected def _onSlideAnimationEnd(): Unit = js.native
    def getPageStep(): Int = js.native
    def getSingleStep(): Int = js.native
    protected def initPageStep(value: js.Any): Int = js.native
    protected def initSingleStep(value: js.Any): Int = js.native
    def resetPageStep(): Unit = js.native
    def resetSingleStep(): Unit = js.native
    def setPageStep(value: js.Any): Int = js.native
    def setSingleStep(value: js.Any): Int = js.native
    def stopScrollAnimation(): Unit = js.native
    def updatePosition(position: Long): Unit = js.native

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.ScrollPane")
class ScrollPane extends qx.ui.core.Widget {
    protected def _applyScrollX(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyScrollY(value: js.Any, old: js.Any): Unit = js.native
    protected def _onAppear(e: qx.event.`type`.Event): Unit = js.native
    protected def _onScroll(e: qx.event.`type`.Event): Unit = js.native
    protected def _onUpdate(e: qx.event.`type`.Event): Unit = js.native
    def add(widget: qx.ui.core.Widget = ???): Unit = js.native
    def getChildren(): js.Array[js.Dynamic] = js.native
    def getItemBottom(item: qx.ui.core.Widget): Int = js.native
    def getItemLeft(item: qx.ui.core.Widget): Int = js.native
    def getItemRight(item: qx.ui.core.Widget): Int = js.native
    def getItemTop(item: qx.ui.core.Widget): Int = js.native
    def getScrollMaxX(): Int = js.native
    def getScrollMaxY(): Int = js.native
    def getScrollSize(): js.Dynamic = js.native
    def getScrollX(): js.Dynamic = js.native
    def getScrollY(): js.Dynamic = js.native
    protected def initScrollX(value: js.Any): js.Dynamic = js.native
    protected def initScrollY(value: js.Any): js.Dynamic = js.native
    def remove(widget: qx.ui.core.Widget = ???): Unit = js.native
    def resetScrollX(): Unit = js.native
    def resetScrollY(): Unit = js.native
    def scrollByX(x: Int = ???, duration: Long = ???): Unit = js.native
    def scrollByY(y: Int = ???, duration: Long = ???): Unit = js.native
    def scrollToX(value: Int, duration: Long = ???): Unit = js.native
    def scrollToY(value: Int, duration: Long = ???): Unit = js.native
    def setScrollX(value: js.Any): js.Dynamic = js.native
    def setScrollY(value: js.Any): js.Dynamic = js.native
    def stopScrollAnimation(): Unit = js.native

}
}
package qx.ui.core.scroll {
@js.native
@JSName("qx.ui.core.scroll.ScrollSlider")
class ScrollSlider protected () extends qx.ui.form.Slider {
    def this(orientation: js.Any = ???) = this()

}
}
package qx.ui.core.selection {
@js.native
@JSName("qx.ui.core.selection.Abstract")
class Abstract extends qx.core.Object {
    protected def _addToSelection(item: js.Any): Unit = js.native
    protected def _applyDefaultSelection(force: Boolean): js.Dynamic = js.native
    protected def _applyMode(value: js.Any, old: js.Any): Unit = js.native
    protected def _autoSelect(): Unit = js.native
    protected def _capture(): Unit = js.native
    protected def _cleanup(): Unit = js.native
    protected def _clearSelection(): Unit = js.native
    protected def _deselectItemRange(item1: js.Any, item2: js.Any): Unit = js.native
    protected def _fireChange(context: String): Unit = js.native
    protected def _getAnchorItem(): js.Dynamic = js.native
    protected def _getDimension(): js.Dynamic = js.native
    protected def _getFirstSelectable(): js.Dynamic = js.native
    protected def _getLastSelectable(): js.Dynamic = js.native
    protected def _getLocation(): js.Dynamic = js.native
    protected def _getPage(lead: js.Any, up: Boolean = ???): Unit = js.native
    protected def _getRelatedSelectable(item: js.Any, relation: String): js.Dynamic = js.native
    protected def _getScroll(): js.Dynamic = js.native
    protected def _getSelectableFromPointerEvent(event: qx.event.`type`.Pointer): js.Dynamic = js.native
    protected def _getSelectableLocationX(item: js.Any): js.Dynamic = js.native
    protected def _getSelectableLocationY(item: js.Any): js.Dynamic = js.native
    protected def _getSelectableRange(item1: js.Any, item2: js.Any): qx.data.Array = js.native
    protected def _getSelectedItem(): js.Dynamic = js.native
    protected def _isSelectable(item: js.Any): Boolean = js.native
    protected def _onInterval(e: qx.event.`type`.Event): Unit = js.native
    protected def _releaseCapture(): Unit = js.native
    protected def _removeFromSelection(item: js.Any): Unit = js.native
    protected def _replaceMultiSelection(items: qx.data.Array): Unit = js.native
    protected def _scrollBy(xoff: Int, yoff: Int): Unit = js.native
    protected def _scrollItemIntoView(item: js.Any): Unit = js.native
    protected def _selectableToHashCode(item: js.Any): String = js.native
    protected def _selectAllItems(): Unit = js.native
    protected def _selectItemRange(item1: js.Any, item2: js.Any, extend: Boolean = ???): Unit = js.native
    protected def _setAnchorItem(value: js.Any): Unit = js.native
    protected def _setLeadItem(value: js.Any): Unit = js.native
    protected def _setSelectedItem(item: js.Any): Unit = js.native
    protected def _styleSelectable(item: js.Any, `type`: String, enabled: Boolean): Unit = js.native
    protected def _toggleInSelection(item: js.Any): Unit = js.native
    def addItem(item: js.Any): Unit = js.native
    def clearSelection(): Unit = js.native
    def getDrag(): Boolean = js.native
    def getLeadItem(): js.Dynamic = js.native
    def getMode(): js.Dynamic = js.native
    def getQuick(): Boolean = js.native
    def getSelectables(all: Boolean): qx.data.Array = js.native
    def getSelectedItem(): js.Dynamic = js.native
    def getSelection(): js.Array[js.Dynamic] = js.native
    def getSelectionContext(): String = js.native
    def getSortedSelection(): js.Array[js.Dynamic] = js.native
    def handleAddItem(e: qx.event.`type`.Data): Unit = js.native
    def handleKeyPress(event: qx.event.`type`.KeySequence): Unit = js.native
    def handleLoseCapture(event: qx.event.`type`.Pointer): Unit = js.native
    def handlePointerDown(event: qx.event.`type`.Pointer): Unit = js.native
    def handlePointerMove(event: qx.event.`type`.Pointer): Unit = js.native
    def handlePointerOver(event: qx.event.`type`.Pointer): Unit = js.native
    def handleRemoveItem(e: qx.event.`type`.Data): Unit = js.native
    def handleTap(event: qx.event.`type`.Tap): Unit = js.native
    protected def initDrag(value: js.Any): Boolean = js.native
    protected def initMode(value: js.Any): js.Dynamic = js.native
    protected def initQuick(value: js.Any): Boolean = js.native
    def invertSelection(): Unit = js.native
    def isDrag(): Boolean = js.native
    def isItemSelected(item: js.Any): Boolean = js.native
    def isQuick(): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def removeItem(item: js.Any): Unit = js.native
    def replaceSelection(items: qx.data.Array): Unit = js.native
    def resetDrag(): Unit = js.native
    def resetMode(): Unit = js.native
    def resetQuick(): Unit = js.native
    def selectAll(): Unit = js.native
    def selectItem(item: js.Any): Unit = js.native
    def selectItemRange(begin: js.Any, end: js.Any): Unit = js.native
    def setDrag(value: js.Any): Boolean = js.native
    def setMode(value: js.Any): js.Dynamic = js.native
    def setQuick(value: js.Any): Boolean = js.native
    def toggleDrag(): Boolean = js.native
    def toggleQuick(): Boolean = js.native

}
}
package qx.ui.core.selection {
@js.native
@JSName("qx.ui.core.selection.ScrollArea")
class ScrollArea extends qx.ui.core.selection.Widget {

}
}
package qx.ui.core.selection {
@js.native
@JSName("qx.ui.core.selection.Widget")
class Widget protected () extends qx.ui.core.selection.Abstract {
    def this(widget: qx.ui.core.Widget = ???) = this()
    protected def _getWidget(): qx.ui.core.Widget = js.native
    protected def _isItemSelectable(item: qx.ui.core.Widget): Boolean = js.native

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.Abstract")
class Abstract extends qx.core.Object with qx.ui.decoration.IDecorator {
    override def getInsets(): js.Dynamic = js.native
    override def getPadding(): js.Dynamic = js.native
    override def getStyles(): js.Dynamic = js.native
    protected def _getDefaultInsets(): js.Dynamic = js.native
    protected def _isInitialized(): Boolean = js.native
    protected def _resetInsets(): Unit = js.native

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.Decorator")
class Decorator extends qx.ui.decoration.Abstract with qx.ui.decoration.IDecorator with qx.ui.decoration.MBackgroundColor with qx.ui.decoration.MBorderRadius with qx.ui.decoration.MBoxShadow with qx.ui.decoration.MDoubleBorder with qx.ui.decoration.MLinearBackgroundGradient with qx.ui.decoration.MBorderImage {
    override def getInsets(): js.Dynamic = js.native
    override def getPadding(): js.Dynamic = js.native
    override def getStyles(): js.Dynamic = js.native
    protected def _getStyles(): js.Dynamic = js.native

}
}
package qx.ui.decoration {
@js.native
trait IDecorator extends js.Object {
    def getInsets(): js.Dynamic = js.native
    def getPadding(): js.Dynamic = js.native
    def getStyles(): js.Dynamic = js.native

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MBackgroundColor")
trait MBackgroundColor extends js.Object {
    protected def _applyBackgroundColor(value: String, old: String): Unit = js.native
    protected def _styleBackgroundColor(styles: js.Any): Unit = js.native
    def getBackgroundColor(): String = js.native
    protected def initBackgroundColor(value: js.Any): String = js.native
    def resetBackgroundColor(): Unit = js.native
    def setBackgroundColor(value: js.Any): String = js.native

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MBackgroundImage")
trait MBackgroundImage extends js.Object {
    protected def _applyBackgroundImage(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyBackgroundPosition(value: js.Any, old: js.Any): Unit = js.native
    protected def _styleBackgroundImage(styles: js.Any): Unit = js.native
    def getBackgroundImage(): String = js.native
    def getBackgroundPositionX(): js.Dynamic = js.native
    def getBackgroundPositionY(): js.Dynamic = js.native
    def getBackgroundRepeat(): js.Dynamic = js.native
    protected def initBackgroundImage(value: js.Any): String = js.native
    protected def initBackgroundPositionX(value: js.Any): js.Dynamic = js.native
    protected def initBackgroundPositionY(value: js.Any): js.Dynamic = js.native
    protected def initBackgroundRepeat(value: js.Any): js.Dynamic = js.native
    def resetBackgroundImage(): Unit = js.native
    def resetBackgroundPosition(): Unit = js.native
    def resetBackgroundPositionX(): Unit = js.native
    def resetBackgroundPositionY(): Unit = js.native
    def resetBackgroundRepeat(): Unit = js.native
    def setBackgroundImage(value: js.Any): String = js.native
    def setBackgroundPosition(backgroundPositionY: js.Any, backgroundPositionX: js.Any): Unit = js.native
    def setBackgroundPositionX(value: js.Any): js.Dynamic = js.native
    def setBackgroundPositionY(value: js.Any): js.Dynamic = js.native
    def setBackgroundRepeat(value: js.Any): js.Dynamic = js.native

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MBorderImage")
trait MBorderImage extends js.Object {
    protected def _applyBorderImage(value: js.Any, old: js.Any): Unit = js.native
    protected def _getDefaultInsetsForBorderImage(): js.Dynamic = js.native
    protected def _styleBorderImage(styles: js.Any): Unit = js.native
    def getBorderImage(): String = js.native
    def getBorderImageMode(): js.Dynamic = js.native
    def getFill(): Boolean = js.native
    def getRepeatX(): js.Dynamic = js.native
    def getRepeatY(): js.Dynamic = js.native
    def getSliceBottom(): Int = js.native
    def getSliceLeft(): Int = js.native
    def getSliceRight(): Int = js.native
    def getSliceTop(): Int = js.native
    protected def initBorderImage(value: js.Any): String = js.native
    protected def initBorderImageMode(value: js.Any): js.Dynamic = js.native
    protected def initFill(value: js.Any): Boolean = js.native
    protected def initRepeatX(value: js.Any): js.Dynamic = js.native
    protected def initRepeatY(value: js.Any): js.Dynamic = js.native
    protected def initSliceBottom(value: js.Any): Int = js.native
    protected def initSliceLeft(value: js.Any): Int = js.native
    protected def initSliceRight(value: js.Any): Int = js.native
    protected def initSliceTop(value: js.Any): Int = js.native
    def isFill(): Boolean = js.native
    def resetBorderImage(): Unit = js.native
    def resetBorderImageMode(): Unit = js.native
    def resetFill(): Unit = js.native
    def resetRepeat(): Unit = js.native
    def resetRepeatX(): Unit = js.native
    def resetRepeatY(): Unit = js.native
    def resetSlice(): Unit = js.native
    def resetSliceBottom(): Unit = js.native
    def resetSliceLeft(): Unit = js.native
    def resetSliceRight(): Unit = js.native
    def resetSliceTop(): Unit = js.native
    def setBorderImage(value: js.Any): String = js.native
    def setBorderImageMode(value: js.Any): js.Dynamic = js.native
    def setFill(value: js.Any): Boolean = js.native
    def setRepeat(repeatX: js.Any, repeatY: js.Any): Unit = js.native
    def setRepeatX(value: js.Any): js.Dynamic = js.native
    def setRepeatY(value: js.Any): js.Dynamic = js.native
    def setSlice(sliceTop: js.Any, sliceRight: js.Any, sliceBottom: js.Any, sliceLeft: js.Any): Unit = js.native
    def setSliceBottom(value: js.Any): Int = js.native
    def setSliceLeft(value: js.Any): Int = js.native
    def setSliceRight(value: js.Any): Int = js.native
    def setSliceTop(value: js.Any): Int = js.native
    def toggleFill(): Boolean = js.native

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MBorderRadius")
trait MBorderRadius extends js.Object {
    protected def _applyBorderRadius(value: Int, old: Int): Unit = js.native
    protected def _styleBorderRadius(styles: js.Any): Unit = js.native
    def getRadiusBottomLeft(): Int = js.native
    def getRadiusBottomRight(): Int = js.native
    def getRadiusTopLeft(): Int = js.native
    def getRadiusTopRight(): Int = js.native
    protected def initRadiusBottomLeft(value: js.Any): Int = js.native
    protected def initRadiusBottomRight(value: js.Any): Int = js.native
    protected def initRadiusTopLeft(value: js.Any): Int = js.native
    protected def initRadiusTopRight(value: js.Any): Int = js.native
    def resetRadius(): Unit = js.native
    def resetRadiusBottomLeft(): Unit = js.native
    def resetRadiusBottomRight(): Unit = js.native
    def resetRadiusTopLeft(): Unit = js.native
    def resetRadiusTopRight(): Unit = js.native
    def setRadius(radiusTopLeft: js.Any, radiusTopRight: js.Any, radiusBottomRight: js.Any, radiusBottomLeft: js.Any): Unit = js.native
    def setRadiusBottomLeft(value: js.Any): Int = js.native
    def setRadiusBottomRight(value: js.Any): Int = js.native
    def setRadiusTopLeft(value: js.Any): Int = js.native
    def setRadiusTopRight(value: js.Any): Int = js.native

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MBoxShadow")
trait MBoxShadow extends js.Object {
    protected def _applyBoxShadow(value: js.Any, old: js.Any): Unit = js.native
    protected def _styleBoxShadow(styles: js.Any): Unit = js.native
    def getInset(): Boolean = js.native
    def getShadowBlurRadius(): Int = js.native
    def getShadowColor(): String = js.native
    def getShadowHorizontalLength(): Int = js.native
    def getShadowSpreadRadius(): Int = js.native
    def getShadowVerticalLength(): Int = js.native
    protected def initInset(value: js.Any): Boolean = js.native
    protected def initShadowBlurRadius(value: js.Any): Int = js.native
    protected def initShadowColor(value: js.Any): String = js.native
    protected def initShadowHorizontalLength(value: js.Any): Int = js.native
    protected def initShadowSpreadRadius(value: js.Any): Int = js.native
    protected def initShadowVerticalLength(value: js.Any): Int = js.native
    def isInset(): Boolean = js.native
    def resetInset(): Unit = js.native
    def resetShadowBlurRadius(): Unit = js.native
    def resetShadowColor(): Unit = js.native
    def resetShadowHorizontalLength(): Unit = js.native
    def resetShadowLength(): Unit = js.native
    def resetShadowSpreadRadius(): Unit = js.native
    def resetShadowVerticalLength(): Unit = js.native
    def setInset(value: js.Any): Boolean = js.native
    def setShadowBlurRadius(value: js.Any): Int = js.native
    def setShadowColor(value: js.Any): String = js.native
    def setShadowHorizontalLength(value: js.Any): Int = js.native
    def setShadowLength(shadowHorizontalLength: js.Any, shadowVerticalLength: js.Any): Unit = js.native
    def setShadowSpreadRadius(value: js.Any): Int = js.native
    def setShadowVerticalLength(value: js.Any): Int = js.native
    def toggleInset(): Boolean = js.native

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MDoubleBorder")
trait MDoubleBorder extends js.Object with qx.ui.decoration.MSingleBorder with qx.ui.decoration.MBackgroundImage {
    protected def _applyDoubleBorder(value: js.Any, old: js.Any): Unit = js.native
    def getInnerColorBottom(): String = js.native
    def getInnerColorLeft(): String = js.native
    def getInnerColorRight(): String = js.native
    def getInnerColorTop(): String = js.native
    def getInnerOpacity(): Long = js.native
    def getInnerWidthBottom(): Long = js.native
    def getInnerWidthLeft(): Long = js.native
    def getInnerWidthRight(): Long = js.native
    def getInnerWidthTop(): Long = js.native
    protected def initInnerColorBottom(value: js.Any): String = js.native
    protected def initInnerColorLeft(value: js.Any): String = js.native
    protected def initInnerColorRight(value: js.Any): String = js.native
    protected def initInnerColorTop(value: js.Any): String = js.native
    protected def initInnerOpacity(value: js.Any): Long = js.native
    protected def initInnerWidthBottom(value: js.Any): Long = js.native
    protected def initInnerWidthLeft(value: js.Any): Long = js.native
    protected def initInnerWidthRight(value: js.Any): Long = js.native
    protected def initInnerWidthTop(value: js.Any): Long = js.native
    def resetInnerColor(): Unit = js.native
    def resetInnerColorBottom(): Unit = js.native
    def resetInnerColorLeft(): Unit = js.native
    def resetInnerColorRight(): Unit = js.native
    def resetInnerColorTop(): Unit = js.native
    def resetInnerOpacity(): Unit = js.native
    def resetInnerWidth(): Unit = js.native
    def resetInnerWidthBottom(): Unit = js.native
    def resetInnerWidthLeft(): Unit = js.native
    def resetInnerWidthRight(): Unit = js.native
    def resetInnerWidthTop(): Unit = js.native
    def setInnerColor(innerColorTop: js.Any, innerColorRight: js.Any, innerColorBottom: js.Any, innerColorLeft: js.Any): Unit = js.native
    def setInnerColorBottom(value: js.Any): String = js.native
    def setInnerColorLeft(value: js.Any): String = js.native
    def setInnerColorRight(value: js.Any): String = js.native
    def setInnerColorTop(value: js.Any): String = js.native
    def setInnerOpacity(value: js.Any): Long = js.native
    def setInnerWidth(innerWidthTop: js.Any, innerWidthRight: js.Any, innerWidthBottom: js.Any, innerWidthLeft: js.Any): Unit = js.native
    def setInnerWidthBottom(value: js.Any): Long = js.native
    def setInnerWidthLeft(value: js.Any): Long = js.native
    def setInnerWidthRight(value: js.Any): Long = js.native
    def setInnerWidthTop(value: js.Any): Long = js.native

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MLinearBackgroundGradient")
trait MLinearBackgroundGradient extends js.Object {
    protected def _applyLinearBackgroundGradient(value: js.Any, old: js.Any): Unit = js.native
    protected def _styleLinearBackgroundGradient(styles: js.Any): Unit = js.native
    def getColorPositionUnit(): js.Dynamic = js.native
    def getEndColor(): String = js.native
    def getEndColorPosition(): Long = js.native
    def getOrientation(): js.Dynamic = js.native
    def getStartColor(): String = js.native
    def getStartColorPosition(): Long = js.native
    protected def initColorPositionUnit(value: js.Any): js.Dynamic = js.native
    protected def initEndColor(value: js.Any): String = js.native
    protected def initEndColorPosition(value: js.Any): Long = js.native
    protected def initOrientation(value: js.Any): js.Dynamic = js.native
    protected def initStartColor(value: js.Any): String = js.native
    protected def initStartColorPosition(value: js.Any): Long = js.native
    def resetColorPositionUnit(): Unit = js.native
    def resetEndColor(): Unit = js.native
    def resetEndColorPosition(): Unit = js.native
    def resetGradientEnd(): Unit = js.native
    def resetGradientStart(): Unit = js.native
    def resetOrientation(): Unit = js.native
    def resetStartColor(): Unit = js.native
    def resetStartColorPosition(): Unit = js.native
    def setColorPositionUnit(value: js.Any): js.Dynamic = js.native
    def setEndColor(value: js.Any): String = js.native
    def setEndColorPosition(value: js.Any): Long = js.native
    def setGradientEnd(endColor: js.Any, endColorPosition: js.Any): Unit = js.native
    def setGradientStart(startColor: js.Any, startColorPosition: js.Any): Unit = js.native
    def setOrientation(value: js.Any): js.Dynamic = js.native
    def setStartColor(value: js.Any): String = js.native
    def setStartColorPosition(value: js.Any): Long = js.native

}
}
package qx.ui.decoration {
@js.native
@JSName("qx.ui.decoration.MSingleBorder")
trait MSingleBorder extends js.Object {
    protected def _applyStyle(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyWidth(value: Long, old: Long): Unit = js.native
    protected def _getDefaultInsetsForBorder(): js.Dynamic = js.native
    protected def _styleBorder(styles: js.Any): Unit = js.native
    def getColorBottom(): String = js.native
    def getColorLeft(): String = js.native
    def getColorRight(): String = js.native
    def getColorTop(): String = js.native
    def getStyleBottom(): js.Dynamic = js.native
    def getStyleLeft(): js.Dynamic = js.native
    def getStyleRight(): js.Dynamic = js.native
    def getStyleTop(): js.Dynamic = js.native
    def getWidthBottom(): Long = js.native
    def getWidthLeft(): Long = js.native
    def getWidthRight(): Long = js.native
    def getWidthTop(): Long = js.native
    protected def initColorBottom(value: js.Any): String = js.native
    protected def initColorLeft(value: js.Any): String = js.native
    protected def initColorRight(value: js.Any): String = js.native
    protected def initColorTop(value: js.Any): String = js.native
    protected def initStyleBottom(value: js.Any): js.Dynamic = js.native
    protected def initStyleLeft(value: js.Any): js.Dynamic = js.native
    protected def initStyleRight(value: js.Any): js.Dynamic = js.native
    protected def initStyleTop(value: js.Any): js.Dynamic = js.native
    protected def initWidthBottom(value: js.Any): Long = js.native
    protected def initWidthLeft(value: js.Any): Long = js.native
    protected def initWidthRight(value: js.Any): Long = js.native
    protected def initWidthTop(value: js.Any): Long = js.native
    def resetBottom(): Unit = js.native
    def resetColor(): Unit = js.native
    def resetColorBottom(): Unit = js.native
    def resetColorLeft(): Unit = js.native
    def resetColorRight(): Unit = js.native
    def resetColorTop(): Unit = js.native
    def resetLeft(): Unit = js.native
    def resetRight(): Unit = js.native
    def resetStyle(): Unit = js.native
    def resetStyleBottom(): Unit = js.native
    def resetStyleLeft(): Unit = js.native
    def resetStyleRight(): Unit = js.native
    def resetStyleTop(): Unit = js.native
    def resetTop(): Unit = js.native
    def resetWidth(): Unit = js.native
    def resetWidthBottom(): Unit = js.native
    def resetWidthLeft(): Unit = js.native
    def resetWidthRight(): Unit = js.native
    def resetWidthTop(): Unit = js.native
    def setBottom(widthBottom: js.Any, styleBottom: js.Any, colorBottom: js.Any): Unit = js.native
    def setColor(colorTop: js.Any, colorRight: js.Any, colorBottom: js.Any, colorLeft: js.Any): Unit = js.native
    def setColorBottom(value: js.Any): String = js.native
    def setColorLeft(value: js.Any): String = js.native
    def setColorRight(value: js.Any): String = js.native
    def setColorTop(value: js.Any): String = js.native
    def setLeft(widthLeft: js.Any, styleLeft: js.Any, colorLeft: js.Any): Unit = js.native
    def setRight(widthRight: js.Any, styleRight: js.Any, colorRight: js.Any): Unit = js.native
    def setStyle(styleTop: js.Any, styleRight: js.Any, styleBottom: js.Any, styleLeft: js.Any): Unit = js.native
    def setStyleBottom(value: js.Any): js.Dynamic = js.native
    def setStyleLeft(value: js.Any): js.Dynamic = js.native
    def setStyleRight(value: js.Any): js.Dynamic = js.native
    def setStyleTop(value: js.Any): js.Dynamic = js.native
    def setTop(widthTop: js.Any, styleTop: js.Any, colorTop: js.Any): Unit = js.native
    def setWidth(widthTop: js.Any, widthRight: js.Any, widthBottom: js.Any, widthLeft: js.Any): Unit = js.native
    def setWidthBottom(value: js.Any): Long = js.native
    def setWidthLeft(value: js.Any): Long = js.native
    def setWidthRight(value: js.Any): Long = js.native
    def setWidthTop(value: js.Any): Long = js.native

}
}
package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.AbstractIframe")
class AbstractIframe protected () extends qx.ui.core.Widget {
    def this(source: String = ???) = this()
    protected def _applyFrameName(value: String, old: String): Unit = js.native
    protected def _applySource(value: String, old: String): Unit = js.native
    protected def _getIframeElement(): qx.html.Iframe = js.native
    def getBody(): HTMLElement = js.native
    def getDocument(): Document = js.native
    def getFrameName(): String = js.native
    def getName(): String = js.native
    def getSource(): String = js.native
    def getWindow(): Window = js.native
    protected def initFrameName(value: js.Any): String = js.native
    protected def initSource(value: js.Any): String = js.native
    def reload(): Unit = js.native
    def resetFrameName(): Unit = js.native
    def resetSource(): Unit = js.native
    def setFrameName(value: js.Any): String = js.native
    def setSource(value: js.Any): String = js.native

}
}
package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.Canvas")
class Canvas protected () extends qx.ui.core.Widget {
    def this(canvasWidth: Int = ???, canvasHeight: Int = ???) = this()
    protected def _applyCanvasHeight(value: Int, old: Int): Unit = js.native
    protected def _applyCanvasWidth(value: Int, old: Int): Unit = js.native
    protected def _draw(width: Int, height: Int, context: CanvasRenderingContext2D): Unit = js.native
    protected def _onResize(e: qx.event.`type`.Data): Unit = js.native
    def getCanvasHeight(): Int = js.native
    def getCanvasWidth(): Int = js.native
    def getContext2d(): CanvasRenderingContext2D = js.native
    def getSyncDimension(): Boolean = js.native
    protected def initCanvasHeight(value: js.Any): Int = js.native
    protected def initCanvasWidth(value: js.Any): Int = js.native
    protected def initSyncDimension(value: js.Any): Boolean = js.native
    def isSyncDimension(): Boolean = js.native
    def resetCanvasHeight(): Unit = js.native
    def resetCanvasWidth(): Unit = js.native
    def resetSyncDimension(): Unit = js.native
    def setCanvasHeight(value: js.Any): Int = js.native
    def setCanvasWidth(value: js.Any): Int = js.native
    def setSyncDimension(value: js.Any): Boolean = js.native
    def toggleSyncDimension(): Boolean = js.native
    def update(): Unit = js.native

}
}
package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.Flash")
class Flash protected () extends qx.ui.core.Widget {
    def this(source: String = ???, id: String = ???) = this()
    protected def _applyAllowScriptAccess(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyId(value: String, old: String): Unit = js.native
    protected def _applyLiveConnect(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyLoop(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyMayScript(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyMenu(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyPlay(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyQuality(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyScale(value: js.Any, old: js.Any): Unit = js.native
    protected def _applySource(value: String, old: String): Unit = js.native
    protected def _applyVariables(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyWmode(value: js.Any, old: js.Any): Unit = js.native
    protected def _checkLoading(): Unit = js.native
    def getAllowScriptAccess(): js.Dynamic = js.native
    def getFlashElement(): HTMLElement = js.native
    def getId(): String = js.native
    def getLiveConnect(): Boolean = js.native
    def getLoadTimeout(): Int = js.native
    def getLoop(): Boolean = js.native
    def getMayScript(): Boolean = js.native
    def getMenu(): Boolean = js.native
    def getPercentLoaded(): Int = js.native
    def getPlay(): Boolean = js.native
    def getQuality(): js.Dynamic = js.native
    def getScale(): js.Dynamic = js.native
    def getSource(): String = js.native
    def getVariables(): js.Dynamic = js.native
    def getWmode(): js.Dynamic = js.native
    protected def initAllowScriptAccess(value: js.Any): js.Dynamic = js.native
    protected def initId(value: js.Any): String = js.native
    protected def initLiveConnect(value: js.Any): Boolean = js.native
    protected def initLoadTimeout(value: js.Any): Int = js.native
    protected def initLoop(value: js.Any): Boolean = js.native
    protected def initMayScript(value: js.Any): Boolean = js.native
    protected def initMenu(value: js.Any): Boolean = js.native
    protected def initPlay(value: js.Any): Boolean = js.native
    protected def initQuality(value: js.Any): js.Dynamic = js.native
    protected def initScale(value: js.Any): js.Dynamic = js.native
    protected def initSource(value: js.Any): String = js.native
    protected def initVariables(value: js.Any): js.Dynamic = js.native
    protected def initWmode(value: js.Any): js.Dynamic = js.native
    def isLiveConnect(): Boolean = js.native
    def isLoaded(): Boolean = js.native
    def isLoop(): Boolean = js.native
    def isMayScript(): Boolean = js.native
    def isMenu(): Boolean = js.native
    def isPlay(): Boolean = js.native
    def resetAllowScriptAccess(): Unit = js.native
    def resetId(): Unit = js.native
    def resetLiveConnect(): Unit = js.native
    def resetLoadTimeout(): Unit = js.native
    def resetLoop(): Unit = js.native
    def resetMayScript(): Unit = js.native
    def resetMenu(): Unit = js.native
    def resetPlay(): Unit = js.native
    def resetQuality(): Unit = js.native
    def resetScale(): Unit = js.native
    def resetSource(): Unit = js.native
    def resetVariables(): Unit = js.native
    def resetWmode(): Unit = js.native
    def setAllowScriptAccess(value: js.Any): js.Dynamic = js.native
    def setId(value: js.Any): String = js.native
    def setLiveConnect(value: js.Any): Boolean = js.native
    def setLoadTimeout(value: js.Any): Int = js.native
    def setLoop(value: js.Any): Boolean = js.native
    def setMayScript(value: js.Any): Boolean = js.native
    def setMenu(value: js.Any): Boolean = js.native
    def setPlay(value: js.Any): Boolean = js.native
    def setQuality(value: js.Any): js.Dynamic = js.native
    def setScale(value: js.Any): js.Dynamic = js.native
    def setSource(value: js.Any): String = js.native
    def setVariables(value: js.Any): js.Dynamic = js.native
    def setWmode(value: js.Any): js.Dynamic = js.native
    def toggleLiveConnect(): Boolean = js.native
    def toggleLoop(): Boolean = js.native
    def toggleMayScript(): Boolean = js.native
    def toggleMenu(): Boolean = js.native
    def togglePlay(): Boolean = js.native

}
}
package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.Html")
class Html protected () extends qx.ui.core.Widget with qx.ui.core.MNativeOverflow {
    def this(html: String = ???) = this()
    protected def _applyCssClass(value: String, old: String): Unit = js.native
    protected def _applyHtml(value: String, old: String): Unit = js.native
    def getCssClass(): String = js.native
    def getHtml(): String = js.native
    protected def initCssClass(value: js.Any): String = js.native
    protected def initHtml(value: js.Any): String = js.native
    def resetCssClass(): Unit = js.native
    def resetHtml(): Unit = js.native
    def setCssClass(value: js.Any): String = js.native
    def setHtml(value: js.Any): String = js.native

}
}
package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.Iframe")
class Iframe protected () extends qx.ui.embed.AbstractIframe {
    def this(source: String = ???) = this()
    protected def _applyNativeHelp(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyScrollbar(value: js.Any, old: js.Any): Unit = js.native
    protected def _createBlockerElement(): js.Dynamic = js.native
    protected def _onIframeLoad(e: qx.event.`type`.Event): Unit = js.native
    protected def _onNativeContextMenu(e: qx.event.`type`.Mouse): Unit = js.native
    protected def _syncSourceAfterDOMMove(): Unit = js.native
    def block(): Unit = js.native
    def getNativeHelp(): Boolean = js.native
    def getScrollbar(): js.Dynamic = js.native
    protected def initNativeHelp(value: js.Any): Boolean = js.native
    protected def initScrollbar(value: js.Any): js.Dynamic = js.native
    def isNativeHelp(): Boolean = js.native
    def release(): Unit = js.native
    def resetNativeHelp(): Unit = js.native
    def resetScrollbar(): Unit = js.native
    def setNativeHelp(value: js.Any): Boolean = js.native
    def setScrollbar(value: js.Any): js.Dynamic = js.native
    def toggleNativeHelp(): Boolean = js.native

}
}
package qx.ui.embed {
@js.native
@JSName("qx.ui.embed.ThemedIframe")
class ThemedIframe protected () extends qx.ui.embed.AbstractIframe with qx.ui.core.scroll.MRoll {
    def this(source: js.Any = ???) = this()
    protected def _addRollListener(): Unit = js.native
    protected def _configureScrollbar(scrollbarId: String, show: Boolean, containerSize: Int, contentSize: Int): Unit = js.native
    protected def _disableScollbars(): Unit = js.native
    protected def _getIframeSize(): js.Dynamic = js.native
    protected def _onIframeLoad(): Unit = js.native
    protected def _onIframeObserverInterval(): Unit = js.native
    protected def _onIframeResize(): Unit = js.native
    protected def _onScrollBarX(e: qx.event.`type`.Data): Unit = js.native
    protected def _onScrollBarY(e: qx.event.`type`.Data): Unit = js.native
    protected def _preventIframeScrolling(): Unit = js.native
    protected def _startIframeObserver(): Unit = js.native
    protected def _stopIframeObserver(): Unit = js.native
    protected def _updateCornerWidget(): Unit = js.native
    protected def _updateScrollbars(): Unit = js.native
    def getScrollbarX(): js.Dynamic = js.native
    def getScrollbarY(): js.Dynamic = js.native
    protected def initScrollbarX(value: js.Any): js.Dynamic = js.native
    protected def initScrollbarY(value: js.Any): js.Dynamic = js.native
    def resetScrollbar(): Unit = js.native
    def resetScrollbarX(): Unit = js.native
    def resetScrollbarY(): Unit = js.native
    def scrollToX(x: Int): Unit = js.native
    def scrollToY(y: Int): Unit = js.native
    def setScrollbar(scrollbarX: js.Any, scrollbarY: js.Any): Unit = js.native
    def setScrollbarX(value: js.Any): js.Dynamic = js.native
    def setScrollbarY(value: js.Any): js.Dynamic = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.AbstractField")
class AbstractField protected () extends qx.ui.core.Widget with qx.ui.form.IStringForm with qx.ui.form.IForm with qx.ui.form.MForm {
    override def getValue(): String = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: String): Unit = js.native
    override def getEnabled(): Boolean = js.native
    override def getInvalidMessage(): String = js.native
    override def getRequired(): Boolean = js.native
    override def getRequiredInvalidMessage(): String = js.native
    override def getValid(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Unit = js.native
    override def setInvalidMessage(message: String): Unit = js.native
    override def setRequired(required: Boolean): Unit = js.native
    override def setRequiredInvalidMessage(message: String): Unit = js.native
    override def setValid(valid: Boolean): Unit = js.native
    def this(value: String = ???) = this()
    protected def _applyMaxLength(value: Int, old: Int): Unit = js.native
    protected def _applyPlaceholder(value: String, old: String): Unit = js.native
    protected def _applyReadOnly(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyTextAlign(value: js.Any, old: js.Any): Unit = js.native
    protected def _createInputElement(): qx.html.Input = js.native
    protected def _getPlaceholderElement(): Unit = js.native
    protected def _getTextSize(): js.Dynamic = js.native
    protected def _onChangeContent(e: qx.event.`type`.Data): Unit = js.native
    protected def _onChangeLocale(e: qx.event.`type`.Event): Unit = js.native
    protected def _onHtmlInput(e: qx.event.`type`.Data): Unit = js.native
    protected def _onPointerDownPlaceholder(): Unit = js.native
    protected def _onWebFontStatusChange(ev: qx.event.`type`.Data): Unit = js.native
    protected def _removePlaceholder(): Unit = js.native
    protected def _renderContentElement(innerHeight: Int, element: HTMLElement): Unit = js.native
    protected def _showPlaceholder(): Unit = js.native
    protected def _syncPlaceholder(): Unit = js.native
    def clearTextSelection(): Unit = js.native
    def getFilter(): js.RegExp = js.native
    def getLiveUpdate(): Boolean = js.native
    def getMaxLength(): Int = js.native
    def getPlaceholder(): String = js.native
    def getReadOnly(): Boolean = js.native
    def getTextAlign(): js.Dynamic = js.native
    def getTextSelection(): String = js.native
    def getTextSelectionEnd(): Int = js.native
    def getTextSelectionLength(): Int = js.native
    def getTextSelectionStart(): Int = js.native
    protected def initFilter(value: js.Any): js.RegExp = js.native
    protected def initLiveUpdate(value: js.Any): Boolean = js.native
    protected def initMaxLength(value: js.Any): Int = js.native
    protected def initPlaceholder(value: js.Any): String = js.native
    protected def initReadOnly(value: js.Any): Boolean = js.native
    protected def initTextAlign(value: js.Any): js.Dynamic = js.native
    def isLiveUpdate(): Boolean = js.native
    def isReadOnly(): Boolean = js.native
    def resetFilter(): Unit = js.native
    def resetLiveUpdate(): Unit = js.native
    def resetMaxLength(): Unit = js.native
    def resetPlaceholder(): Unit = js.native
    def resetReadOnly(): Unit = js.native
    def resetTextAlign(): Unit = js.native
    def selectAllText(): Unit = js.native
    def setFilter(value: js.Any): js.RegExp = js.native
    def setLiveUpdate(value: js.Any): Boolean = js.native
    def setMaxLength(value: js.Any): Int = js.native
    def setPlaceholder(value: js.Any): String = js.native
    def setReadOnly(value: js.Any): Boolean = js.native
    def setTextAlign(value: js.Any): js.Dynamic = js.native
    def setTextSelection(start: Int, end: Int): Unit = js.native
    def toggleLiveUpdate(): Boolean = js.native
    def toggleReadOnly(): Boolean = js.native

}
@js.native
@JSName("qx.ui.form.AbstractField")
object AbstractField extends js.Object {

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.AbstractSelectBox")
class AbstractSelectBox extends qx.ui.core.Widget with qx.ui.form.IForm with qx.ui.core.MRemoteChildrenHandling with qx.ui.form.MForm {
    override def getEnabled(): Boolean = js.native
    override def getInvalidMessage(): String = js.native
    override def getRequired(): Boolean = js.native
    override def getRequiredInvalidMessage(): String = js.native
    override def getValid(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Unit = js.native
    override def setInvalidMessage(message: String): Unit = js.native
    override def setRequired(required: Boolean): Unit = js.native
    override def setRequiredInvalidMessage(message: String): Unit = js.native
    override def setValid(valid: Boolean): Unit = js.native
    protected def _applyMaxListHeight(value: Long, old: Long): Unit = js.native
    protected def _defaultFormat(item: js.Any): String = js.native
    protected def _onBlur(e: qx.event.`type`.Focus): Unit = js.native
    protected def _onKeyPress(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onListChangeSelection(e: qx.event.`type`.Data): Unit = js.native
    protected def _onListPointerDown(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPopupChangeVisibility(e: qx.event.`type`.Data): Unit = js.native
    protected def _onResize(e: qx.event.`type`.Data): Unit = js.native
    def close(): Unit = js.native
    def getFormat(): js.Function = js.native
    def getMaxListHeight(): Long = js.native
    protected def initFormat(value: js.Any): js.Function = js.native
    protected def initMaxListHeight(value: js.Any): Long = js.native
    def open(): Unit = js.native
    def resetFormat(): Unit = js.native
    def resetMaxListHeight(): Unit = js.native
    def setFormat(value: js.Any): js.Function = js.native
    def setMaxListHeight(value: js.Any): Long = js.native
    def toggle(): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.Button")
class Button protected () extends qx.ui.basic.Atom with qx.ui.form.IExecutable with qx.ui.core.MExecutable {
    override def execute(): Unit = js.native
    override def getCommand(): qx.ui.command.Command = js.native
    override def setCommand(command: qx.ui.command.Command): Unit = js.native
    def this(label: String = ???, icon: String = ???, command: qx.ui.command.Command = ???) = this()
    protected def _onKeyDown(e: qx.event.`type`.Event): Unit = js.native
    protected def _onKeyUp(e: qx.event.`type`.Event): Unit = js.native
    protected def _onPointerDown(e: qx.event.`type`.Event): Unit = js.native
    protected def _onPointerOut(e: qx.event.`type`.Event): Unit = js.native
    protected def _onPointerOver(e: qx.event.`type`.Event): Unit = js.native
    protected def _onPointerUp(e: qx.event.`type`.Event): Unit = js.native
    protected def _onTap(e: qx.event.`type`.Pointer): Unit = js.native
    def press(): Unit = js.native
    def release(): Unit = js.native
    def reset(): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.CheckBox")
class CheckBox protected () extends qx.ui.form.ToggleButton with qx.ui.form.IForm with qx.ui.form.IModel with qx.ui.form.MForm with qx.ui.form.MModelProperty {
    override def getEnabled(): Boolean = js.native
    override def getInvalidMessage(): String = js.native
    override def getRequired(): Boolean = js.native
    override def getRequiredInvalidMessage(): String = js.native
    override def getValid(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Unit = js.native
    override def setInvalidMessage(message: String): Unit = js.native
    override def setRequired(required: Boolean): Unit = js.native
    override def setRequiredInvalidMessage(message: String): Unit = js.native
    override def setValid(valid: Boolean): Unit = js.native
    override def getModel(): js.Dynamic = js.native
    override def resetModel(): Unit = js.native
    override def setModel(value: js.Any): js.Dynamic = js.native
    def this(label: String = ???) = this()

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.ComboBox")
class ComboBox extends qx.ui.form.AbstractSelectBox with qx.ui.form.IStringForm {
    override def getValue(): String = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: String): Unit = js.native
    protected def _applyPlaceholder(value: String, old: String): Unit = js.native
    protected def _onTap(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onTextFieldChangeValue(e: qx.event.`type`.Data): Unit = js.native
    protected def _setPreselectedItem(): Unit = js.native
    def clearTextSelection(): Unit = js.native
    def getPlaceholder(): String = js.native
    def getTextSelection(): String = js.native
    def getTextSelectionLength(): Int = js.native
    protected def initPlaceholder(value: js.Any): String = js.native
    def resetAllTextSelection(): Unit = js.native
    def resetPlaceholder(): Unit = js.native
    def selectAllText(): Unit = js.native
    def setPlaceholder(value: js.Any): String = js.native
    def setTextSelection(start: Int, end: Int): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.DateField")
class DateField extends qx.ui.core.Widget with qx.ui.form.IForm with qx.ui.form.IDateForm with qx.ui.core.MRemoteChildrenHandling with qx.ui.form.MForm {
    override def getEnabled(): Boolean = js.native
    override def getInvalidMessage(): String = js.native
    override def getRequired(): Boolean = js.native
    override def getRequiredInvalidMessage(): String = js.native
    override def getValid(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Unit = js.native
    override def setInvalidMessage(message: String): Unit = js.native
    override def setRequired(required: Boolean): Unit = js.native
    override def setRequiredInvalidMessage(message: String): Unit = js.native
    override def setValid(valid: Boolean): Unit = js.native
    override def getValue(): js.Date = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: js.Date): Unit = js.native
    protected def _addLocaleChangeListener(): Unit = js.native
    protected def _applyDateFormat(value: qx.util.format.DateFormat, old: qx.util.format.DateFormat): Unit = js.native
    protected def _applyPlaceholder(value: String, old: String): Unit = js.native
    protected def _onBlur(e: qx.event.`type`.Focus): Unit = js.native
    protected def _onChangeDate(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onKeyPress(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onPopupChangeVisibility(e: qx.event.`type`.Data): Unit = js.native
    protected def _onTap(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onTextFieldChangeValue(e: qx.event.`type`.Data): Unit = js.native
    protected def _setDefaultDateFormat(): Unit = js.native
    def close(): Unit = js.native
    def getDateFormat(): qx.util.format.DateFormat = js.native
    def getPlaceholder(): String = js.native
    protected def initDateFormat(value: js.Any): qx.util.format.DateFormat = js.native
    protected def initPlaceholder(value: js.Any): String = js.native
    def isEmpty(): Boolean = js.native
    def open(): Unit = js.native
    def resetDateFormat(): Unit = js.native
    def resetPlaceholder(): Unit = js.native
    def setDateFormat(value: js.Any): qx.util.format.DateFormat = js.native
    def setPlaceholder(value: js.Any): String = js.native
    def toggle(): Unit = js.native

}
@js.native
@JSName("qx.ui.form.DateField")
object DateField extends js.Object {
    def getDefaultDateFormatter(): qx.util.format.DateFormat = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.Form")
class Form extends qx.core.Object {
    protected def _createResetter(): qx.ui.form.Resetter = js.native
    protected def _createValidationManager(): qx.ui.form.validation.Manager = js.native
    def add(item: qx.ui.form.IForm, label: String, validator: js.Function = ???, name: String = ???, validatorContext: js.Any = ???, options: js.Any = ???): Unit = js.native
    def addButton(button: qx.ui.form.Button, options: js.Any = ???): Unit = js.native
    def addGroupHeader(title: String, options: js.Any = ???): Unit = js.native
    def getButtonOptions(): qx.data.Array = js.native
    def getButtons(): qx.data.Array = js.native
    def getGroups(): qx.data.Array = js.native
    def getItems(): js.Dynamic = js.native
    def getValidationManager(): qx.ui.form.validation.Manager = js.native
    def redefineResetter(): Unit = js.native
    def redefineResetterItem(item: qx.ui.core.Widget): Unit = js.native
    def remove(item: qx.ui.form.IForm): Boolean = js.native
    def removeButton(button: qx.ui.form.Button): Boolean = js.native
    def removeGroupHeader(title: String): Boolean = js.native
    def reset(): Unit = js.native
    def validate(): Boolean = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.HoverButton")
class HoverButton protected () extends qx.ui.basic.Atom with qx.ui.form.IExecutable with qx.ui.core.MExecutable {
    override def execute(): Unit = js.native
    override def getCommand(): qx.ui.command.Command = js.native
    override def setCommand(command: qx.ui.command.Command): Unit = js.native
    def this(label: String = ???, icon: String = ???) = this()
    protected def _onInterval(): Unit = js.native
    protected def _onPointerOut(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerOver(e: qx.event.`type`.Pointer): Unit = js.native
    def getFirstInterval(): Int = js.native
    def getInterval(): Int = js.native
    def getMinTimer(): Int = js.native
    def getTimerDecrease(): Int = js.native
    protected def initFirstInterval(value: js.Any): Int = js.native
    protected def initInterval(value: js.Any): Int = js.native
    protected def initMinTimer(value: js.Any): Int = js.native
    protected def initTimerDecrease(value: js.Any): Int = js.native
    def resetFirstInterval(): Unit = js.native
    def resetInterval(): Unit = js.native
    def resetMinTimer(): Unit = js.native
    def resetTimerDecrease(): Unit = js.native
    def setFirstInterval(value: js.Any): Int = js.native
    def setInterval(value: js.Any): Int = js.native
    def setMinTimer(value: js.Any): Int = js.native
    def setTimerDecrease(value: js.Any): Int = js.native

}
}
package qx.ui.form {
@js.native
trait IBooleanForm extends js.Object {
    def getValue(): Boolean = js.native
    def resetValue(): Unit = js.native
    def setValue(value: Boolean): Unit = js.native

}
}
package qx.ui.form {
@js.native
trait IColorForm extends js.Object {
    def getValue(): String = js.native
    def resetValue(): Unit = js.native
    def setValue(value: String): Unit = js.native

}
}
package qx.ui.form {
@js.native
trait IDateForm extends js.Object {
    def getValue(): js.Date = js.native
    def resetValue(): Unit = js.native
    def setValue(value: js.Date): Unit = js.native

}
}
package qx.ui.form {
@js.native
trait IExecutable extends js.Object {
    def execute(): Unit = js.native
    def getCommand(): qx.ui.command.Command = js.native
    def setCommand(command: qx.ui.command.Command): Unit = js.native

}
}
package qx.ui.form {
@js.native
trait IForm extends js.Object {
    def getEnabled(): Boolean = js.native
    def getInvalidMessage(): String = js.native
    def getRequired(): Boolean = js.native
    def getRequiredInvalidMessage(): String = js.native
    def getValid(): Boolean = js.native
    def setEnabled(enabled: Boolean): Unit = js.native
    def setInvalidMessage(message: String): Unit = js.native
    def setRequired(required: Boolean): Unit = js.native
    def setRequiredInvalidMessage(message: String): Unit = js.native
    def setValid(valid: Boolean): Unit = js.native

}
}
package qx.ui.form {
@js.native
trait IModel extends js.Object {
    def getModel(): js.Dynamic = js.native
    def resetModel(): Unit = js.native
    def setModel(value: js.Any): js.Dynamic = js.native

}
}
package qx.ui.form {
@js.native
trait IModelSelection extends js.Object {
    def getModelSelection(): qx.data.Array = js.native
    def setModelSelection(value: qx.data.Array): Unit = js.native

}
}
package qx.ui.form {
@js.native
trait INumberForm extends js.Object {
    def getValue(): Long = js.native
    def resetValue(): Unit = js.native
    def setValue(value: Long): Unit = js.native

}
}
package qx.ui.form {
@js.native
trait IRadioItem extends js.Object {
    def getGroup(): qx.ui.form.RadioGroup = js.native
    def getValue(): Boolean = js.native
    def setGroup(value: qx.ui.form.RadioGroup): Unit = js.native
    def setValue(value: Boolean): Unit = js.native

}
}
package qx.ui.form {
@js.native
trait IRange extends js.Object {
    def getMaximum(): Long = js.native
    def getMinimum(): Long = js.native
    def getPageStep(): Long = js.native
    def getSingleStep(): Long = js.native
    def setMaximum(max: Long): Unit = js.native
    def setMinimum(min: Long): Unit = js.native
    def setPageStep(step: Long): Unit = js.native
    def setSingleStep(step: Long): Unit = js.native

}
}
package qx.ui.form {
@js.native
trait IStringForm extends js.Object {
    def getValue(): String = js.native
    def resetValue(): Unit = js.native
    def setValue(value: String): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.List")
class List protected () extends qx.ui.core.scroll.AbstractScrollArea with qx.ui.core.IMultiSelection with qx.ui.form.IForm with qx.ui.form.IModelSelection with qx.ui.core.MRemoteChildrenHandling with qx.ui.core.MMultiSelectionHandling with qx.ui.form.MForm with qx.ui.form.MModelSelection {
    override def addToSelection(item: qx.ui.core.Widget): Unit = js.native
    override def removeFromSelection(item: qx.ui.core.Widget): Unit = js.native
    override def selectAll(): Unit = js.native
    override def getEnabled(): Boolean = js.native
    override def getInvalidMessage(): String = js.native
    override def getRequired(): Boolean = js.native
    override def getRequiredInvalidMessage(): String = js.native
    override def getValid(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Unit = js.native
    override def setInvalidMessage(message: String): Unit = js.native
    override def setRequired(required: Boolean): Unit = js.native
    override def setRequiredInvalidMessage(message: String): Unit = js.native
    override def setValid(valid: Boolean): Unit = js.native
    override def getModelSelection(): qx.data.Array = js.native
    override def setModelSelection(value: qx.data.Array): Unit = js.native
    def this(horizontal: Boolean = ???) = this()
    protected def _applyOrientation(value: js.Any, old: js.Any): Unit = js.native
    protected def _applySpacing(value: Int, old: Int): Unit = js.native
    protected def _createListItemContainer(): qx.ui.container.Composite = js.native
    protected def _onAddChild(e: qx.event.`type`.Data): Unit = js.native
    protected def _onKeyInput(e: qx.event.`type`.KeyInput): Unit = js.native
    protected def _onKeyPress(e: qx.event.`type`.KeySequence): Boolean = js.native
    protected def _onRemoveChild(e: qx.event.`type`.Data): Unit = js.native
    def findItem(search: String, ignoreCase: Boolean = ???): qx.ui.form.ListItem = js.native
    def findItemByLabelFuzzy(search: String): qx.ui.form.ListItem = js.native
    def getEnableInlineFind(): Boolean = js.native
    def getOrientation(): js.Dynamic = js.native
    def getSpacing(): Int = js.native
    def handleKeyPress(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def initEnableInlineFind(value: js.Any): Boolean = js.native
    protected def initOrientation(value: js.Any): js.Dynamic = js.native
    protected def initSpacing(value: js.Any): Int = js.native
    def isEnableInlineFind(): Boolean = js.native
    def resetEnableInlineFind(): Unit = js.native
    def resetOrientation(): Unit = js.native
    def resetSpacing(): Unit = js.native
    def setEnableInlineFind(value: js.Any): Boolean = js.native
    def setOrientation(value: js.Any): js.Dynamic = js.native
    def setSpacing(value: js.Any): Int = js.native
    def toggleEnableInlineFind(): Boolean = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.ListItem")
class ListItem protected () extends qx.ui.basic.Atom with qx.ui.form.IModel with qx.ui.form.MModelProperty {
    override def getModel(): js.Dynamic = js.native
    override def resetModel(): Unit = js.native
    override def setModel(value: js.Any): js.Dynamic = js.native
    def this(label: String = ???, icon: String = ???, model: String = ???) = this()
    protected def _onPointerOut(): Unit = js.native
    protected def _onPointerOver(): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.MForm")
trait MForm extends js.Object {
    protected def _applyValid(value: Boolean, old: Boolean): Unit = js.native
    def getInvalidMessage(): String = js.native
    def getRequired(): Boolean = js.native
    def getRequiredInvalidMessage(): String = js.native
    def getValid(): Boolean = js.native
    protected def initInvalidMessage(value: js.Any): String = js.native
    protected def initRequired(value: js.Any): Boolean = js.native
    protected def initRequiredInvalidMessage(value: js.Any): String = js.native
    protected def initValid(value: js.Any): Boolean = js.native
    def isRequired(): Boolean = js.native
    def isValid(): Boolean = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequired(): Unit = js.native
    def resetRequiredInvalidMessage(): Unit = js.native
    def resetValid(): Unit = js.native
    def setInvalidMessage(value: js.Any): String = js.native
    def setRequired(value: js.Any): Boolean = js.native
    def setRequiredInvalidMessage(value: js.Any): String = js.native
    def setValid(value: js.Any): Boolean = js.native
    def toggleRequired(): Boolean = js.native
    def toggleValid(): Boolean = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.MModelProperty")
trait MModelProperty extends js.Object {
    protected def _applyModel(value: js.Any, old: js.Any): Unit = js.native
    def getModel(): js.Dynamic = js.native
    protected def initModel(value: js.Any): js.Dynamic = js.native
    def resetModel(): Unit = js.native
    def setModel(value: js.Any): js.Dynamic = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.MModelSelection")
trait MModelSelection extends js.Object {
    def getModelSelection(): qx.data.Array = js.native
    def setModelSelection(modelSelection: qx.data.Array): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.MenuButton")
class MenuButton protected () extends qx.ui.form.Button {
    def this(label: String = ???, icon: String = ???, menu: qx.ui.menu.Menu = ???) = this()
    protected def _applyMenu(value: qx.ui.menu.Menu, old: qx.ui.menu.Menu): Unit = js.native
    protected def _onMenuChange(e: qx.event.`type`.Data): Unit = js.native
//    def getMenu(): qx.ui.menu.Menu = js.native
//    protected def initMenu(value: js.Any): qx.ui.menu.Menu = js.native
    def open(selectFirst: Boolean = ???): Unit = js.native
    def resetMenu(): Unit = js.native
//    def setMenu(value: js.Any): qx.ui.menu.Menu = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.PasswordField")
class PasswordField extends qx.ui.form.TextField {

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.RadioButton")
class RadioButton protected () extends qx.ui.form.Button with qx.ui.form.IRadioItem with qx.ui.form.IForm with qx.ui.form.IBooleanForm with qx.ui.form.IModel with qx.ui.form.MForm with qx.ui.form.MModelProperty {
    override def getGroup(): qx.ui.form.RadioGroup = js.native
    override def getValue(): Boolean = js.native
    override def setGroup(value: qx.ui.form.RadioGroup): Unit = js.native
    override def setValue(value: Boolean): Unit = js.native
    override def getEnabled(): Boolean = js.native
    override def getInvalidMessage(): String = js.native
    override def getRequired(): Boolean = js.native
    override def getRequiredInvalidMessage(): String = js.native
    override def getValid(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Unit = js.native
    override def setInvalidMessage(message: String): Unit = js.native
    override def setRequired(required: Boolean): Unit = js.native
    override def setRequiredInvalidMessage(message: String): Unit = js.native
    override def setValid(valid: Boolean): Unit = js.native
    override def resetValue(): Unit = js.native
    override def getModel(): js.Dynamic = js.native
    override def resetModel(): Unit = js.native
    override def setModel(value: js.Any): js.Dynamic = js.native
    def this(label: String = ???) = this()
    protected def _applyGroup(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyValue(value: Boolean, old: Boolean): Unit = js.native
    protected def _onExecute(e: qx.event.`type`.Event): Unit = js.native
    protected def _onKeyPress(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def initGroup(value: js.Any): qx.ui.form.RadioGroup = js.native
    protected def initValue(value: js.Any): Boolean = js.native
    def isValue(): Boolean = js.native
    def resetGroup(): Unit = js.native
    def toggleValue(): Boolean = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.RadioButtonGroup")
class RadioButtonGroup protected () extends qx.ui.core.Widget with qx.ui.form.IForm with qx.ui.core.ISingleSelection with qx.ui.form.IModelSelection with qx.ui.core.MLayoutHandling with qx.ui.form.MModelSelection {
    override def getEnabled(): Boolean = js.native
    override def getInvalidMessage(): String = js.native
    override def getRequired(): Boolean = js.native
    override def getRequiredInvalidMessage(): String = js.native
    override def getValid(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Unit = js.native
    override def setInvalidMessage(message: String): Unit = js.native
    override def setRequired(required: Boolean): Unit = js.native
    override def setRequiredInvalidMessage(message: String): Unit = js.native
    override def setValid(valid: Boolean): Unit = js.native
    override def getSelectables(all: Boolean): js.Array[qx.ui.core.Widget] = js.native
    override def getSelection(): js.Array[qx.ui.core.Widget] = js.native
    override def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    override def isSelectionEmpty(): Boolean = js.native
    override def resetSelection(): Unit = js.native
    override def setSelection(items: js.Array[qx.ui.core.Widget]): Unit = js.native
    override def getModelSelection(): qx.data.Array = js.native
    override def setModelSelection(value: qx.data.Array): Unit = js.native
    def this(layout: qx.ui.layout.Abstract = ???) = this()
    protected def _applyInvalidMessage(value: String, old: String): Unit = js.native
    protected def _applyValid(value: Boolean, old: Boolean): Unit = js.native
    def add(child: qx.ui.core.LayoutItem, options: js.Any = ???): Unit = js.native
    def getChildren(): js.Array[qx.ui.core.LayoutItem] = js.native
    def getRadioGroup(): qx.ui.form.RadioGroup = js.native
    protected def initInvalidMessage(value: js.Any): String = js.native
    protected def initRequired(value: js.Any): Boolean = js.native
    protected def initRequiredInvalidMessage(value: js.Any): String = js.native
    protected def initValid(value: js.Any): Boolean = js.native
    def isRequired(): Boolean = js.native
    def isValid(): Boolean = js.native
    def remove(child: qx.ui.core.LayoutItem): Unit = js.native
    def removeAll(): qx.data.Array = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequired(): Unit = js.native
    def resetRequiredInvalidMessage(): Unit = js.native
    def resetValid(): Unit = js.native
    def toggleRequired(): Boolean = js.native
    def toggleValid(): Boolean = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.RadioGroup")
class RadioGroup protected () extends qx.core.Object with qx.ui.core.ISingleSelection with qx.ui.form.IForm with qx.ui.form.IModelSelection with qx.ui.core.MSingleSelectionHandling with qx.ui.form.MModelSelection {
    override def getSelectables(all: Boolean): js.Array[qx.ui.core.Widget] = js.native
    override def getSelection(): js.Array[qx.ui.core.Widget] = js.native
    override def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    override def isSelectionEmpty(): Boolean = js.native
    override def resetSelection(): Unit = js.native
    override def setSelection(items: js.Array[qx.ui.core.Widget]): Unit = js.native
    override def getEnabled(): Boolean = js.native
    override def getInvalidMessage(): String = js.native
    override def getRequired(): Boolean = js.native
    override def getRequiredInvalidMessage(): String = js.native
    override def getValid(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Unit = js.native
    override def setInvalidMessage(message: String): Unit = js.native
    override def setRequired(required: Boolean): Unit = js.native
    override def setRequiredInvalidMessage(message: String): Unit = js.native
    override def setValid(valid: Boolean): Unit = js.native
    override def getModelSelection(): qx.data.Array = js.native
    override def setModelSelection(value: qx.data.Array): Unit = js.native
    def this(varargs: qx.core.Object = ???) = this()
    protected def _applyAllowEmptySelection(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyEnabled(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyInvalidMessage(value: String, old: String): Unit = js.native
    protected def _applyValid(value: Boolean, old: Boolean): Unit = js.native
    protected def _getItems(): js.Array[qx.ui.form.IRadioItem] = js.native
    protected def _isAllowEmptySelection(): Boolean = js.native
    protected def _isItemSelectable(item: qx.ui.form.IRadioItem): Boolean = js.native
    protected def _onItemChangeChecked(e: qx.event.`type`.Data): Unit = js.native
    def add(varargs: qx.ui.form.IRadioItem = ???): Unit = js.native
    def getAllowEmptySelection(): Boolean = js.native
    def getChildren(): js.Array[qx.ui.form.IRadioItem] = js.native
    def getItems(): js.Array[qx.ui.form.IRadioItem] = js.native
    def getWrap(): Boolean = js.native
    protected def initAllowEmptySelection(value: js.Any): Boolean = js.native
    protected def initEnabled(value: js.Any): Boolean = js.native
    protected def initInvalidMessage(value: js.Any): String = js.native
    protected def initRequired(value: js.Any): Boolean = js.native
    protected def initRequiredInvalidMessage(value: js.Any): String = js.native
    protected def initValid(value: js.Any): Boolean = js.native
    protected def initWrap(value: js.Any): Boolean = js.native
    def isAllowEmptySelection(): Boolean = js.native
    def isEnabled(): Boolean = js.native
    def isRequired(): Boolean = js.native
    def isValid(): Boolean = js.native
    def isWrap(): Boolean = js.native
    def remove(item: qx.ui.form.IRadioItem): Unit = js.native
    def resetAllowEmptySelection(): Unit = js.native
    def resetEnabled(): Unit = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequired(): Unit = js.native
    def resetRequiredInvalidMessage(): Unit = js.native
    def resetValid(): Unit = js.native
    def resetWrap(): Unit = js.native
    def selectNext(): Unit = js.native
    def selectPrevious(): Unit = js.native
    def setAllowEmptySelection(value: js.Any): Boolean = js.native
    def setWrap(value: js.Any): Boolean = js.native
    def toggleAllowEmptySelection(): Boolean = js.native
    def toggleEnabled(): Boolean = js.native
    def toggleRequired(): Boolean = js.native
    def toggleValid(): Boolean = js.native
    def toggleWrap(): Boolean = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.RepeatButton")
class RepeatButton protected () extends qx.ui.form.Button {
    def this(label: String = ???, icon: String = ???) = this()
    protected def _onInterval(e: qx.event.`type`.Event): Unit = js.native
    def getFirstInterval(): Int = js.native
    def getInterval(): Int = js.native
    def getMinTimer(): Int = js.native
    def getTimerDecrease(): Int = js.native
    protected def initFirstInterval(value: js.Any): Int = js.native
    protected def initInterval(value: js.Any): Int = js.native
    protected def initMinTimer(value: js.Any): Int = js.native
    protected def initTimerDecrease(value: js.Any): Int = js.native
    def resetFirstInterval(): Unit = js.native
    def resetInterval(): Unit = js.native
    def resetMinTimer(): Unit = js.native
    def resetTimerDecrease(): Unit = js.native
    def setFirstInterval(value: js.Any): Int = js.native
    def setInterval(value: js.Any): Int = js.native
    def setMinTimer(value: js.Any): Int = js.native
    def setTimerDecrease(value: js.Any): Int = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.Resetter")
class Resetter extends qx.core.Object {
    protected def _supportsValue(formItem: qx.core.Object): Boolean = js.native
    def add(item: qx.ui.core.Widget): Unit = js.native
    def redefine(): Unit = js.native
    def redefineItem(item: qx.ui.core.Widget): Unit = js.native
    def remove(item: qx.ui.core.Widget): Boolean = js.native
    def reset(): Unit = js.native
    def resetItem(item: qx.ui.core.Widget): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.SelectBox")
class SelectBox extends qx.ui.form.AbstractSelectBox with qx.ui.core.ISingleSelection with qx.ui.form.IModelSelection with qx.ui.core.MSingleSelectionHandling with qx.ui.form.MModelSelection {
    override def getSelectables(all: Boolean): js.Array[qx.ui.core.Widget] = js.native
    override def getSelection(): js.Array[qx.ui.core.Widget] = js.native
    override def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    override def isSelectionEmpty(): Boolean = js.native
    override def resetSelection(): Unit = js.native
    override def setSelection(items: js.Array[qx.ui.core.Widget]): Unit = js.native
    override def getModelSelection(): qx.data.Array = js.native
    override def setModelSelection(value: qx.data.Array): Unit = js.native
    protected def _getItems(): js.Array[qx.ui.form.ListItem] = js.native
    protected def _isAllowEmptySelection(): Boolean = js.native
    protected def _onKeyInput(e: qx.event.`type`.KeyInput): Unit = js.native
    protected def _onPointerOut(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerOver(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onTap(e: qx.event.`type`.Pointer): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.Slider")
class Slider protected () extends qx.ui.core.Widget with qx.ui.form.IForm with qx.ui.form.INumberForm with qx.ui.form.IRange with qx.ui.form.MForm {
    override def getEnabled(): Boolean = js.native
    override def getInvalidMessage(): String = js.native
    override def getRequired(): Boolean = js.native
    override def getRequiredInvalidMessage(): String = js.native
    override def getValid(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Unit = js.native
    override def setInvalidMessage(message: String): Unit = js.native
    override def setRequired(required: Boolean): Unit = js.native
    override def setRequiredInvalidMessage(message: String): Unit = js.native
    override def setValid(valid: Boolean): Unit = js.native
    override def getValue(): Long = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: Long): Unit = js.native
    override def getMaximum(): Long = js.native
    override def getMinimum(): Long = js.native
    override def getPageStep(): Long = js.native
    override def getSingleStep(): Long = js.native
    override def setMaximum(max: Long): Unit = js.native
    override def setMinimum(min: Long): Unit = js.native
    override def setPageStep(step: Long): Unit = js.native
    override def setSingleStep(step: Long): Unit = js.native
    def this(orientation: String = ???) = this()
    protected def _applyKnobFactor(value: Long, old: Long): Unit = js.native
    protected def _applyMaximum(value: Int, old: Int): Unit = js.native
    protected def _applyMinimum(value: Int, old: Int): Unit = js.native
    protected def _applyOrientation(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyValue(value: js.Any, old: js.Any): Unit = js.native
    protected def _fireValue(): Unit = js.native
    protected def _onInterval(e: qx.event.`type`.Event): Unit = js.native
    protected def _onKeyPress(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onPointerDown(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerMove(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerOut(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerOver(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerUp(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onRoll(e: qx.event.`type`.Roll): Unit = js.native
    protected def _onUpdate(e: qx.event.`type`.Data): Unit = js.native
    protected def _positionToValue(position: Int): Int = js.native
    protected def _setKnobPosition(position: Int): Unit = js.native
    protected def _updateKnobPosition(): Unit = js.native
    protected def _updateKnobSize(): Unit = js.native
    protected def _valueToPosition(value: Int): Int = js.native
    def getKnobFactor(): Long = js.native
    def getOrientation(): js.Dynamic = js.native
    protected def initKnobFactor(value: js.Any): Long = js.native
    protected def initMaximum(value: js.Any): Int = js.native
    protected def initMinimum(value: js.Any): Int = js.native
    protected def initOrientation(value: js.Any): js.Dynamic = js.native
    protected def initPageStep(value: js.Any): Int = js.native
    protected def initSingleStep(value: js.Any): Int = js.native
    protected def initValue(value: js.Any): js.Dynamic = js.native
    def resetKnobFactor(): Unit = js.native
    def resetMaximum(): Unit = js.native
    def resetMinimum(): Unit = js.native
    def resetOrientation(): Unit = js.native
    def resetPageStep(): Unit = js.native
    def resetSingleStep(): Unit = js.native
    def setKnobFactor(value: js.Any): Long = js.native
    def setOrientation(value: js.Any): js.Dynamic = js.native
    def slideBack(): Unit = js.native
    def slideBy(offset: Int, duration: Long): Unit = js.native
    def slideForward(): Unit = js.native
    def slidePageBack(duration: Long): Unit = js.native
    def slidePageForward(duration: Long): Unit = js.native
    def slideTo(value: Int, duration: Long): Unit = js.native
    def slideToBegin(duration: Long): Unit = js.native
    def slideToEnd(duration: Long): Unit = js.native
    def stopSlideAnimation(): Unit = js.native
    def updatePosition(value: Long): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.Spinner")
class Spinner protected () extends qx.ui.core.Widget with qx.ui.form.INumberForm with qx.ui.form.IRange with qx.ui.form.IForm with qx.ui.core.MContentPadding with qx.ui.form.MForm {
    override def getValue(): Long = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: Long): Unit = js.native
    override def getMaximum(): Long = js.native
    override def getMinimum(): Long = js.native
    override def getPageStep(): Long = js.native
    override def getSingleStep(): Long = js.native
    override def setMaximum(max: Long): Unit = js.native
    override def setMinimum(min: Long): Unit = js.native
    override def setPageStep(step: Long): Unit = js.native
    override def setSingleStep(step: Long): Unit = js.native
    override def getEnabled(): Boolean = js.native
    override def getInvalidMessage(): String = js.native
    override def getRequired(): Boolean = js.native
    override def getRequiredInvalidMessage(): String = js.native
    override def getValid(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Unit = js.native
    override def setInvalidMessage(message: String): Unit = js.native
    override def setRequired(required: Boolean): Unit = js.native
    override def setRequiredInvalidMessage(message: String): Unit = js.native
    override def setValid(valid: Boolean): Unit = js.native
    def this(min: Long = ???, value: Long = ???, max: Long = ???) = this()
    protected def _applyEditable(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyMaximum(value: Long, old: Long): Unit = js.native
    protected def _applyMinimum(value: Long, old: Long): Unit = js.native
    protected def _applyNumberFormat(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyValue(value: Long, old: Long): Unit = js.native
    protected def _applyWrap(value: Boolean, old: Boolean): Unit = js.native
    protected def _checkValue(value: js.Any): Boolean = js.native
    protected def _countDown(): Unit = js.native
    protected def _countUp(): Unit = js.native
    protected def _getContentPaddingTarget(): qx.ui.core.Widget = js.native
    protected def _getFilterRegExp(): js.RegExp = js.native
    protected def _onChangeLocale(ev: qx.event.`type`.Event): Unit = js.native
    protected def _onChangeNumberFormat(ev: qx.event.`type`.Event): Unit = js.native
    protected def _onKeyDown(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onKeyUp(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onRoll(e: qx.event.`type`.Roll): Unit = js.native
    protected def _onTextChange(e: qx.event.`type`.Event): Unit = js.native
    protected def _updateButtons(): Unit = js.native
    def getEditable(): Boolean = js.native
    def getNumberFormat(): qx.util.format.NumberFormat = js.native
    def getWrap(): Boolean = js.native
    def gotoValue(value: Long): Long = js.native
    protected def initEditable(value: js.Any): Boolean = js.native
    protected def initMaximum(value: js.Any): Long = js.native
    protected def initMinimum(value: js.Any): Long = js.native
    protected def initNumberFormat(value: js.Any): qx.util.format.NumberFormat = js.native
    protected def initPageStep(value: js.Any): Long = js.native
    protected def initSingleStep(value: js.Any): Long = js.native
    protected def initValue(value: js.Any): js.Dynamic = js.native
    protected def initWrap(value: js.Any): Boolean = js.native
    def isEditable(): Boolean = js.native
    def isWrap(): Boolean = js.native
    def resetEditable(): Unit = js.native
    def resetMaximum(): Unit = js.native
    def resetMinimum(): Unit = js.native
    def resetNumberFormat(): Unit = js.native
    def resetPageStep(): Unit = js.native
    def resetSingleStep(): Unit = js.native
    def resetWrap(): Unit = js.native
    def setEditable(value: js.Any): Boolean = js.native
    def setNumberFormat(value: js.Any): qx.util.format.NumberFormat = js.native
    def setWrap(value: js.Any): Boolean = js.native
    def toggleEditable(): Boolean = js.native
    def toggleWrap(): Boolean = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.SplitButton")
class SplitButton protected () extends qx.ui.core.Widget with qx.ui.form.IExecutable with qx.ui.core.MExecutable {
    override def execute(): Unit = js.native
    override def getCommand(): qx.ui.command.Command = js.native
    override def setCommand(command: qx.ui.command.Command): Unit = js.native
    def this(label: String = ???, icon: String = ???, menu: qx.ui.menu.Menu = ???, command: qx.ui.command.Command = ???) = this()
    protected def _applyIcon(value: String, old: String): Unit = js.native
    protected def _applyLabel(value: String, old: String): Unit = js.native
    protected def _applyMenu(value: qx.ui.menu.Menu, old: qx.ui.menu.Menu): Unit = js.native
    protected def _applyShow(value: js.Any, old: js.Any): Unit = js.native
    protected def _onButtonExecute(e: qx.event.`type`.Event): Unit = js.native
    protected def _onChangeMenuVisibility(e: qx.event.`type`.Data): Unit = js.native
    protected def _onKeyDown(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onKeyUp(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onPointerOut(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerOver(e: qx.event.`type`.Pointer): Unit = js.native
    def getIcon(): String = js.native
    def getLabel(): String = js.native
    def getMenu(): qx.ui.menu.Menu = js.native
    def getShow(): js.Dynamic = js.native
    protected def initIcon(value: js.Any): String = js.native
    protected def initLabel(value: js.Any): String = js.native
    protected def initMenu(value: js.Any): qx.ui.menu.Menu = js.native
    protected def initShow(value: js.Any): js.Dynamic = js.native
    def resetIcon(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetMenu(): Unit = js.native
    def resetShow(): Unit = js.native
    def setIcon(value: js.Any): String = js.native
    def setLabel(value: js.Any): String = js.native
    def setMenu(value: js.Any): qx.ui.menu.Menu = js.native
    def setShow(value: js.Any): js.Dynamic = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.TextArea")
class TextArea protected () extends qx.ui.form.AbstractField {
    def this(value: String = ???) = this()
    protected def _applyAutoSize(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyMinimalLineHeight(value: Int, old: Int): Unit = js.native
    protected def _applyWrap(value: Boolean, old: Boolean): Unit = js.native
    protected def _getAreaHeight(): Int = js.native
    protected def _getScrolledAreaHeight(): Int = js.native
    protected def _onRoll(e: qx.event.`type`.Roll): Unit = js.native
    protected def _setAreaHeight(height: Int): Unit = js.native
    def getAutoSize(): Boolean = js.native
    def getMinimalLineHeight(): Int = js.native
    def getSingleStep(): Int = js.native
    def getWrap(): Boolean = js.native
    protected def initAutoSize(value: js.Any): Boolean = js.native
    protected def initMinimalLineHeight(value: js.Any): Int = js.native
    protected def initSingleStep(value: js.Any): Int = js.native
    protected def initWrap(value: js.Any): Boolean = js.native
    def isAutoSize(): Boolean = js.native
    def isWrap(): Boolean = js.native
    def resetAutoSize(): Unit = js.native
    def resetMinimalLineHeight(): Unit = js.native
    def resetSingleStep(): Unit = js.native
    def resetWrap(): Unit = js.native
    def setAutoSize(value: js.Any): Boolean = js.native
    def setMinimalLineHeight(value: js.Any): Int = js.native
    def setSingleStep(value: js.Any): Int = js.native
    def setWrap(value: js.Any): Boolean = js.native
    def toggleAutoSize(): Boolean = js.native
    def toggleWrap(): Boolean = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.TextField")
class TextField extends qx.ui.form.AbstractField {
    protected def _onKeyPress(evt: qx.event.`type`.KeySequence): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.ToggleButton")
class ToggleButton protected () extends qx.ui.basic.Atom with qx.ui.form.IBooleanForm with qx.ui.form.IExecutable with qx.ui.form.IRadioItem with qx.ui.core.MExecutable {
    override def getValue(): Boolean = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: Boolean): Unit = js.native
    override def execute(): Unit = js.native
    override def getCommand(): qx.ui.command.Command = js.native
    override def setCommand(command: qx.ui.command.Command): Unit = js.native
    override def getGroup(): qx.ui.form.RadioGroup = js.native
    override def setGroup(value: qx.ui.form.RadioGroup): Unit = js.native
    def this(label: String = ???, icon: String = ???) = this()
    protected def _applyGroup(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyTriState(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyValue(value: Boolean, old: Boolean): Unit = js.native
    protected def _onExecute(e: qx.event.`type`.Event): Unit = js.native
    protected def _onKeyDown(e: qx.event.`type`.Event): Unit = js.native
    protected def _onKeyUp(e: qx.event.`type`.Event): Unit = js.native
    protected def _onPointerDown(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerOut(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerOver(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerUp(e: qx.event.`type`.Pointer): Unit = js.native
    def getTriState(): Boolean = js.native
    protected def initGroup(value: js.Any): qx.ui.form.RadioGroup = js.native
    protected def initTriState(value: js.Any): Boolean = js.native
    protected def initValue(value: js.Any): Boolean = js.native
    def isTriState(): Boolean = js.native
    def isValue(): Boolean = js.native
    def resetGroup(): Unit = js.native
    def resetTriState(): Unit = js.native
    def setTriState(value: js.Any): Boolean = js.native
    def toggleTriState(): Boolean = js.native
    def toggleValue(): Boolean = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.VirtualComboBox")
class VirtualComboBox protected () extends qx.ui.form.core.AbstractVirtualBox with qx.ui.form.IStringForm {
    override def getValue(): String = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: String): Unit = js.native
    def this(model: js.Any = ???) = this()
    protected def _applyPlaceholder(value: String, old: String): Unit = js.native
    def clearTextSelection(): Unit = js.native
    def getDefaultFormat(): js.Function = js.native
    def getPlaceholder(): String = js.native
    def getTextSelection(): String = js.native
    def getTextSelectionLength(): Int = js.native
    protected def initDefaultFormat(value: js.Any): js.Function = js.native
    protected def initPlaceholder(value: js.Any): String = js.native
    protected def initValue(value: js.Any): js.Dynamic = js.native
    def resetAllTextSelection(): Unit = js.native
    def resetDefaultFormat(): Unit = js.native
    def resetPlaceholder(): Unit = js.native
    def selectAllText(): Unit = js.native
    def setDefaultFormat(value: js.Any): js.Function = js.native
    def setPlaceholder(value: js.Any): String = js.native
    def setTextSelection(start: Int, end: Int): Unit = js.native

}
}
package qx.ui.form {
@js.native
@JSName("qx.ui.form.VirtualSelectBox")
class VirtualSelectBox protected () extends qx.ui.form.core.AbstractVirtualBox with qx.data.controller.ISelection {
    override def getSelection(): qx.data.IListData = js.native
    override def resetSelection(): Unit = js.native
    override def setSelection(value: qx.data.IListData): Unit = js.native
    def this(model: js.Any = ???) = this()
    protected def _addBindings(): Unit = js.native
    protected def _applySelection(value: qx.data.Array, old: qx.data.Array): Unit = js.native
    protected def _onPointerOut(event: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerOver(event: qx.event.`type`.Pointer): Unit = js.native
    protected def _removeBindings(): Unit = js.native
    protected def initSelection(value: js.Any): qx.data.Array = js.native

}
}
package qx.ui.form.core {
@js.native
@JSName("qx.ui.form.core.AbstractVirtualBox")
class AbstractVirtualBox protected () extends qx.ui.core.Widget with qx.ui.form.IForm with qx.ui.form.MForm {
    override def getEnabled(): Boolean = js.native
    override def getInvalidMessage(): String = js.native
    override def getRequired(): Boolean = js.native
    override def getRequiredInvalidMessage(): String = js.native
    override def getValid(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Unit = js.native
    override def setInvalidMessage(message: String): Unit = js.native
    override def setRequired(required: Boolean): Unit = js.native
    override def setRequiredInvalidMessage(message: String): Unit = js.native
    override def setValid(valid: Boolean): Unit = js.native
    def this(model: qx.data.Array = ???) = this()
    protected def _applyDelegate(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyIconOptions(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyIconPath(value: String, old: String): Unit = js.native
    protected def _applyLabelOptions(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyLabelPath(value: String, old: String): Unit = js.native
    protected def _applyMaxListHeight(value: Long, old: Long): Unit = js.native
    protected def _applyModel(value: qx.data.Array, old: qx.data.Array): Unit = js.native
    protected def _applyRowHeight(value: Int, old: Int): Unit = js.native
    protected def _beforeClose(): Unit = js.native
    protected def _beforeOpen(): Unit = js.native
    protected def _getAction(event: qx.event.`type`.KeySequence): String = js.native
    protected def _getBindPath(source: String, path: String = ???): String = js.native
    protected def _handleKeyboard(event: qx.event.`type`.KeySequence): Unit = js.native
    protected def _handlePointer(event: qx.event.`type`.Pointer): Unit = js.native
    protected def _isModifierPressed(event: qx.event.`type`.KeySequence): Boolean = js.native
    protected def _onBlur(event: qx.event.`type`.Focus): Unit = js.native
    protected def _onPopupChangeVisibility(event: qx.event.`type`.Data): Unit = js.native
    protected def _onResize(event: qx.event.`type`.Data): Unit = js.native
    def close(): Unit = js.native
    def getDelegate(): js.Dynamic = js.native
    def getIconOptions(): js.Dynamic = js.native
    def getIconPath(): String = js.native
    def getItemHeight(): Int = js.native
    def getLabelOptions(): js.Dynamic = js.native
    def getLabelPath(): String = js.native
    def getMaxListHeight(): Long = js.native
    def getModel(): qx.data.Array = js.native
    protected def initDelegate(value: js.Any): js.Dynamic = js.native
    protected def initIconOptions(value: js.Any): js.Dynamic = js.native
    protected def initIconPath(value: js.Any): String = js.native
    protected def initItemHeight(value: js.Any): Int = js.native
    protected def initLabelOptions(value: js.Any): js.Dynamic = js.native
    protected def initLabelPath(value: js.Any): String = js.native
    protected def initMaxListHeight(value: js.Any): Long = js.native
    protected def initModel(value: js.Any): qx.data.Array = js.native
    def open(): Unit = js.native
    def refresh(): Unit = js.native
    def resetDelegate(): Unit = js.native
    def resetIconOptions(): Unit = js.native
    def resetIconPath(): Unit = js.native
    def resetItemHeight(): Unit = js.native
    def resetLabelOptions(): Unit = js.native
    def resetLabelPath(): Unit = js.native
    def resetMaxListHeight(): Unit = js.native
    def resetModel(): Unit = js.native
    def setDelegate(value: js.Any): js.Dynamic = js.native
    def setIconOptions(value: js.Any): js.Dynamic = js.native
    def setIconPath(value: js.Any): String = js.native
    def setItemHeight(value: js.Any): Int = js.native
    def setLabelOptions(value: js.Any): js.Dynamic = js.native
    def setLabelPath(value: js.Any): String = js.native
    def setMaxListHeight(value: js.Any): Long = js.native
    def setModel(value: js.Any): qx.data.Array = js.native
    def toggle(): Unit = js.native

}
}
package qx.ui.form.core {
@js.native
@JSName("qx.ui.form.core.VirtualDropDownList")
class VirtualDropDownList protected () extends qx.ui.popup.Popup {
    def this(target: qx.ui.form.core.AbstractVirtualBox = ???) = this()
    protected def _applySelection(value: qx.data.Array, old: qx.data.Array): Unit = js.native
    protected def _handleKeyboard(event: qx.event.`type`.KeySequence): Unit = js.native
    protected def _handlePointer(event: qx.event.`type`.Mouse): Unit = js.native
    protected def _onChangeDelegate(event: qx.event.`type`.Data): Unit = js.native
    protected def _onChangeModel(event: qx.event.`type`.Data): Unit = js.native
    protected def _onListChangeSelection(event: qx.event.`type`.Data): Unit = js.native
    def close(): Unit = js.native
    def getSelection(): qx.data.Array = js.native
    protected def initSelection(value: js.Any): qx.data.Array = js.native
    def open(): Unit = js.native
    def resetSelection(): Unit = js.native
    def setPreselected(modelItem: js.Any): Unit = js.native
    def setSelection(value: js.Any): qx.data.Array = js.native

}
}
package qx.ui.form.renderer {
@js.native
@JSName("qx.ui.form.renderer.AbstractRenderer")
class AbstractRenderer protected () extends qx.ui.core.Widget with qx.ui.form.renderer.IFormRenderer {
    override def addButton(button: qx.ui.form.Button, options: js.Any = ???): Unit = js.native
    override def addItems(items: js.Array[qx.ui.core.Widget], names: js.Array[String], title: String = ???, itemsOptions: qx.data.Array = ???, headerOptions: js.Any = ???): Unit = js.native
    def this(form: qx.ui.form.Form = ???) = this()
    protected def _connectVisibility(item: qx.ui.core.Widget, label: qx.ui.basic.Label): Unit = js.native
    protected def _createLabelText(name: String, item: qx.ui.form.IForm): String = js.native
    protected def _onChangeLocale(e: qx.event.`type`.Event): Unit = js.native
    protected def _onFormChange(): Unit = js.native
    protected def _render(): Unit = js.native

}
}
package qx.ui.form.renderer {
@js.native
@JSName("qx.ui.form.renderer.Double")
class Double protected () extends qx.ui.form.renderer.AbstractRenderer {
    def this(form: js.Any = ???) = this()
    protected def _createHeader(title: String): qx.ui.basic.Label = js.native
    protected def _createLabel(name: String, item: qx.ui.core.Widget): qx.ui.basic.Label = js.native
    def getLayout(): qx.ui.layout.Grid = js.native

}
}
package qx.ui.form.renderer {
@js.native
trait IFormRenderer extends js.Object {
    def addButton(button: qx.ui.form.Button, options: js.Any = ???): Unit = js.native
    def addItems(items: js.Array[qx.ui.core.Widget], names: js.Array[String], title: String = ???, itemsOptions: qx.data.Array = ???, headerOptions: js.Any = ???): Unit = js.native

}
}
package qx.ui.form.renderer {
@js.native
@JSName("qx.ui.form.renderer.Single")
class Single protected () extends qx.ui.form.renderer.AbstractRenderer {
    def this(form: js.Any = ???) = this()
    protected def _createHeader(title: String): qx.ui.basic.Label = js.native
    protected def _createLabel(name: String, item: qx.ui.core.Widget): qx.ui.basic.Label = js.native
    def getLayout(): qx.ui.layout.Grid = js.native

}
}
package qx.ui.form.renderer {
@js.native
@JSName("qx.ui.form.renderer.SinglePlaceholder")
class SinglePlaceholder extends qx.ui.form.renderer.Single with qx.ui.form.renderer.IFormRenderer {
    override def addButton(button: qx.ui.form.Button, options: js.Any = ???): Unit = js.native
    override def addItems(items: js.Array[qx.ui.core.Widget], names: js.Array[String], title: String = ???, itemsOptions: qx.data.Array = ???, headerOptions: js.Any = ???): Unit = js.native

}
}
package qx.ui.form.validation {
@js.native
@JSName("qx.ui.form.validation.AsyncValidator")
class AsyncValidator protected () extends qx.core.Object {
    def this(validator: js.Function = ???) = this()
    def setValid(valid: Boolean, message: String = ???): Unit = js.native
    def validate(item: qx.ui.core.Widget, value: js.Any, manager: qx.ui.form.validation.Manager, context: js.Any = ???): Unit = js.native
    def validateForm(items: js.Array[qx.ui.core.Widget], manager: qx.ui.form.validation.Manager, context: js.Any = ???): Unit = js.native

}
}
package qx.ui.form.validation {
@js.native
@JSName("qx.ui.form.validation.Manager")
class Manager extends qx.core.Object {
    protected def _setValid(value: Boolean): Unit = js.native
    protected def _showToolTip(valid: Boolean): Unit = js.native
    def add(formItem: qx.ui.core.Widget, validator: js.Function, context: js.Any = ???): Unit = js.native
    def getContext(): js.Dynamic = js.native
    def getInvalidFormItems(): qx.data.Array = js.native
    def getInvalidMessage(): String = js.native
    def getInvalidMessages(): js.Array[String] = js.native
    def getItems(): qx.data.Array = js.native
    def getRequiredFieldMessage(): String = js.native
    def getValid(): Boolean = js.native
    def getValidator(): js.Dynamic = js.native
    protected def initContext(value: js.Any): js.Dynamic = js.native
    protected def initInvalidMessage(value: js.Any): String = js.native
    protected def initRequiredFieldMessage(value: js.Any): String = js.native
    protected def initValidator(value: js.Any): js.Dynamic = js.native
    def isValid(): Boolean = js.native
    def remove(formItem: qx.ui.core.Widget): qx.ui.core.Widget = js.native
    def reset(): Unit = js.native
    def resetContext(): Unit = js.native
    def resetInvalidMessage(): Unit = js.native
    def resetRequiredFieldMessage(): Unit = js.native
    def resetValidator(): Unit = js.native
    def setContext(value: js.Any): js.Dynamic = js.native
    def setFormValid(valid: Boolean): Unit = js.native
    def setInvalidMessage(value: js.Any): String = js.native
    def setItemValid(formItem: qx.ui.core.Widget, valid: Boolean): Unit = js.native
    def setRequiredFieldMessage(value: js.Any): String = js.native
    def setValidator(value: js.Any): js.Dynamic = js.native
    def validate(): Boolean = js.native

}
}
package qx.ui.groupbox {
@js.native
@JSName("qx.ui.groupbox.CheckGroupBox")
class CheckGroupBox extends qx.ui.groupbox.GroupBox with qx.ui.form.IExecutable with qx.ui.form.IBooleanForm with qx.ui.form.IModel with qx.ui.form.MModelProperty {
    override def execute(): Unit = js.native
    override def getCommand(): qx.ui.command.Command = js.native
    override def setCommand(command: qx.ui.command.Command): Unit = js.native
    override def getValue(): Boolean = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: Boolean): Unit = js.native
    override def getModel(): js.Dynamic = js.native
    override def resetModel(): Unit = js.native
    override def setModel(value: js.Any): js.Dynamic = js.native
    protected def _onExecute(e: qx.event.`type`.Event): Unit = js.native
    protected def _onRadioChangeValue(e: qx.event.`type`.Data): Unit = js.native

}
}
package qx.ui.groupbox {
@js.native
@JSName("qx.ui.groupbox.GroupBox")
class GroupBox protected () extends qx.ui.core.Widget with qx.ui.form.IForm with qx.ui.core.MRemoteChildrenHandling with qx.ui.core.MRemoteLayoutHandling with qx.ui.core.MContentPadding with qx.ui.form.MForm {
    override def getEnabled(): Boolean = js.native
    override def getInvalidMessage(): String = js.native
    override def getRequired(): Boolean = js.native
    override def getRequiredInvalidMessage(): String = js.native
    override def getValid(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Unit = js.native
    override def setInvalidMessage(message: String): Unit = js.native
    override def setRequired(required: Boolean): Unit = js.native
    override def setRequiredInvalidMessage(message: String): Unit = js.native
    override def setValid(valid: Boolean): Unit = js.native
    def this(legend: String = ???, icon: String = ???) = this()
    protected def _applyLegendPosition(e: js.Any): Unit = js.native
    protected def _getContentPaddingTarget(): qx.ui.core.Widget = js.native
    protected def _repositionFrame(): Unit = js.native
    def getIcon(): String = js.native
    def getLegend(): String = js.native
    def getLegendPosition(): js.Dynamic = js.native
    protected def initLegendPosition(value: js.Any): js.Dynamic = js.native
    def resetLegendPosition(): Unit = js.native
    def setIcon(icon: String): Unit = js.native
    def setLegend(legend: String): Unit = js.native
    def setLegendPosition(value: js.Any): js.Dynamic = js.native

}
}
package qx.ui.groupbox {
@js.native
@JSName("qx.ui.groupbox.RadioGroupBox")
class RadioGroupBox extends qx.ui.groupbox.GroupBox with qx.ui.form.IRadioItem with qx.ui.form.IExecutable with qx.ui.form.IBooleanForm with qx.ui.form.IModel with qx.ui.form.MModelProperty {
    override def getGroup(): qx.ui.form.RadioGroup = js.native
    override def getValue(): Boolean = js.native
    override def setGroup(value: qx.ui.form.RadioGroup): Unit = js.native
    override def setValue(value: Boolean): Unit = js.native
    override def execute(): Unit = js.native
    override def getCommand(): qx.ui.command.Command = js.native
    override def setCommand(command: qx.ui.command.Command): Unit = js.native
    override def resetValue(): Unit = js.native
    override def getModel(): js.Dynamic = js.native
    override def resetModel(): Unit = js.native
    override def setModel(value: js.Any): js.Dynamic = js.native
    protected def _onExecute(e: qx.event.`type`.Event): Unit = js.native
    protected def _onRadioChangeValue(e: qx.event.`type`.Data): Unit = js.native
    def getLabel(): String = js.native

}
}
package qx.ui.indicator {
@js.native
@JSName("qx.ui.indicator.ProgressBar")
class ProgressBar protected () extends qx.ui.container.Composite {
    def this(value: Long = ???, maximum: Long = ???) = this()
    protected def _changeProgress(value: Long): Unit = js.native
    def getMaximum(): Long = js.native
    def getValue(): Long = js.native
    def setMaximum(value: Long): Long = js.native
    def setValue(value: Long): Long = js.native

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Abstract")
class Abstract extends qx.core.Object {
    protected def _applyLayoutChange(): Unit = js.native
    protected def _clearSeparators(): Unit = js.native
    protected def _computeSizeHint(): js.Dynamic = js.native
    protected def _getLayoutChildren(): qx.data.Array = js.native
    protected def _getWidget(): qx.ui.core.Widget = js.native
    protected def _renderSeparator(separator: String, bounds: js.Any): Unit = js.native
    def connectToWidget(widget: qx.ui.core.Widget): Unit = js.native
    def getHeightForWidth(width: Int): Int = js.native
    def getSizeHint(): js.Dynamic = js.native
    def hasHeightForWidth(): Boolean = js.native
    def invalidateChildrenCache(): Unit = js.native
    def invalidateLayoutCache(): Unit = js.native
    def renderLayout(availWidth: Int, availHeight: Int, padding: js.Any): Unit = js.native
    def verifyLayoutProperty(item: js.Any, name: js.Any, value: js.Any): Unit = js.native

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Atom")
class Atom extends qx.ui.layout.Abstract {
    def getCenter(): Boolean = js.native
    def getGap(): Int = js.native
    def getIconPosition(): js.Dynamic = js.native
    protected def initCenter(value: js.Any): Boolean = js.native
    protected def initGap(value: js.Any): Int = js.native
    protected def initIconPosition(value: js.Any): js.Dynamic = js.native
    def isCenter(): Boolean = js.native
    def resetCenter(): Unit = js.native
    def resetGap(): Unit = js.native
    def resetIconPosition(): Unit = js.native
    def setCenter(value: js.Any): Boolean = js.native
    def setGap(value: js.Any): Int = js.native
    def setIconPosition(value: js.Any): js.Dynamic = js.native
    def toggleCenter(): Boolean = js.native

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Basic")
class Basic extends qx.ui.layout.Abstract {

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Canvas")
class Canvas extends qx.ui.layout.Abstract {
    def getDesktop(): Boolean = js.native
    protected def initDesktop(value: js.Any): Boolean = js.native
    def isDesktop(): Boolean = js.native
    def resetDesktop(): Unit = js.native
    def setDesktop(value: js.Any): Boolean = js.native
    def toggleDesktop(): Boolean = js.native

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Dock")
class Dock protected () extends qx.ui.layout.Abstract {
    def this(spacingX: Int = ???, spacingY: Int = ???, separatorX: String = ???, separatorY: String = ???) = this()
    protected def _applySort(value: js.Any, old: js.Any): Unit = js.native
    protected def _getSeparatorWidths(): js.Dynamic = js.native
    def getConnectSeparators(): Boolean = js.native
    def getSeparatorX(): qx.ui.decoration.Decorator = js.native
    def getSeparatorY(): qx.ui.decoration.Decorator = js.native
    def getSort(): js.Dynamic = js.native
    def getSpacingX(): Int = js.native
    def getSpacingY(): Int = js.native
    protected def initConnectSeparators(value: js.Any): Boolean = js.native
    protected def initSeparatorX(value: js.Any): qx.ui.decoration.Decorator = js.native
    protected def initSeparatorY(value: js.Any): qx.ui.decoration.Decorator = js.native
    protected def initSort(value: js.Any): js.Dynamic = js.native
    protected def initSpacingX(value: js.Any): Int = js.native
    protected def initSpacingY(value: js.Any): Int = js.native
    def isConnectSeparators(): Boolean = js.native
    def resetConnectSeparators(): Unit = js.native
    def resetSeparatorX(): Unit = js.native
    def resetSeparatorY(): Unit = js.native
    def resetSort(): Unit = js.native
    def resetSpacingX(): Unit = js.native
    def resetSpacingY(): Unit = js.native
    def setConnectSeparators(value: js.Any): Boolean = js.native
    def setSeparatorX(value: js.Any): qx.ui.decoration.Decorator = js.native
    def setSeparatorY(value: js.Any): qx.ui.decoration.Decorator = js.native
    def setSort(value: js.Any): js.Dynamic = js.native
    def setSpacingX(value: js.Any): Int = js.native
    def setSpacingY(value: js.Any): Int = js.native
    def toggleConnectSeparators(): Boolean = js.native

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Flow")
class Flow protected () extends qx.ui.layout.Abstract {
    def this(spacingX: Int = ???, spacingY: Int = ???, alignX: String = ???) = this()
    def getAlignX(): js.Dynamic = js.native
    def getAlignY(): js.Dynamic = js.native
    def getLastLineChildren(width: Long): qx.data.Array = js.native
    def getReversed(): Boolean = js.native
    def getSpacingX(): Int = js.native
    def getSpacingY(): Int = js.native
    protected def initAlignX(value: js.Any): js.Dynamic = js.native
    protected def initAlignY(value: js.Any): js.Dynamic = js.native
    protected def initReversed(value: js.Any): Boolean = js.native
    protected def initSpacingX(value: js.Any): Int = js.native
    protected def initSpacingY(value: js.Any): Int = js.native
    def isReversed(): Boolean = js.native
    def resetAlignX(): Unit = js.native
    def resetAlignY(): Unit = js.native
    def resetReversed(): Unit = js.native
    def resetSpacingX(): Unit = js.native
    def resetSpacingY(): Unit = js.native
    def setAlignX(value: js.Any): js.Dynamic = js.native
    def setAlignY(value: js.Any): js.Dynamic = js.native
    def setReversed(value: js.Any): Boolean = js.native
    def setSpacingX(value: js.Any): Int = js.native
    def setSpacingY(value: js.Any): Int = js.native
    def toggleReversed(): Boolean = js.native

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Grid")
class Grid protected () extends qx.ui.layout.Abstract {
    def this(spacingX: Int = ???, spacingY: Int = ???) = this()
    protected def _fixHeightsRowSpan(rowHeights: js.Array[js.Any]): Unit = js.native
    protected def _fixWidthsColSpan(colWidths: js.Array[js.Any]): Unit = js.native
    protected def _getColumnFlexOffsets(width: Int): js.Array[Int] = js.native
    protected def _getColWidths(): js.Array[js.Any] = js.native
    protected def _getRowFlexOffsets(height: Int): js.Array[Int] = js.native
    protected def _getRowHeights(): js.Array[js.Any] = js.native
    protected def _setColumnData(column: Int, key: String, value: js.Any): Unit = js.native
    protected def _setRowData(row: Int, key: String, value: js.Any): Unit = js.native
    def getCellAlign(row: Int, column: Int): js.Dynamic = js.native
    def getCellWidget(row: Int, column: Int): qx.ui.core.Widget = js.native
    def getColumnAlign(column: Int): js.Dynamic = js.native
    def getColumnCount(): Int = js.native
    def getColumnFlex(column: Int): Int = js.native
    def getColumnMaxWidth(column: Int): Int = js.native
    def getColumnMinWidth(column: Int): Int = js.native
    def getColumnWidth(column: Int): Int = js.native
    def getRowAlign(row: Int): js.Dynamic = js.native
    def getRowCount(): Int = js.native
    def getRowFlex(row: Int): Int = js.native
    def getRowHeight(row: Int): Int = js.native
    def getRowMaxHeight(row: Int): Int = js.native
    def getRowMinHeight(row: Int): Int = js.native
    def getSpacingX(): Int = js.native
    def getSpacingY(): Int = js.native
    protected def initSpacingX(value: js.Any): Int = js.native
    protected def initSpacingY(value: js.Any): Int = js.native
    def resetSpacingX(): Unit = js.native
    def resetSpacingY(): Unit = js.native
    def setColumnAlign(column: Int, hAlign: String, vAlign: String): qx.ui.layout.Grid = js.native
    def setColumnFlex(column: Int, flex: Int): qx.ui.layout.Grid = js.native
    def setColumnMaxWidth(column: Int, maxWidth: Int): qx.ui.layout.Grid = js.native
    def setColumnMinWidth(column: Int, minWidth: Int): qx.ui.layout.Grid = js.native
    def setColumnWidth(column: Int, width: Int): qx.ui.layout.Grid = js.native
    def setRowAlign(row: Int, hAlign: String, vAlign: String): qx.ui.layout.Grid = js.native
    def setRowFlex(row: Int, flex: Int): qx.ui.layout.Grid = js.native
    def setRowHeight(row: Int, height: Int): qx.ui.layout.Grid = js.native
    def setRowMaxHeight(row: Int, maxHeight: Int): qx.ui.layout.Grid = js.native
    def setRowMinHeight(row: Int, minHeight: Int): qx.ui.layout.Grid = js.native
    def setSpacing(spacing: Int): qx.ui.layout.Grid = js.native
    def setSpacingX(value: js.Any): Int = js.native
    def setSpacingY(value: js.Any): Int = js.native

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Grow")
class Grow extends qx.ui.layout.Abstract {

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.HBox")
class HBox protected () extends qx.ui.layout.Abstract {
    def this(spacing: Int = ???, alignX: String = ???, separator: String = ???) = this()
    protected def _applyReversed(value: Boolean, old: Boolean): Unit = js.native
    def getAlignX(): js.Dynamic = js.native
    def getAlignY(): js.Dynamic = js.native
    def getReversed(): Boolean = js.native
    def getSeparator(): qx.ui.decoration.Decorator = js.native
    def getSpacing(): Int = js.native
    protected def initAlignX(value: js.Any): js.Dynamic = js.native
    protected def initAlignY(value: js.Any): js.Dynamic = js.native
    protected def initReversed(value: js.Any): Boolean = js.native
    protected def initSeparator(value: js.Any): qx.ui.decoration.Decorator = js.native
    protected def initSpacing(value: js.Any): Int = js.native
    def isReversed(): Boolean = js.native
    def resetAlignX(): Unit = js.native
    def resetAlignY(): Unit = js.native
    def resetReversed(): Unit = js.native
    def resetSeparator(): Unit = js.native
    def resetSpacing(): Unit = js.native
    def setAlignX(value: js.Any): js.Dynamic = js.native
    def setAlignY(value: js.Any): js.Dynamic = js.native
    def setReversed(value: js.Any): Boolean = js.native
    def setSeparator(value: js.Any): qx.ui.decoration.Decorator = js.native
    def setSpacing(value: js.Any): Int = js.native
    def toggleReversed(): Boolean = js.native

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.LineSizeIterator")
class LineSizeIterator protected () extends js.Object {
    def this(children: js.Array[qx.ui.core.Widget] = ???, spacing: Int = ???) = this()
    def computeNextLine(availWidth: Int): js.Dynamic = js.native
    def hasMoreLines(): Boolean = js.native

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.Util")
class Util extends js.Object {

}
@js.native
@JSName("qx.ui.layout.Util")
object Util extends js.Object {
    def arrangeIdeals(beginMin: Int, beginIdeal: Int, beginMax: Int, endMin: Int, endIdeal: Int, endMax: Int): js.Dynamic = js.native
    def collapseMargins(varargs: js.Any = ???): Int = js.native
    def computeFlexOffsets(flexibles: js.Any, avail: Int, used: Int): js.Dynamic = js.native
    def computeHorizontalAlignOffset(align: String, width: Int, availWidth: Int, marginLeft: Int = ???, marginRight: Int = ???): Int = js.native
    def computeHorizontalGaps(children: qx.data.Array, spacing: Int = ???, collapse: Boolean = ???): Int = js.native
    def computeHorizontalSeparatorGaps(children: js.Array[qx.ui.core.LayoutItem], spacing: Int, separator: String): Int = js.native
    def computeVerticalAlignOffset(align: String, height: Int, availHeight: Int, marginTop: Int = ???, marginBottom: Int = ???): Int = js.native
    def computeVerticalGaps(children: qx.data.Array, spacing: Int = ???, collapse: Boolean = ???): Int = js.native
    def computeVerticalSeparatorGaps(children: js.Array[qx.ui.core.LayoutItem], spacing: Int, separator: String): Int = js.native

}
}
package qx.ui.layout {
@js.native
@JSName("qx.ui.layout.VBox")
class VBox protected () extends qx.ui.layout.Abstract {
    def this(spacing: Int = ???, alignY: String = ???, separator: String = ???) = this()
    protected def _applyReversed(value: Boolean, old: Boolean): Unit = js.native
    def getAlignX(): js.Dynamic = js.native
    def getAlignY(): js.Dynamic = js.native
    def getReversed(): Boolean = js.native
    def getSeparator(): qx.ui.decoration.Decorator = js.native
    def getSpacing(): Int = js.native
    protected def initAlignX(value: js.Any): js.Dynamic = js.native
    protected def initAlignY(value: js.Any): js.Dynamic = js.native
    protected def initReversed(value: js.Any): Boolean = js.native
    protected def initSeparator(value: js.Any): qx.ui.decoration.Decorator = js.native
    protected def initSpacing(value: js.Any): Int = js.native
    def isReversed(): Boolean = js.native
    def resetAlignX(): Unit = js.native
    def resetAlignY(): Unit = js.native
    def resetReversed(): Unit = js.native
    def resetSeparator(): Unit = js.native
    def resetSpacing(): Unit = js.native
    def setAlignX(value: js.Any): js.Dynamic = js.native
    def setAlignY(value: js.Any): js.Dynamic = js.native
    def setReversed(value: js.Any): Boolean = js.native
    def setSeparator(value: js.Any): qx.ui.decoration.Decorator = js.native
    def setSpacing(value: js.Any): Int = js.native
    def toggleReversed(): Boolean = js.native

}
}
package qx.ui.list {
@js.native
@JSName("qx.ui.list.List")
class List protected () extends qx.ui.virtual.core.Scroller with qx.data.controller.ISelection with qx.ui.virtual.selection.MModel {
    override def resetSelection(): Unit = js.native
    override def setSelection(value: qx.data.IListData): Unit = js.native
    def this(model: qx.data.IListData = ???) = this()
    protected def _applyDelegate(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyGroupLabelOptions(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyGroupLabelPath(value: String, old: String): Unit = js.native
    protected def _applyGroupRowHeight(value: Int, old: Int): Unit = js.native
    protected def _applyIconOptions(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyIconPath(value: String, old: String): Unit = js.native
    protected def _applyLabelOptions(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyLabelPath(value: String, old: String): Unit = js.native
    protected def _applyModel(value: qx.data.IListData, old: qx.data.IListData): Unit = js.native
    protected def _applyRowHeight(value: Int, old: Int): Unit = js.native
    protected def _getDataFromRow(row: Int): js.Dynamic = js.native
    protected def _getLookupTable(): qx.data.Array = js.native
    protected def _getSelectables(): qx.data.Array = js.native
    protected def _init(): Unit = js.native
    protected def _initBackground(): Unit = js.native
    protected def _initLayer(): Unit = js.native
    protected def _isGroup(row: Int): Boolean = js.native
    protected def _lookup(row: Long): Long = js.native
    protected def _lookupGroup(row: Long): Long = js.native
    protected def _onModelChange(e: qx.event.`type`.Data): Unit = js.native
    protected def _onResize(e: qx.event.`type`.Data): Unit = js.native
    protected def _reverseLookup(index: Long): Long = js.native
    protected def _runDelegateFilter(model: qx.data.IListData): Unit = js.native
    protected def _runDelegateGroup(model: qx.data.IListData): Unit = js.native
    protected def _runDelegateSorter(model: qx.data.IListData): Unit = js.native
    def getAutoGrouping(): Boolean = js.native
    def getDelegate(): js.Dynamic = js.native
    def getGroupItemHeight(): Int = js.native
    def getGroupLabelOptions(): js.Dynamic = js.native
    def getGroupLabelPath(): String = js.native
    def getGroups(): qx.data.Array = js.native
    def getIconOptions(): js.Dynamic = js.native
    def getIconPath(): String = js.native
    def getItemHeight(): Int = js.native
    def getLabelOptions(): js.Dynamic = js.native
    def getLabelPath(): String = js.native
    def getModel(): qx.data.IListData = js.native
    protected def initAutoGrouping(value: js.Any): Boolean = js.native
    protected def initDelegate(value: js.Any): js.Dynamic = js.native
    protected def initGroupItemHeight(value: js.Any): Int = js.native
    protected def initGroupLabelOptions(value: js.Any): js.Dynamic = js.native
    protected def initGroupLabelPath(value: js.Any): String = js.native
    protected def initGroups(value: js.Any): qx.data.Array = js.native
    protected def initIconOptions(value: js.Any): js.Dynamic = js.native
    protected def initIconPath(value: js.Any): String = js.native
    protected def initItemHeight(value: js.Any): Int = js.native
    protected def initLabelOptions(value: js.Any): js.Dynamic = js.native
    protected def initLabelPath(value: js.Any): String = js.native
    protected def initModel(value: js.Any): qx.data.IListData = js.native
    def isAutoGrouping(): Boolean = js.native
    def refresh(): Unit = js.native
    def resetAutoGrouping(): Unit = js.native
    def resetDelegate(): Unit = js.native
    def resetGroupItemHeight(): Unit = js.native
    def resetGroupLabelOptions(): Unit = js.native
    def resetGroupLabelPath(): Unit = js.native
    def resetGroups(): Unit = js.native
    def resetIconOptions(): Unit = js.native
    def resetIconPath(): Unit = js.native
    def resetItemHeight(): Unit = js.native
    def resetLabelOptions(): Unit = js.native
    def resetLabelPath(): Unit = js.native
    def resetModel(): Unit = js.native
    def setAutoGrouping(value: js.Any): Boolean = js.native
    def setDelegate(value: js.Any): js.Dynamic = js.native
    def setGroupItemHeight(value: js.Any): Int = js.native
    def setGroupLabelOptions(value: js.Any): js.Dynamic = js.native
    def setGroupLabelPath(value: js.Any): String = js.native
    def setGroups(value: js.Any): qx.data.Array = js.native
    def setIconOptions(value: js.Any): js.Dynamic = js.native
    def setIconPath(value: js.Any): String = js.native
    def setItemHeight(value: js.Any): Int = js.native
    def setLabelOptions(value: js.Any): js.Dynamic = js.native
    def setLabelPath(value: js.Any): String = js.native
    def setModel(value: js.Any): qx.data.IListData = js.native
    def toggleAutoGrouping(): Boolean = js.native

}
}
package qx.ui.list.core {
@js.native
trait IListDelegate extends js.Object {
    def bindGroupItem(controller: qx.ui.list.core.MWidgetController, item: qx.ui.core.Widget, id: Int): Unit = js.native
    def bindItem(controller: qx.ui.list.core.MWidgetController, item: qx.ui.core.Widget, id: Int): Unit = js.native
    def configureGroupItem(item: qx.ui.core.Widget): Unit = js.native
    def configureItem(item: qx.ui.core.Widget): Unit = js.native
    def createGroupItem(): qx.ui.core.Widget = js.native
    def createItem(): qx.ui.core.Widget = js.native
    def filter(data: js.Any): Boolean = js.native
    def group(data: js.Any): String = js.native
    def onPool(item: qx.ui.core.Widget): Unit = js.native
    def sorter(a: js.Any, b: js.Any): Int = js.native

}
}
package qx.ui.list.core {
@js.native
@JSName("qx.ui.list.core.MWidgetController")
trait MWidgetController extends js.Object {
    protected def _bindGroupItem(item: qx.ui.core.Widget, index: Int): Unit = js.native
    protected def _bindItem(item: qx.ui.core.Widget, index: Int): Unit = js.native
    protected def _configureGroupItem(item: qx.ui.core.Widget): Unit = js.native
    protected def _configureItem(item: qx.ui.core.Widget): Unit = js.native
    protected def _removeBindingsFrom(item: qx.ui.core.Widget): Unit = js.native
    def bindDefaultProperties(item: qx.ui.core.Widget, index: Int): Unit = js.native
    def bindProperty(sourcePath: String, targetProperty: String, options: js.Any, targetWidget: qx.ui.core.Widget, index: Int): Unit = js.native
    def bindPropertyReverse(targetPath: String, sourceProperty: String, options: js.Any, sourceWidget: qx.ui.core.Widget, index: Int): Unit = js.native
    def getDelegate(): js.Dynamic = js.native
    def getGroupLabelOptions(): js.Dynamic = js.native
    def getGroupLabelPath(): String = js.native
    def getIconOptions(): js.Dynamic = js.native
    def getIconPath(): String = js.native
    def getLabelOptions(): js.Dynamic = js.native
    def getLabelPath(): String = js.native
    protected def initDelegate(value: js.Any): js.Dynamic = js.native
    protected def initGroupLabelOptions(value: js.Any): js.Dynamic = js.native
    protected def initGroupLabelPath(value: js.Any): String = js.native
    protected def initIconOptions(value: js.Any): js.Dynamic = js.native
    protected def initIconPath(value: js.Any): String = js.native
    protected def initLabelOptions(value: js.Any): js.Dynamic = js.native
    protected def initLabelPath(value: js.Any): String = js.native
    def removeBindings(): Unit = js.native
    def resetDelegate(): Unit = js.native
    def resetGroupLabelOptions(): Unit = js.native
    def resetGroupLabelPath(): Unit = js.native
    def resetIconOptions(): Unit = js.native
    def resetIconPath(): Unit = js.native
    def resetLabelOptions(): Unit = js.native
    def resetLabelPath(): Unit = js.native
//    def setDelegate(value: js.Any): js.Dynamic = js.native
    def setGroupLabelOptions(value: js.Any): js.Dynamic = js.native
    def setGroupLabelPath(value: js.Any): String = js.native
    def setIconOptions(value: js.Any): Unit = js.native
    def setIconPath(value: js.Any): String = js.native
    def setLabelOptions(value: js.Any): Unit = js.native
    def setLabelPath(value: js.Any): String = js.native

}
}
package qx.ui.list.provider {
@js.native
trait IListProvider extends js.Object {
    def createGroupRenderer(): js.Dynamic = js.native
    def createItemRenderer(): js.Dynamic = js.native
    def createLayer(): qx.ui.virtual.layer.Abstract = js.native
    def isSelectable(row: Int): Boolean = js.native
    def removeBindings(): Unit = js.native
    def setDelegate(delegate: js.Any): Unit = js.native
    def setIconOptions(options: js.Any): Unit
    def setIconPath(path: String): Unit = js.native
    def setLabelOptions(options: js.Any): Unit
    def setLabelPath(path: String): Unit = js.native
    def styleSelectabled(row: Int): Unit = js.native
    def styleUnselectabled(row: Int): Unit = js.native

}
}
package qx.ui.list.provider {
@js.native
@JSName("qx.ui.list.provider.WidgetProvider")
class WidgetProvider protected () extends qx.core.Object with qx.ui.virtual.core.IWidgetCellProvider with qx.ui.list.provider.IListProvider with qx.ui.list.core.MWidgetController {
    override def getCellWidget(row: Int, column: Int): qx.ui.core.LayoutItem = js.native
    override def poolCellWidget(widget: qx.ui.core.LayoutItem): Unit = js.native
    override def createGroupRenderer(): js.Dynamic = js.native
    override def createItemRenderer(): js.Dynamic = js.native
    override def createLayer(): qx.ui.virtual.layer.Abstract = js.native
    override def isSelectable(row: Int): Boolean = js.native
    override def removeBindings(): Unit = js.native
//    override def setDelegate(delegate: js.Any): js.Dynamic = js.native
    override def setIconPath(path: String): Unit = js.native
    override def setLabelPath(path: String): Unit = js.native
    override def styleSelectabled(row: Int): Unit = js.native
    override def styleUnselectabled(row: Int): Unit = js.native
    def this(list: qx.ui.list.List = ???) = this()
    protected def _onChangeDelegate(event: qx.event.`type`.Data): Unit = js.native
    protected def _onGroupItemCreated(event: qx.event.`type`.Data): Unit = js.native
    protected def _onItemCreated(event: qx.event.`type`.Data): Unit = js.native
    protected def _onPool(item: qx.ui.core.Widget): Unit = js.native
    protected def _styleSelectabled(widget: qx.ui.core.Widget): Unit = js.native
    protected def _styleUnselectabled(widget: qx.ui.core.Widget): Unit = js.native

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.AbstractButton")
class AbstractButton extends qx.ui.core.Widget with qx.ui.form.IExecutable with qx.ui.core.MExecutable {
    override def execute(): Unit = js.native
    override def getCommand(): qx.ui.command.Command = js.native
    override def setCommand(command: qx.ui.command.Command): Unit = js.native
    protected def _applyIcon(value: String, old: String): Unit = js.native
    protected def _applyLabel(value: String, old: String): Unit = js.native
    protected def _applyMenu(value: qx.ui.menu.Menu, old: qx.ui.menu.Menu): Unit = js.native
    protected def _applyShowCommandLabel(value: Boolean, old: Boolean): Unit = js.native
    protected def _onChangeCommand(e: qx.event.`type`.Data): Unit = js.native
    protected def _onKeyPress(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onTap(e: qx.event.`type`.Pointer): Unit = js.native
    def getChildrenSizes(): qx.data.Array = js.native
    def getIcon(): String = js.native
    def getLabel(): String = js.native
    def getMenu(): qx.ui.menu.Menu = js.native
    def getShowCommandLabel(): Boolean = js.native
    protected def initIcon(value: js.Any): String = js.native
    protected def initLabel(value: js.Any): String = js.native
    protected def initMenu(value: js.Any): qx.ui.menu.Menu = js.native
    protected def initShowCommandLabel(value: js.Any): Boolean = js.native
    def isShowCommandLabel(): Boolean = js.native
    def resetIcon(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetMenu(): Unit = js.native
    def resetShowCommandLabel(): Unit = js.native
    def setIcon(value: js.Any): String = js.native
    def setLabel(value: js.Any): String = js.native
    def setMenu(value: js.Any): qx.ui.menu.Menu = js.native
    def setShowCommandLabel(value: js.Any): Boolean = js.native
    def toggleShowCommandLabel(): Boolean = js.native

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.Button")
class Button protected () extends qx.ui.menu.AbstractButton {
    def this(label: String = ???, icon: String = ???, command: qx.ui.command.Command = ???, menu: qx.ui.menu.Menu = ???) = this()

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.ButtonLayout")
class ButtonLayout extends qx.ui.layout.Abstract {

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.CheckBox")
class CheckBox protected () extends qx.ui.menu.AbstractButton with qx.ui.form.IBooleanForm {
    override def getValue(): Boolean = js.native
    override def resetValue(): Unit = js.native
    override def setValue(value: Boolean): Unit = js.native
    def this(label: String = ???, menu: qx.ui.menu.Menu = ???) = this()
    protected def _applyValue(value: Boolean, old: Boolean): Unit = js.native
    protected def _onExecute(e: qx.event.`type`.Event): Unit = js.native
    protected def initValue(value: js.Any): Boolean = js.native
    def isValue(): Boolean = js.native
    def toggleValue(): Boolean = js.native

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.Layout")
class Layout extends qx.ui.layout.VBox {
    def getArrowColumnWidth(): Int = js.native
    def getColumnSizes(): qx.data.Array = js.native
    def getColumnSpacing(): Int = js.native
    def getIconColumnWidth(): Int = js.native
    def getSpanColumn(): Int = js.native
    protected def initArrowColumnWidth(value: js.Any): Int = js.native
    protected def initColumnSpacing(value: js.Any): Int = js.native
    protected def initIconColumnWidth(value: js.Any): Int = js.native
    protected def initSpanColumn(value: js.Any): Int = js.native
    def resetArrowColumnWidth(): Unit = js.native
    def resetColumnSpacing(): Unit = js.native
    def resetIconColumnWidth(): Unit = js.native
    def resetSpanColumn(): Unit = js.native
    def setArrowColumnWidth(value: js.Any): Int = js.native
    def setColumnSpacing(value: js.Any): Int = js.native
    def setIconColumnWidth(value: js.Any): Int = js.native
    def setSpanColumn(value: js.Any): Int = js.native

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.Manager")
class Manager extends qx.core.Object {
    def __onPreventContextMenu(e: qx.event.`type`.Mouse): Unit = js.native
    protected def _getChild(menu: qx.ui.menu.Menu, start: Int, iter: Int, loop: Boolean = ???): qx.ui.menu.Button = js.native
    protected def _getMenuButton(widget: qx.ui.core.Widget): qx.ui.menu.Button = js.native
    protected def _isInMenu(widget: qx.ui.core.Widget): Boolean = js.native
    protected def _isMenuOpener(widget: qx.ui.core.Widget): Boolean = js.native
    protected def _onCloseInterval(e: qx.event.`type`.Event): Unit = js.native
    protected def _onKeyPress(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onKeyPressDown(menu: qx.ui.menu.Menu): Unit = js.native
    protected def _onKeyPressEnter(menu: qx.ui.menu.Menu, button: qx.ui.menu.AbstractButton, e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onKeyPressLeft(menu: qx.ui.menu.Menu): Unit = js.native
    protected def _onKeyPressRight(menu: qx.ui.menu.Menu): Unit = js.native
    protected def _onKeyPressSpace(menu: qx.ui.menu.Menu, button: qx.ui.menu.AbstractButton, e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onKeyPressUp(menu: qx.ui.menu.Menu): Unit = js.native
    protected def _onKeyUpDown(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onOpenInterval(e: qx.event.`type`.Event): Unit = js.native
    protected def _onPointerDown(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onRoll(e: qx.event.`type`.Roll): Unit = js.native
    def add(obj: qx.ui.menu.Menu): Unit = js.native
    def cancelClose(menu: qx.ui.menu.Menu): Unit = js.native
    def cancelOpen(menu: qx.ui.menu.Menu): Unit = js.native
    def getActiveMenu(): qx.ui.menu.Menu = js.native
    def hideAll(): Unit = js.native
    def preventContextMenuOnce(): Unit = js.native
    def remove(obj: qx.ui.menu.Menu): Unit = js.native
    def scheduleClose(menu: qx.ui.menu.Menu): Unit = js.native
    def scheduleOpen(menu: qx.ui.menu.Menu): Unit = js.native

}
@js.native
@JSName("qx.ui.menu.Manager")
object Manager extends js.Object {
    def getInstance(): qx.ui.menu.Manager = js.native

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.Menu")
class Menu extends qx.ui.core.Widget with qx.ui.core.MPlacement with qx.ui.core.MRemoteChildrenHandling {
    protected def _applyArrowColumnWidth(value: Int, old: Int): Unit = js.native
    protected def _applyBlockerColor(value: String, old: String): Unit = js.native
    protected def _applyBlockerOpacity(value: Long, old: Long): Unit = js.native
    protected def _applyIconColumnWidth(value: Int, old: Int): Unit = js.native
    protected def _applyOpenedButton(value: qx.ui.core.Widget, old: qx.ui.core.Widget): Unit = js.native
    protected def _applySelectedButton(value: qx.ui.core.Widget, old: qx.ui.core.Widget): Unit = js.native
    protected def _applySpacingX(value: Int, old: Int): Unit = js.native
    protected def _applySpacingY(value: Int, old: Int): Unit = js.native
    protected def _assertSlideBar(callback: js.Function): js.Dynamic = js.native
    protected def _computePlacementSize(): js.Dynamic = js.native
    protected def _getMenuBounds(): js.Dynamic = js.native
    protected def _getMenuLayout(): js.Dynamic = js.native
    protected def _onPointerOut(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerOver(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onResize(): Unit = js.native
    def addSeparator(): Unit = js.native
    def getArrowColumnWidth(): Int = js.native
    def getBlockBackground(): Boolean = js.native
    def getBlockerColor(): String = js.native
    def getBlockerOpacity(): Long = js.native
    def getCloseInterval(): Int = js.native
    def getColumnSizes(): qx.data.Array = js.native
    def getIconColumnWidth(): Int = js.native
    def getOpenedButton(): qx.ui.core.Widget = js.native
    def getOpener(): qx.ui.core.Widget = js.native
    def getOpenInterval(): Int = js.native
    def getParentMenu(): js.Dynamic = js.native
    def getSelectables(): js.Array[qx.ui.core.Widget] = js.native
    def getSelectedButton(): qx.ui.core.Widget = js.native
    def getSpacingX(): Int = js.native
    def getSpacingY(): Int = js.native
    protected def initArrowColumnWidth(value: js.Any): Int = js.native
    protected def initBlockBackground(value: js.Any): Boolean = js.native
    protected def initBlockerColor(value: js.Any): String = js.native
    protected def initBlockerOpacity(value: js.Any): Long = js.native
    protected def initCloseInterval(value: js.Any): Int = js.native
    protected def initIconColumnWidth(value: js.Any): Int = js.native
    protected def initOpenedButton(value: js.Any): qx.ui.core.Widget = js.native
    protected def initOpener(value: js.Any): qx.ui.core.Widget = js.native
    protected def initOpenInterval(value: js.Any): Int = js.native
    protected def initSelectedButton(value: js.Any): qx.ui.core.Widget = js.native
    protected def initSpacingX(value: js.Any): Int = js.native
    protected def initSpacingY(value: js.Any): Int = js.native
    def isBlockBackground(): Boolean = js.native
    def open(): Unit = js.native
    def openAtPoint(point: js.Any): Unit = js.native
    def openAtPointer(e: qx.event.`type`.Pointer): Unit = js.native
    def resetArrowColumnWidth(): Unit = js.native
    def resetBlockBackground(): Unit = js.native
    def resetBlockerColor(): Unit = js.native
    def resetBlockerOpacity(): Unit = js.native
    def resetCloseInterval(): Unit = js.native
    def resetIconColumnWidth(): Unit = js.native
    def resetOpenedButton(): Unit = js.native
    def resetOpener(): Unit = js.native
    def resetOpenInterval(): Unit = js.native
    def resetSelectedButton(): Unit = js.native
    def resetSpacingX(): Unit = js.native
    def resetSpacingY(): Unit = js.native
    def setArrowColumnWidth(value: js.Any): Int = js.native
    def setBlockBackground(value: js.Any): Boolean = js.native
    def setBlockerColor(value: js.Any): String = js.native
    def setBlockerOpacity(value: js.Any): Long = js.native
    def setCloseInterval(value: js.Any): Int = js.native
    def setIconColumnWidth(value: js.Any): Int = js.native
    def setOpenedButton(value: js.Any): qx.ui.core.Widget = js.native
    def setOpener(value: js.Any): qx.ui.core.Widget = js.native
    def setOpenInterval(value: js.Any): Int = js.native
    def setSelectedButton(value: js.Any): qx.ui.core.Widget = js.native
    def setSpacingX(value: js.Any): Int = js.native
    def setSpacingY(value: js.Any): Int = js.native
    def toggleBlockBackground(): Boolean = js.native

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.MenuSlideBar")
class MenuSlideBar extends qx.ui.container.SlideBar {

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.RadioButton")
class RadioButton protected () extends qx.ui.menu.AbstractButton with qx.ui.form.IRadioItem with qx.ui.form.IBooleanForm with qx.ui.form.IModel with qx.ui.form.MModelProperty {
    override def getGroup(): qx.ui.form.RadioGroup = js.native
    override def getValue(): Boolean = js.native
    override def setGroup(value: qx.ui.form.RadioGroup): Unit = js.native
    override def setValue(value: Boolean): Unit = js.native
    override def resetValue(): Unit = js.native
    override def getModel(): js.Dynamic = js.native
    override def resetModel(): Unit = js.native
    override def setModel(value: js.Any): js.Dynamic = js.native
    def this(label: String = ???, menu: qx.ui.menu.Menu = ???) = this()
    protected def _applyGroup(value: qx.ui.form.RadioGroup, old: qx.ui.form.RadioGroup): Unit = js.native
    protected def _applyValue(value: Boolean, old: Boolean): Unit = js.native
    protected def _onExecute(e: qx.event.`type`.Event): Unit = js.native
    protected def initGroup(value: js.Any): qx.ui.form.RadioGroup = js.native
    protected def initValue(value: js.Any): Boolean = js.native
    def isValue(): Boolean = js.native
    def resetGroup(): Unit = js.native
    def toggleValue(): Boolean = js.native

}
}
package qx.ui.menu {
@js.native
@JSName("qx.ui.menu.Separator")
class Separator extends qx.ui.core.Widget {

}
}
package qx.ui.menubar {
@js.native
@JSName("qx.ui.menubar.Button")
class Button protected () extends qx.ui.form.MenuButton {
    def this(label: js.Any = ???, icon: js.Any = ???, menu: js.Any = ???) = this()
    def getMenuBar(): qx.ui.menubar.MenuBar = js.native

}
}
package qx.ui.menubar {
@js.native
@JSName("qx.ui.menubar.MenuBar")
class MenuBar extends qx.ui.toolbar.ToolBar {

}
}
package qx.ui.popup {
@js.native
@JSName("qx.ui.popup.Manager")
class Manager extends qx.core.Object {
    def add(obj: qx.ui.popup.Popup): Unit = js.native
    def hideAll(): Unit = js.native
    def remove(obj: qx.ui.popup.Popup): Unit = js.native

}
@js.native
@JSName("qx.ui.popup.Manager")
object Manager extends js.Object {
    def getInstance(): qx.ui.popup.Manager = js.native

}
}
package qx.ui.popup {
@js.native
@JSName("qx.ui.popup.Popup")
class Popup protected () extends qx.ui.container.Composite with qx.ui.core.MPlacement {
    def this(layout: js.Any = ???) = this()
    def getAutoHide(): Boolean = js.native
    protected def initAutoHide(value: js.Any): Boolean = js.native
    def isAutoHide(): Boolean = js.native
    def resetAutoHide(): Unit = js.native
    def setAutoHide(value: js.Any): Boolean = js.native
    def toggleAutoHide(): Boolean = js.native

}
}
package qx.ui.progressive {
@js.native
@JSName("qx.ui.progressive.Progressive")
class Progressive protected () extends qx.ui.container.Composite {
    def this(structure: qx.ui.progressive.structure.Abstract = ???) = this()
    protected def _applyDataModel(value: qx.ui.progressive.model.Abstract, old: js.Any): Unit = js.native
    def addRenderer(name: String, renderer: qx.ui.progressive.renderer.Abstract): Unit = js.native
    def getBatchSize(): Int = js.native
    def getDataModel(): qx.ui.progressive.model.Abstract = js.native
    def getFlushWidgetQueueAfterBatch(): Boolean = js.native
    def getInterElementTimeout(): Int = js.native
    def getStructure(): qx.ui.progressive.structure.Abstract = js.native
    protected def initBatchSize(value: js.Any): Int = js.native
    protected def initDataModel(value: js.Any): qx.ui.progressive.model.Abstract = js.native
    protected def initFlushWidgetQueueAfterBatch(value: js.Any): Boolean = js.native
    protected def initInterElementTimeout(value: js.Any): Int = js.native
    def isFlushWidgetQueueAfterBatch(): Boolean = js.native
    def removeRenderer(name: String): Unit = js.native
    def render(): Unit = js.native
    def resetBatchSize(): Unit = js.native
    def resetDataModel(): Unit = js.native
    def resetFlushWidgetQueueAfterBatch(): Unit = js.native
    def resetInterElementTimeout(): Unit = js.native
    def setBatchSize(value: js.Any): Int = js.native
    def setDataModel(value: js.Any): qx.ui.progressive.model.Abstract = js.native
    def setFlushWidgetQueueAfterBatch(value: js.Any): Boolean = js.native
    def setInterElementTimeout(value: js.Any): Int = js.native
    def toggleFlushWidgetQueueAfterBatch(): Boolean = js.native

}
}
package qx.ui.progressive {
@js.native
@JSName("qx.ui.progressive.State")
class State protected () extends qx.core.Object {
    def this(initialState: js.Any = ???) = this()
    def getBatchSize(): js.Dynamic = js.native
    def getModel(): js.Dynamic = js.native
    def getPane(): js.Dynamic = js.native
    def getProgressive(): js.Dynamic = js.native
    def getRendererData(): js.Dynamic = js.native
    protected def initBatchSize(value: js.Any): js.Dynamic = js.native
    protected def initModel(value: js.Any): js.Dynamic = js.native
    protected def initPane(value: js.Any): js.Dynamic = js.native
    protected def initProgressive(value: js.Any): js.Dynamic = js.native
    protected def initRendererData(value: js.Any): js.Dynamic = js.native
    protected def initUserData(value: js.Any): js.Dynamic = js.native
    def resetBatchSize(): Unit = js.native
    def resetModel(): Unit = js.native
    def resetPane(): Unit = js.native
    def resetProgressive(): Unit = js.native
    def resetRendererData(): Unit = js.native
    def resetUserData(): Unit = js.native
    def setBatchSize(value: js.Any): js.Dynamic = js.native
    def setModel(value: js.Any): js.Dynamic = js.native
    def setPane(value: js.Any): js.Dynamic = js.native
    def setProgressive(value: js.Any): js.Dynamic = js.native
    def setRendererData(value: js.Any): js.Dynamic = js.native

}
}
package qx.ui.progressive.headfoot {
@js.native
@JSName("qx.ui.progressive.headfoot.Abstract")
class Abstract extends qx.ui.container.Composite {
    def join(progressive: qx.ui.progressive.Progressive): Unit = js.native

}
}
package qx.ui.progressive.headfoot {
@js.native
@JSName("qx.ui.progressive.headfoot.Null")
class Null extends qx.ui.progressive.headfoot.Abstract {

}
}
package qx.ui.progressive.headfoot {
@js.native
@JSName("qx.ui.progressive.headfoot.Progress")
class Progress protected () extends qx.ui.progressive.headfoot.Abstract {
    def this(columnWidths: qx.ui.progressive.renderer.table.Widths = ???, labelArr: qx.data.Array = ???) = this()

}
}
package qx.ui.progressive.headfoot {
@js.native
@JSName("qx.ui.progressive.headfoot.TableHeading")
class TableHeading protected () extends qx.ui.progressive.headfoot.Abstract {
    def this(columnWidths: qx.ui.progressive.renderer.table.Widths = ???, labelArr: qx.data.Array = ???) = this()
    protected def _resizeColumns(e: qx.event.`type`.Event): Unit = js.native

}
}
package qx.ui.progressive.model {
@js.native
@JSName("qx.ui.progressive.model.Abstract")
class Abstract extends qx.core.Object {
    def getElementCount(): Int = js.native
    def getNextElement(): js.Dynamic = js.native

}
}
package qx.ui.progressive.model {
@js.native
@JSName("qx.ui.progressive.model.Default")
class Default extends qx.ui.progressive.model.Abstract {
    def addElement(elem: js.Any): Unit = js.native
    def addElements(elems: qx.data.Array): Unit = js.native

}
}
package qx.ui.progressive.renderer {
@js.native
@JSName("qx.ui.progressive.renderer.Abstract")
class Abstract extends qx.core.Object {
    def join(progressive: qx.ui.progressive.Progressive, name: String): Unit = js.native
    def render(state: qx.ui.progressive.State, element: js.Any): Unit = js.native

}
}
package qx.ui.progressive.renderer {
@js.native
@JSName("qx.ui.progressive.renderer.FunctionCaller")
class FunctionCaller extends qx.ui.progressive.renderer.Abstract {

}
}
package qx.ui.progressive.renderer.table {
@js.native
@JSName("qx.ui.progressive.renderer.table.Row")
class Row protected () extends qx.ui.progressive.renderer.Abstract {
    def this(columnWidths: qx.ui.progressive.renderer.table.Widths = ???) = this()
    protected def _resizeColumns(e: qx.event.`type`.Event): Unit = js.native
    def addRenderer(column: Int, renderer: qx.ui.progressive.renderer.table.cell.Abstract): Unit = js.native
    def getDefaultRowHeight(): js.Dynamic = js.native
    def getLayoutChildren(): qx.data.Array = js.native
    protected def initDefaultRowHeight(value: js.Any): js.Dynamic = js.native
    def removeRenderer(column: Int): Unit = js.native
    def resetDefaultRowHeight(): Unit = js.native
    def setDefaultRowHeight(value: js.Any): js.Dynamic = js.native

}
}
package qx.ui.progressive.renderer.table {
@js.native
@JSName("qx.ui.progressive.renderer.table.Widths")
class Widths protected () extends qx.core.Object {
    def this(numColumns: Int = ???) = this()
    def getData(): qx.data.Array = js.native
    def set(column: Int, map: js.Any): Unit = js.native
    def setMaxWidth(column: Int, width: Int): Unit = js.native
    def setMinWidth(column: Int, width: Int): Unit = js.native
    def setWidth(column: Int, width: Int): Unit = js.native

}
}
package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.Abstract")
class Abstract extends qx.core.Object {
    protected def _getCellExtras(cellInfo: js.Any): String = js.native
    protected def _getCellStyle(cellInfo: js.Any): String = js.native
    protected def _getContentHtml(cellInfo: js.Any): String = js.native
    def render(cellInfo: js.Any): String = js.native

}
}
package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.Boolean")
class Boolean extends qx.ui.progressive.renderer.table.cell.Icon {
    def getAllowToggle(): Boolean = js.native
    protected def initAllowToggle(value: js.Any): Boolean = js.native
    def isAllowToggle(): Boolean = js.native
    def resetAllowToggle(): Unit = js.native
    def setAllowToggle(value: js.Any): Boolean = js.native
    def toggleAllowToggle(): Boolean = js.native

}
}
package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.Conditional")
class Conditional protected () extends qx.ui.progressive.renderer.table.cell.Abstract {
    def this(align: String = ???, color: String = ???, style: String = ???, weight: String = ???) = this()
    def addBetweenCondition(condition: String, value1: Int, value2: Int, align: String, color: String, style: String, weight: String, target: String): Unit = js.native
    def addNumericCondition(condition: String, value1: Int, align: String, color: String, style: String, weight: String, target: String): Unit = js.native
    def addRegex(regex: String, align: String, color: String, style: String, weight: String, target: String): Unit = js.native

}
}
package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.Default")
class Default extends qx.ui.progressive.renderer.table.cell.Abstract {
    protected def _formatValue(value: js.Any): String = js.native

}
}
package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.Html")
class Html extends qx.ui.progressive.renderer.table.cell.Abstract {

}
}
package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.Icon")
class Icon extends qx.ui.progressive.renderer.table.cell.Abstract {
    protected def _identifyImage(cellInfo: js.Any): js.Dynamic = js.native
    def getBlankImage(): String = js.native

}
}
package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.Image")
class Image protected () extends qx.ui.progressive.renderer.table.cell.Icon {
    def this(width: Int = ???, height: Int = ???) = this()

}
}
package qx.ui.progressive.renderer.table.cell {
@js.native
@JSName("qx.ui.progressive.renderer.table.cell.String")
class String extends qx.ui.progressive.renderer.table.cell.Abstract {

}
}
package qx.ui.progressive.structure {
@js.native
@JSName("qx.ui.progressive.structure.Abstract")
class Abstract protected () extends qx.core.Object {
    def this(pane: qx.ui.core.Widget = ???) = this()
    def applyStructure(progressive: qx.ui.progressive.Progressive): Unit = js.native
    def getPane(): qx.ui.core.Widget = js.native

}
}
package qx.ui.progressive.structure {
@js.native
@JSName("qx.ui.progressive.structure.Default")
class Default protected () extends qx.ui.progressive.structure.Abstract {
    def this(header: qx.ui.progressive.headfoot.Abstract = ???, footer: qx.ui.progressive.headfoot.Abstract = ???, pane: qx.ui.core.Widget = ???) = this()
    def getFooter(): qx.ui.progressive.headfoot.Abstract = js.native
    def getHeader(): qx.ui.progressive.headfoot.Abstract = js.native

}
}
package qx.ui.root {
@js.native
@JSName("qx.ui.root.Abstract")
class Abstract extends qx.ui.core.Widget with qx.ui.core.MChildrenHandling with qx.ui.core.MBlocker with qx.ui.window.MDesktop {
    protected def _applyNativeHelp(value: Boolean, old: Boolean): Unit = js.native
    protected def _onNativeContextMenu(e: qx.event.`type`.Mouse): Unit = js.native
    def getGlobalCursor(): String = js.native
    def getLayout(): qx.ui.layout.Abstract = js.native
    def getNativeHelp(): Boolean = js.native
    protected def initGlobalCursor(value: js.Any): String = js.native
    protected def initNativeHelp(value: js.Any): Boolean = js.native
    def isNativeHelp(): Boolean = js.native
    def resetGlobalCursor(): Unit = js.native
    def resetNativeHelp(): Unit = js.native
    def setGlobalCursor(value: js.Any): String = js.native
    def setNativeHelp(value: js.Any): Boolean = js.native
    def toggleNativeHelp(): Boolean = js.native

}
}
package qx.ui.root {
@js.native
@JSName("qx.ui.root.Application")
class Application protected () extends qx.ui.root.Abstract {
    def this(doc: Document = ???) = this()
    protected def _onResize(e: qx.event.`type`.Event): Unit = js.native

}
}
package qx.ui.root {
@js.native
@JSName("qx.ui.root.Inline")
class Inline protected () extends qx.ui.root.Abstract with qx.ui.core.MLayoutHandling {
    def this(el: HTMLElement = ???, dynamicX: Boolean = ???, dynamicY: Boolean = ???) = this()
	override def getLayout(): qx.ui.layout.Abstract = js.native
    protected def _onResize(e: qx.event.`type`.Event): Unit = js.native
    protected def _onWindowResize(): Unit = js.native

}
}
package qx.ui.root {
@js.native
@JSName("qx.ui.root.Page")
class Page protected () extends qx.ui.root.Abstract {
    def this(doc: Document = ???) = this()
	override def supportsMaximize(): Boolean = js.native

}
}
package qx.ui.splitpane {
@js.native
@JSName("qx.ui.splitpane.Blocker")
class Blocker protected () extends qx.html.Element {
    def this(orientation: String = ???) = this()
    protected def _applyOrientation(value: js.Any, old: js.Any): Unit = js.native
    def getOrientation(): js.Dynamic = js.native
    protected def initOrientation(value: js.Any): js.Dynamic = js.native
    def resetOrientation(): Unit = js.native
    def setHeight(offset: Long, spliterSize: Long): Unit = js.native
    def setLeft(offset: Long, splitterLeft: Long): Unit = js.native
    def setOrientation(value: js.Any): js.Dynamic = js.native
    def setTop(offset: Long, splitterTop: Long): Unit = js.native
    def setWidth(offset: Long, spliterSize: Long): Unit = js.native

}
}
package qx.ui.splitpane {
@js.native
@JSName("qx.ui.splitpane.HLayout")
class HLayout extends qx.ui.layout.Abstract {

}
}
package qx.ui.splitpane {
@js.native
@JSName("qx.ui.splitpane.Pane")
class Pane protected () extends qx.ui.core.Widget {
    def this(orientation: String = ???) = this()
    protected def _applyOffset(value: Int, old: Int): Unit = js.native
    protected def _applyOrientation(value: String, old: String): Unit = js.native
    protected def _finalizeSizes(): Unit = js.native
    protected def _isActiveDragSession(): Boolean = js.native
    protected def _onPointerDown(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerMove(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerOut(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerUp(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _setLastPointerPosition(x: Int, y: Int): Unit = js.native
    def add(widget: qx.ui.core.Widget, flex: Long): Unit = js.native
    def getBlocker(): qx.ui.splitpane.Blocker = js.native
    def getChildren(): js.Array[qx.ui.core.Widget] = js.native
    def getOffset(): Int = js.native
    def getOrientation(): js.Dynamic = js.native
    protected def initOffset(value: js.Any): Int = js.native
    protected def initOrientation(value: js.Any): js.Dynamic = js.native
    def remove(widget: qx.ui.core.Widget): Unit = js.native
    def resetOffset(): Unit = js.native
    def resetOrientation(): Unit = js.native
    def setOffset(value: js.Any): Int = js.native
    def setOrientation(value: js.Any): js.Dynamic = js.native

}
}
package qx.ui.splitpane {
@js.native
@JSName("qx.ui.splitpane.Slider")
class Slider extends qx.ui.core.Widget {

}
}
package qx.ui.splitpane {
@js.native
@JSName("qx.ui.splitpane.Splitter")
class Splitter protected () extends qx.ui.core.Widget {
    def this(parentWidget: qx.ui.splitpane.Pane = ???) = this()

}
}
package qx.ui.splitpane {
@js.native
@JSName("qx.ui.splitpane.VLayout")
class VLayout extends qx.ui.layout.Abstract {

}
}
package qx.ui.style {
@js.native
@JSName("qx.ui.style.Stylesheet")
class Stylesheet extends qx.core.Object {
    def addRule(selector: String, css: String): Unit = js.native
    def hasRule(selector: String): Boolean = js.native
    def removeRule(selector: String): Unit = js.native

}
@js.native
@JSName("qx.ui.style.Stylesheet")
object Stylesheet extends js.Object {
    def getInstance(): qx.ui.style.Stylesheet = js.native

}
}
package qx.ui.table {
@js.native
trait ICellEditorFactory extends js.Object {
    def createCellEditor(cellInfo: js.Any): qx.ui.core.Widget = js.native
    def getCellEditorValue(cellEditor: qx.ui.core.Widget): js.Dynamic = js.native

}
}
package qx.ui.table {
@js.native
trait ICellRenderer extends js.Object {
    def createDataCellHtml(cellInfo: js.Any, htmlArr: js.Array[String]): Boolean = js.native

}
}
package qx.ui.table {
@js.native
trait IColumnMenuButton extends js.Object {
    def empty(): Unit = js.native
    def factory(item: String, options: js.Any): qx.ui.core.Widget = js.native
    def getMenu(): js.Dynamic = js.native
    protected def initMenu(value: js.Any): js.Dynamic = js.native
    def resetMenu(): Unit = js.native
    def setMenu(value: js.Any): js.Dynamic = js.native

}
}
package qx.ui.table {
@js.native
trait IColumnMenuItem extends js.Object {
    def getVisible(): js.Dynamic = js.native
    protected def initVisible(value: js.Any): js.Dynamic = js.native
    def resetVisible(): Unit = js.native
    def setVisible(value: js.Any): js.Dynamic = js.native

}
}
package qx.ui.table {
@js.native
trait IHeaderRenderer extends js.Object {
    def createHeaderCell(cellInfo: js.Any): qx.ui.core.Widget = js.native
    def updateHeaderCell(cellInfo: js.Any, cellWidget: qx.ui.core.Widget): Unit = js.native

}
}
package qx.ui.table {
@js.native
trait IRowRenderer extends js.Object {
    def createRowStyle(rowInfo: js.Any): Unit = js.native
    def getRowClass(rowInfo: js.Any): Unit = js.native
    def getRowHeightStyle(height: Int): Unit = js.native
    def updateDataRowElement(rowInfo: js.Any, rowElement: HTMLElement): Unit = js.native

}
}
package qx.ui.table {
@js.native
trait ITableModel extends js.Object {
    def getColumnCount(): Int = js.native
    def getColumnId(columnIndex: Int): String = js.native
    def getColumnIndexById(columnId: String): Int = js.native
    def getColumnName(columnIndex: Int): String = js.native
    def getRowCount(): Int = js.native
    def getRowData(rowIndex: Int): js.Dynamic = js.native
    def getSortColumnIndex(): Int = js.native
    def getValue(columnIndex: Int, rowIndex: Int): js.Dynamic = js.native
    def getValueById(columnId: String, rowIndex: Int): js.Dynamic = js.native
    def isColumnEditable(columnIndex: Int): Boolean = js.native
    def isColumnSortable(columnIndex: Int): Boolean = js.native
    def isSortAscending(): Boolean = js.native
    def prefetchRows(firstRowIndex: Int, lastRowIndex: Int): Unit = js.native
    def setValue(columnIndex: Int, rowIndex: Int, value: js.Any): Unit = js.native
    def setValueById(columnId: String, rowIndex: Int, value: js.Any): Unit = js.native
    def sortByColumn(columnIndex: Int, ascending: Boolean): Unit = js.native

}
}
package qx.ui.table {
@js.native
@JSName("qx.ui.table.MTableContextMenu")
trait MTableContextMenu extends js.Object {
    def getContextMenuHandler(col: Int): js.Function = js.native
    def setContextMenuHandler(col: Int, handler: js.Function, context: js.Any = ???): Unit = js.native

}
}
package qx.ui.table {
@js.native
@JSName("qx.ui.table.Table")
class Table protected () extends qx.ui.core.Widget with qx.ui.core.MDragDropScrolling {
    def this(tableModel: qx.ui.table.ITableModel = ???, custom: js.Any = ???) = this()
    protected def _applyAdditionalStatusBarText(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyColumnVisibilityButtonVisible(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyContextMenuFromDataCellsOnly(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyFocusCellOnPointerMove(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyHeaderCellHeight(value: Int, old: Int): Unit = js.native
    protected def _applyHeaderCellsVisible(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyKeepFirstVisibleRowComplete(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyMetaColumnCounts(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyResetSelectionOnHeaderTap(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyRowHeight(value: Long, old: Long): Unit = js.native
    protected def _applySelectionModel(value: qx.ui.table.selection.Model, old: qx.ui.table.selection.Model): Unit = js.native
    protected def _applyShowCellFocusIndicator(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyStatusBarVisible(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyTableModel(value: qx.ui.table.ITableModel, old: qx.ui.table.ITableModel): Unit = js.native
    protected def _cleanUpMetaColumns(fromMetaColumn: Int): Unit = js.native
    protected def _createColumnVisibilityCheckBoxHandler(col: Int): js.Function = js.native
    protected def _getMetaColumnAtColumnX(visXPos: Int): Int = js.native
    protected def _getMetaColumnAtPageX(pageX: Int): Int = js.native
    protected def _getPaneScrollerArr(): js.Array[qx.ui.table.pane.Scroller] = js.native
    protected def _initColumnMenu(): Unit = js.native
    protected def _onChangeLocale(evt: qx.event.`type`.Event): Unit = js.native
    protected def _onColOrderChanged(evt: js.Any): Unit = js.native
    protected def _onColVisibilityChanged(evt: js.Any): Unit = js.native
    protected def _onColWidthChanged(evt: js.Any): Unit = js.native
    protected def _onFocusChanged(evt: js.Any): Unit = js.native
    protected def _onKeyPress(evt: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onResize(): Unit = js.native
    protected def _onScrollY(evt: js.Any): Unit = js.native
    protected def _onSelectionChanged(evt: js.Any): Unit = js.native
    protected def _onTableModelDataChanged(evt: js.Any): Unit = js.native
    protected def _onTableModelMetaDataChanged(evt: js.Any): Unit = js.native
    protected def _updateScrollBarVisibility(): Unit = js.native
    protected def _updateScrollerWidths(): Unit = js.native
    protected def _updateStatusBar(): Unit = js.native
    protected def _updateTableData(firstRow: Int, lastRow: Int, firstColumn: Int, lastColumn: Int, removeStart: Int = ???, removeCount: Int = ???): Unit = js.native
    def blockHeaderElements(): Unit = js.native
    def cancelEditing(): Unit = js.native
    def clearFocusedRowHighlight(evt: qx.event.`type`.Pointer): Unit = js.native
    def getAdditionalStatusBarText(): js.Dynamic = js.native
    def getAlwaysUpdateCells(): Boolean = js.native
    def getColumnVisibilityButtonVisible(): Boolean = js.native
    def getContextMenuFromDataCellsOnly(): Boolean = js.native
    def getDataRowRenderer(): qx.ui.table.IRowRenderer = js.native
    def getEmptyTableModel(): qx.ui.table.ITableModel = js.native
    def getFocusCellOnPointerMove(): Boolean = js.native
    def getFocusedColumn(): Int = js.native
    def getFocusedRow(): Int = js.native
    def getForceLineHeight(): Boolean = js.native
    def getHeaderCellHeight(): Int = js.native
    def getHeaderCellsVisible(): Boolean = js.native
    def getInitiallyHiddenColumns(): js.Dynamic = js.native
    def getKeepFirstVisibleRowComplete(): Boolean = js.native
    def getMetaColumnCounts(): js.Dynamic = js.native
    def getModalCellEditorPreOpenFunction(): js.Function = js.native
    def getNewColumnMenu(): js.Function = js.native
    def getNewSelectionManager(): js.Function = js.native
    def getNewSelectionModel(): js.Function = js.native
    def getNewTableColumnModel(): js.Function = js.native
    def getNewTablePane(): js.Function = js.native
    def getNewTablePaneHeader(): js.Function = js.native
    def getNewTablePaneModel(): js.Function = js.native
    def getNewTablePaneScroller(): js.Function = js.native
    def getPaneScroller(metaColumn: Int): qx.ui.table.pane.Scroller = js.native
    def getResetSelectionOnHeaderTap(): Boolean = js.native
    def getRowFocusChangeModifiesSelection(): Boolean = js.native
    def getRowHeight(): Long = js.native
    def getSelectionManager(): qx.ui.table.selection.Manager = js.native
    def getSelectionModel(): qx.ui.table.selection.Model = js.native
    def getShowCellFocusIndicator(): Boolean = js.native
    def getStatusBarVisible(): Boolean = js.native
    def getTableColumnModel(): qx.ui.table.columnmodel.Basic = js.native
    def getTableModel(): qx.ui.table.ITableModel = js.native
    def getTablePaneScrollerAtPageX(pageX: Int): qx.ui.table.pane.Scroller = js.native
    def highlightFocusedRow(bHighlight: Boolean): Unit = js.native
    protected def initAdditionalStatusBarText(value: js.Any): js.Dynamic = js.native
    protected def initAlwaysUpdateCells(value: js.Any): Boolean = js.native
    protected def initColumnVisibilityButtonVisible(value: js.Any): Boolean = js.native
    protected def initContextMenuFromDataCellsOnly(value: js.Any): Boolean = js.native
    protected def initDataRowRenderer(value: js.Any): qx.ui.table.IRowRenderer = js.native
    protected def initFocusCellOnPointerMove(value: js.Any): Boolean = js.native
    protected def initForceLineHeight(value: js.Any): Boolean = js.native
    protected def initHeaderCellHeight(value: js.Any): Int = js.native
    protected def initHeaderCellsVisible(value: js.Any): Boolean = js.native
    protected def initInitiallyHiddenColumns(value: js.Any): js.Dynamic = js.native
    protected def initKeepFirstVisibleRowComplete(value: js.Any): Boolean = js.native
    protected def initMetaColumnCounts(value: js.Any): js.Dynamic = js.native
    protected def initModalCellEditorPreOpenFunction(value: js.Any): js.Function = js.native
    protected def initNewColumnMenu(value: js.Any): js.Function = js.native
    protected def initNewSelectionManager(value: js.Any): js.Function = js.native
    protected def initNewSelectionModel(value: js.Any): js.Function = js.native
    protected def initNewTableColumnModel(value: js.Any): js.Function = js.native
    protected def initNewTablePane(value: js.Any): js.Function = js.native
    protected def initNewTablePaneHeader(value: js.Any): js.Function = js.native
    protected def initNewTablePaneModel(value: js.Any): js.Function = js.native
    protected def initNewTablePaneScroller(value: js.Any): js.Function = js.native
    protected def initResetSelectionOnHeaderTap(value: js.Any): Boolean = js.native
    protected def initRowFocusChangeModifiesSelection(value: js.Any): Boolean = js.native
    protected def initRowHeight(value: js.Any): Long = js.native
    protected def initSelectionModel(value: js.Any): qx.ui.table.selection.Model = js.native
    protected def initShowCellFocusIndicator(value: js.Any): Boolean = js.native
    protected def initStatusBarVisible(value: js.Any): Boolean = js.native
    protected def initTableModel(value: js.Any): qx.ui.table.ITableModel = js.native
    def isAlwaysUpdateCells(): Boolean = js.native
    def isColumnVisibilityButtonVisible(): Boolean = js.native
    def isContextMenuFromDataCellsOnly(): Boolean = js.native
    def isEditing(): js.Dynamic = js.native
    def isFocusCellOnPointerMove(): Boolean = js.native
    def isForceLineHeight(): Boolean = js.native
    def isHeaderCellsVisible(): Boolean = js.native
    def isKeepFirstVisibleRowComplete(): Boolean = js.native
    def isResetSelectionOnHeaderTap(): Boolean = js.native
    def isRowFocusChangeModifiesSelection(): Boolean = js.native
    def isShowCellFocusIndicator(): Boolean = js.native
    def isStatusBarVisible(): Boolean = js.native
    def moveFocusedCell(deltaX: Int, deltaY: Int): Unit = js.native
    def resetAdditionalStatusBarText(): Unit = js.native
    def resetAlwaysUpdateCells(): Unit = js.native
    def resetCellFocus(): Unit = js.native
    def resetColumnVisibilityButtonVisible(): Unit = js.native
    def resetContextMenuFromDataCellsOnly(): Unit = js.native
    def resetDataRowRenderer(): Unit = js.native
    def resetFocusCellOnPointerMove(): Unit = js.native
    def resetForceLineHeight(): Unit = js.native
    def resetHeaderCellHeight(): Unit = js.native
    def resetHeaderCellsVisible(): Unit = js.native
    def resetInitiallyHiddenColumns(): Unit = js.native
    def resetKeepFirstVisibleRowComplete(): Unit = js.native
    def resetMetaColumnCounts(): Unit = js.native
    def resetModalCellEditorPreOpenFunction(): Unit = js.native
    def resetNewColumnMenu(): Unit = js.native
    def resetNewSelectionManager(): Unit = js.native
    def resetNewSelectionModel(): Unit = js.native
    def resetNewTableColumnModel(): Unit = js.native
    def resetNewTablePane(): Unit = js.native
    def resetNewTablePaneHeader(): Unit = js.native
    def resetNewTablePaneModel(): Unit = js.native
    def resetNewTablePaneScroller(): Unit = js.native
    def resetResetSelectionOnHeaderTap(): Unit = js.native
    def resetRowFocusChangeModifiesSelection(): Unit = js.native
    def resetRowHeight(): Unit = js.native
    def resetSelection(): Unit = js.native
    def resetSelectionModel(): Unit = js.native
    def resetShowCellFocusIndicator(): Unit = js.native
    def resetStatusBarVisible(): Unit = js.native
    def resetTableModel(): Unit = js.native
    def scrollCellVisible(col: Int, row: Int): Unit = js.native
    def setAdditionalStatusBarText(value: js.Any): js.Dynamic = js.native
    def setAlwaysUpdateCells(value: js.Any): Boolean = js.native
    def setColumnVisibilityButtonVisible(value: js.Any): Boolean = js.native
    def setColumnWidth(col: Int, width: Int): Unit = js.native
    def setContextMenuFromDataCellsOnly(value: js.Any): Boolean = js.native
    def setDataRowRenderer(value: js.Any): qx.ui.table.IRowRenderer = js.native
    def setFocusCellOnPointerMove(value: js.Any): Boolean = js.native
    def setFocusedCell(col: Int = ???, row: Int = ???, scrollVisible: Boolean = ???): Unit = js.native
    def setForceLineHeight(value: js.Any): Boolean = js.native
    def setHeaderCellHeight(value: js.Any): Int = js.native
    def setHeaderCellsVisible(value: js.Any): Boolean = js.native
    def setInitiallyHiddenColumns(value: js.Any): js.Dynamic = js.native
    def setKeepFirstVisibleRowComplete(value: js.Any): Boolean = js.native
    def setMetaColumnCounts(value: js.Any): js.Dynamic = js.native
    def setModalCellEditorPreOpenFunction(value: js.Any): js.Function = js.native
    def setNewColumnMenu(value: js.Any): js.Function = js.native
    def setNewSelectionManager(value: js.Any): js.Function = js.native
    def setNewSelectionModel(value: js.Any): js.Function = js.native
    def setNewTableColumnModel(value: js.Any): js.Function = js.native
    def setNewTablePane(value: js.Any): js.Function = js.native
    def setNewTablePaneHeader(value: js.Any): js.Function = js.native
    def setNewTablePaneModel(value: js.Any): js.Function = js.native
    def setNewTablePaneScroller(value: js.Any): js.Function = js.native
    def setResetSelectionOnHeaderTap(value: js.Any): Boolean = js.native
    def setRowFocusChangeModifiesSelection(value: js.Any): Boolean = js.native
    def setRowHeight(value: js.Any): Long = js.native
    def setSelectionModel(value: js.Any): qx.ui.table.selection.Model = js.native
    def setShowCellFocusIndicator(value: js.Any): Boolean = js.native
    def setStatusBarVisible(value: js.Any): Boolean = js.native
    def setTableModel(value: js.Any): qx.ui.table.ITableModel = js.native
    def startEditing(): Boolean = js.native
    def stopEditing(): Unit = js.native
    def toggleAlwaysUpdateCells(): Boolean = js.native
    def toggleColumnVisibilityButtonVisible(): Boolean = js.native
    def toggleContextMenuFromDataCellsOnly(): Boolean = js.native
    def toggleFocusCellOnPointerMove(): Boolean = js.native
    def toggleForceLineHeight(): Boolean = js.native
    def toggleHeaderCellsVisible(): Boolean = js.native
    def toggleKeepFirstVisibleRowComplete(): Boolean = js.native
    def toggleResetSelectionOnHeaderTap(): Boolean = js.native
    def toggleRowFocusChangeModifiesSelection(): Boolean = js.native
    def toggleShowCellFocusIndicator(): Boolean = js.native
    def toggleStatusBarVisible(): Boolean = js.native
    def unblockHeaderElements(): Unit = js.native
    def updateContent(): Unit = js.native

}
}
package qx.ui.table.celleditor {
@js.native
@JSName("qx.ui.table.celleditor.AbstractField")
class AbstractField extends qx.core.Object with qx.ui.table.ICellEditorFactory {
    override def createCellEditor(cellInfo: js.Any): qx.ui.core.Widget = js.native
    override def getCellEditorValue(cellEditor: qx.ui.core.Widget): js.Dynamic = js.native
    protected def _createEditor(): qx.ui.core.Widget = js.native
    def getValidationFunction(): js.Function = js.native
    protected def initValidationFunction(value: js.Any): js.Function = js.native
    def resetValidationFunction(): Unit = js.native
    def setValidationFunction(value: js.Any): js.Function = js.native

}
}
package qx.ui.table.celleditor {
@js.native
@JSName("qx.ui.table.celleditor.CheckBox")
class CheckBox extends qx.core.Object with qx.ui.table.ICellEditorFactory {
    override def createCellEditor(cellInfo: js.Any): qx.ui.core.Widget = js.native
    override def getCellEditorValue(cellEditor: qx.ui.core.Widget): js.Dynamic = js.native

}
}
package qx.ui.table.celleditor {
@js.native
@JSName("qx.ui.table.celleditor.ComboBox")
class ComboBox extends qx.core.Object with qx.ui.table.ICellEditorFactory {
    override def createCellEditor(cellInfo: js.Any): qx.ui.core.Widget = js.native
    override def getCellEditorValue(cellEditor: qx.ui.core.Widget): js.Dynamic = js.native
    def getListData(): qx.data.Array = js.native
    def getValidationFunction(): js.Function = js.native
    protected def initListData(value: js.Any): qx.data.Array = js.native
    protected def initValidationFunction(value: js.Any): js.Function = js.native
    def resetListData(): Unit = js.native
    def resetValidationFunction(): Unit = js.native
    def setListData(value: js.Any): qx.data.Array = js.native
    def setValidationFunction(value: js.Any): js.Function = js.native

}
}
package qx.ui.table.celleditor {
@js.native
@JSName("qx.ui.table.celleditor.Dynamic")
class Dynamic protected () extends qx.core.Object with qx.ui.table.ICellEditorFactory {
    override def createCellEditor(cellInfo: js.Any): qx.ui.core.Widget = js.native
    override def getCellEditorValue(cellEditor: qx.ui.core.Widget): js.Dynamic = js.native
    def this(cellEditorFactoryFunction: js.Function = ???) = this()
    def getCellEditorFactoryFunction(): js.Function = js.native
    protected def initCellEditorFactoryFunction(value: js.Any): js.Function = js.native
    def resetCellEditorFactoryFunction(): Unit = js.native
    def setCellEditorFactoryFunction(value: js.Any): js.Function = js.native

}
}
package qx.ui.table.celleditor {
@js.native
@JSName("qx.ui.table.celleditor.PasswordField")
class PasswordField extends qx.ui.table.celleditor.AbstractField {

}
}
package qx.ui.table.celleditor {
@js.native
@JSName("qx.ui.table.celleditor.SelectBox")
class SelectBox extends qx.core.Object with qx.ui.table.ICellEditorFactory {
    override def createCellEditor(cellInfo: js.Any): qx.ui.core.Widget = js.native
    override def getCellEditorValue(cellEditor: qx.ui.core.Widget): js.Dynamic = js.native
    def getListData(): qx.data.Array = js.native
    def getValidationFunction(): js.Function = js.native
    protected def initListData(value: js.Any): qx.data.Array = js.native
    protected def initValidationFunction(value: js.Any): js.Function = js.native
    def resetListData(): Unit = js.native
    def resetValidationFunction(): Unit = js.native
    def setListData(value: js.Any): qx.data.Array = js.native
    def setValidationFunction(value: js.Any): js.Function = js.native

}
}
package qx.ui.table.celleditor {
@js.native
@JSName("qx.ui.table.celleditor.TextField")
class TextField extends qx.ui.table.celleditor.AbstractField {

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Abstract")
class Abstract extends qx.core.Object with qx.ui.table.ICellRenderer {
//    override def createDataCellHtml(cellInfo: js.Any, htmlArr: js.Array[String]): Boolean = js.native
    protected def _createStyleSheet(): Unit = js.native
    protected def _getCellAttributes(cellInfo: js.Any): String = js.native
    protected def _getCellClass(cellInfo: js.Any): String = js.native
    protected def _getCellSizeStyle(width: Int, height: Int, insetX: Int, insetY: Int): String = js.native
    protected def _getCellStyle(cellInfo: js.Any): js.Dynamic = js.native
    protected def _getContentHtml(cellInfo: js.Any): String = js.native
    protected def _onChangeTheme(): Unit = js.native
    def getDefaultCellStyle(): String = js.native
    protected def initDefaultCellStyle(value: js.Any): String = js.native
    def resetDefaultCellStyle(): Unit = js.native
    def setDefaultCellStyle(value: js.Any): String = js.native

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.AbstractImage")
class AbstractImage extends qx.ui.table.cellrenderer.Abstract {
    protected def _getImageInfos(cellInfo: js.Any): js.Dynamic = js.native
    protected def _identifyImage(cellInfo: js.Any): js.Dynamic = js.native
    def getRepeat(): js.Dynamic = js.native
    protected def initRepeat(value: js.Any): js.Dynamic = js.native
    def resetRepeat(): Unit = js.native
    def setRepeat(value: js.Any): js.Dynamic = js.native

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Boolean")
class Boolean extends qx.ui.table.cellrenderer.AbstractImage {
    protected def _applyIconFalse(value: String, old: String): Unit = js.native
    protected def _applyIconTrue(value: String, old: String): Unit = js.native
    def getIconFalse(): String = js.native
    def getIconTrue(): String = js.native
    protected def initIconFalse(value: js.Any): String = js.native
    protected def initIconTrue(value: js.Any): String = js.native
    def resetIconFalse(): Unit = js.native
    def resetIconTrue(): Unit = js.native
    def setIconFalse(value: js.Any): String = js.native
    def setIconTrue(value: js.Any): String = js.native

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Conditional")
class Conditional protected () extends qx.ui.table.cellrenderer.Default {
    def this(align: String = ???, color: String = ???, style: String = ???, weight: String = ???) = this()
    def addBetweenCondition(condition: String, value1: Int, value2: Int, align: String, color: String, style: String, weight: String, target: String): Unit = js.native
    def addNumericCondition(condition: String, value1: Int, align: String, color: String, style: String, weight: String, target: String): Unit = js.native
    def addRegex(regex: String, align: String, color: String, style: String, weight: String, target: String): Unit = js.native

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Date")
class Date extends qx.ui.table.cellrenderer.Conditional {
    def getDateFormat(): qx.util.format.DateFormat = js.native
    protected def initDateFormat(value: js.Any): qx.util.format.DateFormat = js.native
    def resetDateFormat(): Unit = js.native
    def setDateFormat(value: js.Any): qx.util.format.DateFormat = js.native

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Debug")
class Debug extends qx.ui.table.cellrenderer.Abstract {

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Default")
class Default extends qx.ui.table.cellrenderer.Abstract {
    protected def _formatValue(cellInfo: js.Any): String = js.native
    protected def _getStyleFlags(cellInfo: js.Any): Int = js.native
    def getUseAutoAlign(): Boolean = js.native
    protected def initUseAutoAlign(value: js.Any): Boolean = js.native
    def isUseAutoAlign(): Boolean = js.native
    def resetUseAutoAlign(): Unit = js.native
    def setUseAutoAlign(value: js.Any): Boolean = js.native
    def toggleUseAutoAlign(): Boolean = js.native

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Dynamic")
class Dynamic protected () extends qx.ui.table.cellrenderer.Default {
    def this(cellRendererFactoryFunction: js.Function = ???) = this()
    def getCellRendererFactoryFunction(): js.Function = js.native
    protected def initCellRendererFactoryFunction(value: js.Any): js.Function = js.native
    def resetCellRendererFactoryFunction(): Unit = js.native
    def setCellRendererFactoryFunction(value: js.Any): js.Function = js.native

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Html")
class Html extends qx.ui.table.cellrenderer.Conditional {

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Image")
class Image protected () extends qx.ui.table.cellrenderer.AbstractImage {
    def this(width: Int = ???, height: Int = ???) = this()

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Number")
class Number extends qx.ui.table.cellrenderer.Conditional {
    def getNumberFormat(): qx.util.format.NumberFormat = js.native
    protected def initNumberFormat(value: js.Any): qx.util.format.NumberFormat = js.native
    def resetNumberFormat(): Unit = js.native
    def setNumberFormat(value: js.Any): qx.util.format.NumberFormat = js.native

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Password")
class Password extends qx.ui.table.cellrenderer.Default {

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.Replace")
class Replace extends qx.ui.table.cellrenderer.Default {
    def addReversedReplaceMap(): Boolean = js.native
    def getReplaceFunction(): js.Function = js.native
    def getReplaceMap(): js.Dynamic = js.native
    protected def initReplaceFunction(value: js.Any): js.Function = js.native
    protected def initReplaceMap(value: js.Any): js.Dynamic = js.native
    def resetReplaceFunction(): Unit = js.native
    def resetReplaceMap(): Unit = js.native
    def setReplaceFunction(value: js.Any): js.Function = js.native
    def setReplaceMap(value: js.Any): js.Dynamic = js.native

}
}
package qx.ui.table.cellrenderer {
@js.native
@JSName("qx.ui.table.cellrenderer.String")
class String extends qx.ui.table.cellrenderer.Conditional {

}
}
package qx.ui.table.columnmenu {
@js.native
@JSName("qx.ui.table.columnmenu.Button")
class Button extends qx.ui.form.MenuButton with qx.ui.table.IColumnMenuButton {
    override def empty(): Unit = js.native
    override def factory(item: String, options: js.Any): qx.ui.core.Widget = js.native
//    override def getMenu(): js.Dynamic = js.native
    override def resetMenu(): Unit = js.native
//    override def setMenu(value: js.Any): js.Dynamic = js.native
    def getBlocker(): qx.ui.core.Blocker = js.native

}
}
package qx.ui.table.columnmenu {
@js.native
@JSName("qx.ui.table.columnmenu.MenuItem")
class MenuItem protected () extends qx.ui.menu.CheckBox with qx.ui.table.IColumnMenuItem {
    override def getVisible(): js.Dynamic = js.native
    override def resetVisible(): Unit = js.native
    override def setVisible(value: js.Any): js.Dynamic = js.native
    def this(text: String = ???) = this()
    protected def _applyVisible(value: Boolean, old: Boolean): Unit = js.native
    def toggleVisible(): Boolean = js.native

}
}
package qx.ui.table.columnmodel {
@js.native
@JSName("qx.ui.table.columnmodel.Basic")
class Basic extends qx.core.Object {
    protected def _getColToXPosMap(): js.Dynamic = js.native
    def getCellEditorFactory(col: Int): qx.ui.table.ICellEditorFactory = js.native
    def getColumnWidth(col: Int): Int = js.native
    def getDataCellRenderer(col: Int): qx.ui.table.ICellRenderer = js.native
    def getHeaderCellRenderer(col: Int): qx.ui.table.IHeaderRenderer = js.native
    def getOverallColumnAtX(overXPos: Int): Int = js.native
    def getOverallColumnCount(): Int = js.native
    def getOverallX(col: Int): Int = js.native
    def getVisibleColumnAtX(visXPos: Int): Int = js.native
    def getVisibleColumnCount(): Int = js.native
    def getVisibleColumns(): qx.data.Array = js.native
    def getVisibleX(col: Int): Int = js.native
    def init(colCount: Int, table: qx.ui.table.Table): Unit = js.native
    def isColumnVisible(col: Int): Boolean = js.native
    def moveColumn(fromOverXPos: Int, toOverXPos: Int): Unit = js.native
    def setCellEditorFactory(col: Int, factory: qx.ui.table.ICellEditorFactory): Unit = js.native
    def setColumnsOrder(newPositions: js.Array[Int]): Unit = js.native
    def setColumnVisible(col: Int, visible: Boolean): Unit = js.native
    def setColumnWidth(col: Int, width: Int, isPointerAction: Boolean): Unit = js.native
    def setDataCellRenderer(col: Int, renderer: qx.ui.table.ICellRenderer): qx.ui.table.ICellRenderer = js.native
    def setHeaderCellRenderer(col: Int, renderer: qx.ui.table.IHeaderRenderer): Unit = js.native

}
}
package qx.ui.table.columnmodel {
@js.native
@JSName("qx.ui.table.columnmodel.Resize")
class Resize extends qx.ui.table.columnmodel.Basic with qx.locale.MTranslation {
    protected def _addResetColumnWidthButton(event: qx.event.`type`.Data): Unit = js.native
    protected def _applyBehavior(value: qx.ui.table.columnmodel.resizebehavior.Abstract, old: qx.ui.table.columnmodel.resizebehavior.Abstract): Unit = js.native
    protected def _onappear(event: qx.event.`type`.Event): Unit = js.native
    protected def _oncolumnwidthchanged(event: qx.event.`type`.Data): Unit = js.native
    protected def _onTableWidthChanged(event: qx.event.`type`.Event): Unit = js.native
    protected def _onverticalscrollbarchanged(event: qx.event.`type`.Data): Unit = js.native
    protected def _onvisibilitychanged(event: qx.event.`type`.Data): Unit = js.native
    def getBehavior(): qx.ui.table.columnmodel.resizebehavior.Abstract = js.native
    def getTable(): qx.ui.table.Table = js.native
    protected def initBehavior(value: js.Any): qx.ui.table.columnmodel.resizebehavior.Abstract = js.native
    def resetBehavior(): Unit = js.native
    def setBehavior(value: js.Any): qx.ui.table.columnmodel.resizebehavior.Abstract = js.native

}
}
package qx.ui.table.columnmodel.resizebehavior {
@js.native
@JSName("qx.ui.table.columnmodel.resizebehavior.Abstract")
class Abstract extends qx.core.Object {
    protected def _getAvailableWidth(): Int = js.native
    protected def _setNumColumns(numColumns: Int): Unit = js.native
    def onAppear(event: js.Any, forceRefresh: Boolean = ???): Unit = js.native
    def onColumnWidthChanged(event: js.Any): Unit = js.native
    def onTableWidthChanged(event: js.Any): Unit = js.native
    def onVerticalScrollBarChanged(event: js.Any): Unit = js.native
    def onVisibilityChanged(event: js.Any): Unit = js.native

}
}
package qx.ui.table.columnmodel.resizebehavior {
@js.native
@JSName("qx.ui.table.columnmodel.resizebehavior.Default")
class Default extends qx.ui.table.columnmodel.resizebehavior.Abstract {
    protected def _computeColumnsFlexWidth(): Unit = js.native
    protected def _extendLastColumn(event: qx.event.`type`.Data): Unit = js.native
    protected def _extendNextColumn(event: qx.event.`type`.Data): Unit = js.native
    protected def _getResizeColumnData(): js.Array[qx.ui.core.ColumnData] = js.native
    def getInitializeWidthsOnEveryAppear(): Boolean = js.native
    def getLayoutChildren(): js.Array[qx.ui.core.ColumnData] = js.native
    def getNewResizeBehaviorColumnData(): js.Function = js.native
    def getTableColumnModel(): qx.ui.table.columnmodel.Resize = js.native
    protected def initInitializeWidthsOnEveryAppear(value: js.Any): Boolean = js.native
    protected def initNewResizeBehaviorColumnData(value: js.Any): js.Function = js.native
    protected def initTableColumnModel(value: js.Any): qx.ui.table.columnmodel.Resize = js.native
    def isInitializeWidthsOnEveryAppear(): Boolean = js.native
    def resetInitializeWidthsOnEveryAppear(): Unit = js.native
    def resetNewResizeBehaviorColumnData(): Unit = js.native
    def resetTableColumnModel(): Unit = js.native
    def set(col: Int, map: js.Any): Unit = js.native
    def setInitializeWidthsOnEveryAppear(value: js.Any): Boolean = js.native
    def setMaxWidth(col: Int, width: Int): Unit = js.native
    def setMinWidth(col: Int, width: Int): Unit = js.native
    def setNewResizeBehaviorColumnData(value: js.Any): js.Function = js.native
    def setTableColumnModel(value: js.Any): qx.ui.table.columnmodel.Resize = js.native
    def setWidth(col: Int, width: Int, flex: Int = ???): Unit = js.native
    def toggleInitializeWidthsOnEveryAppear(): Boolean = js.native

}
}
package qx.ui.table.headerrenderer {
@js.native
@JSName("qx.ui.table.headerrenderer.Default")
class Default extends qx.core.Object with qx.ui.table.IHeaderRenderer {
    override def createHeaderCell(cellInfo: js.Any): qx.ui.core.Widget = js.native
    override def updateHeaderCell(cellInfo: js.Any, cellWidget: qx.ui.core.Widget): Unit = js.native
    def getToolTip(): String = js.native
    protected def initToolTip(value: js.Any): String = js.native
    def resetToolTip(): Unit = js.native
    def setToolTip(value: js.Any): String = js.native

}
}
package qx.ui.table.headerrenderer {
@js.native
@JSName("qx.ui.table.headerrenderer.HeaderCell")
class HeaderCell extends qx.ui.container.Composite {
    protected def _applyIcon(value: String, old: String): Unit = js.native
    protected def _applyLabel(value: String, old: String): Unit = js.native
    protected def _applySortIcon(value: String, old: String): Unit = js.native
    def getIcon(): String = js.native
    def getLabel(): String = js.native
    def getSortIcon(): String = js.native
    protected def initIcon(value: js.Any): String = js.native
    protected def initLabel(value: js.Any): String = js.native
    protected def initSortIcon(value: js.Any): String = js.native
    def resetIcon(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetSortIcon(): Unit = js.native
    def setIcon(value: js.Any): String = js.native
    def setLabel(value: js.Any): String = js.native
    def setSortIcon(value: js.Any): String = js.native

}
}
package qx.ui.table.headerrenderer {
@js.native
@JSName("qx.ui.table.headerrenderer.Icon")
class Icon protected () extends qx.ui.table.headerrenderer.Default {
    def this(iconUrl: String = ???, tooltip: String = ???) = this()
    def getIconUrl(): String = js.native
    protected def initIconUrl(value: js.Any): String = js.native
    def resetIconUrl(): Unit = js.native
    def setIconUrl(value: js.Any): String = js.native

}
}
package qx.ui.table.model {
@js.native
@JSName("qx.ui.table.model.Abstract")
class Abstract extends qx.core.Object with qx.ui.table.ITableModel {
    override def getColumnCount(): Int = js.native
    override def getColumnId(columnIndex: Int): String = js.native
    override def getColumnIndexById(columnId: String): Int = js.native
    override def getColumnName(columnIndex: Int): String = js.native
    override def getRowCount(): Int = js.native
    override def getRowData(rowIndex: Int): js.Dynamic = js.native
    override def getSortColumnIndex(): Int = js.native
    override def getValue(columnIndex: Int, rowIndex: Int): js.Dynamic = js.native
    override def getValueById(columnId: String, rowIndex: Int): js.Dynamic = js.native
    override def isColumnEditable(columnIndex: Int): Boolean = js.native
    override def isColumnSortable(columnIndex: Int): Boolean = js.native
    override def isSortAscending(): Boolean = js.native
    override def prefetchRows(firstRowIndex: Int, lastRowIndex: Int): Unit = js.native
    override def setValue(columnIndex: Int, rowIndex: Int, value: js.Any): Unit = js.native
    override def setValueById(columnId: String, rowIndex: Int, value: js.Any): Unit = js.native
    override def sortByColumn(columnIndex: Int, ascending: Boolean): Unit = js.native
    def init(table: qx.ui.table.Table): Unit = js.native
    def setColumnIds(columnIdArr: js.Array[String]): Unit = js.native
    def setColumnNamesById(columnNameMap: js.Any): Unit = js.native
    def setColumnNamesByIndex(columnNameArr: js.Array[String]): Unit = js.native
    def setColumns(columnNameArr: js.Array[String], columnIdArr: js.Array[String] = ???): Unit = js.native

}
}
package qx.ui.table.model {
@js.native
@JSName("qx.ui.table.model.Filtered")
class Filtered extends qx.ui.table.model.Simple {
    protected def _js_in_array(the_needle: String, the_haystack: qx.data.Array): Boolean = js.native
    def addBetweenFilter(filter: String, value1: Int, value2: Int, target: String): Unit = js.native
    def addNotRegex(regex: String, target: String, ignorecase: Boolean): Unit = js.native
    def addNumericFilter(filter: String, value1: Int, target: String): Unit = js.native
    def addRegex(regex: String, target: String, ignorecase: Boolean): Unit = js.native
    def applyFilters(): Unit = js.native
    def hideRows(rowNum: Int, numOfRows: Int, dispatchEvent: Boolean = ???): Unit = js.native
    def resetHiddenRows(): Unit = js.native

}
}
package qx.ui.table.model {
@js.native
@JSName("qx.ui.table.model.Remote")
class Remote extends qx.ui.table.model.Abstract {
    protected def _cancelCurrentRequest(): Boolean = js.native
    protected def _getIgnoreCurrentRequest(): Boolean = js.native
    protected def _loadRowCount(): Unit = js.native
    protected def _loadRowData(firstRow: Int, lastRow: Int): Unit = js.native
    protected def _onRowCountLoaded(rowCount: Int): Unit = js.native
    protected def _onRowDataLoaded(rowDataArr: js.Array[js.Any]): Unit = js.native
    protected def _setRowBlockData(block: Int, rowDataArr: js.Array[js.Any]): Unit = js.native
    def clearCache(): Unit = js.native
    def getBlockConcurrentLoadRowCount(): Boolean = js.native
    def getBlockSize(): Int = js.native
    def getCacheContent(): js.Dynamic = js.native
    def getClearCacheOnRemove(): Boolean = js.native
    def getMaxCachedBlockCount(): Int = js.native
    protected def initBlockConcurrentLoadRowCount(value: js.Any): Boolean = js.native
    protected def initBlockSize(value: js.Any): Int = js.native
    protected def initClearCacheOnRemove(value: js.Any): Boolean = js.native
    protected def initMaxCachedBlockCount(value: js.Any): Int = js.native
    def isBlockConcurrentLoadRowCount(): Boolean = js.native
    def isClearCacheOnRemove(): Boolean = js.native
    def iterateCachedRows(iterator: js.Function, obj: js.Any): Unit = js.native
    def reloadData(): Unit = js.native
    def removeRow(rowIndex: Int): Unit = js.native
    def resetBlockConcurrentLoadRowCount(): Unit = js.native
    def resetBlockSize(): Unit = js.native
    def resetClearCacheOnRemove(): Unit = js.native
    def resetMaxCachedBlockCount(): Unit = js.native
    def restoreCacheContent(cacheContent: js.Any): Unit = js.native
    def setBlockConcurrentLoadRowCount(value: js.Any): Boolean = js.native
    def setBlockSize(value: js.Any): Int = js.native
    def setClearCacheOnRemove(value: js.Any): Boolean = js.native
    def setColumnEditable(columnIndex: Int, editable: Boolean): Unit = js.native
    def setColumnSortable(columnIndex: Int, sortable: Boolean): Unit = js.native
    def setEditable(editable: Boolean): Unit = js.native
    def setMaxCachedBlockCount(value: js.Any): Int = js.native
    def setSortAscendingWithoutSortingData(sortAscending: Boolean): Unit = js.native
    def setSortColumnIndexWithoutSortingData(sortColumnIndex: Int): Unit = js.native
    def toggleBlockConcurrentLoadRowCount(): Boolean = js.native
    def toggleClearCacheOnRemove(): Boolean = js.native

}
}
package qx.ui.table.model {
@js.native
@JSName("qx.ui.table.model.Simple")
class Simple extends qx.ui.table.model.Abstract {
    protected def _mapArray2RowArr(mapArr: js.Array[js.Any], rememberMaps: Boolean = ???): js.Array[js.Dynamic] = js.native
    protected def _setSortAscending(ascending: Boolean): Unit = js.native
    protected def _setSortColumnIndex(columnIndex: Int): Unit = js.native
    def addRows(rowArr: js.Array[js.Any], startIndex: Int = ???, clearSorting: Boolean = ???): Unit = js.native
    def addRowsAsMapArray(mapArr: js.Array[js.Any], startIndex: Int = ???, rememberMaps: Boolean = ???, clearSorting: Boolean = ???): Unit = js.native
    def clearSorting(): Unit = js.native
    def getCaseSensitiveSorting(): Boolean = js.native
    def getData(): js.Array[js.Dynamic] = js.native
    def getDataAsMapArray(): js.Array[js.Any] = js.native
    def getRowDataAsMap(rowIndex: Int): js.Dynamic = js.native
    def getSortMethods(columnIndex: Int): js.Dynamic = js.native
    protected def initCaseSensitiveSorting(value: js.Any): Boolean = js.native
    def isCaseSensitiveSorting(): Boolean = js.native
    def removeRows(startIndex: Int, howMany: Int, clearSorting: Boolean = ???): Unit = js.native
    def resetCaseSensitiveSorting(): Unit = js.native
    def setCaseSensitiveSorting(value: js.Any): Boolean = js.native
    def setColumnEditable(columnIndex: Int, editable: Boolean): Unit = js.native
    def setColumnSortable(columnIndex: Int, sortable: Boolean): Unit = js.native
    def setData(rowArr: js.Array[js.Any], clearSorting: Boolean = ???): Unit = js.native
    def setDataAsMapArray(mapArr: js.Array[js.Any], rememberMaps: Boolean = ???, clearSorting: Boolean = ???): Unit = js.native
    def setEditable(editable: Boolean): Unit = js.native
    def setRows(rowArr: js.Array[js.Any], startIndex: Int = ???, clearSorting: Boolean = ???): Unit = js.native
    def setRowsAsMapArray(mapArr: js.Array[js.Any], startIndex: Int = ???, rememberMaps: Boolean = ???, clearSorting: Boolean = ???): Unit = js.native
    def setSortMethods(columnIndex: Int, compare: js.Function): Unit = js.native
    def toggleCaseSensitiveSorting(): Boolean = js.native

}
@js.native
@JSName("qx.ui.table.model.Simple")
object Simple extends js.Object {
    protected def _defaultSortComparatorAscending(row1: js.Any, row2: js.Any): Int = js.native
    protected def _defaultSortComparatorDescending(row1: js.Any, row2: js.Any): Int = js.native
    protected def _defaultSortComparatorInsensitiveAscending(row1: js.Any, row2: js.Any): Int = js.native
    protected def _defaultSortComparatorInsensitiveDescending(row1: js.Any, row2: js.Any): Int = js.native

}
}
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.CellEvent")
class CellEvent extends qx.event.`type`.Pointer {
    def getColumn(): Int = js.native
    def getRow(): Int = js.native
    protected def initColumn(value: js.Any): Int = js.native
    protected def initRow(value: js.Any): Int = js.native
    def resetColumn(): Unit = js.native
    def resetRow(): Unit = js.native
    def setColumn(value: js.Any): Int = js.native
    def setRow(value: js.Any): Int = js.native

}
}
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.Clipper")
class Clipper extends qx.ui.container.Composite {
    def scrollToX(value: Int): Unit = js.native
    def scrollToY(value: Int): Unit = js.native

}
}
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.FocusIndicator")
class FocusIndicator protected () extends qx.ui.container.Composite {
    def this(scroller: js.Any = ???) = this()
    protected def _onKeyPress(e: qx.event.`type`.KeySequence): Unit = js.native
    def getColumn(): Int = js.native
    def getRow(): Int = js.native
    protected def initColumn(value: js.Any): Int = js.native
    protected def initRow(value: js.Any): Int = js.native
    def moveToCell(col: Int = ???, row: Int = ???): Unit = js.native
    def resetColumn(): Unit = js.native
    def resetRow(): Unit = js.native
    def setColumn(value: js.Any): Int = js.native
    def setRow(value: js.Any): Int = js.native

}
}
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.Header")
class Header protected () extends qx.ui.core.Widget {
    def this(paneScroller: qx.ui.table.pane.Scroller = ???) = this()
    protected def _cleanUpCells(): Unit = js.native
    protected def _updateContent(completeUpdate: Boolean): Unit = js.native
    def getBlocker(): qx.ui.core.Blocker = js.native
    def getHeaderWidgetAtColumn(col: Int): qx.ui.table.headerrenderer.HeaderCell = js.native
    def getPaneScroller(): qx.ui.table.pane.Scroller = js.native
    def getTable(): qx.ui.table.Table = js.native
    def hideColumnMoveFeedback(): Unit = js.native
    def isShowingColumnMoveFeedback(): Boolean = js.native
    def onColOrderChanged(): Unit = js.native
    def onPaneModelChanged(): Unit = js.native
    def onTableModelMetaDataChanged(): Unit = js.native
    def setColumnWidth(col: Int, width: Int, isPointerAction: Boolean): Unit = js.native
    def setPointerOverColumn(col: Int): Unit = js.native
    def showColumnMoveFeedback(col: Int, x: Int): Unit = js.native

}
}
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.Model")
class Model protected () extends qx.core.Object {
    def this(tableColumnModel: qx.ui.table.columnmodel.Basic = ???) = this()
    protected def _applyFirstColumnX(value: Int, old: Int): Unit = js.native
    protected def _applyMaxColumnCount(value: Long, old: Long): Unit = js.native
    protected def _onColVisibilityChanged(evt: js.Any): Unit = js.native
    protected def _onHeaderCellRendererChanged(evt: js.Any): Unit = js.native
    def getColumnAtX(xPos: Int): Int = js.native
    def getColumnCount(): Int = js.native
    def getColumnLeft(col: Int): js.Dynamic = js.native
    def getFirstColumnX(): Int = js.native
    def getMaxColumnCount(): Long = js.native
    def getTotalWidth(): Int = js.native
    def getX(col: Int): Int = js.native
    protected def initFirstColumnX(value: js.Any): Int = js.native
    protected def initMaxColumnCount(value: js.Any): Long = js.native
    def resetFirstColumnX(): Unit = js.native
    def resetMaxColumnCount(): Unit = js.native
    def setFirstColumnX(value: js.Any): Int = js.native
    def setMaxColumnCount(value: js.Any): Long = js.native
    def setTableColumnModel(tableColumnModel: qx.ui.table.columnmodel.Basic): Unit = js.native

}
}
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.Pane")
class Pane protected () extends qx.ui.core.Widget {
    def this(paneScroller: qx.ui.table.pane.Scroller = ???) = this()
    protected def _applyFirstVisibleRow(value: Long, old: Long): Unit = js.native
    protected def _applyMaxCacheLines(value: Long, old: Long): Unit = js.native
    protected def _applyVisibleRowCount(value: Long, old: Long): Unit = js.native
    protected def _getRowsHtml(firstRow: Int, rowCount: Int): String = js.native
    protected def _scrollContent(rowOffset: Int): Unit = js.native
    protected def _updateAllRows(): Unit = js.native
    protected def _updateRowStyles(onlyRow: Int = ???): Unit = js.native
    def getFirstVisibleRow(): Long = js.native
    def getMaxCacheLines(): Long = js.native
    def getPaneScroller(): qx.ui.table.pane.Scroller = js.native
    def getTable(): qx.ui.table.Table = js.native
    def getVisibleRowCount(): Long = js.native
    protected def initFirstVisibleRow(value: js.Any): Long = js.native
    protected def initMaxCacheLines(value: js.Any): Long = js.native
    protected def initVisibleRowCount(value: js.Any): Long = js.native
    def onColOrderChanged(): Unit = js.native
    def onFocusChanged(): Unit = js.native
    def onPaneModelChanged(): Unit = js.native
    def onSelectionChanged(): Unit = js.native
    def onTableModelDataChanged(firstRow: Int, lastRow: Int, firstColumn: Int, lastColumn: Int): Unit = js.native
    def onTableModelMetaDataChanged(): Unit = js.native
    def resetFirstVisibleRow(): Unit = js.native
    def resetMaxCacheLines(): Unit = js.native
    def resetVisibleRowCount(): Unit = js.native
    def setColumnWidth(col: Int, width: Int): Unit = js.native
    def setFirstVisibleRow(value: js.Any): Long = js.native
    def setFocusedCell(col: Int = ???, row: Int = ???, massUpdate: Boolean = ???): Unit = js.native
    def setMaxCacheLines(value: js.Any): Long = js.native
    def setVisibleRowCount(value: js.Any): Long = js.native
    def updateContent(completeUpdate: Boolean = ???, scrollOffset: Int = ???, onlyRow: Int = ???, onlySelectionOrFocusChanged: Boolean = ???): Unit = js.native

}
}
package qx.ui.table.pane {
@js.native
@JSName("qx.ui.table.pane.Scroller")
class Scroller protected () extends qx.ui.core.Widget with qx.ui.core.scroll.MScrollBarFactory {
    def this(table: qx.ui.table.Table = ???) = this()
    protected def _applyHorizontalScrollBarVisible(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyScrollTimeout(value: Int, old: Int): Unit = js.native
    protected def _applyShowCellFocusIndicator(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyTablePaneModel(value: qx.ui.table.pane.Model, old: qx.ui.table.pane.Model): Unit = js.native
    protected def _applyVerticalScrollBarVisible(value: Boolean, old: Boolean): Unit = js.native
    protected def _createHeaderClipper(): qx.ui.table.pane.Clipper = js.native
    protected def _createPaneClipper(): qx.ui.table.pane.Clipper = js.native
    protected def _focusCellAtPagePos(pageX: Int, pageY: Int): Unit = js.native
    protected def _getColumnForPageX(pageX: Int): Int = js.native
    protected def _getResizeColumnForPageX(pageX: Int): Int = js.native
    protected def _getRowForPagePos(pageX: Int, pageY: Int): Int = js.native
    protected def _hideResizeLine(): Unit = js.native
    protected def _onAppear(): Unit = js.native
    protected def _onCellEditorModalWindowClose(e: js.Any): Unit = js.native
    protected def _onChangeCaptureHeader(e: qx.event.`type`.Data): Unit = js.native
    protected def _onContextMenu(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onDbltapPane(e: js.Any): Unit = js.native
    protected def _onDisappear(): Unit = js.native
    protected def _oninterval(): Unit = js.native
    protected def _onPaneModelChanged(): Unit = js.native
    protected def _onPointerdownHeader(e: js.Any): Unit = js.native
    protected def _onPointerdownPane(e: js.Any): Unit = js.native
    protected def _onPointermoveHeader(e: js.Any): Unit = js.native
    protected def _onPointermovePane(e: js.Any): Unit = js.native
    protected def _onPointerout(e: js.Any): Unit = js.native
    protected def _onPointerupFocusIndicator(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerupHeader(e: js.Any): Unit = js.native
    protected def _onResizePane(): Unit = js.native
    protected def _onRoll(e: qx.event.`type`.Roll): Unit = js.native
    protected def _onScrollX(e: js.Any): Unit = js.native
    protected def _onScrollY(e: js.Any): Unit = js.native
    protected def _onTapHeader(e: js.Any): Unit = js.native
    protected def _onTapPane(e: js.Any): Unit = js.native
    protected def _postponedUpdateContent(): Unit = js.native
    protected def _showResizeLine(x: Int): Unit = js.native
    protected def _startInterval(timeout: Int): Unit = js.native
    protected def _startMoveHeader(moveCol: Int, pageX: Int): Unit = js.native
    protected def _startResizeHeader(resizeCol: Int, pageX: Int): Unit = js.native
    protected def _stopInterval(): Unit = js.native
    protected def _stopMoveHeader(): Unit = js.native
    protected def _stopResizeHeader(): Unit = js.native
    protected def _updateContent(): Unit = js.native
    protected def _updateFocusIndicator(): Unit = js.native
    def cancelEditing(): Unit = js.native
    def flushEditor(): Unit = js.native
    def getContextMenuFromDataCellsOnly(): Boolean = js.native
    def getFocusCellOnPointerMove(): Boolean = js.native
    def getFocusedColumn(): Int = js.native
    def getFocusedRow(): Int = js.native
    def getHeader(): qx.ui.table.pane.Header = js.native
    def getHorizontalScrollBarVisible(): Boolean = js.native
    def getLiveResize(): Boolean = js.native
    def getNeededScrollBars(forceHorizontal: Boolean = ???, preventVertical: Boolean = ???): Int = js.native
    def getPaneClipper(): qx.ui.table.pane.Clipper = js.native
    def getPaneInsetRight(): Int = js.native
    def getResetSelectionOnHeaderTap(): Boolean = js.native
    def getScrollAreaContainer(): qx.ui.table.pane.Clipper = js.native
    def getScrollTimeout(): Int = js.native
    def getScrollX(): Int = js.native
    def getScrollY(): Int = js.native
    def getSelectBeforeFocus(): Boolean = js.native
    def getShowCellFocusIndicator(): Boolean = js.native
    def getTable(): qx.ui.table.Table = js.native
    def getTablePane(): qx.ui.table.pane.Pane = js.native
    def getTablePaneModel(): qx.ui.table.pane.Model = js.native
    def getTopRightWidget(): qx.ui.core.Widget = js.native
    def getVerticalScrollBarVisible(): Boolean = js.native
    def getVerticalScrollBarWidth(): Int = js.native
    def hideColumnMoveFeedback(): Unit = js.native
    protected def initContextMenuFromDataCellsOnly(value: js.Any): Boolean = js.native
    protected def initFocusCellOnPointerMove(value: js.Any): Boolean = js.native
    protected def initHorizontalScrollBarVisible(value: js.Any): Boolean = js.native
    protected def initLiveResize(value: js.Any): Boolean = js.native
    protected def initResetSelectionOnHeaderTap(value: js.Any): Boolean = js.native
    protected def initScrollTimeout(value: js.Any): Int = js.native
    protected def initSelectBeforeFocus(value: js.Any): Boolean = js.native
    protected def initShowCellFocusIndicator(value: js.Any): Boolean = js.native
    protected def initTablePaneModel(value: js.Any): qx.ui.table.pane.Model = js.native
    protected def initVerticalScrollBarVisible(value: js.Any): Boolean = js.native
    def isContextMenuFromDataCellsOnly(): Boolean = js.native
    def isEditing(): js.Dynamic = js.native
    def isFocusCellOnPointerMove(): Boolean = js.native
    def isHorizontalScrollBarVisible(): Boolean = js.native
    def isLiveResize(): Boolean = js.native
    def isResetSelectionOnHeaderTap(): Boolean = js.native
    def isSelectBeforeFocus(): Boolean = js.native
    def isShowCellFocusIndicator(): Boolean = js.native
    def isVerticalScrollBarVisible(): Boolean = js.native
    def onColOrderChanged(): Unit = js.native
    def onColVisibilityChanged(): Unit = js.native
    def onFocusChanged(): Unit = js.native
    def onKeepFirstVisibleRowCompleteChanged(): Unit = js.native
    def onSelectionChanged(): Unit = js.native
    def onTableModelDataChanged(firstRow: Int, lastRow: Int, firstColumn: Int, lastColumn: Int): Unit = js.native
    def onTableModelMetaDataChanged(): Unit = js.native
    def resetContextMenuFromDataCellsOnly(): Unit = js.native
    def resetFocusCellOnPointerMove(): Unit = js.native
    def resetHorizontalScrollBarVisible(): Unit = js.native
    def resetLiveResize(): Unit = js.native
    def resetResetSelectionOnHeaderTap(): Unit = js.native
    def resetScrollTimeout(): Unit = js.native
    def resetSelectBeforeFocus(): Unit = js.native
    def resetShowCellFocusIndicator(): Unit = js.native
    def resetTablePaneModel(): Unit = js.native
    def resetVerticalScrollBarVisible(): Unit = js.native
    def scrollCellVisible(col: Int, row: Int): Unit = js.native
    def setColumnWidth(col: Int, width: Int): Unit = js.native
    def setContextMenuFromDataCellsOnly(value: js.Any): Boolean = js.native
    def setFocusCellOnPointerMove(value: js.Any): Boolean = js.native
    def setFocusedCell(col: Int, row: Int): Unit = js.native
    def setHorizontalScrollBarVisible(value: js.Any): Boolean = js.native
    def setLiveResize(value: js.Any): Boolean = js.native
    def setPaneWidth(width: Int): Unit = js.native
    def setResetSelectionOnHeaderTap(value: js.Any): Boolean = js.native
    def setScrollTimeout(value: js.Any): Int = js.native
    def setScrollX(scrollX: Int): Unit = js.native
    def setScrollY(scrollY: Int, renderSync: Boolean = ???): Unit = js.native
    def setSelectBeforeFocus(value: js.Any): Boolean = js.native
    def setShowCellFocusIndicator(value: js.Any): Boolean = js.native
    def setTablePaneModel(value: js.Any): qx.ui.table.pane.Model = js.native
    def setTopRightWidget(widget: qx.ui.core.Widget): Unit = js.native
    def setVerticalScrollBarVisible(value: js.Any): Boolean = js.native
    def showColumnMoveFeedback(pageX: Int): Int = js.native
    def startEditing(): Boolean = js.native
    def stopEditing(): Unit = js.native
    def toggleContextMenuFromDataCellsOnly(): Boolean = js.native
    def toggleFocusCellOnPointerMove(): Boolean = js.native
    def toggleHorizontalScrollBarVisible(): Boolean = js.native
    def toggleLiveResize(): Boolean = js.native
    def toggleResetSelectionOnHeaderTap(): Boolean = js.native
    def toggleSelectBeforeFocus(): Boolean = js.native
    def toggleShowCellFocusIndicator(): Boolean = js.native
    def toggleVerticalScrollBarVisible(): Boolean = js.native
    def updateHorScrollBarMaximum(): Unit = js.native
    def updateVerScrollBarMaximum(): Unit = js.native

}
}
package qx.ui.table.rowrenderer {
@js.native
@JSName("qx.ui.table.rowrenderer.Default")
class Default extends qx.core.Object with qx.ui.table.IRowRenderer {
    override def createRowStyle(rowInfo: js.Any): Unit = js.native
    override def getRowClass(rowInfo: js.Any): Unit = js.native
    override def getRowHeightStyle(height: Int): Unit = js.native
    override def updateDataRowElement(rowInfo: js.Any, rowElement: HTMLElement): Unit = js.native
    protected def _renderFont(font: qx.bom.Font): Unit = js.native
    def getHighlightFocusRow(): Boolean = js.native
    def getRowAttributes(rowInfo: js.Any): String = js.native
    protected def initHighlightFocusRow(value: js.Any): Boolean = js.native
    def initThemeValues(): Unit = js.native
    def isHighlightFocusRow(): Boolean = js.native
    def resetHighlightFocusRow(): Unit = js.native
    def setHighlightFocusRow(value: js.Any): Boolean = js.native
    def toggleHighlightFocusRow(): Boolean = js.native

}
}
package qx.ui.table.selection {
@js.native
@JSName("qx.ui.table.selection.Manager")
class Manager extends qx.core.Object {
    protected def _handleSelectEvent(index: Int, evt: js.Any): Unit = js.native
    def getSelectionModel(): qx.ui.table.selection.Model = js.native
    def handleMoveKeyDown(index: Int, evt: js.Any): Unit = js.native
    def handleSelectKeyDown(index: Int, evt: js.Any): Unit = js.native
    def handleTap(index: Int, evt: qx.event.`type`.Tap): Unit = js.native
    protected def initSelectionModel(value: js.Any): qx.ui.table.selection.Model = js.native
    def resetSelectionModel(): Unit = js.native
    def setSelectionModel(value: js.Any): qx.ui.table.selection.Model = js.native

}
}
package qx.ui.table.selection {
@js.native
@JSName("qx.ui.table.selection.Model")
class Model extends qx.core.Object {
    protected def _addSelectionInterval(fromIndex: Int, toIndex: Int): Unit = js.native
    protected def _applySelectionMode(selectionMode: js.Any, old: js.Any): Unit = js.native
    protected def _dumpRanges(): Unit = js.native
    protected def _fireChangeSelection(): Unit = js.native
    protected def _getSelectedRangeArr(): js.Array[js.Any] = js.native
    protected def _resetSelection(): Unit = js.native
    protected def _setAnchorSelectionIndex(index: Int): Unit = js.native
    protected def _setLeadSelectionIndex(index: Int): Unit = js.native
    def addSelectionInterval(fromIndex: Int, toIndex: Int): Unit = js.native
    def getAnchorSelectionIndex(): Int = js.native
    def getLeadSelectionIndex(): Int = js.native
    def getSelectedCount(): Int = js.native
    def getSelectedRanges(): js.Array[js.Any] = js.native
    def getSelectionMode(): js.Dynamic = js.native
    def hasBatchMode(): Boolean = js.native
    protected def initSelectionMode(value: js.Any): js.Dynamic = js.native
    def isSelectedIndex(index: Int): Boolean = js.native
    def isSelectionEmpty(): Boolean = js.native
    def iterateSelection(iterator: js.Function, obj: js.Any = ???): Unit = js.native
    def removeSelectionInterval(fromIndex: Int, toIndex: Int): Unit = js.native
    def resetSelection(): Unit = js.native
    def resetSelectionMode(): Unit = js.native
    def setBatchMode(batchMode: Boolean): Boolean = js.native
    def setSelectionInterval(fromIndex: Int, toIndex: Int): Unit = js.native
    def setSelectionMode(value: js.Any): js.Dynamic = js.native

}
}
package qx.ui.tabview {
@js.native
@JSName("qx.ui.tabview.Page")
class Page protected () extends qx.ui.container.Composite {
    def this(label: String = ???, icon: String = ???) = this()
    protected def _applyIcon(value: String, old: String): Unit = js.native
    protected def _applyLabel(value: String, old: String): Unit = js.native
    protected def _applyShowCloseButton(value: Boolean, old: Boolean): Unit = js.native
    protected def _onButtonClose(): Unit = js.native
    def getButton(): qx.ui.form.RadioButton = js.native
    def getIcon(): String = js.native
    def getLabel(): String = js.native
    def getShowCloseButton(): Boolean = js.native
    protected def initIcon(value: js.Any): String = js.native
    protected def initLabel(value: js.Any): String = js.native
    protected def initShowCloseButton(value: js.Any): Boolean = js.native
    def isShowCloseButton(): Boolean = js.native
    def resetIcon(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetShowCloseButton(): Unit = js.native
    def setIcon(value: js.Any): String = js.native
    def setLabel(value: js.Any): String = js.native
    def setShowCloseButton(value: js.Any): Boolean = js.native
    def toggleShowCloseButton(): Boolean = js.native

}
}
package qx.ui.tabview {
@js.native
@JSName("qx.ui.tabview.TabButton")
class TabButton extends qx.ui.form.RadioButton with qx.ui.form.IRadioItem {
    override def getGroup(): qx.ui.form.RadioGroup = js.native
    override def getValue(): Boolean = js.native
    override def setGroup(value: qx.ui.form.RadioGroup): Unit = js.native
    override def setValue(value: Boolean): Unit = js.native
    protected def _applyShowCloseButton(value: Boolean, old: Boolean): Unit = js.native
    protected def _onCloseButtonTap(): Unit = js.native
    def getShowCloseButton(): Boolean = js.native
    protected def initShowCloseButton(value: js.Any): Boolean = js.native
    def isShowCloseButton(): Boolean = js.native
    def resetShowCloseButton(): Unit = js.native
    def setShowCloseButton(value: js.Any): Boolean = js.native
    def toggleShowCloseButton(): Boolean = js.native

}
}
package qx.ui.tabview {
@js.native
@JSName("qx.ui.tabview.TabView")
class TabView protected () extends qx.ui.core.Widget with qx.ui.core.ISingleSelection with qx.ui.core.MContentPadding {
    override def getSelectables(all: Boolean): js.Array[qx.ui.core.Widget] = js.native
    override def getSelection(): js.Array[qx.ui.core.Widget] = js.native
    override def isSelected(item: qx.ui.core.Widget): Boolean = js.native
    override def isSelectionEmpty(): Boolean = js.native
    override def resetSelection(): Unit = js.native
    override def setSelection(items: js.Array[qx.ui.core.Widget]): Unit = js.native
    def this(barPosition: String = ???) = this()
    protected def _applyBarPosition(value: Boolean, old: Boolean): Unit = js.native
    protected def _getContentPaddingTarget(): qx.ui.core.Widget = js.native
    protected def _onBeforeChangeSelection(e: qx.event.`type`.Event): Unit = js.native
    protected def _onChangeSelection(e: qx.event.`type`.Data): Unit = js.native
    protected def _onPageClose(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onRadioChangeSelection(e: qx.event.`type`.Data): Unit = js.native
    def add(page: qx.ui.tabview.Page): Unit = js.native
    def addAt(page: qx.ui.tabview.Page, index: Int = ???): Unit = js.native
    def getBarPosition(): js.Dynamic = js.native
    def getChildren(): js.Array[qx.ui.tabview.Page] = js.native
    def indexOf(page: qx.ui.tabview.Page): Int = js.native
    protected def initBarPosition(value: js.Any): js.Dynamic = js.native
    def remove(page: qx.ui.tabview.Page): Unit = js.native
    def resetBarPosition(): Unit = js.native
    def setBarPosition(value: js.Any): js.Dynamic = js.native

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.Button")
class Button protected () extends qx.ui.form.Button {
    def this(label: js.Any = ???, icon: js.Any = ???, command: js.Any = ???) = this()

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.CheckBox")
class CheckBox protected () extends qx.ui.form.ToggleButton {
    def this(label: js.Any = ???, icon: js.Any = ???) = this()

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.MenuButton")
class MenuButton extends qx.ui.menubar.Button {
    protected def _applyShowArrow(value: Boolean, old: Boolean): Unit = js.native
    def getShowArrow(): Boolean = js.native
    protected def initShowArrow(value: js.Any): Boolean = js.native
    def isShowArrow(): Boolean = js.native
    def resetShowArrow(): Unit = js.native
    def setShowArrow(value: js.Any): Boolean = js.native
    def toggleShowArrow(): Boolean = js.native

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.Part")
class Part extends qx.ui.core.Widget with qx.ui.core.MRemoteChildrenHandling {
    protected def _applySpacing(value: Int, old: Int): Unit = js.native
    def addSeparator(): Unit = js.native
    def getMenuButtons(): qx.data.Array = js.native
    def getShow(): js.Dynamic = js.native
    def getSpacing(): Int = js.native
    protected def initShow(value: js.Any): js.Dynamic = js.native
    protected def initSpacing(value: js.Any): Int = js.native
    def resetShow(): Unit = js.native
    def resetSpacing(): Unit = js.native
    def setShow(value: js.Any): js.Dynamic = js.native
    def setSpacing(value: js.Any): Int = js.native

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.PartContainer")
class PartContainer extends qx.ui.container.Composite {
    def getShow(): js.Dynamic = js.native
    protected def initShow(value: js.Any): js.Dynamic = js.native
    def resetShow(): Unit = js.native
    def setShow(value: js.Any): js.Dynamic = js.native

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.RadioButton")
class RadioButton extends qx.ui.toolbar.CheckBox with qx.ui.form.IModel with qx.ui.form.IRadioItem with qx.ui.form.MModelProperty {
    override def getModel(): js.Dynamic = js.native
    override def resetModel(): Unit = js.native
    override def setModel(value: js.Any): js.Dynamic = js.native
    override def getGroup(): qx.ui.form.RadioGroup = js.native
    override def getValue(): Boolean = js.native
    override def setGroup(value: qx.ui.form.RadioGroup): Unit = js.native
    override def setValue(value: Boolean): Unit = js.native

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.Separator")
class Separator extends qx.ui.core.Widget {

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.SplitButton")
class SplitButton protected () extends qx.ui.form.SplitButton {
    def this(label: js.Any = ???, icon: js.Any = ???, menu: js.Any = ???, command: js.Any = ???) = this()

}
}
package qx.ui.toolbar {
@js.native
@JSName("qx.ui.toolbar.ToolBar")
class ToolBar extends qx.ui.core.Widget with qx.ui.core.MChildrenHandling {
    protected def _applyOverflowHandling(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyOverflowIndicator(value: qx.ui.core.Widget, old: qx.ui.core.Widget): Unit = js.native
    protected def _applyShow(value: js.Any, old: js.Any): Unit = js.native
    protected def _applySpacing(value: Int, old: Int): Unit = js.native
    protected def _getNextToHide(): qx.ui.core.Widget = js.native
    def _isAllowMenuOpenHover(): Boolean = js.native
    protected def _onResize(e: qx.event.`type`.Data): Unit = js.native
    protected def _recalculateOverflow(width: Int = ???, requiredWidth: Int = ???): Unit = js.native
    def _setAllowMenuOpenHover(value: Boolean): Unit = js.native
    def addSeparator(): Unit = js.native
    def addSpacer(): qx.ui.core.Spacer = js.native
    def getMenuButtons(): qx.data.Array = js.native
    def getOpenMenu(): qx.ui.menu.Menu = js.native
    def getOverflowHandling(): Boolean = js.native
    def getOverflowIndicator(): qx.ui.core.Widget = js.native
    def getShow(): js.Dynamic = js.native
    def getSpacing(): Int = js.native
    protected def initOpenMenu(value: js.Any): qx.ui.menu.Menu = js.native
    protected def initOverflowHandling(value: js.Any): Boolean = js.native
    protected def initOverflowIndicator(value: js.Any): qx.ui.core.Widget = js.native
    protected def initShow(value: js.Any): js.Dynamic = js.native
    protected def initSpacing(value: js.Any): Int = js.native
    def isOverflowHandling(): Boolean = js.native
    def resetOpenMenu(): Unit = js.native
    def resetOverflowHandling(): Unit = js.native
    def resetOverflowIndicator(): Unit = js.native
    def resetShow(): Unit = js.native
    def resetSpacing(): Unit = js.native
    def setOpenMenu(value: js.Any): qx.ui.menu.Menu = js.native
    def setOverflowHandling(value: js.Any): Boolean = js.native
    def setOverflowIndicator(value: js.Any): qx.ui.core.Widget = js.native
    def setRemovePriority(item: qx.ui.core.Widget, priority: Int, `override`: Boolean): Unit = js.native
    def setShow(value: js.Any): js.Dynamic = js.native
    def setSpacing(value: js.Any): Int = js.native
    def toggleOverflowHandling(): Boolean = js.native

}
}
package qx.ui.tooltip {
@js.native
@JSName("qx.ui.tooltip.Manager")
class Manager extends qx.core.Object {
    protected def _applyCurrent(value: qx.ui.tooltip.ToolTip, old: qx.ui.tooltip.ToolTip): Unit = js.native
    def getCurrent(): qx.ui.tooltip.ToolTip = js.native
    def getSharedErrorTooltip(): qx.ui.tooltip.ToolTip = js.native
    def getSharedTooltip(): qx.ui.tooltip.ToolTip = js.native
    def getShowInvalidToolTips(): Boolean = js.native
    def getShowToolTips(): Boolean = js.native
    protected def initCurrent(value: js.Any): qx.ui.tooltip.ToolTip = js.native
    protected def initShowInvalidToolTips(value: js.Any): Boolean = js.native
    protected def initShowToolTips(value: js.Any): Boolean = js.native
    def isShowInvalidToolTips(): Boolean = js.native
    def isShowToolTips(): Boolean = js.native
    def resetCurrent(): Unit = js.native
    def resetShowInvalidToolTips(): Unit = js.native
    def resetShowToolTips(): Unit = js.native
    def setCurrent(value: js.Any): qx.ui.tooltip.ToolTip = js.native
    def setShowInvalidToolTips(value: js.Any): Boolean = js.native
    def setShowToolTips(value: js.Any): Boolean = js.native
    def showToolTip(target: js.Any): Unit = js.native
    def toggleShowInvalidToolTips(): Boolean = js.native
    def toggleShowToolTips(): Boolean = js.native

}
@js.native
@JSName("qx.ui.tooltip.Manager")
object Manager extends js.Object {
    def getInstance(): qx.ui.tooltip.Manager = js.native

}
}
package qx.ui.tooltip {
@js.native
@JSName("qx.ui.tooltip.ToolTip")
class ToolTip protected () extends qx.ui.popup.Popup {
    def this(label: String = ???, icon: String = ???) = this()
    protected def _applyArrowPosition(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyIcon(value: String, old: String): Unit = js.native
    protected def _applyLabel(value: String, old: String): Unit = js.native
    protected def _applyRich(value: Boolean, old: Boolean): Unit = js.native
    protected def _onPointerOver(e: qx.event.`type`.Pointer): Unit = js.native
    def getArrowPosition(): js.Dynamic = js.native
    def getHideTimeout(): Int = js.native
    def getIcon(): String = js.native
    def getLabel(): String = js.native
    def getOpener(): qx.ui.core.Widget = js.native
    def getRich(): Boolean = js.native
    def getShowTimeout(): Int = js.native
    protected def initArrowPosition(value: js.Any): js.Dynamic = js.native
    protected def initHideTimeout(value: js.Any): Int = js.native
    protected def initIcon(value: js.Any): String = js.native
    protected def initLabel(value: js.Any): String = js.native
    protected def initOpener(value: js.Any): qx.ui.core.Widget = js.native
    protected def initRich(value: js.Any): Boolean = js.native
    protected def initShowTimeout(value: js.Any): Int = js.native
    def isRich(): Boolean = js.native
    def resetArrowPosition(): Unit = js.native
    def resetHideTimeout(): Unit = js.native
    def resetIcon(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetOpener(): Unit = js.native
    def resetRich(): Unit = js.native
    def resetShowTimeout(): Unit = js.native
    def setArrowPosition(value: js.Any): js.Dynamic = js.native
    def setHideTimeout(value: js.Any): Int = js.native
    def setIcon(value: js.Any): String = js.native
    def setLabel(value: js.Any): String = js.native
    def setOpener(value: js.Any): qx.ui.core.Widget = js.native
    def setRich(value: js.Any): Boolean = js.native
    def setShowTimeout(value: js.Any): Int = js.native
    def toggleRich(): Boolean = js.native

}
}
package qx.ui.tree {
@js.native
@JSName("qx.ui.tree.Tree")
class Tree extends qx.ui.core.scroll.AbstractScrollArea with qx.ui.core.IMultiSelection with qx.ui.form.IModelSelection with qx.ui.form.IForm with qx.ui.core.MMultiSelectionHandling with qx.ui.core.MContentPadding with qx.ui.form.MModelSelection with qx.ui.form.MForm {
    override def addToSelection(item: qx.ui.core.Widget): Unit = js.native
    override def removeFromSelection(item: qx.ui.core.Widget): Unit = js.native
    override def selectAll(): Unit = js.native
    override def getModelSelection(): qx.data.Array = js.native
    override def setModelSelection(value: qx.data.Array): Unit = js.native
    override def getEnabled(): Boolean = js.native
    override def getInvalidMessage(): String = js.native
    override def getRequired(): Boolean = js.native
    override def getRequiredInvalidMessage(): String = js.native
    override def getValid(): Boolean = js.native
    override def setEnabled(enabled: Boolean): Unit = js.native
    override def setInvalidMessage(message: String): Unit = js.native
    override def setRequired(required: Boolean): Unit = js.native
    override def setRequiredInvalidMessage(message: String): Unit = js.native
    override def setValid(valid: Boolean): Unit = js.native
    protected def _applyHideRoot(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyOpenMode(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyRoot(value: qx.ui.tree.core.AbstractTreeItem, old: qx.ui.tree.core.AbstractTreeItem): Unit = js.native
    protected def _applyRootOpenClose(value: Boolean, old: Boolean): Unit = js.native
    protected def _getContentPaddingTarget(): qx.ui.core.Widget = js.native
    protected def _onChangeSelection(e: qx.event.`type`.Data): Unit = js.native
    protected def _onKeyPress(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onOpen(e: qx.event.`type`.Pointer): Unit = js.native
    def getChildren(): js.Array[qx.ui.tree.core.AbstractTreeItem] = js.native
    def getHideRoot(): Boolean = js.native
    def getItems(recursive: Boolean = ???, invisible: Boolean = ???): js.Array[qx.ui.tree.core.AbstractTreeItem] = js.native
    def getNextNodeOf(treeItem: qx.ui.tree.core.AbstractTreeItem, invisible: Boolean = ???): qx.ui.tree.core.AbstractTreeItem = js.native
    def getNextSiblingOf(treeItem: qx.ui.tree.core.AbstractTreeItem): qx.ui.tree.core.AbstractTreeItem = js.native
    def getOpenMode(): js.Dynamic = js.native
    def getPreviousNodeOf(treeItem: qx.ui.tree.core.AbstractTreeItem, invisible: Boolean = ???): qx.ui.tree.core.AbstractTreeItem = js.native
    def getPreviousSiblingOf(treeItem: qx.ui.tree.core.AbstractTreeItem): qx.ui.tree.core.AbstractTreeItem = js.native
    def getRoot(): qx.ui.tree.core.AbstractTreeItem = js.native
    def getRootOpenClose(): Boolean = js.native
    def getTreeItem(widget: qx.ui.core.Widget): qx.ui.tree.core.AbstractTreeItem = js.native
    protected def initHideRoot(value: js.Any): Boolean = js.native
    protected def initOpenMode(value: js.Any): js.Dynamic = js.native
    protected def initRoot(value: js.Any): qx.ui.tree.core.AbstractTreeItem = js.native
    protected def initRootOpenClose(value: js.Any): Boolean = js.native
    def isHideRoot(): Boolean = js.native
    def isRootOpenClose(): Boolean = js.native
    def resetHideRoot(): Unit = js.native
    def resetOpenMode(): Unit = js.native
    def resetRoot(): Unit = js.native
    def resetRootOpenClose(): Unit = js.native
    def setHideRoot(value: js.Any): Boolean = js.native
    def setOpenMode(value: js.Any): js.Dynamic = js.native
    def setRoot(value: js.Any): qx.ui.tree.core.AbstractTreeItem = js.native
    def setRootOpenClose(value: js.Any): Boolean = js.native
    def toggleHideRoot(): Boolean = js.native
    def toggleRootOpenClose(): Boolean = js.native

}
}
package qx.ui.tree {
@js.native
@JSName("qx.ui.tree.TreeFile")
class TreeFile extends qx.ui.tree.core.AbstractTreeItem {

}
}
package qx.ui.tree {
@js.native
@JSName("qx.ui.tree.TreeFolder")
class TreeFolder extends qx.ui.tree.core.AbstractTreeItem {

}
}
package qx.ui.tree {
@js.native
@JSName("qx.ui.tree.VirtualTree")
class VirtualTree protected () extends qx.ui.virtual.core.Scroller with qx.ui.tree.core.IVirtualTree with qx.data.controller.ISelection with qx.ui.virtual.selection.MModel with qx.ui.core.MContentPadding {
    override def closeNode(node: qx.core.Object): Unit = js.native
    override def closeNodeWithoutScrolling(node: qx.core.Object): Unit = js.native
    override def getLevel(row: Int): Int = js.native
    override def getLookupTable(): qx.data.Array = js.native
    override def getSelection(): qx.data.Array = js.native
    override def hasChildren(node: qx.core.Object): Boolean = js.native
    override def isNode(item: qx.core.Object): Boolean = js.native
    override def isNodeOpen(node: qx.core.Object): Boolean = js.native
    override def isShowTopLevelOpenCloseIcons(): Boolean = js.native
    override def openNode(node: qx.core.Object): Unit = js.native
    override def openNodeWithoutScrolling(node: qx.core.Object): Unit = js.native
    override def resetSelection(): Unit = js.native
    override def setSelection(value: qx.data.IListData): Unit = js.native
    def this(model: qx.core.Object = ???, labelPath: String = ???, childProperty: String = ???) = this()
    protected def _afterApplySelection(): Unit = js.native
    protected def _applyChildProperty(value: String, old: String): Unit = js.native
    protected def _applyDelegate(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyHideRoot(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyIconOptions(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyIconPath(value: String, old: String): Unit = js.native
    protected def _applyLabelOptions(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyLabelPath(value: String, old: String): Unit = js.native
    protected def _applyModel(value: qx.core.Object, old: qx.core.Object): Unit = js.native
    protected def _applyOpenMode(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyRowHeight(value: Int, old: Int): Unit = js.native
    protected def _applyShowLeafs(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyShowTopLevelOpenCloseIcons(value: Boolean, old: Boolean): Unit = js.native
    protected def _beforeApplySelection(newSelection: qx.data.Array): Unit = js.native
    protected def _getContentPaddingTarget(): qx.ui.core.Widget = js.native
    protected def _getDataFromRow(row: Int): js.Dynamic = js.native
    protected def _getSelectables(): qx.data.Array = js.native
    protected def _init(): Unit = js.native
    protected def _initLayer(): Unit = js.native
    protected def _onChangeBubble(event: qx.event.`type`.Data): Unit = js.native
    protected def _onKeyPress(e: qx.event.`type`.KeySequence): Unit = js.native
    protected def _onOpen(event: qx.ui.virtual.core.CellEvent): Unit = js.native
    protected def _onUpdated(event: qx.event.`type`.Event): Unit = js.native
    protected def _reverseLookup(index: Long): Long = js.native
    def buildLookupTable(): Unit = js.native
    def getChildProperty(): String = js.native
    def getDelegate(): js.Dynamic = js.native
    def getHideRoot(): Boolean = js.native
    def getIconOptions(): js.Dynamic = js.native
    def getIconPath(): String = js.native
    def getItemHeight(): Int = js.native
    def getLabelOptions(): js.Dynamic = js.native
    def getLabelPath(): String = js.native
    def getModel(): qx.core.Object = js.native
    def getOpenMode(): js.Dynamic = js.native
    def getOpenNodes(): qx.data.Array = js.native
    def getParent(item: qx.core.Object): qx.core.Object = js.native
    def getShowLeafs(): Boolean = js.native
    def getShowTopLevelOpenCloseIcons(): Boolean = js.native
    protected def initChildProperty(value: js.Any): String = js.native
    protected def initDelegate(value: js.Any): js.Dynamic = js.native
    protected def initHideRoot(value: js.Any): Boolean = js.native
    protected def initIconOptions(value: js.Any): js.Dynamic = js.native
    protected def initIconPath(value: js.Any): String = js.native
    protected def initItemHeight(value: js.Any): Int = js.native
    protected def initLabelOptions(value: js.Any): js.Dynamic = js.native
    protected def initLabelPath(value: js.Any): String = js.native
    protected def initModel(value: js.Any): qx.core.Object = js.native
    protected def initOpenMode(value: js.Any): js.Dynamic = js.native
    protected def initShowLeafs(value: js.Any): Boolean = js.native
    protected def initShowTopLevelOpenCloseIcons(value: js.Any): Boolean = js.native
    def isHideRoot(): Boolean = js.native
    def isShowLeafs(): Boolean = js.native
    def openNodeAndParents(node: qx.core.Object): Unit = js.native
    def refresh(): Unit = js.native
    def resetChildProperty(): Unit = js.native
    def resetDelegate(): Unit = js.native
    def resetHideRoot(): Unit = js.native
    def resetIconOptions(): Unit = js.native
    def resetIconPath(): Unit = js.native
    def resetItemHeight(): Unit = js.native
    def resetLabelOptions(): Unit = js.native
    def resetLabelPath(): Unit = js.native
    def resetModel(): Unit = js.native
    def resetOpenMode(): Unit = js.native
    def resetShowLeafs(): Unit = js.native
    def resetShowTopLevelOpenCloseIcons(): Unit = js.native
    def setChildProperty(value: js.Any): String = js.native
    def setDelegate(value: js.Any): js.Dynamic = js.native
    def setHideRoot(value: js.Any): Boolean = js.native
    def setIconOptions(value: js.Any): js.Dynamic = js.native
    def setIconPath(value: js.Any): String = js.native
    def setItemHeight(value: js.Any): Int = js.native
    def setLabelOptions(value: js.Any): js.Dynamic = js.native
    def setLabelPath(value: js.Any): String = js.native
    def setModel(value: js.Any): qx.core.Object = js.native
    def setOpenMode(value: js.Any): js.Dynamic = js.native
    def setShowLeafs(value: js.Any): Boolean = js.native
    def setShowTopLevelOpenCloseIcons(value: js.Any): Boolean = js.native
    def toggleHideRoot(): Boolean = js.native
    def toggleShowLeafs(): Boolean = js.native
    def toggleShowTopLevelOpenCloseIcons(): Boolean = js.native

}
}
package qx.ui.tree {
@js.native
@JSName("qx.ui.tree.VirtualTreeItem")
class VirtualTreeItem extends qx.ui.tree.core.AbstractItem {
	override protected def _applyModel(value: js.Any, old: js.Any): Unit = js.native
    protected def _onChangeChildProperty(e: qx.event.`type`.Data): Unit = js.native
    protected def _onChangeLength(): Unit = js.native

}
}
package qx.ui.tree.core {
@js.native
@JSName("qx.ui.tree.core.AbstractItem")
class AbstractItem protected () extends qx.ui.core.Widget with qx.ui.form.IModel with qx.ui.form.MModelProperty {
    override def getModel(): js.Dynamic = js.native
    override def resetModel(): Unit = js.native
    override def setModel(value: js.Any): js.Dynamic = js.native
    def this(label: String = ???) = this()
    protected def _addWidgets(): Unit = js.native
    protected def _applyIcon(value: String, old: String): Unit = js.native
    protected def _applyIconOpened(value: String, old: String): Unit = js.native
    protected def _applyIndent(value: Int, old: Int): Unit = js.native
    protected def _applyLabel(value: String, old: String): Unit = js.native
    protected def _applyOpen(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyOpenSymbolMode(value: js.Any, old: js.Any): Unit = js.native
    protected def _onChangeOpen(e: qx.event.`type`.Data): Unit = js.native
    protected def _shouldShowOpenSymbol(): Boolean = js.native
    protected def _updateIndent(): Unit = js.native
    def addIcon(): Unit = js.native
    def addLabel(text: String = ???): Unit = js.native
    def addOpenButton(): Unit = js.native
    def addSpacer(): Unit = js.native
    def addWidget(widget: qx.ui.core.Widget, options: js.Any = ???): Unit = js.native
    def getIcon(): String = js.native
    def getIconOpened(): String = js.native
    def getIndent(): Int = js.native
    def getLabel(): String = js.native
    def getLevel(): Int = js.native
    def getOpen(): Boolean = js.native
    def getOpenSymbolMode(): js.Dynamic = js.native
    def hasChildren(): Boolean = js.native
    protected def initIcon(value: js.Any): String = js.native
    protected def initIconOpened(value: js.Any): String = js.native
    protected def initIndent(value: js.Any): Int = js.native
    protected def initLabel(value: js.Any): String = js.native
    protected def initOpen(value: js.Any): Boolean = js.native
    protected def initOpenSymbolMode(value: js.Any): js.Dynamic = js.native
    def isOpen(): Boolean = js.native
    def isOpenable(): Boolean = js.native
    def resetIcon(): Unit = js.native
    def resetIconOpened(): Unit = js.native
    def resetIndent(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetOpen(): Unit = js.native
    def resetOpenSymbolMode(): Unit = js.native
    def setIcon(value: js.Any): String = js.native
    def setIconOpened(value: js.Any): String = js.native
    def setIndent(value: js.Any): Int = js.native
    def setLabel(value: js.Any): String = js.native
    def setOpen(value: js.Any): Boolean = js.native
    def setOpenSymbolMode(value: js.Any): js.Dynamic = js.native
    def toggleOpen(): Boolean = js.native

}
}
package qx.ui.tree.core {
@js.native
@JSName("qx.ui.tree.core.AbstractTreeItem")
class AbstractTreeItem protected () extends qx.ui.tree.core.AbstractItem {
    def this(label: js.Any = ???) = this()
    def add(varargs: qx.ui.tree.core.AbstractTreeItem = ???): Unit = js.native
    def addAfter(treeItem: qx.ui.tree.core.AbstractTreeItem, after: qx.ui.tree.core.AbstractTreeItem): Unit = js.native
    def addAt(treeItem: qx.ui.tree.core.AbstractTreeItem, index: Int): Unit = js.native
    def addAtBegin(treeItem: qx.ui.tree.core.AbstractTreeItem): Unit = js.native
    def addBefore(treeItem: qx.ui.tree.core.AbstractTreeItem, before: qx.ui.tree.core.AbstractTreeItem): Unit = js.native
    def getChildren(): js.Array[qx.ui.tree.core.AbstractTreeItem] = js.native
    def getItems(recursive: Boolean = ???, invisible: Boolean = ???, ignoreFirst: Boolean = ???): js.Array[qx.ui.tree.core.AbstractTreeItem] = js.native
    def getParent(): qx.ui.tree.core.AbstractTreeItem = js.native
    def getParentChildrenContainer(): qx.ui.core.Widget = js.native
    def getTree(): qx.ui.tree.Tree = js.native
    def hasChildrenContainer(): Boolean = js.native
    protected def initParent(value: js.Any): qx.ui.tree.core.AbstractTreeItem = js.native
    def recursiveAddToWidgetQueue(): Unit = js.native
    def remove(varargs: qx.ui.tree.core.AbstractTreeItem = ???): Unit = js.native
    def removeAll(): Unit = js.native
    def removeAt(index: Int): Unit = js.native
    def resetParent(): Unit = js.native
    def setParent(value: js.Any): qx.ui.tree.core.AbstractTreeItem = js.native

}
}
package qx.ui.tree.core {
@js.native
@JSName("qx.ui.tree.core.FolderOpenButton")
class FolderOpenButton extends qx.ui.basic.Image with qx.ui.core.MExecutable {
    protected def _applyOpen(value: Boolean, old: Boolean): Unit = js.native
    protected def _onTap(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _stopPropagation(e: qx.event.`type`.Event): Unit = js.native
    def getOpen(): Boolean = js.native
    protected def initOpen(value: js.Any): Boolean = js.native
    def isOpen(): Boolean = js.native
    def resetOpen(): Unit = js.native
    def setOpen(value: js.Any): Boolean = js.native
    def toggleOpen(): Boolean = js.native

}
}
package qx.ui.tree.core {
@js.native
trait IVirtualTree extends js.Object {
    def closeNode(node: qx.core.Object): Unit = js.native
    def closeNodeWithoutScrolling(node: qx.core.Object): Unit = js.native
    def getLevel(row: Int): Int = js.native
    def getLookupTable(): qx.data.Array = js.native
    def getSelection(): qx.data.Array = js.native
    def hasChildren(node: qx.core.Object): Boolean = js.native
    def isNode(item: qx.core.Object): Boolean = js.native
    def isNodeOpen(node: qx.core.Object): Boolean = js.native
    def isShowTopLevelOpenCloseIcons(): Boolean = js.native
    def openNode(node: qx.core.Object): Unit = js.native
    def openNodeWithoutScrolling(node: qx.core.Object): Unit = js.native

}
}
package qx.ui.tree.core {
@js.native
trait IVirtualTreeDelegate extends js.Object {
    def bindItem(controller: qx.ui.list.core.MWidgetController, item: qx.ui.core.Widget, id: Int): Unit = js.native
    def configureItem(item: qx.ui.core.Widget): Unit = js.native
    def createItem(): qx.ui.core.Widget = js.native
    def filter(data: js.Any): Boolean = js.native
    def onPool(item: qx.ui.core.Widget): Unit = js.native
    def sorter(a: js.Any, b: js.Any): Int = js.native

}
}
package qx.ui.tree.core {
@js.native
@JSName("qx.ui.tree.core.MWidgetController")
trait MWidgetController extends js.Object {
    protected def _bindItem(item: qx.ui.core.Widget, index: Int): Unit = js.native
    protected def _removeBindingsFrom(item: qx.ui.core.Widget): Unit = js.native
    def bindDefaultProperties(item: qx.ui.core.Widget, index: Int): Unit = js.native
    def bindProperty(sourcePath: String, targetProperty: String, options: js.Any, targetWidget: qx.ui.core.Widget, index: Int): Unit = js.native
    def bindPropertyReverse(targetPath: String, sourceProperty: String, options: js.Any, sourceWidget: qx.ui.core.Widget, index: Int): Unit = js.native
    def getChildProperty(): String = js.native
    def getDelegate(): js.Dynamic = js.native
    def getIconOptions(): js.Dynamic = js.native
    def getIconPath(): String = js.native
    def getLabelOptions(): js.Dynamic = js.native
    def getLabelPath(): String = js.native
    protected def initChildProperty(value: js.Any): String = js.native
    protected def initDelegate(value: js.Any): js.Dynamic = js.native
    protected def initIconOptions(value: js.Any): js.Dynamic = js.native
    protected def initIconPath(value: js.Any): String = js.native
    protected def initLabelOptions(value: js.Any): js.Dynamic = js.native
    protected def initLabelPath(value: js.Any): String = js.native
    def removeBindings(): Unit = js.native
    def resetChildProperty(): Unit = js.native
    def resetDelegate(): Unit = js.native
    def resetIconOptions(): Unit = js.native
    def resetIconPath(): Unit = js.native
    def resetLabelOptions(): Unit = js.native
    def resetLabelPath(): Unit = js.native
    def setChildProperty(value: js.Any): String = js.native
    def setDelegate(value: js.Any): js.Dynamic = js.native
    def setIconOptions(value: js.Any): js.Dynamic = js.native
    def setIconPath(value: js.Any): String = js.native
    def setLabelOptions(value: js.Any): js.Dynamic = js.native
    def setLabelPath(value: js.Any): String = js.native

}
}
package qx.ui.tree.core {
@js.native
@JSName("qx.ui.tree.core.Util")
class Util extends js.Object {

}
@js.native
@JSName("qx.ui.tree.core.Util")
object Util extends js.Object {
    def hasChildren(node: qx.core.Object, childProperty: String, ignoreLeafs: Boolean = ???): Boolean = js.native
    def isNode(node: qx.core.Object, childProperty: String): Boolean = js.native

}
}
package qx.ui.tree.provider {
@js.native
trait IVirtualTreeProvider extends js.Object {
    def createLayer(): qx.ui.virtual.layer.Abstract = js.native
    def createRenderer(): js.Dynamic = js.native
    def isSelectable(row: Int): Boolean = js.native
    def setChildProperty(value: String): Unit = js.native
    def setLabelPath(value: String): Unit = js.native
    def styleSelectabled(row: Int): Unit = js.native
    def styleUnselectabled(row: Int): Unit = js.native

}
}
package qx.ui.tree.provider {
@js.native
@JSName("qx.ui.tree.provider.WidgetProvider")
class WidgetProvider protected () extends qx.core.Object with qx.ui.virtual.core.IWidgetCellProvider with qx.ui.tree.provider.IVirtualTreeProvider with qx.ui.tree.core.MWidgetController {
    override def getCellWidget(row: Int, column: Int): qx.ui.core.LayoutItem = js.native
    override def poolCellWidget(widget: qx.ui.core.LayoutItem): Unit = js.native
    override def createLayer(): qx.ui.virtual.layer.Abstract = js.native
    override def createRenderer(): js.Dynamic = js.native
    override def isSelectable(row: Int): Boolean = js.native
    override def setChildProperty(value: String): Unit = js.native
    override def setLabelPath(value: String): Unit = js.native
    override def styleSelectabled(row: Int): Unit = js.native
    override def styleUnselectabled(row: Int): Unit = js.native
    def this(tree: qx.ui.tree.VirtualTree = ???) = this()
    protected def _onChangeDelegate(event: qx.event.`type`.Data): Unit = js.native
    protected def _onItemCreated(event: qx.event.`type`.Data): Unit = js.native
    protected def _onPool(item: qx.ui.core.Widget): Unit = js.native
    protected def _styleSelectabled(widget: qx.ui.core.Widget): Unit = js.native
    protected def _styleUnselectabled(widget: qx.ui.core.Widget): Unit = js.native

}
}
package qx.ui.tree.selection {
@js.native
@JSName("qx.ui.tree.selection.SelectionManager")
class SelectionManager extends qx.ui.core.selection.ScrollArea {

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.DefaultDataCellRenderer")
class DefaultDataCellRenderer extends qx.ui.table.cellrenderer.Default {

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.MFamily")
trait MFamily extends js.Object {
    def familyGetFirstChild(nodeReference: js.Any): Int = js.native
    def familyGetLastChild(nodeReference: js.Any): Int = js.native
    def familyGetNextSibling(nodeReference: js.Any): Int = js.native
    def familyGetPrevSibling(nodeReference: js.Any): Int = js.native

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.MNode")
trait MNode extends js.Object {
    def nodeGet(nodeReference: js.Any): js.Dynamic = js.native
    def nodeGetCellStyle(nodeReference: js.Any): String = js.native
    def nodeGetHideOpenClose(nodeReference: js.Any): Boolean = js.native
    def nodeGetIcon(nodeReference: js.Any): String = js.native
    def nodeGetLabel(nodeReference: js.Any): String = js.native
    def nodeGetLabelStyle(nodeReference: js.Any): String = js.native
    def nodeGetOpened(nodeReference: js.Any): Boolean = js.native
    def nodeGetSelected(nodeReference: js.Any): Boolean = js.native
    def nodeGetSelectedIcon(nodeReference: js.Any): String = js.native
    def nodeSetCellStyle(nodeReference: js.Any, style: String): Unit = js.native
    def nodeSetHideOpenClose(nodeReference: js.Any, b: Boolean): Unit = js.native
    def nodeSetIcon(nodeReference: js.Any, path: String): Unit = js.native
    def nodeSetLabel(nodeReference: js.Any, label: String): Unit = js.native
    def nodeSetLabelStyle(nodeReference: js.Any, style: String): Unit = js.native
    def nodeSetOpened(nodeReference: js.Any, b: Boolean): Unit = js.native
    def nodeSetSelected(nodeReference: js.Any, b: Boolean): Unit = js.native
    def nodeSetSelectedIcon(nodeReference: js.Any, path: String): Unit = js.native
    def nodeSetState(nodeReference: js.Any, attributes: js.Any): Unit = js.native
    def nodeToggleOpened(nodeReference: js.Any): Unit = js.native

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.MTreePrimitive")
trait MTreePrimitive extends js.Object {

}
@js.native
@JSName("qx.ui.treevirtual.MTreePrimitive")
object MTreePrimitive extends js.Object {
    protected def _addNode(nodeArr: qx.data.Array, parentNodeId: Int, label: String, bOpened: Boolean, bHideOpenCloseButton: Boolean, `type`: Int, icon: String, iconSelected: String, nodeId: Int = ???): Int = js.native
    protected def _getEmptyTree(): js.Dynamic = js.native

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.SelectionManager")
class SelectionManager protected () extends qx.ui.table.selection.Manager {
    def this(table: qx.ui.table.Table = ???) = this()
    protected def _handleExtendedClick(tree: qx.ui.treevirtual.TreeVirtual, evt: js.Any, node: js.Any, left: Int): Boolean = js.native
    def getTable(): qx.ui.table.Table = js.native

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.SimpleTreeDataCellRenderer")
class SimpleTreeDataCellRenderer extends qx.ui.table.cellrenderer.Abstract {
    protected def _addExtraContentBeforeIcon(cellInfo: js.Any, pos: Int): js.Dynamic = js.native
    protected def _addExtraContentBeforeIndentation(cellInfo: js.Any, pos: Int): js.Dynamic = js.native
    protected def _addExtraContentBeforeLabel(cellInfo: js.Any, pos: Int): js.Dynamic = js.native
    protected def _addIcon(cellInfo: js.Any, pos: Int): js.Dynamic = js.native
    protected def _addImage(imageInfo: js.Any): String = js.native
    protected def _addIndentation(cellInfo: js.Any, pos: Int): js.Dynamic = js.native
    protected def _addLabel(cellInfo: js.Any, pos: Int): String = js.native
    protected def _getIndentSymbol(column: Int, node: Node, bUseTreeLines: Boolean, bAlwaysShowOpenCloseSymbol: Boolean, bExcludeFirstLevelTreeLines: Boolean): js.Dynamic = js.native
    def getAlwaysShowOpenCloseSymbol(): Boolean = js.native
    def getExcludeFirstLevelTreeLines(): Boolean = js.native
    def getUseTreeLines(): Boolean = js.native
    protected def initAlwaysShowOpenCloseSymbol(value: js.Any): Boolean = js.native
    protected def initExcludeFirstLevelTreeLines(value: js.Any): Boolean = js.native
    protected def initUseTreeLines(value: js.Any): Boolean = js.native
    def isAlwaysShowOpenCloseSymbol(): Boolean = js.native
    def isExcludeFirstLevelTreeLines(): Boolean = js.native
    def isUseTreeLines(): Boolean = js.native
    def resetAlwaysShowOpenCloseSymbol(): Unit = js.native
    def resetExcludeFirstLevelTreeLines(): Unit = js.native
    def resetUseTreeLines(): Unit = js.native
    def setAlwaysShowOpenCloseSymbol(value: js.Any): Boolean = js.native
    def setExcludeFirstLevelTreeLines(value: js.Any): Boolean = js.native
    def setUseTreeLines(value: js.Any): Boolean = js.native
    def toggleAlwaysShowOpenCloseSymbol(): Boolean = js.native
    def toggleExcludeFirstLevelTreeLines(): Boolean = js.native
    def toggleUseTreeLines(): Boolean = js.native

}
@js.native
@JSName("qx.ui.treevirtual.SimpleTreeDataCellRenderer")
object SimpleTreeDataCellRenderer extends js.Object {

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.SimpleTreeDataModel")
class SimpleTreeDataModel extends qx.ui.table.model.Abstract with qx.ui.treevirtual.MTreePrimitive {
    protected def _applyFilter(value: js.Function, old: js.Function): Unit = js.native
    protected def _clearSelections(): Unit = js.native
    def addBranch(parentNodeId: Int, label: String, bOpened: Boolean, bHideOpenCloseButton: Boolean, icon: String, iconSelected: String): Int = js.native
    def addLeaf(parentNodeId: Int, label: String, icon: String, iconSelected: String): Int = js.native
    def clearData(): Unit = js.native
    def getColumnData(nodeId: Int, columnIndex: Int): js.Dynamic = js.native
    def getData(): qx.data.Array = js.native
    def getFilter(): js.Function = js.native
    def getNode(rowIndex: Int): js.Dynamic = js.native
    def getNodeFromRow(rowIndex: Int): js.Dynamic = js.native
    def getNodeRowMap(): qx.data.Array = js.native
    def getRowFromNodeId(nodeId: Int): Int = js.native
    def getSelectedNodes(): qx.data.Array = js.native
    def getTree(): qx.ui.treevirtual.TreeVirtual = js.native
    def getTreeColumn(): Int = js.native
    protected def initFilter(value: js.Any): js.Function = js.native
    def move(moveNodeReference: js.Any, parentNodeReference: js.Any): Unit = js.native
    def prune(nodeReference: js.Any, bSelfAlso: Boolean): Unit = js.native
    def resetFilter(): Unit = js.native
    def setColumnData(nodeId: Int, columnIndex: Int, data: js.Any): Unit = js.native
    def setColumnEditable(columnIndex: Int, editable: Boolean): Unit = js.native
    def setData(nodeArr: qx.data.Array): Unit = js.native
    def setEditable(editable: Boolean): Unit = js.native
    def setFilter(value: js.Any): js.Function = js.native
    def setState(nodeReference: js.Any, attributes: js.Any): Unit = js.native
    def setTree(tree: qx.ui.treevirtual.TreeVirtual): Unit = js.native
    def setTreeColumn(columnIndex: Int): Unit = js.native

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.SimpleTreeDataRowRenderer")
class SimpleTreeDataRowRenderer extends qx.ui.table.rowrenderer.Default {

}
}
package qx.ui.treevirtual {
@js.native
@JSName("qx.ui.treevirtual.TreeVirtual")
class TreeVirtual protected () extends qx.ui.table.Table {
    def this(headings: qx.data.Array = ???, custom: js.Any = ???) = this()
    protected def _calculateSelectedNodes(): qx.data.Array = js.native
    def getAlwaysShowOpenCloseSymbol(): Boolean = js.native
    def getDataModel(): qx.ui.table.ITableModel = js.native
    def getExcludeFirstLevelTreeLines(): Boolean = js.native
    def getHierarchy(nodeReference: js.Any): qx.data.Array = js.native
    def getOpenCloseClickSelectsRow(): Boolean = js.native
    def getSelectedNodes(): qx.data.Array = js.native
    def getSelectionMode(): Int = js.native
    def getUseTreeLines(): Boolean = js.native
    protected def initOpenCloseClickSelectsRow(value: js.Any): Boolean = js.native
    def isOpenCloseClickSelectsRow(): Boolean = js.native
    def resetOpenCloseClickSelectsRow(): Unit = js.native
    def setAlwaysShowOpenCloseSymbol(b: Boolean): Unit = js.native
    def setExcludeFirstLevelTreeLines(b: Boolean): Unit = js.native
    def setOpenCloseClickSelectsRow(value: js.Any): Boolean = js.native
    def setOverflow(s: String): Unit = js.native
    def setSelectionMode(mode: Int): Unit = js.native
    def setUseTreeLines(b: Boolean): Unit = js.native
    def toggleOpenCloseClickSelectsRow(): Boolean = js.native

}
}
package qx.ui.virtual.behavior {
@js.native
@JSName("qx.ui.virtual.behavior.Prefetch")
class Prefetch protected () extends qx.core.Object {
    def this(scroller: qx.ui.virtual.core.Scroller = ???, settings: js.Any = ???) = this()
    protected def _applyInterval(value: Int, old: Int): Unit = js.native
    protected def _applyScroller(value: qx.ui.virtual.core.Scroller, old: qx.ui.virtual.core.Scroller): Unit = js.native
    protected def _onInterval(): Unit = js.native
    def getInterval(): Int = js.native
    def getScroller(): qx.ui.virtual.core.Scroller = js.native
    protected def initInterval(value: js.Any): Int = js.native
    protected def initScroller(value: js.Any): qx.ui.virtual.core.Scroller = js.native
    def resetInterval(): Unit = js.native
    def resetScroller(): Unit = js.native
    def setInterval(value: js.Any): Int = js.native
    def setPrefetchX(minLeft: Int, maxLeft: Int, minRight: Int, maxRight: Int): Unit = js.native
    def setPrefetchY(minAbove: Int, maxAbove: Int, minBelow: Int, maxBelow: Int): Unit = js.native
    def setScroller(value: js.Any): qx.ui.virtual.core.Scroller = js.native

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.Abstract")
class Abstract extends qx.core.Object with qx.ui.virtual.cell.ICell {
    override def getCellProperties(data: js.Any, states: js.Any): js.Dynamic = js.native
    def getAttributes(value: js.Any, states: js.Any): String = js.native
    def getContent(value: js.Any, states: js.Any): String = js.native
    def getCssClasses(value: js.Any, states: js.Any): String = js.native
    def getInsets(value: js.Any, states: js.Any): js.Array[Int] = js.native
    def getStyles(value: js.Any, states: js.Any): String = js.native

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.AbstractImage")
class AbstractImage extends qx.ui.virtual.cell.Cell {
    protected def _identifyImage(value: js.Any): js.Dynamic = js.native

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.AbstractWidget")
class AbstractWidget extends qx.core.Object with qx.ui.virtual.cell.IWidgetCell {
    override def getCellWidget(data: js.Any, states: js.Any): qx.ui.core.LayoutItem = js.native
    override def pool(widget: qx.ui.core.LayoutItem): Unit = js.native
    override def updateData(widget: qx.ui.core.LayoutItem, data: js.Any): Unit = js.native
    override def updateStates(widget: qx.ui.core.LayoutItem, states: js.Any): Unit = js.native
    protected def _cleanupPool(): Unit = js.native
    protected def _createWidget(): qx.ui.core.LayoutItem = js.native

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.Boolean")
class Boolean extends qx.ui.virtual.cell.AbstractImage {
    protected def _applyIconFalse(value: String, old: String): Unit = js.native
    protected def _applyIconTrue(value: String, old: String): Unit = js.native
    def getIconFalse(): String = js.native
    def getIconTrue(): String = js.native
    protected def initIconFalse(value: js.Any): String = js.native
    protected def initIconTrue(value: js.Any): String = js.native
    def resetIconFalse(): Unit = js.native
    def resetIconTrue(): Unit = js.native
    def setIconFalse(value: js.Any): String = js.native
    def setIconTrue(value: js.Any): String = js.native

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.Cell")
class Cell extends qx.ui.virtual.cell.Abstract {
    protected def _applyAppearance(value: String, old: String): Unit = js.native
    protected def _applyBackgroundColor(value: String, old: String): Unit = js.native
    protected def _applyFont(value: String, old: String): Unit = js.native
    protected def _applyPadding(value: Int, old: Int): Unit = js.native
    protected def _applyTextAlign(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyTextColor(value: String, old: String): Unit = js.native
    protected def _getCssProperties(): qx.data.Array = js.native
    protected def _getValue(propertyName: String): js.Dynamic = js.native
    protected def _storeStyle(propertyName: String, styles: String): Unit = js.native
    def getAppearance(): String = js.native
    def getBackgroundColor(): String = js.native
    def getFont(): String = js.native
    def getPaddingBottom(): Int = js.native
    def getPaddingLeft(): Int = js.native
    def getPaddingRight(): Int = js.native
    def getPaddingTop(): Int = js.native
    def getTextAlign(): js.Dynamic = js.native
    def getTextColor(): String = js.native
    protected def initAppearance(value: js.Any): String = js.native
    protected def initBackgroundColor(value: js.Any): String = js.native
    protected def initFont(value: js.Any): String = js.native
    protected def initPaddingBottom(value: js.Any): Int = js.native
    protected def initPaddingLeft(value: js.Any): Int = js.native
    protected def initPaddingRight(value: js.Any): Int = js.native
    protected def initPaddingTop(value: js.Any): Int = js.native
    protected def initTextAlign(value: js.Any): js.Dynamic = js.native
    protected def initTextColor(value: js.Any): String = js.native
    def resetAppearance(): Unit = js.native
    def resetBackgroundColor(): Unit = js.native
    def resetFont(): Unit = js.native
    def resetPadding(): Unit = js.native
    def resetPaddingBottom(): Unit = js.native
    def resetPaddingLeft(): Unit = js.native
    def resetPaddingRight(): Unit = js.native
    def resetPaddingTop(): Unit = js.native
    def resetTextAlign(): Unit = js.native
    def resetTextColor(): Unit = js.native
    def setAppearance(value: js.Any): String = js.native
    def setBackgroundColor(value: js.Any): String = js.native
    def setFont(value: js.Any): String = js.native
    def setPadding(paddingTop: js.Any, paddingRight: js.Any, paddingBottom: js.Any, paddingLeft: js.Any): Unit = js.native
    def setPaddingBottom(value: js.Any): Int = js.native
    def setPaddingLeft(value: js.Any): Int = js.native
    def setPaddingRight(value: js.Any): Int = js.native
    def setPaddingTop(value: js.Any): Int = js.native
    def setTextAlign(value: js.Any): js.Dynamic = js.native
    def setTextColor(value: js.Any): String = js.native

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.CellStylesheet")
class CellStylesheet extends qx.core.Object {
    def computeClassForStyles(key: String, styleString: String): String = js.native
    def getCssClass(key: String): String = js.native
    def getStylesheet(): js.Dynamic = js.native

}
@js.native
@JSName("qx.ui.virtual.cell.CellStylesheet")
object CellStylesheet extends js.Object {
    def getInstance(): qx.ui.virtual.cell.CellStylesheet = js.native

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.Date")
class Date protected () extends qx.ui.virtual.cell.Cell {
    def this(dateFormat: qx.util.format.DateFormat = ???) = this()
    def getDateFormat(): qx.util.format.DateFormat = js.native
    protected def initDateFormat(value: js.Any): qx.util.format.DateFormat = js.native
    def resetDateFormat(): Unit = js.native
    def setDateFormat(value: js.Any): qx.util.format.DateFormat = js.native

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.Html")
class Html extends qx.ui.virtual.cell.Cell {

}
}
package qx.ui.virtual.cell {
@js.native
trait ICell extends js.Object {
    def getCellProperties(data: js.Any, states: js.Any): js.Dynamic = js.native

}
}
package qx.ui.virtual.cell {
@js.native
trait IWidgetCell extends js.Object {
    def getCellWidget(data: js.Any, states: js.Any): qx.ui.core.LayoutItem = js.native
    def pool(widget: qx.ui.core.LayoutItem): Unit = js.native
    def updateData(widget: qx.ui.core.LayoutItem, data: js.Any): Unit = js.native
    def updateStates(widget: qx.ui.core.LayoutItem, states: js.Any): Unit = js.native

}
}
package qx.ui.virtual.cell {
@js.native
trait IWidgetCellDelegate extends js.Object {
    def createWidget(): qx.ui.core.LayoutItem = js.native

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.Image")
class Image extends qx.ui.virtual.cell.AbstractImage {

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.Number")
class Number protected () extends qx.ui.virtual.cell.Cell {
    def this(numberFormat: qx.util.format.NumberFormat = ???) = this()
    def getNumberFormat(): qx.util.format.NumberFormat = js.native
    protected def initNumberFormat(value: js.Any): qx.util.format.NumberFormat = js.native
    def resetNumberFormat(): Unit = js.native
    def setNumberFormat(value: js.Any): qx.util.format.NumberFormat = js.native

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.String")
class String extends qx.ui.virtual.cell.Cell {

}
}
package qx.ui.virtual.cell {
@js.native
@JSName("qx.ui.virtual.cell.WidgetCell")
class WidgetCell extends qx.ui.virtual.cell.AbstractWidget {
    protected def _applyDelegate(value: js.Any, old: js.Any): Unit = js.native
    def getDelegate(): js.Dynamic = js.native
    protected def initDelegate(value: js.Any): js.Dynamic = js.native
    def resetDelegate(): Unit = js.native
    def setDelegate(value: js.Any): js.Dynamic = js.native

}
}
package qx.ui.virtual.core {
@js.native
@JSName("qx.ui.virtual.core.Axis")
class Axis protected () extends qx.core.Object {
    def this(defaultItemSize: Int = ???, itemCount: Int = ???) = this()
    def getDefaultItemSize(): Int = js.native
    def getItemAtPosition(position: Int): js.Dynamic = js.native
    def getItemCount(): Int = js.native
    def getItemPosition(index: Int): Int = js.native
    def getItemSize(index: Int): Int = js.native
    def getItemSizes(startIndex: Int, minSizeSum: Int): js.Array[Int] = js.native
    def getTotalSize(): Int = js.native
    def resetItemSizes(): Unit = js.native
    def setDefaultItemSize(defaultItemSize: Int): Unit = js.native
    def setItemCount(itemCount: Int): Unit = js.native
    def setItemSize(index: Int, size: Int): Unit = js.native

}
}
package qx.ui.virtual.core {
@js.native
@JSName("qx.ui.virtual.core.CellEvent")
class CellEvent extends qx.event.`type`.Pointer {
    def getColumn(): Int = js.native
    def getRow(): Int = js.native
    protected def initColumn(value: js.Any): Int = js.native
    protected def initRow(value: js.Any): Int = js.native
    def resetColumn(): Unit = js.native
    def resetRow(): Unit = js.native
    def setColumn(value: js.Any): Int = js.native
    def setRow(value: js.Any): Int = js.native

}
}
package qx.ui.virtual.core {
@js.native
trait IHtmlCellProvider extends js.Object {
    def getCellProperties(row: Int, column: Int): js.Dynamic = js.native

}
}
package qx.ui.virtual.core {
@js.native
trait ILayer extends js.Object {
    def fullUpdate(firstRow: Int, firstColumn: Int, rowSizes: js.Array[Int], columnSizes: js.Array[Int]): Unit = js.native
    def updateLayerData(): Unit = js.native
    def updateLayerWindow(firstRow: Int, firstColumn: Int, rowSizes: js.Array[Int], columnSizes: js.Array[Int]): Unit = js.native

}
}
package qx.ui.virtual.core {
@js.native
trait IWidgetCellProvider extends js.Object {
    def getCellWidget(row: Int, column: Int): qx.ui.core.LayoutItem = js.native
    def poolCellWidget(widget: qx.ui.core.LayoutItem): Unit = js.native

}
}
package qx.ui.virtual.core {
@js.native
@JSName("qx.ui.virtual.core.Pane")
class Pane protected () extends qx.ui.core.Widget {
    def this(rowCount: Int = ???, columnCount: Int = ???, cellHeight: Int = ???, cellWidth: Int = ???) = this()
    protected def _deferredUpdateScrollPosition(): Unit = js.native
    protected def _fullUpdate(): Unit = js.native
    protected def _onAppear(): Unit = js.native
    protected def _onContextmenu(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onDbltap(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onPointerDown(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onResize(): Unit = js.native
    protected def _onTap(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _setLayerWindow(layers: js.Array[qx.ui.virtual.core.ILayer], left: Int, top: Int, minWidth: Int, minHeight: Int, doFullUpdate: Boolean = ???): Unit = js.native
    protected def _updateScrollPosition(): Unit = js.native
    def addLayer(layer: qx.ui.virtual.core.ILayer): Unit = js.native
    def fullUpdate(): Unit = js.native
    def getCellAtPosition(documentX: Int, documentY: Int): js.Dynamic = js.native
    def getChildren(): js.Array[js.Dynamic] = js.native
    def getColumnConfig(): qx.ui.virtual.core.Axis = js.native
    def getLayers(): js.Array[qx.ui.virtual.core.ILayer] = js.native
    def getRowConfig(): qx.ui.virtual.core.Axis = js.native
    def getScrollMaxX(): Int = js.native
    def getScrollMaxY(): Int = js.native
    def getScrollSize(): js.Dynamic = js.native
    def getScrollX(): Int = js.native
    def getScrollY(): Int = js.native
    def getVisibleLayers(): js.Array[qx.ui.virtual.core.ILayer] = js.native
    def isUpdatePending(): Boolean = js.native
    def prefetchX(minLeft: Int, maxLeft: Int, minRight: Int, maxRight: Int): Unit = js.native
    def prefetchY(minAbove: Int, maxAbove: Int, minBelow: Int, maxBelow: Int): Unit = js.native
    def scrollCellIntoView(column: Int, row: Int): Unit = js.native
    def scrollColumnIntoView(column: Int): Unit = js.native
    def scrollRowIntoView(row: Int): Unit = js.native
    def setScrollX(value: Int): Unit = js.native
    def setScrollY(value: Int): Unit = js.native

}
}
package qx.ui.virtual.core {
@js.native
@JSName("qx.ui.virtual.core.Scroller")
class Scroller protected () extends qx.ui.core.scroll.AbstractScrollArea {
    def this(rowCount: Int = ???, columnCount: Int = ???, cellHeight: Int = ???, cellWidth: Int = ???) = this()
    def getPane(): qx.ui.virtual.core.Pane = js.native

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.Abstract")
class Abstract extends qx.ui.core.Widget with qx.ui.virtual.core.ILayer {
    override def fullUpdate(firstRow: Int, firstColumn: Int, rowSizes: js.Array[Int], columnSizes: js.Array[Int]): Unit = js.native
    override def updateLayerData(): Unit = js.native
    override def updateLayerWindow(firstRow: Int, firstColumn: Int, rowSizes: js.Array[Int], columnSizes: js.Array[Int]): Unit = js.native
    protected def _fullUpdate(firstRow: Int, firstColumn: Int, rowSizes: js.Array[Int], columnSizes: js.Array[Int]): Unit = js.native
    protected def _updateLayerData(): Unit = js.native
    protected def _updateLayerWindow(firstRow: Int, firstColumn: Int, rowSizes: js.Array[Int], columnSizes: js.Array[Int]): Unit = js.native
    def getColumnSizes(): js.Array[Int] = js.native
    def getFirstColumn(): Int = js.native
    def getFirstRow(): Int = js.native
    def getRowSizes(): js.Array[Int] = js.native

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.AbstractBackground")
class AbstractBackground protected () extends qx.ui.virtual.layer.Abstract {
    def this(colorEven: String = ???, colorOdd: String = ???) = this()
    protected def _applyColorEven(value: String, old: String): Unit = js.native
    protected def _applyColorOdd(value: String, old: String): Unit = js.native
    def clearCustomColors(): Unit = js.native
    def getBackground(index: Int): qx.ui.decoration.IDecorator = js.native
    def getColor(index: Int): String = js.native
    def getColorEven(): String = js.native
    def getColorOdd(): String = js.native
    protected def initColorEven(value: js.Any): String = js.native
    protected def initColorOdd(value: js.Any): String = js.native
    def resetColorEven(): Unit = js.native
    def resetColorOdd(): Unit = js.native
    def setBackground(index: Int, decorator: qx.ui.decoration.IDecorator): Unit = js.native
    def setColor(index: Int, color: String): Unit = js.native
    def setColorEven(value: js.Any): String = js.native
    def setColorOdd(value: js.Any): String = js.native

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.CellSpanManager")
class CellSpanManager protected () extends qx.core.Object {
    def this(rowConfig: qx.ui.virtual.core.Axis = ???, columnConfig: qx.ui.virtual.core.Axis = ???) = this()
    protected def _findCellsInRange(key: String, min: Int, max: Int): js.Dynamic = js.native
    protected def _getColumnPosition(column: Int): Int = js.native
    protected def _getRowPosition(row: Int): Int = js.native
    protected def _getSingleCellBounds(cell: js.Any, firstVisibleRow: js.Any, firstVisibleColumn: js.Any): js.Dynamic = js.native
    protected def _getSortedCells(key: String): js.Array[js.Any] = js.native
    protected def _invalidatePositionCache(): Unit = js.native
    protected def _invalidateSortCache(): Unit = js.native
    protected def _onColumnConfigChange(e: qx.event.`type`.Event): Unit = js.native
    protected def _onRowConfigChange(e: qx.event.`type`.Event): Unit = js.native
    def addCell(id: String, row: Int, column: Int, rowSpan: Int, columnSpan: Int): Unit = js.native
    def computeCellSpanMap(cells: js.Array[js.Any], firstRow: Int, firstColumn: Int, rowCount: Int, columnCount: Int): js.Array[js.Any] = js.native
    def findCellsInWindow(firstRow: Int, firstColumn: Int, rowCount: Int, columnCount: Int): js.Array[js.Any] = js.native
    def getCellBounds(cells: js.Array[js.Any], firstVisibleRow: js.Any, firstVisibleColumn: js.Any): js.Array[js.Any] = js.native
    def removeCell(id: String): Unit = js.native

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.Column")
class Column extends qx.ui.virtual.layer.AbstractBackground {

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.GridLines")
class GridLines protected () extends qx.ui.virtual.layer.Abstract {
    def this(orientation: String = ???, lineColor: String = ???, lineSize: Int = ???) = this()
    def getDefaultLineColor(): String = js.native
    def getDefaultLineSize(): Int = js.native
    def getLineColor(index: Long): String = js.native
    def getLineSize(index: Long): Int = js.native
    protected def initDefaultLineColor(value: js.Any): String = js.native
    protected def initDefaultLineSize(value: js.Any): Int = js.native
    def isHorizontal(): Boolean = js.native
    def resetDefaultLineColor(): Unit = js.native
    def resetDefaultLineSize(): Unit = js.native
    def setDefaultLineColor(value: js.Any): String = js.native
    def setDefaultLineSize(value: js.Any): Int = js.native
    def setLineColor(index: Long, color: String): Unit = js.native
    def setLineSize(index: Long, size: Int): Unit = js.native

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.HtmlCell")
class HtmlCell protected () extends qx.ui.virtual.layer.Abstract {
    def this(htmlCellProvider: qx.ui.virtual.core.IHtmlCellProvider = ???) = this()
    protected def _getCellSizeStyle(width: Int, height: Int, insetX: Int, insetY: Int): String = js.native

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.HtmlCellSpan")
class HtmlCellSpan protected () extends qx.ui.virtual.layer.HtmlCell {
    def this(htmlCellProvider: qx.ui.virtual.core.IHtmlCellProvider = ???, rowConfig: qx.ui.virtual.core.Axis = ???, columnConfig: qx.ui.virtual.core.Axis = ???) = this()
    def setCellSpan(row: Int, column: Int, rowSpan: Int, columnSpan: Int): Unit = js.native

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.Row")
class Row extends qx.ui.virtual.layer.AbstractBackground {

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.WidgetCell")
class WidgetCell protected () extends qx.ui.virtual.layer.Abstract with qx.ui.core.MChildrenHandling {
    def this(widgetCellProvider: qx.ui.virtual.core.IWidgetCellProvider = ???) = this()
    protected def _activateNotEmptyChild(elementToPool: qx.ui.core.Widget): Unit = js.native
    protected def _getSpacer(): qx.ui.core.Spacer = js.native
    def getRenderedCellWidget(row: Int, column: Int): qx.ui.core.LayoutItem = js.native

}
}
package qx.ui.virtual.layer {
@js.native
@JSName("qx.ui.virtual.layer.WidgetCellSpan")
class WidgetCellSpan protected () extends qx.ui.virtual.layer.Abstract with qx.ui.core.MChildrenHandling {
    def this(widgetCellProvider: qx.ui.virtual.core.IWidgetCellProvider = ???, rowConfig: qx.ui.virtual.core.Axis = ???, columnConfig: qx.ui.virtual.core.Axis = ???) = this()
    protected def _getSpacer(): qx.ui.core.Spacer = js.native
    def getRenderedCellWidget(row: Int, column: Int): qx.ui.core.LayoutItem = js.native
    def setCellSpan(row: Int, column: Int, rowSpan: Int, columnSpan: Int): Unit = js.native

}
}
package qx.ui.virtual.selection {
@js.native
@JSName("qx.ui.virtual.selection.Abstract")
class Abstract protected () extends qx.ui.core.selection.Abstract {
    def this(pane: qx.ui.virtual.core.Pane = ???, selectionDelegate: js.Any = ???) = this()
    def attachKeyEvents(target: qx.core.Object): Unit = js.native
    def attachListEvents(list: qx.core.Object): Unit = js.native
    def attachPointerEvents(): Unit = js.native
    def detachKeyEvents(target: qx.core.Object): Unit = js.native
    def detachListEvents(list: qx.core.Object): Unit = js.native
    def detatchPointerEvents(): Unit = js.native

}
}
package qx.ui.virtual.selection {
@js.native
@JSName("qx.ui.virtual.selection.CellLines")
class CellLines extends qx.ui.virtual.selection.CellRectangle {

}
}
package qx.ui.virtual.selection {
@js.native
@JSName("qx.ui.virtual.selection.CellRectangle")
class CellRectangle extends qx.ui.virtual.selection.Abstract {
    protected def _getItemCount(): Int = js.native

}
}
package qx.ui.virtual.selection {
@js.native
@JSName("qx.ui.virtual.selection.Column")
class Column extends qx.ui.virtual.selection.Row {

}
}
package qx.ui.virtual.selection {
@js.native
trait ISelectionDelegate extends js.Object {
    def isItemSelectable(item: js.Any): Boolean = js.native
    def styleSelectable(item: js.Any, `type`: String, wasAdded: Boolean): Unit = js.native

}
}
package qx.ui.virtual.selection {
@js.native
@JSName("qx.ui.virtual.selection.MModel")
trait MModel extends js.Object {
    protected def _applyDefaultSelection(): Unit = js.native
    protected def _applyDragSelection(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyQuickSelection(value: Boolean, old: Boolean): Unit = js.native
    protected def _applySelection(value: qx.data.Array, old: qx.data.Array): Unit = js.native
    protected def _applySelectionMode(value: js.Any, old: js.Any): Unit = js.native
    protected def _initSelectionManager(): Unit = js.native
    protected def _onChangeSelection(e: qx.event.`type`.Data): Unit = js.native
    protected def _onManagerChangeSelection(e: qx.event.`type`.Data): Unit = js.native
    protected def _updateSelection(): Unit = js.native
    def getAutoScrollIntoView(): Boolean = js.native
    def getDragSelection(): Boolean = js.native
    def getQuickSelection(): Boolean = js.native
//    def getSelection(): qx.data.Array = js.native
    def getSelectionMode(): js.Dynamic = js.native
    protected def initDragSelection(value: js.Any): Boolean = js.native
    protected def initQuickSelection(value: js.Any): Boolean = js.native
    protected def initSelection(value: js.Any): qx.data.Array = js.native
    protected def initSelectionMode(value: js.Any): js.Dynamic = js.native
    def isDragSelection(): Boolean = js.native
    def isQuickSelection(): Boolean = js.native
    def resetDragSelection(): Unit = js.native
    def resetQuickSelection(): Unit = js.native
    def resetSelection(): Unit = js.native
    def resetSelectionMode(): Unit = js.native
    def setAutoScrollIntoView(value: Boolean): Unit = js.native
    def setDragSelection(value: js.Any): Boolean = js.native
    def setQuickSelection(value: js.Any): Boolean = js.native
    def setSelection(value: js.Any): qx.data.Array = js.native
    def setSelectionMode(value: js.Any): js.Dynamic = js.native
    def toggleDragSelection(): Boolean = js.native
    def toggleQuickSelection(): Boolean = js.native

}
}
package qx.ui.virtual.selection {
@js.native
@JSName("qx.ui.virtual.selection.Row")
class Row extends qx.ui.virtual.selection.Abstract {
    protected def _getItemCount(): Int = js.native

}
}
package qx.ui.window {
@js.native
@JSName("qx.ui.window.Desktop")
class Desktop protected () extends qx.ui.core.Widget with qx.ui.window.IDesktop with qx.ui.core.MChildrenHandling with qx.ui.window.MDesktop with qx.ui.core.MBlocker {
    override def blockContent(zIndex: Int): Unit = js.native
    override def getWindows(): js.Array[qx.ui.window.Window] = js.native
    override def isBlocked(): Boolean = js.native
    override def setWindowManager(manager: qx.ui.window.IWindowManager): Unit = js.native
    override def supportsMaximize(): Boolean = js.native
    override def unblock(): Unit = js.native
    def this(windowManager: qx.ui.window.IWindowManager = ???) = this()

}
}
package qx.ui.window {
@js.native
trait IDesktop extends js.Object {
    def blockContent(zIndex: Int): Unit = js.native
    def getWindows(): js.Array[qx.ui.window.Window] = js.native
    def isBlocked(): Boolean = js.native
    def setWindowManager(manager: qx.ui.window.IWindowManager): Unit = js.native
    def supportsMaximize(): Boolean = js.native
    def unblock(): Unit = js.native

}
}
package qx.ui.window {
@js.native
trait IWindowManager extends js.Object {
    def bringToFront(win: Window): Unit = js.native
    def changeActiveWindow(active: Window, oldActive: Window): Unit = js.native
    def sendToBack(win: Window): Unit = js.native
    def setDesktop(desktop: qx.ui.window.IDesktop): Unit = js.native
    def updateStack(): Unit = js.native

}
}
package qx.ui.window {
@js.native
@JSName("qx.ui.window.MDesktop")
trait MDesktop extends js.Object {
    protected def _addWindow(win: qx.ui.window.Window): Unit = js.native
    protected def _afterAddChild(win: qx.ui.core.Widget): Unit = js.native
    protected def _afterRemoveChild(win: qx.ui.core.Widget): Unit = js.native
    protected def _applyActiveWindow(value: qx.ui.window.Window, old: qx.ui.window.Window): Unit = js.native
    protected def _onChangeActive(e: qx.event.`type`.Event): Unit = js.native
    protected def _onChangeModal(e: qx.event.`type`.Event): Unit = js.native
    protected def _onChangeVisibility(): Unit = js.native
    protected def _removeWindow(win: qx.ui.window.Window): Unit = js.native
    def getActiveWindow(): qx.ui.window.Window = js.native
    def getWindowManager(): qx.ui.window.IWindowManager = js.native
    def getWindows(): js.Array[qx.ui.window.Window] = js.native
    protected def initActiveWindow(value: js.Any): qx.ui.window.Window = js.native
    def resetActiveWindow(): Unit = js.native
    def setActiveWindow(value: js.Any): qx.ui.window.Window = js.native
    def setWindowManager(manager: qx.ui.window.IWindowManager): Unit = js.native
    def supportsMaximize(): Boolean = js.native

}
}
package qx.ui.window {
@js.native
@JSName("qx.ui.window.Manager")
class Manager extends qx.core.Object with qx.ui.window.IWindowManager {
    override def bringToFront(win: Window): Unit = js.native
    override def changeActiveWindow(active: Window, oldActive: Window): Unit = js.native
    override def sendToBack(win: Window): Unit = js.native
    override def setDesktop(desktop: qx.ui.window.IDesktop): Unit = js.native
    override def updateStack(): Unit = js.native
    def getDesktop(): qx.ui.window.IDesktop = js.native
    def syncWidget(): Unit = js.native

}
}
package qx.ui.window {
@js.native
@JSName("qx.ui.window.Window")
class Window protected () extends qx.ui.core.Widget with qx.ui.core.MRemoteChildrenHandling with qx.ui.core.MRemoteLayoutHandling with qx.ui.core.MResizable with qx.ui.core.MMovable with qx.ui.core.MContentPadding {
    def this(caption: String = ???, icon: String = ???) = this()
    protected def _applyActive(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyCaptionBarChange(value: js.Any, old: js.Any): Unit = js.native
    protected def _applyModal(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyShowStatusbar(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyStatus(value: String, old: String): Unit = js.native
    protected def _getContentPaddingTarget(): qx.ui.core.Widget = js.native
    protected def _onCaptionPointerDblTap(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onCloseButtonTap(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onMaximizeButtonTap(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onMinimizeButtonTap(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onRestoreButtonTap(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _onWindowEventStop(e: qx.event.`type`.Event): Unit = js.native
    protected def _onWindowFocusOut(e: qx.event.`type`.Focus): Unit = js.native
    protected def _onWindowPointerDown(e: qx.event.`type`.Pointer): Unit = js.native
    protected def _updateCaptionBar(): Unit = js.native
    def center(): Unit = js.native
    def close(): Unit = js.native
    def getActive(): Boolean = js.native
    def getAllowClose(): Boolean = js.native
    def getAllowMaximize(): Boolean = js.native
    def getAllowMinimize(): Boolean = js.native
    def getAlwaysOnTop(): Boolean = js.native
    def getCaption(): js.Dynamic = js.native
    def getIcon(): String = js.native
    def getModal(): Boolean = js.native
    def getMode(): String = js.native
    def getShowClose(): Boolean = js.native
    def getShowMaximize(): Boolean = js.native
    def getShowMinimize(): Boolean = js.native
    def getShowStatusbar(): Boolean = js.native
    def getStatus(): String = js.native
    protected def initActive(value: js.Any): Boolean = js.native
    protected def initAllowClose(value: js.Any): Boolean = js.native
    protected def initAllowMaximize(value: js.Any): Boolean = js.native
    protected def initAllowMinimize(value: js.Any): Boolean = js.native
    protected def initAlwaysOnTop(value: js.Any): Boolean = js.native
    protected def initCaption(value: js.Any): js.Dynamic = js.native
    protected def initIcon(value: js.Any): String = js.native
    protected def initModal(value: js.Any): Boolean = js.native
    protected def initShowClose(value: js.Any): Boolean = js.native
    protected def initShowMaximize(value: js.Any): Boolean = js.native
    protected def initShowMinimize(value: js.Any): Boolean = js.native
    protected def initShowStatusbar(value: js.Any): Boolean = js.native
    protected def initStatus(value: js.Any): String = js.native
    def isActive(): Boolean = js.native
    def isAllowClose(): Boolean = js.native
    def isAllowMaximize(): Boolean = js.native
    def isAllowMinimize(): Boolean = js.native
    def isAlwaysOnTop(): Boolean = js.native
    def isMaximized(): Boolean = js.native
    def isModal(): Boolean = js.native
    def isShowClose(): Boolean = js.native
    def isShowMaximize(): Boolean = js.native
    def isShowMinimize(): Boolean = js.native
    def isShowStatusbar(): Boolean = js.native
    def maximize(): Unit = js.native
    def minimize(): Unit = js.native
    def moveTo(left: Int, top: Int): Unit = js.native
    def open(): Unit = js.native
    def resetActive(): Unit = js.native
    def resetAllowClose(): Unit = js.native
    def resetAllowMaximize(): Unit = js.native
    def resetAllowMinimize(): Unit = js.native
    def resetAlwaysOnTop(): Unit = js.native
    def resetCaption(): Unit = js.native
    def resetIcon(): Unit = js.native
    def resetModal(): Unit = js.native
    def resetShowClose(): Unit = js.native
    def resetShowMaximize(): Unit = js.native
    def resetShowMinimize(): Unit = js.native
    def resetShowStatusbar(): Unit = js.native
    def resetStatus(): Unit = js.native
    def restore(): Unit = js.native
    def setActive(value: js.Any): Boolean = js.native
    def setAllowClose(value: js.Any): Boolean = js.native
    def setAllowMaximize(value: js.Any): Boolean = js.native
    def setAllowMinimize(value: js.Any): Boolean = js.native
    def setAlwaysOnTop(value: js.Any): Boolean = js.native
    def setCaption(value: js.Any): js.Dynamic = js.native
    def setIcon(value: js.Any): String = js.native
    def setModal(value: js.Any): Boolean = js.native
    def setShowClose(value: js.Any): Boolean = js.native
    def setShowMaximize(value: js.Any): Boolean = js.native
    def setShowMinimize(value: js.Any): Boolean = js.native
    def setShowStatusbar(value: js.Any): Boolean = js.native
    def setStatus(value: js.Any): String = js.native
    def toggleActive(): Boolean = js.native
    def toggleAllowClose(): Boolean = js.native
    def toggleAllowMaximize(): Boolean = js.native
    def toggleAllowMinimize(): Boolean = js.native
    def toggleAlwaysOnTop(): Boolean = js.native
    def toggleModal(): Boolean = js.native
    def toggleShowClose(): Boolean = js.native
    def toggleShowMaximize(): Boolean = js.native
    def toggleShowMinimize(): Boolean = js.native
    def toggleShowStatusbar(): Boolean = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.AliasManager")
class AliasManager extends qx.util.ValueManager {
    protected def _preprocess(value: String): String = js.native
    def add(alias: String, base: String): Unit = js.native
    def getAliases(): js.Dynamic = js.native
    def remove(alias: String): Unit = js.native

}
@js.native
@JSName("qx.util.AliasManager")
object AliasManager extends js.Object {
    def getInstance(): qx.util.AliasManager = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.Animation")
class Animation extends js.Object {

}
}
package qx.util {
@js.native
@JSName("qx.util.Base64")
class Base64 extends js.Object {

}
@js.native
@JSName("qx.util.Base64")
object Base64 extends js.Object {
    def decode(input: String, is8bit: Boolean = ???): String = js.native
    def encode(input: String, is8bit: Boolean = ???): String = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.ColorUtil")
class ColorUtil extends js.Object {

}
@js.native
@JSName("qx.util.ColorUtil")
object ColorUtil extends js.Object {
    def cssStringToRgb(str: String): qx.data.Array = js.native
    def hex3StringToHex6String(value: String): String = js.native
    def hex3StringToRgb(value: String): qx.data.Array = js.native
    def hex6StringToRgb(value: String): qx.data.Array = js.native
    def hexStringToRgb(value: String): qx.data.Array = js.native
    def hsbToRgb(hsb: js.Array[Long]): js.Array[Int] = js.native
    def isCssString(str: String): Boolean = js.native
    def isHex3String(str: String): Boolean = js.native
    def isHex6String(str: String): Boolean = js.native
    def isNamedColor(value: String): Boolean = js.native
    def isRgbaString(str: String): Boolean = js.native
    def isRgbString(str: String): Boolean = js.native
    def isSystemColor(value: String): Boolean = js.native
    def isThemedColor(value: String): Boolean = js.native
    def isValidPropertyValue(str: String): Boolean = js.native
    def randomColor(): String = js.native
    def rgbToHexString(rgb: qx.data.Array): String = js.native
    def rgbToHsb(rgb: js.Array[Long]): qx.data.Array = js.native
    def rgbToRgbString(rgb: qx.data.Array): String = js.native
    def stringToRgb(str: String): qx.data.Array = js.native
    def stringToRgbString(str: String): String = js.native
    def supportsThemes(): Boolean = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.DeferredCall")
class DeferredCall protected () extends qx.core.Object {
    def this(callback: js.Function = ???, context: js.Any = ???) = this()
    def call(): Unit = js.native
    def cancel(): Unit = js.native
    def schedule(): Unit = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.DeferredCallManager")
class DeferredCallManager extends qx.core.Object {
    def cancel(deferredCall: qx.util.DeferredCall): Unit = js.native
    def schedule(deferredCall: qx.util.DeferredCall): Unit = js.native

}
@js.native
@JSName("qx.util.DeferredCallManager")
object DeferredCallManager extends js.Object {
    def getInstance(): qx.util.DeferredCallManager = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.Delegate")
class Delegate extends js.Object {

}
@js.native
@JSName("qx.util.Delegate")
object Delegate extends js.Object {
    def containsMethod(delegate: js.Any, specificMethod: String): Boolean = js.native
    def getMethod(delegate: js.Any, specificMethod: String): js.Function = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.DisposeUtil")
class DisposeUtil extends js.Object {

}
@js.native
@JSName("qx.util.DisposeUtil")
object DisposeUtil extends js.Object {
    protected def _collectContainerChildren(container: qx.ui.container.Composite, arr: qx.data.Array): Unit = js.native
    def destroyContainer(container: qx.ui.container.Composite): Unit = js.native
    def disposeArray(obj: js.Any, field: String): Unit = js.native
    def disposeMap(obj: js.Any, field: String): Unit = js.native
    def disposeObjects(obj: js.Any, arr: qx.data.Array, disposeSingletons: Boolean = ???): Unit = js.native
    def disposeTriggeredBy(disposeMe: js.Any, trigger: js.Any): Unit = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.EditDistance")
class EditDistance extends js.Object {

}
@js.native
@JSName("qx.util.EditDistance")
object EditDistance extends js.Object {
    def getEditOperations(dataA: qx.data.Array, dataB: qx.data.Array): js.Array[js.Any] = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.ExtendedColor")
class ExtendedColor extends js.Object {

}
@js.native
@JSName("qx.util.ExtendedColor")
object ExtendedColor extends js.Object {
    def isExtendedColor(value: String): Boolean = js.native
    def toRgb(value: String): qx.data.Array = js.native
    def toRgbString(value: String): String = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.OOUtil")
class OOUtil extends js.Object {

}
@js.native
@JSName("qx.util.OOUtil")
object OOUtil extends js.Object {
    def classIsDefined(name: String): Boolean = js.native
    def getByInterface(clazz: qx.Class, iface: qx.Interface): qx.Class = js.native
    def getEventType(clazz: qx.Class, name: String): String = js.native
    def getMixins(clazz: qx.Class): js.Array[qx.Mixin] = js.native
    def getPropertyDefinition(clazz: qx.Class, name: String): js.Dynamic = js.native
    def hasInterface(clazz: qx.Class, iface: qx.Interface): Boolean = js.native
    def hasProperty(clazz: qx.Class, name: String): Boolean = js.native
    def supportsEvent(clazz: qx.Class, name: String): Boolean = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.ObjectPool")
class ObjectPool protected () extends qx.core.Object {
    def this(size: Int = ???) = this()
    def getObject(clazz: qx.Class): js.Dynamic = js.native
    def getSize(): Int = js.native
    protected def initSize(value: js.Any): Int = js.native
    def poolObject(obj: js.Any): Unit = js.native
    def resetSize(): Unit = js.native
    def setSize(value: js.Any): Int = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.Permutation")
class Permutation extends js.Object {

}
@js.native
@JSName("qx.util.Permutation")
object Permutation extends js.Object {
    def permute(options: js.Any, callback: js.Function, context: js.Any): Unit = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.PropertyUtil")
class PropertyUtil extends js.Object {

}
@js.native
@JSName("qx.util.PropertyUtil")
object PropertyUtil extends js.Object {
    def deleteInitValue(obj: js.Any, propertyName: String): Unit = js.native
    def deleteThemeValue(obj: js.Any, propertyName: String): Unit = js.native
    def deleteUserValue(obj: js.Any, propertyName: String): Unit = js.native
    def getAllProperties(clazz: qx.Class): js.Dynamic = js.native
    def getInitValue(obj: js.Any, propertyName: String): js.Dynamic = js.native
    def getProperties(clazz: qx.Class): js.Dynamic = js.native
    def getThemeValue(obj: js.Any, propertyName: String): js.Dynamic = js.native
    def getUserValue(obj: js.Any, propertyName: String): js.Dynamic = js.native
    def resetThemed(obj: js.Any, propertyName: String): Unit = js.native
    def setInitValue(obj: js.Any, propertyName: String, value: js.Any): Unit = js.native
    def setThemed(obj: js.Any, propertyName: String, value: js.Any): Unit = js.native
    def setThemeValue(obj: js.Any, propertyName: String, value: js.Any): Unit = js.native
    def setUserValue(obj: js.Any, propertyName: String, value: js.Any): Unit = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.Request")
class Request extends js.Object {

}
@js.native
@JSName("qx.util.Request")
object Request extends js.Object {
    def isCrossDomain(url: String): Boolean = js.native
    def isMethod(method: String): Boolean = js.native
    def isSuccessful(status: Long): Boolean = js.native
    def methodAllowsRequestBody(method: String): Boolean = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.ResourceManager")
class ResourceManager extends qx.core.Object {
    def getCombinedFormat(id: String): String = js.native
    def getData(id: String): qx.data.Array = js.native
    def getImageFormat(id: String): String = js.native
    def getImageHeight(id: String): Int = js.native
    def getImageWidth(id: String): Int = js.native
    def has(id: String): Boolean = js.native
    def toDataUri(resid: String): String = js.native
    def toUri(id: String): String = js.native

}
@js.native
@JSName("qx.util.ResourceManager")
object ResourceManager extends js.Object {
    def getInstance(): qx.util.ResourceManager = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.ResponseParser")
class ResponseParser protected () extends js.Object {
    def this(parser: String = ???) = this()
    protected def _getParser(contentType: String): js.Function = js.native
    def parse(response: String, contentType: String): String = js.native
    def setParser(parser: String): js.Function = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.RingBuffer")
class RingBuffer protected () extends js.Object {
    def this(maxEntries: Int = ???) = this()
    def addEntry(entry: js.Any): Unit = js.native
    def clear(): Unit = js.native
    def clearMark(): Unit = js.native
    def getAllEntries(): qx.data.Array = js.native
    def getEntries(count: Int, startingFromMark: Boolean = ???): qx.data.Array = js.native
    def getMaxEntries(): Int = js.native
    def mark(): Unit = js.native
    def setMaxEntries(maxEntries: Int): Unit = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.Serializer")
class Serializer extends js.Object {

}
@js.native
@JSName("qx.util.Serializer")
object Serializer extends js.Object {
    def toJson(obj: qx.core.Object, qxSerializer: js.Function = ???, dateFormat: qx.util.format.DateFormat = ???): String = js.native
    def toNativeObject(obj: qx.core.Object, qxSerializer: js.Function = ???, dateFormat: qx.util.format.DateFormat = ???): String = js.native
    def toUriParameter(obj: qx.core.Object, qxSerializer: js.Function = ???, dateFormat: qx.util.format.DateFormat = ???): String = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.StringBuilder")
class StringBuilder protected () extends qx.`type`.BaseArray {
    def this(length_or_items: Int = ???) = this()
    def add(varargs: String = ???): Unit = js.native
    def clear(): Unit = js.native
    def get(): String = js.native
    def isEmpty(): Boolean = js.native
    def size(): Int = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.StringEscape")
class StringEscape extends js.Object {

}
@js.native
@JSName("qx.util.StringEscape")
object StringEscape extends js.Object {
    def escape(str: String, charCodeToEntities: js.Any): String = js.native
    def unescape(str: String, entitiesToCharCode: js.Any): String = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.StringSplit")
class StringSplit extends js.Object {

}
@js.native
@JSName("qx.util.StringSplit")
object StringSplit extends js.Object {
    def split(str: String, separator: js.RegExp, limit: Int = ???): js.Array[String] = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.TimerManager")
class TimerManager extends qx.core.Object {
    def start(callback: js.Function, recurTime: Int, context: qx.core.Object, userData: js.Any, initialTime: Int): Int = js.native
    def stop(timerId: Int): Unit = js.native

}
@js.native
@JSName("qx.util.TimerManager")
object TimerManager extends js.Object {
    def getInstance(): qx.util.TimerManager = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.Uri")
class Uri extends js.Object {

}
@js.native
@JSName("qx.util.Uri")
object Uri extends js.Object {
    def appendParamsToUrl(url: String, params: String): String = js.native
    def getAbsolute(uri: String): String = js.native
    def parseUri(str: String, strict: Boolean): js.Dynamic = js.native
    def toParameter(obj: js.Any, post: Boolean): String = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.Validate")
class Validate extends js.Object {

}
@js.native
@JSName("qx.util.Validate")
object Validate extends js.Object {
    def checkColor(value: js.Any, formItem: qx.ui.form.IForm, errorMessage: String = ???): Unit = js.native
    def checkEmail(value: js.Any, formItem: qx.ui.form.IForm, errorMessage: String = ???): Unit = js.native
    def checkNumber(value: js.Any, formItem: qx.ui.form.IForm, errorMessage: String = ???): Unit = js.native
    def checkString(value: js.Any, formItem: qx.ui.form.IForm, errorMessage: String = ???): Unit = js.native
    def checkUrl(value: js.Any, formItem: qx.ui.form.IForm, errorMessage: String = ???): Unit = js.native
    def color(errorMessage: String = ???): js.Function = js.native
    def email(errorMessage: String = ???): js.Function = js.native
    def inArray(array: qx.data.Array, errorMessage: String = ???): js.Function = js.native
    def number(errorMessage: String = ???): js.Function = js.native
    def range(from: Long, to: Long, errorMessage: String = ???): js.Function = js.native
    def regExp(reg: js.RegExp, errorMessage: String = ???): js.Function = js.native
    def string(errorMessage: String = ???): js.Function = js.native
    def url(errorMessage: String = ???): js.Function = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.ValueManager")
class ValueManager extends qx.core.Object {
    protected def _getDynamic(): js.Dynamic = js.native
    protected def _setDynamic(value: js.Any): Unit = js.native
    def isDynamic(value: String): Boolean = js.native
    def resolve(value: String): js.Dynamic = js.native
    def resolveDynamic(value: String): js.Dynamic = js.native

}
}
package qx.util {
@js.native
@JSName("qx.util.Wheel")
class Wheel extends js.Object {

}
@js.native
@JSName("qx.util.Wheel")
object Wheel extends js.Object {
    def getDelta(domEvent: qx.event.`type`.Event, axis: String = ???): Int = js.native

}
}
package qx.util.format {
@js.native
@JSName("qx.util.format.DateFormat")
class DateFormat protected () extends qx.core.Object with qx.util.format.IFormat {
    override def format(obj: js.Any): String = js.native
    override def parse(str: String): js.Dynamic = js.native
    def this(format: String = ???, locale: String = ???) = this()
    protected def _applyLocale(value: String, old: String): Unit = js.native
    def getLocale(): String = js.native
    protected def initLocale(value: js.Any): String = js.native
    def resetLocale(): Unit = js.native
    def setLocale(value: js.Any): String = js.native

}
@js.native
@JSName("qx.util.format.DateFormat")
object DateFormat extends js.Object {
    def getDateInstance(): qx.util.format.DateFormat = js.native
    def getDateTimeInstance(): qx.util.format.DateFormat = js.native

}
}
package qx.util.format {
@js.native
trait IFormat extends js.Object {
    def format(obj: js.Any): String = js.native
    def parse(str: String): js.Dynamic = js.native

}
}
package qx.util.format {
@js.native
@JSName("qx.util.format.NumberFormat")
class NumberFormat protected () extends qx.core.Object with qx.util.format.IFormat {
    override def format(obj: js.Any): String = js.native
    override def parse(str: String): js.Dynamic = js.native
    def this(locale: String = ???) = this()
    def getGroupingUsed(): Boolean = js.native
    def getLocale(): String = js.native
    def getMaximumFractionDigits(): Long = js.native
    def getMaximumIntegerDigits(): Long = js.native
    def getMinimumFractionDigits(): Long = js.native
    def getMinimumIntegerDigits(): Long = js.native
    def getPostfix(): String = js.native
    def getPrefix(): String = js.native
    protected def initGroupingUsed(value: js.Any): Boolean = js.native
    protected def initLocale(value: js.Any): String = js.native
    protected def initMaximumFractionDigits(value: js.Any): Long = js.native
    protected def initMaximumIntegerDigits(value: js.Any): Long = js.native
    protected def initMinimumFractionDigits(value: js.Any): Long = js.native
    protected def initMinimumIntegerDigits(value: js.Any): Long = js.native
    protected def initPostfix(value: js.Any): String = js.native
    protected def initPrefix(value: js.Any): String = js.native
    def isGroupingUsed(): Boolean = js.native
    def resetGroupingUsed(): Unit = js.native
    def resetLocale(): Unit = js.native
    def resetMaximumFractionDigits(): Unit = js.native
    def resetMaximumIntegerDigits(): Unit = js.native
    def resetMinimumFractionDigits(): Unit = js.native
    def resetMinimumIntegerDigits(): Unit = js.native
    def resetPostfix(): Unit = js.native
    def resetPrefix(): Unit = js.native
    def setGroupingUsed(value: js.Any): Boolean = js.native
    def setLocale(value: js.Any): String = js.native
    def setMaximumFractionDigits(value: js.Any): Long = js.native
    def setMaximumIntegerDigits(value: js.Any): Long = js.native
    def setMinimumFractionDigits(value: js.Any): Long = js.native
    def setMinimumIntegerDigits(value: js.Any): Long = js.native
    def setPostfix(value: js.Any): String = js.native
    def setPrefix(value: js.Any): String = js.native
    def toggleGroupingUsed(): Boolean = js.native

}
}
package qx.util.fsm {
@js.native
@JSName("qx.util.fsm.FiniteStateMachine")
class FiniteStateMachine protected () extends qx.core.Object {
    def this(machineName: String = ???) = this()
    protected def _getInternalData(): js.Dynamic = js.native
    def addObject(friendlyName: String, obj: js.Any, groupNames: qx.data.Array): Unit = js.native
    def addState(state: qx.util.fsm.State): Unit = js.native
    def displayAllObjects(): Unit = js.native
    def enqueueEvent(event: qx.event.`type`.Event, bAddAtHead: Boolean): Unit = js.native
    def eventListener(event: qx.event.`type`.Event): Unit = js.native
    def fireImmediateEvent(`type`: String, target: qx.core.Object, data: js.Any): Unit = js.native
    def getDebugFlags(): Long = js.native
    def getFriendlyName(obj: js.Any): String = js.native
    def getGroupObjects(groupName: String): qx.data.Array = js.native
    def getMaxSavedStates(): Long = js.native
    def getName(): String = js.native
    def getNextState(): String = js.native
    def getObject(friendlyName: String): js.Dynamic = js.native
    def getPreviousState(): String = js.native
    def getState(): String = js.native
    protected def initDebugFlags(value: js.Any): Long = js.native
    protected def initMaxSavedStates(value: js.Any): Long = js.native
    protected def initName(value: js.Any): String = js.native
    protected def initNextState(value: js.Any): String = js.native
    protected def initPreviousState(value: js.Any): String = js.native
    protected def initState(value: js.Any): String = js.native
    def isTerminated(): Boolean = js.native
    def popState(): String = js.native
    def postponeEvent(event: qx.event.`type`.Event): Unit = js.native
    def pushState(state: Boolean): Unit = js.native
    def removeObject(friendlyName: String): Unit = js.native
    def replaceState(state: qx.util.fsm.State, bDispose: Boolean): js.Dynamic = js.native
    def resetDebugFlags(): Unit = js.native
    def resetMaxSavedStates(): Unit = js.native
    def resetName(): Unit = js.native
    def resetNextState(): Unit = js.native
    def resetPreviousState(): Unit = js.native
    def resetState(): Unit = js.native
    def scheduleEvent(`type`: String, target: qx.core.Object, data: js.Any, timeout: Int): Unit = js.native
    def setDebugFlags(value: js.Any): Long = js.native
    def setMaxSavedStates(value: js.Any): Long = js.native
    def setName(value: js.Any): String = js.native
    def setNextState(value: js.Any): String = js.native
    def setPreviousState(value: js.Any): String = js.native
    def setState(value: js.Any): String = js.native
    def start(): Unit = js.native

}
}
package qx.util.fsm {
@js.native
@JSName("qx.util.fsm.State")
class State protected () extends qx.core.Object {
    def this(stateName: String = ???, stateInfo: js.Any = ???) = this()
    def addTransition(trans: qx.util.fsm.Transition): Unit = js.native
    def getAutoActionsAfterOnentry(): js.Dynamic = js.native
    def getAutoActionsAfterOnexit(): js.Dynamic = js.native
    def getAutoActionsBeforeOnentry(): js.Dynamic = js.native
    def getAutoActionsBeforeOnexit(): js.Dynamic = js.native
    def getEvents(): js.Dynamic = js.native
    def getName(): js.Dynamic = js.native
    def getOnentry(): js.Dynamic = js.native
    def getOnexit(): js.Dynamic = js.native
    protected def initAutoActionsAfterOnentry(value: js.Any): js.Dynamic = js.native
    protected def initAutoActionsAfterOnexit(value: js.Any): js.Dynamic = js.native
    protected def initAutoActionsBeforeOnentry(value: js.Any): js.Dynamic = js.native
    protected def initAutoActionsBeforeOnexit(value: js.Any): js.Dynamic = js.native
    protected def initEvents(value: js.Any): js.Dynamic = js.native
    protected def initName(value: js.Any): js.Dynamic = js.native
    protected def initOnentry(value: js.Any): js.Dynamic = js.native
    protected def initOnexit(value: js.Any): js.Dynamic = js.native
    def resetAutoActionsAfterOnentry(): Unit = js.native
    def resetAutoActionsAfterOnexit(): Unit = js.native
    def resetAutoActionsBeforeOnentry(): Unit = js.native
    def resetAutoActionsBeforeOnexit(): Unit = js.native
    def resetEvents(): Unit = js.native
    def resetName(): Unit = js.native
    def resetOnentry(): Unit = js.native
    def resetOnexit(): Unit = js.native
    def setAutoActionsAfterOnentry(value: js.Any): js.Dynamic = js.native
    def setAutoActionsAfterOnexit(value: js.Any): js.Dynamic = js.native
    def setAutoActionsBeforeOnentry(value: js.Any): js.Dynamic = js.native
    def setAutoActionsBeforeOnexit(value: js.Any): js.Dynamic = js.native
    def setEvents(value: js.Any): js.Dynamic = js.native
    def setName(value: js.Any): js.Dynamic = js.native
    def setOnentry(value: js.Any): js.Dynamic = js.native
    def setOnexit(value: js.Any): js.Dynamic = js.native

}
@js.native
@JSName("qx.util.fsm.State")
object State extends js.Object {
    protected def _commonTransformAutoActions(actionType: String, value: js.Any, context: js.Any): js.Function = js.native

}
}
package qx.util.fsm {
@js.native
@JSName("qx.util.fsm.Transition")
class Transition protected () extends qx.core.Object {
    def this(transitionName: String = ???, transitionInfo: js.Any = ???) = this()
    def getAutoActionsAfterOntransition(): js.Dynamic = js.native
    def getAutoActionsBeforeOntransition(): js.Dynamic = js.native
    def getName(): String = js.native
    def getNextState(): js.Dynamic = js.native
    def getOntransition(): js.Dynamic = js.native
    def getPredicate(): js.Dynamic = js.native
    protected def initAutoActionsAfterOntransition(value: js.Any): js.Dynamic = js.native
    protected def initAutoActionsBeforeOntransition(value: js.Any): js.Dynamic = js.native
    protected def initName(value: js.Any): String = js.native
    protected def initNextState(value: js.Any): js.Dynamic = js.native
    protected def initOntransition(value: js.Any): js.Dynamic = js.native
    protected def initPredicate(value: js.Any): js.Dynamic = js.native
    def resetAutoActionsAfterOntransition(): Unit = js.native
    def resetAutoActionsBeforeOntransition(): Unit = js.native
    def resetName(): Unit = js.native
    def resetNextState(): Unit = js.native
    def resetOntransition(): Unit = js.native
    def resetPredicate(): Unit = js.native
    def setAutoActionsAfterOntransition(value: js.Any): js.Dynamic = js.native
    def setAutoActionsBeforeOntransition(value: js.Any): js.Dynamic = js.native
    def setName(value: js.Any): String = js.native
    def setNextState(value: js.Any): js.Dynamic = js.native
    def setOntransition(value: js.Any): js.Dynamic = js.native
    def setPredicate(value: js.Any): js.Dynamic = js.native

}
}
package qx.util.placement {
@js.native
@JSName("qx.util.placement.AbstractAxis")
class AbstractAxis extends js.Object {

}
@js.native
@JSName("qx.util.placement.AbstractAxis")
object AbstractAxis extends js.Object {
    protected def _isInRange(start: Int, size: Int, areaSize: Int): Boolean = js.native
    protected def _moveToEdgeAndAlign(size: Int, target: js.Any, offsets: js.Any, position: String): Int = js.native
    def computeStart(size: Int, target: js.Any, offsets: js.Any, areaSize: Int, position: String): Int = js.native

}
}
package qx.util.placement {
@js.native
@JSName("qx.util.placement.BestFitAxis")
class BestFitAxis extends js.Object {

}
@js.native
@JSName("qx.util.placement.BestFitAxis")
object BestFitAxis extends js.Object {
    def computeStart(size: Int, target: js.Any, offsets: js.Any, areaSize: Int, position: String): Int = js.native

}
}
package qx.util.placement {
@js.native
@JSName("qx.util.placement.DirectAxis")
class DirectAxis extends js.Object {

}
@js.native
@JSName("qx.util.placement.DirectAxis")
object DirectAxis extends js.Object {
    def computeStart(size: Int, target: js.Any, offsets: js.Any, areaSize: Int, position: String): Int = js.native

}
}
package qx.util.placement {
@js.native
@JSName("qx.util.placement.KeepAlignAxis")
class KeepAlignAxis extends js.Object {

}
@js.native
@JSName("qx.util.placement.KeepAlignAxis")
object KeepAlignAxis extends js.Object {
    def computeStart(size: Int, target: js.Any, offsets: js.Any, areaSize: Int, position: String): Int = js.native

}
}
package qx.util.placement {
@js.native
@JSName("qx.util.placement.Placement")
class Placement extends qx.core.Object {
    def compute(size: js.Any, area: js.Any, target: js.Any, offsets: js.Any): js.Dynamic = js.native
    def getAlign(): js.Dynamic = js.native
    def getAxisX(): qx.Class = js.native
    def getAxisY(): qx.Class = js.native
    def getEdge(): js.Dynamic = js.native
    protected def initAlign(value: js.Any): js.Dynamic = js.native
    protected def initAxisX(value: js.Any): qx.Class = js.native
    protected def initAxisY(value: js.Any): qx.Class = js.native
    protected def initEdge(value: js.Any): js.Dynamic = js.native
    def resetAlign(): Unit = js.native
    def resetAxisX(): Unit = js.native
    def resetAxisY(): Unit = js.native
    def resetEdge(): Unit = js.native
    def setAlign(value: js.Any): js.Dynamic = js.native
    def setAxisX(value: js.Any): qx.Class = js.native
    def setAxisY(value: js.Any): qx.Class = js.native
    def setEdge(value: js.Any): js.Dynamic = js.native

}
@js.native
@JSName("qx.util.placement.Placement")
object Placement extends js.Object {

}
}
package qx.xml {
@js.native
@JSName("qx.xml.Document")
class Document extends js.Object {

}
@js.native
@JSName("qx.xml.Document")
object Document extends js.Object {
    def create(namespaceUri: String = ???, qualifiedName: String = ???): Document = js.native
    def fromString(str: String): Document = js.native
    def isXmlDocument(elem: Document): Boolean = js.native

}
}
package qx.xml {
@js.native
@JSName("qx.xml.Element")
class Element extends js.Object {

}
@js.native
@JSName("qx.xml.Element")
object Element extends js.Object {
    def createSubElementNS(document: Document, parent: HTMLElement, name: String, namespaceUri: String): HTMLElement = js.native
    def getAttributeNS(element: HTMLElement, namespaceUri: String, name: String): String = js.native
    def getElementsByTagNameNS(element: HTMLElement, namespaceURI: js.Any, tagname: String): js.Array[HTMLElement] = js.native
    def getSingleNodeText(element: HTMLElement, query: String): String = js.native
    def selectNodes(element: HTMLElement, query: String, namespaces: js.Any): js.Array[HTMLElement] = js.native
    def selectSingleNode(element: HTMLElement, query: String, namespaces: js.Any): HTMLElement = js.native
    def serialize(element: HTMLElement): String = js.native
    def setAttributeNS(document: Document, element: HTMLElement, namespaceUri: String, name: String, value: String): Unit = js.native

}
}
package qx.xml {
@js.native
@JSName("qx.xml.String")
class String extends js.Object {

}
@js.native
@JSName("qx.xml.String")
object String extends js.Object {
    def escape(str: String): String = js.native
    def unescape(str: String): String = js.native

}
}
package qx.ui.command {
@js.native
@JSName("qx.ui.command.Command")
class Command protected () extends qx.core.Object {
    def this(shortcut: String = ???) = this()
    protected def _applyActive(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyEnabled(value: Boolean, old: Boolean): Unit = js.native
    protected def _applyShortcut(value: String, old: String): Unit = js.native
    def execute(target: js.Any = ???): Unit = js.native
    def getActive(): Boolean = js.native
    def getEnabled(): Boolean = js.native
    def getIcon(): String = js.native
    def getLabel(): String = js.native
    def getMenu(): qx.ui.menu.Menu = js.native
    def getShortcut(): String = js.native
    def getToolTipText(): String = js.native
    def getValue(): js.Dynamic = js.native
    protected def initActive(value: js.Any): Boolean = js.native
    protected def initEnabled(value: js.Any): Boolean = js.native
    protected def initIcon(value: js.Any): String = js.native
    protected def initLabel(value: js.Any): String = js.native
    protected def initMenu(value: js.Any): qx.ui.menu.Menu = js.native
    protected def initShortcut(value: js.Any): String = js.native
    protected def initToolTipText(value: js.Any): String = js.native
    protected def initValue(value: js.Any): js.Dynamic = js.native
    def isActive(): Boolean = js.native
    def isEnabled(): Boolean = js.native
    def resetActive(): Unit = js.native
    def resetEnabled(): Unit = js.native
    def resetIcon(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetMenu(): Unit = js.native
    def resetShortcut(): Unit = js.native
    def resetToolTipText(): Unit = js.native
    def resetValue(): Unit = js.native
    def setActive(value: js.Any): Boolean = js.native
    def setEnabled(value: js.Any): Boolean = js.native
    def setIcon(value: js.Any): String = js.native
    def setLabel(value: js.Any): String = js.native
    def setMenu(value: js.Any): qx.ui.menu.Menu = js.native
    def setShortcut(value: js.Any): String = js.native
    def setToolTipText(value: js.Any): String = js.native
    def setValue(value: js.Any): js.Dynamic = js.native
    def toggleActive(): Boolean = js.native
    def toggleEnabled(): Boolean = js.native

}
}
package qx.ui.command {
@js.native
@JSName("qx.ui.command.Group")
class Group extends qx.core.Object {
    protected def _applyActive(value: Boolean, old: Boolean): Unit = js.native
    def add(key: String, command: qx.ui.command.Command): Boolean = js.native
//	override def get(key: String): qx.ui.command.Command = js.native
    def getActive(): Boolean = js.native
    def has(key: String): Boolean = js.native
    protected def initActive(value: js.Any): Boolean = js.native
    def isActive(): Boolean = js.native
    def remove(key: String): qx.ui.command.Command = js.native
    def resetActive(): Unit = js.native
    def setActive(value: js.Any): Boolean = js.native
    def toggleActive(): Boolean = js.native

}
}
package qx.ui.command {
@js.native
@JSName("qx.ui.command.GroupManager")
class GroupManager extends qx.core.Object {
    protected def _getGroup(group: qx.ui.command.Group): qx.ui.command.Group = js.native
    def add(group: qx.ui.command.Group): Boolean = js.native
    def block(): Unit = js.native
    def getActive(): qx.ui.command.Group = js.native
    def has(group: qx.ui.command.Group): Boolean = js.native
    def remove(group: qx.ui.command.Group): qx.ui.command.Group = js.native
    def setActive(group: qx.ui.command.Group): Boolean = js.native
    def unblock(): Unit = js.native

}
}
