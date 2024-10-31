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

enum class DividerSize(
    val size: Dp
) {
    ONE(1.dp),
    TWO(2.dp),
    FOUR(4.dp),
    EIGHT(8.dp),
}

@Composable
fun Divider(
    dividerSize: DividerSize,
    modifier: Modifier = Modifier,
    width: Dp? = null,
    color: Color = HandyTheme.colors.bgBasicStrong,
) {
    Box(
        modifier = modifier
            .then(if (width != null) Modifier.width(width) else Modifier.fillMaxWidth())
            .height(dividerSize.size)
            .background(color)
    )
}