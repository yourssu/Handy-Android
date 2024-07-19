import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Arrowupdownline, null)
}

private var _Arrowupdownline: ImageVector? = null

public val Arrowupdownline: ImageVector
    get() {
        if (_Arrowupdownline != null) {
            return _Arrowupdownline!!
        }
        _Arrowupdownline = ImageVector.Builder(
            name = "Arrowupdownline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(21.9104f, 14.2801f)
                curveTo(21.7694f, 14.1366f, 21.5766f, 14.0557f, 21.3754f, 14.0557f)
                curveTo(21.1742f, 14.0557f, 20.9814f, 14.1366f, 20.8404f, 14.2801f)
                lineTo(17.4404f, 17.6901f)
                verticalLineTo(8.69009f)
                curveTo(17.4404f, 8.2759f, 17.1046f, 7.9401f, 16.6904f, 7.9401f)
                curveTo(16.2762f, 7.9401f, 15.9404f, 8.2759f, 15.9404f, 8.6901f)
                verticalLineTo(17.6901f)
                lineTo(12.5304f, 14.2801f)
                curveTo(12.3411f, 14.0889f, 12.0641f, 14.0133f, 11.8039f, 14.0818f)
                curveTo(11.5437f, 14.1502f, 11.3398f, 14.3522f, 11.2689f, 14.6118f)
                curveTo(11.1981f, 14.8713f, 11.2711f, 15.1489f, 11.4604f, 15.3401f)
                lineTo(16.1604f, 20.0001f)
                curveTo(16.2279f, 20.0702f, 16.3098f, 20.1248f, 16.4004f, 20.1601f)
                curveTo(16.4919f, 20.2f, 16.5907f, 20.2204f, 16.6904f, 20.2201f)
                curveTo(16.787f, 20.2205f, 16.8825f, 20.2f, 16.9704f, 20.1601f)
                curveTo(17.064f, 20.1247f, 17.1491f, 20.0702f, 17.2204f, 20.0001f)
                lineTo(21.9104f, 15.3101f)
                curveTo(22.1835f, 15.021f, 22.1835f, 14.5691f, 21.9104f, 14.2801f)
                close()
            }
            handyPath {
                moveTo(11.4704f, 9.72009f)
                curveTo(11.7667f, 10.0137f, 12.2442f, 10.0137f, 12.5404f, 9.7201f)
                curveTo(12.8329f, 9.4273f, 12.8329f, 8.9529f, 12.5404f, 8.6601f)
                lineTo(7.84043f, 4.00009f)
                curveTo(7.773f, 3.93f, 7.6911f, 3.8754f, 7.6004f, 3.8401f)
                curveTo(7.4169f, 3.7701f, 7.214f, 3.7701f, 7.0304f, 3.8401f)
                curveTo(6.9381f, 3.8778f, 6.8533f, 3.932f, 6.7804f, 4.0001f)
                lineTo(2.09043f, 8.66009f)
                curveTo(1.798f, 8.9529f, 1.798f, 9.4273f, 2.0904f, 9.7201f)
                curveTo(2.2297f, 9.863f, 2.4209f, 9.9437f, 2.6204f, 9.9437f)
                curveTo(2.82f, 9.9437f, 3.0112f, 9.863f, 3.1504f, 9.7201f)
                lineTo(6.56043f, 6.31009f)
                verticalLineTo(15.3101f)
                curveTo(6.5604f, 15.578f, 6.7034f, 15.8256f, 6.9354f, 15.9596f)
                curveTo(7.1675f, 16.0936f, 7.4534f, 16.0936f, 7.6854f, 15.9596f)
                curveTo(7.9175f, 15.8256f, 8.0604f, 15.578f, 8.0604f, 15.3101f)
                verticalLineTo(6.31009f)
                lineTo(11.4704f, 9.72009f)
                close()
            }
        }.build()
        return _Arrowupdownline!!
    }

