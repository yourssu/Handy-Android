package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath


private var _close: ImageVector? = null

public val HandyIcons.Filled.Close: ImageVector
    get() {
        if (_close != null) {
            return _close!!
        }
        _close = handyIcon(name = "Filled.Close") {
            handyPath {
                moveTo(19.7188f, 18.3906f)
                lineTo(13.325f, 12.0004f)
                lineTo(19.7188f, 5.65714f)
                curveTo(20.0392f, 5.286f, 20.0219f, 4.7291f, 19.679f, 4.3789f)
                curveTo(19.3361f, 4.0288f, 18.7832f, 4.0034f, 18.4101f, 4.3207f)
                lineTo(11.9976f, 10.6169f)
                lineTo(5.69734f, 4.27367f)
                curveTo(5.3327f, 3.9088f, 4.7439f, 3.9088f, 4.3793f, 4.2737f)
                curveTo(4.2024f, 4.4504f, 4.1028f, 4.6909f, 4.1028f, 4.9419f)
                curveTo(4.1028f, 5.1928f, 4.2024f, 5.4334f, 4.3793f, 5.6101f)
                lineTo(10.6703f, 11.9439f)
                lineTo(4.2765f, 18.2777f)
                curveTo(4.0995f, 18.4544f, 4f, 18.695f, 4f, 18.9459f)
                curveTo(4f, 19.1969f, 4.0995f, 19.4374f, 4.2765f, 19.6141f)
                curveTo(4.4529f, 19.7903f, 4.6917f, 19.8885f, 4.9402f, 19.887f)
                curveTo(5.1841f, 19.8885f, 5.4189f, 19.794f, 5.5945f, 19.6235f)
                lineTo(11.9976f, 13.2709f)
                lineTo(18.4101f, 19.7271f)
                curveTo(18.5865f, 19.9032f, 18.8253f, 20.0014f, 19.0738f, 20f)
                curveTo(19.319f, 19.9989f, 19.554f, 19.9009f, 19.7281f, 19.7271f)
                curveTo(19.9039f, 19.5491f, 20.0017f, 19.3078f, 20f, 19.0569f)
                curveTo(19.9982f, 18.8059f, 19.897f, 18.5661f, 19.7188f, 18.3906f)
                close()
            }
        }
        return _close!!
    }
