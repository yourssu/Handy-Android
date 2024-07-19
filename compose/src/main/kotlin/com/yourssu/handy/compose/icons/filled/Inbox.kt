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
    Image(Inboxfilled, null)
}

private var _Inboxfilled: ImageVector? = null

public val Inboxfilled: ImageVector
    get() {
        if (_Inboxfilled != null) {
            return _Inboxfilled!!
        }
        _Inboxfilled = ImageVector.Builder(
            name = "Inboxfilled",
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
                moveTo(18.7135f, 3f)
                curveTo(19.9865f, 3.0781f, 21.0343f, 4.0303f, 21.2335f, 5.29f)
                lineTo(21.9135f, 17.1f)
                curveTo(22.0535f, 19.54f, 20.4235f, 21.54f, 18.3635f, 21.54f)
                horizontalLineTo(5.57352f)
                curveTo(3.4735f, 21.54f, 1.8335f, 19.45f, 2.0135f, 17.01f)
                lineTo(2.88352f, 5.29f)
                curveTo(3.0827f, 4.0303f, 4.1305f, 3.0781f, 5.4035f, 3f)
                horizontalLineTo(18.7135f)
                close()
                moveTo(16.8635f, 14.13f)
                horizontalLineTo(18.7135f)
                lineTo(18.6135f, 14.17f)
                curveTo(19.0056f, 14.17f, 19.3235f, 13.8521f, 19.3235f, 13.46f)
                curveTo(19.3235f, 13.0679f, 19.0056f, 12.75f, 18.6135f, 12.75f)
                horizontalLineTo(16.7635f)
                curveTo(15.4721f, 12.815f, 14.3203f, 13.5829f, 13.7635f, 14.75f)
                curveTo(13.4047f, 15.477f, 12.6642f, 15.9372f, 11.8535f, 15.9372f)
                curveTo(11.0428f, 15.9372f, 10.3024f, 15.477f, 9.9435f, 14.75f)
                curveTo(9.3902f, 13.5799f, 8.2364f, 12.8107f, 6.9435f, 12.75f)
                horizontalLineTo(5.21352f)
                curveTo(4.8214f, 12.75f, 4.5035f, 13.0679f, 4.5035f, 13.46f)
                curveTo(4.5035f, 13.8521f, 4.8214f, 14.17f, 5.2135f, 14.17f)
                horizontalLineTo(6.94352f)
                curveTo(7.7236f, 14.1994f, 8.4237f, 14.6572f, 8.7635f, 15.36f)
                curveTo(9.3707f, 16.5461f, 10.591f, 17.2923f, 11.9235f, 17.2923f)
                curveTo(13.256f, 17.2923f, 14.4763f, 16.5461f, 15.0835f, 15.36f)
                curveTo(15.4055f, 14.6538f, 16.0891f, 14.1814f, 16.8635f, 14.13f)
                close()
            }
        }.build()
        return _Inboxfilled!!
    }

