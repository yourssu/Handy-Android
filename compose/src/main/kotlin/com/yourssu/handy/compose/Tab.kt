package com.yourssu.handy.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.TabBarDefaults.tabIndicatorOffset
import com.yourssu.handy.compose.foundation.HandyTypography

/**
 *
 */

@Composable
fun Tab(
    tabs: List<String>,
    selectedTabIndex: Int,
    onTabSelected: (index: Int) -> Unit,
    backgroundColor: Color = HandyTheme.colors.bgBasicDefault,
    selectedContentColor: Color = HandyTheme.colors.textBasicPrimary,
    unselectedContentColor: Color = HandyTheme.colors.textBasicTertiary
) {
    if (tabs.size <= 3) {
        FixedTab(
            selectedTabIndex = selectedTabIndex,
            backgroundColor = backgroundColor,
            contentColor = selectedContentColor
        ) {
            tabs.forEachIndexed { index, title ->
                TabTitle(
                    text = title,
                    selected = index == selectedTabIndex,
                    onClick = {
                        onTabSelected(index)
                    },
                    selectedContentColor = selectedContentColor,
                    unselectedContentColor = unselectedContentColor
                )
            }
        }
    } else {
        //TODO : ScrollableTab
    }
}

private val tabHeight = 48.dp

@Composable
fun TabTitle(
    selected: Boolean,
    onClick: () -> Unit,
    text: String,
    selectedContentColor: Color,
    unselectedContentColor: Color,
    modifier: Modifier = Modifier,
) {
    val color = if (selected) selectedContentColor else unselectedContentColor

    Surface(
        selected = selected,
        onClick = onClick,
        modifier = modifier.height(tabHeight),
        enabled = true,
    ) {
        Box(
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = text,
                color = color,
                style = HandyTypography.B1Sb16
            )
        }
    }
}

@Composable
fun FixedTab(
    selectedTabIndex: Int,
    backgroundColor: Color,
    contentColor: Color,
    modifier: Modifier = Modifier,
    tabs: @Composable () -> Unit
) {
    Surface(
        modifier = modifier.selectableGroup(),
        backgroundColor = backgroundColor,
        contentColor = contentColor
    ) {
        SubcomposeLayout(
            modifier = modifier.fillMaxWidth(),
            measurePolicy = { constraints ->
                val tabBarWidth = constraints.maxWidth
                val measurableTabs = subcompose(
                    slotId = TabSlots.Tabs,
                    content = tabs
                )
                val tabCount = measurableTabs.size

                require(tabCount in 2..3) {
                    "Tab count should be between 2 and 3"
                }

                val tabWidth = (tabBarWidth / tabCount)
                val placeableTabs = measurableTabs.map {
                    it.measure(
                        constraints.copy(
                            minWidth = tabWidth,
                            maxWidth = tabWidth
                        )
                    )
                }
                val tabBarHeight = placeableTabs.first().height

                val tabPositions = List(tabCount) { index ->
                    TabPosition(
                        left = (tabWidth * index).toDp(),
                        width = tabWidth.toDp()
                    )
                }

                layout(tabBarWidth, tabBarHeight) {
                    placeableTabs.forEachIndexed { index, placeable ->
                        placeable.placeRelative(
                            x = index * tabWidth,
                            y = 0
                        )
                    }

                    subcompose(
                        slotId = TabSlots.Divider,
                        content = {
                            TabBarDefaults.Indicator(
                                color = contentColor,
                                modifier = Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex])
                            )
                        }
                    ).forEach {
                        val placeableIndicator = it.measure(
                            Constraints.fixed(tabBarWidth, tabBarHeight)
                        )
                        placeableIndicator.placeRelative(
                            x = 0,
                            y = 0
                        )
                    }
                }
            }
        )
    }
}

@Composable
fun ScrollableTab(

) {

}

private enum class TabSlots {
    Tabs,
    Divider,
    Indicator
}

@Immutable
class TabPosition internal constructor(val left: Dp, val width: Dp) {
    private val right: Dp get() = left + width

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TabPosition) return false

        if (left != other.left) return false
        if (width != other.width) return false

        return true
    }

    override fun hashCode(): Int {
        var result = left.hashCode()
        result = 31 * result + width.hashCode()
        return result
    }

    override fun toString(): String {
        return "TabPosition(left=$left, right=$right, width=$width)"
    }
}

object TabBarDefaults {
//    /**
//     * Default [Divider], which will be positioned at the bottom of the TabBar, underneath the
//     * indicator.
//     *
//     * @param direction direction of the divider
//     * @param thickness thickness of the divider
//     */
//    @Composable
//    fun Divider(
//        direction: Direction = Direction.Horizontal,
//        thickness: Thickness = Thickness.Thin,
//        color: Color = HandyTheme.colors.bgBasicBlack
//    ) {
//        if (direction == Direction.Horizontal) {
//            CustomHorizontalDivider(
//                thickness = if (thickness == Thickness.Thin) 1.dp else 2.dp,
//                color = color
//            )
//        } else {
//            CustomVerticalDivider(
//                thickness = if (thickness == Thickness.Thin) 1.dp else 2.dp,
//                color = color
//            )
//        }
//    }

    /**
     * Default indicator, which will be positioned at the bottom of the TabBar, on top of the
     * divider.
     *
     * @param modifier modifier for the indicator's layout
     * @param height height of the indicator
     * @param color color of the indicator
     */
    @Composable
    fun Indicator(
        modifier: Modifier = Modifier,
        height: Dp = 2.dp,
        color: Color = HandyTheme.colors.bgBasicBlack
    ) {
        Box(
            modifier
                .fillMaxWidth()
                .height(height)
                .background(color = color)
        )
    }

    /**
     * [Modifier] that takes up all the available width inside the TabBar, and then animates
     * the offset of the indicator it is applied to, depending on the [currentTabPosition].
     *
     * @param currentTabPosition [TabPosition] of the currently selected tab. This is used to
     * calculate the offset of the indicator this modifier is applied to, as well as its width.
     */
    fun Modifier.tabIndicatorOffset(
        currentTabPosition: TabPosition
    ): Modifier = composed {
        val currentTabWidth = currentTabPosition.width
        val indicatorOffset = currentTabPosition.left

        fillMaxWidth()
            .wrapContentSize(Alignment.BottomStart)
            .offset(x = indicatorOffset)
            .width(currentTabWidth)
    }

    /**
     * The default padding from the starting edge before a tab in a [ScrollableTabBar].
     */
    val ScrollableTabPadding: Dp = 16.dp

    /**
     * The default width of a [Tab] when tab is in [ScrollableTabBar].
     */
    val ScrollableTabWidth: Dp = 88.dp
}

@Composable
fun CustomHorizontalDivider(
    thickness: Dp = 1.dp,
    color: Color = Color.Gray
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(thickness)
            .background(color)
    )
}

@Composable
fun CustomVerticalDivider(
    thickness: Dp = 1.dp,
    color: Color = Color.Gray
) {
    Box(
        modifier = Modifier
            .width(thickness)
            .fillMaxHeight()
            .background(color)
    )
}

enum class Direction {
    Horizontal,
    Vertical
}

enum class Thickness {
    Thin,
    Thick
}
