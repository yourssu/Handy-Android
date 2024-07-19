package com.yourssu.handy.compose.icons.filled

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.handy.compose.icons.handyPath


@Preview
@Composable
private fun VectorPreview() {
    Image(Plusfilled, null)
}

private var _Plusfilled: ImageVector? = null

public val Plusfilled: ImageVector
    get() {
        if (_Plusfilled != null) {
            return _Plusfilled!!
        }
        _Plusfilled = ImageVector.Builder(
            name = "Plusfilled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            handyPath {
                moveTo(20.5f, 11f)
                horizontalLineTo(15f)
                curveTo(14.4477f, 11f, 14f, 10.5523f, 14f, 10f)
                verticalLineTo(4.5f)
                curveTo(14f, 3.6716f, 13.3284f, 3f, 12.5f, 3f)
                curveTo(11.6716f, 3f, 11f, 3.6716f, 11f, 4.5f)
                verticalLineTo(10f)
                curveTo(11f, 10.5523f, 10.5523f, 11f, 10f, 11f)
                horizontalLineTo(4.5f)
                curveTo(3.6716f, 11f, 3f, 11.6716f, 3f, 12.5f)
                curveTo(3f, 13.3284f, 3.6716f, 14f, 4.5f, 14f)
                horizontalLineTo(10f)
                curveTo(10.5523f, 14f, 11f, 14.4477f, 11f, 15f)
                verticalLineTo(20.5f)
                curveTo(11f, 21.3284f, 11.6716f, 22f, 12.5f, 22f)
                curveTo(13.3284f, 22f, 14f, 21.3284f, 14f, 20.5f)
                verticalLineTo(15f)
                curveTo(14f, 14.4477f, 14.4477f, 14f, 15f, 14f)
                horizontalLineTo(20.5f)
                curveTo(21.3284f, 14f, 22f, 13.3284f, 22f, 12.5f)
                curveTo(22f, 11.6716f, 21.3284f, 11f, 20.5f, 11f)
                close()
            }
        }.build()
        return _Plusfilled!!
    }

