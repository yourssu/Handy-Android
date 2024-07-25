package com.yourssu.handy.compose.icons.line

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _filter: ImageVector? = null

public val HandyIcons.Line.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(4.96134f, 2.00065f)
                horizontalLineTo(19.1413f)
                verticalLineTo(2.01065f)
                curveTo(20.3363f, 1.9899f, 21.4217f, 2.7043f, 21.875f, 3.8101f)
                curveTo(22.3284f, 4.9159f, 22.057f, 6.1866f, 21.1913f, 7.0107f)
                lineTo(16.4213f, 11.7807f)
                curveTo(15.8904f, 12.3125f, 15.5858f, 13.0292f, 15.5713f, 13.7807f)
                verticalLineTo(18.1807f)
                curveTo(15.5698f, 19.0931f, 15.1403f, 19.9519f, 14.4113f, 20.5007f)
                lineTo(13.1713f, 21.4307f)
                curveTo(12.2944f, 22.0979f, 11.1144f, 22.2085f, 10.1288f, 21.7157f)
                curveTo(9.1433f, 21.2229f, 8.5237f, 20.2125f, 8.5313f, 19.1107f)
                verticalLineTo(13.7807f)
                curveTo(8.5169f, 13.0292f, 8.2123f, 12.3125f, 7.6813f, 11.7807f)
                lineTo(2.91134f, 7.01065f)
                curveTo(2.0381f, 6.1878f, 1.7617f, 4.9122f, 2.2161f, 3.8018f)
                curveTo(2.6705f, 2.6913f, 3.7618f, 1.9753f, 4.9613f, 2.0006f)
                close()
                moveTo(20.4413f, 4.37065f)
                curveTo(20.2255f, 3.843f, 19.7114f, 3.4989f, 19.1413f, 3.5006f)
                horizontalLineTo(4.96134f)
                curveTo(4.3913f, 3.4989f, 3.8771f, 3.843f, 3.6613f, 4.3707f)
                curveTo(3.4386f, 4.8957f, 3.5618f, 5.5037f, 3.9713f, 5.9006f)
                lineTo(8.76134f, 10.6707f)
                curveTo(9.5904f, 11.4928f, 10.0551f, 12.6131f, 10.0513f, 13.7807f)
                verticalLineTo(19.1107f)
                curveTo(10.046f, 19.4793f, 10.1873f, 19.835f, 10.4443f, 20.0994f)
                curveTo(10.7012f, 20.3639f, 11.0527f, 20.5154f, 11.4213f, 20.5207f)
                curveTo(11.7226f, 20.5193f, 12.0148f, 20.4172f, 12.2513f, 20.2307f)
                lineTo(13.4913f, 19.3007f)
                curveTo(13.8439f, 19.0363f, 14.0513f, 18.6213f, 14.0513f, 18.1807f)
                verticalLineTo(13.7807f)
                curveTo(14.0529f, 12.6102f, 14.5249f, 11.4895f, 15.3613f, 10.6707f)
                lineTo(20.1313f, 5.90065f)
                curveTo(20.5409f, 5.5037f, 20.6641f, 4.8957f, 20.4413f, 4.3707f)
                close()
            }
        }
        return _filter!!
    }

