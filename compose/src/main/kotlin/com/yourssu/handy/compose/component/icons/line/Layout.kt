package com.yourssu.handy.compose.component.icons.line

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _layout: ImageVector? = null

public val HandyIcons.Line.Layout: ImageVector
    get() {
        if (_layout != null) {
            return _layout!!
        }
        _layout = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(5.25002f, 3f)
                horizontalLineTo(8.34002f)
                curveTo(8.9385f, 3f, 9.5123f, 3.2384f, 9.9346f, 3.6625f)
                curveTo(10.3568f, 4.0867f, 10.5927f, 4.6615f, 10.59f, 5.26f)
                verticalLineTo(8.34f)
                curveTo(10.59f, 9.5826f, 9.5827f, 10.59f, 8.34f, 10.59f)
                horizontalLineTo(5.25002f)
                curveTo(4.0074f, 10.59f, 3f, 9.5826f, 3f, 8.34f)
                verticalLineTo(5.26f)
                curveTo(2.9974f, 4.6615f, 3.2332f, 4.0867f, 3.6555f, 3.6625f)
                curveTo(4.0777f, 3.2384f, 4.6516f, 3f, 5.25f, 3f)
                close()
                moveTo(8.34002f, 9.08f)
                curveTo(8.752f, 9.0746f, 9.0846f, 8.742f, 9.09f, 8.33f)
                verticalLineTo(5.26f)
                curveTo(9.09f, 4.8458f, 8.7542f, 4.51f, 8.34f, 4.51f)
                horizontalLineTo(5.25002f)
                curveTo(4.8358f, 4.51f, 4.5f, 4.8458f, 4.5f, 5.26f)
                verticalLineTo(8.33f)
                curveTo(4.5054f, 8.742f, 4.8381f, 9.0746f, 5.25f, 9.08f)
                horizontalLineTo(8.34002f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(15.66f, 3f)
                horizontalLineTo(18.75f)
                curveTo(19.3485f, 3f, 19.9223f, 3.2384f, 20.3446f, 3.6625f)
                curveTo(20.7668f, 4.0867f, 21.0027f, 4.6615f, 21f, 5.26f)
                verticalLineTo(8.34f)
                curveTo(21f, 9.5826f, 19.9927f, 10.59f, 18.75f, 10.59f)
                horizontalLineTo(15.66f)
                curveTo(14.4174f, 10.59f, 13.41f, 9.5826f, 13.41f, 8.34f)
                verticalLineTo(5.25f)
                curveTo(13.41f, 4.0074f, 14.4174f, 3f, 15.66f, 3f)
                close()
                moveTo(18.75f, 9.08f)
                curveTo(19.162f, 9.0746f, 19.4947f, 8.742f, 19.5f, 8.33f)
                verticalLineTo(5.26f)
                curveTo(19.5f, 4.8458f, 19.1643f, 4.51f, 18.75f, 4.51f)
                horizontalLineTo(15.66f)
                curveTo(15.2458f, 4.51f, 14.91f, 4.8458f, 14.91f, 5.26f)
                verticalLineTo(8.33f)
                curveTo(14.9154f, 8.742f, 15.2481f, 9.0746f, 15.66f, 9.08f)
                horizontalLineTo(18.75f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(5.25002f, 13.41f)
                horizontalLineTo(8.34002f)
                curveTo(9.5827f, 13.41f, 10.59f, 14.4174f, 10.59f, 15.66f)
                verticalLineTo(18.75f)
                curveTo(10.59f, 19.9926f, 9.5827f, 21f, 8.34f, 21f)
                horizontalLineTo(5.25002f)
                curveTo(4.6516f, 21f, 4.0777f, 20.7616f, 3.6555f, 20.3375f)
                curveTo(3.2332f, 19.9133f, 2.9974f, 19.3385f, 3f, 18.74f)
                verticalLineTo(15.66f)
                curveTo(3f, 14.4174f, 4.0074f, 13.41f, 5.25f, 13.41f)
                close()
                moveTo(8.34002f, 19.49f)
                curveTo(8.7542f, 19.49f, 9.09f, 19.1542f, 9.09f, 18.74f)
                verticalLineTo(15.66f)
                curveTo(9.0846f, 15.248f, 8.752f, 14.9154f, 8.34f, 14.91f)
                horizontalLineTo(5.25002f)
                curveTo(4.8381f, 14.9154f, 4.5054f, 15.248f, 4.5f, 15.66f)
                verticalLineTo(18.74f)
                curveTo(4.5f, 19.1542f, 4.8358f, 19.49f, 5.25f, 19.49f)
                horizontalLineTo(8.34002f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(15.66f, 13.41f)
                horizontalLineTo(18.75f)
                curveTo(19.9927f, 13.41f, 21f, 14.4174f, 21f, 15.66f)
                verticalLineTo(18.74f)
                curveTo(21.0027f, 19.3385f, 20.7668f, 19.9133f, 20.3446f, 20.3375f)
                curveTo(19.9223f, 20.7616f, 19.3485f, 21f, 18.75f, 21f)
                horizontalLineTo(15.66f)
                curveTo(15.0615f, 21f, 14.4877f, 20.7616f, 14.0655f, 20.3375f)
                curveTo(13.6432f, 19.9133f, 13.4074f, 19.3385f, 13.41f, 18.74f)
                verticalLineTo(15.66f)
                curveTo(13.41f, 14.4174f, 14.4174f, 13.41f, 15.66f, 13.41f)
                close()
                moveTo(18.75f, 19.49f)
                curveTo(19.1642f, 19.49f, 19.5f, 19.1542f, 19.5f, 18.74f)
                verticalLineTo(15.66f)
                curveTo(19.4946f, 15.248f, 19.162f, 14.9154f, 18.75f, 14.91f)
                horizontalLineTo(15.66f)
                curveTo(15.2481f, 14.9154f, 14.9154f, 15.248f, 14.91f, 15.66f)
                verticalLineTo(18.74f)
                curveTo(14.91f, 19.1542f, 15.2458f, 19.49f, 15.66f, 19.49f)
                horizontalLineTo(18.75f)
                close()
            }
        }
        return _layout!!
    }

