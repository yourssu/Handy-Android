package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _eye: ImageVector? = null

public val HandyIcons.Filled.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = handyIcon(name = "Filled.Eye") {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(17.0276f, 7.64929f)
                lineTo(21.2076f, 10.9893f)
                curveTo(21.4779f, 11.2056f, 21.6352f, 11.5331f, 21.6352f, 11.8793f)
                curveTo(21.6352f, 12.2255f, 21.4779f, 12.5529f, 21.2076f, 12.7693f)
                lineTo(17.0276f, 16.1093f)
                curveTo(14.2726f, 18.3083f, 10.3626f, 18.3083f, 7.6076f, 16.1093f)
                lineTo(3.42761f, 12.7693f)
                curveTo(3.1573f, 12.5529f, 3f, 12.2255f, 3f, 11.8793f)
                curveTo(3f, 11.5331f, 3.1573f, 11.2056f, 3.4276f, 10.9893f)
                lineTo(7.60761f, 7.64929f)
                curveTo(10.3626f, 5.4502f, 14.2726f, 5.4502f, 17.0276f, 7.6493f)
                close()
                moveTo(10.0176f, 11.8793f)
                curveTo(10.0176f, 13.1495f, 11.0474f, 14.1793f, 12.3176f, 14.1793f)
                curveTo(13.5879f, 14.1793f, 14.6176f, 13.1495f, 14.6176f, 11.8793f)
                curveTo(14.6176f, 10.609f, 13.5879f, 9.5793f, 12.3176f, 9.5793f)
                curveTo(11.0474f, 9.5793f, 10.0176f, 10.609f, 10.0176f, 11.8793f)
                close()
            }
        }
        return _eye!!
    }

