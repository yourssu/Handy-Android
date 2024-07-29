package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.handyPath
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon

private var _image: ImageVector? = null

public val HandyIcons.Filled.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(14.23f, 2f)
                horizontalLineTo(10f)
                curveTo(5.5817f, 2f, 2f, 5.5817f, 2f, 10f)
                verticalLineTo(14.24f)
                curveTo(2f, 18.6583f, 5.5817f, 22.24f, 10f, 22.24f)
                horizontalLineTo(14.23f)
                curveTo(18.6483f, 22.24f, 22.23f, 18.6583f, 22.23f, 14.24f)
                verticalLineTo(10f)
                curveTo(22.23f, 5.5817f, 18.6483f, 2f, 14.23f, 2f)
                close()
                moveTo(8.12f, 6.12f)
                curveTo(9.2246f, 6.12f, 10.12f, 7.0154f, 10.12f, 8.12f)
                curveTo(10.12f, 9.2246f, 9.2246f, 10.12f, 8.12f, 10.12f)
                curveTo(7.0154f, 10.12f, 6.12f, 9.2246f, 6.12f, 8.12f)
                curveTo(6.12f, 7.0154f, 7.0154f, 6.12f, 8.12f, 6.12f)
                close()
                moveTo(15.51f, 20.12f)
                curveTo(18.3411f, 19.0627f, 20.2212f, 16.3621f, 20.23f, 13.34f)
                lineTo(20.2f, 11.62f)
                curveTo(20.2f, 11.21f, 20.12f, 10.44f, 20.12f, 10.44f)
                horizontalLineTo(18.49f)
                curveTo(14.7164f, 10.4515f, 11.2706f, 12.5862f, 9.58f, 15.96f)
                curveTo(8.3529f, 14.863f, 6.7659f, 14.2546f, 5.12f, 14.25f)
                horizontalLineTo(3.91f)
                curveTo(3.8207f, 16.5747f, 5.0834f, 18.7415f, 7.15f, 19.81f)
                curveTo(7.8888f, 20.2036f, 8.7129f, 20.4096f, 9.55f, 20.41f)
                horizontalLineTo(13.72f)
                curveTo(14.329f, 20.4187f, 14.9349f, 20.3206f, 15.51f, 20.12f)
                close()
            }
        }
        return _image!!
    }

