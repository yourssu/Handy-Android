import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Minusline, null)
}

private var _Minusline: ImageVector? = null

public val Minusline: ImageVector
    get() {
        if (_Minusline != null) {
            return _Minusline!!
        }
        _Minusline = ImageVector.Builder(
            name = "Minusline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(19.75f, 12.5f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 12.5f, 3f, 12.1642f, 3f, 11.75f)
                curveTo(3f, 11.3358f, 3.3358f, 11f, 3.75f, 11f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 11f, 20.5f, 11.3358f, 20.5f, 11.75f)
                curveTo(20.5f, 12.1642f, 20.1642f, 12.5f, 19.75f, 12.5f)
                close()
            }
        }.build()
        return _Minusline!!
    }

