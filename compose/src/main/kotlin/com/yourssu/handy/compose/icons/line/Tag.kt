import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Tagline, null)
}

private var _Tagline: ImageVector? = null

public val Tagline: ImageVector
    get() {
        if (_Tagline != null) {
            return _Tagline!!
        }
        _Tagline = ImageVector.Builder(
            name = "Tagline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(7.5794f, 9.0802f)
                curveTo(8.4078f, 9.0802f, 9.0794f, 8.4086f, 9.0794f, 7.5802f)
                curveTo(9.0794f, 6.7518f, 8.4078f, 6.0802f, 7.5794f, 6.0802f)
                curveTo(6.751f, 6.0802f, 6.0794f, 6.7518f, 6.0794f, 7.5802f)
                curveTo(6.0794f, 8.4086f, 6.751f, 9.0802f, 7.5794f, 9.0802f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(11.1594f, 2.0202f)
                horizontalLineTo(11.0794f)
                lineTo(5.0794f, 2.4502f)
                curveTo(3.682f, 2.5753f, 2.5745f, 3.6828f, 2.4494f, 5.0802f)
                lineTo(2.0094f, 11.0802f)
                curveTo(1.9542f, 11.6323f, 2.1443f, 12.1808f, 2.5294f, 12.5802f)
                lineTo(10.9694f, 21.0202f)
                curveTo(11.3259f, 21.3636f, 11.8045f, 21.5507f, 12.2994f, 21.5402f)
                curveTo(13.0565f, 21.5336f, 13.7784f, 21.2196f, 14.2994f, 20.6702f)
                lineTo(20.6694f, 14.3102f)
                curveTo(21.6589f, 13.4899f, 21.8142f, 12.0303f, 21.0194f, 11.0202f)
                lineTo(12.5294f, 2.5202f)
                curveTo(12.1711f, 2.1796f, 11.6937f, 1.9929f, 11.1994f, 2.0002f)
                lineTo(11.1594f, 2.0202f)
                close()
                moveTo(11.1994f, 3.6302f)
                curveTo(11.258f, 3.6118f, 11.3208f, 3.6118f, 11.3794f, 3.6302f)
                lineTo(19.8294f, 12.0802f)
                curveTo(19.9111f, 12.455f, 19.7713f, 12.8435f, 19.4694f, 13.0802f)
                lineTo(13.0794f, 19.4702f)
                curveTo(12.8689f, 19.6986f, 12.5792f, 19.8381f, 12.2694f, 19.8602f)
                horizontalLineTo(12.0994f)
                lineTo(3.6794f, 11.3702f)
                curveTo(3.6525f, 11.2993f, 3.6525f, 11.2211f, 3.6794f, 11.1502f)
                lineTo(4.1194f, 5.1502f)
                curveTo(4.1979f, 4.606f, 4.6177f, 4.1742f, 5.1594f, 4.0802f)
                lineTo(11.1594f, 3.6502f)
                lineTo(11.1994f, 3.6302f)
                close()
            }
        }.build()
        return _Tagline!!
    }

