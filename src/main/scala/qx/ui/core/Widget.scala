
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

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
    protected def _onBeforeContextMenuOpen(e: qx.event.typ.Data): Unit = js.native
    protected def _onContextMenuOpen(e: qx.event.typ.Pointer): Unit = js.native
    protected def _onDrag(e: qx.event.typ.Drag): Unit = js.native
    protected def _onDragChange(e: qx.event.typ.Drag): Unit = js.native
    protected def _onDragEnd(e: qx.event.typ.Drag): Unit = js.native
    protected def _onDragStart(e: qx.event.typ.Drag): Unit = js.native
    protected def _onStopEvent(e: qx.event.typ.Event): Unit = js.native
    protected def _releaseChildControl(id: String): qx.ui.core.Widget = js.native
    protected def _remove(child: qx.ui.core.LayoutItem): Unit = js.native
    protected def _removeAll(): js.Array[js.Any] = js.native
    protected def _removeAt(index: Int): qx.ui.core.LayoutItem = js.native
    protected def _setLayout(layout: qx.ui.layout.Abstract): Unit = js.native
    protected def _showChildControl(id: String): qx.ui.core.Widget = js.native
    def activate(): Unit = js.native
    def addChildrenToQueue(queue: js.Array[js.Any]): Unit = js.native
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
    protected def initAnonymous(value: Boolean): Boolean = js.native
    protected def initAppearance(value: String): String = js.native
    protected def initBackgroundColor(value: String): String = js.native
    protected def initBlockToolTip(value: Boolean): Boolean = js.native
    protected def initContextMenu(value: qx.ui.menu.Menu): qx.ui.menu.Menu = js.native
    protected def initCursor(value: String): String = js.native
    protected def initDecorator(value: qx.ui.decoration.Decorator): qx.ui.decoration.Decorator = js.native
    protected def initDraggable(value: Boolean): Boolean = js.native
    protected def initDroppable(value: Boolean): Boolean = js.native
    protected def initEnabled(value: Boolean): Boolean = js.native
    protected def initFocusable(value: Boolean): Boolean = js.native
    protected def initFont(value: String): String = js.native
    protected def initKeepActive(value: Boolean): Boolean = js.native
    protected def initKeepFocus(value: Boolean): Boolean = js.native
    protected def initNativeContextMenu(value: Boolean): Boolean = js.native
    protected def initOpacity(value: Long): Long = js.native
    protected def initPaddingBottom(value: Int): Int = js.native
    protected def initPaddingLeft(value: Int): Int = js.native
    protected def initPaddingRight(value: Int): Int = js.native
    protected def initPaddingTop(value: Int): Int = js.native
    protected def initSelectable(value: Boolean): Boolean = js.native
    protected def initShowToolTipWhenDisabled(value: Boolean): Boolean = js.native
    protected def initTabIndex(value: Int): Int = js.native
    protected def initTextColor(value: String): String = js.native
    protected def initToolTip(value: qx.ui.tooltip.ToolTip): qx.ui.tooltip.ToolTip = js.native
    protected def initToolTipIcon(value: String): String = js.native
    protected def initToolTipText(value: String): String = js.native
    protected def initVisibility(value: js.Any): js.Dynamic = js.native
    protected def initZIndex(value: Int): Int = js.native
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
    def setAnonymous(value: Boolean): Boolean = js.native
    def setAppearance(value: String): String = js.native
    def setBackgroundColor(value: String): String = js.native
    def setBlockToolTip(value: Boolean): Boolean = js.native
    def setContextMenu(value: qx.ui.menu.Menu): qx.ui.menu.Menu = js.native
    def setCursor(value: String): String = js.native
    def setDecorator(value: qx.ui.decoration.Decorator): qx.ui.decoration.Decorator = js.native
    def setDomLeft(value: Int): Unit = js.native
    def setDomPosition(left: Int, top: Int): Unit = js.native
    def setDomTop(value: Int): Unit = js.native
    def setDraggable(value: Boolean): Boolean = js.native
    def setDroppable(value: Boolean): Boolean = js.native
    def setEnabled(value: Boolean): Boolean = js.native
    def setFocusable(value: Boolean): Boolean = js.native
    def setFont(value: String): String = js.native
    def setKeepActive(value: Boolean): Boolean = js.native
    def setKeepFocus(value: Boolean): Boolean = js.native
    def setNativeContextMenu(value: Boolean): Boolean = js.native
    def setOpacity(value: Long): Long = js.native
    def setPadding(paddingTop: js.Any, paddingRight: js.Any, paddingBottom: js.Any, paddingLeft: js.Any): Unit = js.native
    def setPaddingBottom(value: Int): Int = js.native
    def setPaddingLeft(value: Int): Int = js.native
    def setPaddingRight(value: Int): Int = js.native
    def setPaddingTop(value: Int): Int = js.native
    def setSelectable(value: Boolean): Boolean = js.native
    def setShowToolTipWhenDisabled(value: Boolean): Boolean = js.native
    def setTabIndex(value: Int): Int = js.native
    def setTextColor(value: String): String = js.native
    def setToolTip(value: qx.ui.tooltip.ToolTip): qx.ui.tooltip.ToolTip = js.native
    def setToolTipIcon(value: String): String = js.native
    def setToolTipText(value: String): String = js.native
    def setVisibility(value: js.Any): js.Dynamic = js.native
    def setZIndex(value: Int): Int = js.native
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
