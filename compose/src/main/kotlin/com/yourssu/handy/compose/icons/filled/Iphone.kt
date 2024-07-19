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
    Image(Iphonefilled, null)
}

private var _Iphonefilled: ImageVector? = null

public val Iphonefilled: ImageVector
    get() {
        if (_Iphonefilled != null) {
            return _Iphonefilled!!
        }
        _Iphonefilled = ImageVector.Builder(
            name = "Iphonefilled",
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
                moveTo(8.36167f, 2.00041f)
                horizontalLineTo(16.6383f)
                curveTo(17.2551f, 1.9888f, 17.851f, 2.2235f, 18.2942f, 2.6525f)
                curveTo(18.7375f, 3.0815f, 18.9915f, 3.6694f, 19f, 4.2862f)
                verticalLineTo(20.2979f)
                curveTo(18.9763f, 21.5801f, 17.9206f, 22.6019f, 16.6383f, 22.5837f)
                horizontalLineTo(8.36167f)
                curveTo(7.0794f, 22.6019f, 6.0237f, 21.5801f, 6f, 20.2979f)
                verticalLineTo(4.28624f)
                curveTo(6.0237f, 3.0041f, 7.0794f, 1.9823f, 8.3617f, 2.0004f)
                close()
                moveTo(10.875f, 5.25041f)
                horizontalLineTo(14.125f)
                curveTo(14.5737f, 5.2504f, 14.9375f, 4.8866f, 14.9375f, 4.4379f)
                curveTo(14.9375f, 3.9892f, 14.5737f, 3.6254f, 14.125f, 3.6254f)
                horizontalLineTo(10.875f)
                curveTo(10.4263f, 3.6254f, 10.0625f, 3.9892f, 10.0625f, 4.4379f)
                curveTo(10.0625f, 4.8866f, 10.4263f, 5.2504f, 10.875f, 5.2504f)
                close()
            }
        }.build()
        return _Iphonefilled!!
    }

