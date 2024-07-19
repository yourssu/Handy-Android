import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Editline, null)
}

private var _Editline: ImageVector? = null

public val Editline: ImageVector
    get() {
        if (_Editline != null) {
            return _Editline!!
        }
        _Editline = ImageVector.Builder(
            name = "Editline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(7.79007f, 15.2699f)
                lineTo(8.52007f, 11.8599f)
                curveTo(8.6264f, 11.3861f, 8.8657f, 10.9524f, 9.2101f, 10.6099f)
                lineTo(15.8801f, 3.99993f)
                curveTo(16.5565f, 3.3109f, 17.4748f, 2.9127f, 18.4401f, 2.8899f)
                curveTo(19.1681f, 2.8795f, 19.8701f, 3.1603f, 20.3901f, 3.6699f)
                curveTo(21.5263f, 5.0124f, 21.3796f, 7.0171f, 20.0601f, 8.1799f)
                lineTo(13.3901f, 14.8499f)
                curveTo(13.0476f, 15.1943f, 12.6139f, 15.4337f, 12.1401f, 15.5399f)
                lineTo(8.73007f, 16.2699f)
                horizontalLineTo(8.54007f)
                curveTo(8.2908f, 16.2795f, 8.0527f, 16.1661f, 7.903f, 15.9665f)
                curveTo(7.7533f, 15.7669f, 7.7111f, 15.5066f, 7.7901f, 15.2699f)
                close()
                moveTo(10.2701f, 11.6799f)
                curveTo(10.13f, 11.8157f, 10.0326f, 11.9895f, 9.9901f, 12.1799f)
                lineTo(9.50007f, 14.5099f)
                lineTo(11.8301f, 14.0099f)
                curveTo(12.0205f, 13.9674f, 12.1943f, 13.87f, 12.3301f, 13.7299f)
                lineTo(19.0001f, 7.05993f)
                curveTo(19.7308f, 6.4749f, 19.8758f, 5.4204f, 19.3301f, 4.6599f)
                curveTo(19.0911f, 4.4316f, 18.7704f, 4.3091f, 18.4401f, 4.3199f)
                curveTo(17.8706f, 4.3428f, 17.3326f, 4.5867f, 16.9401f, 4.9999f)
                lineTo(10.2701f, 11.6799f)
                close()
            }
            handyPath {
                moveTo(19.9101f, 10.9299f)
                curveTo(19.4981f, 10.9353f, 19.1655f, 11.268f, 19.1601f, 11.6799f)
                verticalLineTo(17.3699f)
                curveTo(19.1735f, 18.1742f, 18.8633f, 18.9502f, 18.2993f, 19.5236f)
                curveTo(17.7352f, 20.0971f, 16.9645f, 20.42f, 16.1601f, 20.4199f)
                horizontalLineTo(6.63008f)
                curveTo(4.9675f, 20.3873f, 3.6352f, 19.0329f, 3.6301f, 17.3699f)
                verticalLineTo(7.87993f)
                curveTo(3.6574f, 6.215f, 5.0149f, 4.8797f, 6.6801f, 4.8799f)
                horizontalLineTo(12.3701f)
                curveTo(12.7843f, 4.8799f, 13.1201f, 4.5441f, 13.1201f, 4.1299f)
                curveTo(13.1201f, 3.7157f, 12.7843f, 3.3799f, 12.3701f, 3.3799f)
                horizontalLineTo(6.63008f)
                curveTo(4.1366f, 3.3798f, 2.1075f, 5.3866f, 2.0801f, 7.8799f)
                verticalLineTo(17.3699f)
                curveTo(2.0801f, 19.8828f, 4.1172f, 21.9199f, 6.6301f, 21.9199f)
                horizontalLineTo(16.1201f)
                curveTo(18.6291f, 21.9144f, 20.6601f, 19.8789f, 20.6601f, 17.3699f)
                verticalLineTo(11.6799f)
                curveTo(20.6547f, 11.268f, 20.322f, 10.9353f, 19.9101f, 10.9299f)
                close()
            }
        }.build()
        return _Editline!!
    }

