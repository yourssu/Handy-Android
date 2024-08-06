package com.yourssu.handy.demo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.Tab

@Preview(showBackground = true)
@Composable
private fun TabPreview() {
    var tabIndex by remember { mutableIntStateOf(0) }
    val fixedTabs = listOf("Tab1", "Tab2")
    val scrollableTabs = listOf("Tab1", "Tab2", "Tab3", "Tab4")
    HandyTheme {
        Column {
            Tab(
                tabs = fixedTabs,
                selectedTabIndex = tabIndex,
                onTabSelected = { index ->
                    tabIndex = index
                }
            )
            Tab(
                tabs = scrollableTabs,
                selectedTabIndex = tabIndex,
                onTabSelected = { index ->
                    tabIndex = index
                }
            )
        }
    }
}