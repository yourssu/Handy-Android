import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Arrowleftcornerupline, null)
}

private var _Arrowleftcornerupline: ImageVector? = null

public val Arrowleftcornerupline: ImageVector
    get() {
        if (_Arrowleftcornerupline != null) {
            return _Arrowleftcornerupline!!
        }
        _Arrowleftcornerupline = ImageVector.Builder(
            name = "Arrowleftcornerupline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(14f, 7.21023f)
                horizontalLineTo(7.78003f)
                lineTo(9.15003f, 5.84023f)
                curveTo(9.3507f, 5.6533f, 9.4333f, 5.3717f, 9.3654f, 5.1059f)
                curveTo(9.2975f, 4.8402f, 9.09f, 4.6327f, 8.8243f, 4.5648f)
                curveTo(8.5586f, 4.497f, 8.277f, 4.5796f, 8.09f, 4.7802f)
                lineTo(5.44003f, 7.43023f)
                curveTo(5.3722f, 7.4996f, 5.318f, 7.581f, 5.28f, 7.6702f)
                curveTo(5.21f, 7.8538f, 5.21f, 8.0567f, 5.28f, 8.2402f)
                curveTo(5.3177f, 8.3326f, 5.3719f, 8.4173f, 5.44f, 8.4902f)
                lineTo(8.09003f, 11.1302f)
                curveTo(8.2293f, 11.2728f, 8.4207f, 11.3523f, 8.62f, 11.3502f)
                curveTo(8.8191f, 11.3512f, 9.0101f, 11.2719f, 9.15f, 11.1302f)
                curveTo(9.4425f, 10.8374f, 9.4425f, 10.363f, 9.15f, 10.0702f)
                lineTo(7.78003f, 8.71023f)
                horizontalLineTo(14f)
                curveTo(14.8725f, 8.7075f, 15.7099f, 9.0536f, 16.3258f, 9.6715f)
                curveTo(16.9418f, 10.2894f, 17.2854f, 11.1278f, 17.28f, 12.0002f)
                verticalLineTo(18.7202f)
                curveTo(17.28f, 19.1344f, 17.6158f, 19.4702f, 18.03f, 19.4702f)
                curveTo(18.4442f, 19.4702f, 18.78f, 19.1344f, 18.78f, 18.7202f)
                verticalLineTo(12.0002f)
                curveTo(18.7854f, 10.73f, 18.2838f, 9.51f, 17.3865f, 8.6108f)
                curveTo(16.4892f, 7.7117f, 15.2703f, 7.2076f, 14f, 7.2102f)
                close()
            }
        }.build()
        return _Arrowleftcornerupline!!
    }

