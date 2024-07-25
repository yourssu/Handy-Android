package com.yourssu.handy.compose.icons.line

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _eye: ImageVector? = null

public val HandyIcons.Line.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(9.12566f, 12.148f)
                curveTo(9.1257f, 10.6036f, 10.318f, 9.3517f, 11.7888f, 9.3517f)
                curveTo(13.2596f, 9.3517f, 14.452f, 10.6036f, 14.452f, 12.148f)
                curveTo(14.452f, 13.6923f, 13.2596f, 14.9443f, 11.7888f, 14.9443f)
                curveTo(10.318f, 14.9443f, 9.1257f, 13.6923f, 9.1257f, 12.148f)
                close()
                moveTo(10.8625f, 12.148f)
                curveTo(10.8625f, 12.6851f, 11.2772f, 13.1206f, 11.7888f, 13.1206f)
                curveTo(12.3004f, 13.1206f, 12.7151f, 12.6851f, 12.7151f, 12.148f)
                curveTo(12.7151f, 11.6108f, 12.3004f, 11.1753f, 11.7888f, 11.1753f)
                curveTo(11.2772f, 11.1753f, 10.8625f, 11.6108f, 10.8625f, 12.148f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(17.2425f, 7.00519f)
                lineTo(22.0825f, 11.0659f)
                curveTo(22.3955f, 11.329f, 22.5776f, 11.7271f, 22.5776f, 12.148f)
                curveTo(22.5776f, 12.5689f, 22.3955f, 12.967f, 22.0825f, 13.23f)
                lineTo(17.2425f, 17.2908f)
                curveTo(14.0525f, 19.9643f, 9.5251f, 19.9643f, 6.3351f, 17.2908f)
                lineTo(1.49513f, 13.23f)
                curveTo(1.1822f, 12.967f, 1f, 12.5689f, 1f, 12.148f)
                curveTo(1f, 11.7271f, 1.1822f, 11.329f, 1.4951f, 11.0659f)
                lineTo(6.33513f, 7.00519f)
                curveTo(9.5251f, 4.3316f, 14.0525f, 4.3316f, 17.2425f, 7.0052f)
                close()
                moveTo(7.41197f, 15.9291f)
                curveTo(9.9737f, 18.0699f, 13.6039f, 18.0699f, 16.1657f, 15.9291f)
                lineTo(20.5888f, 12.148f)
                lineTo(16.1657f, 8.42766f)
                curveTo(13.6039f, 6.2869f, 9.9737f, 6.2869f, 7.412f, 8.4277f)
                lineTo(2.98881f, 12.148f)
                lineTo(7.41197f, 15.9291f)
                close()
            }
        }
        return _eye!!
    }

