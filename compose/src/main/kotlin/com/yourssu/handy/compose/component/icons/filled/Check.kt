package com.yourssu.handy.compose.component.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath


private var _check: ImageVector? = null

public val HandyIcons.Filled.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = handyIcon {
            handyPath {
                moveTo(8.94631f, 18.2346f)
                curveTo(8.5999f, 18.2344f, 8.2642f, 18.1142f, 7.9963f, 17.8946f)
                lineTo(3.51631f, 14.2246f)
                curveTo(2.9037f, 13.6924f, 2.8254f, 12.7696f, 3.3395f, 12.1418f)
                curveTo(3.8537f, 11.514f, 4.7738f, 11.4089f, 5.4163f, 11.9046f)
                lineTo(8.88631f, 14.7446f)
                lineTo(18.8863f, 5.53459f)
                curveTo(19.2622f, 5.0877f, 19.8633f, 4.8995f, 20.4269f, 5.0523f)
                curveTo(20.9905f, 5.2052f, 21.4142f, 5.6712f, 21.5128f, 6.2468f)
                curveTo(21.6114f, 6.8224f, 21.3669f, 7.4029f, 20.8863f, 7.7346f)
                lineTo(9.96631f, 17.8346f)
                curveTo(9.69f, 18.0935f, 9.325f, 18.2367f, 8.9463f, 18.2346f)
                close()
            }
        }
        return _check!!
    }
