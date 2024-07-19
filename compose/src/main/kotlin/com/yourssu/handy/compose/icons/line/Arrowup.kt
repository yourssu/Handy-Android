import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Arrowupline, null)
}

private var _Arrowupline: ImageVector? = null

public val Arrowupline: ImageVector
    get() {
        if (_Arrowupline != null) {
            return _Arrowupline!!
        }
        _Arrowupline = ImageVector.Builder(
            name = "Arrowupline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(4.49001f, 11.9999f)
                curveTo(4.6234f, 12.1404f, 4.8065f, 12.223f, 5f, 12.2299f)
                curveTo(5.2075f, 12.2338f, 5.407f, 12.1503f, 5.55f, 11.9999f)
                lineTo(11.25f, 6.29994f)
                verticalLineTo(19.52f)
                curveTo(11.2554f, 19.932f, 11.588f, 20.2646f, 12f, 20.27f)
                curveTo(12.412f, 20.2646f, 12.7446f, 19.932f, 12.75f, 19.52f)
                verticalLineTo(6.29993f)
                lineTo(18.45f, 11.9999f)
                curveTo(18.6411f, 12.1964f, 18.9226f, 12.276f, 19.1883f, 12.2087f)
                curveTo(19.4541f, 12.1415f, 19.6637f, 11.9375f, 19.7383f, 11.6738f)
                curveTo(19.8129f, 11.41f, 19.7411f, 11.1264f, 19.55f, 10.9299f)
                lineTo(12.55f, 3.92994f)
                curveTo(12.2529f, 3.648f, 11.7871f, 3.648f, 11.49f, 3.9299f)
                lineTo(4.49001f, 10.9299f)
                curveTo(4.3465f, 11.071f, 4.2656f, 11.2637f, 4.2656f, 11.4649f)
                curveTo(4.2656f, 11.6661f, 4.3465f, 11.8589f, 4.49f, 11.9999f)
                close()
            }
        }.build()
        return _Arrowupline!!
    }

