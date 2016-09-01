
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

package qx.ui.form {
@js.native
@JSName("qx.ui.form.SplitButton")
class SplitButton protected () extends qx.ui.core.Widget with qx.ui.form.IExecutable with qx.ui.core.MExecutable {
    def this(label: String = ???, icon: String = ???, menu: qx.ui.menu.Menu = ???, command: qx.ui.command.Command = ???) = this()
    protected def _applyIcon(value: String, old: String): Unit = js.native
    protected def _applyLabel(value: String, old: String): Unit = js.native
    protected def _applyMenu(value: qx.ui.menu.Menu, old: qx.ui.menu.Menu): Unit = js.native
    protected def _applyShow(value: js.Any, old: js.Any): Unit = js.native
    protected def _onButtonExecute(e: qx.event.typ.Event): Unit = js.native
    protected def _onChangeMenuVisibility(e: qx.event.typ.Data): Unit = js.native
    protected def _onKeyDown(e: qx.event.typ.KeySequence): Unit = js.native
    protected def _onKeyUp(e: qx.event.typ.KeySequence): Unit = js.native
    protected def _onPointerOut(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onPointerOver(e: qx.event.typ.Pointer): Unit = js.native
    def getIcon(): String = js.native
    def getLabel(): String = js.native
    def getMenu(): qx.ui.menu.Menu = js.native
    def getShow(): js.Dynamic = js.native
    protected def initIcon(value: String): String = js.native
    protected def initLabel(value: String): String = js.native
    protected def initMenu(value: qx.ui.menu.Menu): qx.ui.menu.Menu = js.native
    protected def initShow(value: js.Any): js.Dynamic = js.native
    def resetIcon(): Unit = js.native
    def resetLabel(): Unit = js.native
    def resetMenu(): Unit = js.native
    def resetShow(): Unit = js.native
    def setIcon(value: String): String = js.native
    def setLabel(value: String): String = js.native
    def setMenu(value: qx.ui.menu.Menu): qx.ui.menu.Menu = js.native
    def setShow(value: js.Any): js.Dynamic = js.native

}
}
