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
    Image(Mailopenedfilled, null)
}

private var _Mailopenedfilled: ImageVector? = null

public val Mailopenedfilled: ImageVector
    get() {
        if (_Mailopenedfilled != null) {
            return _Mailopenedfilled!!
        }
        _Mailopenedfilled = ImageVector.Builder(
            name = "Mailopenedfilled",
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
                moveTo(13.29f, 2.52501f)
                lineTo(20.14f, 7.33501f)
                curveTo(21.2079f, 8.0855f, 21.8424f, 9.3098f, 21.84f, 10.615f)
                verticalLineTo(17.745f)
                curveTo(21.8374f, 18.8775f, 21.3849f, 19.9625f, 20.5823f, 20.7614f)
                curveTo(19.7796f, 21.5603f, 18.6925f, 22.0077f, 17.56f, 22.005f)
                horizontalLineTo(6.28001f)
                curveTo(5.1475f, 22.0077f, 4.0604f, 21.5603f, 3.2577f, 20.7614f)
                curveTo(2.4551f, 19.9625f, 2.0027f, 18.8775f, 2f, 17.745f)
                verticalLineTo(10.615f)
                curveTo(1.9976f, 9.3098f, 2.6321f, 8.0855f, 3.7f, 7.335f)
                lineTo(10.55f, 2.52501f)
                curveTo(11.3292f, 1.825f, 12.5108f, 1.825f, 13.29f, 2.525f)
                close()
                moveTo(13.38f, 16.005f)
                lineTo(18.85f, 12.195f)
                lineTo(18.81f, 12.245f)
                curveTo(19.0297f, 12.0914f, 19.1508f, 11.8322f, 19.1276f, 11.5651f)
                curveTo(19.1044f, 11.298f, 18.9405f, 11.0636f, 18.6976f, 10.9501f)
                curveTo(18.4547f, 10.8366f, 18.1697f, 10.8614f, 17.95f, 11.015f)
                lineTo(12.41f, 14.885f)
                curveTo(12.246f, 15.0491f, 12.0208f, 15.137f, 11.789f, 15.1275f)
                curveTo(11.5573f, 15.118f, 11.34f, 15.0119f, 11.19f, 14.835f)
                lineTo(5.81001f, 11.015f)
                curveTo(5.4817f, 10.8005f, 5.043f, 10.8795f, 4.81f, 11.195f)
                curveTo(4.6007f, 11.5244f, 4.679f, 11.9593f, 4.99f, 12.195f)
                lineTo(10.29f, 15.955f)
                curveTo(10.7272f, 16.3554f, 11.2972f, 16.5798f, 11.89f, 16.585f)
                curveTo(12.4424f, 16.5884f, 12.9753f, 16.3809f, 13.38f, 16.005f)
                close()
            }
        }.build()
        return _Mailopenedfilled!!
    }

