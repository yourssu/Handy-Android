import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

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
    Image(Unavailablefilled, null)
}

private var _Unavailablefilled: ImageVector? = null

public val Unavailablefilled: ImageVector
    get() {
        if (_Unavailablefilled != null) {
            return _Unavailablefilled!!
        }
        _Unavailablefilled = ImageVector.Builder(
            name = "Unavailablefilled",
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
                moveTo(2f, 12f)
                curveTo(2f, 6.4771f, 6.4771f, 2f, 12f, 2f)
                curveTo(14.6522f, 2f, 17.1957f, 3.0536f, 19.0711f, 4.9289f)
                curveTo(20.9464f, 6.8043f, 22f, 9.3478f, 22f, 12f)
                curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
                curveTo(6.4771f, 22f, 2f, 17.5228f, 2f, 12f)
                close()
                moveTo(7.72f, 17.11f)
                lineTo(17.11f, 7.72f)
                curveTo(17.3008f, 7.4854f, 17.2833f, 7.1444f, 17.0695f, 6.9305f)
                curveTo(16.8556f, 6.7167f, 16.5146f, 6.6992f, 16.28f, 6.89f)
                lineTo(6.89f, 16.28f)
                curveTo(6.6625f, 16.5099f, 6.6625f, 16.8801f, 6.89f, 17.11f)
                curveTo(7.0041f, 17.2168f, 7.1538f, 17.2774f, 7.31f, 17.28f)
                curveTo(7.4638f, 17.2799f, 7.6113f, 17.2188f, 7.72f, 17.11f)
                close()
            }
        }.build()
        return _Unavailablefilled!!
    }

