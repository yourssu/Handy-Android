package com.yourssu.handy.compose

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.UiComposable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.SubcomposeLayout

/**
 *
*/

@Composable
fun FixedTab(
    selectedTabIndex : Int,
    modifier: Modifier = Modifier,
    backgroundColor : Color = HandyTheme.colors.bgBasicDefault,
    contentColor : Color = HandyTheme.colors.bgBasicBlack,
    tabs : @Composable () -> Unit
){
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

                require(tabCount in 2..4){
                    "Tab count should be between 2 and 4"
                }

                val tabWidth = (tabBarWidth / tabCount)
                val placeableTabs = measurableTabs.map {
                    it.measure(
                        constraints.copy(minWidth = tabWidth, maxWidth = tabWidth)
                    )
                }
                val tabBarHeight = placeableTabs.first().height

                layout(tabBarWidth ,tabBarHeight){

                }
            }
        )
    }
}

@Composable
fun ScrollableTab(){

}

private enum class TabSlots {
    Tabs,
    Divider,
    Indicator
}