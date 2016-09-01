
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

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
    def assertArrayEquals(expected: js.Array[js.Any], found: js.Array[js.Any], msg: String): Unit = js.native
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
    def assertInArray(value: js.Any, array: js.Array[js.Any], msg: String): Unit = js.native
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
    def assertType(value: js.Any, typ: String, msg: String): Unit = js.native
    def assertUndefined(value: js.Any, msg: String): Unit = js.native
    def fail(msg: String, compact: Boolean): Unit = js.native

}
}
