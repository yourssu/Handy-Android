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
    Image(Worldfilled, null)
}

private var _Worldfilled: ImageVector? = null

public val Worldfilled: ImageVector
    get() {
        if (_Worldfilled != null) {
            return _Worldfilled!!
        }
        _Worldfilled = ImageVector.Builder(
            name = "Worldfilled",
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
                moveTo(12.5f, 3f)
                curveTo(7.2533f, 3f, 3f, 7.2533f, 3f, 12.5f)
                curveTo(3f, 17.7467f, 7.2533f, 22f, 12.5f, 22f)
                curveTo(17.7467f, 22f, 22f, 17.7467f, 22f, 12.5f)
                curveTo(22f, 9.9804f, 20.9991f, 7.5641f, 19.2175f, 5.7825f)
                curveTo(17.4359f, 4.0009f, 15.0196f, 3f, 12.5f, 3f)
                close()
                moveTo(10.82f, 10.88f)
                curveTo(10.3912f, 10.88f, 9.9625f, 11.3075f, 9.5325f, 11.7363f)
                curveTo(9.1f, 12.1675f, 8.6662f, 12.6f, 8.23f, 12.6f)
                curveTo(8.0003f, 12.5945f, 7.7783f, 12.6833f, 7.6158f, 12.8458f)
                curveTo(7.4533f, 13.0083f, 7.3645f, 13.2303f, 7.37f, 13.46f)
                lineTo(8.23f, 15.19f)
                curveTo(8.23f, 15.19f, 8.23f, 17.78f, 9.1f, 18.64f)
                curveTo(9.97f, 19.5f, 9.1f, 19.5f, 9.1f, 19.5f)
                curveTo(6.5775f, 18.4857f, 4.8331f, 16.147f, 4.58f, 13.44f)
                curveTo(4.3808f, 11.4439f, 4.9533f, 9.4472f, 6.18f, 7.86f)
                curveTo(6.3184f, 7.672f, 6.5347f, 7.5569f, 6.768f, 7.5472f)
                curveTo(7.0013f, 7.5375f, 7.2264f, 7.6341f, 7.38f, 7.81f)
                curveTo(7.574f, 8.0927f, 7.8877f, 8.2699f, 8.23f, 8.29f)
                curveTo(9.1f, 8.29f, 11.69f, 10.88f, 10.82f, 10.88f)
                close()
                moveTo(18.0299f, 14.9379f)
                curveTo(18.5279f, 15.2112f, 18.9988f, 15.4696f, 19.33f, 15.32f)
                curveTo(20.78f, 14.67f, 20.28f, 10.8f, 20.28f, 10.8f)
                curveTo(20.28f, 10.8f, 19.55f, 7.42f, 17.6f, 6.69f)
                curveTo(17.3332f, 6.601f, 17.1299f, 6.9723f, 16.8999f, 7.3924f)
                curveTo(16.6385f, 7.8697f, 16.3427f, 8.41f, 15.88f, 8.41f)
                curveTo(15.01f, 8.41f, 14.15f, 8.42f, 14.15f, 9.28f)
                curveTo(14.15f, 9.71f, 14.5825f, 10.1425f, 15.015f, 10.575f)
                curveTo(15.4475f, 11.0075f, 15.88f, 11.44f, 15.88f, 11.87f)
                curveTo(15.88f, 12.73f, 15.88f, 14.45f, 16.74f, 14.45f)
                curveTo(17.1407f, 14.45f, 17.5956f, 14.6996f, 18.0299f, 14.9379f)
                close()
            }
        }.build()
        return _Worldfilled!!
    }

