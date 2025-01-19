package com.yourssu.handy.compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.Divider
import com.yourssu.handy.compose.foundation.HandyTypography

/**
 * BottomNavItem : 하단 네비게이션 바의 아이템을 정의하는 데이터 클래스 입니다.
 *
 * @param icon 아이템의 아이콘
 * @param label 아이템의 라벨
 */
data class BottomNavItem(
    val icon: ImageVector,
    val label: String?
)

/**
 * BottomNavItem : 하단 네비게이션 바의 아이템 Composable 함수 입니다.
 *
 * @param item 하단 네비게이션 바의 아이템
 * @param isSelected 선택되었는지 여부
 * @param onClick 클릭 시 실행되는 함수
 * @param modifier Modifier
 */
@Composable
private fun BottomNavItem(
    item: BottomNavItem,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val color =
        if (isSelected) HandyTheme.colors.textBasicPrimary else HandyTheme.colors.textBasicDisabled

    Column(
        modifier = modifier
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
                onClick = onClick
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            item.icon,
            iconSize = IconSize.M,
        )

        if (item.label != null) {
            Text(
                text = item.label,
                style = HandyTypography.C1Rg11,
                color = color
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
        Divider(dividerThickness = DividerThickness.ONE)
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