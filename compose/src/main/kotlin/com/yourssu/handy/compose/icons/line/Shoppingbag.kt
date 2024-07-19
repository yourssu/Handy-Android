import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Shoppingbagline, null)
}

private var _Shoppingbagline: ImageVector? = null

public val Shoppingbagline: ImageVector
    get() {
        if (_Shoppingbagline != null) {
            return _Shoppingbagline!!
        }
        _Shoppingbagline = ImageVector.Builder(
            name = "Shoppingbagline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(20.7404f, 6.85986f)
                lineTo(22.0004f, 15.1999f)
                curveTo(22.5104f, 18.8499f, 20.0004f, 22.1699f, 16.6004f, 22.1999f)
                horizontalLineTo(7.34036f)
                curveTo(4.0004f, 22.1999f, 1.4604f, 18.8499f, 2.0004f, 15.1999f)
                lineTo(3.26036f, 6.85986f)
                curveTo(3.5595f, 4.1022f, 5.829f, 1.9772f, 8.6004f, 1.8599f)
                horizontalLineTo(15.4004f)
                curveTo(18.1717f, 1.9772f, 20.4412f, 4.1022f, 20.7404f, 6.8599f)
                close()
                moveTo(16.6304f, 20.6699f)
                curveTo(17.7041f, 20.6544f, 18.7168f, 20.1681f, 19.4004f, 19.3399f)
                curveTo(20.3171f, 18.2542f, 20.715f, 16.8229f, 20.4904f, 15.4199f)
                lineTo(19.2604f, 7.07986f)
                curveTo(19.0847f, 5.0442f, 17.4403f, 3.4466f, 15.4004f, 3.3299f)
                horizontalLineTo(8.60036f)
                curveTo(6.5604f, 3.4466f, 4.916f, 5.0442f, 4.7404f, 7.0799f)
                lineTo(3.51036f, 15.4199f)
                curveTo(3.2857f, 16.8229f, 3.6837f, 18.2542f, 4.6004f, 19.3399f)
                curveTo(5.2839f, 20.1681f, 6.2966f, 20.6544f, 7.3704f, 20.6699f)
                horizontalLineTo(16.6304f)
                close()
            }
            handyPath {
                moveTo(15.1504f, 7.05986f)
                curveTo(14.7361f, 7.0599f, 14.4004f, 7.3956f, 14.4004f, 7.8099f)
                curveTo(14.4004f, 9.1354f, 13.3258f, 10.2099f, 12.0004f, 10.2099f)
                curveTo(10.6749f, 10.2099f, 9.6004f, 9.1354f, 9.6004f, 7.8099f)
                curveTo(9.6004f, 7.3956f, 9.2646f, 7.0599f, 8.8504f, 7.0599f)
                curveTo(8.4361f, 7.0599f, 8.1004f, 7.3956f, 8.1004f, 7.8099f)
                curveTo(8.1004f, 9.2032f, 8.8437f, 10.4907f, 10.0504f, 11.1874f)
                curveTo(11.257f, 11.884f, 12.7437f, 11.884f, 13.9504f, 11.1874f)
                curveTo(15.157f, 10.4907f, 15.9004f, 9.2032f, 15.9004f, 7.8099f)
                curveTo(15.895f, 7.3979f, 15.5623f, 7.0652f, 15.1504f, 7.0599f)
                close()
            }
        }.build()
        return _Shoppingbagline!!
    }

