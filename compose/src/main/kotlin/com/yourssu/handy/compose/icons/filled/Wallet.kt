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
    Image(Walletfilled, null)
}

private var _Walletfilled: ImageVector? = null

public val Walletfilled: ImageVector
    get() {
        if (_Walletfilled != null) {
            return _Walletfilled!!
        }
        _Walletfilled = ImageVector.Builder(
            name = "Walletfilled",
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
                moveTo(22f, 15.8182f)
                curveTo(22f, 18.3286f, 19.9649f, 20.3636f, 17.4545f, 20.3636f)
                horizontalLineTo(6.54545f)
                curveTo(4.0351f, 20.3636f, 2f, 18.3286f, 2f, 15.8182f)
                verticalLineTo(8.54545f)
                curveTo(2f, 6.0351f, 4.0351f, 4f, 6.5454f, 4f)
                horizontalLineTo(17.4545f)
                curveTo(19.9649f, 4f, 22f, 6.0351f, 22f, 8.5455f)
                verticalLineTo(15.8182f)
                close()
                moveTo(22f, 13.2818f)
                verticalLineTo(11.0818f)
                horizontalLineTo(17.4545f)
                curveTo(16.847f, 11.0818f, 16.3545f, 11.5743f, 16.3545f, 12.1818f)
                curveTo(16.3545f, 12.7893f, 16.847f, 13.2818f, 17.4545f, 13.2818f)
                horizontalLineTo(22f)
                close()
            }
        }.build()
        return _Walletfilled!!
    }

