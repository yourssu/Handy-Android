import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Pauseline, null)
}

private var _Pauseline: ImageVector? = null

public val Pauseline: ImageVector
    get() {
        if (_Pauseline != null) {
            return _Pauseline!!
        }
        _Pauseline = ImageVector.Builder(
            name = "Pauseline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(9.5f, 8.25f)
                curveTo(9.088f, 8.2554f, 8.7554f, 8.588f, 8.75f, 9f)
                verticalLineTo(15f)
                curveTo(8.75f, 15.4142f, 9.0858f, 15.75f, 9.5f, 15.75f)
                curveTo(9.9142f, 15.75f, 10.25f, 15.4142f, 10.25f, 15f)
                verticalLineTo(9f)
                curveTo(10.2446f, 8.588f, 9.912f, 8.2554f, 9.5f, 8.25f)
                close()
            }
            handyPath {
                moveTo(14.5f, 8.25f)
                curveTo(14.088f, 8.2554f, 13.7554f, 8.588f, 13.75f, 9f)
                verticalLineTo(15f)
                curveTo(13.75f, 15.4142f, 14.0858f, 15.75f, 14.5f, 15.75f)
                curveTo(14.9142f, 15.75f, 15.25f, 15.4142f, 15.25f, 15f)
                verticalLineTo(9f)
                curveTo(15.2446f, 8.588f, 14.912f, 8.2554f, 14.5f, 8.25f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(8f, 2f)
                horizontalLineTo(16f)
                curveTo(19.3137f, 2f, 22f, 4.6863f, 22f, 8f)
                verticalLineTo(16f)
                curveTo(22f, 19.3137f, 19.3137f, 22f, 16f, 22f)
                horizontalLineTo(8f)
                curveTo(4.6863f, 22f, 2f, 19.3137f, 2f, 16f)
                verticalLineTo(8f)
                curveTo(2f, 4.6863f, 4.6863f, 2f, 8f, 2f)
                close()
                moveTo(19.0919f, 19.0919f)
                curveTo(19.9113f, 18.2725f, 20.3681f, 17.1588f, 20.36f, 16f)
                verticalLineTo(8f)
                curveTo(20.3681f, 6.8412f, 19.9113f, 5.7275f, 19.0919f, 4.9081f)
                curveTo(18.2725f, 4.0887f, 17.1588f, 3.6319f, 16f, 3.64f)
                horizontalLineTo(8f)
                curveTo(6.8412f, 3.6319f, 5.7275f, 4.0887f, 4.9081f, 4.9081f)
                curveTo(4.0887f, 5.7275f, 3.6319f, 6.8412f, 3.64f, 8f)
                verticalLineTo(16f)
                curveTo(3.6319f, 17.1588f, 4.0887f, 18.2725f, 4.9081f, 19.0919f)
                curveTo(5.7275f, 19.9113f, 6.8412f, 20.3681f, 8f, 20.36f)
                horizontalLineTo(16f)
                curveTo(17.1588f, 20.3681f, 18.2725f, 19.9113f, 19.0919f, 19.0919f)
                close()
            }
        }.build()
        return _Pauseline!!
    }

