import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Arrowrightline, null)
}

private var _Arrowrightline: ImageVector? = null

public val Arrowrightline: ImageVector
    get() {
        if (_Arrowrightline != null) {
            return _Arrowrightline!!
        }
        _Arrowrightline = ImageVector.Builder(
            name = "Arrowrightline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(20.0505f, 11.47f)
                lineTo(13.0505f, 4.47f)
                curveTo(12.8575f, 4.2824f, 12.5792f, 4.212f, 12.3203f, 4.2853f)
                curveTo(12.0614f, 4.3586f, 11.8613f, 4.5645f, 11.7953f, 4.8253f)
                curveTo(11.7293f, 5.0862f, 11.8075f, 5.3624f, 12.0005f, 5.55f)
                lineTo(17.7105f, 11.25f)
                horizontalLineTo(4.48047f)
                curveTo(4.0663f, 11.25f, 3.7305f, 11.5858f, 3.7305f, 12f)
                curveTo(3.7305f, 12.4142f, 4.0663f, 12.75f, 4.4805f, 12.75f)
                horizontalLineTo(17.7005f)
                lineTo(12.0005f, 18.45f)
                curveTo(11.8575f, 18.5893f, 11.7769f, 18.7804f, 11.7769f, 18.98f)
                curveTo(11.7769f, 19.1796f, 11.8575f, 19.3707f, 12.0005f, 19.51f)
                curveTo(12.1383f, 19.6546f, 12.3307f, 19.7345f, 12.5305f, 19.73f)
                curveTo(12.7295f, 19.7309f, 12.9206f, 19.6516f, 13.0605f, 19.51f)
                lineTo(20.0605f, 12.51f)
                curveTo(20.3529f, 12.2172f, 20.3529f, 11.7428f, 20.0605f, 11.45f)
                lineTo(20.0505f, 11.47f)
                close()
            }
        }.build()
        return _Arrowrightline!!
    }

