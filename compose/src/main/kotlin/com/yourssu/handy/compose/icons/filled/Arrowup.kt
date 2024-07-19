package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


private var _Arrowupfilled: ImageVector? = null

public val Arrowupfilled: ImageVector
    get() {
        if (_Arrowupfilled != null) {
            return _Arrowupfilled!!
        }
        _Arrowupfilled = ImageVector.Builder(
            name = "Arrowupfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(18.9998f, 13f)
                curveTo(18.6015f, 13.003f, 18.2189f, 12.8442f, 17.9398f, 12.56f)
                lineTo(11.9998f, 6.61f)
                lineTo(6.07981f, 12.54f)
                curveTo(5.7231f, 13.006f, 5.1275f, 13.2211f, 4.5553f, 13.0907f)
                curveTo(3.9832f, 12.9603f, 3.5397f, 12.5082f, 3.4202f, 11.9337f)
                curveTo(3.3007f, 11.3592f, 3.5271f, 10.7678f, 3.9998f, 10.42f)
                lineTo(10.9998f, 3.42f)
                curveTo(11.2691f, 3.1602f, 11.6258f, 3.0104f, 11.9998f, 3f)
                curveTo(12.3975f, 3.0004f, 12.7788f, 3.1586f, 13.0598f, 3.44f)
                lineTo(20.0598f, 10.44f)
                curveTo(20.6459f, 11.0291f, 20.6459f, 11.9809f, 20.0598f, 12.57f)
                curveTo(19.7784f, 12.8496f, 19.3965f, 13.0045f, 18.9998f, 13f)
                close()
            }
            handyPath {
                moveTo(11.9998f, 21f)
                curveTo(11.1714f, 21f, 10.4998f, 20.3284f, 10.4998f, 19.5f)
                verticalLineTo(4.5f)
                curveTo(10.4998f, 3.6716f, 11.1714f, 3f, 11.9998f, 3f)
                curveTo(12.8282f, 3f, 13.4998f, 3.6716f, 13.4998f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(13.4998f, 20.3284f, 12.8282f, 21f, 11.9998f, 21f)
                close()
            }
        }.build()
        return _Arrowupfilled!!
    }

