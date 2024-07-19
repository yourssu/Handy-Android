package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


private var _Arrowrightdownfilled: ImageVector? = null

public val Arrowrightdownfilled: ImageVector
    get() {
        if (_Arrowrightdownfilled != null) {
            return _Arrowrightdownfilled!!
        }
        _Arrowrightdownfilled = ImageVector.Builder(
            name = "Arrowrightdownfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(18.8001f, 7.41998f)
                curveTo(18.7946f, 6.5955f, 18.1246f, 5.93f, 17.3001f, 5.93f)
                curveTo(16.4717f, 5.93f, 15.8001f, 6.6015f, 15.8001f, 7.43f)
                verticalLineTo(13.69f)
                lineTo(7.75011f, 5.61998f)
                curveTo(7.1619f, 5.0346f, 6.2105f, 5.0368f, 5.6251f, 5.625f)
                curveTo(5.0397f, 6.2132f, 5.0419f, 7.1646f, 5.6301f, 7.75f)
                lineTo(13.6901f, 15.81f)
                horizontalLineTo(7.43011f)
                curveTo(6.6017f, 15.81f, 5.9301f, 16.4816f, 5.9301f, 17.31f)
                curveTo(5.9301f, 18.1384f, 6.6017f, 18.81f, 7.4301f, 18.81f)
                horizontalLineTo(17.3201f)
                curveTo(17.7187f, 18.8127f, 18.1018f, 18.6555f, 18.3837f, 18.3736f)
                curveTo(18.6656f, 18.0917f, 18.8228f, 17.7086f, 18.8201f, 17.31f)
                lineTo(18.8001f, 7.41998f)
                close()
            }
        }.build()
        return _Arrowrightdownfilled!!
    }

