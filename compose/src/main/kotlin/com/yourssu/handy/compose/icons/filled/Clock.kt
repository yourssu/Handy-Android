package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _clock: ImageVector? = null

public val HandyIcons.Filled.Clock: ImageVector
    get() {
        if (_clock != null) {
            return _clock!!
        }
        _clock = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(10f, 2f)
                horizontalLineTo(14.24f)
                curveTo(16.3617f, 2f, 18.3966f, 2.8428f, 19.8969f, 4.3431f)
                curveTo(21.3971f, 5.8434f, 22.24f, 7.8783f, 22.24f, 10f)
                verticalLineTo(14.24f)
                curveTo(22.24f, 18.6583f, 18.6583f, 22.24f, 14.24f, 22.24f)
                horizontalLineTo(10f)
                curveTo(5.5817f, 22.24f, 2f, 18.6583f, 2f, 14.24f)
                verticalLineTo(10f)
                curveTo(2f, 5.5817f, 5.5817f, 2f, 10f, 2f)
                close()
                moveTo(12.12f, 18.12f)
                curveTo(12.6723f, 18.12f, 13.12f, 17.6723f, 13.12f, 17.12f)
                verticalLineTo(12.12f)
                curveTo(13.1215f, 11.8542f, 13.0172f, 11.5987f, 12.83f, 11.41f)
                lineTo(8.83f, 7.41f)
                curveTo(8.5763f, 7.1563f, 8.2066f, 7.0573f, 7.8601f, 7.1501f)
                curveTo(7.5136f, 7.243f, 7.243f, 7.5136f, 7.1501f, 7.8601f)
                curveTo(7.0573f, 8.2066f, 7.1563f, 8.5763f, 7.41f, 8.83f)
                lineTo(11.12f, 12.53f)
                verticalLineTo(17.12f)
                curveTo(11.12f, 17.6723f, 11.5677f, 18.12f, 12.12f, 18.12f)
                close()
            }
        }
        return _clock!!
    }
