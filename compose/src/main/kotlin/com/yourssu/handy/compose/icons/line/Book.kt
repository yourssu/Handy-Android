import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Bookline, null)
}

private var _Bookline: ImageVector? = null

public val Bookline: ImageVector
    get() {
        if (_Bookline != null) {
            return _Bookline!!
        }
        _Bookline = ImageVector.Builder(
            name = "Bookline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(20.26f, 14.83f)
                verticalLineTo(6.75f)
                curveTo(20.26f, 4.6789f, 18.5811f, 3f, 16.51f, 3f)
                horizontalLineTo(7.75f)
                curveTo(5.6789f, 3f, 4f, 4.6789f, 4f, 6.75f)
                verticalLineTo(17.29f)
                curveTo(4f, 19.0628f, 5.4372f, 20.5f, 7.21f, 20.5f)
                horizontalLineTo(19.51f)
                curveTo(19.9242f, 20.5f, 20.26f, 20.1642f, 20.26f, 19.75f)
                curveTo(20.26f, 19.3358f, 19.9242f, 19f, 19.51f, 19f)
                horizontalLineTo(7.21f)
                curveTo(6.2656f, 19f, 5.5f, 18.2344f, 5.5f, 17.29f)
                curveTo(5.5f, 16.3456f, 6.2656f, 15.58f, 7.21f, 15.58f)
                horizontalLineTo(19.51f)
                curveTo(19.9242f, 15.58f, 20.26f, 15.2442f, 20.26f, 14.83f)
                close()
                moveTo(5.5f, 14.58f)
                verticalLineTo(6.75f)
                curveTo(5.5f, 5.5074f, 6.5074f, 4.5f, 7.75f, 4.5f)
                horizontalLineTo(16.51f)
                curveTo(17.7526f, 4.5f, 18.76f, 5.5074f, 18.76f, 6.75f)
                verticalLineTo(14.08f)
                horizontalLineTo(7.21f)
                curveTo(6.6042f, 14.0814f, 6.0112f, 14.2548f, 5.5f, 14.58f)
                close()
            }
            handyPath {
                moveTo(6.46f, 17.29f)
                curveTo(6.46f, 16.8758f, 6.7958f, 16.54f, 7.21f, 16.54f)
                horizontalLineTo(18.28f)
                curveTo(18.6942f, 16.54f, 19.03f, 16.8758f, 19.03f, 17.29f)
                curveTo(19.03f, 17.7042f, 18.6942f, 18.04f, 18.28f, 18.04f)
                horizontalLineTo(7.21f)
                curveTo(6.7958f, 18.04f, 6.46f, 17.7042f, 6.46f, 17.29f)
                close()
            }
        }.build()
        return _Bookline!!
    }

