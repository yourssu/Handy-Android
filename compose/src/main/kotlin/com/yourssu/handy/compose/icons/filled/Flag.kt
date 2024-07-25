package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.handyPath
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon

private var _flag: ImageVector? = null

public val HandyIcons.Filled.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = handyIcon {
            handyPath {
                moveTo(17.16f, 7.25f)
                horizontalLineTo(16.25f)
                curveTo(15.3419f, 7.3012f, 14.5637f, 6.6079f, 14.51f, 5.7f)
                verticalLineTo(5.62f)
                curveTo(14.4843f, 5.1821f, 14.2852f, 4.7725f, 13.9569f, 4.4816f)
                curveTo(13.6285f, 4.1908f, 13.1978f, 4.0427f, 12.76f, 4.07f)
                horizontalLineTo(6.5f)
                verticalLineTo(3.75f)
                curveTo(6.5f, 3.3358f, 6.1642f, 3f, 5.75f, 3f)
                curveTo(5.3358f, 3f, 5f, 3.3358f, 5f, 3.75f)
                verticalLineTo(20.75f)
                curveTo(5f, 21.1642f, 5.3358f, 21.5f, 5.75f, 21.5f)
                curveTo(6.1642f, 21.5f, 6.5f, 21.1642f, 6.5f, 20.75f)
                verticalLineTo(12.47f)
                horizontalLineTo(7.67f)
                curveTo(8.5781f, 12.4188f, 9.3563f, 13.1121f, 9.41f, 14.02f)
                verticalLineTo(14.08f)
                curveTo(9.4637f, 14.9879f, 10.2419f, 15.6812f, 11.15f, 15.63f)
                horizontalLineTo(17.15f)
                curveTo(18.0581f, 15.6812f, 18.8363f, 14.9879f, 18.89f, 14.08f)
                verticalLineTo(8.78f)
                curveTo(18.8207f, 7.8867f, 18.0551f, 7.2095f, 17.16f, 7.25f)
                close()
            }
        }
        return _flag!!
    }

