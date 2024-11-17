package com.yourssu.handy.compose.component.icons.filled

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.handyPath
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon

private var _search: ImageVector? = null

public val HandyIcons.Filled.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(19.9382f, 7.66937f)
                curveTo(18.512f, 4.2447f, 15.1704f, 2.0101f, 11.4607f, 2.0002f)
                curveTo(7.4556f, 1.9761f, 3.8931f, 4.5404f, 2.6447f, 8.346f)
                curveTo(1.3962f, 12.1515f, 2.7473f, 16.3278f, 5.9883f, 18.6809f)
                curveTo(9.2293f, 21.034f, 13.6187f, 21.0256f, 16.8507f, 18.6602f)
                lineTo(19.7207f, 21.5302f)
                curveTo(20.0135f, 21.8226f, 20.4878f, 21.8226f, 20.7807f, 21.5302f)
                curveTo(21.0731f, 21.2374f, 21.0731f, 20.763f, 20.7807f, 20.4702f)
                lineTo(17.9907f, 17.6802f)
                curveTo(20.5968f, 15.04f, 21.3644f, 11.094f, 19.9382f, 7.6694f)
                close()
                moveTo(9.13996f, 8.04179f)
                curveTo(8.8959f, 8.6256f, 8.3234f, 9.0042f, 7.6907f, 9.0002f)
                curveTo(6.8346f, 9.0002f, 6.1407f, 8.3062f, 6.1407f, 7.4502f)
                curveTo(6.1366f, 6.8174f, 6.5152f, 6.2449f, 7.099f, 6.0009f)
                curveTo(7.6829f, 5.7568f, 8.3563f, 5.8897f, 8.8037f, 6.3371f)
                curveTo(9.2512f, 6.7846f, 9.384f, 7.458f, 9.14f, 8.0418f)
                close()
            }
        }
        return _search!!
    }

