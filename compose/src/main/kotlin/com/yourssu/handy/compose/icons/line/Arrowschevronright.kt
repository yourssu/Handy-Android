import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Arrowschevronrightline, null)
}

private var _Arrowschevronrightline: ImageVector? = null

public val Arrowschevronrightline: ImageVector
    get() {
        if (_Arrowschevronrightline != null) {
            return _Arrowschevronrightline!!
        }
        _Arrowschevronrightline = ImageVector.Builder(
            name = "Arrowschevronrightline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(8.00032f, 20.75f)
                curveTo(8.1994f, 20.7509f, 8.3904f, 20.6716f, 8.5303f, 20.53f)
                lineTo(16.5303f, 12.53f)
                curveTo(16.8228f, 12.2372f, 16.8228f, 11.7628f, 16.5303f, 11.47f)
                lineTo(8.53032f, 3.47f)
                curveTo(8.2348f, 3.1946f, 7.7743f, 3.2028f, 7.4887f, 3.4884f)
                curveTo(7.2031f, 3.774f, 7.195f, 4.2345f, 7.4703f, 4.53f)
                lineTo(14.9403f, 12f)
                lineTo(7.47032f, 19.47f)
                curveTo(7.1779f, 19.7628f, 7.1779f, 20.2372f, 7.4703f, 20.53f)
                curveTo(7.6102f, 20.6716f, 7.8012f, 20.7509f, 8.0003f, 20.75f)
                close()
            }
        }.build()
        return _Arrowschevronrightline!!
    }

