import androidx.compose.runtime.Composable

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
    Image(Foldersharedfilled, null)
}

private var _Foldersharedfilled: ImageVector? = null

public val Foldersharedfilled: ImageVector
    get() {
        if (_Foldersharedfilled != null) {
            return _Foldersharedfilled!!
        }
        _Foldersharedfilled = ImageVector.Builder(
            name = "Foldersharedfilled",
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
                moveTo(18.9487f, 6.19361f)
                horizontalLineTo(13.9268f)
                curveTo(12.7688f, 6.1936f, 11.83f, 5.2548f, 11.83f, 4.0968f)
                curveTo(11.83f, 2.9388f, 10.8912f, 2f, 9.7332f, 2f)
                horizontalLineTo(4.71136f)
                curveTo(2.6681f, 2.0057f, 1.0115f, 3.6576f, 1f, 5.7009f)
                verticalLineTo(18.1244f)
                curveTo(0.9972f, 19.1096f, 1.3873f, 20.0552f, 2.084f, 20.7518f)
                curveTo(2.7806f, 21.4485f, 3.7262f, 21.8386f, 4.7114f, 21.8358f)
                horizontalLineTo(18.9487f)
                curveTo(20.9984f, 21.8358f, 22.66f, 20.1742f, 22.66f, 18.1244f)
                verticalLineTo(9.91544f)
                curveTo(22.66f, 7.864f, 21.0001f, 6.1994f, 18.9487f, 6.1936f)
                close()
                moveTo(15.3736f, 12.9558f)
                curveTo(15.3793f, 12.0839f, 16.0848f, 11.3784f, 16.9567f, 11.3727f)
                horizontalLineTo(17.5648f)
                curveTo(17.9874f, 11.3699f, 18.3939f, 11.5352f, 18.6947f, 11.832f)
                curveTo(18.9955f, 12.1289f, 19.1661f, 12.5332f, 19.1688f, 12.9558f)
                verticalLineTo(13.6792f)
                curveTo(19.1688f, 14.7214f, 18.3239f, 15.5663f, 17.2817f, 15.5663f)
                curveTo(16.2395f, 15.5663f, 15.3946f, 14.7214f, 15.3946f, 13.6792f)
                lineTo(15.3736f, 12.9558f)
                close()
                moveTo(15.3107f, 19.739f)
                horizontalLineTo(19.1688f)
                curveTo(19.5983f, 19.737f, 20.0037f, 19.5401f, 20.2708f, 19.2037f)
                curveTo(20.5378f, 18.8673f, 20.6377f, 18.4279f, 20.5422f, 18.0091f)
                lineTo(20.4374f, 17.5268f)
                curveTo(20.322f, 16.8793f, 19.7636f, 16.4044f, 19.1059f, 16.3946f)
                horizontalLineTo(15.4156f)
                curveTo(14.7563f, 16.4003f, 14.1956f, 16.8771f, 14.0841f, 17.5268f)
                lineTo(13.9792f, 18.0091f)
                curveTo(13.8851f, 18.4208f, 13.9798f, 18.8531f, 14.2374f, 19.1877f)
                curveTo(14.495f, 19.5224f, 14.8886f, 19.7246f, 15.3107f, 19.739f)
                close()
            }
        }.build()
        return _Foldersharedfilled!!
    }

