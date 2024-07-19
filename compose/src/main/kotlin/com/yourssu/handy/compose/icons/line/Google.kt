import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Googleline, null)
}

private var _Googleline: ImageVector? = null

public val Googleline: ImageVector
    get() {
        if (_Googleline != null) {
            return _Googleline!!
        }
        _Googleline = ImageVector.Builder(
            name = "Googleline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(8.54994f, 10.3901f)
                verticalLineTo(12.8901f)
                horizontalLineTo(12.1099f)
                curveTo(11.664f, 14.4734f, 10.1939f, 15.5471f, 8.5499f, 15.4901f)
                curveTo(6.7954f, 15.4994f, 5.2449f, 14.3503f, 4.7435f, 12.6688f)
                curveTo(4.2422f, 10.9874f, 4.9101f, 9.1767f, 6.3833f, 8.2237f)
                curveTo(7.8564f, 7.2706f, 9.7817f, 7.4035f, 11.1099f, 8.5501f)
                lineTo(12.9499f, 6.71007f)
                curveTo(10.7902f, 4.7384f, 7.584f, 4.4402f, 5.0976f, 5.9797f)
                curveTo(2.6113f, 7.5192f, 1.4492f, 10.5222f, 2.2515f, 13.3344f)
                curveTo(3.0538f, 16.1465f, 5.6256f, 18.0843f, 8.5499f, 18.0801f)
                curveTo(14.0399f, 18.0801f, 15.2499f, 12.9501f, 14.7099f, 10.4001f)
                lineTo(8.54994f, 10.3901f)
                close()
            }
            handyPath {
                moveTo(22.0799f, 10.8201f)
                horizontalLineTo(19.9999f)
                verticalLineTo(8.74007f)
                horizontalLineTo(18.5399f)
                verticalLineTo(10.8201f)
                horizontalLineTo(16.4699f)
                verticalLineTo(12.2701f)
                horizontalLineTo(18.5399f)
                verticalLineTo(14.3501f)
                horizontalLineTo(19.9999f)
                verticalLineTo(12.2701f)
                horizontalLineTo(22.0799f)
                verticalLineTo(10.8201f)
                close()
            }
        }.build()
        return _Googleline!!
    }

