import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Arrowleftupline, null)
}

private var _Arrowleftupline: ImageVector? = null

public val Arrowleftupline: ImageVector
    get() {
        if (_Arrowleftupline != null) {
            return _Arrowleftupline!!
        }
        _Arrowleftupline = ImageVector.Builder(
            name = "Arrowleftupline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(16.7806f, 17.8501f)
                curveTo(16.9239f, 17.9853f, 17.1136f, 18.0605f, 17.3106f, 18.0601f)
                curveTo(17.5082f, 18.0637f, 17.6991f, 17.9881f, 17.8406f, 17.8501f)
                curveTo(17.9841f, 17.7091f, 18.065f, 17.5163f, 18.065f, 17.3151f)
                curveTo(18.065f, 17.1139f, 17.9841f, 16.9211f, 17.8406f, 16.7801f)
                lineTo(8.49042f, 7.42993f)
                horizontalLineTo(16.6306f)
                curveTo(17.0448f, 7.4299f, 17.3806f, 7.0941f, 17.3806f, 6.6799f)
                curveTo(17.3806f, 6.2657f, 17.0448f, 5.9299f, 16.6306f, 5.9299f)
                horizontalLineTo(6.78471f)
                curveTo(6.6869f, 5.915f, 6.5855f, 5.9194f, 6.4863f, 5.9447f)
                curveTo(6.2206f, 6.0126f, 6.0131f, 6.2201f, 5.9452f, 6.4858f)
                curveTo(5.9f, 6.663f, 5.9216f, 6.8473f, 6.0006f, 7.0058f)
                verticalLineTo(16.5699f)
                curveTo(5.9946f, 16.9674f, 6.3037f, 17.2985f, 6.7006f, 17.3199f)
                lineTo(6.69057f, 17.3099f)
                curveTo(7.1048f, 17.3099f, 7.4406f, 16.9741f, 7.4406f, 16.5599f)
                verticalLineTo(8.50129f)
                lineTo(16.7806f, 17.8501f)
                close()
            }
        }.build()
        return _Arrowleftupline!!
    }

