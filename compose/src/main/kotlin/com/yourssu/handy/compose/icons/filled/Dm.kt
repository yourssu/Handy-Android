package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


private var _Dmfilled: ImageVector? = null

public val Dmfilled: ImageVector
    get() {
        if (_Dmfilled != null) {
            return _Dmfilled!!
        }
        _Dmfilled = ImageVector.Builder(
            name = "Dmfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(21.0803f, 12.9207f)
                curveTo(20.4803f, 17.5107f, 15.9403f, 21.2307f, 11.3103f, 21.2307f)
                horizontalLineTo(4.64034f)
                curveTo(4.0742f, 21.2309f, 3.5496f, 20.9338f, 3.2586f, 20.4482f)
                curveTo(2.9676f, 19.9625f, 2.9531f, 19.3598f, 3.2203f, 18.8607f)
                lineTo(3.49034f, 18.3507f)
                curveTo(3.7803f, 17.8568f, 3.7803f, 17.2446f, 3.4903f, 16.7507f)
                curveTo(1.2174f, 13.1602f, 1.5724f, 8.5032f, 4.3633f, 5.2988f)
                curveTo(7.1543f, 2.0944f, 11.7184f, 1.1034f, 15.5869f, 2.862f)
                curveTo(19.4554f, 4.6205f, 21.7097f, 8.7109f, 21.1303f, 12.9207f)
                horizontalLineTo(21.0803f)
                close()
            }
        }.build()
        return _Dmfilled!!
    }

