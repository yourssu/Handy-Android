import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Microphoneline, null)
}

private var _Microphoneline: ImageVector? = null

public val Microphoneline: ImageVector
    get() {
        if (_Microphoneline != null) {
            return _Microphoneline!!
        }
        _Microphoneline = ImageVector.Builder(
            name = "Microphoneline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(19.8201f, 11.75f)
                curveTo(19.8201f, 11.3358f, 19.4843f, 11f, 19.0701f, 11f)
                curveTo(18.6559f, 11f, 18.3201f, 11.3358f, 18.3201f, 11.75f)
                curveTo(18.3495f, 13.4783f, 17.6904f, 15.1474f, 16.4879f, 16.3892f)
                curveTo(15.2855f, 17.6311f, 13.6385f, 18.3437f, 11.9101f, 18.37f)
                curveTo(10.1817f, 18.3437f, 8.5348f, 17.6311f, 7.3323f, 16.3892f)
                curveTo(6.1299f, 15.1474f, 5.4707f, 13.4783f, 5.5001f, 11.75f)
                curveTo(5.5001f, 11.3358f, 5.1643f, 11f, 4.7501f, 11f)
                curveTo(4.3359f, 11f, 4.0001f, 11.3358f, 4.0001f, 11.75f)
                curveTo(3.9774f, 15.86f, 7.0728f, 19.3185f, 11.1601f, 19.75f)
                verticalLineTo(22.25f)
                curveTo(11.1601f, 22.6642f, 11.4959f, 23f, 11.9101f, 23f)
                curveTo(12.3243f, 23f, 12.6601f, 22.6642f, 12.6601f, 22.25f)
                verticalLineTo(19.83f)
                curveTo(16.7783f, 19.3957f, 19.8844f, 15.8905f, 19.8201f, 11.75f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(17f, 12f)
                curveTo(17f, 14.7614f, 14.7614f, 17f, 12f, 17f)
                curveTo(9.2386f, 17f, 7f, 14.7614f, 7f, 12f)
                verticalLineTo(7f)
                curveTo(7f, 4.2386f, 9.2386f, 2f, 12f, 2f)
                curveTo(14.7614f, 2f, 17f, 4.2386f, 17f, 7f)
                verticalLineTo(12f)
                close()
                moveTo(12f, 3.5f)
                curveTo(10.067f, 3.5f, 8.5f, 5.067f, 8.5f, 7f)
                verticalLineTo(12f)
                curveTo(8.5f, 13.933f, 10.067f, 15.5f, 12f, 15.5f)
                curveTo(13.933f, 15.5f, 15.5f, 13.933f, 15.5f, 12f)
                verticalLineTo(7f)
                curveTo(15.5f, 5.067f, 13.933f, 3.5f, 12f, 3.5f)
                close()
            }
        }.build()
        return _Microphoneline!!
    }

