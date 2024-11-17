package com.yourssu.handy.compose.component.icons.line

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _pin: ImageVector? = null

public val HandyIcons.Line.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(14.7936f, 4.60971f)
                lineTo(19.3436f, 9.15971f)
                curveTo(20.175f, 9.9947f, 20.175f, 11.3447f, 19.3436f, 12.1797f)
                lineTo(16.5536f, 14.9697f)
                curveTo(16.395f, 15.1333f, 16.2604f, 15.3185f, 16.1536f, 15.5197f)
                lineTo(14.6136f, 18.6097f)
                curveTo(14.3037f, 19.2231f, 13.7192f, 19.6514f, 13.041f, 19.7621f)
                curveTo(12.3628f, 19.8728f, 11.6725f, 19.6527f, 11.1836f, 19.1697f)
                lineTo(8.51357f, 16.4997f)
                lineTo(5.28357f, 19.7297f)
                curveTo(5.1437f, 19.8713f, 4.9526f, 19.9507f, 4.7536f, 19.9497f)
                curveTo(4.5538f, 19.9542f, 4.3614f, 19.8744f, 4.2236f, 19.7297f)
                curveTo(4.0806f, 19.5904f, 4f, 19.3993f, 4f, 19.1997f)
                curveTo(4f, 19.0001f, 4.0806f, 18.809f, 4.2236f, 18.6697f)
                lineTo(7.45357f, 15.4397f)
                lineTo(4.78357f, 12.7697f)
                curveTo(4.2963f, 12.2828f, 4.0732f, 11.591f, 4.1842f, 10.9111f)
                curveTo(4.2952f, 10.2313f, 4.7267f, 9.6464f, 5.3436f, 9.3397f)
                lineTo(8.43357f, 7.79971f)
                curveTo(8.6348f, 7.6929f, 8.82f, 7.5583f, 8.9836f, 7.3997f)
                lineTo(11.7936f, 4.60971f)
                curveTo(12.6284f, 3.7968f, 13.9588f, 3.7968f, 14.7936f, 4.6097f)
                close()
                moveTo(15.4236f, 13.8297f)
                lineTo(18.2036f, 11.0497f)
                curveTo(18.4205f, 10.8476f, 18.4339f, 10.5083f, 18.2336f, 10.2897f)
                lineTo(13.6936f, 5.74971f)
                curveTo(13.5938f, 5.6471f, 13.4567f, 5.5892f, 13.3136f, 5.5892f)
                curveTo(13.1704f, 5.5892f, 13.0334f, 5.6471f, 12.9336f, 5.7497f)
                lineTo(10.1536f, 8.52971f)
                curveTo(9.8614f, 8.8169f, 9.5235f, 9.0535f, 9.1536f, 9.2297f)
                lineTo(6.06357f, 10.7797f)
                curveTo(5.9072f, 10.8523f, 5.7981f, 10.999f, 5.7736f, 11.1697f)
                curveTo(5.7411f, 11.3386f, 5.7978f, 11.5124f, 5.9236f, 11.6297f)
                lineTo(12.3236f, 18.0297f)
                curveTo(12.4182f, 18.1337f, 12.553f, 18.1919f, 12.6936f, 18.1897f)
                curveTo(12.8987f, 18.1932f, 13.0868f, 18.0757f, 13.1736f, 17.8897f)
                lineTo(14.7236f, 14.8297f)
                curveTo(14.8998f, 14.4598f, 15.1363f, 14.1219f, 15.4236f, 13.8297f)
                close()
            }
        }
        return _pin!!
    }

