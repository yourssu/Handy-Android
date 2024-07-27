package com.yourssu.handy.compose.icons.line

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _menu: ImageVector? = null

public val HandyIcons.Line.Menu: ImageVector
    get() {
        if (_menu != null) {
            return _menu!!
        }
        _menu = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(4f, 7.5f)
                curveTo(4f, 5.567f, 5.567f, 4f, 7.5f, 4f)
                curveTo(9.433f, 4f, 11f, 5.567f, 11f, 7.5f)
                curveTo(11f, 9.433f, 9.433f, 11f, 7.5f, 11f)
                curveTo(5.567f, 11f, 4f, 9.433f, 4f, 7.5f)
                close()
                moveTo(9.5f, 7.5f)
                curveTo(9.5f, 6.3954f, 8.6046f, 5.5f, 7.5f, 5.5f)
                curveTo(6.3954f, 5.5f, 5.5f, 6.3954f, 5.5f, 7.5f)
                curveTo(5.5f, 8.6046f, 6.3954f, 9.5f, 7.5f, 9.5f)
                curveTo(8.6046f, 9.5f, 9.5f, 8.6046f, 9.5f, 7.5f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(14f, 7.5f)
                curveTo(14f, 5.567f, 15.567f, 4f, 17.5f, 4f)
                curveTo(19.433f, 4f, 21f, 5.567f, 21f, 7.5f)
                curveTo(21f, 9.433f, 19.433f, 11f, 17.5f, 11f)
                curveTo(15.567f, 11f, 14f, 9.433f, 14f, 7.5f)
                close()
                moveTo(19.5f, 7.5f)
                curveTo(19.5f, 6.3954f, 18.6046f, 5.5f, 17.5f, 5.5f)
                curveTo(16.3954f, 5.5f, 15.5f, 6.3954f, 15.5f, 7.5f)
                curveTo(15.5f, 8.6046f, 16.3954f, 9.5f, 17.5f, 9.5f)
                curveTo(18.6046f, 9.5f, 19.5f, 8.6046f, 19.5f, 7.5f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(4f, 17.5f)
                curveTo(4f, 15.567f, 5.567f, 14f, 7.5f, 14f)
                curveTo(9.433f, 14f, 11f, 15.567f, 11f, 17.5f)
                curveTo(11f, 19.433f, 9.433f, 21f, 7.5f, 21f)
                curveTo(5.567f, 21f, 4f, 19.433f, 4f, 17.5f)
                close()
                moveTo(9.5f, 17.5f)
                curveTo(9.5f, 16.3954f, 8.6046f, 15.5f, 7.5f, 15.5f)
                curveTo(6.3954f, 15.5f, 5.5f, 16.3954f, 5.5f, 17.5f)
                curveTo(5.5f, 18.6046f, 6.3954f, 19.5f, 7.5f, 19.5f)
                curveTo(8.6046f, 19.5f, 9.5f, 18.6046f, 9.5f, 17.5f)
                close()
            }
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(14f, 17.5f)
                curveTo(14f, 15.567f, 15.567f, 14f, 17.5f, 14f)
                curveTo(19.433f, 14f, 21f, 15.567f, 21f, 17.5f)
                curveTo(21f, 19.433f, 19.433f, 21f, 17.5f, 21f)
                curveTo(15.567f, 21f, 14f, 19.433f, 14f, 17.5f)
                close()
                moveTo(19.5f, 17.5f)
                curveTo(19.5f, 16.3954f, 18.6046f, 15.5f, 17.5f, 15.5f)
                curveTo(16.3954f, 15.5f, 15.5f, 16.3954f, 15.5f, 17.5f)
                curveTo(15.5f, 18.6046f, 16.3954f, 19.5f, 17.5f, 19.5f)
                curveTo(18.6046f, 19.5f, 19.5f, 18.6046f, 19.5f, 17.5f)
                close()
            }
        }
        return _menu!!
    }

