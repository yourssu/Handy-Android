package com.yourssu.handy.compose.component.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath


private var _arrowsChevronDown: ImageVector? = null

public val HandyIcons.Filled.ArrowsChevronDown: ImageVector
    get() {
        if (_arrowsChevronDown != null) {
            return _arrowsChevronDown!!
        }
        _arrowsChevronDown = handyIcon {
            handyPath {
                moveTo(20.4208f, 6f)
                curveTo(20.0166f, 6f, 19.6124f, 6.1537f, 19.304f, 6.4621f)
                lineTo(11.9998f, 13.7674f)
                lineTo(4.69553f, 6.46211f)
                curveTo(4.0787f, 5.8463f, 3.0787f, 5.8463f, 2.4618f, 6.4621f)
                curveTo(1.846f, 7.0789f, 1.846f, 8.079f, 2.4618f, 8.6958f)
                lineTo(10.8829f, 17.1169f)
                curveTo(11.4997f, 17.7326f, 12.4998f, 17.7326f, 13.1166f, 17.1169f)
                lineTo(21.5377f, 8.69579f)
                curveTo(22.1534f, 8.079f, 22.1534f, 7.0789f, 21.5377f, 6.4621f)
                curveTo(21.2292f, 6.1537f, 20.825f, 6f, 20.4208f, 6f)
                close()
            }
        }
        return _arrowsChevronDown!!
    }

