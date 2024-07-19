package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


private var _Bookfilled: ImageVector? = null

public val Bookfilled: ImageVector
    get() {
        if (_Bookfilled != null) {
            return _Bookfilled!!
        }
        _Bookfilled = ImageVector.Builder(
            name = "Bookfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(20.26f, 14.83f)
                verticalLineTo(6.75f)
                curveTo(20.26f, 4.6789f, 18.5811f, 3f, 16.51f, 3f)
                horizontalLineTo(7.75f)
                curveTo(5.6789f, 3f, 4f, 4.6789f, 4f, 6.75f)
                verticalLineTo(17.29f)
                curveTo(4f, 19.0628f, 5.4372f, 20.5f, 7.21f, 20.5f)
                horizontalLineTo(19.51f)
                curveTo(19.9242f, 20.5f, 20.26f, 20.1642f, 20.26f, 19.75f)
                curveTo(20.26f, 19.3358f, 19.9242f, 19f, 19.51f, 19f)
                horizontalLineTo(7.21f)
                curveTo(6.2656f, 19f, 5.5f, 18.2344f, 5.5f, 17.29f)
                curveTo(5.5f, 16.3456f, 6.2656f, 15.58f, 7.21f, 15.58f)
                horizontalLineTo(19.51f)
                curveTo(19.9242f, 15.58f, 20.26f, 15.2442f, 20.26f, 14.83f)
                close()
            }
            handyPath {
                moveTo(7.21f, 16.54f)
                curveTo(6.7958f, 16.54f, 6.46f, 16.8758f, 6.46f, 17.29f)
                curveTo(6.46f, 17.7042f, 6.7958f, 18.04f, 7.21f, 18.04f)
                horizontalLineTo(18.28f)
                curveTo(18.6942f, 18.04f, 19.03f, 17.7042f, 19.03f, 17.29f)
                curveTo(19.03f, 16.8758f, 18.6942f, 16.54f, 18.28f, 16.54f)
                horizontalLineTo(7.21f)
                close()
            }
        }.build()
        return _Bookfilled!!
    }

