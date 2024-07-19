package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Settingfilled, null)
}

private var _Settingfilled: ImageVector? = null

public val Settingfilled: ImageVector
    get() {
        if (_Settingfilled != null) {
            return _Settingfilled!!
        }
        _Settingfilled = ImageVector.Builder(
            name = "Settingfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(13.76f, 11.81f)
                curveTo(13.76f, 12.8925f, 12.8825f, 13.77f, 11.8f, 13.77f)
                curveTo(10.7175f, 13.77f, 9.84f, 12.8925f, 9.84f, 11.81f)
                curveTo(9.84f, 10.7275f, 10.7175f, 9.85f, 11.8f, 9.85f)
                curveTo(12.8825f, 9.85f, 13.76f, 10.7275f, 13.76f, 11.81f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(19.2264f, 8.73077f)
                curveTo(19.4169f, 9.1949f, 19.8683f, 9.4985f, 20.37f, 9.5f)
                curveTo(20.6989f, 9.5f, 21.0143f, 9.6306f, 21.2468f, 9.8632f)
                curveTo(21.4794f, 10.0957f, 21.61f, 10.4111f, 21.61f, 10.74f)
                verticalLineTo(12.88f)
                curveTo(21.61f, 13.5648f, 21.0548f, 14.12f, 20.37f, 14.12f)
                curveTo(19.8683f, 14.1215f, 19.4169f, 14.4251f, 19.2264f, 14.8892f)
                curveTo(19.036f, 15.3534f, 19.144f, 15.8865f, 19.5f, 16.24f)
                curveTo(19.9776f, 16.7295f, 19.9776f, 17.5105f, 19.5f, 18f)
                lineTo(18f, 19.5f)
                curveTo(17.5105f, 19.9776f, 16.7295f, 19.9776f, 16.24f, 19.5f)
                curveTo(15.8865f, 19.144f, 15.3534f, 19.036f, 14.8892f, 19.2264f)
                curveTo(14.4251f, 19.4169f, 14.1215f, 19.8683f, 14.12f, 20.37f)
                curveTo(14.12f, 21.0548f, 13.5648f, 21.61f, 12.88f, 21.61f)
                horizontalLineTo(10.74f)
                curveTo(10.0552f, 21.61f, 9.5f, 21.0548f, 9.5f, 20.37f)
                curveTo(9.4985f, 19.8683f, 9.1949f, 19.4169f, 8.7308f, 19.2264f)
                curveTo(8.2666f, 19.036f, 7.7335f, 19.144f, 7.38f, 19.5f)
                curveTo(6.8906f, 19.9776f, 6.1094f, 19.9776f, 5.62f, 19.5f)
                lineTo(4.12f, 18f)
                curveTo(3.6424f, 17.5105f, 3.6424f, 16.7295f, 4.12f, 16.24f)
                curveTo(4.4774f, 15.8853f, 4.5847f, 15.3496f, 4.3917f, 14.8846f)
                curveTo(4.1986f, 14.4195f, 3.7435f, 14.1174f, 3.24f, 14.12f)
                curveTo(2.5552f, 14.12f, 2f, 13.5648f, 2f, 12.88f)
                verticalLineTo(10.74f)
                curveTo(2f, 10.0552f, 2.5552f, 9.5f, 3.24f, 9.5f)
                curveTo(3.7417f, 9.4985f, 4.1931f, 9.1949f, 4.3835f, 8.7308f)
                curveTo(4.574f, 8.2666f, 4.4661f, 7.7335f, 4.11f, 7.38f)
                curveTo(3.6324f, 6.8906f, 3.6324f, 6.1094f, 4.11f, 5.62f)
                lineTo(5.61f, 4.12f)
                curveTo(6.0995f, 3.6424f, 6.8806f, 3.6424f, 7.37f, 4.12f)
                curveTo(7.7247f, 4.4774f, 8.2604f, 4.5847f, 8.7254f, 4.3917f)
                curveTo(9.1905f, 4.1986f, 9.4926f, 3.7435f, 9.49f, 3.24f)
                curveTo(9.49f, 2.5552f, 10.0452f, 2f, 10.73f, 2f)
                horizontalLineTo(12.88f)
                curveTo(13.2089f, 2f, 13.5243f, 2.1306f, 13.7568f, 2.3632f)
                curveTo(13.9894f, 2.5957f, 14.12f, 2.9111f, 14.12f, 3.24f)
                curveTo(14.1174f, 3.7435f, 14.4195f, 4.1986f, 14.8846f, 4.3917f)
                curveTo(15.3496f, 4.5847f, 15.8853f, 4.4774f, 16.24f, 4.12f)
                curveTo(16.7295f, 3.6424f, 17.5105f, 3.6424f, 18f, 4.12f)
                lineTo(19.5f, 5.62f)
                curveTo(19.9776f, 6.1094f, 19.9776f, 6.8906f, 19.5f, 7.38f)
                curveTo(19.144f, 7.7335f, 19.036f, 8.2666f, 19.2264f, 8.7308f)
                close()
                moveTo(8.34f, 11.81f)
                curveTo(8.34f, 13.7209f, 9.8891f, 15.27f, 11.8f, 15.27f)
                curveTo(13.7109f, 15.27f, 15.26f, 13.7209f, 15.26f, 11.81f)
                curveTo(15.26f, 9.8991f, 13.7109f, 8.35f, 11.8f, 8.35f)
                curveTo(9.8891f, 8.35f, 8.34f, 9.8991f, 8.34f, 11.81f)
                close()
            }
        }.build()
        return _Settingfilled!!
    }

