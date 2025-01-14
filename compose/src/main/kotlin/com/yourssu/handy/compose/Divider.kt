package com.yourssu.handy.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Divider의 두께를 정의하는 enum class
 */
enum class DividerThickness(
    val size: Dp
) {
    ONE(1.dp),
    TWO(2.dp),
    FOUR(4.dp),
    EIGHT(8.dp),
}

/**
 * width를 지정할 수 있는 Divider
 * @param width Divider의 너비
 * @param color Divider의 색상
 * @param dividerThickness Divider의 두께
 */
@Composable
fun Divider(
    dividerThickness: DividerThickness,
    modifier: Modifier = Modifier,
    width: Dp = 0.dp,
    color: Color = HandyTheme.colors.bgBasicStrong,
) {
    Box(
        modifier = modifier
            .width(width)
            .height(dividerThickness.size)
            .background(color)
    )
}

/**
 * width를 지정할 수 없는 Divider
 * 기본적으로 fillMaxWidth를 사용
 * @param color Divider의 색상
 * @param dividerThickness Divider의 두께
 */
@Composable
fun Divider(
    dividerThickness: DividerThickness,
    modifier: Modifier = Modifier,
    color: Color = HandyTheme.colors.bgBasicStrong,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(dividerThickness.size)
            .background(color)
    )
}