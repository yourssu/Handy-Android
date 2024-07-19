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
    Image(Imacfilled, null)
}

private var _Imacfilled: ImageVector? = null

public val Imacfilled: ImageVector
    get() {
        if (_Imacfilled != null) {
            return _Imacfilled!!
        }
        _Imacfilled = ImageVector.Builder(
            name = "Imacfilled",
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
                moveTo(18.0025f, 4f)
                horizontalLineTo(5.00247f)
                curveTo(3.2741f, 4.0811f, 1.9346f, 5.5411f, 2.0025f, 7.27f)
                verticalLineTo(12.73f)
                curveTo(1.9346f, 14.4589f, 3.2741f, 15.9189f, 5.0025f, 16f)
                horizontalLineTo(8.76247f)
                curveTo(8.6535f, 16.6386f, 8.493f, 17.2673f, 8.2825f, 17.88f)
                lineTo(7.94247f, 18.82f)
                curveTo(7.8403f, 19.071f, 7.8623f, 19.3555f, 8.0021f, 19.5877f)
                curveTo(8.1418f, 19.82f, 8.3828f, 19.9727f, 8.6525f, 20f)
                horizontalLineTo(14.3625f)
                curveTo(14.6323f, 19.974f, 14.8735f, 19.8208f, 15.0119f, 19.5876f)
                curveTo(15.1502f, 19.3544f, 15.169f, 19.0693f, 15.0625f, 18.82f)
                lineTo(14.7325f, 17.88f)
                curveTo(14.5129f, 17.2701f, 14.3522f, 16.6405f, 14.2525f, 16f)
                horizontalLineTo(18.0025f)
                curveTo(19.7308f, 15.9189f, 21.0703f, 14.4589f, 21.0025f, 12.73f)
                verticalLineTo(7.27f)
                curveTo(21.0703f, 5.5411f, 19.7308f, 4.0811f, 18.0025f, 4f)
                close()
                moveTo(10.9325f, 14.08f)
                curveTo(10.9325f, 13.6658f, 11.2683f, 13.33f, 11.6825f, 13.33f)
                curveTo(12.0967f, 13.33f, 12.4325f, 13.6658f, 12.4325f, 14.08f)
                curveTo(12.4325f, 14.4942f, 12.0967f, 14.83f, 11.6825f, 14.83f)
                curveTo(11.2683f, 14.83f, 10.9325f, 14.4942f, 10.9325f, 14.08f)
                close()
                moveTo(4.50247f, 12.47f)
                horizontalLineTo(18.5025f)
                verticalLineTo(12.5f)
                curveTo(18.9167f, 12.5f, 19.2525f, 12.1642f, 19.2525f, 11.75f)
                curveTo(19.2525f, 11.3358f, 18.9167f, 11f, 18.5025f, 11f)
                horizontalLineTo(4.50247f)
                curveTo(4.2045f, 10.9395f, 3.8994f, 11.0649f, 3.7302f, 11.3175f)
                curveTo(3.5609f, 11.5701f, 3.5609f, 11.8999f, 3.7302f, 12.1525f)
                curveTo(3.8994f, 12.4051f, 4.2045f, 12.5305f, 4.5025f, 12.47f)
                close()
            }
        }.build()
        return _Imacfilled!!
    }

