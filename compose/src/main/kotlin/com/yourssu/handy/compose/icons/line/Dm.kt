import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
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
    Image(Dmline, null)
}

private var _Dmline: ImageVector? = null

public val Dmline: ImageVector
    get() {
        if (_Dmline != null) {
            return _Dmline!!
        }
        _Dmline = ImageVector.Builder(
            name = "Dmline",
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
                moveTo(9.49994f, 2.22012f)
                curveTo(10.1802f, 2.0739f, 10.8741f, 2.0001f, 11.5699f, 2.0001f)
                curveTo(14.3518f, 1.9865f, 17.0031f, 3.1791f, 18.8385f, 5.2696f)
                curveTo(20.6739f, 7.3601f, 21.5134f, 10.1434f, 21.1399f, 12.9001f)
                curveTo(20.5399f, 17.5001f, 15.9999f, 21.2201f, 11.3599f, 21.2201f)
                horizontalLineTo(4.69994f)
                curveTo(4.1338f, 21.2204f, 3.6092f, 20.9232f, 3.3182f, 20.4376f)
                curveTo(3.0272f, 19.952f, 3.0127f, 19.3492f, 3.2799f, 18.8501f)
                lineTo(3.54994f, 18.3301f)
                curveTo(3.8187f, 17.8293f, 3.7996f, 17.2231f, 3.4999f, 16.7401f)
                curveTo(1.8216f, 14.1017f, 1.5335f, 10.8113f, 2.7277f, 7.9213f)
                curveTo(3.9219f, 5.0314f, 6.4487f, 2.9042f, 9.4999f, 2.2201f)
                close()
                moveTo(11.2799f, 19.7101f)
                curveTo(15.3566f, 19.6458f, 18.8235f, 16.7184f, 19.5699f, 12.7101f)
                curveTo(19.909f, 10.3872f, 19.2106f, 8.0326f, 17.6599f, 6.2701f)
                curveTo(16.1239f, 4.5124f, 13.9042f, 3.5028f, 11.5699f, 3.5001f)
                curveTo(10.9787f, 3.5012f, 10.3891f, 3.5615f, 9.8099f, 3.6801f)
                curveTo(7.2351f, 4.253f, 5.0997f, 6.0424f, 4.0852f, 8.4773f)
                curveTo(3.0706f, 10.9122f, 3.3037f, 13.6884f, 4.7099f, 15.9201f)
                curveTo(5.3082f, 16.86f, 5.3503f, 18.0503f, 4.8199f, 19.0301f)
                lineTo(4.54993f, 19.5401f)
                curveTo(4.5279f, 19.5735f, 4.5279f, 19.6167f, 4.5499f, 19.6501f)
                curveTo(4.5899f, 19.7101f, 4.6499f, 19.7101f, 4.6499f, 19.7101f)
                horizontalLineTo(11.2799f)
                close()
            }
        }.build()
        return _Dmline!!
    }

