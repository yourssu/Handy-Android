import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Alarmline, null)
}

private var _Alarmline: ImageVector? = null

public val Alarmline: ImageVector
    get() {
        if (_Alarmline != null) {
            return _Alarmline!!
        }
        _Alarmline = ImageVector.Builder(
            name = "Alarmline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(2.6572f, 13.3569f)
                curveTo(2.6572f, 8.3863f, 6.6866f, 4.3569f, 11.6572f, 4.3569f)
                curveTo(16.6278f, 4.3569f, 20.6572f, 8.3863f, 20.6572f, 13.3569f)
                curveTo(20.6572f, 18.3275f, 16.6278f, 22.3569f, 11.6572f, 22.3569f)
                curveTo(6.6866f, 22.3569f, 2.6572f, 18.3275f, 2.6572f, 13.3569f)
                close()
                moveTo(4.1572f, 13.3569f)
                curveTo(4.1572f, 17.499f, 7.5151f, 20.8569f, 11.6572f, 20.8569f)
                curveTo(13.6463f, 20.8569f, 15.554f, 20.0667f, 16.9605f, 18.6602f)
                curveTo(18.367f, 17.2537f, 19.1572f, 15.346f, 19.1572f, 13.3569f)
                curveTo(19.1572f, 9.2148f, 15.7993f, 5.8569f, 11.6572f, 5.8569f)
                curveTo(7.5151f, 5.8569f, 4.1572f, 9.2148f, 4.1572f, 13.3569f)
                close()
            }
            handyPath {
                moveTo(9.3072f, 9.5469f)
                curveTo(9.0117f, 9.2715f, 8.5512f, 9.2797f, 8.2656f, 9.5653f)
                curveTo(7.98f, 9.8509f, 7.9718f, 10.3114f, 8.2472f, 10.6069f)
                lineTo(10.9072f, 13.2669f)
                verticalLineTo(17.3569f)
                curveTo(10.9072f, 17.7711f, 11.243f, 18.1069f, 11.6572f, 18.1069f)
                curveTo(12.0714f, 18.1069f, 12.4072f, 17.7711f, 12.4072f, 17.3569f)
                verticalLineTo(12.9569f)
                curveTo(12.407f, 12.7581f, 12.3279f, 12.5674f, 12.1872f, 12.4269f)
                lineTo(9.3072f, 9.5469f)
                close()
            }
            handyPath {
                moveTo(21.1872f, 5.8569f)
                curveTo(19.9526f, 4.2104f, 18.3127f, 2.9116f, 16.4272f, 2.0869f)
                curveTo(16.2432f, 2.0035f, 16.0333f, 1.9978f, 15.8451f, 2.0713f)
                curveTo(15.6568f, 2.1447f, 15.5062f, 2.2909f, 15.4272f, 2.4769f)
                curveTo(15.3409f, 2.6606f, 15.3337f, 2.8716f, 15.4074f, 3.0607f)
                curveTo(15.4812f, 3.2497f, 15.6293f, 3.4002f, 15.8172f, 3.4769f)
                curveTo(17.4642f, 4.2015f, 18.8968f, 5.338f, 19.9772f, 6.7769f)
                curveTo(20.1188f, 6.9658f, 20.3411f, 7.0769f, 20.5772f, 7.0769f)
                curveTo(20.7396f, 7.0776f, 20.8977f, 7.0249f, 21.0272f, 6.9269f)
                curveTo(21.1938f, 6.8088f, 21.305f, 6.6279f, 21.3352f, 6.426f)
                curveTo(21.3654f, 6.2241f, 21.3119f, 6.0186f, 21.1872f, 5.8569f)
                close()
            }
            handyPath {
                moveTo(3.3272f, 6.7569f)
                curveTo(4.4076f, 5.318f, 5.8402f, 4.1815f, 7.4872f, 3.4569f)
                curveTo(7.6751f, 3.3802f, 7.8232f, 3.2297f, 7.897f, 3.0407f)
                curveTo(7.9707f, 2.8516f, 7.9635f, 2.6406f, 7.8772f, 2.4569f)
                curveTo(7.7982f, 2.2709f, 7.6476f, 2.1247f, 7.4593f, 2.0513f)
                curveTo(7.2711f, 1.9779f, 7.0612f, 1.9835f, 6.8772f, 2.0669f)
                curveTo(4.993f, 2.8987f, 3.3565f, 4.2044f, 2.1272f, 5.8569f)
                curveTo(1.9112f, 6.1789f, 1.9762f, 6.6125f, 2.2772f, 6.8569f)
                curveTo(2.4067f, 6.9549f, 2.5648f, 7.0076f, 2.7272f, 7.0069f)
                curveTo(2.9548f, 7.0191f, 3.1756f, 6.9271f, 3.3272f, 6.7569f)
                close()
            }
        }.build()
        return _Alarmline!!
    }

