import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Wifiline, null)
}

private var _Wifiline: ImageVector? = null

public val Wifiline: ImageVector
    get() {
        if (_Wifiline != null) {
            return _Wifiline!!
        }
        _Wifiline = ImageVector.Builder(
            name = "Wifiline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(12.5417f, 17.31f)
                curveTo(12.1497f, 17.0503f, 11.6496f, 17.017f, 11.2265f, 17.2223f)
                curveTo(10.8034f, 17.4277f, 10.5202f, 17.8413f, 10.4817f, 18.31f)
                verticalLineTo(18.37f)
                curveTo(10.5415f, 19.0573f, 11.1169f, 19.5848f, 11.8067f, 19.5848f)
                curveTo(12.4966f, 19.5848f, 13.072f, 19.0573f, 13.1317f, 18.37f)
                verticalLineTo(18.31f)
                curveTo(13.0986f, 17.9039f, 12.8812f, 17.5354f, 12.5417f, 17.31f)
                close()
            }
            handyPath {
                moveTo(6.79174f, 14.4f)
                curveTo(6.4783f, 14.6361f, 6.4076f, 15.0778f, 6.6317f, 15.4f)
                curveTo(6.8707f, 15.7088f, 7.3084f, 15.7788f, 7.6317f, 15.56f)
                curveTo(10.0707f, 13.7548f, 13.4028f, 13.7548f, 15.8417f, 15.56f)
                curveTo(15.9689f, 15.6624f, 16.1286f, 15.7156f, 16.2917f, 15.71f)
                curveTo(16.5898f, 15.7035f, 16.8548f, 15.5187f, 16.9641f, 15.2413f)
                curveTo(17.0733f, 14.9639f, 17.0053f, 14.648f, 16.7917f, 14.44f)
                curveTo(13.8303f, 12.2278f, 9.7708f, 12.2116f, 6.7917f, 14.4f)
                close()
            }
            handyPath {
                moveTo(22.2517f, 7.61f)
                curveTo(19.255f, 5.2927f, 15.5799f, 4.0243f, 11.7917f, 4f)
                curveTo(8.0053f, 4.0148f, 4.3292f, 5.2765f, 1.3317f, 7.59f)
                curveTo(1.0988f, 7.7465f, 0.9728f, 8.0199f, 1.005f, 8.2987f)
                curveTo(1.0372f, 8.5774f, 1.2223f, 8.8148f, 1.4848f, 8.9141f)
                curveTo(1.7473f, 9.0133f, 2.0432f, 8.9577f, 2.2517f, 8.77f)
                curveTo(4.9856f, 6.6605f, 8.3387f, 5.5112f, 11.7917f, 5.5f)
                curveTo(15.2553f, 5.5147f, 18.6167f, 6.675f, 21.3517f, 8.8f)
                curveTo(21.5074f, 8.9241f, 21.7065f, 8.9803f, 21.9041f, 8.9559f)
                curveTo(22.1017f, 8.9314f, 22.2811f, 8.8284f, 22.4017f, 8.67f)
                curveTo(22.5243f, 8.5102f, 22.5774f, 8.3079f, 22.5492f, 8.1085f)
                curveTo(22.521f, 7.9092f, 22.4138f, 7.7295f, 22.2517f, 7.61f)
                close()
            }
            handyPath {
                moveTo(11.7917f, 8.37f)
                curveTo(8.9894f, 8.3716f, 6.267f, 9.3037f, 4.0517f, 11.02f)
                curveTo(3.7236f, 11.2716f, 3.661f, 11.7412f, 3.9117f, 12.07f)
                curveTo(4.0554f, 12.2564f, 4.2764f, 12.367f, 4.5117f, 12.37f)
                curveTo(4.6815f, 12.3788f, 4.8496f, 12.3332f, 4.9917f, 12.24f)
                curveTo(9.0058f, 9.1276f, 14.6177f, 9.1276f, 18.6317f, 12.24f)
                curveTo(18.9609f, 12.4662f, 19.4096f, 12.3947f, 19.6523f, 12.0775f)
                curveTo(19.8949f, 11.7602f, 19.8463f, 11.3084f, 19.5417f, 11.05f)
                curveTo(17.3291f, 9.3182f, 14.6015f, 8.375f, 11.7917f, 8.37f)
                close()
            }
        }.build()
        return _Wifiline!!
    }

