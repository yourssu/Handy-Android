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
    Image(Lockfilled, null)
}

private var _Lockfilled: ImageVector? = null

public val Lockfilled: ImageVector
    get() {
        if (_Lockfilled != null) {
            return _Lockfilled!!
        }
        _Lockfilled = ImageVector.Builder(
            name = "Lockfilled",
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
                moveTo(16.5515f, 7.12202f)
                verticalLineTo(4.00202f)
                curveTo(16.5521f, 3.1869f, 16.2209f, 2.4067f, 15.6343f, 1.8408f)
                curveTo(15.0477f, 1.275f, 14.256f, 0.9721f, 13.4415f, 1.002f)
                horizontalLineTo(10.1615f)
                curveTo(9.347f, 0.9721f, 8.5554f, 1.275f, 7.9687f, 1.8408f)
                curveTo(7.3821f, 2.4067f, 7.051f, 3.1869f, 7.0515f, 4.002f)
                verticalLineTo(7.12202f)
                curveTo(4.9827f, 7.8546f, 3.7244f, 9.9518f, 4.0515f, 12.122f)
                lineTo(5.00151f, 17.892f)
                curveTo(5.4582f, 20.2117f, 7.5179f, 21.8663f, 9.8815f, 21.812f)
                horizontalLineTo(13.7615f)
                curveTo(16.1251f, 21.8663f, 18.1849f, 20.2117f, 18.6415f, 17.892f)
                lineTo(19.5915f, 12.122f)
                curveTo(19.9138f, 9.9409f, 18.6362f, 7.8397f, 16.5515f, 7.122f)
                close()
                moveTo(12.8015f, 14.932f)
                lineTo(13.0115f, 15.552f)
                curveTo(13.1036f, 15.8358f, 13.0555f, 16.1464f, 12.8819f, 16.3891f)
                curveTo(12.7083f, 16.6317f, 12.4298f, 16.7775f, 12.1315f, 16.782f)
                horizontalLineTo(11.3915f)
                curveTo(11.0932f, 16.7775f, 10.8147f, 16.6317f, 10.6411f, 16.3891f)
                curveTo(10.4675f, 16.1464f, 10.4194f, 15.8358f, 10.5115f, 15.552f)
                lineTo(10.7215f, 14.932f)
                curveTo(10.8347f, 14.5818f, 10.7464f, 14.1976f, 10.4915f, 13.932f)
                curveTo(9.9249f, 13.2588f, 9.982f, 12.2604f, 10.6217f, 11.6562f)
                curveTo(11.2615f, 11.052f, 12.2615f, 11.052f, 12.9013f, 11.6562f)
                curveTo(13.541f, 12.2604f, 13.5982f, 13.2588f, 13.0315f, 13.932f)
                curveTo(12.7766f, 14.1976f, 12.6883f, 14.5818f, 12.8015f, 14.932f)
                close()
                moveTo(8.55151f, 6.78202f)
                horizontalLineTo(8.91151f)
                verticalLineTo(6.79202f)
                horizontalLineTo(15.0515f)
                verticalLineTo(4.00202f)
                curveTo(15.0137f, 3.1496f, 14.2941f, 2.4882f, 13.4415f, 2.522f)
                horizontalLineTo(10.1615f)
                curveTo(9.309f, 2.4882f, 8.5894f, 3.1496f, 8.5515f, 4.002f)
                verticalLineTo(6.78202f)
                close()
            }
        }.build()
        return _Lockfilled!!
    }

