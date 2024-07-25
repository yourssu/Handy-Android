package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _calender: ImageVector? = null

public val HandyIcons.Filled.Calender: ImageVector
    get() {
        if (_calender != null) {
            return _calender!!
        }
        _calender = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(16.9f, 3.57f)
                horizontalLineTo(17f)
                curveTo(19.7614f, 3.57f, 22f, 5.8086f, 22f, 8.57f)
                verticalLineTo(17.57f)
                curveTo(22f, 20.3314f, 19.7614f, 22.57f, 17f, 22.57f)
                horizontalLineTo(7f)
                curveTo(5.6739f, 22.57f, 4.4021f, 22.0432f, 3.4645f, 21.1055f)
                curveTo(2.5268f, 20.1679f, 2f, 18.8961f, 2f, 17.57f)
                verticalLineTo(8.57f)
                curveTo(2f, 5.8086f, 4.2386f, 3.57f, 7f, 3.57f)
                horizontalLineTo(7.1f)
                verticalLineTo(1.75f)
                curveTo(7.1f, 1.3358f, 7.4358f, 1f, 7.85f, 1f)
                curveTo(8.2642f, 1f, 8.6f, 1.3358f, 8.6f, 1.75f)
                verticalLineTo(3.57f)
                horizontalLineTo(15.4f)
                verticalLineTo(1.75f)
                curveTo(15.4f, 1.3358f, 15.7358f, 1f, 16.15f, 1f)
                curveTo(16.5642f, 1f, 16.9f, 1.3358f, 16.9f, 1.75f)
                verticalLineTo(3.57f)
                close()
                moveTo(7.5f, 9.66f)
                horizontalLineTo(16.5f)
                curveTo(16.9142f, 9.66f, 17.25f, 9.3242f, 17.25f, 8.91f)
                curveTo(17.25f, 8.4958f, 16.9142f, 8.16f, 16.5f, 8.16f)
                horizontalLineTo(7.5f)
                curveTo(7.0858f, 8.16f, 6.75f, 8.4958f, 6.75f, 8.91f)
                curveTo(6.75f, 9.3242f, 7.0858f, 9.66f, 7.5f, 9.66f)
                close()
            }
        }
        return _calender!!
    }

