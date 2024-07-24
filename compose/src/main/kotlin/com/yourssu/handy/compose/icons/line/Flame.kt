import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Flameline, null)
}

private var _Flameline: ImageVector? = null

public val Flameline: ImageVector
    get() {
        if (_Flameline != null) {
            return _Flameline!!
        }
        _Flameline = ImageVector.Builder(
            name = "Flameline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(14.5601f, 14.36f)
                horizontalLineTo(14.6201f)
                curveTo(16.5849f, 13.4928f, 18.1518f, 11.9187f, 19.0101f, 9.95f)
                verticalLineTo(14.31f)
                curveTo(19.0181f, 17.1046f, 17.3632f, 19.6362f, 14.8001f, 20.75f)
                horizontalLineTo(14.7301f)
                curveTo(13.8827f, 21.1089f, 12.9704f, 21.2893f, 12.0501f, 21.28f)
                curveTo(11.1606f, 21.2824f, 10.2797f, 21.1056f, 9.4601f, 20.76f)
                lineTo(9.20012f, 20.65f)
                curveTo(6.6426f, 19.58f, 4.9839f, 17.0722f, 5.0001f, 14.3f)
                verticalLineTo(14.12f)
                curveTo(5.0193f, 12.7003f, 5.5979f, 11.3456f, 6.6101f, 10.35f)
                lineTo(6.79012f, 10.18f)
                curveTo(8.3814f, 8.6215f, 9.6937f, 6.8019f, 10.6701f, 4.8f)
                lineTo(12.0401f, 2f)
                curveTo(12.0401f, 2f, 13.4601f, 4f, 14.7801f, 6f)
                curveTo(16.3899f, 8.3886f, 15.8545f, 11.6186f, 13.5601f, 13.36f)
                horizontalLineTo(13.4401f)
                curveTo(13.2019f, 13.6598f, 13.2278f, 14.0908f, 13.5001f, 14.36f)
                curveTo(13.614f, 14.4562f, 13.7616f, 14.503f, 13.9101f, 14.49f)
                curveTo(14.1322f, 14.4807f, 14.3515f, 14.4368f, 14.5601f, 14.36f)
                close()
                moveTo(14.1201f, 19.36f)
                horizontalLineTo(14.1901f)
                verticalLineTo(19.35f)
                curveTo(16.1896f, 18.4737f, 17.4864f, 16.503f, 17.5001f, 14.32f)
                curveTo(16.8257f, 14.9135f, 16.0546f, 15.3871f, 15.2201f, 15.72f)
                lineTo(15.0901f, 15.77f)
                curveTo(14.7137f, 15.9166f, 14.314f, 15.9945f, 13.9101f, 16f)
                curveTo(13.3627f, 16.0193f, 12.8314f, 15.8133f, 12.4401f, 15.43f)
                curveTo(11.6231f, 14.6226f, 11.5456f, 13.3293f, 12.2601f, 12.43f)
                curveTo(12.3474f, 12.321f, 12.4482f, 12.2235f, 12.5601f, 12.14f)
                horizontalLineTo(12.6301f)
                curveTo(14.3163f, 10.8822f, 14.713f, 8.5196f, 13.5301f, 6.78f)
                curveTo(13.1001f, 6.14f, 12.6701f, 5.5f, 12.2701f, 4.93f)
                lineTo(12.0201f, 5.45f)
                curveTo(10.9617f, 7.5832f, 9.5483f, 9.5208f, 7.8401f, 11.18f)
                lineTo(7.66013f, 11.35f)
                curveTo(6.9338f, 12.0668f, 6.5174f, 13.0397f, 6.5001f, 14.06f)
                verticalLineTo(14.25f)
                curveTo(6.473f, 16.4292f, 7.7705f, 18.407f, 9.7801f, 19.25f)
                lineTo(10.0401f, 19.36f)
                curveTo(11.3438f, 19.9135f, 12.8164f, 19.9135f, 14.1201f, 19.36f)
                close()
            }
        }.build()
        return _Flameline!!
    }

