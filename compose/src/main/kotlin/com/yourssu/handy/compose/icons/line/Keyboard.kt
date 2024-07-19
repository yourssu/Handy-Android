import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Keyboardline, null)
}

private var _Keyboardline: ImageVector? = null

public val Keyboardline: ImageVector
    get() {
        if (_Keyboardline != null) {
            return _Keyboardline!!
        }
        _Keyboardline = ImageVector.Builder(
            name = "Keyboardline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(4.85714f, 4f)
                horizontalLineTo(19.1429f)
                curveTo(20.7208f, 4f, 22f, 5.3431f, 22f, 7f)
                verticalLineTo(17f)
                curveTo(22f, 18.6569f, 20.7208f, 20f, 19.1429f, 20f)
                horizontalLineTo(4.85714f)
                curveTo(3.2792f, 20f, 2f, 18.6569f, 2f, 17f)
                verticalLineTo(7f)
                curveTo(2f, 5.3431f, 3.2792f, 4f, 4.8571f, 4f)
                close()
                moveTo(19.1426f, 18.4899f)
                curveTo(19.9264f, 18.4899f, 20.5617f, 17.8228f, 20.5617f, 16.9999f)
                verticalLineTo(6.99989f)
                curveTo(20.5643f, 6.5995f, 20.4133f, 6.2149f, 20.1428f, 5.9327f)
                curveTo(19.8722f, 5.6505f, 19.5049f, 5.4945f, 19.1236f, 5.4999f)
                horizontalLineTo(4.83789f)
                curveTo(4.4599f, 5.4999f, 4.0975f, 5.6582f, 3.8311f, 5.9398f)
                curveTo(3.5647f, 6.2214f, 3.4163f, 6.603f, 3.4188f, 6.9999f)
                verticalLineTo(16.9999f)
                curveTo(3.4188f, 17.3986f, 3.5709f, 17.7806f, 3.8412f, 18.0606f)
                curveTo(4.1114f, 18.3406f, 4.4773f, 18.4952f, 4.8569f, 18.4899f)
                horizontalLineTo(19.1426f)
                close()
            }
            handyPath {
                moveTo(5.32403f, 11.9524f)
                curveTo(5.324f, 11.4264f, 5.7504f, 11f, 6.2764f, 11f)
                curveTo(6.8024f, 11f, 7.2288f, 11.4264f, 7.2288f, 11.9524f)
                verticalLineTo(12.0476f)
                curveTo(7.2288f, 12.5736f, 6.8024f, 13f, 6.2764f, 13f)
                curveTo(5.7504f, 13f, 5.324f, 12.5736f, 5.324f, 12.0476f)
                verticalLineTo(11.9524f)
                close()
            }
            handyPath {
                moveTo(9.13356f, 11.9524f)
                curveTo(9.1336f, 11.4264f, 9.56f, 11f, 10.0859f, 11f)
                curveTo(10.6119f, 11f, 11.0383f, 11.4264f, 11.0383f, 11.9524f)
                verticalLineTo(12.0476f)
                curveTo(11.0383f, 12.5736f, 10.6119f, 13f, 10.0859f, 13f)
                curveTo(9.56f, 13f, 9.1336f, 12.5736f, 9.1336f, 12.0476f)
                verticalLineTo(11.9524f)
                close()
            }
            handyPath {
                moveTo(12.9431f, 11.9524f)
                curveTo(12.9431f, 11.4264f, 13.3695f, 11f, 13.8955f, 11f)
                curveTo(14.4214f, 11f, 14.8478f, 11.4264f, 14.8478f, 11.9524f)
                verticalLineTo(12.0476f)
                curveTo(14.8478f, 12.5736f, 14.4214f, 13f, 13.8955f, 13f)
                curveTo(13.3695f, 13f, 12.9431f, 12.5736f, 12.9431f, 12.0476f)
                verticalLineTo(11.9524f)
                close()
            }
            handyPath {
                moveTo(16.7526f, 11.9524f)
                curveTo(16.7526f, 11.4264f, 17.179f, 11f, 17.705f, 11f)
                curveTo(18.231f, 11f, 18.6574f, 11.4264f, 18.6574f, 11.9524f)
                verticalLineTo(12.0476f)
                curveTo(18.6574f, 12.5736f, 18.231f, 13f, 17.705f, 13f)
                curveTo(17.179f, 13f, 16.7526f, 12.5736f, 16.7526f, 12.0476f)
                verticalLineTo(11.9524f)
                close()
            }
            handyPath {
                moveTo(5.32403f, 7.95238f)
                curveTo(5.324f, 7.4264f, 5.7504f, 7f, 6.2764f, 7f)
                curveTo(6.8024f, 7f, 7.2288f, 7.4264f, 7.2288f, 7.9524f)
                verticalLineTo(8.04762f)
                curveTo(7.2288f, 8.5736f, 6.8024f, 9f, 6.2764f, 9f)
                curveTo(5.7504f, 9f, 5.324f, 8.5736f, 5.324f, 8.0476f)
                verticalLineTo(7.95238f)
                close()
            }
            handyPath {
                moveTo(9.13356f, 7.95238f)
                curveTo(9.1336f, 7.4264f, 9.56f, 7f, 10.0859f, 7f)
                curveTo(10.6119f, 7f, 11.0383f, 7.4264f, 11.0383f, 7.9524f)
                verticalLineTo(8.04762f)
                curveTo(11.0383f, 8.5736f, 10.6119f, 9f, 10.0859f, 9f)
                curveTo(9.56f, 9f, 9.1336f, 8.5736f, 9.1336f, 8.0476f)
                verticalLineTo(7.95238f)
                close()
            }
            handyPath {
                moveTo(12.9431f, 7.95238f)
                curveTo(12.9431f, 7.4264f, 13.3695f, 7f, 13.8955f, 7f)
                curveTo(14.4214f, 7f, 14.8478f, 7.4264f, 14.8478f, 7.9524f)
                verticalLineTo(8.04762f)
                curveTo(14.8478f, 8.5736f, 14.4214f, 9f, 13.8955f, 9f)
                curveTo(13.3695f, 9f, 12.9431f, 8.5736f, 12.9431f, 8.0476f)
                verticalLineTo(7.95238f)
                close()
            }
            handyPath {
                moveTo(16.7526f, 7.95238f)
                curveTo(16.7526f, 7.4264f, 17.179f, 7f, 17.705f, 7f)
                curveTo(18.231f, 7f, 18.6574f, 7.4264f, 18.6574f, 7.9524f)
                verticalLineTo(8.04762f)
                curveTo(18.6574f, 8.5736f, 18.231f, 9f, 17.705f, 9f)
                curveTo(17.179f, 9f, 16.7526f, 8.5736f, 16.7526f, 8.0476f)
                verticalLineTo(7.95238f)
                close()
            }
            handyPath {
                moveTo(7.70499f, 15.96f)
                curveTo(7.705f, 15.4298f, 8.1348f, 15f, 8.665f, 15f)
                horizontalLineTo(15.3164f)
                curveTo(15.8466f, 15f, 16.2764f, 15.4298f, 16.2764f, 15.96f)
                verticalLineTo(16.04f)
                curveTo(16.2764f, 16.5702f, 15.8466f, 17f, 15.3164f, 17f)
                horizontalLineTo(8.66498f)
                curveTo(8.1348f, 17f, 7.705f, 16.5702f, 7.705f, 16.04f)
                verticalLineTo(15.96f)
                close()
            }
        }.build()
        return _Keyboardline!!
    }

