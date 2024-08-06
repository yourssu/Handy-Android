package com.yourssu.handy.demo

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.Tab

@Preview(showBackground = true)
@Composable
private fun FixedTabPreview() {
    var tabIndex by remember { mutableIntStateOf(0) }
    val fixedTabs = listOf("Tab1", "Tab2")
    HandyTheme {
        Tab(
            tabs = fixedTabs,
            selectedTabIndex = tabIndex,
            onTabSelected = { index ->
                tabIndex = index
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ScrollableTabPreview() {
    var tabIndex by remember { mutableIntStateOf(0) }
    val scrollableTabs = listOf("Tab1", "Tab2", "Tab3", "Tab4")
    HandyTheme {
        Tab(
            tabs = scrollableTabs,
            selectedTabIndex = tabIndex,
            onTabSelected = { index ->
                tabIndex = index
            }
        )
    }
}