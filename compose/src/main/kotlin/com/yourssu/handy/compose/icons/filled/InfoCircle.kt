package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _infoCircle: ImageVector? = null

public val HandyIcons.Filled.InfoCircle: ImageVector
    get() {
        if (_infoCircle != null) {
            return _infoCircle!!
        }
        _infoCircle = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(2f, 11.785f)
                curveTo(2f, 6.3809f, 6.3809f, 2f, 11.785f, 2f)
                curveTo(17.1891f, 2f, 21.57f, 6.3809f, 21.57f, 11.785f)
                curveTo(21.57f, 17.1891f, 17.1891f, 21.57f, 11.785f, 21.57f)
                curveTo(6.3809f, 21.57f, 2f, 17.1891f, 2f, 11.785f)
                close()
                moveTo(11.79f, 15.52f)
                curveTo(11.3758f, 15.52f, 11.04f, 15.1843f, 11.04f, 14.77f)
                verticalLineTo(11.67f)
                curveTo(11.04f, 11.2558f, 11.3758f, 10.92f, 11.79f, 10.92f)
                curveTo(12.2043f, 10.92f, 12.54f, 11.2558f, 12.54f, 11.67f)
                verticalLineTo(14.79f)
                curveTo(12.5241f, 15.1942f, 12.1945f, 15.515f, 11.79f, 15.52f)
                close()
                moveTo(11.04f, 9.24998f)
                curveTo(11.04f, 9.6642f, 11.3758f, 10f, 11.79f, 10f)
                curveTo(12.1945f, 9.995f, 12.5241f, 9.6741f, 12.54f, 9.27f)
                verticalLineTo(8.89998f)
                curveTo(12.54f, 8.4858f, 12.2043f, 8.15f, 11.79f, 8.15f)
                curveTo(11.3758f, 8.15f, 11.04f, 8.4858f, 11.04f, 8.9f)
                verticalLineTo(9.24998f)
                close()
            }
        }
        return _infoCircle!!
    }

