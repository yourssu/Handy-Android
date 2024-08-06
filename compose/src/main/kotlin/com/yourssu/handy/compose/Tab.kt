package com.yourssu.handy.compose

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times
import com.yourssu.handy.compose.TabBarDefaults.tabIndicatorOffset
import com.yourssu.handy.compose.foundation.HandyTypography
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

/**
 * [Tab]은 고정 또는 스크롤 가능한 탭 행을 렌더링합니다.
 *
 * 탭의 수에 따라 3개 이하의 경우 고정된 탭 행을,
 * 4개 이상의 경우 스크롤 가능한 탭 행을 생성합니다.
 * 각 탭은 선택 시 지정된 인덱스를 기반으로 인디케이터를 업데이트합니다.
 *
 * @param tabs 탭에 표시할 문자열 목록
 * @param selectedTabIndex 현재 선택된 탭의 인덱스
 * @param onTabSelected 사용자가 탭을 선택할 때 호출되는 콜백, 선택된 탭의 인덱스를 반환
 * @param backgroundColor 탭 바의 배경색
 * @param selectedContentColor 선택된 탭의 텍스트 색상, 인디케이터 색상
 * @param unselectedContentColor 선택되지 않은 탭의 텍스트 색상
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
                TabItem(
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
        ScrollableTab(
            selectedTabIndex = selectedTabIndex,
            backgroundColor = backgroundColor,
            contentColor = selectedContentColor
        ) {
            tabs.forEachIndexed { index, title ->
                TabItem(
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
    }
}

private val tabHeight = 48.dp

@Composable
fun TabItem(
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

/**
 * [FixedTab]에는 [TabItem] 행이 포함되어 있으며 현재 선택된 탭 아래에 인디케이터가 표시됩니다.
 * [FixedTab]은 전체 행을 따라 균등한 간격으로 탭을 배치하며 각 탭은 동일한 공간을 차지합니다.
 *
 * 스크롤되지 않습니다. 각 탭의 너비는 전체 너비의 1/n입니다.
 * 최소 2개, 최대 3개 탭을 사용해주세요.
 *
 * 기기에 따른 변화는 없습니다.
 *
 * @param selectedTabIndex 현재 선택된 탭의 인덱스
 * @param backgroundColor Tab의 배경색
 * @param contentColor Tab의 콘텐츠 색상
 * @param tabs 이 Tab 내부의 탭
 */
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
                            TabBarDefaults.Divider()
                        }
                    ).forEach {
                        val placeableDivider = it.measure(
                            constraints.copy(
                                minWidth = tabBarWidth,
                                maxWidth = tabBarWidth
                            )
                        )
                        placeableDivider.placeRelative(
                            x = 0,
                            y = tabBarHeight - placeableDivider.height
                        )
                    }

                    subcompose(
                        slotId = TabSlots.Indicator,
                        content = {
                            TabBarDefaults.Indicator(
                                color = contentColor,
                                modifier = Modifier.tabIndicatorOffset(
                                    currentTabPosition = tabPositions[selectedTabIndex],
                                    tabMargin = 28.dp
                                )
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

/**
 * [ScrollableTab]에는 [TabItem] 행이 포함되어 있으며 현재 탭 아래에 인디케이터가 표시됩니다.
 *
 * 스크롤됩니다. 각 탭의 너비는 88로 고정되어 있습니다.
 * 최소 4개, 최대 탭 수에는 제한이 없습니다.
 * 모바일 기기의 경우 첫 번째 탭 왼쪽 및 마지막 탭의 오른쪽에 16의 여백이 있습니다.
 *
 * @param selectedTabIndex 현재 선택된 탭의 인덱스
 * @param backgroundColor ScrollableTab의 배경색
 * @param contentColor 이 ScrollableTab이 제공하는 기본 콘텐츠 색상
 * @param tabs 이 ScrollableTab 내부의 탭들
 */
@Composable
fun ScrollableTab(
    selectedTabIndex: Int,
    backgroundColor: Color,
    contentColor: Color,
    modifier: Modifier = Modifier,
    tabs: @Composable () -> Unit
) {
    Surface(
        modifier = modifier,
        backgroundColor = backgroundColor,
        contentColor = contentColor
    ) {
        val scrollState = rememberScrollState()
        val coroutineScope = rememberCoroutineScope()
        val scrollableTabData = remember(scrollState, coroutineScope) {
            ScrollableTabData(
                scrollState = scrollState,
                coroutineScope = coroutineScope
            )
        }
        SubcomposeLayout(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(align = Alignment.CenterStart)
                .horizontalScroll(scrollState)
                .selectableGroup()
                .clipToBounds()
        ) { constraints ->
            val minTabWidth = TabBarDefaults.ScrollableTabWidth.roundToPx()
            val edgePadding = TabBarDefaults.ScrollableTabPadding.roundToPx()
            val tabConstraints = constraints.copy(minWidth = minTabWidth)

            val placeableTabs = subcompose(
                slotId = TabSlots.Tabs,
                content = {
                    tabs()
                }
            ).map { it.measure(tabConstraints) }

            var tabBarWidth = edgePadding * 2
            val tabBarHeight = placeableTabs.first().height

            placeableTabs.forEach {
                tabBarWidth += it.width
            }

            layout(tabBarWidth, tabBarHeight) {
                val tabPositions = mutableListOf<TabPosition>()
                var left = edgePadding

                placeableTabs.forEach {
                    it.placeRelative(
                        x = left,
                        y = 0
                    )
                    tabPositions.add(
                        TabPosition(
                            left = left.toDp(),
                            width = it.width.toDp()
                        )
                    )
                    left += it.width
                }

                subcompose(
                    slotId = TabSlots.Divider,
                    content = {
                        TabBarDefaults.Divider()
                    }
                ).forEach {
                    val placeableDivider = it.measure(
                        constraints.copy(
                            minWidth = tabBarWidth,
                            maxWidth = tabBarWidth
                        )
                    )
                    placeableDivider.placeRelative(
                        x = 0,
                        y = tabBarHeight - placeableDivider.height
                    )
                }

                subcompose(
                    slotId = TabSlots.Indicator,
                    content = {
                        TabBarDefaults.Indicator(
                            color = contentColor,
                            modifier = Modifier.tabIndicatorOffset(
                                currentTabPosition = tabPositions[selectedTabIndex],
                                tabMargin = 18.dp
                            )
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

                scrollableTabData.onLaidOut(
                    density = this@SubcomposeLayout,
                    edgeOffset = edgePadding,
                    tabPositions = tabPositions,
                    selectedTab = selectedTabIndex
                )
            }
        }

    }
}

private class ScrollableTabData(
    private val scrollState: ScrollState,
    private val coroutineScope: CoroutineScope
) {
    private var selectedTab: Int? = null

    fun onLaidOut(
        density: Density,
        edgeOffset: Int,
        tabPositions: List<TabPosition>,
        selectedTab: Int
    ) {
        if (this.selectedTab != selectedTab) {
            this.selectedTab = selectedTab
            tabPositions.getOrNull(selectedTab)?.let {
                val calculatedOffset = it.calculateTabOffset(density, edgeOffset, tabPositions)
                if (scrollState.value != calculatedOffset) {
                    coroutineScope.launch {
                        scrollState.animateScrollTo(
                            calculatedOffset,
                            animationSpec = ScrollableTabRowScrollSpec
                        )
                    }
                }
            }
        }
    }

    /**
     * 탭 내부에서 탭을 수평으로 중앙에 배치하는 데 필요한 오프셋을 반환합니다.
     */
    private fun TabPosition.calculateTabOffset(
        density: Density,
        edgeOffset: Int,
        tabPositions: List<TabPosition>
    ): Int = with(density) {
        val totalTabRowWidth = tabPositions.last().right.roundToPx() + edgeOffset
        val visibleWidth = totalTabRowWidth - scrollState.maxValue
        val tabOffset = left.roundToPx()
        val scrollerCenter = visibleWidth / 2
        val tabWidth = width.roundToPx()
        val centeredTabOffset = tabOffset - (scrollerCenter - tabWidth / 2)
        val availableSpace = (totalTabRowWidth - visibleWidth).coerceAtLeast(0)
        return centeredTabOffset.coerceIn(0, availableSpace)
    }
}

private val ScrollableTabRowScrollSpec: AnimationSpec<Float> = tween(
    durationMillis = 250,
    easing = FastOutSlowInEasing
)

private enum class TabSlots {
    Tabs,
    Divider,
    Indicator
}

@Immutable
class TabPosition internal constructor(val left: Dp, val width: Dp) {
    val right: Dp get() = left + width

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
    /**
     * 기본 [Divider]로, 인디케이터 아래에 있는 탭의 하단에 배치됩니다.
     *
     * @param thickness 구분선의 두께
     * @param color 구분선의 색상
     */
    @Composable
    fun Divider(
        thickness: Dp = 1.dp,
        color: Color = HandyTheme.colors.lineBasicLight
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(thickness)
                .background(color)
        )
    }

    /**
     * 기본 인디케이터로, 구분선 위에 있는 탭의 하단에 배치됩니다.
     *
     * @param modifier 인디케이터의 레이아웃에 대한 수정자
     * @param height 인디케이터의 높이
     * @param color 인디케이터의 색상
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
     * Tab 내부의 사용 가능한 모든 너비를 차지한 다음, [currentTabPosition]에 따라
     * 적용되는 인디케이터의 오프셋을 애니메이션하는 [Modifier]
     *
     * @param currentTabPosition 현재 선택된 탭의 [TabPosition]
     * 이 수정자가 적용되는 인디케이터의 오프셋과 너비를 계산하는 데 사용됩니다.
     */

    /**
     * Tab의 인디케이터를 현재 탭 위치에 맞게 오프셋하고, 인디케이터가 탭의 전체 너비를 차지하도록 설정합니다.
     * 고정된 탭(Tab)에서 사용되며, 탭의 너비에 따라 인디케이터의 위치를 조정합니다.
     *
     * @param currentTabPosition 현재 선택된 탭의 [TabPosition]
     * 이 수정자가 적용되는 인디케이터의 오프셋과 너비를 계산하는 데 사용됩니다.
     * 인디케이터는 탭의 전체 너비와 동일한 너비를 가지며, 선택된 탭의 시작 위치에 맞춰서 배치됩니다.
     */
    fun Modifier.tabIndicatorOffset(
        currentTabPosition: TabPosition,
        tabMargin: Dp
    ): Modifier = composed {
        val indicatorWidth = currentTabPosition.width - (2 * tabMargin)
        val indicatorOffset = currentTabPosition.left + tabMargin

        fillMaxWidth()
            .wrapContentSize(Alignment.BottomStart)
            .offset(x = indicatorOffset)
            .width(indicatorWidth)
    }

    /**
     * [ScrollableTab]에서 탭 앞의 시작 가장자리로부터의 기본 여백
     */
    val ScrollableTabPadding: Dp = 16.dp

    /**
     * [ScrollableTab]에서 탭의 기본 너비
     */
    val ScrollableTabWidth: Dp = 88.dp
}