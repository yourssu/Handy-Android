package com.yourssu.handy.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

/**
 * BottomNavItem : 하단 네비게이션 바의 아이템을 정의하는 데이터 클래스 입니다.
 *
 * @param selectedIcon 선택되었을 때의 아이콘
 * @param unselectedIcon 선택되지 않았을 때의 아이콘
 * @param label 아이템의 라벨
 */
data class BottomNavItem(
    val selectedIcon: Int,
    val unselectedIcon: Int,
    val label: String? = null
)

/**
 * BottomNavItem : 하단 네비게이션 바의 아이템 Composable 함수 입니다.
 *
 * @param item 하단 네비게이션 바의 아이템
 * @param isSelected 선택되었는지 여부
 * @param modifier Modifier
 * @param onClick 클릭 시 실행되는 함수
 */
@Composable
private fun BottomNavItem(
    item: BottomNavItem,
    isSelected: Boolean,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Column(
        modifier = modifier
            .clickable(onClick = onClick),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(
                id = if (isSelected) item.selectedIcon else item.unselectedIcon
            ),
            contentDescription = item.label,
            modifier = Modifier.size(24.dp)
        )

        if (item.label != null) {
            Text(
                text = item.label,
                fontSize = 12.dp
            )
        }
    }
}

/**
 * Navigation : 하단 네비게이션 바 Composable 함수 입니다.
 *
 * @param items 하단 네비게이션 바의 아이템 리스트
 * @param selectedIndex 선택된 아이템의 인덱스
 * @param onItemSelected 아이템 선택 시 실행되는 함수
 */
@Composable
fun Navigation(
    items: List<BottomNavItem>,
    selectedIndex: Int,
    onItemSelected: (Int) -> Unit
) {
    require(items.size in 3..5) { "Items size must be between 3 and 5" }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),
    ) {
//        Divider(thickness = Thickness.Thin) // Divider 추후 추가
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            items.forEachIndexed { index, item ->
                BottomNavItem(
                    item = item,
                    isSelected = index == selectedIndex,
                    modifier = Modifier.weight(1f),
                    onClick = { onItemSelected(index) }
                )
            }
        }
    }
}