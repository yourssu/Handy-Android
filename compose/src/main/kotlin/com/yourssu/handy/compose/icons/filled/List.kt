package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _list: ImageVector? = null

public val HandyIcons.Filled.List: ImageVector
    get() {
        if (_list != null) {
            return _list!!
        }
        _list = handyIcon {
            handyPath {
                moveTo(15.62f, 11f)
                horizontalLineTo(6f)
                curveTo(5.4477f, 11f, 5f, 10.5523f, 5f, 10f)
                curveTo(5f, 9.4477f, 5.4477f, 9f, 6f, 9f)
                horizontalLineTo(15.62f)
                curveTo(16.1723f, 9f, 16.62f, 9.4477f, 16.62f, 10f)
                curveTo(16.62f, 10.5523f, 16.1723f, 11f, 15.62f, 11f)
                close()
            }
            handyPath {
                moveTo(6f, 14f)
                horizontalLineTo(18.82f)
                curveTo(19.3723f, 14f, 19.82f, 14.4477f, 19.82f, 15f)
                curveTo(19.82f, 15.5523f, 19.3723f, 16f, 18.82f, 16f)
                horizontalLineTo(6f)
                curveTo(5.4477f, 16f, 5f, 15.5523f, 5f, 15f)
                curveTo(5f, 14.4477f, 5.4477f, 14f, 6f, 14f)
                close()
            }
        }
        return _list!!
    }

