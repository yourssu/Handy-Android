package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.handyPath
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon

private var _layout: ImageVector? = null

public val HandyIcons.Filled.Layout: ImageVector
    get() {
        if (_layout != null) {
            return _layout!!
        }
        _layout = handyIcon {
            handyPath {
                moveTo(3f, 5.25977f)
                curveTo(3f, 4.0171f, 4.0074f, 3.0098f, 5.25f, 3.0098f)
                horizontalLineTo(8.34f)
                curveTo(9.5826f, 3.0098f, 10.59f, 4.0171f, 10.59f, 5.2598f)
                verticalLineTo(8.34976f)
                curveTo(10.59f, 9.5924f, 9.5826f, 10.5998f, 8.34f, 10.5998f)
                horizontalLineTo(5.25f)
                curveTo(4.0074f, 10.5998f, 3f, 9.5924f, 3f, 8.3498f)
                verticalLineTo(5.25977f)
                close()
            }
            handyPath {
                moveTo(13.41f, 5.25977f)
                curveTo(13.41f, 4.0171f, 14.4174f, 3.0098f, 15.66f, 3.0098f)
                horizontalLineTo(18.75f)
                curveTo(19.9926f, 3.0098f, 21f, 4.0171f, 21f, 5.2598f)
                verticalLineTo(8.34976f)
                curveTo(21f, 9.5924f, 19.9926f, 10.5998f, 18.75f, 10.5998f)
                horizontalLineTo(15.66f)
                curveTo(14.4174f, 10.5998f, 13.41f, 9.5924f, 13.41f, 8.3498f)
                verticalLineTo(5.25977f)
                close()
            }
            handyPath {
                moveTo(3f, 15.6598f)
                curveTo(3f, 14.4171f, 4.0074f, 13.4098f, 5.25f, 13.4098f)
                horizontalLineTo(8.34f)
                curveTo(9.5826f, 13.4098f, 10.59f, 14.4171f, 10.59f, 15.6598f)
                verticalLineTo(18.7498f)
                curveTo(10.59f, 19.9924f, 9.5826f, 20.9998f, 8.34f, 20.9998f)
                horizontalLineTo(5.25f)
                curveTo(4.0074f, 20.9998f, 3f, 19.9924f, 3f, 18.7498f)
                verticalLineTo(15.6598f)
                close()
            }
            handyPath {
                moveTo(13.41f, 15.6598f)
                curveTo(13.41f, 14.4171f, 14.4174f, 13.4098f, 15.66f, 13.4098f)
                horizontalLineTo(18.75f)
                curveTo(19.9926f, 13.4098f, 21f, 14.4171f, 21f, 15.6598f)
                verticalLineTo(18.7498f)
                curveTo(21f, 19.9924f, 19.9926f, 20.9998f, 18.75f, 20.9998f)
                horizontalLineTo(15.66f)
                curveTo(14.4174f, 20.9998f, 13.41f, 19.9924f, 13.41f, 18.7498f)
                verticalLineTo(15.6598f)
                close()
            }
        }
        return _layout!!
    }

