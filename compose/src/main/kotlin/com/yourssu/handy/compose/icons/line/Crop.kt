package com.yourssu.handy.compose.icons.line

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _crop: ImageVector? = null

public val HandyIcons.Line.Crop: ImageVector
    get() {
        if (_crop != null) {
            return _crop!!
        }
        _crop = handyIcon {
            handyPath {
                moveTo(14.6999f, 6.66988f)
                curveTo(15.3974f, 6.6699f, 16.0664f, 6.947f, 16.5596f, 7.4402f)
                curveTo(17.0528f, 7.9334f, 17.3299f, 8.6024f, 17.3299f, 9.2999f)
                verticalLineTo(14.9999f)
                curveTo(17.3299f, 15.4141f, 17.6657f, 15.7499f, 18.0799f, 15.7499f)
                curveTo(18.4941f, 15.7499f, 18.8299f, 15.4141f, 18.8299f, 14.9999f)
                verticalLineTo(9.29988f)
                curveTo(18.8299f, 8.2045f, 18.3948f, 7.1541f, 17.6202f, 6.3795f)
                curveTo(16.8457f, 5.605f, 15.7952f, 5.1699f, 14.6999f, 5.1699f)
                horizontalLineTo(6.69988f)
                verticalLineTo(2.87988f)
                curveTo(6.6999f, 2.4657f, 6.3641f, 2.1299f, 5.9499f, 2.1299f)
                curveTo(5.5357f, 2.1299f, 5.1999f, 2.4657f, 5.1999f, 2.8799f)
                verticalLineTo(5.16988f)
                horizontalLineTo(2.87988f)
                curveTo(2.4657f, 5.1699f, 2.1299f, 5.5057f, 2.1299f, 5.9199f)
                curveTo(2.1299f, 6.3341f, 2.4657f, 6.6699f, 2.8799f, 6.6699f)
                horizontalLineTo(14.6999f)
                close()
            }
            handyPath {
                moveTo(21.1199f, 17.3299f)
                horizontalLineTo(9.29988f)
                curveTo(8.6024f, 17.3299f, 7.9334f, 17.0528f, 7.4402f, 16.5596f)
                curveTo(6.947f, 16.0664f, 6.6699f, 15.3974f, 6.6699f, 14.6999f)
                verticalLineTo(8.99988f)
                curveTo(6.6699f, 8.5857f, 6.3341f, 8.2499f, 5.9199f, 8.2499f)
                curveTo(5.5057f, 8.2499f, 5.1699f, 8.5857f, 5.1699f, 8.9999f)
                verticalLineTo(14.6999f)
                curveTo(5.1699f, 16.9808f, 7.019f, 18.8299f, 9.2999f, 18.8299f)
                horizontalLineTo(17.2999f)
                verticalLineTo(21.1199f)
                curveTo(17.2999f, 21.5341f, 17.6357f, 21.8699f, 18.0499f, 21.8699f)
                curveTo(18.4641f, 21.8699f, 18.7999f, 21.5341f, 18.7999f, 21.1199f)
                verticalLineTo(18.8299f)
                horizontalLineTo(21.0899f)
                curveTo(21.5041f, 18.8299f, 21.8399f, 18.4941f, 21.8399f, 18.0799f)
                curveTo(21.8399f, 17.6657f, 21.5041f, 17.3299f, 21.0899f, 17.3299f)
                horizontalLineTo(21.1199f)
                close()
            }
        }
        return _crop!!
    }

