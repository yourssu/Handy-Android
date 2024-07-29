package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.handyPath
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon

private var _documents: ImageVector? = null

public val HandyIcons.Filled.Documents: ImageVector
    get() {
        if (_documents != null) {
            return _documents!!
        }
        _documents = handyIcon {
            handyPath {
                moveTo(18.9998f, 10.1502f)
                horizontalLineTo(14.1598f)
                curveTo(13.51f, 10.1476f, 12.8879f, 9.8869f, 12.4303f, 9.4256f)
                curveTo(11.9727f, 8.9642f, 11.7171f, 8.34f, 11.7198f, 7.6902f)
                verticalLineTo(2.93022f)
                curveTo(11.7198f, 2.6541f, 11.4959f, 2.4302f, 11.2198f, 2.4302f)
                horizontalLineTo(8.5498f)
                curveTo(6.3407f, 2.4302f, 4.5498f, 4.2211f, 4.5498f, 6.4302f)
                verticalLineTo(17.5702f)
                curveTo(4.5498f, 19.7794f, 6.3407f, 21.5702f, 8.5498f, 21.5702f)
                horizontalLineTo(15.4498f)
                curveTo(16.5107f, 21.5702f, 17.5281f, 21.1488f, 18.2782f, 20.3986f)
                curveTo(19.0284f, 19.6485f, 19.4498f, 18.6311f, 19.4498f, 17.5702f)
                verticalLineTo(10.6502f)
                curveTo(19.4466f, 10.3942f, 19.254f, 10.1803f, 18.9998f, 10.1502f)
                close()
            }
            handyPath {
                moveTo(14.2498f, 9.05022f)
                horizontalLineTo(18.8798f)
                curveTo(19.1267f, 9.0706f, 19.3575f, 8.9263f, 19.4475f, 8.6956f)
                curveTo(19.5375f, 8.4648f, 19.4653f, 8.2024f, 19.2698f, 8.0502f)
                lineTo(13.7198f, 2.60022f)
                curveTo(13.5668f, 2.4024f, 13.3011f, 2.33f, 13.0689f, 2.4229f)
                curveTo(12.8367f, 2.5158f, 12.6942f, 2.7514f, 12.7198f, 3.0002f)
                verticalLineTo(7.57022f)
                curveTo(12.7196f, 7.9715f, 12.8823f, 8.3558f, 13.1708f, 8.6348f)
                curveTo(13.4593f, 8.9139f, 13.8487f, 9.0638f, 14.2498f, 9.0502f)
                close()
            }
        }
        return _documents!!
    }

