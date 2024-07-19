import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Ipadline, null)
}

private var _Ipadline: ImageVector? = null

public val Ipadline: ImageVector
    get() {
        if (_Ipadline != null) {
            return _Ipadline!!
        }
        _Ipadline = ImageVector.Builder(
            name = "Ipadline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(12.5f, 19f)
                curveTo(13.0523f, 19f, 13.5f, 18.5523f, 13.5f, 18f)
                curveTo(13.5f, 17.4477f, 13.0523f, 17f, 12.5f, 17f)
                curveTo(11.9477f, 17f, 11.5f, 17.4477f, 11.5f, 18f)
                curveTo(11.5f, 18.5523f, 11.9477f, 19f, 12.5f, 19f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(18f, 2f)
                horizontalLineTo(7f)
                curveTo(5.8954f, 2f, 5f, 2.8954f, 5f, 4f)
                verticalLineTo(20f)
                curveTo(5f, 21.1046f, 5.8954f, 22f, 7f, 22f)
                horizontalLineTo(18f)
                curveTo(19.1046f, 22f, 20f, 21.1046f, 20f, 20f)
                verticalLineTo(4f)
                curveTo(20f, 3.4696f, 19.7893f, 2.9609f, 19.4142f, 2.5858f)
                curveTo(19.0391f, 2.2107f, 18.5304f, 2f, 18f, 2f)
                close()
                moveTo(18.36f, 20f)
                curveTo(18.36f, 20.1988f, 18.1988f, 20.36f, 18f, 20.36f)
                horizontalLineTo(7f)
                curveTo(6.8012f, 20.36f, 6.64f, 20.1988f, 6.64f, 20f)
                verticalLineTo(4f)
                curveTo(6.64f, 3.9045f, 6.6779f, 3.8129f, 6.7454f, 3.7454f)
                curveTo(6.8129f, 3.6779f, 6.9045f, 3.64f, 7f, 3.64f)
                horizontalLineTo(18f)
                curveTo(18.1988f, 3.64f, 18.36f, 3.8012f, 18.36f, 4f)
                verticalLineTo(20f)
                close()
            }
        }.build()
        return _Ipadline!!
    }

