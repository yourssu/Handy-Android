package com.yourssu.handy.compose.icons.line

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _home: ImageVector? = null

public val HandyIcons.Line.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(20.29f, 7.00048f)
                lineTo(14.73f, 2.89048f)
                curveTo(13.1036f, 1.7032f, 10.8964f, 1.7032f, 9.27f, 2.8905f)
                lineTo(3.72f, 7.00048f)
                curveTo(2.6454f, 7.7746f, 2.0061f, 9.0161f, 2f, 10.3405f)
                verticalLineTo(17.7705f)
                curveTo(2.06f, 20.1637f, 4.0466f, 22.0564f, 6.44f, 22.0005f)
                horizontalLineTo(17.56f)
                curveTo(19.9534f, 22.0564f, 21.94f, 20.1637f, 22f, 17.7705f)
                verticalLineTo(10.3305f)
                curveTo(21.9914f, 9.0119f, 21.3567f, 7.7758f, 20.29f, 7.0005f)
                close()
                moveTo(20.5f, 17.7705f)
                curveTo(20.4404f, 19.3354f, 19.1251f, 20.5568f, 17.56f, 20.5005f)
                horizontalLineTo(6.44f)
                curveTo(4.877f, 20.5512f, 3.565f, 19.333f, 3.5f, 17.7705f)
                verticalLineTo(10.3405f)
                curveTo(3.5053f, 9.4904f, 3.9182f, 8.6945f, 4.61f, 8.2005f)
                lineTo(10.16f, 4.10048f)
                curveTo(11.2561f, 3.3001f, 12.7439f, 3.3001f, 13.84f, 4.1005f)
                lineTo(19.39f, 8.21048f)
                curveTo(20.0812f, 8.6959f, 20.4948f, 9.4858f, 20.5f, 10.3305f)
                verticalLineTo(17.7705f)
                close()
                moveTo(7.5f, 15.7505f)
                horizontalLineTo(16.5f)
                curveTo(16.9142f, 15.7505f, 17.25f, 16.0863f, 17.25f, 16.5005f)
                curveTo(17.25f, 16.9147f, 16.9142f, 17.2505f, 16.5f, 17.2505f)
                horizontalLineTo(7.5f)
                curveTo(7.0858f, 17.2505f, 6.75f, 16.9147f, 6.75f, 16.5005f)
                curveTo(6.75f, 16.0863f, 7.0858f, 15.7505f, 7.5f, 15.7505f)
                close()
            }
        }
        return _home!!
    }

