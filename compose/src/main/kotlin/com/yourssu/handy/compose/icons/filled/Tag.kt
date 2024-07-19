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
    Image(Tagfilled, null)
}

private var _Tagfilled: ImageVector? = null

public val Tagfilled: ImageVector
    get() {
        if (_Tagfilled != null) {
            return _Tagfilled!!
        }
        _Tagfilled = ImageVector.Builder(
            name = "Tagfilled",
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
                moveTo(12.5293f, 2.52932f)
                lineTo(20.9793f, 10.9793f)
                curveTo(21.773f, 11.9862f, 21.6175f, 13.4426f, 20.6293f, 14.2593f)
                lineTo(14.2593f, 20.6293f)
                curveTo(13.4426f, 21.6175f, 11.9862f, 21.773f, 10.9793f, 20.9793f)
                lineTo(2.52932f, 12.5293f)
                curveTo(2.1446f, 12.1337f, 1.9543f, 11.5884f, 2.0093f, 11.0393f)
                lineTo(2.44932f, 5.03932f)
                curveTo(2.5892f, 3.671f, 3.671f, 2.5892f, 5.0393f, 2.4493f)
                lineTo(11.0393f, 2.00932f)
                curveTo(11.5884f, 1.9543f, 12.1337f, 2.1446f, 12.5293f, 2.5293f)
                close()
                moveTo(7.67932f, 9.10832f)
                curveTo(8.0573f, 9.1083f, 8.4188f, 8.9533f, 8.6793f, 8.6793f)
                curveTo(8.9533f, 8.4188f, 9.1083f, 8.0573f, 9.1083f, 7.6793f)
                curveTo(9.1083f, 7.3013f, 8.9533f, 6.9398f, 8.6793f, 6.6793f)
                curveTo(8.127f, 6.127f, 7.2316f, 6.127f, 6.6793f, 6.6793f)
                curveTo(6.127f, 7.2316f, 6.127f, 8.127f, 6.6793f, 8.6793f)
                curveTo(6.9398f, 8.9533f, 7.3013f, 9.1083f, 7.6793f, 9.1083f)
                close()
            }
        }.build()
        return _Tagfilled!!
    }

