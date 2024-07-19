package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Volumeupfilled, null)
}

private var _Volumeupfilled: ImageVector? = null

public val Volumeupfilled: ImageVector
    get() {
        if (_Volumeupfilled != null) {
            return _Volumeupfilled!!
        }
        _Volumeupfilled = ImageVector.Builder(
            name = "Volumeupfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(21.7203f, 11.25f)
                horizontalLineTo(20.0503f)
                verticalLineTo(9.58f)
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
            handyPath {
                moveTo(12.1803f, 4.55f)
                lineTo(6.30031f, 8.47f)
                curveTo(5.9644f, 8.69f, 5.5719f, 8.8081f, 5.1703f, 8.81f)
                horizontalLineTo(3.57031f)
                curveTo(2.4657f, 8.81f, 1.5703f, 9.7054f, 1.5703f, 10.81f)
                verticalLineTo(13.11f)
                curveTo(1.5703f, 14.2146f, 2.4657f, 15.11f, 3.5703f, 15.11f)
                horizontalLineTo(5.17031f)
                curveTo(5.5719f, 15.1119f, 5.9644f, 15.23f, 6.3003f, 15.45f)
                lineTo(12.1803f, 19.37f)
                curveTo(12.7992f, 19.8171f, 13.6187f, 19.8728f, 14.2924f, 19.5136f)
                curveTo(14.9661f, 19.1545f, 15.3766f, 18.443f, 15.3503f, 17.68f)
                verticalLineTo(6.24f)
                curveTo(15.3766f, 5.477f, 14.9661f, 4.7655f, 14.2924f, 4.4063f)
                curveTo(13.6187f, 4.0472f, 12.7992f, 4.1029f, 12.1803f, 4.55f)
                close()
            }
        }.build()
        return _Volumeupfilled!!
    }

