package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.handyPath
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon

private var _notification: ImageVector? = null

public val HandyIcons.Filled.Notification: ImageVector
    get() {
        if (_notification != null) {
            return _notification!!
        }
        _notification = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(20.4066f, 13.97f)
                curveTo(20.4094f, 14.5511f, 20.6649f, 15.1023f, 21.1066f, 15.48f)
                curveTo(22.6166f, 16.83f, 21.5466f, 19.14f, 19.4066f, 19.14f)
                horizontalLineTo(15.6066f)
                curveTo(15.114f, 20.4844f, 13.8383f, 21.3814f, 12.4066f, 21.39f)
                curveTo(10.9702f, 21.3962f, 9.6868f, 20.4938f, 9.2066f, 19.14f)
                horizontalLineTo(5.40657f)
                curveTo(3.2666f, 19.14f, 2.1966f, 16.83f, 3.7066f, 15.48f)
                curveTo(4.1482f, 15.1023f, 4.4037f, 14.5511f, 4.4066f, 13.97f)
                verticalLineTo(9.14f)
                curveTo(4.4066f, 5.2f, 7.9866f, 2f, 12.4066f, 2f)
                curveTo(16.8266f, 2f, 20.4066f, 5.2f, 20.4066f, 9.14f)
                verticalLineTo(13.97f)
                close()
                moveTo(10.8866f, 19.14f)
                curveTo(11.2505f, 19.611f, 11.8114f, 19.8878f, 12.4066f, 19.89f)
                curveTo(12.9877f, 19.8756f, 13.5314f, 19.6001f, 13.8866f, 19.14f)
                horizontalLineTo(10.8866f)
                close()
            }
        }
        return _notification!!
    }

