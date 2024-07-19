import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Plusline, null)
}

private var _Plusline: ImageVector? = null

public val Plusline: ImageVector
    get() {
        if (_Plusline != null) {
            return _Plusline!!
        }
        _Plusline = ImageVector.Builder(
            name = "Plusline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(19.75f, 11f)
                horizontalLineTo(12.5f)
                verticalLineTo(3.75f)
                curveTo(12.5f, 3.3358f, 12.1642f, 3f, 11.75f, 3f)
                curveTo(11.3358f, 3f, 11f, 3.3358f, 11f, 3.75f)
                verticalLineTo(11f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 11f, 3f, 11.3358f, 3f, 11.75f)
                curveTo(3f, 12.1642f, 3.3358f, 12.5f, 3.75f, 12.5f)
                horizontalLineTo(11f)
                verticalLineTo(19.75f)
                curveTo(11f, 20.1642f, 11.3358f, 20.5f, 11.75f, 20.5f)
                curveTo(12.1642f, 20.5f, 12.5f, 20.1642f, 12.5f, 19.75f)
                verticalLineTo(12.5f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 12.5f, 20.5f, 12.1642f, 20.5f, 11.75f)
                curveTo(20.5f, 11.3358f, 20.1642f, 11f, 19.75f, 11f)
                close()
            }
        }.build()
        return _Plusline!!
    }

