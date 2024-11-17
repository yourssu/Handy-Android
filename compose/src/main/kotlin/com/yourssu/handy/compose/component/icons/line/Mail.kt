package com.yourssu.handy.compose.component.icons.line

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _mail: ImageVector? = null

public val HandyIcons.Line.Mail: ImageVector
    get() {
        if (_mail != null) {
            return _mail!!
        }
        _mail = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(18f, 4f)
                horizontalLineTo(6f)
                curveTo(3.7909f, 4f, 2f, 5.7909f, 2f, 8f)
                verticalLineTo(17f)
                curveTo(2f, 19.2091f, 3.7909f, 21f, 6f, 21f)
                horizontalLineTo(18f)
                curveTo(20.2091f, 21f, 22f, 19.2091f, 22f, 17f)
                verticalLineTo(8f)
                curveTo(22f, 5.7909f, 20.2091f, 4f, 18f, 4f)
                close()
                moveTo(6f, 5.59f)
                horizontalLineTo(18f)
                curveTo(19.0657f, 5.592f, 20.0025f, 6.2966f, 20.3f, 7.32f)
                lineTo(12.76f, 12.91f)
                curveTo(12.5534f, 13.112f, 12.2732f, 13.221f, 11.9843f, 13.2115f)
                curveTo(11.6955f, 13.2021f, 11.423f, 13.0751f, 11.23f, 12.86f)
                lineTo(3.72f, 7.33f)
                curveTo(4.0118f, 6.3097f, 4.9389f, 5.6022f, 6f, 5.59f)
                close()
                moveTo(3.59f, 17f)
                curveTo(3.59f, 18.331f, 4.669f, 19.41f, 6f, 19.41f)
                horizontalLineTo(18f)
                curveTo(19.3271f, 19.4045f, 20.4f, 18.3271f, 20.4f, 17f)
                verticalLineTo(8.97f)
                lineTo(13.6f, 13.97f)
                curveTo(13.1654f, 14.3746f, 12.5938f, 14.5997f, 12f, 14.6f)
                curveTo(11.3827f, 14.5902f, 10.7911f, 14.3514f, 10.34f, 13.93f)
                lineTo(3.59f, 8.93f)
                verticalLineTo(17f)
                close()
            }
        }
        return _mail!!
    }

