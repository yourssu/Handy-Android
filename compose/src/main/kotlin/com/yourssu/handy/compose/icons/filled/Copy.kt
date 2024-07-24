package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon
import com.yourssu.handy.compose.icons.handyPath

private var _copy: ImageVector? = null

public val HandyIcons.Filled.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = handyIcon(name = "Filled.Copy") {
            handyPath {
                moveTo(2f, 6f)
                curveTo(2f, 3.7909f, 3.7909f, 2f, 6f, 2f)
                horizontalLineTo(14f)
                curveTo(16.2091f, 2f, 18f, 3.7909f, 18f, 6f)
                verticalLineTo(14f)
                curveTo(18f, 16.2091f, 16.2091f, 18f, 14f, 18f)
                horizontalLineTo(6f)
                curveTo(3.7909f, 18f, 2f, 16.2091f, 2f, 14f)
                verticalLineTo(6f)
                close()
            }
            handyPath {
                moveTo(17f, 21.75f)
                horizontalLineTo(9f)
                curveTo(8.5842f, 21.7445f, 8.25f, 21.4059f, 8.25f, 20.99f)
                curveTo(8.2555f, 20.5797f, 8.5897f, 20.25f, 9f, 20.25f)
                horizontalLineTo(17f)
                curveTo(17.8637f, 20.25f, 18.6919f, 19.9062f, 19.3016f, 19.2946f)
                curveTo(19.9114f, 18.6829f, 20.2527f, 17.8537f, 20.25f, 16.99f)
                verticalLineTo(8.99f)
                curveTo(20.25f, 8.5758f, 20.5858f, 8.24f, 21f, 8.24f)
                curveTo(21.4142f, 8.24f, 21.75f, 8.5758f, 21.75f, 8.99f)
                verticalLineTo(16.99f)
                curveTo(21.75f, 19.615f, 19.625f, 21.7445f, 17f, 21.75f)
                close()
            }
        }
        return _copy!!
    }

