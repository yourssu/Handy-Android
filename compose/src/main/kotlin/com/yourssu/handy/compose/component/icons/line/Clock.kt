package com.yourssu.handy.compose.component.icons.line

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _clock: ImageVector? = null

public val HandyIcons.Line.Clock: ImageVector
    get() {
        if (_clock != null) {
            return _clock!!
        }
        _clock = handyIcon {
            handyPath {
                moveTo(8.65f, 7.59f)
                curveTo(8.3545f, 7.3146f, 7.894f, 7.3228f, 7.6084f, 7.6084f)
                curveTo(7.3228f, 7.894f, 7.3146f, 8.3545f, 7.59f, 8.65f)
                lineTo(11.37f, 12.43f)
                verticalLineTo(17.12f)
                curveTo(11.37f, 17.5342f, 11.7058f, 17.87f, 12.12f, 17.87f)
                curveTo(12.5342f, 17.87f, 12.87f, 17.5342f, 12.87f, 17.12f)
                verticalLineTo(12.12f)
                curveTo(12.8698f, 11.9212f, 12.7907f, 11.7305f, 12.65f, 11.59f)
                lineTo(8.65f, 7.59f)
                close()
            }
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
                moveTo(14.24f, 20.74f)
                curveTo(17.8276f, 20.7345f, 20.7345f, 17.8276f, 20.74f, 14.24f)
                verticalLineTo(10f)
                curveTo(20.7345f, 6.4124f, 17.8276f, 3.5055f, 14.24f, 3.5f)
                horizontalLineTo(10f)
                curveTo(6.4124f, 3.5055f, 3.5055f, 6.4124f, 3.5f, 10f)
                verticalLineTo(14.24f)
                curveTo(3.5055f, 17.8276f, 6.4124f, 20.7345f, 10f, 20.74f)
                horizontalLineTo(14.24f)
                close()
            }
        }
        return _clock!!
    }
