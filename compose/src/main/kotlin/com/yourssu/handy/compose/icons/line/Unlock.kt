import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Unlockline, null)
}

private var _Unlockline: ImageVector? = null

public val Unlockline: ImageVector
    get() {
        if (_Unlockline != null) {
            return _Unlockline!!
        }
        _Unlockline = ImageVector.Builder(
            name = "Unlockline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(13.4626f, 13.902f)
                curveTo(13.4626f, 12.9852f, 12.7194f, 12.242f, 11.8026f, 12.242f)
                curveTo(10.8859f, 12.242f, 10.1426f, 12.9852f, 10.1426f, 13.902f)
                curveTo(10.1413f, 14.2907f, 10.2797f, 14.6669f, 10.5326f, 14.962f)
                curveTo(10.7875f, 15.2276f, 10.8759f, 15.6118f, 10.7626f, 15.962f)
                lineTo(10.5526f, 16.582f)
                curveTo(10.4714f, 16.8608f, 10.5251f, 17.1616f, 10.6978f, 17.3951f)
                curveTo(10.8704f, 17.6286f, 11.1423f, 17.768f, 11.4326f, 17.772f)
                horizontalLineTo(12.1726f)
                curveTo(12.4726f, 17.7719f, 12.7542f, 17.6271f, 12.9287f, 17.3832f)
                curveTo(13.1033f, 17.1392f, 13.1494f, 16.826f, 13.0526f, 16.542f)
                lineTo(12.8026f, 15.922f)
                curveTo(12.6894f, 15.5718f, 12.7778f, 15.1876f, 13.0326f, 14.922f)
                curveTo(13.2913f, 14.6431f, 13.4435f, 14.282f, 13.4626f, 13.902f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(14.6926f, 7.77202f)
                curveTo(16.0822f, 7.7169f, 17.4256f, 8.2761f, 18.3657f, 9.3009f)
                curveTo(19.3058f, 10.3258f, 19.7472f, 11.7123f, 19.5726f, 13.092f)
                lineTo(18.6226f, 18.862f)
                curveTo(18.1655f, 21.18f, 16.1045f, 22.8313f, 13.7426f, 22.772f)
                horizontalLineTo(9.86265f)
                curveTo(7.5175f, 22.8241f, 5.4712f, 21.1904f, 5.0027f, 18.892f)
                lineTo(4.05265f, 13.122f)
                curveTo(3.7214f, 10.951f, 4.9812f, 8.8514f, 7.0526f, 8.122f)
                verticalLineTo(5.00202f)
                curveTo(7.0521f, 4.1869f, 7.3832f, 3.4067f, 7.9699f, 2.8408f)
                curveTo(8.5565f, 2.275f, 9.3481f, 1.9721f, 10.1626f, 2.002f)
                horizontalLineTo(13.4426f)
                curveTo(14.2572f, 1.9721f, 15.0488f, 2.275f, 15.6354f, 2.8408f)
                curveTo(16.2221f, 3.4067f, 16.5532f, 4.1869f, 16.5526f, 5.002f)
                curveTo(16.5526f, 5.4162f, 16.2169f, 5.752f, 15.8026f, 5.752f)
                curveTo(15.3884f, 5.752f, 15.0526f, 5.4162f, 15.0526f, 5.002f)
                curveTo(15.0148f, 4.1497f, 14.2952f, 3.4882f, 13.4426f, 3.522f)
                horizontalLineTo(10.1626f)
                curveTo(9.3101f, 3.4882f, 8.5905f, 4.1497f, 8.5526f, 5.002f)
                verticalLineTo(7.77202f)
                horizontalLineTo(14.6926f)
                close()
                moveTo(16.8026f, 18.562f)
                lineTo(17.8026f, 12.772f)
                curveTo(17.9019f, 12.023f, 17.6638f, 11.2685f, 17.1526f, 10.712f)
                curveTo(16.531f, 10.0071f, 15.6324f, 9.6089f, 14.6926f, 9.622f)
                horizontalLineTo(8.91265f)
                curveTo(7.976f, 9.6039f, 7.078f, 9.9945f, 6.4527f, 10.692f)
                curveTo(5.9537f, 11.2618f, 5.7338f, 12.024f, 5.8526f, 12.772f)
                lineTo(6.80265f, 18.562f)
                curveTo(7.1127f, 19.9884f, 8.4043f, 20.9845f, 9.8627f, 20.922f)
                horizontalLineTo(13.7426f)
                curveTo(15.2009f, 20.9845f, 16.4926f, 19.9884f, 16.8026f, 18.562f)
                close()
            }
        }.build()
        return _Unlockline!!
    }

