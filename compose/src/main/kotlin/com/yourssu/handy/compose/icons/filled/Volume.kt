package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Volumefilled, null)
}

private var _Volumefilled: ImageVector? = null

public val Volumefilled: ImageVector
    get() {
        if (_Volumefilled != null) {
            return _Volumefilled!!
        }
        _Volumefilled = ImageVector.Builder(
            name = "Volumefilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(16.0697f, 3.87998f)
                lineTo(9.66973f, 8.14998f)
                curveTo(9.3037f, 8.3978f, 8.8718f, 8.5302f, 8.4297f, 8.53f)
                horizontalLineTo(6.69973f)
                curveTo(6.1092f, 8.5273f, 5.542f, 8.76f, 5.1235f, 9.1767f)
                curveTo(4.705f, 9.5933f, 4.4697f, 10.1595f, 4.4697f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(4.4697f, 13.8405f, 4.705f, 14.4067f, 5.1235f, 14.8233f)
                curveTo(5.542f, 15.2399f, 6.1092f, 15.4726f, 6.6997f, 15.47f)
                horizontalLineTo(8.42973f)
                curveTo(8.8718f, 15.4698f, 9.3037f, 15.6022f, 9.6697f, 15.85f)
                lineTo(16.0697f, 20.12f)
                curveTo(16.753f, 20.5718f, 17.6289f, 20.6127f, 18.3512f, 20.2264f)
                curveTo(19.0736f, 19.8402f, 19.526f, 19.0891f, 19.5297f, 18.27f)
                verticalLineTo(5.72998f)
                curveTo(19.526f, 4.9109f, 19.0736f, 4.1597f, 18.3512f, 3.7735f)
                curveTo(17.6289f, 3.3873f, 16.753f, 3.4282f, 16.0697f, 3.88f)
                close()
            }
        }.build()
        return _Volumefilled!!
    }

