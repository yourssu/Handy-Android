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
    Image(Folderopenedfilled, null)
}

private var _Folderopenedfilled: ImageVector? = null

public val Folderopenedfilled: ImageVector
    get() {
        if (_Folderopenedfilled != null) {
            return _Folderopenedfilled!!
        }
        _Folderopenedfilled = ImageVector.Builder(
            name = "Folderopenedfilled",
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
                moveTo(21.45f, 10.1299f)
                verticalLineTo(10.4099f)
                curveTo(21.9453f, 11.0319f, 22.146f, 11.8383f, 22f, 12.6199f)
                lineTo(19.92f, 19.1199f)
                curveTo(19.5115f, 20.1785f, 18.4947f, 20.8776f, 17.36f, 20.8799f)
                horizontalLineTo(4.7f)
                curveTo(3.2108f, 20.8476f, 2.0158f, 19.6394f, 2f, 18.1499f)
                verticalLineTo(6.87988f)
                curveTo(1.9998f, 4.8282f, 3.6485f, 3.1572f, 5.7f, 3.1299f)
                horizontalLineTo(10f)
                curveTo(11.3807f, 3.1299f, 12.5f, 4.2492f, 12.5f, 5.6299f)
                curveTo(12.5f, 6.1822f, 12.9477f, 6.6299f, 13.5f, 6.6299f)
                horizontalLineTo(18f)
                curveTo(19.9134f, 6.6572f, 21.4502f, 8.2163f, 21.45f, 10.1299f)
                close()
                moveTo(5.7f, 4.62988f)
                curveTo(4.4574f, 4.6299f, 3.45f, 5.6372f, 3.45f, 6.8799f)
                verticalLineTo(13.9999f)
                lineTo(4.52f, 11.2199f)
                curveTo(4.918f, 10.1387f, 5.9478f, 9.4202f, 7.1f, 9.4199f)
                horizontalLineTo(19.35f)
                curveTo(19.523f, 9.4048f, 19.697f, 9.4048f, 19.87f, 9.4199f)
                curveTo(19.5751f, 8.6432f, 18.8308f, 8.1298f, 18f, 8.1299f)
                horizontalLineTo(13.5f)
                curveTo(12.1216f, 8.1244f, 11.0055f, 7.0083f, 11f, 5.6299f)
                curveTo(11f, 5.0776f, 10.5523f, 4.6299f, 10f, 4.6299f)
                horizontalLineTo(5.7f)
                close()
            }
        }.build()
        return _Folderopenedfilled!!
    }

