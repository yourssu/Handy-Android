import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Subtractline, null)
}

private var _Subtractline: ImageVector? = null

public val Subtractline: ImageVector
    get() {
        if (_Subtractline != null) {
            return _Subtractline!!
        }
        _Subtractline = ImageVector.Builder(
            name = "Subtractline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(11.44f, 2f)
                horizontalLineTo(12.56f)
                curveTo(17.7736f, 2f, 22f, 6.2264f, 22f, 11.44f)
                verticalLineTo(12.56f)
                curveTo(22f, 17.7736f, 17.7736f, 22f, 12.56f, 22f)
                horizontalLineTo(11.44f)
                curveTo(6.2264f, 22f, 2f, 17.7736f, 2f, 12.56f)
                verticalLineTo(11.44f)
                curveTo(2f, 6.2264f, 6.2264f, 2f, 11.44f, 2f)
                close()
                moveTo(12.56f, 20.5f)
                curveTo(16.9315f, 20.4673f, 20.4673f, 16.9315f, 20.5f, 12.56f)
                verticalLineTo(11.44f)
                curveTo(20.4673f, 7.0685f, 16.9315f, 3.5327f, 12.56f, 3.5f)
                horizontalLineTo(11.44f)
                curveTo(7.0685f, 3.5327f, 3.5327f, 7.0685f, 3.5f, 11.44f)
                verticalLineTo(12.56f)
                curveTo(3.5327f, 16.9315f, 7.0685f, 20.4673f, 11.44f, 20.5f)
                horizontalLineTo(12.56f)
                close()
            }
            handyPath {
                moveTo(16f, 11.25f)
                horizontalLineTo(8f)
                curveTo(7.5858f, 11.25f, 7.25f, 11.5858f, 7.25f, 12f)
                curveTo(7.25f, 12.4142f, 7.5858f, 12.75f, 8f, 12.75f)
                horizontalLineTo(16f)
                curveTo(16.4142f, 12.75f, 16.75f, 12.4142f, 16.75f, 12f)
                curveTo(16.75f, 11.5858f, 16.4142f, 11.25f, 16f, 11.25f)
                close()
            }
        }.build()
        return _Subtractline!!
    }

