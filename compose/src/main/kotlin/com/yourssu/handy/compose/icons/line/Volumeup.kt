import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Volumeupline, null)
}

private var _Volumeupline: ImageVector? = null

public val Volumeupline: ImageVector
    get() {
        if (_Volumeupline != null) {
            return _Volumeupline!!
        }
        _Volumeupline = ImageVector.Builder(
            name = "Volumeupline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(21.7203f, 11.25f)
                horizontalLineTo(20.0503f)
                verticalLineTo(9.57999f)
                curveTo(20.0503f, 9.1658f, 19.7145f, 8.83f, 19.3003f, 8.83f)
                curveTo(18.8861f, 8.83f, 18.5503f, 9.1658f, 18.5503f, 9.58f)
                verticalLineTo(11.25f)
                horizontalLineTo(16.8803f)
                curveTo(16.4661f, 11.25f, 16.1303f, 11.5858f, 16.1303f, 12f)
                curveTo(16.1303f, 12.4142f, 16.4661f, 12.75f, 16.8803f, 12.75f)
                horizontalLineTo(18.5503f)
                verticalLineTo(14.42f)
                curveTo(18.5503f, 14.8342f, 18.8861f, 15.17f, 19.3003f, 15.17f)
                curveTo(19.7145f, 15.17f, 20.0503f, 14.8342f, 20.0503f, 14.42f)
                verticalLineTo(12.75f)
                horizontalLineTo(21.7203f)
                curveTo(22.1345f, 12.75f, 22.4703f, 12.4142f, 22.4703f, 12f)
                curveTo(22.4703f, 11.5858f, 22.1345f, 11.25f, 21.7203f, 11.25f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(12.1803f, 4.54999f)
                curveTo(12.5131f, 4.322f, 12.907f, 4.2001f, 13.3103f, 4.2f)
                curveTo(13.8547f, 4.189f, 14.3799f, 4.4004f, 14.7649f, 4.7854f)
                curveTo(15.1499f, 5.1704f, 15.3613f, 5.6956f, 15.3503f, 6.24f)
                verticalLineTo(17.68f)
                curveTo(15.3766f, 18.443f, 14.9661f, 19.1545f, 14.2924f, 19.5136f)
                curveTo(13.6187f, 19.8728f, 12.7992f, 19.8171f, 12.1803f, 19.37f)
                lineTo(6.30031f, 15.45f)
                curveTo(5.9644f, 15.23f, 5.5719f, 15.1119f, 5.1703f, 15.11f)
                horizontalLineTo(3.57031f)
                curveTo(2.4657f, 15.11f, 1.5703f, 14.2146f, 1.5703f, 13.11f)
                verticalLineTo(10.81f)
                curveTo(1.5703f, 9.7054f, 2.4657f, 8.81f, 3.5703f, 8.81f)
                horizontalLineTo(5.17031f)
                curveTo(5.5719f, 8.8081f, 5.9644f, 8.69f, 6.3003f, 8.47f)
                lineTo(12.1803f, 4.54999f)
                close()
                moveTo(13.3103f, 18.3f)
                curveTo(13.6086f, 18.3f, 13.8503f, 18.0582f, 13.8503f, 17.76f)
                lineTo(13.8403f, 6.23999f)
                curveTo(13.8403f, 6.0968f, 13.7834f, 5.9594f, 13.6822f, 5.8582f)
                curveTo(13.5809f, 5.7569f, 13.4435f, 5.7f, 13.3003f, 5.7f)
                curveTo(13.1937f, 5.7003f, 13.0895f, 5.7316f, 13.0003f, 5.79f)
                lineTo(7.14032f, 9.71999f)
                curveTo(6.547f, 10.1108f, 5.8508f, 10.3161f, 5.1403f, 10.31f)
                horizontalLineTo(3.54032f)
                curveTo(3.2421f, 10.31f, 3.0003f, 10.5518f, 3.0003f, 10.85f)
                verticalLineTo(13.15f)
                curveTo(3.0001f, 13.2986f, 3.0611f, 13.4407f, 3.1689f, 13.5428f)
                curveTo(3.2768f, 13.645f, 3.422f, 13.6982f, 3.5703f, 13.69f)
                horizontalLineTo(5.13032f)
                curveTo(5.8408f, 13.6838f, 6.537f, 13.8892f, 7.1303f, 14.28f)
                lineTo(13.0103f, 18.21f)
                curveTo(13.0995f, 18.2684f, 13.2037f, 18.2997f, 13.3103f, 18.3f)
                close()
            }
        }.build()
        return _Volumeupline!!
    }

