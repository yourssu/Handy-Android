package com.yourssu.handy.compose.component.icons.line

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _add: ImageVector? = null

public val HandyIcons.Line.Add: ImageVector
    get() {
        if (_add != null) {
            return _add!!
        }
        _add = handyIcon {
            handyPath {
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
                moveTo(12.56f, 20.5f)
                curveTo(16.9315f, 20.4673f, 20.4673f, 16.9315f, 20.5f, 12.56f)
                verticalLineTo(11.44f)
                curveTo(20.4673f, 7.0685f, 16.9315f, 3.5327f, 12.56f, 3.5f)
                horizontalLineTo(11.44f)
                curveTo(7.0685f, 3.5327f, 3.5327f, 7.0685f, 3.5f, 11.44f)
                verticalLineTo(12.56f)
                curveTo(3.5327f, 16.9315f, 7.0685f, 20.4673f, 11.44f, 20.5f)
                horizontalLineTo(12.56f)
                close()
            }
            handyPath {
                moveTo(16f, 11.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(8f)
                curveTo(12.75f, 7.5858f, 12.4142f, 7.25f, 12f, 7.25f)
                curveTo(11.5858f, 7.25f, 11.25f, 7.5858f, 11.25f, 8f)
                verticalLineTo(11.25f)
                horizontalLineTo(8f)
                curveTo(7.5858f, 11.25f, 7.25f, 11.5858f, 7.25f, 12f)
                curveTo(7.25f, 12.4142f, 7.5858f, 12.75f, 8f, 12.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(16f)
                curveTo(11.25f, 16.4142f, 11.5858f, 16.75f, 12f, 16.75f)
                curveTo(12.4142f, 16.75f, 12.75f, 16.4142f, 12.75f, 16f)
                verticalLineTo(12.75f)
                horizontalLineTo(16f)
                curveTo(16.4142f, 12.75f, 16.75f, 12.4142f, 16.75f, 12f)
                curveTo(16.75f, 11.5858f, 16.4142f, 11.25f, 16f, 11.25f)
                close()
            }
        }
        return _add!!
    }
