import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Arrowrightdownline, null)
}

private var _Arrowrightdownline: ImageVector? = null

public val Arrowrightdownline: ImageVector
    get() {
        if (_Arrowrightdownline != null) {
            return _Arrowrightdownline!!
        }
        _Arrowrightdownline = ImageVector.Builder(
            name = "Arrowrightdownline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(18.0496f, 7.43012f)
                curveTo(18.0523f, 7.2304f, 17.9742f, 7.038f, 17.833f, 6.8968f)
                curveTo(17.6917f, 6.7555f, 17.4994f, 6.6774f, 17.2996f, 6.6801f)
                curveTo(16.8854f, 6.6801f, 16.5496f, 7.0159f, 16.5496f, 7.4301f)
                verticalLineTo(15.5001f)
                lineTo(7.21963f, 6.16012f)
                curveTo(7.0327f, 5.9595f, 6.7511f, 5.8769f, 6.4853f, 5.9447f)
                curveTo(6.2196f, 6.0126f, 6.0121f, 6.2201f, 5.9442f, 6.4858f)
                curveTo(5.8764f, 6.7516f, 5.959f, 7.0331f, 6.1596f, 7.2201f)
                lineTo(15.4996f, 16.5601f)
                horizontalLineTo(7.42963f)
                curveTo(7.0154f, 16.5601f, 6.6796f, 16.8959f, 6.6796f, 17.3101f)
                curveTo(6.6796f, 17.7243f, 7.0154f, 18.0601f, 7.4296f, 18.0601f)
                horizontalLineTo(17.3096f)
                curveTo(17.7238f, 18.0601f, 18.0596f, 17.7243f, 18.0596f, 17.3101f)
                lineTo(18.0496f, 7.43012f)
                close()
            }
        }.build()
        return _Arrowrightdownline!!
    }

