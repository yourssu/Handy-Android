package com.yourssu.handy.compose.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.HandyIcons
import com.yourssu.handy.compose.icons.handyPath


private var _Arrowrightfilled: ImageVector? = null

public val HandyIcons.Filled.ArrowRight: ImageVector
    get() {
        if (_Arrowrightfilled != null) {
            return _Arrowrightfilled!!
        }
        _Arrowrightfilled = ImageVector.Builder(
            name = "Arrowrightfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(20.5805f, 10.94f)
                lineTo(13.5805f, 3.93996f)
                curveTo(13.2f, 3.5613f, 12.6464f, 3.4143f, 12.1282f, 3.5545f)
                curveTo(11.6099f, 3.6946f, 11.2059f, 4.1006f, 11.0682f, 4.6195f)
                curveTo(10.9304f, 5.1383f, 11.08f, 5.6913f, 11.4605f, 6.07f)
                lineTo(15.8905f, 10.49f)
                horizontalLineTo(4.48047f)
                curveTo(3.652f, 10.49f, 2.9805f, 11.1615f, 2.9805f, 11.99f)
                curveTo(2.9805f, 12.8184f, 3.652f, 13.49f, 4.4805f, 13.49f)
                horizontalLineTo(15.8905f)
                lineTo(11.4605f, 17.91f)
                curveTo(11.032f, 18.3389f, 10.904f, 18.9836f, 11.1359f, 19.5438f)
                curveTo(11.3678f, 20.104f, 11.9142f, 20.4694f, 12.5205f, 20.47f)
                curveTo(12.923f, 20.464f, 13.3058f, 20.2943f, 13.5805f, 20f)
                lineTo(20.5805f, 13f)
                curveTo(21.1654f, 12.4143f, 21.1654f, 11.4656f, 20.5805f, 10.88f)
                verticalLineTo(10.94f)
                close()
            }
        }.build()
        return _Arrowrightfilled!!
    }

