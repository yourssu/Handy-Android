package com.yourssu.handy.demo

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.yourssu.handy.compose.FixedTab
import com.yourssu.handy.compose.HandyTheme
import com.yourssu.handy.compose.Tab

@Preview(showBackground = true)
@Composable
private fun TabPreview() {
    var tabIndex by remember { mutableIntStateOf(0) }
    val tabs = listOf("Tab1", "Tab2")
    HandyTheme {
        Column {
            FixedTab(selectedTabIndex = tabIndex) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        text = title,
                        selected = index == 0,
                        onClick = {
                            tabIndex = index
                        }
                    )
                }
            }
        }
    }
}