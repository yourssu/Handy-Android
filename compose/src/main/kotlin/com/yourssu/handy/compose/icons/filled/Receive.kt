package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Receivefilled, null)
}

private var _Receivefilled: ImageVector? = null

public val Receivefilled: ImageVector
    get() {
        if (_Receivefilled != null) {
            return _Receivefilled!!
        }
        _Receivefilled = ImageVector.Builder(
            name = "Receivefilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(18.3005f, 13.51f)
                curveTo(17.9104f, 13.1223f, 17.2805f, 13.1223f, 16.8905f, 13.51f)
                lineTo(12.7705f, 17.63f)
                verticalLineTo(7f)
                curveTo(12.7705f, 6.4477f, 12.3227f, 6f, 11.7705f, 6f)
                curveTo(11.2182f, 6f, 10.7705f, 6.4477f, 10.7705f, 7f)
                verticalLineTo(17.63f)
                lineTo(6.65046f, 13.51f)
                curveTo(6.2537f, 13.1702f, 5.6623f, 13.1931f, 5.2929f, 13.5624f)
                curveTo(4.9235f, 13.9318f, 4.9007f, 14.5232f, 5.2405f, 14.92f)
                lineTo(11.0605f, 20.75f)
                curveTo(11.2482f, 20.9393f, 11.5038f, 21.0458f, 11.7705f, 21.0458f)
                curveTo(12.0371f, 21.0458f, 12.2927f, 20.9393f, 12.4805f, 20.75f)
                lineTo(18.3005f, 14.92f)
                curveTo(18.6882f, 14.53f, 18.6882f, 13.9f, 18.3005f, 13.51f)
                close()
            }
            handyPath {
                moveTo(6.77046f, 5f)
                horizontalLineTo(16.7705f)
                curveTo(17.3227f, 5f, 17.7705f, 4.5523f, 17.7705f, 4f)
                curveTo(17.7705f, 3.4477f, 17.3227f, 3f, 16.7705f, 3f)
                horizontalLineTo(6.77046f)
                curveTo(6.2182f, 3f, 5.7705f, 3.4477f, 5.7705f, 4f)
                curveTo(5.7705f, 4.5523f, 6.2182f, 5f, 6.7705f, 5f)
                close()
            }
        }.build()
        return _Receivefilled!!
    }

