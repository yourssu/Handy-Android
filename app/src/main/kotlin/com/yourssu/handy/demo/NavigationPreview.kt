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
            selectedIcon = R.drawable.home_selected,
            unselectedIcon = R.drawable.home,
            label = "홈"
        ),BottomNavItem(
            selectedIcon = R.drawable.home_selected,
            unselectedIcon = R.drawable.home,
            label = "홈"
        ),BottomNavItem(
            selectedIcon = R.drawable.home_selected,
            unselectedIcon = R.drawable.home,
            label = "홈"
        ),BottomNavItem(
            selectedIcon = R.drawable.home_selected,
            unselectedIcon = R.drawable.home,
            label = "홈"
        ),
        BottomNavItem(
            selectedIcon = R.drawable.home_selected,
            unselectedIcon = R.drawable.home,
            label = "홈"
        ),
    )

    Navigation(
        items = items,
        selectedIndex = 0,
        onItemSelected = {}
    )
}