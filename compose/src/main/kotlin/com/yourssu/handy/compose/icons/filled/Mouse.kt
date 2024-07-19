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
    Image(Mousefilled, null)
}

private var _Mousefilled: ImageVector? = null

public val Mousefilled: ImageVector
    get() {
        if (_Mousefilled != null) {
            return _Mousefilled!!
        }
        _Mousefilled = ImageVector.Builder(
            name = "Mousefilled",
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
                moveTo(11.8f, 2.00001f)
                horizontalLineTo(12.2f)
                curveTo(14.0043f, 1.9973f, 15.7354f, 2.7129f, 17.0113f, 3.9887f)
                curveTo(18.2871f, 5.2646f, 19.0027f, 6.9957f, 19f, 8.8f)
                verticalLineTo(15.2f)
                curveTo(19.0027f, 17.0043f, 18.2871f, 18.7354f, 17.0113f, 20.0113f)
                curveTo(15.7354f, 21.2871f, 14.0043f, 22.0027f, 12.2f, 22f)
                horizontalLineTo(11.8f)
                curveTo(9.9957f, 22.0027f, 8.2646f, 21.2871f, 6.9887f, 20.0113f)
                curveTo(5.7129f, 18.7354f, 4.9973f, 17.0043f, 5f, 15.2f)
                verticalLineTo(8.80001f)
                curveTo(4.9973f, 6.9957f, 5.7129f, 5.2646f, 6.9887f, 3.9887f)
                curveTo(8.2646f, 2.7129f, 9.9957f, 1.9973f, 11.8f, 2f)
                close()
                moveTo(12f, 12.75f)
                curveTo(12.4142f, 12.75f, 12.75f, 12.4142f, 12.75f, 12f)
                verticalLineTo(7.00001f)
                curveTo(12.75f, 6.5858f, 12.4142f, 6.25f, 12f, 6.25f)
                curveTo(11.5858f, 6.25f, 11.25f, 6.5858f, 11.25f, 7f)
                verticalLineTo(12f)
                curveTo(11.25f, 12.4142f, 11.5858f, 12.75f, 12f, 12.75f)
                close()
            }
        }.build()
        return _Mousefilled!!
    }

