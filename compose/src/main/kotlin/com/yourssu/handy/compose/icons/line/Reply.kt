import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Replyline, null)
}

private var _Replyline: ImageVector? = null

public val Replyline: ImageVector
    get() {
        if (_Replyline != null) {
            return _Replyline!!
        }
        _Replyline = ImageVector.Builder(
            name = "Replyline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(19.7501f, 5f)
                curveTo(19.3381f, 5.0054f, 19.0055f, 5.338f, 19.0001f, 5.75f)
                verticalLineTo(7.75f)
                curveTo(19.0109f, 8.8804f, 18.5666f, 9.9677f, 17.7672f, 10.7671f)
                curveTo(16.9678f, 11.5665f, 15.8805f, 12.0108f, 14.7501f, 12f)
                horizontalLineTo(5.56007f)
                lineTo(10.2801f, 7.25f)
                curveTo(10.451f, 6.9494f, 10.3942f, 6.571f, 10.1428f, 6.3338f)
                curveTo(9.8913f, 6.0965f, 9.5102f, 6.0619f, 9.2201f, 6.25f)
                lineTo(3.22007f, 12.25f)
                curveTo(3.1523f, 12.3194f, 3.098f, 12.4007f, 3.0601f, 12.49f)
                curveTo(2.98f, 12.675f, 2.98f, 12.885f, 3.0601f, 13.07f)
                curveTo(3.098f, 13.1593f, 3.1523f, 13.2406f, 3.2201f, 13.31f)
                lineTo(9.22007f, 19.31f)
                curveTo(9.5129f, 19.6025f, 9.9873f, 19.6025f, 10.2801f, 19.31f)
                curveTo(10.5725f, 19.0172f, 10.5725f, 18.5428f, 10.2801f, 18.25f)
                lineTo(5.56007f, 13.5f)
                horizontalLineTo(14.7501f)
                curveTo(16.28f, 13.5162f, 17.752f, 12.9156f, 18.8338f, 11.8338f)
                curveTo(19.9157f, 10.7519f, 20.5163f, 9.2799f, 20.5001f, 7.75f)
                verticalLineTo(5.75f)
                curveTo(20.4947f, 5.338f, 20.162f, 5.0054f, 19.7501f, 5f)
                close()
            }
        }.build()
        return _Replyline!!
    }

