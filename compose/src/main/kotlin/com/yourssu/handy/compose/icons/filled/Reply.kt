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
    Image(Replyfilled, null)
}

private var _Replyfilled: ImageVector? = null

public val Replyfilled: ImageVector
    get() {
        if (_Replyfilled != null) {
            return _Replyfilled!!
        }
        _Replyfilled = ImageVector.Builder(
            name = "Replyfilled",
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
                moveTo(16.4456f, 12.074f)
                curveTo(17.1332f, 11.3939f, 17.5201f, 10.4671f, 17.52f, 9.5f)
                verticalLineTo(8.34f)
                curveTo(17.52f, 8.0721f, 17.3771f, 7.8245f, 17.145f, 7.6905f)
                curveTo(16.913f, 7.5565f, 16.6271f, 7.5565f, 16.395f, 7.6905f)
                curveTo(16.163f, 7.8245f, 16.02f, 8.0721f, 16.02f, 8.34f)
                verticalLineTo(9.5f)
                curveTo(16.0338f, 10.077f, 15.8107f, 10.6345f, 15.4026f, 11.0426f)
                curveTo(14.9945f, 11.4507f, 14.437f, 11.6738f, 13.86f, 11.66f)
                horizontalLineTo(9.28f)
                lineTo(11.49f, 9.45f)
                curveTo(11.7654f, 9.1545f, 11.7572f, 8.694f, 11.4716f, 8.4084f)
                curveTo(11.186f, 8.1228f, 10.7255f, 8.1146f, 10.43f, 8.39f)
                lineTo(6.94f, 11.88f)
                curveTo(6.8722f, 11.9494f, 6.8179f, 12.0307f, 6.78f, 12.12f)
                curveTo(6.6999f, 12.305f, 6.6999f, 12.515f, 6.78f, 12.7f)
                curveTo(6.8179f, 12.7893f, 6.8722f, 12.8706f, 6.94f, 12.94f)
                lineTo(10.43f, 16.39f)
                curveTo(10.5717f, 16.5289f, 10.7616f, 16.6077f, 10.96f, 16.61f)
                curveTo(11.158f, 16.6057f, 11.3472f, 16.5272f, 11.49f, 16.39f)
                curveTo(11.7825f, 16.0972f, 11.7825f, 15.6228f, 11.49f, 15.33f)
                lineTo(9.28f, 13.12f)
                horizontalLineTo(13.86f)
                curveTo(14.827f, 13.1307f, 15.7581f, 12.754f, 16.4456f, 12.074f)
                close()
            }
        }.build()
        return _Replyfilled!!
    }

