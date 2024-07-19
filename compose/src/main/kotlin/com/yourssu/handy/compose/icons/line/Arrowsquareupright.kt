import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Arrowsquareuprightline, null)
}

private var _Arrowsquareuprightline: ImageVector? = null

public val Arrowsquareuprightline: ImageVector
    get() {
        if (_Arrowsquareuprightline != null) {
            return _Arrowsquareuprightline!!
        }
        _Arrowsquareuprightline = ImageVector.Builder(
            name = "Arrowsquareuprightline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(15.5804f, 11.3899f)
                curveTo(15.7233f, 11.5271f, 15.9124f, 11.6056f, 16.1104f, 11.6099f)
                curveTo(16.3088f, 11.6076f, 16.4987f, 11.5288f, 16.6404f, 11.3899f)
                lineTo(19.5704f, 8.45993f)
                curveTo(19.6405f, 8.3886f, 19.695f, 8.3035f, 19.7304f, 8.2099f)
                curveTo(19.81f, 8.0283f, 19.81f, 7.8216f, 19.7304f, 7.6399f)
                curveTo(19.6925f, 7.5507f, 19.6382f, 7.4693f, 19.5704f, 7.3999f)
                lineTo(16.6404f, 4.46993f)
                curveTo(16.4535f, 4.2693f, 16.1719f, 4.1867f, 15.9061f, 4.2545f)
                curveTo(15.6404f, 4.3224f, 15.4329f, 4.5299f, 15.365f, 4.7956f)
                curveTo(15.2972f, 5.0614f, 15.3798f, 5.343f, 15.5804f, 5.5299f)
                lineTo(17.2304f, 7.17993f)
                horizontalLineTo(10.1404f)
                curveTo(7.2686f, 7.1799f, 4.9404f, 9.5081f, 4.9404f, 12.3799f)
                verticalLineTo(14.6599f)
                curveTo(4.9506f, 17.4319f, 7.1691f, 19.6903f, 9.9404f, 19.7499f)
                horizontalLineTo(17.1204f)
                curveTo(17.3237f, 19.7553f, 17.5207f, 19.679f, 17.6673f, 19.538f)
                curveTo(17.8138f, 19.3971f, 17.8978f, 19.2033f, 17.9004f, 18.9999f)
                curveTo(17.9005f, 18.5896f, 17.5707f, 18.2554f, 17.1604f, 18.2499f)
                horizontalLineTo(10.0004f)
                curveTo(8.0017f, 18.1903f, 6.4141f, 16.5495f, 6.4204f, 14.5499f)
                verticalLineTo(12.3799f)
                curveTo(6.4204f, 10.3365f, 8.077f, 8.6799f, 10.1204f, 8.6799f)
                horizontalLineTo(17.2104f)
                lineTo(15.5604f, 10.3299f)
                curveTo(15.2734f, 10.6282f, 15.2824f, 11.1027f, 15.5804f, 11.3899f)
                close()
            }
        }.build()
        return _Arrowsquareuprightline!!
    }

