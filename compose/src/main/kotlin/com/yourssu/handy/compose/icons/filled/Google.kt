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
    Image(Googlefilled, null)
}

private var _Googlefilled: ImageVector? = null

public val Googlefilled: ImageVector
    get() {
        if (_Googlefilled != null) {
            return _Googlefilled!!
        }
        _Googlefilled = ImageVector.Builder(
            name = "Googlefilled",
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
                moveTo(2f, 6f)
                curveTo(2f, 3.7909f, 3.7909f, 2f, 6f, 2f)
                horizontalLineTo(17.55f)
                curveTo(19.7591f, 2f, 21.55f, 3.7909f, 21.55f, 6f)
                verticalLineTo(17.55f)
                curveTo(21.55f, 19.7591f, 19.7591f, 21.55f, 17.55f, 21.55f)
                horizontalLineTo(6f)
                curveTo(3.7909f, 21.55f, 2f, 19.7591f, 2f, 17.55f)
                verticalLineTo(6f)
                close()
                moveTo(9.59f, 11.06f)
                verticalLineTo(12.62f)
                horizontalLineTo(11.78f)
                curveTo(11.5031f, 13.6137f, 10.5809f, 14.2878f, 9.55f, 14.25f)
                curveTo(8.1859f, 14.25f, 7.08f, 13.1441f, 7.08f, 11.78f)
                curveTo(7.08f, 10.4159f, 8.1859f, 9.31f, 9.55f, 9.31f)
                curveTo(10.1396f, 9.3099f, 10.7101f, 9.5189f, 11.16f, 9.9f)
                lineTo(12.35f, 8.78f)
                curveTo(11.0022f, 7.5246f, 8.9826f, 7.3221f, 7.4123f, 8.2849f)
                curveTo(5.8421f, 9.2477f, 5.1067f, 11.1396f, 5.6143f, 12.9102f)
                curveTo(6.122f, 14.6808f, 7.7481f, 15.8955f, 9.59f, 15.88f)
                curveTo(10.7958f, 15.8938f, 11.9408f, 15.3518f, 12.6945f, 14.4106f)
                curveTo(13.4483f, 13.4694f, 13.7269f, 12.2336f, 13.45f, 11.06f)
                horizontalLineTo(9.59f)
                close()
                moveTo(16.77f, 11.32f)
                horizontalLineTo(18.07f)
                verticalLineTo(12.24f)
                horizontalLineTo(16.77f)
                verticalLineTo(13.54f)
                horizontalLineTo(15.86f)
                verticalLineTo(12.24f)
                horizontalLineTo(14.56f)
                verticalLineTo(11.32f)
                horizontalLineTo(15.86f)
                verticalLineTo(10.02f)
                horizontalLineTo(16.77f)
                verticalLineTo(11.32f)
                close()
            }
        }.build()
        return _Googlefilled!!
    }

