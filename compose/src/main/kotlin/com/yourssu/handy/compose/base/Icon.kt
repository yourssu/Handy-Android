package com.yourssu.handy.compose.base

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.toolingGraphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.foundation.LocalContentColor

sealed class IconSize(val value: Dp) {
    data object Small : IconSize(16.dp)
    data object Medium : IconSize(20.dp)
    data object Large : IconSize(24.dp)
}

@Composable
fun Icon(
    @DrawableRes id: Int,
    modifier: Modifier = Modifier,
    iconSize: IconSize,
    tint: Color = LocalContentColor.current
) {
    val imageVector = ImageVector.vectorResource(id = id)
    val painter = rememberVectorPainter(image = imageVector)

    Box(
        modifier
            .toolingGraphicsLayer()
            .size(iconSize.value)
            .paint(
                painter = painter,
                colorFilter = ColorFilter.tint(color = tint),
                contentScale = ContentScale.Fit,
            )
    )
}