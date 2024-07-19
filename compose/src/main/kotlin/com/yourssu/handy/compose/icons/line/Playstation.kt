import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Playstationline, null)
}

private var _Playstationline: ImageVector? = null

public val Playstationline: ImageVector
    get() {
        if (_Playstationline != null) {
            return _Playstationline!!
        }
        _Playstationline = ImageVector.Builder(
            name = "Playstationline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(7.08049f, 3.20998f)
                curveTo(7.8234f, 3.2102f, 8.505f, 3.6222f, 8.8505f, 4.28f)
                lineTo(10.8205f, 8.07998f)
                curveTo(11.1412f, 8.6991f, 11.1164f, 9.4405f, 10.755f, 10.0367f)
                curveTo(10.3936f, 10.633f, 9.7477f, 10.9979f, 9.0505f, 11f)
                horizontalLineTo(5.11049f)
                curveTo(4.4062f, 11.0121f, 3.7474f, 10.6527f, 3.3763f, 10.054f)
                curveTo(3.0051f, 9.4552f, 2.9763f, 8.7054f, 3.3005f, 8.08f)
                lineTo(5.30049f, 4.27998f)
                curveTo(5.6476f, 3.6191f, 6.334f, 3.2065f, 7.0805f, 3.21f)
                close()
                moveTo(9.05049f, 9.51998f)
                curveTo(9.226f, 9.521f, 9.3892f, 9.4299f, 9.4805f, 9.28f)
                verticalLineTo(9.25998f)
                curveTo(9.5715f, 9.1235f, 9.5866f, 8.9501f, 9.5205f, 8.8f)
                lineTo(7.52049f, 4.99998f)
                curveTo(7.4454f, 4.8401f, 7.287f, 4.7358f, 7.1105f, 4.73f)
                curveTo(6.9231f, 4.7234f, 6.7484f, 4.8243f, 6.6605f, 4.99f)
                lineTo(4.66049f, 8.78998f)
                curveTo(4.5797f, 8.9459f, 4.5866f, 9.1329f, 4.6788f, 9.2824f)
                curveTo(4.771f, 9.4319f, 4.9348f, 9.5221f, 5.1105f, 9.52f)
                horizontalLineTo(9.05049f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(20.9005f, 7f)
                curveTo(20.9005f, 9.2091f, 19.1096f, 11f, 16.9005f, 11f)
                curveTo(14.6913f, 11f, 12.9005f, 9.2091f, 12.9005f, 7f)
                curveTo(12.9005f, 4.7909f, 14.6913f, 3f, 16.9005f, 3f)
                curveTo(19.1096f, 3f, 20.9005f, 4.7909f, 20.9005f, 7f)
                close()
                moveTo(19.4005f, 7f)
                curveTo(19.4005f, 5.6193f, 18.2812f, 4.5f, 16.9005f, 4.5f)
                curveTo(16.2374f, 4.5f, 15.6016f, 4.7634f, 15.1327f, 5.2322f)
                curveTo(14.6639f, 5.7011f, 14.4005f, 6.337f, 14.4005f, 7f)
                curveTo(14.4005f, 8.3807f, 15.5198f, 9.5f, 16.9005f, 9.5f)
                curveTo(18.2812f, 9.5f, 19.4005f, 8.3807f, 19.4005f, 7f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(14.9005f, 13f)
                horizontalLineTo(18.9005f)
                curveTo(20.0051f, 13f, 20.9005f, 13.8954f, 20.9005f, 15f)
                verticalLineTo(19f)
                curveTo(20.9005f, 20.1046f, 20.0051f, 21f, 18.9005f, 21f)
                horizontalLineTo(14.9005f)
                curveTo(13.7959f, 21f, 12.9005f, 20.1046f, 12.9005f, 19f)
                verticalLineTo(15f)
                curveTo(12.9005f, 13.8954f, 13.7959f, 13f, 14.9005f, 13f)
                close()
                moveTo(18.9005f, 19.5f)
                curveTo(19.1766f, 19.5f, 19.4005f, 19.2761f, 19.4005f, 19f)
                verticalLineTo(15f)
                curveTo(19.4005f, 14.7239f, 19.1766f, 14.5f, 18.9005f, 14.5f)
                horizontalLineTo(14.9005f)
                curveTo(14.6243f, 14.5f, 14.4005f, 14.7239f, 14.4005f, 15f)
                verticalLineTo(19f)
                curveTo(14.4005f, 19.2761f, 14.6243f, 19.5f, 14.9005f, 19.5f)
                horizontalLineTo(18.9005f)
                close()
            }
            handyPath {
                moveTo(10.6105f, 13.16f)
                curveTo(10.4712f, 13.0171f, 10.2801f, 12.9364f, 10.0805f, 12.9364f)
                curveTo(9.8809f, 12.9364f, 9.6898f, 13.0171f, 9.5505f, 13.16f)
                lineTo(7.08049f, 15.63f)
                lineTo(4.61049f, 13.16f)
                curveTo(4.315f, 12.8846f, 3.8545f, 12.8928f, 3.5689f, 13.1784f)
                curveTo(3.2832f, 13.464f, 3.2751f, 13.9245f, 3.5505f, 14.22f)
                lineTo(6.00049f, 16.69f)
                lineTo(3.55049f, 19.16f)
                curveTo(3.4075f, 19.2993f, 3.3269f, 19.4904f, 3.3269f, 19.69f)
                curveTo(3.3269f, 19.8896f, 3.4075f, 20.0807f, 3.5505f, 20.22f)
                curveTo(3.6922f, 20.3589f, 3.8821f, 20.4377f, 4.0805f, 20.44f)
                curveTo(4.2785f, 20.4357f, 4.4676f, 20.3572f, 4.6105f, 20.22f)
                lineTo(7.08049f, 17.75f)
                lineTo(9.55049f, 20.22f)
                curveTo(9.6922f, 20.3589f, 9.8821f, 20.4377f, 10.0805f, 20.44f)
                curveTo(10.2785f, 20.4357f, 10.4676f, 20.3572f, 10.6105f, 20.22f)
                curveTo(10.9029f, 19.9272f, 10.9029f, 19.4528f, 10.6105f, 19.16f)
                lineTo(8.14049f, 16.69f)
                lineTo(10.6105f, 14.22f)
                curveTo(10.9029f, 13.9272f, 10.9029f, 13.4528f, 10.6105f, 13.16f)
                close()
            }
        }.build()
        return _Playstationline!!
    }

