import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Foldereditline, null)
}

private var _Foldereditline: ImageVector? = null

public val Foldereditline: ImageVector
    get() {
        if (_Foldereditline != null) {
            return _Foldereditline!!
        }
        _Foldereditline = ImageVector.Builder(
            name = "Foldereditline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(5.88712f, 20.5647f)
                horizontalLineTo(11.8312f)
                curveTo(12.2647f, 20.5647f, 12.616f, 20.9161f, 12.616f, 21.3496f)
                curveTo(12.616f, 21.7831f, 12.2647f, 22.1345f, 11.8312f, 22.1345f)
                horizontalLineTo(5.88712f)
                curveTo(3.1904f, 22.1287f, 1.0058f, 19.944f, 1f, 17.2474f)
                verticalLineTo(6.90804f)
                curveTo(0.9972f, 5.6091f, 1.5106f, 4.3623f, 2.4271f, 3.4419f)
                curveTo(3.3436f, 2.5214f, 4.5882f, 2.0028f, 5.8871f, 2f)
                horizontalLineTo(9.92657f)
                curveTo(11.4466f, 2f, 12.6788f, 3.2322f, 12.6788f, 4.7523f)
                curveTo(12.6845f, 5.403f, 13.2106f, 5.9291f, 13.8614f, 5.9348f)
                horizontalLineTo(17.9008f)
                curveTo(20.5975f, 5.9406f, 22.7822f, 8.1252f, 22.7879f, 10.8219f)
                curveTo(22.7939f, 11.2648f, 22.4457f, 11.6316f, 22.0031f, 11.6486f)
                curveTo(21.7978f, 11.6572f, 21.598f, 11.5816f, 21.4499f, 11.4394f)
                curveTo(21.3017f, 11.2971f, 21.218f, 11.1006f, 21.2182f, 10.8952f)
                curveTo(21.2322f, 10.0044f, 20.8895f, 9.145f, 20.2665f, 8.5082f)
                curveTo(19.6434f, 7.8714f, 18.7917f, 7.51f, 17.9008f, 7.5045f)
                horizontalLineTo(13.8614f)
                curveTo(12.3413f, 7.5045f, 11.1091f, 6.2723f, 11.1091f, 4.7523f)
                curveTo(11.0922f, 4.1097f, 10.5693f, 3.5961f, 9.9266f, 3.5907f)
                horizontalLineTo(5.88712f)
                curveTo(4.055f, 3.5907f, 2.5697f, 5.0759f, 2.5697f, 6.908f)
                verticalLineTo(17.2474f)
                curveTo(2.5697f, 19.0795f, 4.055f, 20.5647f, 5.8871f, 20.5647f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(22.631f, 13.4486f)
                curveTo(21.5018f, 12.3971f, 19.752f, 12.3971f, 18.6229f, 13.4486f)
                lineTo(14.5521f, 17.3415f)
                curveTo(14.2169f, 17.6591f, 13.9962f, 18.0785f, 13.9242f, 18.5345f)
                lineTo(13.5788f, 20.6275f)
                curveTo(13.5013f, 21.0657f, 13.6556f, 21.5129f, 13.987f, 21.8101f)
                curveTo(14.2458f, 22.0741f, 14.6009f, 22.2215f, 14.9707f, 22.2182f)
                horizontalLineTo(15.1799f)
                lineTo(17.3566f, 21.8833f)
                curveTo(17.8113f, 21.8087f, 18.2337f, 21.6011f, 18.5706f, 21.2868f)
                lineTo(22.631f, 17.3939f)
                curveTo(23.1886f, 16.8741f, 23.5068f, 16.147f, 23.51f, 15.3846f)
                curveTo(23.4991f, 14.6451f, 23.1806f, 13.9435f, 22.631f, 13.4486f)
                close()
                moveTo(21.4903f, 16.2637f)
                lineTo(17.4194f, 20.1566f)
                curveTo(17.3231f, 20.2449f, 17.2031f, 20.3031f, 17.0741f, 20.324f)
                lineTo(15.2113f, 20.6066f)
                lineTo(15.4939f, 18.8799f)
                curveTo(15.5136f, 18.7626f, 15.5727f, 18.6556f, 15.6613f, 18.5764f)
                lineTo(19.7217f, 14.6835f)
                curveTo(19.9809f, 14.4432f, 20.3206f, 14.3088f, 20.674f, 14.3067f)
                curveTo(20.9932f, 14.3001f, 21.3018f, 14.4206f, 21.5321f, 14.6416f)
                curveTo(21.7448f, 14.8388f, 21.8661f, 15.1155f, 21.867f, 15.4055f)
                curveTo(21.865f, 15.7313f, 21.7287f, 16.0417f, 21.4903f, 16.2637f)
                close()
            }
        }.build()
        return _Foldereditline!!
    }

