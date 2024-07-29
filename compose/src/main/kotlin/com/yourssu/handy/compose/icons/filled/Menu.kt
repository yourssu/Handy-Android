package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.handyPath
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon

private var _menu: ImageVector? = null

public val HandyIcons.Filled.Menu: ImageVector
    get() {
        if (_menu != null) {
            return _menu!!
        }
        _menu = handyIcon {
            handyPath {
                moveTo(11f, 7.5f)
                curveTo(11f, 9.433f, 9.433f, 11f, 7.5f, 11f)
                curveTo(5.567f, 11f, 4f, 9.433f, 4f, 7.5f)
                curveTo(4f, 5.567f, 5.567f, 4f, 7.5f, 4f)
                curveTo(9.433f, 4f, 11f, 5.567f, 11f, 7.5f)
                close()
            }
            handyPath {
                moveTo(21f, 7.5f)
                curveTo(21f, 9.433f, 19.433f, 11f, 17.5f, 11f)
                curveTo(15.567f, 11f, 14f, 9.433f, 14f, 7.5f)
                curveTo(14f, 5.567f, 15.567f, 4f, 17.5f, 4f)
                curveTo(19.433f, 4f, 21f, 5.567f, 21f, 7.5f)
                close()
            }
            handyPath {
                moveTo(11f, 17.5f)
                curveTo(11f, 19.433f, 9.433f, 21f, 7.5f, 21f)
                curveTo(5.567f, 21f, 4f, 19.433f, 4f, 17.5f)
                curveTo(4f, 15.567f, 5.567f, 14f, 7.5f, 14f)
                curveTo(9.433f, 14f, 11f, 15.567f, 11f, 17.5f)
                close()
            }
            handyPath {
                moveTo(21f, 17.5f)
                curveTo(21f, 19.433f, 19.433f, 21f, 17.5f, 21f)
                curveTo(15.567f, 21f, 14f, 19.433f, 14f, 17.5f)
                curveTo(14f, 15.567f, 15.567f, 14f, 17.5f, 14f)
                curveTo(19.433f, 14f, 21f, 15.567f, 21f, 17.5f)
                close()
            }
        }
        return _menu!!
    }

