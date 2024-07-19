import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Arrowsquaredownrightline, null)
}

private var _Arrowsquaredownrightline: ImageVector? = null

public val Arrowsquaredownrightline: ImageVector
    get() {
        if (_Arrowsquaredownrightline != null) {
            return _Arrowsquaredownrightline!!
        }
        _Arrowsquaredownrightline = ImageVector.Builder(
            name = "Arrowsquaredownrightline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(19.7301f, 16.31f)
                curveTo(19.6921f, 16.2208f, 19.6378f, 16.1394f, 19.5701f, 16.07f)
                lineTo(16.6401f, 13.14f)
                curveTo(16.4531f, 12.9394f, 16.1715f, 12.8568f, 15.9058f, 12.9246f)
                curveTo(15.64f, 12.9925f, 15.4325f, 13.2f, 15.3647f, 13.4657f)
                curveTo(15.2968f, 13.7315f, 15.3794f, 14.0131f, 15.5801f, 14.2f)
                lineTo(17.2301f, 15.85f)
                horizontalLineTo(10.1401f)
                curveTo(8.0966f, 15.85f, 6.4401f, 14.1935f, 6.4401f, 12.15f)
                verticalLineTo(10f)
                curveTo(6.4226f, 8.0002f, 8.0014f, 6.3504f, 10.0001f, 6.28f)
                horizontalLineTo(17.9001f)
                curveTo(18.3143f, 6.28f, 18.6501f, 5.9442f, 18.6501f, 5.53f)
                curveTo(18.6501f, 5.1158f, 18.3143f, 4.78f, 17.9001f, 4.78f)
                horizontalLineTo(10.0001f)
                curveTo(7.202f, 4.8773f, 4.9875f, 7.1803f, 5f, 9.98f)
                verticalLineTo(12.15f)
                curveTo(5.0056f, 15.0196f, 7.3304f, 17.3445f, 10.2001f, 17.35f)
                horizontalLineTo(17.2901f)
                lineTo(15.5801f, 19f)
                curveTo(15.2876f, 19.2928f, 15.2876f, 19.7672f, 15.5801f, 20.06f)
                curveTo(15.7199f, 20.2017f, 15.911f, 20.281f, 16.1101f, 20.28f)
                curveTo(16.3093f, 20.2821f, 16.5008f, 20.2026f, 16.6401f, 20.06f)
                lineTo(19.5701f, 17.13f)
                curveTo(19.6378f, 17.0607f, 19.6921f, 16.9793f, 19.7301f, 16.89f)
                curveTo(19.8102f, 16.705f, 19.8102f, 16.4951f, 19.7301f, 16.31f)
                close()
            }
        }.build()
        return _Arrowsquaredownrightline!!
    }

