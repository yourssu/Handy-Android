package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.HandyIcons

public val HandyIcons.Filled.Add: ImageVector
    get() {
        if (_add != null) {
            return _add!!
        }
        _add = ImageVector.Builder(
            name = "Filled.Add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.44f, 2f)
                horizontalLineTo(12.56f)
                curveTo(17.7736f, 2f, 22f, 6.2264f, 22f, 11.44f)
                verticalLineTo(12.56f)
                curveTo(22f, 17.7736f, 17.7736f, 22f, 12.56f, 22f)
                horizontalLineTo(11.44f)
                curveTo(6.2264f, 22f, 2f, 17.7736f, 2f, 12.56f)
                verticalLineTo(11.44f)
                curveTo(2f, 6.2264f, 6.2264f, 2f, 11.44f, 2f)
                close()
                moveTo(12.75f, 12.75f)
                horizontalLineTo(16f)
                curveTo(16.4142f, 12.75f, 16.75f, 12.4142f, 16.75f, 12f)
                curveTo(16.75f, 11.5858f, 16.4142f, 11.25f, 16f, 11.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(8f)
                curveTo(12.75f, 7.5858f, 12.4142f, 7.25f, 12f, 7.25f)
                curveTo(11.5858f, 7.25f, 11.25f, 7.5858f, 11.25f, 8f)
                verticalLineTo(11.25f)
                horizontalLineTo(8f)
                curveTo(7.5858f, 11.25f, 7.25f, 11.5858f, 7.25f, 12f)
                curveTo(7.25f, 12.4142f, 7.5858f, 12.75f, 8f, 12.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(16f)
                curveTo(11.25f, 16.4142f, 11.5858f, 16.75f, 12f, 16.75f)
                curveTo(12.4142f, 16.75f, 12.75f, 16.4142f, 12.75f, 16f)
                verticalLineTo(12.75f)
                close()
            }
        }.build()
        return _add!!
    }

private var _add: ImageVector? = null
