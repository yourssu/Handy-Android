package com.yourssu.handy.compose.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.DefaultFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

object HandyIcons {
    object Filled
    object Line
}

inline fun handyIcon(
    name: String = "",
    block: ImageVector.Builder.() -> Unit
): ImageVector = ImageVector.Builder(
    name = name,
    defaultWidth = HandyIconDimension.dp,
    defaultHeight = HandyIconDimension.dp,
    viewportWidth = HandyIconDimension,
    viewportHeight = HandyIconDimension
).apply(block).build()

inline fun ImageVector.Builder.handyPath(
    fillAlpha: Float = 1.0f,
    strokeAlpha: Float = 1.0f,
    strokeLineWidth: Float = 1.0f,
    pathFillType: PathFillType = DefaultFillType,
    pathBuilder: PathBuilder.() -> Unit
) = path(
    fill = SolidColor(Color.Black),
    fillAlpha = fillAlpha,
    stroke = null,
    strokeAlpha = strokeAlpha,
    strokeLineWidth = strokeLineWidth,
    strokeLineCap = StrokeCap.Butt,
    strokeLineJoin = StrokeJoin.Miter,
    strokeLineMiter = 1.0f,
    pathFillType = pathFillType,
    pathBuilder = pathBuilder
)

@PublishedApi
internal const val HandyIconDimension = 24f