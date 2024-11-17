package com.yourssu.handy.compose.component.icons.line

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _externalLink: ImageVector? = null

public val HandyIcons.Line.ExternalLink: ImageVector
    get() {
        if (_externalLink != null) {
            return _externalLink!!
        }
        _externalLink = handyIcon {
            handyPath {
                moveTo(20.44f, 3.46f)
                curveTo(20.3213f, 3.1836f, 20.0508f, 3.0033f, 19.75f, 3f)
                horizontalLineTo(14.75f)
                curveTo(14.3358f, 3f, 14f, 3.3358f, 14f, 3.75f)
                curveTo(14f, 4.1642f, 14.3358f, 4.5f, 14.75f, 4.5f)
                horizontalLineTo(17.94f)
                lineTo(12.22f, 10.22f)
                curveTo(11.9275f, 10.5128f, 11.9275f, 10.9872f, 12.22f, 11.28f)
                curveTo(12.5128f, 11.5725f, 12.9872f, 11.5725f, 13.28f, 11.28f)
                lineTo(19f, 5.56f)
                verticalLineTo(8.75f)
                curveTo(19f, 9.1642f, 19.3358f, 9.5f, 19.75f, 9.5f)
                curveTo(20.1642f, 9.5f, 20.5f, 9.1642f, 20.5f, 8.75f)
                verticalLineTo(3.75f)
                curveTo(20.4995f, 3.6503f, 20.4791f, 3.5517f, 20.44f, 3.46f)
                close()
            }
            handyPath {
                moveTo(17.75f, 11f)
                curveTo(17.338f, 11.0054f, 17.0054f, 11.338f, 17f, 11.75f)
                verticalLineTo(15.75f)
                curveTo(16.9945f, 17.5426f, 15.5426f, 18.9945f, 13.75f, 19f)
                horizontalLineTo(7.75f)
                curveTo(5.9573f, 18.9945f, 4.5055f, 17.5426f, 4.5f, 15.75f)
                verticalLineTo(9.75f)
                curveTo(4.5055f, 7.9573f, 5.9573f, 6.5055f, 7.75f, 6.5f)
                horizontalLineTo(11.75f)
                curveTo(12.1642f, 6.5f, 12.5f, 6.1642f, 12.5f, 5.75f)
                curveTo(12.5f, 5.3358f, 12.1642f, 5f, 11.75f, 5f)
                horizontalLineTo(7.75f)
                curveTo(5.1266f, 5f, 3f, 7.1266f, 3f, 9.75f)
                verticalLineTo(15.75f)
                curveTo(3f, 18.3734f, 5.1266f, 20.5f, 7.75f, 20.5f)
                horizontalLineTo(13.75f)
                curveTo(16.3734f, 20.5f, 18.5f, 18.3734f, 18.5f, 15.75f)
                verticalLineTo(11.75f)
                curveTo(18.4946f, 11.338f, 18.162f, 11.0054f, 17.75f, 11f)
                close()
            }
        }
        return _externalLink!!
    }

