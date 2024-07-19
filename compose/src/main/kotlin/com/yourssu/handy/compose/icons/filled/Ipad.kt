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
    Image(Ipadfilled, null)
}

private var _Ipadfilled: ImageVector? = null

public val Ipadfilled: ImageVector
    get() {
        if (_Ipadfilled != null) {
            return _Ipadfilled!!
        }
        _Ipadfilled = ImageVector.Builder(
            name = "Ipadfilled",
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
                moveTo(6.5f, 2f)
                horizontalLineTo(17.5f)
                curveTo(18.6046f, 2f, 19.5f, 2.8954f, 19.5f, 4f)
                verticalLineTo(20f)
                curveTo(19.5f, 21.1046f, 18.6046f, 22f, 17.5f, 22f)
                horizontalLineTo(6.5f)
                curveTo(5.3954f, 22f, 4.5f, 21.1046f, 4.5f, 20f)
                verticalLineTo(4f)
                curveTo(4.5f, 2.8954f, 5.3954f, 2f, 6.5f, 2f)
                close()
                moveTo(11f, 18.42f)
                curveTo(11f, 18.9723f, 11.4477f, 19.42f, 12f, 19.42f)
                curveTo(12.5523f, 19.42f, 13f, 18.9723f, 13f, 18.42f)
                curveTo(13f, 17.8677f, 12.5523f, 17.42f, 12f, 17.42f)
                curveTo(11.4477f, 17.42f, 11f, 17.8677f, 11f, 18.42f)
                close()
            }
        }.build()
        return _Ipadfilled!!
    }

