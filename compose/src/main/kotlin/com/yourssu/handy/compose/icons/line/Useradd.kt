import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Useraddline, null)
}

private var _Useraddline: ImageVector? = null

public val Useraddline: ImageVector
    get() {
        if (_Useraddline != null) {
            return _Useraddline!!
        }
        _Useraddline = ImageVector.Builder(
            name = "Useraddline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(14.2899f, 14f)
                curveTo(15.8596f, 14.0319f, 17.1895f, 15.1652f, 17.4699f, 16.71f)
                lineTo(17.6999f, 17.85f)
                curveTo(17.927f, 18.834f, 17.7037f, 19.8679f, 17.0907f, 20.6704f)
                curveTo(16.4778f, 21.4729f, 15.5389f, 21.9604f, 14.5299f, 22f)
                horizontalLineTo(5.23988f)
                curveTo(4.2294f, 21.9639f, 3.2882f, 21.4774f, 2.6745f, 20.6739f)
                curveTo(2.0607f, 19.8704f, 1.8389f, 18.8344f, 2.0699f, 17.85f)
                lineTo(2.29988f, 16.71f)
                curveTo(2.5759f, 15.1668f, 3.9025f, 14.0327f, 5.4699f, 14f)
                horizontalLineTo(14.2899f)
                close()
                moveTo(14.5299f, 20.5f)
                curveTo(15.0352f, 20.4955f, 15.5106f, 20.2596f, 15.8199f, 19.86f)
                curveTo(16.2163f, 19.3815f, 16.3678f, 18.7459f, 16.2299f, 18.14f)
                lineTo(15.9999f, 17f)
                curveTo(15.8587f, 16.1556f, 15.1453f, 15.5256f, 14.2899f, 15.49f)
                horizontalLineTo(5.46988f)
                curveTo(4.6168f, 15.5264f, 3.9067f, 16.1572f, 3.7699f, 17f)
                lineTo(3.58988f, 18.15f)
                curveTo(3.4552f, 18.7527f, 3.6065f, 19.3839f, 3.9999f, 19.86f)
                curveTo(4.2982f, 20.2462f, 4.7522f, 20.4806f, 5.2399f, 20.5f)
                horizontalLineTo(14.5299f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(10.3799f, 12f)
                horizontalLineTo(9.37987f)
                curveTo(7.1707f, 12f, 5.3799f, 10.2092f, 5.3799f, 8f)
                verticalLineTo(5.36001f)
                curveTo(5.3799f, 3.5043f, 6.8842f, 2f, 8.7399f, 2f)
                horizontalLineTo(10.9999f)
                curveTo(11.8953f, 1.992f, 12.7566f, 2.3428f, 13.3917f, 2.9741f)
                curveTo(14.0267f, 3.6053f, 14.3826f, 4.4646f, 14.3799f, 5.36f)
                verticalLineTo(8.00001f)
                curveTo(14.3799f, 10.2092f, 12.589f, 12f, 10.3799f, 12f)
                close()
                moveTo(8.73987f, 3.50001f)
                curveTo(7.7126f, 3.5f, 6.8799f, 4.3328f, 6.8799f, 5.36f)
                verticalLineTo(8.00001f)
                curveTo(6.8852f, 9.3707f, 7.9893f, 10.4836f, 9.3599f, 10.5f)
                horizontalLineTo(10.3599f)
                curveTo(11.0229f, 10.5f, 11.6588f, 10.2366f, 12.1276f, 9.7678f)
                curveTo(12.5965f, 9.2989f, 12.8599f, 8.6631f, 12.8599f, 8f)
                verticalLineTo(5.36001f)
                curveTo(12.8599f, 4.3328f, 12.0271f, 3.5f, 10.9999f, 3.5f)
                horizontalLineTo(8.73987f)
                close()
            }
            handyPath {
                moveTo(21.3799f, 6.25001f)
                horizontalLineTo(19.9999f)
                verticalLineTo(4.88001f)
                curveTo(19.9999f, 4.4658f, 19.6641f, 4.13f, 19.2499f, 4.13f)
                curveTo(18.8357f, 4.13f, 18.4999f, 4.4658f, 18.4999f, 4.88f)
                verticalLineTo(6.25001f)
                horizontalLineTo(17.1399f)
                curveTo(16.7257f, 6.25f, 16.3899f, 6.5858f, 16.3899f, 7f)
                curveTo(16.3899f, 7.4142f, 16.7257f, 7.75f, 17.1399f, 7.75f)
                horizontalLineTo(18.5099f)
                verticalLineTo(9.12001f)
                curveTo(18.5099f, 9.5342f, 18.8457f, 9.87f, 19.2599f, 9.87f)
                curveTo(19.6741f, 9.87f, 20.0099f, 9.5342f, 20.0099f, 9.12f)
                verticalLineTo(7.75001f)
                horizontalLineTo(21.3799f)
                curveTo(21.7941f, 7.75f, 22.1299f, 7.4142f, 22.1299f, 7f)
                curveTo(22.1299f, 6.5858f, 21.7941f, 6.25f, 21.3799f, 6.25f)
                close()
            }
        }.build()
        return _Useraddline!!
    }

