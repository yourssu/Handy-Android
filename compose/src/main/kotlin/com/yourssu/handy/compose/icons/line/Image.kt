package com.yourssu.handy.compose.icons.line

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _image: ImageVector? = null

public val HandyIcons.Line.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = handyIcon {
            handyPath {
                moveTo(8.12f, 10.08f)
                curveTo(9.2246f, 10.08f, 10.12f, 9.1846f, 10.12f, 8.08f)
                curveTo(10.12f, 6.9754f, 9.2246f, 6.08f, 8.12f, 6.08f)
                curveTo(7.0154f, 6.08f, 6.12f, 6.9754f, 6.12f, 8.08f)
                curveTo(6.12f, 9.1846f, 7.0154f, 10.08f, 8.12f, 10.08f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(14.24f, 2f)
                horizontalLineTo(10f)
                curveTo(5.5817f, 2f, 2f, 5.5817f, 2f, 10f)
                verticalLineTo(14.24f)
                curveTo(2f, 18.6583f, 5.5817f, 22.24f, 10f, 22.24f)
                horizontalLineTo(14.24f)
                curveTo(18.6583f, 22.24f, 22.24f, 18.6583f, 22.24f, 14.24f)
                verticalLineTo(10f)
                curveTo(22.24f, 7.8783f, 21.3971f, 5.8434f, 19.8969f, 4.3431f)
                curveTo(18.3966f, 2.8428f, 16.3617f, 2f, 14.24f, 2f)
                close()
                moveTo(10f, 3.5f)
                horizontalLineTo(14.24f)
                curveTo(17.4859f, 3.5051f, 20.2306f, 5.904f, 20.67f, 9.12f)
                horizontalLineTo(19.12f)
                curveTo(14.9468f, 9.1234f, 11.0879f, 11.3382f, 8.98f, 14.94f)
                curveTo(7.6636f, 13.8943f, 6.0312f, 13.3267f, 4.35f, 13.33f)
                horizontalLineTo(3.5f)
                verticalLineTo(10f)
                curveTo(3.5055f, 6.4124f, 6.4124f, 3.5055f, 10f, 3.5f)
                close()
                moveTo(4.35f, 14.83f)
                horizontalLineTo(3.53f)
                curveTo(3.7472f, 17.1883f, 5.2299f, 19.2418f, 7.4f, 20.19f)
                curveTo(7.4717f, 18.8552f, 7.7727f, 17.5426f, 8.29f, 16.31f)
                curveTo(7.1985f, 15.3571f, 5.7989f, 14.8314f, 4.35f, 14.83f)
                close()
                moveTo(14.24f, 20.74f)
                horizontalLineTo(10f)
                curveTo(9.624f, 20.7385f, 9.2491f, 20.7017f, 8.88f, 20.63f)
                curveTo(9.0049f, 15.0613f, 13.55f, 10.6095f, 19.12f, 10.6f)
                horizontalLineTo(20.74f)
                verticalLineTo(14.24f)
                curveTo(20.7345f, 17.8276f, 17.8276f, 20.7345f, 14.24f, 20.74f)
                close()
            }
        }
        return _image!!
    }

