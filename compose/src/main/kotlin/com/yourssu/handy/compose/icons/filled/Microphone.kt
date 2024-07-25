package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.handyPath
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon

private var _microphone: ImageVector? = null

public val HandyIcons.Filled.Microphone: ImageVector
    get() {
        if (_microphone != null) {
            return _microphone!!
        }
        _microphone = handyIcon {
            handyPath {
                moveTo(19.8413f, 11.4692f)
                curveTo(19.8899f, 15.5983f, 16.7879f, 19.0859f, 12.6813f, 19.5192f)
                verticalLineTo(21.9692f)
                curveTo(12.6813f, 22.3889f, 12.3411f, 22.7292f, 11.9213f, 22.7292f)
                curveTo(11.5016f, 22.7292f, 11.1613f, 22.3889f, 11.1613f, 21.9692f)
                verticalLineTo(19.5592f)
                curveTo(7.074f, 19.1277f, 3.9786f, 15.6692f, 4.0013f, 11.5592f)
                curveTo(3.9853f, 11.2877f, 4.1153f, 11.0282f, 4.3424f, 10.8785f)
                curveTo(4.5695f, 10.7288f, 4.8592f, 10.7117f, 5.1024f, 10.8335f)
                curveTo(5.3456f, 10.9553f, 5.5053f, 11.1977f, 5.5213f, 11.4692f)
                curveTo(5.4919f, 13.1949f, 6.1501f, 14.8614f, 7.3506f, 16.1014f)
                curveTo(8.5512f, 17.3413f, 10.1956f, 18.0529f, 11.9213f, 18.0792f)
                curveTo(13.6471f, 18.0529f, 15.2915f, 17.3413f, 16.4921f, 16.1014f)
                curveTo(17.6926f, 14.8614f, 18.3507f, 13.1949f, 18.3213f, 11.4692f)
                curveTo(18.3213f, 11.0494f, 18.6616f, 10.7092f, 19.0813f, 10.7092f)
                curveTo(19.5011f, 10.7092f, 19.8413f, 11.0494f, 19.8413f, 11.4692f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(10.0251f, 1.37362f)
                curveTo(11.8923f, 0.6084f, 14.0363f, 1.0405f, 15.4613f, 2.4692f)
                curveTo(16.3887f, 3.3989f, 16.9132f, 4.6561f, 16.9213f, 5.9692f)
                verticalLineTo(10.9692f)
                curveTo(16.9213f, 13.7306f, 14.6828f, 15.9692f, 11.9213f, 15.9692f)
                curveTo(9.1599f, 15.9692f, 6.9213f, 13.7306f, 6.9213f, 10.9692f)
                verticalLineTo(5.96918f)
                curveTo(6.9338f, 3.9514f, 8.158f, 2.1388f, 10.0251f, 1.3736f)
                close()
                moveTo(13f, 10.2177f)
                verticalLineTo(5.78967f)
                curveTo(12.9904f, 5.3567f, 12.5462f, 5.0075f, 11.9953f, 5f)
                curveTo(11.4457f, 5.0003f, 11.0003f, 5.3503f, 11f, 5.7823f)
                lineTo(11f, 10.2103f)
                curveTo(11.0095f, 10.6433f, 11.4538f, 10.9925f, 12.0046f, 11f)
                curveTo(12.5542f, 10.9997f, 12.9996f, 10.6496f, 13f, 10.2177f)
                close()
            }
        }
        return _microphone!!
    }

