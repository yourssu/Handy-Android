import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Cameraline, null)
}

private var _Cameraline: ImageVector? = null

public val Cameraline: ImageVector
    get() {
        if (_Cameraline != null) {
            return _Cameraline!!
        }
        _Cameraline = ImageVector.Builder(
            name = "Cameraline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(6.27368f, 4.00001f)
                horizontalLineTo(17.7263f)
                curveTo(18.8588f, 3.9972f, 19.9459f, 4.4451f, 20.7476f, 5.2449f)
                curveTo(21.5494f, 6.0447f, 22f, 7.1307f, 22f, 8.2632f)
                verticalLineTo(15.5263f)
                curveTo(22f, 16.6588f, 21.5494f, 17.7448f, 20.7476f, 18.5446f)
                curveTo(19.9459f, 19.3444f, 18.8588f, 19.7923f, 17.7263f, 19.7895f)
                horizontalLineTo(6.27368f)
                curveTo(5.1412f, 19.7923f, 4.0541f, 19.3444f, 3.2524f, 18.5446f)
                curveTo(2.4506f, 17.7448f, 2f, 16.6588f, 2f, 15.5263f)
                verticalLineTo(8.26317f)
                curveTo(2f, 7.1307f, 2.4506f, 6.0447f, 3.2524f, 5.2449f)
                curveTo(4.0541f, 4.4451f, 5.1412f, 3.9972f, 6.2737f, 4f)
                close()
                moveTo(17.7263f, 18.2105f)
                curveTo(19.1903f, 18.2109f, 20.3867f, 17.0425f, 20.4211f, 15.579f)
                verticalLineTo(8.26317f)
                curveTo(20.4153f, 6.779f, 19.2105f, 5.5789f, 17.7263f, 5.579f)
                horizontalLineTo(6.27368f)
                curveTo(4.7895f, 5.5789f, 3.5847f, 6.779f, 3.5789f, 8.2632f)
                verticalLineTo(15.5263f)
                curveTo(3.5847f, 17.0105f, 4.7895f, 18.2106f, 6.2737f, 18.2105f)
                horizontalLineTo(17.7263f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(7.71579f, 12.1895f)
                curveTo(7.7158f, 9.8641f, 9.6009f, 7.979f, 11.9263f, 7.979f)
                curveTo(14.2517f, 7.979f, 16.1368f, 9.8641f, 16.1368f, 12.1895f)
                curveTo(16.1368f, 14.5149f, 14.2517f, 16.4f, 11.9263f, 16.4f)
                curveTo(9.6009f, 16.4f, 7.7158f, 14.5149f, 7.7158f, 12.1895f)
                close()
                moveTo(9.29474f, 12.1895f)
                curveTo(9.2947f, 13.6429f, 10.4729f, 14.8211f, 11.9263f, 14.8211f)
                curveTo(13.3797f, 14.8211f, 14.5579f, 13.6429f, 14.5579f, 12.1895f)
                curveTo(14.5579f, 10.7361f, 13.3797f, 9.5579f, 11.9263f, 9.5579f)
                curveTo(10.4729f, 9.5579f, 9.2947f, 10.7361f, 9.2947f, 12.1895f)
                close()
            }
            handyPath {
                moveTo(16.1368f, 7.41581f)
                curveTo(16.1368f, 7.1397f, 16.3607f, 6.9158f, 16.6368f, 6.9158f)
                horizontalLineTo(17.7421f)
                curveTo(18.0182f, 6.9158f, 18.2421f, 7.1397f, 18.2421f, 7.4158f)
                verticalLineTo(8.53161f)
                curveTo(18.2421f, 8.8078f, 18.0182f, 9.0316f, 17.7421f, 9.0316f)
                horizontalLineTo(16.6368f)
                curveTo(16.3607f, 9.0316f, 16.1368f, 8.8078f, 16.1368f, 8.5316f)
                verticalLineTo(7.41581f)
                close()
            }
        }.build()
        return _Cameraline!!
    }

