package com.yourssu.handy.compose.component.icons.filled

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.handyPath
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon

private var _tag: ImageVector? = null

public val HandyIcons.Filled.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(12.5293f, 2.52932f)
                lineTo(20.9793f, 10.9793f)
                curveTo(21.773f, 11.9862f, 21.6175f, 13.4426f, 20.6293f, 14.2593f)
                lineTo(14.2593f, 20.6293f)
                curveTo(13.4426f, 21.6175f, 11.9862f, 21.773f, 10.9793f, 20.9793f)
                lineTo(2.52932f, 12.5293f)
                curveTo(2.1446f, 12.1337f, 1.9543f, 11.5884f, 2.0093f, 11.0393f)
                lineTo(2.44932f, 5.03932f)
                curveTo(2.5892f, 3.671f, 3.671f, 2.5892f, 5.0393f, 2.4493f)
                lineTo(11.0393f, 2.00932f)
                curveTo(11.5884f, 1.9543f, 12.1337f, 2.1446f, 12.5293f, 2.5293f)
                close()
                moveTo(7.67932f, 9.10832f)
                curveTo(8.0573f, 9.1083f, 8.4188f, 8.9533f, 8.6793f, 8.6793f)
                curveTo(8.9533f, 8.4188f, 9.1083f, 8.0573f, 9.1083f, 7.6793f)
                curveTo(9.1083f, 7.3013f, 8.9533f, 6.9398f, 8.6793f, 6.6793f)
                curveTo(8.127f, 6.127f, 7.2316f, 6.127f, 6.6793f, 6.6793f)
                curveTo(6.127f, 7.2316f, 6.127f, 8.127f, 6.6793f, 8.6793f)
                curveTo(6.9398f, 8.9533f, 7.3013f, 9.1083f, 7.6793f, 9.1083f)
                close()
            }
        }
        return _tag!!
    }

