package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _checkCircleSelected: ImageVector? = null

public val HandyIcons.Filled.CheckCircleSelected: ImageVector
    get() {
        if (_checkCircleSelected != null) {
            return _checkCircleSelected!!
        }
        _checkCircleSelected = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, false, true, 24f, 12f)
                arcTo(12f, 12f, 0f, false, true, 12f, 24f)
                arcTo(12f, 12f, 0f, false, true, 0f, 12f)
                arcTo(12f, 12f, 0f, false, true, 12f, 0f)
                close()
                moveTo(9.964f, 16.156f)
                curveTo(9.733f, 16.156f, 9.509f, 16.076f, 9.331f, 15.93f)
                lineTo(6.344f, 13.483f)
                curveTo(5.936f, 13.128f, 5.884f, 12.513f, 6.226f, 12.095f)
                curveTo(6.569f, 11.676f, 7.183f, 11.606f, 7.611f, 11.936f)
                lineTo(9.924f, 13.83f)
                lineTo(16.591f, 7.69f)
                curveTo(16.841f, 7.392f, 17.242f, 7.266f, 17.618f, 7.368f)
                curveTo(17.994f, 7.47f, 18.276f, 7.781f, 18.342f, 8.165f)
                curveTo(18.408f, 8.548f, 18.245f, 8.935f, 17.924f, 9.156f)
                lineTo(10.644f, 15.89f)
                curveTo(10.46f, 16.062f, 10.217f, 16.158f, 9.964f, 16.156f)
                close()
            }
        }
        return _checkCircleSelected!!
    }
