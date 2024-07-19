import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Arrowupdowncornerline, null)
}

private var _Arrowupdowncornerline: ImageVector? = null

public val Arrowupdowncornerline: ImageVector
    get() {
        if (_Arrowupdowncornerline != null) {
            return _Arrowupdowncornerline!!
        }
        _Arrowupdowncornerline = ImageVector.Builder(
            name = "Arrowupdowncornerline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(5.20005f, 10.76f)
                horizontalLineTo(10f)
                curveTo(10.4143f, 10.76f, 10.75f, 10.4242f, 10.75f, 10.01f)
                curveTo(10.75f, 9.5958f, 10.4143f, 9.26f, 10f, 9.26f)
                horizontalLineTo(3.39005f)
                curveTo(3.2903f, 9.2597f, 3.1915f, 9.2802f, 3.1f, 9.32f)
                curveTo(2.9158f, 9.3989f, 2.7689f, 9.5457f, 2.69f, 9.73f)
                curveTo(2.6749f, 9.8227f, 2.6749f, 9.9173f, 2.69f, 10.01f)
                verticalLineTo(16.64f)
                curveTo(2.69f, 17.0542f, 3.0258f, 17.39f, 3.44f, 17.39f)
                curveTo(3.8543f, 17.39f, 4.1901f, 17.0542f, 4.1901f, 16.64f)
                verticalLineTo(11.82f)
                lineTo(10.53f, 18.16f)
                curveTo(10.6693f, 18.3026f, 10.8608f, 18.3821f, 11.06f, 18.38f)
                curveTo(11.2591f, 18.381f, 11.4502f, 18.3017f, 11.59f, 18.16f)
                curveTo(11.8825f, 17.8672f, 11.8825f, 17.3928f, 11.59f, 17.1f)
                lineTo(5.20005f, 10.76f)
                close()
            }
            handyPath {
                moveTo(21.3601f, 7.35003f)
                curveTo(21.3601f, 6.9358f, 21.0243f, 6.6f, 20.6101f, 6.6f)
                curveTo(20.1958f, 6.6f, 19.8601f, 6.9358f, 19.8601f, 7.35f)
                verticalLineTo(12.18f)
                lineTo(13.52f, 5.84003f)
                curveTo(13.3808f, 5.6971f, 13.1896f, 5.6165f, 12.99f, 5.6165f)
                curveTo(12.7905f, 5.6165f, 12.5993f, 5.6971f, 12.46f, 5.84f)
                curveTo(12.1676f, 6.1328f, 12.1676f, 6.6072f, 12.46f, 6.9f)
                lineTo(18.8f, 13.24f)
                horizontalLineTo(14f)
                curveTo(13.5858f, 13.24f, 13.25f, 13.5758f, 13.25f, 13.99f)
                curveTo(13.25f, 14.4042f, 13.5858f, 14.74f, 14f, 14.74f)
                horizontalLineTo(20.6301f)
                curveTo(20.7298f, 14.7403f, 20.8286f, 14.7199f, 20.92f, 14.68f)
                curveTo(21.1043f, 14.6011f, 21.2511f, 14.4543f, 21.33f, 14.27f)
                curveTo(21.362f, 14.1801f, 21.3789f, 14.0855f, 21.3801f, 13.99f)
                lineTo(21.3601f, 7.35003f)
                close()
            }
        }.build()
        return _Arrowupdowncornerline!!
    }

