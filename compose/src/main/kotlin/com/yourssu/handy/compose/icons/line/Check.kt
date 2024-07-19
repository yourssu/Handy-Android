import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Checkline, null)
}

private var _Checkline: ImageVector? = null

public val Checkline: ImageVector
    get() {
        if (_Checkline != null) {
            return _Checkline!!
        }
        _Checkline = ImageVector.Builder(
            name = "Checkline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(9.20948f, 17.5602f)
                curveTo(9.0416f, 17.5676f, 8.876f, 17.5183f, 8.7395f, 17.4202f)
                lineTo(4.24948f, 13.7102f)
                curveTo(3.9602f, 13.4541f, 3.9167f, 13.0186f, 4.1495f, 12.7102f)
                curveTo(4.4051f, 12.4223f, 4.8373f, 12.3748f, 5.1495f, 12.6002f)
                lineTo(9.14948f, 15.8602f)
                lineTo(19.6495f, 6.15024f)
                curveTo(19.96f, 5.9171f, 20.3971f, 5.9595f, 20.657f, 6.248f)
                curveTo(20.9169f, 6.5365f, 20.9136f, 6.9756f, 20.6495f, 7.2602f)
                lineTo(9.71948f, 17.3602f)
                curveTo(9.5803f, 17.488f, 9.3984f, 17.5593f, 9.2095f, 17.5602f)
                close()
            }
        }.build()
        return _Checkline!!
    }

