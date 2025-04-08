package com.yourssu.handy.demo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.yourssu.handy.compose.BottomNavItem
import com.yourssu.handy.compose.Navigation
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.filled.Home

@Preview(showBackground = true)
@Composable
fun NavigationPreview() {
    val items = listOf(
        BottomNavItem(
            icon = HandyIcons.Filled.Home,
            label = "Label"
        ),
        BottomNavItem(
            icon = HandyIcons.Filled.Home,
            label = "Label"
        ),
        BottomNavItem(
            icon = HandyIcons.Filled.Home,
            label = "Label"
        ),
        BottomNavItem(
            icon = HandyIcons.Filled.Home,
            label = "Label"
        ),
        BottomNavItem(
            icon = HandyIcons.Filled.Home,
            label = "Label"
        ),
    )

    Column {
        Spacer(modifier = Modifier.weight(1f))
        Navigation(
            items = items,
            selectedIndex = 0,
            onItemSelected = {}
        )
    }
}