package com.yourssu.handy.compose.component.icons.filled

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.handyPath
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon

private var _subtract: ImageVector? = null

public val HandyIcons.Filled.Subtract: ImageVector
    get() {
        if (_subtract != null) {
            return _subtract!!
        }
        _subtract = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(11.44f, 2f)
                horizontalLineTo(12.56f)
                curveTo(17.7736f, 2f, 22f, 6.2264f, 22f, 11.44f)
                verticalLineTo(12.56f)
                curveTo(22f, 17.7736f, 17.7736f, 22f, 12.56f, 22f)
                horizontalLineTo(11.44f)
                curveTo(6.2264f, 22f, 2f, 17.7736f, 2f, 12.56f)
                verticalLineTo(11.44f)
                curveTo(2f, 6.2264f, 6.2264f, 2f, 11.44f, 2f)
                close()
                moveTo(8f, 12.75f)
                horizontalLineTo(16f)
                curveTo(16.4142f, 12.75f, 16.75f, 12.4142f, 16.75f, 12f)
                curveTo(16.75f, 11.5858f, 16.4142f, 11.25f, 16f, 11.25f)
                horizontalLineTo(8f)
                curveTo(7.5858f, 11.25f, 7.25f, 11.5858f, 7.25f, 12f)
                curveTo(7.25f, 12.4142f, 7.5858f, 12.75f, 8f, 12.75f)
                close()
            }
        }
        return _subtract!!
    }

