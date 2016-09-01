
import scala.scalajs.js
import org.scalajs.dom.raw._
import js.annotation._
import js.|

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
    protected def initAllowGrowX(value: Boolean): Boolean = js.native
    protected def initAllowGrowY(value: Boolean): Boolean = js.native
    protected def initAllowShrinkX(value: Boolean): Boolean = js.native
    protected def initAllowShrinkY(value: Boolean): Boolean = js.native
    protected def initHeight(value: Int): Int = js.native
    protected def initMarginBottom(value: Int): Int = js.native
    protected def initMarginLeft(value: Int): Int = js.native
    protected def initMarginRight(value: Int): Int = js.native
    protected def initMarginTop(value: Int): Int = js.native
    protected def initMaxHeight(value: Int): Int = js.native
    protected def initMaxWidth(value: Int): Int = js.native
    protected def initMinHeight(value: Int): Int = js.native
    protected def initMinWidth(value: Int): Int = js.native
    protected def initWidth(value: Int): Int = js.native
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
    def setAllowGrowX(value: Boolean): Boolean = js.native
    def setAllowGrowY(value: Boolean): Boolean = js.native
    def setAllowShrinkX(value: Boolean): Boolean = js.native
    def setAllowShrinkY(value: Boolean): Boolean = js.native
    def setAllowStretchX(allowGrowX: js.Any, allowShrinkX: js.Any): Unit = js.native
    def setAllowStretchY(allowGrowY: js.Any, allowShrinkY: js.Any): Unit = js.native
    def setHeight(value: Int): Int = js.native
    def setLayoutParent(parent: qx.ui.core.Widget): Unit = js.native
    def setLayoutProperties(props: js.Any): Unit = js.native
    def setMargin(marginTop: js.Any, marginRight: js.Any, marginBottom: js.Any, marginLeft: js.Any): Unit = js.native
    def setMarginBottom(value: Int): Int = js.native
    def setMarginLeft(value: Int): Int = js.native
    def setMarginRight(value: Int): Int = js.native
    def setMarginTop(value: Int): Int = js.native
    def setMaxHeight(value: Int): Int = js.native
    def setMaxWidth(value: Int): Int = js.native
    def setMinHeight(value: Int): Int = js.native
    def setMinWidth(value: Int): Int = js.native
    def setUserBounds(left: Int, top: Int, width: Int, height: Int): Unit = js.native
    def setWidth(value: Int): Int = js.native
    def toggleAllowGrowX(): Boolean = js.native
    def toggleAllowGrowY(): Boolean = js.native
    def toggleAllowShrinkX(): Boolean = js.native
    def toggleAllowShrinkY(): Boolean = js.native
    def updateLayoutProperties(props: js.Any = ???): Unit = js.native

}
}
