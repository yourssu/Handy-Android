package com.yourssu.handy.compose.component.icons.line

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _infoCircle: ImageVector? = null

public val HandyIcons.Line.InfoCircle: ImageVector
    get() {
        if (_infoCircle != null) {
            return _infoCircle!!
        }
        _infoCircle = handyIcon {
            handyPath {
                moveTo(11.79f, 8.04f)
                curveTo(11.4065f, 8.0842f, 11.117f, 8.4089f, 11.117f, 8.795f)
                curveTo(11.117f, 9.1811f, 11.4065f, 9.5058f, 11.79f, 9.55f)
                curveTo(11.9915f, 9.5528f, 12.1854f, 9.4733f, 12.327f, 9.3299f)
                curveTo(12.4685f, 9.1864f, 12.5455f, 8.9915f, 12.54f, 8.79f)
                curveTo(12.5346f, 8.378f, 12.202f, 8.0454f, 11.79f, 8.04f)
                close()
            }
            handyPath {
                moveTo(11.79f, 10.92f)
                curveTo(11.5903f, 10.9173f, 11.3979f, 10.9954f, 11.2567f, 11.1367f)
                curveTo(11.1154f, 11.2779f, 11.0373f, 11.4703f, 11.04f, 11.67f)
                verticalLineTo(14.79f)
                curveTo(11.04f, 15.2042f, 11.3758f, 15.54f, 11.79f, 15.54f)
                curveTo(12.2042f, 15.54f, 12.54f, 15.2042f, 12.54f, 14.79f)
                verticalLineTo(11.69f)
                curveTo(12.5454f, 11.4876f, 12.4688f, 11.2917f, 12.3275f, 11.1467f)
                curveTo(12.1863f, 11.0017f, 11.9924f, 10.9199f, 11.79f, 10.92f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(11.79f, 2f)
                curveTo(6.3854f, 2.0055f, 2.0055f, 6.3854f, 2f, 11.79f)
                curveTo(2f, 17.1969f, 6.3831f, 21.58f, 11.79f, 21.58f)
                curveTo(17.1969f, 21.58f, 21.58f, 17.1969f, 21.58f, 11.79f)
                curveTo(21.5745f, 6.3854f, 17.1946f, 2.0055f, 11.79f, 2f)
                close()
                moveTo(11.79f, 20.08f)
                curveTo(7.2116f, 20.08f, 3.5f, 16.3684f, 3.5f, 11.79f)
                curveTo(3.5f, 7.2116f, 7.2116f, 3.5f, 11.79f, 3.5f)
                curveTo(16.3684f, 3.5f, 20.08f, 7.2116f, 20.08f, 11.79f)
                curveTo(20.0745f, 16.3662f, 16.3662f, 20.0745f, 11.79f, 20.08f)
                close()
            }
        }
        return _infoCircle!!
    }

