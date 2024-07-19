import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Arrowrotateline, null)
}

private var _Arrowrotateline: ImageVector? = null

public val Arrowrotateline: ImageVector
    get() {
        if (_Arrowrotateline != null) {
            return _Arrowrotateline!!
        }
        _Arrowrotateline = ImageVector.Builder(
            name = "Arrowrotateline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(12f, 6f)
                curveTo(7.07f, 6f, 3.21f, 8f, 3.21f, 10.63f)
                curveTo(3.21f, 13.08f, 6.56f, 15.02f, 11f, 15.28f)
                lineTo(9.50996f, 16.76f)
                curveTo(9.2175f, 17.0528f, 9.2175f, 17.5272f, 9.51f, 17.82f)
                curveTo(9.8062f, 18.1136f, 10.2837f, 18.1136f, 10.58f, 17.82f)
                lineTo(13.31f, 15.09f)
                curveTo(13.6024f, 14.7972f, 13.6024f, 14.3228f, 13.31f, 14.03f)
                lineTo(10.58f, 11.3f)
                curveTo(10.2815f, 11.0117f, 9.8084f, 11.0117f, 9.51f, 11.3f)
                curveTo(9.2175f, 11.5928f, 9.2175f, 12.0672f, 9.51f, 12.36f)
                lineTo(10.93f, 13.77f)
                curveTo(7.22f, 13.52f, 4.71f, 12f, 4.71f, 10.63f)
                curveTo(4.71f, 9.26f, 7.71f, 7.46f, 12f, 7.46f)
                curveTo(16.29f, 7.46f, 19.29f, 9.13f, 19.29f, 10.63f)
                curveTo(19.29f, 11.63f, 18.02f, 12.63f, 16.05f, 13.24f)
                curveTo(15.6523f, 13.3615f, 15.4285f, 13.7824f, 15.55f, 14.18f)
                curveTo(15.6715f, 14.5776f, 16.0923f, 14.8015f, 16.49f, 14.68f)
                curveTo(19.18f, 13.85f, 20.79f, 12.34f, 20.79f, 10.68f)
                curveTo(20.79f, 8f, 16.93f, 6f, 12f, 6f)
                close()
            }
        }.build()
        return _Arrowrotateline!!
    }

