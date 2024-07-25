package com.yourssu.handy.compose.icons.line

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _trash: ImageVector? = null

public val HandyIcons.Line.Trash: ImageVector
    get() {
        if (_trash != null) {
            return _trash!!
        }
        _trash = handyIcon {
            handyPath {
                moveTo(18.79f, 7f)
                curveTo(18.3537f, 7f, 18f, 7.3537f, 18f, 7.79f)
                verticalLineTo(16.63f)
                curveTo(18f, 18.4912f, 16.4912f, 20f, 14.63f, 20f)
                horizontalLineTo(8.95f)
                curveTo(7.0888f, 20f, 5.58f, 18.4912f, 5.58f, 16.63f)
                verticalLineTo(7.79f)
                curveTo(5.58f, 7.3537f, 5.2263f, 7f, 4.79f, 7f)
                curveTo(4.3537f, 7f, 4f, 7.3537f, 4f, 7.79f)
                verticalLineTo(16.63f)
                curveTo(4.0274f, 19.3719f, 6.258f, 21.5801f, 9f, 21.58f)
                horizontalLineTo(14.68f)
                curveTo(17.4025f, 21.5529f, 19.6029f, 19.3525f, 19.63f, 16.63f)
                verticalLineTo(7.79f)
                curveTo(19.6304f, 7.5715f, 19.5404f, 7.3626f, 19.3812f, 7.2129f)
                curveTo(19.2221f, 7.0633f, 19.008f, 6.9862f, 18.79f, 7f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(18.79f, 5.58f)
                horizontalLineTo(4.79f)
                curveTo(4.3537f, 5.58f, 4f, 5.2263f, 4f, 4.79f)
                curveTo(4f, 4.3537f, 4.3537f, 4f, 4.79f, 4f)
                horizontalLineTo(7.44f)
                lineTo(8.62f, 2.72f)
                curveTo(9.0711f, 2.2614f, 9.6867f, 2.0022f, 10.33f, 2f)
                horizontalLineTo(13.25f)
                curveTo(13.8839f, 2f, 14.4918f, 2.2518f, 14.94f, 2.7f)
                lineTo(16.14f, 4f)
                horizontalLineTo(18.79f)
                curveTo(19.2263f, 4f, 19.58f, 4.3537f, 19.58f, 4.79f)
                curveTo(19.58f, 5.2263f, 19.2263f, 5.58f, 18.79f, 5.58f)
                close()
                moveTo(13.25f, 3.58f)
                horizontalLineTo(10.33f)
                curveTo(10.1301f, 3.5801f, 9.9374f, 3.655f, 9.79f, 3.79f)
                lineTo(9.6f, 3.99f)
                horizontalLineTo(13.98f)
                lineTo(13.79f, 3.79f)
                curveTo(13.6436f, 3.6533f, 13.4503f, 3.5781f, 13.25f, 3.58f)
                close()
            }
            handyPath {
                moveTo(8.04f, 8.79f)
                verticalLineTo(11.79f)
                curveTo(8.04f, 12.2042f, 8.3758f, 12.54f, 8.79f, 12.54f)
                curveTo(9.2042f, 12.54f, 9.54f, 12.2042f, 9.54f, 11.79f)
                verticalLineTo(8.79f)
                curveTo(9.54f, 8.3758f, 9.2042f, 8.04f, 8.79f, 8.04f)
                curveTo(8.3758f, 8.04f, 8.04f, 8.3758f, 8.04f, 8.79f)
                close()
            }
            handyPath {
                moveTo(11.04f, 8.79f)
                verticalLineTo(16.79f)
                curveTo(11.04f, 17.2042f, 11.3758f, 17.54f, 11.79f, 17.54f)
                curveTo(12.2042f, 17.54f, 12.54f, 17.2042f, 12.54f, 16.79f)
                verticalLineTo(8.79f)
                curveTo(12.54f, 8.3758f, 12.2042f, 8.04f, 11.79f, 8.04f)
                curveTo(11.3758f, 8.04f, 11.04f, 8.3758f, 11.04f, 8.79f)
                close()
            }
            handyPath {
                moveTo(14.04f, 8.79f)
                verticalLineTo(11.79f)
                curveTo(14.04f, 12.2042f, 14.3758f, 12.54f, 14.79f, 12.54f)
                curveTo(15.2042f, 12.54f, 15.54f, 12.2042f, 15.54f, 11.79f)
                verticalLineTo(8.79f)
                curveTo(15.54f, 8.3758f, 15.2042f, 8.04f, 14.79f, 8.04f)
                curveTo(14.3758f, 8.04f, 14.04f, 8.3758f, 14.04f, 8.79f)
                close()
            }
        }
        return _trash!!
    }

