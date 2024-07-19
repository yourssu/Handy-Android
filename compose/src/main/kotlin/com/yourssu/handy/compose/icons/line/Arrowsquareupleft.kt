import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Arrowsquareupleftline, null)
}

private var _Arrowsquareupleftline: ImageVector? = null

public val Arrowsquareupleftline: ImageVector
    get() {
        if (_Arrowsquareupleftline != null) {
            return _Arrowsquareupleftline!!
        }
        _Arrowsquareupleftline = ImageVector.Builder(
            name = "Arrowsquareupleftline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(14.5898f, 7.18007f)
                horizontalLineTo(7.49975f)
                lineTo(9.14975f, 5.53007f)
                curveTo(9.2927f, 5.3908f, 9.3733f, 5.1997f, 9.3733f, 5.0001f)
                curveTo(9.3733f, 4.8005f, 9.2927f, 4.6094f, 9.1497f, 4.4701f)
                curveTo(8.8569f, 4.1776f, 8.3826f, 4.1776f, 8.0898f, 4.4701f)
                lineTo(5.15975f, 7.40007f)
                curveTo(5.092f, 7.4694f, 5.0377f, 7.5508f, 4.9997f, 7.6401f)
                curveTo(4.9298f, 7.8236f, 4.9298f, 8.0265f, 4.9997f, 8.2101f)
                curveTo(5.0351f, 8.3036f, 5.0896f, 8.3888f, 5.1597f, 8.4601f)
                lineTo(8.08975f, 11.3901f)
                curveTo(8.2326f, 11.5272f, 8.4218f, 11.6058f, 8.6197f, 11.6101f)
                curveTo(8.8182f, 11.6078f, 9.008f, 11.529f, 9.1497f, 11.3901f)
                curveTo(9.2927f, 11.2508f, 9.3733f, 11.0597f, 9.3733f, 10.8601f)
                curveTo(9.3733f, 10.6605f, 9.2927f, 10.4694f, 9.1497f, 10.3301f)
                lineTo(7.49975f, 8.68007f)
                horizontalLineTo(14.5898f)
                curveTo(16.6332f, 8.6801f, 18.2898f, 10.3366f, 18.2898f, 12.3801f)
                verticalLineTo(14.5501f)
                curveTo(18.3017f, 16.5443f, 16.7229f, 18.1851f, 14.7298f, 18.2501f)
                horizontalLineTo(6.82975f)
                curveTo(6.4155f, 18.2501f, 6.0797f, 18.5859f, 6.0797f, 19.0001f)
                curveTo(6.0797f, 19.4143f, 6.4155f, 19.7501f, 6.8297f, 19.7501f)
                horizontalLineTo(14.7598f)
                curveTo(17.5601f, 19.658f, 19.7775f, 17.3519f, 19.7598f, 14.5501f)
                verticalLineTo(12.3801f)
                curveTo(19.7598f, 9.5199f, 17.4499f, 7.1966f, 14.5898f, 7.1801f)
                close()
            }
        }.build()
        return _Arrowsquareupleftline!!
    }

