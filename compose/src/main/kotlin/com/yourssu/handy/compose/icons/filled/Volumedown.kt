package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Volumedownfilled, null)
}

private var _Volumedownfilled: ImageVector? = null

public val Volumedownfilled: ImageVector
    get() {
        if (_Volumedownfilled != null) {
            return _Volumedownfilled!!
        }
        _Volumedownfilled = ImageVector.Builder(
            name = "Volumedownfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(21.7203f, 11.2501f)
                horizontalLineTo(16.8803f)
                curveTo(16.4661f, 11.2501f, 16.1303f, 11.5858f, 16.1303f, 12.0001f)
                curveTo(16.1303f, 12.4143f, 16.4661f, 12.7501f, 16.8803f, 12.7501f)
                horizontalLineTo(21.7203f)
                curveTo(22.1345f, 12.7501f, 22.4703f, 12.4143f, 22.4703f, 12.0001f)
                curveTo(22.4703f, 11.5858f, 22.1345f, 11.2501f, 21.7203f, 11.2501f)
                close()
            }
            handyPath {
                moveTo(12.1803f, 4.55006f)
                lineTo(6.30031f, 8.47006f)
                curveTo(5.9644f, 8.6901f, 5.5719f, 8.8082f, 5.1703f, 8.8101f)
                horizontalLineTo(3.57031f)
                curveTo(2.4657f, 8.8101f, 1.5703f, 9.7055f, 1.5703f, 10.8101f)
                verticalLineTo(13.1101f)
                curveTo(1.5703f, 14.2146f, 2.4657f, 15.1101f, 3.5703f, 15.1101f)
                horizontalLineTo(5.17031f)
                curveTo(5.5719f, 15.1119f, 5.9644f, 15.23f, 6.3003f, 15.4501f)
                lineTo(12.1803f, 19.3701f)
                curveTo(12.7992f, 19.8172f, 13.6187f, 19.8729f, 14.2924f, 19.5137f)
                curveTo(14.9661f, 19.1545f, 15.3766f, 18.4431f, 15.3503f, 17.6801f)
                verticalLineTo(6.24006f)
                curveTo(15.3766f, 5.477f, 14.9661f, 4.7656f, 14.2924f, 4.4064f)
                curveTo(13.6187f, 4.0472f, 12.7992f, 4.103f, 12.1803f, 4.5501f)
                close()
            }
        }.build()
        return _Volumedownfilled!!
    }

