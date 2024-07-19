import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Arrowrightcornerupline, null)
}

private var _Arrowrightcornerupline: ImageVector? = null

public val Arrowrightcornerupline: ImageVector
    get() {
        if (_Arrowrightcornerupline != null) {
            return _Arrowrightcornerupline!!
        }
        _Arrowrightcornerupline = ImageVector.Builder(
            name = "Arrowrightcornerupline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(18.7198f, 7.67023f)
                curveTo(18.6818f, 7.581f, 18.6276f, 7.4996f, 18.5598f, 7.4302f)
                lineTo(15.9098f, 4.78023f)
                curveTo(15.7228f, 4.5796f, 15.4412f, 4.497f, 15.1755f, 4.5648f)
                curveTo(14.9097f, 4.6327f, 14.7022f, 4.8402f, 14.6344f, 5.1059f)
                curveTo(14.5665f, 5.3717f, 14.6491f, 5.6533f, 14.8498f, 5.8402f)
                lineTo(16.2198f, 7.21023f)
                horizontalLineTo(9.99977f)
                curveTo(8.7295f, 7.2076f, 7.5106f, 7.7117f, 6.6133f, 8.6108f)
                curveTo(5.716f, 9.51f, 5.2144f, 10.73f, 5.2198f, 12.0002f)
                verticalLineTo(18.7202f)
                curveTo(5.2198f, 19.1344f, 5.5556f, 19.4702f, 5.9698f, 19.4702f)
                curveTo(6.384f, 19.4702f, 6.7198f, 19.1344f, 6.7198f, 18.7202f)
                verticalLineTo(12.0002f)
                curveTo(6.7144f, 11.1278f, 7.058f, 10.2894f, 7.6739f, 9.6715f)
                curveTo(8.2899f, 9.0536f, 9.1273f, 8.7075f, 9.9998f, 8.7102f)
                horizontalLineTo(16.2298f)
                lineTo(14.8598f, 10.0702f)
                curveTo(14.5673f, 10.363f, 14.5673f, 10.8374f, 14.8598f, 11.1302f)
                curveTo(14.9997f, 11.2719f, 15.1907f, 11.3512f, 15.3898f, 11.3502f)
                curveTo(15.5891f, 11.3523f, 15.7805f, 11.2728f, 15.9198f, 11.1302f)
                lineTo(18.5698f, 8.49023f)
                curveTo(18.6379f, 8.4173f, 18.6921f, 8.3326f, 18.7298f, 8.2402f)
                curveTo(18.7965f, 8.0555f, 18.793f, 7.8526f, 18.7198f, 7.6702f)
                close()
            }
        }.build()
        return _Arrowrightcornerupline!!
    }

