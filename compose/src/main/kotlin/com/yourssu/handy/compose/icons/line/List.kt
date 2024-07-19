import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Listline, null)
}

private var _Listline: ImageVector? = null

public val Listline: ImageVector
    get() {
        if (_Listline != null) {
            return _Listline!!
        }
        _Listline = ImageVector.Builder(
            name = "Listline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(15.37f, 10.5f)
                horizontalLineTo(5.75f)
                curveTo(5.3358f, 10.5f, 5f, 10.1642f, 5f, 9.75f)
                curveTo(5f, 9.3358f, 5.3358f, 9f, 5.75f, 9f)
                horizontalLineTo(15.37f)
                curveTo(15.7842f, 9f, 16.12f, 9.3358f, 16.12f, 9.75f)
                curveTo(16.12f, 10.1642f, 15.7842f, 10.5f, 15.37f, 10.5f)
                close()
            }
            handyPath {
                moveTo(5.75f, 14f)
                horizontalLineTo(18.57f)
                curveTo(18.9842f, 14f, 19.32f, 14.3358f, 19.32f, 14.75f)
                curveTo(19.32f, 15.1642f, 18.9842f, 15.5f, 18.57f, 15.5f)
                horizontalLineTo(5.75f)
                curveTo(5.3358f, 15.5f, 5f, 15.1642f, 5f, 14.75f)
                curveTo(5f, 14.3358f, 5.3358f, 14f, 5.75f, 14f)
                close()
            }
        }.build()
        return _Listline!!
    }

