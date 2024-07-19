package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


private var _Bookmarkfilled: ImageVector? = null

public val Bookmarkfilled: ImageVector
    get() {
        if (_Bookmarkfilled != null) {
            return _Bookmarkfilled!!
        }
        _Bookmarkfilled = ImageVector.Builder(
            name = "Bookmarkfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(16.77f, 20.7843f)
                lineTo(12.48f, 17.4943f)
                curveTo(12.0722f, 17.1843f, 11.5078f, 17.1843f, 11.1f, 17.4943f)
                lineTo(6.77f, 20.7843f)
                curveTo(6.4542f, 21.0381f, 6.0238f, 21.0959f, 5.6523f, 20.9343f)
                curveTo(5.2808f, 20.7727f, 5.0296f, 20.4184f, 5f, 20.0143f)
                verticalLineTo(5.95431f)
                curveTo(5.0388f, 5.13f, 5.4047f, 4.3551f, 6.0166f, 3.8014f)
                curveTo(6.6285f, 3.2477f, 7.4359f, 2.9608f, 8.26f, 3.0043f)
                horizontalLineTo(15.26f)
                curveTo(16.0891f, 2.9664f, 16.8987f, 3.2626f, 17.5077f, 3.8264f)
                curveTo(18.1166f, 4.3903f, 18.4741f, 5.1748f, 18.5f, 6.0043f)
                verticalLineTo(20.0143f)
                curveTo(18.4611f, 20.4038f, 18.2163f, 20.7426f, 17.8586f, 20.9017f)
                curveTo(17.501f, 21.0609f, 17.0855f, 21.0161f, 16.77f, 20.7843f)
                close()
            }
        }.build()
        return _Bookmarkfilled!!
    }

