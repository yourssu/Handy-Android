package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.handyPath
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon

private var _shoppingBag: ImageVector? = null

public val HandyIcons.Filled.ShoppingBag: ImageVector
    get() {
        if (_shoppingBag != null) {
            return _shoppingBag!!
        }
        _shoppingBag = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(20.7404f, 6.85986f)
                lineTo(22.0004f, 15.1999f)
                curveTo(22.5104f, 18.8499f, 20.0004f, 22.1699f, 16.6004f, 22.1999f)
                horizontalLineTo(7.34036f)
                curveTo(4.0004f, 22.1999f, 1.4604f, 18.8499f, 2.0004f, 15.1999f)
                lineTo(3.26036f, 6.85986f)
                curveTo(3.5595f, 4.1022f, 5.829f, 1.9772f, 8.6004f, 1.8599f)
                horizontalLineTo(15.4004f)
                curveTo(18.1717f, 1.9772f, 20.4412f, 4.1022f, 20.7404f, 6.8599f)
                close()
                moveTo(8.10036f, 7.80986f)
                curveTo(8.1059f, 9.9615f, 9.8487f, 11.7044f, 12.0004f, 11.7099f)
                curveTo(14.152f, 11.7044f, 15.8949f, 9.9615f, 15.9004f, 7.8099f)
                curveTo(15.9004f, 7.3956f, 15.5646f, 7.0599f, 15.1504f, 7.0599f)
                curveTo(14.7361f, 7.0599f, 14.4004f, 7.3956f, 14.4004f, 7.8099f)
                curveTo(14.4004f, 9.1354f, 13.3258f, 10.2099f, 12.0004f, 10.2099f)
                curveTo(10.6749f, 10.2099f, 9.6004f, 9.1354f, 9.6004f, 7.8099f)
                curveTo(9.6004f, 7.3956f, 9.2646f, 7.0599f, 8.8504f, 7.0599f)
                curveTo(8.4361f, 7.0599f, 8.1004f, 7.3956f, 8.1004f, 7.8099f)
                close()
            }
        }
        return _shoppingBag!!
    }

