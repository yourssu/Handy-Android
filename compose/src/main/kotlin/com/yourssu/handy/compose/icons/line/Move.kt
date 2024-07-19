import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Moveline, null)
}

private var _Moveline: ImageVector? = null

public val Moveline: ImageVector
    get() {
        if (_Moveline != null) {
            return _Moveline!!
        }
        _Moveline = ImageVector.Builder(
            name = "Moveline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(20.129f, 3f)
                horizontalLineTo(13.9277f)
                curveTo(13.4467f, 3f, 13.0568f, 3.3935f, 13.0568f, 3.8789f)
                curveTo(13.0568f, 4.3643f, 13.4467f, 4.7578f, 13.9277f, 4.7578f)
                horizontalLineTo(17.8645f)
                lineTo(4.74194f, 18f)
                verticalLineTo(13.8633f)
                curveTo(4.7419f, 13.3779f, 4.352f, 12.9844f, 3.871f, 12.9844f)
                curveTo(3.3899f, 12.9844f, 3f, 13.3779f, 3f, 13.8633f)
                verticalLineTo(20.1211f)
                curveTo(3.0063f, 20.6039f, 3.3926f, 20.9937f, 3.871f, 21f)
                horizontalLineTo(10.0723f)
                curveTo(10.5533f, 21f, 10.9432f, 20.6065f, 10.9432f, 20.1211f)
                curveTo(10.9432f, 19.6357f, 10.5533f, 19.2422f, 10.0723f, 19.2422f)
                horizontalLineTo(5.9729f)
                lineTo(19.2581f, 5.83594f)
                verticalLineTo(10.1367f)
                curveTo(19.2581f, 10.6221f, 19.648f, 11.0156f, 20.129f, 11.0156f)
                curveTo(20.6101f, 11.0156f, 21f, 10.6221f, 21f, 10.1367f)
                verticalLineTo(3.87891f)
                curveTo(20.9937f, 3.3961f, 20.6074f, 3.0063f, 20.129f, 3f)
                close()
            }
        }.build()
        return _Moveline!!
    }

