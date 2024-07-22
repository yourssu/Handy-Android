package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _arrowLeft: ImageVector? = null

public val HandyIcons.Filled.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) {
            return _arrowLeft!!
        }
        _arrowLeft = handyIcon(name = "Filled.ArrowLeft") {
            handyPath {
                moveTo(11.4801f, 20.4801f)
                curveTo(11.0843f, 20.4802f, 10.704f, 20.326f, 10.4201f, 20.0501f)
                lineTo(3.42013f, 13.0501f)
                curveTo(2.8352f, 12.4644f, 2.8352f, 11.5157f, 3.4201f, 10.9301f)
                lineTo(10.4201f, 3.93007f)
                curveTo(10.8006f, 3.5514f, 11.3542f, 3.4044f, 11.8724f, 3.5446f)
                curveTo(12.3907f, 3.6848f, 12.7947f, 4.0907f, 12.9324f, 4.6096f)
                curveTo(13.0702f, 5.1284f, 12.9206f, 5.6814f, 12.5401f, 6.0601f)
                lineTo(8.10767f, 10.5f)
                horizontalLineTo(19.52f)
                curveTo(20.3484f, 10.5f, 21.02f, 11.1716f, 21.02f, 12f)
                curveTo(21.02f, 12.8284f, 20.3484f, 13.5f, 19.52f, 13.5f)
                horizontalLineTo(8.11259f)
                lineTo(12.5401f, 17.9201f)
                curveTo(12.9686f, 18.349f, 13.0966f, 18.9938f, 12.8647f, 19.5539f)
                curveTo(12.6328f, 20.1141f, 12.0864f, 20.4795f, 11.4801f, 20.4801f)
                close()
            }
        }
        return _arrowLeft!!
    }
