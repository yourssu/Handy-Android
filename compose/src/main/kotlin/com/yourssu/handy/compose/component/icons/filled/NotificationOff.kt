package com.yourssu.handy.compose.component.icons.filled

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.handyPath
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon

private var _notificationOff: ImageVector? = null

public val HandyIcons.Filled.NotificationOff: ImageVector
    get() {
        if (_notificationOff != null) {
            return _notificationOff!!
        }
        _notificationOff = handyIcon {
            handyPath {
                moveTo(18.9986f, 13.9274f)
                verticalLineTo(9.99735f)
                curveTo(18.9986f, 6.1474f, 15.5586f, 2.9973f, 11.3086f, 2.9973f)
                curveTo(9.9906f, 2.9924f, 8.6907f, 3.3045f, 7.5186f, 3.9074f)
                lineTo(18.9986f, 14.7374f)
                curveTo(18.9986f, 14.7374f, 18.9986f, 14.4874f, 18.9986f, 13.9274f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(3.8586f, 2.48735f)
                lineTo(22.5286f, 19.7174f)
                horizontalLineTo(22.5386f)
                curveTo(22.7887f, 19.9985f, 22.8599f, 20.3963f, 22.7227f, 20.7467f)
                curveTo(22.5855f, 21.0971f, 22.2631f, 21.3408f, 21.8886f, 21.3774f)
                curveTo(21.6477f, 21.3813f, 21.4147f, 21.2917f, 21.2386f, 21.1274f)
                lineTo(19.2386f, 19.2474f)
                horizontalLineTo(14.1086f)
                curveTo(14.1086f, 20.9042f, 12.7655f, 22.2474f, 11.1086f, 22.2474f)
                curveTo(9.4518f, 22.2474f, 8.1086f, 20.9042f, 8.1086f, 19.2474f)
                horizontalLineTo(4.5686f)
                curveTo(3.6848f, 19.3323f, 2.8445f, 18.8469f, 2.4766f, 18.0388f)
                curveTo(2.1086f, 17.2307f, 2.2942f, 16.2782f, 2.9386f, 15.6674f)
                curveTo(3.3613f, 15.291f, 3.6047f, 14.7533f, 3.6086f, 14.1874f)
                verticalLineTo(9.47735f)
                curveTo(3.661f, 8.2106f, 4.0362f, 6.9783f, 4.6986f, 5.8974f)
                lineTo(2.5586f, 3.89735f)
                curveTo(2.1757f, 3.709f, 1.9545f, 3.2984f, 2.0079f, 2.875f)
                curveTo(2.0612f, 2.4517f, 2.3774f, 2.1088f, 2.795f, 2.0213f)
                curveTo(3.2127f, 1.9338f, 3.6398f, 2.121f, 3.8586f, 2.4874f)
                close()
                moveTo(9.5486f, 19.2574f)
                curveTo(9.5912f, 20.0765f, 10.2684f, 20.7185f, 11.0886f, 20.7174f)
                verticalLineTo(20.7074f)
                curveTo(11.9013f, 20.7035f, 12.5711f, 20.0687f, 12.6186f, 19.2574f)
                horizontalLineTo(9.5486f)
                close()
            }
        }
        return _notificationOff!!
    }

