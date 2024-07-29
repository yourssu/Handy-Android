package com.yourssu.handy.compose.icons.line

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath


private var _arrowsChevronLeft: ImageVector? = null

public val HandyIcons.Line.ArrowsChevronLeft: ImageVector
    get() {
        if (_arrowsChevronLeft != null) {
            return _arrowsChevronLeft!!
        }
        _arrowsChevronLeft = handyIcon {
            handyPath {
                moveTo(16.0003f, 20.75f)
                curveTo(15.8013f, 20.7509f, 15.6102f, 20.6716f, 15.4703f, 20.53f)
                lineTo(7.47032f, 12.53f)
                curveTo(7.1779f, 12.2372f, 7.1779f, 11.7628f, 7.4703f, 11.47f)
                lineTo(15.4703f, 3.47f)
                curveTo(15.7658f, 3.1946f, 16.2263f, 3.2028f, 16.5119f, 3.4884f)
                curveTo(16.7976f, 3.774f, 16.8057f, 4.2345f, 16.5303f, 4.53f)
                lineTo(9.06032f, 12f)
                lineTo(16.5303f, 19.47f)
                curveTo(16.8228f, 19.7628f, 16.8228f, 20.2372f, 16.5303f, 20.53f)
                curveTo(16.3904f, 20.6716f, 16.1994f, 20.7509f, 16.0003f, 20.75f)
                close()
            }
        }
        return _arrowsChevronLeft!!
    }
