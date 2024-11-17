package com.yourssu.handy.compose.component.icons.line

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _plus: ImageVector? = null

public val HandyIcons.Line.Plus: ImageVector
    get() {
        if (_plus != null) {
            return _plus!!
        }
        _plus = handyIcon {
            handyPath {
                moveTo(19.75f, 11f)
                horizontalLineTo(12.5f)
                verticalLineTo(3.75f)
                curveTo(12.5f, 3.3358f, 12.1642f, 3f, 11.75f, 3f)
                curveTo(11.3358f, 3f, 11f, 3.3358f, 11f, 3.75f)
                verticalLineTo(11f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 11f, 3f, 11.3358f, 3f, 11.75f)
                curveTo(3f, 12.1642f, 3.3358f, 12.5f, 3.75f, 12.5f)
                horizontalLineTo(11f)
                verticalLineTo(19.75f)
                curveTo(11f, 20.1642f, 11.3358f, 20.5f, 11.75f, 20.5f)
                curveTo(12.1642f, 20.5f, 12.5f, 20.1642f, 12.5f, 19.75f)
                verticalLineTo(12.5f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 12.5f, 20.5f, 12.1642f, 20.5f, 11.75f)
                curveTo(20.5f, 11.3358f, 20.1642f, 11f, 19.75f, 11f)
                close()
            }
        }
        return _plus!!
    }

