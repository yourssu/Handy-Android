import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Sendline, null)
}

private var _Sendline: ImageVector? = null

public val Sendline: ImageVector
    get() {
        if (_Sendline != null) {
            return _Sendline!!
        }
        _Sendline = ImageVector.Builder(
            name = "Sendline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(13.0236f, 3.21934f)
                lineTo(18.7833f, 9.03934f)
                curveTo(19.0722f, 9.3322f, 19.0722f, 9.8065f, 18.7833f, 10.0993f)
                curveTo(18.6457f, 10.2423f, 18.4569f, 10.3229f, 18.2597f, 10.3229f)
                curveTo(18.0625f, 10.3229f, 17.8737f, 10.2423f, 17.7361f, 10.0993f)
                lineTo(13.241f, 5.55934f)
                verticalLineTo(16.7893f)
                curveTo(13.241f, 17.2036f, 12.9092f, 17.5393f, 12.5f, 17.5393f)
                curveTo(12.0908f, 17.5393f, 11.759f, 17.2036f, 11.759f, 16.7893f)
                verticalLineTo(5.55934f)
                lineTo(7.26391f, 10.0993f)
                curveTo(7.1264f, 10.2419f, 6.9372f, 10.3214f, 6.7403f, 10.3193f)
                curveTo(6.5436f, 10.3203f, 6.3549f, 10.241f, 6.2167f, 10.0993f)
                curveTo(5.9278f, 9.8065f, 5.9278f, 9.3322f, 6.2167f, 9.0393f)
                lineTo(11.9764f, 3.21934f)
                curveTo(12.2657f, 2.9269f, 12.7343f, 2.9269f, 13.0236f, 3.2193f)
                close()
            }
            handyPath {
                moveTo(7.5603f, 19.0793f)
                horizontalLineTo(17.4397f)
                curveTo(17.8489f, 19.0793f, 18.1807f, 19.4151f, 18.1807f, 19.8293f)
                curveTo(18.1807f, 20.2436f, 17.8489f, 20.5793f, 17.4397f, 20.5793f)
                horizontalLineTo(7.5603f)
                curveTo(7.1511f, 20.5793f, 6.8193f, 20.2436f, 6.8193f, 19.8293f)
                curveTo(6.8193f, 19.4151f, 7.1511f, 19.0793f, 7.5603f, 19.0793f)
                close()
            }
        }.build()
        return _Sendline!!
    }

