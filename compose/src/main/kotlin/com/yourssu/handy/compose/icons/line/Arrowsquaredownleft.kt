import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Arrowsquaredownleftline, null)
}

private var _Arrowsquaredownleftline: ImageVector? = null

public val Arrowsquaredownleftline: ImageVector
    get() {
        if (_Arrowsquaredownleftline != null) {
            return _Arrowsquaredownleftline!!
        }
        _Arrowsquaredownleftline = ImageVector.Builder(
            name = "Arrowsquaredownleftline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(14.7596f, 4.78003f)
                horizontalLineTo(6.82958f)
                curveTo(6.4154f, 4.78f, 6.0796f, 5.1158f, 6.0796f, 5.53f)
                curveTo(6.0796f, 5.9442f, 6.4154f, 6.28f, 6.8296f, 6.28f)
                horizontalLineTo(14.7096f)
                curveTo(16.7185f, 6.3345f, 18.3122f, 7.9905f, 18.2896f, 10f)
                verticalLineTo(12.17f)
                curveTo(18.2896f, 14.2135f, 16.633f, 15.87f, 14.5896f, 15.87f)
                horizontalLineTo(7.49958f)
                lineTo(9.14958f, 14.2f)
                curveTo(9.2925f, 14.0607f, 9.3732f, 13.8696f, 9.3732f, 13.67f)
                curveTo(9.3732f, 13.4704f, 9.2925f, 13.2793f, 9.1496f, 13.14f)
                curveTo(8.8568f, 12.8476f, 8.3824f, 12.8476f, 8.0896f, 13.14f)
                lineTo(5.15958f, 16.07f)
                curveTo(5.0918f, 16.1394f, 5.0375f, 16.2208f, 4.9996f, 16.31f)
                curveTo(4.9298f, 16.4971f, 4.9298f, 16.703f, 4.9996f, 16.89f)
                curveTo(5.0375f, 16.9793f, 5.0918f, 17.0607f, 5.1596f, 17.13f)
                lineTo(8.08958f, 20.06f)
                curveTo(8.2295f, 20.2017f, 8.4205f, 20.281f, 8.6196f, 20.28f)
                curveTo(8.8189f, 20.2821f, 9.0104f, 20.2026f, 9.1496f, 20.06f)
                curveTo(9.2925f, 19.9207f, 9.3732f, 19.7296f, 9.3732f, 19.53f)
                curveTo(9.3732f, 19.3304f, 9.2925f, 19.1393f, 9.1496f, 19f)
                lineTo(7.49958f, 17.35f)
                horizontalLineTo(14.5896f)
                curveTo(17.4615f, 17.35f, 19.7896f, 15.0219f, 19.7896f, 12.15f)
                verticalLineTo(10f)
                curveTo(19.8179f, 7.1791f, 17.5796f, 4.8563f, 14.7596f, 4.78f)
                close()
            }
        }.build()
        return _Arrowsquaredownleftline!!
    }

