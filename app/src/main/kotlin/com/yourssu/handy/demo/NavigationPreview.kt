package com.yourssu.handy.demo

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yourssu.handy.compose.BottomNavItem
import com.yourssu.handy.compose.Navigation
import com.yourssu.handy.compose.R

@Preview(showBackground = true)
@Composable
fun NavigationPreview() {
    val items = listOf(
        BottomNavItem(
            icon = R.drawable.home,
            label = "Label"
        ),
        BottomNavItem(
            icon = R.drawable.home,
            label = "Label"
        ),
        BottomNavItem(
            icon = R.drawable.home,
            label = "Label"
        ),
        BottomNavItem(
            icon = R.drawable.home,
            label = "Label"
        ),
        BottomNavItem(
            icon = R.drawable.home,
            label = "Label"
        ),
    )

    Navigation(
        items = items,
        selectedIndex = 0,
        onItemSelected = {}
    )
}