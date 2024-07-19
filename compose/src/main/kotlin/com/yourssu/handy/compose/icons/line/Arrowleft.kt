import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Arrowleftline, null)
}

private var _Arrowleftline: ImageVector? = null

public val Arrowleftline: ImageVector
    get() {
        if (_Arrowleftline != null) {
            return _Arrowleftline!!
        }
        _Arrowleftline = ImageVector.Builder(
            name = "Arrowleftline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(10.9498f, 19.5201f)
                curveTo(11.0931f, 19.6553f, 11.2828f, 19.7304f, 11.4798f, 19.7301f)
                curveTo(11.6761f, 19.7318f, 11.8643f, 19.6521f, 11.9998f, 19.5101f)
                curveTo(12.1428f, 19.3708f, 12.2234f, 19.1797f, 12.2234f, 18.9801f)
                curveTo(12.2234f, 18.7805f, 12.1428f, 18.5894f, 11.9998f, 18.4501f)
                lineTo(6.29975f, 12.75f)
                horizontalLineTo(19.52f)
                curveTo(19.9342f, 12.75f, 20.27f, 12.4142f, 20.27f, 12f)
                curveTo(20.27f, 11.5858f, 19.9342f, 11.25f, 19.52f, 11.25f)
                horizontalLineTo(6.29756f)
                lineTo(12.0098f, 5.52006f)
                curveTo(12.1528f, 5.3808f, 12.2334f, 5.1897f, 12.2334f, 4.9901f)
                curveTo(12.2334f, 4.7905f, 12.1528f, 4.5994f, 12.0098f, 4.4601f)
                curveTo(11.717f, 4.1676f, 11.2426f, 4.1676f, 10.9498f, 4.4601f)
                lineTo(3.94981f, 11.4601f)
                curveTo(3.6574f, 11.7529f, 3.6574f, 12.2272f, 3.9498f, 12.5201f)
                lineTo(10.9498f, 19.5201f)
                close()
            }
        }.build()
        return _Arrowleftline!!
    }

