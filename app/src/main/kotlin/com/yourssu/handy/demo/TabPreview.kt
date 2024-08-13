package com.yourssu.handy.demo

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.yourssu.handy.compose.FixedTab
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.ScrollableTab
import com.yourssu.handy.compose.TabItem

@Preview(showBackground = true)
@Composable
private fun FixedTabPreview() {
    var tabIndex by remember { mutableIntStateOf(0) }
    val fixedTabs = listOf("Tab1", "Tab2")
    HandyTheme {
        Column {
            FixedTab(
                selectedTabIndex = tabIndex,
            ) {
                fixedTabs.forEachIndexed { index, title ->
                    TabItem(
                        text = title,
                        selected = index == tabIndex,
                        onClick = {
                            tabIndex = index
                        },
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ScrollableTabPreview() {
    var tabIndex by remember { mutableIntStateOf(0) }
    val scrollableTabs = listOf("안드로이드", "Tab2", "Tab3", "Tab4", "Tab5", "Tab6")
    HandyTheme {
        Column {
            ScrollableTab(
                selectedTabIndex = tabIndex
            ) {
                scrollableTabs.forEachIndexed { index, title ->
                    TabItem(
                        text = title,
                        selected = index == tabIndex,
                        onClick = {
                            tabIndex = index
                        }
                    )
                }
            }
        }
    }
}