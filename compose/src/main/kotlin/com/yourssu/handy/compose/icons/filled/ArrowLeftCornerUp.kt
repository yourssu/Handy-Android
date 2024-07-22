package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath


private var _arrowLeftCornerUp: ImageVector? = null

public val HandyIcons.Filled.ArrowLeftCornerUp: ImageVector
    get() {
        if (_arrowLeftCornerUp != null) {
            return _arrowLeftCornerUp!!
        }
        _arrowLeftCornerUp = handyIcon(name = "Filled.ArrowLeftCornerUp") {
            handyPath {
                moveTo(14.1897f, 6.46002f)
                horizontalLineTo(9.77974f)
                lineTo(9.85974f, 6.37002f)
                curveTo(10.1431f, 6.0901f, 10.3026f, 5.7084f, 10.3026f, 5.31f)
                curveTo(10.3026f, 4.9117f, 10.1431f, 4.53f, 9.8597f, 4.25f)
                curveTo(9.2719f, 3.6706f, 8.3276f, 3.6706f, 7.7397f, 4.25f)
                lineTo(5.08974f, 6.90002f)
                curveTo(4.9495f, 7.0388f, 4.8404f, 7.2058f, 4.7697f, 7.39f)
                curveTo(4.6236f, 7.7387f, 4.6236f, 8.1314f, 4.7697f, 8.48f)
                curveTo(4.842f, 8.6723f, 4.9507f, 8.8488f, 5.0897f, 9f)
                lineTo(7.73974f, 11.64f)
                curveTo(8.3254f, 12.2249f, 9.2741f, 12.2249f, 9.8597f, 11.64f)
                curveTo(10.1431f, 11.3601f, 10.3026f, 10.9783f, 10.3026f, 10.58f)
                curveTo(10.3026f, 10.1817f, 10.1431f, 9.8f, 9.8597f, 9.52f)
                lineTo(9.77974f, 9.44002f)
                horizontalLineTo(14.1897f)
                curveTo(14.8651f, 9.4399f, 15.5122f, 9.7109f, 15.9859f, 10.1922f)
                curveTo(16.4597f, 10.6735f, 16.7205f, 11.3248f, 16.7097f, 12f)
                verticalLineTo(18.72f)
                curveTo(16.7097f, 19.5485f, 17.3813f, 20.22f, 18.2097f, 20.22f)
                curveTo(19.0382f, 20.22f, 19.7097f, 19.5485f, 19.7097f, 18.72f)
                verticalLineTo(12f)
                curveTo(19.7151f, 10.5326f, 19.1358f, 9.1234f, 18.1001f, 8.0839f)
                curveTo(17.0643f, 7.0443f, 15.6572f, 6.46f, 14.1897f, 6.46f)
                close()
            }
        }
        return _arrowLeftCornerUp!!
    }

