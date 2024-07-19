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
    Image(Linkedinfilled, null)
}

private var _Linkedinfilled: ImageVector? = null

public val Linkedinfilled: ImageVector
    get() {
        if (_Linkedinfilled != null) {
            return _Linkedinfilled!!
        }
        _Linkedinfilled = ImageVector.Builder(
            name = "Linkedinfilled",
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
                moveTo(17.9745f, 16.977f)
                curveTo(17.9761f, 17.1751f, 17.9123f, 17.232f, 17.7196f, 17.2275f)
                curveTo(17.1721f, 17.217f, 16.6245f, 17.2087f, 16.0778f, 17.2305f)
                curveTo(15.8033f, 17.2417f, 15.7207f, 17.1705f, 15.7245f, 16.8848f)
                curveTo(15.7411f, 15.654f, 15.7305f, 14.4225f, 15.7327f, 13.1911f)
                curveTo(15.7327f, 12.8536f, 15.7103f, 12.5191f, 15.5865f, 12.201f)
                curveTo(15.3765f, 11.664f, 15.0142f, 11.3003f, 14.4136f, 11.2477f)
                curveTo(13.7745f, 11.1915f, 13.3103f, 11.4825f, 12.9968f, 12.0218f)
                curveTo(12.7913f, 12.3751f, 12.7441f, 12.7695f, 12.7448f, 13.173f)
                curveTo(12.7478f, 14.4172f, 12.7381f, 15.6607f, 12.7522f, 16.9042f)
                curveTo(12.7561f, 17.1721f, 12.6742f, 17.2387f, 12.4177f, 17.2297f)
                curveTo(11.871f, 17.211f, 11.3235f, 17.2156f, 10.7761f, 17.2283f)
                curveTo(10.5661f, 17.2335f, 10.5022f, 17.1705f, 10.5022f, 16.9575f)
                curveTo(10.5091f, 14.3955f, 10.5082f, 11.8335f, 10.5038f, 9.2716f)
                curveTo(10.5038f, 9.0878f, 10.5413f, 9.0052f, 10.7482f, 9.0098f)
                curveTo(11.3325f, 9.0225f, 11.9175f, 9.0225f, 12.5017f, 9.0098f)
                curveTo(12.7042f, 9.0061f, 12.7575f, 9.0795f, 12.7492f, 9.2686f)
                curveTo(12.7365f, 9.5753f, 12.7462f, 9.8827f, 12.7462f, 10.2697f)
                curveTo(13.6126f, 9.1987f, 14.6557f, 8.8471f, 15.8948f, 9.0968f)
                curveTo(17.0948f, 9.339f, 17.9205f, 10.4191f, 17.955f, 11.8658f)
                curveTo(17.9955f, 13.5682f, 17.9656f, 15.273f, 17.9745f, 16.977f)
                close()
                moveTo(7.89081f, 8.05656f)
                curveTo(7.164f, 8.055f, 6.5955f, 7.479f, 6.5971f, 6.7471f)
                curveTo(6.5985f, 6.024f, 7.1843f, 5.4346f, 7.8982f, 5.436f)
                curveTo(8.6131f, 5.4382f, 9.1936f, 6.03f, 9.1913f, 6.7537f)
                curveTo(9.1897f, 7.4873f, 8.6198f, 8.058f, 7.8908f, 8.0566f)
                close()
                moveTo(8.69481f, 17.2305f)
                curveTo(8.1487f, 17.2087f, 7.6006f, 17.217f, 7.0538f, 17.2275f)
                curveTo(6.858f, 17.2313f, 6.7696f, 17.1952f, 6.7702f, 16.9672f)
                curveTo(6.7778f, 14.4067f, 6.777f, 11.8471f, 6.771f, 9.2865f)
                curveTo(6.7702f, 9.0811f, 6.8198f, 9.0037f, 7.0387f, 9.0098f)
                curveTo(7.5976f, 9.024f, 8.1577f, 9.0278f, 8.7158f, 9.0082f)
                curveTo(8.973f, 8.9992f, 9.0202f, 9.0945f, 9.0188f, 9.327f)
                curveTo(9.0091f, 10.5945f, 9.0142f, 11.862f, 9.0142f, 13.1302f)
                curveTo(9.0142f, 14.385f, 9.0068f, 15.6406f, 9.0196f, 16.896f)
                curveTo(9.0226f, 17.151f, 8.964f, 17.2411f, 8.6948f, 17.2305f)
                close()
                moveTo(20.9182f, 6.03756f)
                curveTo(20.8672f, 5.6302f, 20.8605f, 5.211f, 20.6355f, 4.8466f)
                curveTo(19.9073f, 3.6653f, 18.9022f, 2.9925f, 17.4615f, 3.0001f)
                curveTo(13.8166f, 3.0188f, 10.1716f, 3.0001f, 6.5265f, 3.0128f)
                curveTo(5.9791f, 3.0142f, 5.4158f, 3.0322f, 4.9186f, 3.3262f)
                curveTo(3.705f, 4.0447f, 2.9925f, 5.049f, 3.0001f, 6.5212f)
                curveTo(3.0172f, 10.1783f, 3.0001f, 13.8352f, 3.012f, 17.493f)
                curveTo(3.0142f, 18.0082f, 3.0218f, 18.5475f, 3.2917f, 19.0117f)
                curveTo(3.9292f, 20.1098f, 4.7693f, 20.9251f, 6.1492f, 20.9197f)
                curveTo(6.189f, 20.9197f, 6.2198f, 20.9385f, 6.2528f, 20.9557f)
                horizontalLineTo(17.7466f)
                curveTo(17.8103f, 20.8987f, 17.8883f, 20.9272f, 17.9603f, 20.9182f)
                curveTo(18.3735f, 20.8665f, 18.8003f, 20.8642f, 19.167f, 20.6272f)
                curveTo(20.1922f, 19.9642f, 20.946f, 19.1295f, 20.9228f, 17.8102f)
                curveTo(20.9228f, 17.787f, 20.9392f, 17.7661f, 20.9566f, 17.7466f)
                verticalLineTo(6.25281f)
                curveTo(20.9055f, 6.1876f, 20.9272f, 6.1102f, 20.9182f, 6.0376f)
                close()
            }
        }.build()
        return _Linkedinfilled!!
    }

