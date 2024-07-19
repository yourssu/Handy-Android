import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Deleteline, null)
}

private var _Deleteline: ImageVector? = null

public val Deleteline: ImageVector
    get() {
        if (_Deleteline != null) {
            return _Deleteline!!
        }
        _Deleteline = ImageVector.Builder(
            name = "Deleteline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(16.4496f, 9.1209f)
                curveTo(16.7424f, 8.8285f, 17.2168f, 8.8285f, 17.5096f, 9.1209f)
                curveTo(17.6513f, 9.2615f, 17.7301f, 9.4534f, 17.7282f, 9.653f)
                curveTo(17.7263f, 9.8526f, 17.6439f, 10.043f, 17.4996f, 10.1809f)
                lineTo(15.8596f, 11.8309f)
                lineTo(17.4996f, 13.4709f)
                curveTo(17.6426f, 13.6102f, 17.7232f, 13.8013f, 17.7232f, 14.0009f)
                curveTo(17.7232f, 14.2005f, 17.6426f, 14.3916f, 17.4996f, 14.5309f)
                curveTo(17.3604f, 14.6735f, 17.1689f, 14.753f, 16.9696f, 14.7509f)
                curveTo(16.7706f, 14.7518f, 16.5795f, 14.6725f, 16.4396f, 14.5309f)
                lineTo(14.7996f, 12.8909f)
                lineTo(13.1496f, 14.5309f)
                curveTo(13.0118f, 14.6755f, 12.8194f, 14.7554f, 12.6196f, 14.7509f)
                curveTo(12.4206f, 14.7518f, 12.2295f, 14.6725f, 12.0896f, 14.5309f)
                curveTo(11.7972f, 14.2381f, 11.7972f, 13.7637f, 12.0896f, 13.4709f)
                lineTo(13.7396f, 11.8309f)
                lineTo(12.0996f, 10.1809f)
                curveTo(11.8243f, 9.8854f, 11.8324f, 9.4249f, 12.118f, 9.1393f)
                curveTo(12.4036f, 8.8537f, 12.8641f, 8.8455f, 13.1596f, 9.1209f)
                lineTo(14.8096f, 10.7509f)
                lineTo(16.4496f, 9.1209f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(19.4096f, 5.0009f)
                horizontalLineTo(8.40962f)
                curveTo(7.8169f, 5.0247f, 7.2615f, 5.2969f, 6.8796f, 5.7509f)
                lineTo(2.49962f, 10.6309f)
                curveTo(1.8111f, 11.4121f, 1.8372f, 12.5909f, 2.5596f, 13.3409f)
                lineTo(6.87962f, 17.8609f)
                curveTo(7.2785f, 18.2716f, 7.8271f, 18.5026f, 8.3996f, 18.5009f)
                horizontalLineTo(19.3996f)
                curveTo(19.9421f, 18.5199f, 20.469f, 18.3176f, 20.8593f, 17.9405f)
                curveTo(21.2497f, 17.5633f, 21.47f, 17.0437f, 21.4696f, 16.5009f)
                verticalLineTo(7.0009f)
                curveTo(21.4699f, 6.4599f, 21.2509f, 5.9419f, 20.8628f, 5.565f)
                curveTo(20.4746f, 5.1882f, 19.9504f, 4.9847f, 19.4096f, 5.0009f)
                close()
                moveTo(19.9796f, 16.5009f)
                curveTo(19.972f, 16.6434f, 19.9072f, 16.7768f, 19.7999f, 16.8709f)
                curveTo(19.6926f, 16.965f, 19.5519f, 17.0119f, 19.4096f, 17.0009f)
                horizontalLineTo(8.40962f)
                curveTo(8.2477f, 17.0025f, 8.0922f, 16.9374f, 7.9796f, 16.8209f)
                lineTo(3.63962f, 12.3009f)
                curveTo(3.4631f, 12.1125f, 3.4631f, 11.8193f, 3.6396f, 11.6309f)
                lineTo(7.99962f, 6.6909f)
                curveTo(8.1173f, 6.5687f, 8.2799f, 6.5f, 8.4496f, 6.5009f)
                horizontalLineTo(19.4496f)
                curveTo(19.5919f, 6.4899f, 19.7326f, 6.5368f, 19.8399f, 6.6309f)
                curveTo(19.9472f, 6.725f, 20.012f, 6.8584f, 20.0196f, 7.0009f)
                lineTo(19.9796f, 16.5009f)
                close()
            }
        }.build()
        return _Deleteline!!
    }

