import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun VectorPreview() {
    Image(Retryrefreshline, null)
}

private var _Retryrefreshline: ImageVector? = null

public val Retryrefreshline: ImageVector
    get() {
        if (_Retryrefreshline != null) {
            return _Retryrefreshline!!
        }
        _Retryrefreshline = ImageVector.Builder(
            name = "Retryrefreshline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(12.5122f, 4.02129f)
                lineTo(13.2722f, 3.26129f)
                curveTo(13.5476f, 2.9658f, 13.5395f, 2.5053f, 13.2539f, 2.2197f)
                curveTo(12.9682f, 1.9341f, 12.5077f, 1.9259f, 12.2122f, 2.2013f)
                lineTo(10.2122f, 4.20129f)
                curveTo(9.9198f, 4.4941f, 9.9198f, 4.9685f, 10.2122f, 5.2613f)
                lineTo(12.2122f, 7.26129f)
                curveTo(12.505f, 7.5537f, 12.9794f, 7.5537f, 13.2722f, 7.2613f)
                curveTo(13.5647f, 6.9685f, 13.5647f, 6.4941f, 13.2722f, 6.2013f)
                lineTo(12.6122f, 5.54129f)
                curveTo(15.9796f, 5.9584f, 18.6039f, 8.6611f, 18.9217f, 12.0393f)
                curveTo(19.2395f, 15.4175f, 17.1653f, 18.5622f, 13.9347f, 19.6f)
                curveTo(10.7042f, 20.6378f, 7.1867f, 19.2894f, 5.4776f, 16.3581f)
                curveTo(3.7685f, 13.4269f, 4.3278f, 9.7015f, 6.8222f, 7.4013f)
                curveTo(7.064f, 7.1139f, 7.0558f, 6.692f, 6.8032f, 6.414f)
                curveTo(6.5506f, 6.1362f, 6.1313f, 6.088f, 5.8222f, 6.3013f)
                curveTo(2.7804f, 9.1031f, 2.1155f, 13.6519f, 4.2282f, 17.2071f)
                curveTo(6.3409f, 20.7623f, 10.6541f, 22.353f, 14.5692f, 21.0207f)
                curveTo(18.4842f, 19.6884f, 20.9319f, 15.797f, 20.4375f, 11.6911f)
                curveTo(19.9431f, 7.5852f, 16.6417f, 4.3861f, 12.5222f, 4.0213f)
                horizontalLineTo(12.5122f)
                close()
            }
        }.build()
        return _Retryrefreshline!!
    }

