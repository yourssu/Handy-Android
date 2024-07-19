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
    Image(Eyefilled, null)
}

private var _Eyefilled: ImageVector? = null

public val Eyefilled: ImageVector
    get() {
        if (_Eyefilled != null) {
            return _Eyefilled!!
        }
        _Eyefilled = ImageVector.Builder(
            name = "Eyefilled",
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
                moveTo(17.0276f, 7.64929f)
                lineTo(21.2076f, 10.9893f)
                curveTo(21.4779f, 11.2056f, 21.6352f, 11.5331f, 21.6352f, 11.8793f)
                curveTo(21.6352f, 12.2255f, 21.4779f, 12.5529f, 21.2076f, 12.7693f)
                lineTo(17.0276f, 16.1093f)
                curveTo(14.2726f, 18.3083f, 10.3626f, 18.3083f, 7.6076f, 16.1093f)
                lineTo(3.42761f, 12.7693f)
                curveTo(3.1573f, 12.5529f, 3f, 12.2255f, 3f, 11.8793f)
                curveTo(3f, 11.5331f, 3.1573f, 11.2056f, 3.4276f, 10.9893f)
                lineTo(7.60761f, 7.64929f)
                curveTo(10.3626f, 5.4502f, 14.2726f, 5.4502f, 17.0276f, 7.6493f)
                close()
                moveTo(10.0176f, 11.8793f)
                curveTo(10.0176f, 13.1495f, 11.0474f, 14.1793f, 12.3176f, 14.1793f)
                curveTo(13.5879f, 14.1793f, 14.6176f, 13.1495f, 14.6176f, 11.8793f)
                curveTo(14.6176f, 10.609f, 13.5879f, 9.5793f, 12.3176f, 9.5793f)
                curveTo(11.0474f, 9.5793f, 10.0176f, 10.609f, 10.0176f, 11.8793f)
                close()
            }
        }.build()
        return _Eyefilled!!
    }

