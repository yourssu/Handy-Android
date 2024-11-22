package com.yourssu.handy.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * BottomNavItem : 하단 네비게이션 바의 아이템을 정의하는 데이터 클래스 입니다.
 *
 * @param icon 아이템의 아이콘
 * @param label 아이템의 라벨
 */
data class BottomNavItem(
    val icon: Int,
    val label: String
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
            painter = painterResource(id = item.icon),
            contentDescription = item.label,
            tint = color,
            modifier = Modifier.size(24.dp)
        )

        Text(
            text = item.label,
            fontSize = 11.dp,
            lineHeight = 16.dp,
            fontWeight = FontWeight(400),
            color = color,
            textAlign = TextAlign.Center
        )
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