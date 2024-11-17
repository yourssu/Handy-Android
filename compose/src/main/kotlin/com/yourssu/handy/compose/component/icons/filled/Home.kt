package com.yourssu.handy.compose.component.icons.filled

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import com.yourssu.handy.compose.icons.handyPath
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyIcon

private var _home: ImageVector? = null

public val HandyIcons.Filled.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = handyIcon {
            handyPath(pathFillType = PathFillType.EvenOdd) {
                moveTo(14.4537f, 3.8032f)
                lineTo(19.4558f, 7.49793f)
                curveTo(20.4198f, 8.1956f, 20.9934f, 9.3111f, 21f, 10.5011f)
                verticalLineTo(17.1895f)
                curveTo(20.938f, 19.3342f, 19.1566f, 21.0268f, 17.0116f, 20.979f)
                horizontalLineTo(6.99789f)
                curveTo(4.8492f, 21.032f, 3.0619f, 19.338f, 3f, 17.1895f)
                verticalLineTo(10.5011f)
                curveTo(3.0066f, 9.3111f, 3.5802f, 8.1956f, 4.5442f, 7.4979f)
                lineTo(9.54632f, 3.8032f)
                curveTo(11.0068f, 2.7323f, 12.9932f, 2.7323f, 14.4537f, 3.8032f)
                close()
                moveTo(7.73684f, 16.9716f)
                horizontalLineTo(16.2632f)
                curveTo(16.6556f, 16.9716f, 16.9737f, 16.6535f, 16.9737f, 16.2611f)
                curveTo(16.9737f, 15.8687f, 16.6556f, 15.5506f, 16.2632f, 15.5506f)
                horizontalLineTo(7.73684f)
                curveTo(7.3444f, 15.5506f, 7.0263f, 15.8687f, 7.0263f, 16.2611f)
                curveTo(7.0263f, 16.6535f, 7.3444f, 16.9716f, 7.7368f, 16.9716f)
                close()
            }
        }
        return _home!!
    }

