package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


private var _Arrowleftupfilled: ImageVector? = null

public val Arrowleftupfilled: ImageVector
    get() {
        if (_Arrowleftupfilled != null) {
            return _Arrowleftupfilled!!
        }
        _Arrowleftupfilled = ImageVector.Builder(
            name = "Arrowleftupfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(16.2498f, 18.38f)
                curveTo(16.5337f, 18.6559f, 16.914f, 18.8102f, 17.3098f, 18.81f)
                curveTo(17.9179f, 18.8136f, 18.468f, 18.4496f, 18.7025f, 17.8885f)
                curveTo(18.937f, 17.3275f, 18.8095f, 16.6803f, 18.3798f, 16.25f)
                lineTo(10.3021f, 8.17993f)
                horizontalLineTo(16.5902f)
                curveTo(17.4187f, 8.1799f, 18.0902f, 7.5084f, 18.0902f, 6.6799f)
                curveTo(18.0902f, 5.8515f, 17.4187f, 5.1799f, 16.5902f, 5.1799f)
                horizontalLineTo(6.93732f)
                curveTo(6.7235f, 5.1385f, 6.4997f, 5.1435f, 6.2812f, 5.1993f)
                curveTo(5.7498f, 5.335f, 5.3348f, 5.75f, 5.199f, 6.2815f)
                curveTo(5.1353f, 6.5311f, 5.1379f, 6.7877f, 5.2002f, 7.0285f)
                verticalLineTo(16.5799f)
                curveTo(5.2057f, 17.4045f, 5.8757f, 18.07f, 6.7002f, 18.0699f)
                lineTo(6.69023f, 18.0599f)
                curveTo(7.5187f, 18.0599f, 8.1902f, 17.3884f, 8.1902f, 16.5599f)
                verticalLineTo(10.3129f)
                lineTo(16.2498f, 18.38f)
                close()
            }
        }.build()
        return _Arrowleftupfilled!!
    }

