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
    Image(Pausefilled, null)
}

private var _Pausefilled: ImageVector? = null

public val Pausefilled: ImageVector
    get() {
        if (_Pausefilled != null) {
            return _Pausefilled!!
        }
        _Pausefilled = ImageVector.Builder(
            name = "Pausefilled",
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
                moveTo(16f, 2f)
                horizontalLineTo(8f)
                curveTo(4.6863f, 2f, 2f, 4.6863f, 2f, 8f)
                verticalLineTo(16f)
                curveTo(2f, 19.3137f, 4.6863f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(19.3137f, 22f, 22f, 19.3137f, 22f, 16f)
                verticalLineTo(8f)
                curveTo(22f, 4.6863f, 19.3137f, 2f, 16f, 2f)
                close()
                moveTo(10.5f, 15f)
                curveTo(10.5f, 15.5523f, 10.0523f, 16f, 9.5f, 16f)
                curveTo(8.9477f, 16f, 8.5f, 15.5523f, 8.5f, 15f)
                verticalLineTo(9f)
                curveTo(8.5f, 8.4477f, 8.9477f, 8f, 9.5f, 8f)
                curveTo(10.0523f, 8f, 10.5f, 8.4477f, 10.5f, 9f)
                verticalLineTo(15f)
                close()
                moveTo(14.5f, 16f)
                curveTo(15.0523f, 16f, 15.5f, 15.5523f, 15.5f, 15f)
                verticalLineTo(9f)
                curveTo(15.5f, 8.4477f, 15.0523f, 8f, 14.5f, 8f)
                curveTo(13.9477f, 8f, 13.5f, 8.4477f, 13.5f, 9f)
                verticalLineTo(15f)
                curveTo(13.5f, 15.5523f, 13.9477f, 16f, 14.5f, 16f)
                close()
            }
        }.build()
        return _Pausefilled!!
    }

