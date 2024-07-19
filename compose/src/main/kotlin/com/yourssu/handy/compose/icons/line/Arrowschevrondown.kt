import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Arrowschevrondownline, null)
}

private var _Arrowschevrondownline: ImageVector? = null

public val Arrowschevrondownline: ImageVector
    get() {
        if (_Arrowschevrondownline != null) {
            return _Arrowschevrondownline!!
        }
        _Arrowschevrondownline = ImageVector.Builder(
            name = "Arrowschevrondownline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(11.9998f, 16.75f)
                curveTo(11.8008f, 16.7509f, 11.6097f, 16.6716f, 11.4698f, 16.53f)
                lineTo(3.46985f, 8.53f)
                curveTo(3.1945f, 8.2345f, 3.2026f, 7.774f, 3.4882f, 7.4884f)
                curveTo(3.7738f, 7.2028f, 4.2343f, 7.1946f, 4.5298f, 7.47f)
                lineTo(11.9998f, 14.94f)
                lineTo(19.4698f, 7.47f)
                curveTo(19.7654f, 7.1946f, 20.2259f, 7.2028f, 20.5115f, 7.4884f)
                curveTo(20.7971f, 7.774f, 20.8052f, 8.2345f, 20.5298f, 8.53f)
                lineTo(12.5298f, 16.53f)
                curveTo(12.39f, 16.6716f, 12.1989f, 16.7509f, 11.9998f, 16.75f)
                close()
            }
        }.build()
        return _Arrowschevrondownline!!
    }

