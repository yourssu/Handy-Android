package com.yourssu.handy.compose.component.icons.line

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _arrowsChevronUp: ImageVector? = null

public val HandyIcons.Line.ArrowsChevronUp: ImageVector
    get() {
        if (_arrowsChevronUp != null) {
            return _arrowsChevronUp!!
        }
        _arrowsChevronUp = handyIcon {
            handyPath {
                moveTo(19.9998f, 16.75f)
                curveTo(19.8008f, 16.751f, 19.6097f, 16.6716f, 19.4698f, 16.53f)
                lineTo(11.9998f, 9.06001f)
                lineTo(4.52985f, 16.53f)
                curveTo(4.2343f, 16.8054f, 3.7738f, 16.7972f, 3.4882f, 16.5116f)
                curveTo(3.2026f, 16.226f, 3.1945f, 15.7655f, 3.4699f, 15.47f)
                lineTo(11.4698f, 7.47001f)
                curveTo(11.7627f, 7.1776f, 12.237f, 7.1776f, 12.5298f, 7.47f)
                lineTo(20.5298f, 15.47f)
                curveTo(20.8223f, 15.7628f, 20.8223f, 16.2372f, 20.5298f, 16.53f)
                curveTo(20.39f, 16.6716f, 20.1989f, 16.751f, 19.9998f, 16.75f)
                close()
            }
        }
        return _arrowsChevronUp!!
    }
