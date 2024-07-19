import androidx.compose.runtime.Composable

package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

import com.yourssu.handy.compose.icons.handyPath
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview


@Preview
@Composable
private fun VectorPreview() {
    Image(Movefilled, null)
}

private var _Movefilled: ImageVector? = null

public val Movefilled: ImageVector
    get() {
        if (_Movefilled != null) {
            return _Movefilled!!
        }
        _Movefilled = ImageVector.Builder(
            name = "Movefilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 2f)
                horizontalLineTo(14.24f)
                curveTo(16.3617f, 2f, 18.3966f, 2.8428f, 19.8969f, 4.3431f)
                curveTo(21.3971f, 5.8434f, 22.24f, 7.8783f, 22.24f, 10f)
                verticalLineTo(14.24f)
                curveTo(22.24f, 18.6583f, 18.6583f, 22.24f, 14.24f, 22.24f)
                horizontalLineTo(10f)
                curveTo(5.5817f, 22.24f, 2f, 18.6583f, 2f, 14.24f)
                verticalLineTo(10f)
                curveTo(2f, 5.5817f, 5.5817f, 2f, 10f, 2f)
                close()
                moveTo(16.37f, 11.87f)
                curveTo(16.7842f, 11.87f, 17.12f, 11.5342f, 17.12f, 11.12f)
                lineTo(17.13f, 7.87f)
                curveTo(17.13f, 7.4558f, 16.7942f, 7.12f, 16.38f, 7.12f)
                horizontalLineTo(13.12f)
                curveTo(12.6892f, 7.12f, 12.34f, 7.4692f, 12.34f, 7.9f)
                curveTo(12.34f, 8.3308f, 12.6892f, 8.68f, 13.12f, 8.68f)
                horizontalLineTo(14.51f)
                lineTo(8.62f, 14.56f)
                verticalLineTo(13.12f)
                curveTo(8.62f, 12.7058f, 8.2842f, 12.37f, 7.87f, 12.37f)
                curveTo(7.4558f, 12.37f, 7.12f, 12.7058f, 7.12f, 13.12f)
                verticalLineTo(16.34f)
                curveTo(7.1003f, 16.4357f, 7.1003f, 16.5343f, 7.12f, 16.63f)
                curveTo(7.1893f, 16.8523f, 7.3544f, 17.032f, 7.57f, 17.12f)
                curveTo(7.6628f, 17.1343f, 7.7572f, 17.1343f, 7.85f, 17.12f)
                horizontalLineTo(11.12f)
                curveTo(11.5342f, 17.12f, 11.87f, 16.7842f, 11.87f, 16.37f)
                curveTo(11.87f, 15.9558f, 11.5342f, 15.62f, 11.12f, 15.62f)
                horizontalLineTo(9.62f)
                lineTo(15.62f, 9.62f)
                verticalLineTo(11.12f)
                curveTo(15.62f, 11.5342f, 15.9558f, 11.87f, 16.37f, 11.87f)
                close()
            }
        }.build()
        return _Movefilled!!
    }

